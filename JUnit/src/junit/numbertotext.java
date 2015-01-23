package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class numbertotext {

	@Test
	public void testnumbertotext() {
        Test t = new test(1107.12); 
         		assertEquals("One thousand one hundred seven and 12/100 dollars", 
        		 				NumberToWords.convertToWord(t.getcheckedmoney()));         
		
	}

}

//la clase test tiene definida la variable checkedmoney y hace el return de la misma
//la clase NumberToWords contiene la logica
/*se usaria el mismo metodo para probar tanto numeros mas chicos como mas grandes, entiendo que entre mas
datos allas mejor va a ser el test */