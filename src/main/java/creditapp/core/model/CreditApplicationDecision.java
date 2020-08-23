package creditapp.core.model;


import java.math.BigDecimal;
import java.util.UUID;


public class CreditApplicationDecision {
    private final DecisionType type;
    private final PersonalData personalData;
    private final Double creditRate;

    public CreditApplicationDecision(DecisionType type, PersonalData personalData, Double creditRate) {
        this.type = type;
        this.personalData = personalData;
        this.creditRate = creditRate;
    }

    public String getDecisionString(){
        switch(type){
            case POSITIVE:
                return "Congratulations " + personalData.getName() + " " + personalData.getLastName() + ", decision is positive";
            case NEGATIVE_CREDIT_RATING:
                return "Sorry, " + personalData.getName() + " " + personalData.getLastName() + "decision is negative.";
            case CONTACT_REQUIRED:
                return "Sorry " + personalData.getName() + " " + personalData.getLastName() + ",  bank requires additional documents. Our Consultant will contact you.";
            case NEGATIVE_SCORING:
                BigDecimal roundedCreditRate = new BigDecimal(creditRate).setScale(2);
                return "Sorry, " + personalData.getName() + " " + personalData.getLastName() + ", decision is negative. Bank can borrow only " + roundedCreditRate;
        }
        return null;
    }

    public DecisionType getType() {
        return type;
    }
}
