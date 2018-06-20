package test.java.exercisetest;
import main.java.exercise.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class MemberTest {

	@Test
	public void testMember() {
		Member member=new Member();
		member.assign("Harry Potter",30,(float)2500.3);
		Member actual = member;
		class expectation{
			String name = "Harry Potter";
			int age = 30;
			float salary = (float)2500.3;
		}
		expectation expected = new expectation();
		  
		  assertEquals(expected,actual);
		
	}

}
