package creditapp.core.scoring;

import creditapp.core.model.CreditApplication;
import creditapp.core.model.MartialStatus;
import creditapp.core.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MartialStatusCalculator {

    private static final Logger log = LoggerFactory.getLogger(MartialStatusCalculator.class);


    public int calculate(Person person) {
        MartialStatus martialStatus = person.getPersonalData().getMartialStatus();
        int pointsForEducation = martialStatus.getScoringPoints();

        log.info("Education = "+martialStatus+ ScoringUtils.getPointsString(pointsForEducation));
        return pointsForEducation;

    }
}

