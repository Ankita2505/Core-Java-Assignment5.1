package abstractdemo;
/*
 * Create an abstract class Parent and define an abstract methods in it
 *  and implement it in the child class
 */
abstract class AbstractDemo1// Parent Class
{
	int x;
	int y;
	int Sum()// Method Sum in abstract Class which does addition of two variable
	{
		x=5;
		y=8;
		int c=x+y;
		return(c);
	}
	abstract int Product(); //abstract Method with no body
}
public class AbstractDemo extends AbstractDemo1// Child Class
{
	int Product()// Defining Body of product Method
	{
		int a=9;
		int b=8;
		int c=a*b;
		return(c);
	}
	public static void main(String[] args) //Start of Main Class
	{
		// TODO Auto-generated method stub
		int c;
		AbstractDemo abq=new AbstractDemo(); // Creating object of Child Class
		c=abq.Sum(); //Call to Sum method In abstract Class
		System.out.println("abstact method result: "+c);
		c=abq.Product();// Call to Product method of abstract class
		System.out.println("main method result: "+c);
	}// Close of Main Class

}

