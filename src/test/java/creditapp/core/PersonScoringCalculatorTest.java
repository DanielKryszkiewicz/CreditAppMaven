package creditapp.core;

import creditapp.core.model.Education;
import creditapp.core.model.MartialStatus;
import creditapp.core.model.Person;
import creditapp.core.scoring.EducationCalculator;
import creditapp.core.scoring.IncomeCalculator;
import creditapp.core.scoring.MartialStatusCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import creditapp.core.model.PersonTestFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;

@ExtendWith(MockitoExtension.class)
class PersonScoringCalculatorTest {

    @InjectMocks
    private PersonScoringCalculator cut;

    @Mock
    private  EducationCalculator educationCalculatorMock;
    @Mock
    private  MartialStatusCalculator martialStatusCalculatorMock;
    @Mock
    private  IncomeCalculator incomeCalculatorMock;

    @Test
    @DisplayName("Should return sum of calculations")
    public void test1(){
        //Given
        Person person = PersonTestFactory.create(2000,2,Education.MIDDLE,MartialStatus.DIVORCED);
        BDDMockito.given(educationCalculatorMock.calculate(eq(person))).willReturn(100);
        BDDMockito.given(martialStatusCalculatorMock.calculate(eq(person))).willReturn(200);
        BDDMockito.given(incomeCalculatorMock.calculate(eq(person))).willReturn(50);
        //When
        int scoring  = cut.calculate(person);
        //Then
        assertEquals(350,scoring);

    }

//    private PersonScoringCalculator cut = new PersonScoringCalculator(educationCalculator, martialStatusCalculator, incomeCalculator);
//
//    @Test
//    @DisplayName("")
//    public void test1(){
//        //Given
//        Person person = PersonTestFactory.create(5000.00,2, Education.PRIMARY, MartialStatus.MARRIED);
//        //When
//        int scoring = cut.calculate(person);
//        //Then
//        assertEquals(200,scoring);
//    }
//    @Test
//    @DisplayName("")
//    public void test2(){
//        //Given
//        Person person = PersonTestFactory.create(5500.00,1,Education.MIDDLE,MartialStatus.DIVORCED);
//        //When
//        int scoring = cut.calculate(person);
//        //Then
//        assertEquals(500,scoring);
//    }
//    @Test
//    @DisplayName("")
//    public void test3(){
//        //Given
//        Person person = PersonTestFactory.create(9000.00,3,Education.NONE,MartialStatus.SINGLE);
//        //When
//        int scoring = cut.calculate(person);
//        //Then
//        assertEquals(100,scoring);
//    }

}