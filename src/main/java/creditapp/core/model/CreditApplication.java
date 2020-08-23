package creditapp.core.model;

public class CreditApplication {

    private final Person person;
    private final PurposeOfLoan purposeOfLoan;

    public CreditApplication(Person person, PurposeOfLoan purposeOfLoan) {
        this.person = person;
        this.purposeOfLoan = purposeOfLoan;
    }

    public Person getPerson() {
        return person;
    }

    public PurposeOfLoan getPurposeOfLoan() {
        return purposeOfLoan;
    }
}
