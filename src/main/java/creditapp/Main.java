package creditapp;

import creditapp.client.ConsoleReader;
import creditapp.core.CreditApplicationService;
import creditapp.core.PersonScoringCalculator;
import creditapp.core.model.CreditApplication;
import creditapp.core.model.CreditApplicationDecision;
import creditapp.core.scoring.EducationCalculator;
import creditapp.core.scoring.IncomeCalculator;
import creditapp.core.scoring.MartialStatusCalculator;

public class Main {

    public static void main(String[] args) {
        CreditApplicationService service = new CreditApplicationService(new PersonScoringCalculator(new EducationCalculator(), new MartialStatusCalculator(), new IncomeCalculator()));
        CreditApplication creditApplication = new ConsoleReader().readInputParameters();

        CreditApplicationDecision decision = service.getDecision(creditApplication);

        System.out.println(decision.getDecisionString());



    }
}
