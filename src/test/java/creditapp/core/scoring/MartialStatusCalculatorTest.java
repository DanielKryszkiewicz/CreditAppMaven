package creditapp.core.scoring;

import creditapp.core.model.Education;
import creditapp.core.model.MartialStatus;
import creditapp.core.model.Person;
import creditapp.core.model.PersonTestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class MartialStatusCalculatorTest {

    private MartialStatusCalculator cut = new MartialStatusCalculator();

    @ParameterizedTest
    @EnumSource(MartialStatus.class)
    public void test1(MartialStatus martialStatus){
        //Given
        Person person = PersonTestFactory.create(martialStatus);
        //When
        int scoring = cut.calculate(person);
        //Then
        assertEquals(martialStatus.getScoringPoints(),scoring);
    }

}

