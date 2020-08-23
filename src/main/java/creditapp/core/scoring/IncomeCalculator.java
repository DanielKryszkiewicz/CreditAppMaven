package creditapp.core.scoring;

import creditapp.core.model.CreditApplication;
import creditapp.core.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IncomeCalculator {

    private static final Logger log = LoggerFactory.getLogger(IncomeCalculator.class);

    public int calculate(Person person){
        double incomePerFamilyMember = person.getIncomePerFamilyMember();
        int pointsForIncome = (int) (incomePerFamilyMember /1000) *100;
        log.info("Income per family member = "+incomePerFamilyMember+". ("+pointsForIncome+"points)");

        return pointsForIncome;
    }
}
