class Food
{
public Food( )
{
System.out.println("Class Food");
}
public void Type()
{
System.out.println("Type: Fast Food");
}
}
class student extends Food
{
public student( )
{
System.out.println("Class Student");
}
public void name( )
{
System.out.println("Name: A-51 Siddhi Kommuri");
}
public void Rating( )
{
System.out.println("Rating: 1/10");
}
}
class Assignmentname extends student
{
public Assignmentname( )
{
System.out.println("Java Experiment 5");
}
public void Rating( )
{
System.out.println("Rating: 11/10");
}
}
public class Multilevel
{
public static void main(String args[])
{
Assignmentname obj = new Assignmentname( );
obj.Type( );
obj.name( );
obj.Rating( );
}
}
