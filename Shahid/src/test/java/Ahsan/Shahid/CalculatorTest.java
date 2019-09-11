package Ahsan.Shahid;



import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import Mockito.Calculator;
import Mockito.CalculatorService;

public class CalculatorTest {
	Calculator c= null;
	@Mock
CalculatorService service;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c=new Calculator(service);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculator() {
		//fail("Not yet implemented");
		//service.add(2,3);
	}

	@Test
	public void testadd() {
		//fail("Not yet implemented");
//		when(c.add(2,3)).thenReturn(5);
		assertEquals(10, c.add(2, 3));
	}

}
