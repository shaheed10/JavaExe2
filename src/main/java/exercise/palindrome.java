package main.java.exercise;


public class palindrome {
	public static String reverse(String exe){
		String chr = "madam";
        String  reverse = "";
        int len = chr.length();

        for (int i = len - 1; i > -1; i--) {
            reverse  = reverse + chr.charAt(i);
        }
//        System.out.println("Reversed String is: " + reverse);

        if (chr.equals(reverse)) {
        	
            reverse ="True";
        } else {
            reverse="False";
        }
        return reverse;
	}

}
