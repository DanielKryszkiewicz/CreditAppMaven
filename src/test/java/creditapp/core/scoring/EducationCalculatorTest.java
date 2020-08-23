package creditapp.core.scoring;

import creditapp.core.model.Education;
import creditapp.core.model.Person;
import creditapp.core.model.PersonTestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class EducationCalculatorTest {

    private EducationCalculator cut = new EducationCalculator();

    @ParameterizedTest
    @EnumSource(Education.class)
    public void test1(Education education){
        //Given
        Person person = PersonTestFactory.create(education);
        //When
        int scoring = cut.calculate(person);
        //Then
        assertEquals(education.getScoringPoints(),scoring);
    }

}