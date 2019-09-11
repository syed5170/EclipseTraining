package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Testing.TestExample;

public class TestExampleTest {

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int a= 1;
		int b = 5;
		TestExample test1 = new TestExample();
		int result = test1.test(a, b);
		assertEquals(6,result);
	}
	
	@Test
	public void ADDString() {
		String a= "AHSAN";
		String b = "DIMPLE";
		TestExample test2 = new TestExample();
		String result = test2.ADDString(a,b );
		assertEquals("AHSANDIMPLE",result);
	}

}
