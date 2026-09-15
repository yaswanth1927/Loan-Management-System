package com.lms;

public class HomeLoan extends Loan {

    private double salary;
    private int cibilScore;
    private double propertyValue;
    private double downPayment;

    public HomeLoan(int loanId, String applicantName,
    		String phoneNumber,String aadharNumber,String panNumber,
                    double loanAmount, double salary,
                    int cibilScore) {

        super(loanId, applicantName,phoneNumber,aadharNumber,panNumber, loanAmount, 0, 0);

        this.salary = salary;
        this.cibilScore = cibilScore;

        this.propertyValue = calculatePropertyValue();
        this.downPayment = calculateDownPayment();
    }

    public double calculatePropertyValue() {

        return getLoanAmount() / 0.80;
    }

    public double calculateDownPayment() {

        return calculatePropertyValue() - getLoanAmount();
    }

    public double rateOfInterest() {

        if (cibilScore >= 750 && cibilScore <= 900) {
            return 8.0;
        }
        else if (cibilScore >= 700 && cibilScore <= 749) {
            return 8.5;
        }
        else if (cibilScore >= 650 && cibilScore <= 699) {
            return 9.5;
        }
        else if (cibilScore >= 300 && cibilScore <= 649) {
            return 11.0;
        }
        else {
            System.out.println("Invalid CIBIL Score!");
            System.out.println("CIBIL Score must be between 300 and 900.");
            System.exit(0);
            return 0;
        }
    }

    public int calculateTenure() {

        if (getLoanAmount() <= 2000000) {
            return 15;
        }
        else if (getLoanAmount() <= 5000000) {
            return 20;
        }
        else {
            return 25;
        }
    }

    @Override
    public boolean checkEligibility() {

        if (
            cibilScore >= 650 &&
            getLoanAmount() <= 800000) {

            return true;
        }

        return false;
    }

    @Override
    public double calculateEMI() {

        double interestRate = rateOfInterest();

        double monthlyRate = interestRate / 12 / 100;

        int months = calculateTenure() * 12;

        double emi = (getLoanAmount() * monthlyRate *
                Math.pow(1 + monthlyRate, months))
                /
                (Math.pow(1 + monthlyRate, months) - 1);

        return emi;
    }

    @Override
    public void displayLoanDetails() {

        System.out.println("Loan ID       : " + getLoanId());
        System.out.println("Applicant Name: " + getApplicantName());
        System.out.println("Loan Amount   : " + getLoanAmount());
        System.out.println("Salary        : " + salary);
        System.out.println("CIBIL Score   : " + cibilScore);

        System.out.println("Property Value: " + propertyValue);
        System.out.println("Down Payment  : " + downPayment);

        System.out.println("Tenure        : " + calculateTenure() + " years");
        System.out.println("Interest Rate : " + rateOfInterest() + "%");

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