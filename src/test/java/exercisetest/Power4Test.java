package test.java.exercisetest;

import static org.junit.Assert.*;
import main.java.exercise.*;

import org.junit.Test;

public class Power4Test {

	@Test
	public void testIsPowerofFour() {
//		assertEquals( new String ("true"),Power4.isPowerofFour(64));
		assertEquals( new String ("false"),Power4.isPowerofFour(99));
	}

}
