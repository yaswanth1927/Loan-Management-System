package com.lms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========================================");
            System.out.println("          LOAN APPLICATION SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Personal Loan");
            System.out.println("2. Home Loan");
            System.out.println("3. Gold Loan");
            System.out.println("4. Education Loan");
            System.out.println("5. Vehicle Loan");
            System.out.println("6. Business Loan");
            System.out.println("7. Exit");
            System.out.println("========================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            Loan loan = null;

            switch (choice) {


            case 1:

                System.out.println("\n--- PERSONAL LOAN ---");

                System.out.print("Loan ID: ");
                int id1 = sc.nextInt();

                sc.nextLine();

                System.out.print("Applicant Name: ");
                String name1 = sc.nextLine();

                System.out.print("Phone Number: ");
                String phone1 = sc.next();

                if (!Validation.isValidPhone(phone1)) {
                    System.out.println("Invalid Phone Number!");
                    System.out.println("Phone number must contain exactly 10 digits.");
                    sc.close();
                    return;
                }

                System.out.print("Aadhar Number: ");
                String aadhar1 = sc.next();

                if (!Validation.isValidAadhar(aadhar1)) {
                    System.out.println("Invalid Aadhar Number!");
                    System.out.println("Aadhar number must contain exactly 12 digits.");
                    sc.close();
                    return;
                }

                System.out.print("PAN Card: ");
                String pan1 = sc.next().toUpperCase();

                if (!Validation.isValidPAN(pan1)) {
                    System.out.println("Invalid PAN Card!");
                    System.out.println("PAN must contain 5 letters, 4 numbers and end with a letter.");
                    sc.close();
                    return;
                }

                System.out.print("Loan Amount: ");
                double amount1 = sc.nextDouble();

                System.out.print("Salary: ");
                double salary1 = sc.nextDouble();

                System.out.print("CIBIL Score: ");
                int cibil1 = sc.nextInt();

                if (cibil1 < 300 || cibil1 > 900) {
                    System.out.println("Invalid CIBIL Score!");
                    System.out.println("CIBIL Score must be between 300 and 900.");
                    sc.close();
                    return;
                }

                loan = new PersonalLoan(
                        id1, name1,
                        phone1, aadhar1, pan1,
                        amount1, salary1, cibil1
                );

                break;


            case 2:

                System.out.println("\n--- HOME LOAN ---");

                System.out.print("Loan ID: ");
                int id2 = sc.nextInt();

                sc.nextLine();

                System.out.print("Applicant Name: ");
                String name2 = sc.nextLine();

                System.out.print("Phone Number: ");
                String phone2 = sc.next();

                if (!Validation.isValidPhone(phone2)) {
                    System.out.println("Invalid Phone Number!");
                    System.out.println("Phone number must contain exactly 10 digits.");
                    sc.close();
                    return;
                }

                System.out.print("Aadhar Number: ");
                String aadhar2 = sc.next();

                if (!Validation.isValidAadhar(aadhar2)) {
                    System.out.println("Invalid Aadhar Number!");
                    System.out.println("Aadhar number must contain exactly 12 digits.");
                    sc.close();
                    return;
                }

                System.out.print("PAN Card: ");
                String pan2 = sc.next().toUpperCase();

                if (!Validation.isValidPAN(pan2)) {
                    System.out.println("Invalid PAN Card!");
                    System.out.println("PAN must contain 5 letters, 4 numbers and end with a letter.");
                    sc.close();
                    return;
                }

                System.out.print("Loan Amount: ");
                double amount2 = sc.nextDouble();

                System.out.print("Salary: ");
                double salary2 = sc.nextDouble();

                System.out.print("CIBIL Score: ");
                int cibil2 = sc.nextInt();

                if (cibil2 < 300 || cibil2 > 900) {
                    System.out.println("Invalid CIBIL Score!");
                    System.out.println("CIBIL Score must be between 300 and 900.");
                    sc.close();
                    return;
                }

                loan = new HomeLoan(
                        id2, name2,
                        phone2, aadhar2, pan2,
                        amount2, salary2, cibil2
                );

                break;

            case 3:

                System.out.println("\n--- GOLD LOAN ---");

                System.out.print("Loan ID: ");
                int id3 = sc.nextInt();

                sc.nextLine();

                System.out.print("Applicant Name: ");
                String name3 = sc.nextLine();

                System.out.print("Phone Number: ");
                String phone3 = sc.next();

                if (!Validation.isValidPhone(phone3)) {
                    System.out.println("Invalid Phone Number!");
                    System.out.println("Phone number must contain exactly 10 digits.");
                    sc.close();
                    return;
                }

                System.out.print("Aadhar Number: ");
                String aadhar3 = sc.next();

                if (!Validation.isValidAadhar(aadhar3)) {
                    System.out.println("Invalid Aadhar Number!");
                    System.out.println("Aadhar number must contain exactly 12 digits.");
                    sc.close();
                    return;
                }

                System.out.print("PAN Card: ");
                String pan3 = sc.next().toUpperCase();

                if (!Validation.isValidPAN(pan3)) {
                    System.out.println("Invalid PAN Card!");
                    System.out.println("PAN must contain 5 letters, 4 numbers and end with a letter.");
                    sc.close();
                    return;
                }

                System.out.print("Gold Weight (grams): ");
                double weight3 = sc.nextDouble();

                System.out.print("Gold Purity (K): ");
                double purity3 = sc.nextDouble();

                System.out.print("CIBIL Score: ");
                int cibil3 = sc.nextInt();

                if (cibil3 < 300 || cibil3 > 900) {
                    System.out.println("Invalid CIBIL Score!");
                    System.out.println("CIBIL Score must be between 300 and 900.");
                    sc.close();
                    return;
                }

                loan = new GoldLoan(
                        id3, name3,
                        phone3, aadhar3, pan3,
                        weight3, purity3, cibil3
                );

                break;

            case 4:

                System.out.println("\n--- EDUCATION LOAN ---");

                System.out.print("Loan ID: ");
                int id4 = sc.nextInt();

                sc.nextLine();

                System.out.print("Applicant Name: ");
                String name4 = sc.nextLine();

                System.out.print("Phone Number: ");
                String phone4 = sc.next();

                if (!Validation.isValidPhone(phone4)) {
                    System.out.println("Invalid Phone Number!");
                    System.out.println("Phone number must contain exactly 10 digits.");
                    sc.close();
                    return;
                }

                System.out.print("Aadhar Number: ");
                String aadhar4 = sc.next();

                if (!Validation.isValidAadhar(aadhar4)) {
                    System.out.println("Invalid Aadhar Number!");
                    System.out.println("Aadhar number must contain exactly 12 digits.");
                    sc.close();
                    return;
                }

                System.out.print("PAN Card: ");
                String pan4 = sc.next().toUpperCase();

                if (!Validation.isValidPAN(pan4)) {
                    System.out.println("Invalid PAN Card!");
                    System.out.println("PAN must contain 5 letters, 4 numbers and end with a letter.");
                    sc.close();
                    return;
                }

                sc.nextLine();

                System.out.print("Course Name: ");
                String course4 = sc.nextLine();

                System.out.print("College Name: ");
                String college4 = sc.nextLine();

                System.out.print("Education Expenses: ");
                double expenses4 = sc.nextDouble();

                System.out.print("CIBIL Score: ");
                int cibil4 = sc.nextInt();

                if (cibil4 < 300 || cibil4 > 900) {
                    System.out.println("Invalid CIBIL Score!");
                    System.out.println("CIBIL Score must be between 300 and 900.");
                    sc.close();
                    return;
                }

                loan = new EducationLoan(
                        id4, name4,
                        phone4, aadhar4, pan4,
                        course4, college4,
                        expenses4, cibil4
                );

                break;


            // ================= VEHICLE LOAN =================

            case 5:

                System.out.println("\n--- VEHICLE LOAN ---");

                System.out.print("Loan ID: ");
                int id5 = sc.nextInt();

                sc.nextLine();

                System.out.print("Applicant Name: ");
                String name5 = sc.nextLine();

                System.out.print("Phone Number: ");
                String phone5 = sc.next();

                if (!Validation.isValidPhone(phone5)) {
                    System.out.println("Invalid Phone Number!");
                    System.out.println("Phone number must contain exactly 10 digits.");
                    sc.close();
                    return;
                }

                System.out.print("Aadhar Number: ");
                String aadhar5 = sc.next();

                if (!Validation.isValidAadhar(aadhar5)) {
                    System.out.println("Invalid Aadhar Number!");
                    System.out.println("Aadhar number must contain exactly 12 digits.");
                    sc.close();
                    return;
                }

                System.out.print("PAN Card: ");
                String pan5 = sc.next().toUpperCase();

                if (!Validation.isValidPAN(pan5)) {
                    System.out.println("Invalid PAN Card!");
                    System.out.println("PAN must contain 5 letters, 4 numbers and end with a letter.");
                    sc.close();
                    return;
                }

                System.out.print("Vehicle Type: ");
                String vehicleType5 = sc.next();

                System.out.print("Vehicle Price: ");
                double vehiclePrice5 = sc.nextDouble();

                System.out.print("CIBIL Score: ");
                int cibil5 = sc.nextInt();

                if (cibil5 < 300 || cibil5 > 900) {
                    System.out.println("Invalid CIBIL Score!");
                    System.out.println("CIBIL Score must be between 300 and 900.");
                    sc.close();
                    return;
                }

                loan = new VehicleLoan(
                        id5, name5,
                        phone5, aadhar5, pan5,
                        vehicleType5,
                        vehiclePrice5, cibil5
                );

                break;


            case 6:

                System.out.println("\n--- BUSINESS LOAN ---");

                System.out.print("Loan ID: ");
                int id6 = sc.nextInt();

                sc.nextLine();

                System.out.print("Applicant Name: ");
                String name6 = sc.nextLine();

                System.out.print("Phone Number: ");
                String phone6 = sc.next();

                if (!Validation.isValidPhone(phone6)) {
                    System.out.println("Invalid Phone Number!");
                    System.out.println("Phone number must contain exactly 10 digits.");
                    sc.close();
                    return;
                }

                System.out.print("Aadhar Number: ");
                String aadhar6 = sc.next();

                if (!Validation.isValidAadhar(aadhar6)) {
                    System.out.println("Invalid Aadhar Number!");
                    System.out.println("Aadhar number must contain exactly 12 digits.");
                    sc.close();
                    return;
                }

                System.out.print("PAN Card: ");
                String pan6 = sc.next().toUpperCase();

                if (!Validation.isValidPAN(pan6)) {
                    System.out.println("Invalid PAN Card!");
                    System.out.println("PAN must contain 5 letters, 4 numbers and end with a letter.");
                    sc.close();
                    return;
                }

                System.out.print("Business Type: ");
                String businessType6 = sc.next();

                System.out.print("Annual Turnover: ");
                double turnover6 = sc.nextDouble();

                System.out.print("CIBIL Score: ");
                int cibil6 = sc.nextInt();

                if (cibil6 < 300 || cibil6 > 900) {
                    System.out.println("Invalid CIBIL Score!");
                    System.out.println("CIBIL Score must be between 300 and 900.");
                    sc.close();
                    return;
                }

                loan = new BusinessLoan(
                        id6, name6,
                        phone6, aadhar6, pan6,
                        businessType6,
                        turnover6, cibil6
                );

                break;


            case 7:

                System.out.println("\nThank you for using Loan Application System!");
                System.out.println("************ Developed By YASH ************");

                sc.close();
                return;


            default:

                System.out.println("Invalid choice!");
                continue;
            }


            System.out.println("\n========================================");
            System.out.println("           LOAN DETAILS");
            System.out.println("========================================");

            loan.displayLoanDetails();

            System.out.println("========================================");
        }
    }
}