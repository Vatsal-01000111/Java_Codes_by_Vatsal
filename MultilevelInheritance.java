class Comps
{
public Comps( )
{
System.out.println("Class Comps");
}
public void Division()
{
System.out.println("Division:A");
}
}
class student extends Comps
{
public student( )
{
System.out.println("Class Student");
}
public void name( )
{
System.out.println("Name: Vatsal Gandhi");
}
public void Rollno( )
{
System.out.println("Roll No. A-7379264928");
}
}
class Assignmentname extends student
{
public Assignmentname( )
{
System.out.println("Java Experiment 5");
}
public void Rollno( )
{
System.out.println("Roll No. A-33");
}
}
public class MultilevelInheritance
{
public static void main(String args[])
{
Assignmentname obj = new Assignmentname( );
obj.Division( );
obj.name( );
obj.Rollno( );
}
}
