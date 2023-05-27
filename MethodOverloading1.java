/* Method Overloading with changing the number of arguments */

class Addition{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class MethodOverloading1{  
public static void main(String[] args){ 
System.out.println("A-52 Manomay Kongwad");
System.out.println(Addition.add(15,15));  
System.out.println(Addition.add(15,15,15));  
}}  