package test.java.exercisetest;
import main.java.exercise.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
    public void testFactoring() {
        long[] arr= {1,2,6,24,120};
        long[] arr1= Factorial.factoring(5);
        assertEquals(arr[0],arr1[0]);
        assertEquals(arr[1],arr1[1]);
        assertEquals(arr[2],arr1[2]);
        assertEquals(arr[3],arr1[3]);
        assertEquals(arr[4],arr1[4]);
    }


}
