package com.lms;

public abstract class Loan {
	@SuppressWarnings("unused")
	private static final double MAX_LOAN_AMOUNT = 800000;
	
    private int loanId;
    private String applicantName;
    private String phoneNumber;
    private String aadharNumber;
    private String panNumber;
    private double loanAmount;
    private int tenure;
    private double interestRate;

    public Loan(int loanId, String applicantName,
                String phoneNumber, String aadharNumber,
                String panNumber, double loanAmount,
                int tenure, double interestRate) {

        this.loanId = loanId;
        this.applicantName = applicantName;
        this.phoneNumber = phoneNumber;
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.interestRate = interestRate;
    }

    public int getLoanId() {		
        return loanId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public abstract boolean checkEligibility();

    public abstract double calculateEMI();

    public abstract void displayLoanDetails();
}