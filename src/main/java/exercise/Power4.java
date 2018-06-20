package main.java.exercise;
import java.util.*;
public class Power4 {
	public static String isPowerofFour(int num) {
	String checker = "false";
	int pow = 1;
	while(pow<num)
	{
		pow =pow * 4;
	}
	if(pow==num) {
		checker="true";
	}
	return checker;
	}
	public static String powfour(String invalid) {
		return "Invalid input";
	}
	
}