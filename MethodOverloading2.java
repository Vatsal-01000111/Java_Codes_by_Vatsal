/* Method Overloading with changing the datatype of arguments */

class Addition{  
static int add(int a, int b){return a+b;}  
static double add(double a, double b){return a+b;}  
}  
class MethodOverloading2{  
public static void main(String[] args){  
System.out.println("A-52 Manomay Kongwad");
System.out.println(Addition.add(11,11));  
System.out.println(Addition.add(12.3,12.6));  
}}  