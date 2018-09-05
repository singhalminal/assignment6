import java.util.Scanner;
class main
{
public void display()
{
System.out.println("Immediate parent accessed without creating an object");
}
}
class parent extends main
{
parent()
{
super.display();
}
}
class que1
{public static void main(String args[])
{
parent p = new parent();
}
}