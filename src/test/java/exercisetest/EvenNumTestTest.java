package test.java.exercisetest;
import main.java.exercise.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvenNumTestTest {

	@Test
	public void testIsEven() {
		assertEquals( true,EvenNumTest.isEven(64));
	}
	
	
	@Test
	public void testIsEven1() {
		assertEquals( false,EvenNumTest.isEven(13));
	}

}
