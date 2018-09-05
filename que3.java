import java.util.Scanner;
final class parent1
{
//cannot be extended
}
class parent extends parent1
{
parent()
{
System.out.println(" hello ");
}
}
class que3
{
public static void main(String args[])
{
parent p = new parent();
}
}