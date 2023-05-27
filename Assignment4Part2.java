import java.util.*;
/* A-33 Vatsal Gandhi */
public class Assignment4Part2 {

	public static void main(String[] args) {
		String st2 = new String();
		boolean check;
		System.out.println("Enter The String On Which You want to perform the operation");
		Scanner sc= new Scanner(System.in);
		String st = sc.nextLine();
		char resultc;
		int choice,temp,resultn;
		choice = 0;
		while(choice!=20) {
			temp = 0;
			resultn=0;
			st2 = null;
			check = true;
			resultc = ' ';
			System.out.println("Enter The Number Associated With The Operation You want to Perform");
			System.out.println("1. charAt() ");
			System.out.println("2. codePointAt() ");
			System.out.println("3. codePointBefore() ");
			System.out.println("4. codePointCount() ");
			System.out.println("5. compareTo() ");
			System.out.println("6. concat() ");
			System.out.println("7. contains() ");
			System.out.println("8. contentEquals() ");
			System.out.println("9. endsWith() ");
			System.out.println("10. format() ");
			System.out.println("11. hashCode() ");
			System.out.println("12. isEmpty() ");
			System.out.println("13. length() ");
			System.out.println("14. replace() ");
			System.out.println("15. replaceAll() ");
			System.out.println("16. toCharArray() ");
			System.out.println("17. toLowerCase() ");
			System.out.println("18. toUpperCase() ");
			System.out.println("19. trim() ");
			System.out.println("20. EXIT ");
			choice =sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter the position of the character to be printed starting from 0");
				temp = sc.nextInt();
				resultc = st.charAt(temp);
				System.out.println(resultc);
				break;
				
			case 2:
				System.out.println("Enter the position of the character whose unicode is to be printed starting from 0");
				temp = sc.nextInt();
			    resultn = st.codePointAt(temp);
				System.out.println(resultn);
				break;
				
			case 3:
				System.out.println("Enter the next position of the character whose unicode is to be printed starting from 0");
				temp = sc.nextInt();
				resultn = st.codePointBefore(temp);
				System.out.println(resultn);
				break;
				
			case 4:
				resultn = st.codePointCount(0,st.length());
				System.out.println("The number of unicode values in the string is"+ resultn);
				break;
				
			case 5:
				System.out.println("Enter the String you want the original string to be compared lexicographically to ");
				Scanner sc2 =new Scanner(System.in);
				st2 = sc2.nextLine();
				System.out.println(st.compareTo(st2));
				break;
				
			case 6:
				System.out.println("Enter the String you want to append to the original String");
				Scanner sc3 =new Scanner(System.in);
				st2 =sc3.nextLine();
				System.out.println(st.concat(st2));
				break;
				
			case 7:
				System.out.println("Enter the String whose presence is to be checked in the original String");
				Scanner sc4 =new Scanner(System.in);
				st2= sc4.nextLine();
				check = st.contains(st2);
				System.out.println(check);
				break;
				
			case 8:
				System.out.println("Enter the String whose presence in the same order is to be checked in the original String");
				Scanner sc5 =new Scanner(System.in);
				st2= sc5.nextLine();
				check = st.contentEquals(st2);
				System.out.println(check);
				break;
				
			case 9:
				System.out.println("Enter the String which is to be checked as the last element of the original string");
				Scanner sc6 =new Scanner(System.in);
				st2=sc6.nextLine();
				check = st.endsWith(st2);
				System.out.println(check);
				break;
				
			case 10:
				System.out.println("Here you can format the String by adding text in the front or the back or add spaces as shown");
				st2 = st.format("5 spaces are added : \n     "+st);
				System.out.println(st2);
				st2 = st.format("Vatsal is added to the front "+ st);
				System.out.println(st2);
				break;
				
			case 11:
				System.out.println("Here the hash code is printed \n " +st.hashCode());
				break;
				
			case 12:
				System.out.println("Here it checks if the string is empty or not \n" + st.isEmpty());
				break;
				
			case 13:
				System.out.println("The length of the string is " + st.length());
				break;
				
			case 14:
				System.out.println("Which character in the string :" + st + "\n Do you want to replace?");
				Scanner sc7 =new Scanner(System.in);
				char t1 = sc7.nextLine().charAt(0);
				System.out.println("With which character will you replace it with?");
				Scanner sc8 =new Scanner(System.in);
				char t2 = sc8.nextLine().charAt(0);
				st2 = st.replace(t1,t2);
				System.out.println("The new string is "+ st2);
				break;
				
			case 15:
				System.out.println("Enter the String/word you want to replace in the original String");
				Scanner sc9 =new Scanner(System.in);
				st2 = sc9.nextLine();
				System.out.println("Enter the String that will replace the mentioned String in the original String");
				Scanner sc10 =new Scanner(System.in);
				String st3 = sc10.nextLine();
				System.out.println(st.replaceAll(st2,st3));
				break;
				
			case 16:
				System.out.println("Here the String is converted into a Character Array and hence all characters will be printed in a new line");
				char[] ch=st.toCharArray();  
				for(int i=0;i<ch.length;i++){  
				System.out.println(ch[i]);  }
				break;
				
			case 17:
				System.out.println("Here the String is fully converted to Lower Case : "+st.toLowerCase());
				break;
				
			case 18:
				System.out.println("Here the String is fully converted to Upper Case : "+st.toUpperCase());
				break;
				
			case 19:
				System.out.println("Here the spaces are removed from both ends for showing this the original string with space on both ends is :");
				st2  = st.format("     "+ st +"     ");
				System.out.println("Start :"+st2+": End");
				System.out.println("So the trimmed String is :"+st2.trim());
				break;
				
			case 20:System.out.println("Exiting The Code");
				break;
				
			default:System.out.println("Invalid Input");
				break;
			}
		}
		
	}
}
