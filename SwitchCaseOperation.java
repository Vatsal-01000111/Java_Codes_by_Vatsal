/* A-33 VATSAL GANDHI */

import java.io.*;
import java.util.*;

public class SwitchCaseOperation
{
	public static void main(String[] args) {
	    int num1,num2,opt,temp;
	    float temp1;
	    System.out.println("Enter The 1st number");
	    Scanner sc1 = new Scanner(System.in);
	    num1 = sc1.nextInt();
	    System.out.println("Enter The 2nd number");
	    Scanner sc2 = new Scanner(System.in);
	    num2 = sc2.nextInt();
	    
	    System.out.println("Please Enter One of the following Options");
	    System.out.println("1. Addition");
	    System.out.println("2. Substraction");
	    System.out.println("3. Multiplication");
	    System.out.println("4. Division");
	    System.out.println("5. Find the remainder of division");
	    System.out.println("6. Exit");
	    Scanner sc3 = new Scanner(System.in);
	    opt = sc3.nextInt();
	    while(opt!=6){
	    switch(opt){
	       case 1: temp = num1 + num2;
	               System.out.println("Addition of both the numbers is "+ temp);
	               break;
	       case 2: temp = num1 - num2;
	               System.out.println("Substraction of both the numbers is "+ temp);
	               break;
	       case 3: temp = num1 * num2;
	               System.out.println("Multiplication of both the numbers is "+ temp);
	               break;
	       case 4: temp1 = num1 / num2;
	               System.out.println("Division of both the numbers is "+ temp1);
	               break;
	       case 5: temp1 = num1 % num2;
	               System.out.println("The remainder of Division of both the numbers is "+ temp1);
	               break;
	       default: System.out.println("Wrong input");
	                break;
	    }
	    System.out.println("Please Enter One of the following Options");
	    System.out.println("1. Addition");
	    System.out.println("2. Substraction");
	    System.out.println("3. Multiplication");
	    System.out.println("4. Division");
	    System.out.println("5. Find the remainder of division");
	    System.out.println("6. Exit");
	    Scanner sc4 = new Scanner(System.in);
	    opt = sc4.nextInt();
	    if(opt == 6){
	        break;
	    }else{continue;}
	    }
	}
}
