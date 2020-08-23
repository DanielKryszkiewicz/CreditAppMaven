package creditapp.core;

import creditapp.core.model.CreditApplication;
import creditapp.core.model.CreditApplicationDecision;
import creditapp.core.model.DecisionType;
import creditapp.core.model.Person;

public class CreditApplicationService {

    private final PersonScoringCalculator calculator;

    public CreditApplicationService(PersonScoringCalculator calculator) {
        this.calculator = calculator;
    }

    public CreditApplicationDecision getDecision(CreditApplication creditApplication) {
        Person person = creditApplication.getPerson();
        int scoring = calculator.calculate(person);
        if (scoring < 300) {
            return new CreditApplicationDecision(DecisionType.NEGATIVE_SCORING,person.getPersonalData(),null);
        } else if (scoring <= 400) {
            return new CreditApplicationDecision(DecisionType.CONTACT_REQUIRED,person.getPersonalData(),null);
        } else {
            double creditRate = getCreditRating(creditApplication, person);
            if (creditRate >= creditApplication.getPurposeOfLoan().getAmount()) {
                return new CreditApplicationDecision(DecisionType.POSITIVE,person.getPersonalData(),creditRate);
            } else {

                return new CreditApplicationDecision(DecisionType.NEGATIVE_CREDIT_RATING,person.getPersonalData(),creditRate);

            }

        }

    }

    private double getCreditRating(CreditApplication creditApplication, Person person) {
        double creditRate = person.getIncomePerFamilyMember() * 12 * creditApplication.getPurposeOfLoan().getPeriod();
        switch (creditApplication.getPurposeOfLoan().getPurposeOfLoanType()) {
            case PERSONAL_LOAN:
                creditRate *= Constants.PERSONAL_LOAN_LOAN_RATE;
                break;
            case MORTAGE:
                creditRate *= Constants.MORTGAGE_LOAN_RATE;
                break;
        }
        return creditRate;
    }
}