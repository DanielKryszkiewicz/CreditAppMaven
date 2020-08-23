package creditapp.core.model;

public class CreditApplicationTestFactory {

    public static CreditApplication create(PurposeOfLoanType purposeOfLoanType,double expectedLoanAmount,int expectedLoanPeriod){
        Person person = PersonTestFactory.create(5000.00,2,Education.MIDDLE,MartialStatus.MARRIED);
        PurposeOfLoan purposeOfLoan = new PurposeOfLoan(purposeOfLoanType,expectedLoanAmount, (byte) expectedLoanPeriod);
        CreditApplication creditApplication = new CreditApplication(person,purposeOfLoan);
        return creditApplication;
    }
}
