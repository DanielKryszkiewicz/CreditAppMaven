package creditapp.core;

import creditapp.core.model.Education;
import creditapp.core.model.Person;
import creditapp.core.scoring.EducationCalculator;
import creditapp.core.scoring.IncomeCalculator;
import creditapp.core.scoring.MartialStatusCalculator;

public class PersonScoringCalculator {
    private final EducationCalculator educationCalculator;
    private final MartialStatusCalculator martialStatusCalculator;
    private final IncomeCalculator incomeCalculator;

    public PersonScoringCalculator(EducationCalculator educationCalculator, MartialStatusCalculator martialStatusCalculator, IncomeCalculator incomeCalculator) {
        this.educationCalculator = educationCalculator;
        this.martialStatusCalculator = martialStatusCalculator;
        this.incomeCalculator = incomeCalculator;
    }


    public int calculate(Person person){
       return educationCalculator.calculate(person) + martialStatusCalculator.calculate(person) + incomeCalculator.calculate(person);


    }
}
