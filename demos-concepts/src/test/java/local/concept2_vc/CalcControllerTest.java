package local.concept2_vc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;

public class CalcControllerTest {

   @Before
    public void configure() {
        calculator = new CalcController(); 
    }
   
    

    @Test
    public void testAdd() {

    }
}


@Test
    public void testAddOk() {
        int num1 = 5;
        int num2 = -3;
        Calcontroller calculator = new CalcController();
        calculator.setNum1(num1);
        calculator.setNum2(num2);
        int resut = calculator.add();
        assertEquals(2, result);
    }


  @Test
    public void intDiviDefaultTest() {
        // 0 / 0
        try {
            calculator.intDivide();
        } catch (BusinessExcepcion e) {
            BusinessException expected =
            BusinessException(ErrorCodes.ERROR_ZERO, message:"Dividido por 0");
            assertEquals( expected, e );
            assertTrue(condition:true);
            }
        }
        






