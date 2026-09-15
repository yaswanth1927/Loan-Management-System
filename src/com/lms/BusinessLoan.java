package com.lms;

public class BusinessLoan extends Loan {

    private String businessType;
    private double annualTurnover;
    private int cibilScore;

    public BusinessLoan(int loanId, String applicantName,
    		String phoneNumber,String aadharNumber,String panNumber,
                        String businessType,
                        double annualTurnover,
                        int cibilScore) {

        super(loanId, applicantName,phoneNumber,aadharNumber,panNumber, 0, 0, 0);

        this.businessType = businessType;
        this.annualTurnover = annualTurnover;
        this.cibilScore = cibilScore;
    }

    public double calculateLoanAmount() {

        return Math.min(annualTurnover * 2, 800000);
    }

    public double rateOfInterest() {

        if (cibilScore >= 750 && cibilScore <= 900) {
            return 10.0;
        }
        else if (cibilScore >= 700 && cibilScore <= 749) {
            return 11.0;
        }
        else if (cibilScore >= 650 && cibilScore <= 699) {
            return 13.0;
        }
        else if (cibilScore >= 300 && cibilScore <= 649) {
            return 15.0;
        }
        else {
            System.out.println("Invalid CIBIL Score!");
            System.out.println("CIBIL Score must be between 300 and 900.");
            System.exit(0);
            return 0;
        }
    }

    public int calculateTenure() {

        if (annualTurnover <= 1000000) {
            return 5;
        }
        else if (annualTurnover <= 5000000) {
            return 7;
        }
        else {
            return 10;
        }
    }

    @Override
    public boolean checkEligibility() {

        if (annualTurnover >= 500000 &&
            cibilScore >= 650) {

            return true;
        }

        return false;
    }

    @Override
    public double calculateEMI() {

        double loanAmount = calculateLoanAmount();

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
        System.out.println("Business Type : " + businessType);
        System.out.println("Annual Turnover: " + annualTurnover);
        System.out.println("CIBIL Score   : " + cibilScore);

        System.out.println("Loan Amount   : "
                + calculateLoanAmount());

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