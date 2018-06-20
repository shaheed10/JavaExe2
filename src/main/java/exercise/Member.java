package main.java.exercise;
import java.util.*;
public class Member {
	String name;
	int age;
	float salary;
	public void assign(String n,int h,float g) {
		name=n;
		age=h;
		salary=g;			
		
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	

}
