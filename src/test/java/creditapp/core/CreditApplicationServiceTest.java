package creditapp.core;

import creditapp.core.model.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;

@ExtendWith(MockitoExtension.class)
class CreditApplicationServiceTest {

    @InjectMocks
    private CreditApplicationService cut;

    @Mock
    private PersonScoringCalculator caluclatorMock;

    @DisplayName("Should return negative scoring when scoring is >300")
    @Test
    public void test1(){
        //Given
        CreditApplication creditApplication = CreditApplicationTestFactory.create(PurposeOfLoanType.MORTAGE,25000,25);
        BDDMockito.given(caluclatorMock.calculate(eq(creditApplication.getPerson()))).willReturn(100);

        //When
        CreditApplicationDecision decision = cut.getDecision(creditApplication);
        //Then
        assertEquals(DecisionType.NEGATIVE_SCORING,decision.getType());

    }

}