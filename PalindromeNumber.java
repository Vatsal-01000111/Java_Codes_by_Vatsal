/* A-33 VATSAL GANDHI */

import java.io.*;
import java.util.*;

public class PalindromeNumber{
	public static void main(String[] args) {
	   System.out.println("Enter The Number to checked for Palindrome");
	   int num;
	   Scanner sc = new Scanner(System.in);
	   num = sc.nextInt();
	   int ognum,reverse,remainder;
	   ognum = num;
	   reverse = 0;
	   while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        if (ognum == reverse) {
            System.out.println(ognum + " is Palindrome.");
        }
        else {
            System.out.println(ognum + " is not Palindrome.");
        }
}
}