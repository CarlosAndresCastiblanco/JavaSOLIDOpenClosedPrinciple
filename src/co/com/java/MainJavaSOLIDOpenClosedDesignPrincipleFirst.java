package co.com.java;

//Java Program to Illustrate Open Closed Design Principle
//Using Inheritance

//Importing input output classes
import java.io.*;

//Class 1
//Helper class acting as parent class
class CakeF {

	// Member variable of Cake class
	private int size;
	private float weight;

	// Constructor for cake which sets
	// only size and dimension of cake
	public CakeF(int size, float weight)
	{
		// This keyword refers to current object itself
		this.size = size;
		this.weight = weight;
	}

	// Method
	// To bake the cake
	public void bake()
	{
		// Display message only
		System.out.println(
			"Baking cake with base as vanilla");

		// Print and display the size and weight of the cake
		System.out.println("Size is " + this.size
						+ " inches and weight is "
						+ this.weight + " kg.");
	}
}

//Class 2
//Helper class(Child class) of class 1
class PineappleCakeF extends CakeF {

	// Member variables
	private int size;
	private float weight;

	// Constructor
	// To set the dimension of the pineapple cake
	public PineappleCakeF(int size, float weight)
	{
		// Super keyword refers to parent class instance
		super(size, weight);

		// This keyword refer to current instance
		this.size = size;
		this.weight = weight;
	}

	// Method 1
	// To decorate the pineapple cake
	private void decorateCake()
	{
		// Display messages only
		System.out.println("Decorating cake");
		System.out.println("Adding pineapple pieces");
	}

	// Method 2
	// To add cream to pineapple cake
	private void addCream()
	{
		// Print statement
		System.out.println("Adding white cream");
	}

	// Method 3
	// To bake a pineapple cake
	public void bake()
	{

		super.bake();

		// Calling the above two methods created
		addCream();
		decorateCake();

		// Print the dimension of the pineapple cake
		System.out.println("Pineapple cake - " + this.size
						+ " inches is ready");
	}
}

//Class 3
//Helper class(Child class) of class 1
class ChocolateCakeF extends CakeF {

	// member variables
	private int size;
	private float weight;

	// Constructor
	// Setting the size nd weight of the chocolate cake
	public ChocolateCakeF(int size, float weight)
	{

		super(size, weight);

		this.size = size;
		this.weight = weight;
	}

	// Method 1
	// To decorate a chocolate cake
	private void decorateCake()
	{

		// Display commands only
		System.out.println("Decorating cake");
		System.out.println("Adding chocolate chips");
	}

	// Method 2
	// To add cream to chocolate cake
	private void addCream()
	{

		// Print statement
		System.out.println("Adding chocolate cream");
	}

	// Method 3
	// to bake a chocolate cake
	public void bake()
	{

		super.bake();

		// Calling the above two methods created
		addCream();
		decorateCake();

		// Print and display the dimension of chocolate cake
		System.out.println("Chocolate cake - " + this.size
						+ " inches is ready");
	}
}

//Class 4
//Main class
public class MainJavaSOLIDOpenClosedDesignPrincipleFirst {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating an instance of pineapple cake
		// int the main() method

		// Custom dimension are passed as in arguments
		PineappleCakeF pineappleCake
			= new PineappleCakeF(7, 3);

		// Calling the bake() method of PineappleCake class
		// to bake the cake
		pineappleCake.bake();

		// Similarly, creating an instance of chocolate cake
		// in the main() method
		ChocolateCakeF chocolateCake
			= new ChocolateCakeF(5, 2);

		// Calling the bake() method of ChocolateCake class
		// to bake the cake
		chocolateCake.bake();
	}
}
