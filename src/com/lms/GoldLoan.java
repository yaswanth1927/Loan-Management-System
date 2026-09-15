package com.lms;

public class GoldLoan extends Loan {

    private double goldWeight;
    private double goldPurity;
    private int cibilScore;
    private double goldValue;

    public GoldLoan(int loanId, String applicantName,
    		String phoneNumber,String aadharNumber,String panNumber,
                    double goldWeight, double goldPurity,
                    int cibilScore) {

        super(loanId, applicantName,phoneNumber,aadharNumber,panNumber, 0, 0, 0);

        this.goldWeight = goldWeight;
        this.goldPurity = goldPurity;
        this.cibilScore = cibilScore;

        this.goldValue = calculateGoldValue();
    }

    public double calculateGoldValue() {

        double pricePerGram;

        if (goldPurity >= 24) {
            pricePerGram = 7500;
        }
        else if (goldPurity >= 22) {
            pricePerGram = 6900;
        }
        else if (goldPurity >= 20) {
            pricePerGram = 6300;
        }
        else if (goldPurity >= 18) {
            pricePerGram = 5700;
        }
        else {
            pricePerGram = 0;
        }

        return goldWeight * pricePerGram;
    }

    public double calculateEligibleLoanAmount() {

        return Math.min(goldValue * 0.75, 800000) ;
    }

    public double rateOfInterest() {

        if (cibilScore >= 750 && cibilScore <= 900) {
            return 9.0;
        }
        else if (cibilScore >= 700 && cibilScore <= 749) {
            return 10.0;
        }
        else if (cibilScore >= 650 && cibilScore <= 699) {
            return 11.0;
        }
        else if (cibilScore >= 300 && cibilScore <= 649) {
            return 13.0;
        }
        else {
            System.out.println("Invalid CIBIL Score!");
            System.out.println("CIBIL Score must be between 300 and 900.");
            System.exit(0);
            return 0;
        }
    }

    public int calculateTenure() {

        double loanAmount = calculateEligibleLoanAmount();

        if (loanAmount <= 200000) {
            return 2;
        }
        else if (loanAmount <= 500000) {
            return 3;
        }
        else {
            return 5;
        }
    }

    @Override
    public boolean checkEligibility() {

        if (goldWeight >= 10 &&
            goldPurity >= 18 &&
            cibilScore >= 650) {

            return true;
        }

        return false;
    }

    @Override
    public double calculateEMI() {

        double loanAmount = calculateEligibleLoanAmount();

        double interestRate = rateOfInterest();

        double monthlyRate = interestRate / 12 / 100;

        int months = calculateTenure() * 12;

        double emi = (loanAmount * monthlyRate *
                Math.pow(1 + monthlyRate, months))
                /
                (Math.pow(1 + monthlyRate, months) - 1);

        return emi;
    }

    @Override
    public void displayLoanDetails() {

        System.out.println("Loan ID       : " + getLoanId());
        System.out.println("Applicant Name: " + getApplicantName());
        System.out.println("Gold Weight   : " + goldWeight + " grams");
        System.out.println("Gold Purity   : " + goldPurity + "K");
        System.out.println("Gold Value    : " + goldValue);

        System.out.println("CIBIL Score   : " + cibilScore);

        System.out.println("Eligible Loan : "
                + calculateEligibleLoanAmount());

        System.out.println("Tenure        : "
                + calculateTenure() + " years");

        System.out.println("Interest Rate : "
                + rateOfInterest() + "%");

        if (checkEligibility()) {

            System.out.println("Status        : APPROVED");

            System.out.printf("Monthly EMI   : %.2f%n",
                    calculateEMI());

        }
        else {

            System.out.println("Status        : REJECTED");
        }
    }
}