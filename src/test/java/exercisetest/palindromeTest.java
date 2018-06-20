package test.java.exercisetest;

import static org.junit.Assert.*;
import main.java.exercise.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class palindromeTest {

	
	@Test
	public void testReverse() {
		assertEquals(new String[] {"madam","True"},palindrome.reverse("madam"));
		assertEquals(new String[] {"Hello","False"},palindrome.reverse("Hello"));
	}
}
