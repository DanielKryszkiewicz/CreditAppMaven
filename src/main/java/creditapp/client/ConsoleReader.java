package creditapp.client;


import creditapp.core.model.*;

import java.util.Scanner;

public class ConsoleReader {
    Scanner scanner = new Scanner(System.in);

    public CreditApplication readInputParameters(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter your lastname: ");
        String lastName = scanner.next();

        System.out.println("Enter your mothers maiden name: ");
        String mothersMaidenName = scanner.next();

        System.out.println("What is your martial status? (SINGLE,MARRIED,DIVORCED,WIDOWED,SEPARATED)");
        MartialStatus martialStatus = MartialStatus.valueOf(scanner.next());

        System.out.println("What is your education level? (NONE, PRIMARY, MIDDLE, SECONDARY, POST_SECONDARY, TERTIARY)");
        Education education = Education.valueOf(scanner.next());

        System.out.println("Enter your email: ");
        String email = scanner.next();

        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.next();

        System.out.println("Enter your total monthly income in PLN: ");
        double income = scanner.nextDouble();

        System.out.println("How many people are financialy depend on you?");
        int numOfFamilyDependants = scanner.nextInt();

        System.out.println("What is purpose of loan? (MORTGAGE | PERSONAL_LOAN):");
        PurposeOfLoanType purposeOfLoanType = PurposeOfLoanType.valueOf(scanner.next());

        System.out.println("Enter loan amount: ");
        double purposeOfLoanAmount = scanner.nextDouble();

        System.out.println("Enter loan period in years: ");
        byte period  = (byte) scanner.nextDouble();

        PersonalData personalData = new PersonalData(name,lastName,mothersMaidenName,income,martialStatus,2,education);
        ContactData contactData = new ContactData(email,phoneNumber);
        PurposeOfLoan purposeOfLoan = new PurposeOfLoan(purposeOfLoanType,purposeOfLoanAmount, (byte) 0);


        return new CreditApplication(new Person(personalData,contactData),purposeOfLoan);


    }

}
