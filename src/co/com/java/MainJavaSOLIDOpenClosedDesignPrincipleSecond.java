package co.com.java;

//Java Program to Illustrate Open Closed Design Principle
//Using Inheritance
//Alonside adding Parameter - Flavor to cakes

//Importing input output classes
import java.io.*;

//Class 1
//Helper class
//Acting as parent class
class CakeS {

	// Member variables
	private int size;
	private float weight;

	// This is new declared variable to
	// hold the flavour for the cake
	private String flavor;

	// Constructor
	// To set the dimensions for the cake
	public CakeS(int size, float weight, String flavor)
	{

		this.size = size;
		this.weight = weight;

		// Here this keyword sets the
		// current instance flavour to the cake
		this.flavor = flavor;
	}

	// Method
	// To bake the cake
	public void bake()
	{

		// Printing the flavour of the desired cake
		System.out.println("Baking cake with base as "
						+ this.flavor);

		// Printing the size and weight of the same cake
		System.out.println("Size is " + this.size
						+ " inches and weight is "
						+ this.weight + " kg.");
	}
}

//Class 2
//Helper class
class PineappleCakeS extends CakeS {

	// Member variables for the pineapple cake
	private int size;
	private float weight;
	private String flavor;

	// Constructor
	// Updated as per requirements as sales rise flavour is
	// added, so do setting the flavour
	public PineappleCakeS(int size, float weight,
						String flavor)
	{

		// Super keyword refers to parent class
		super(size, weight, flavor);

		// This keyword refers to current instance
		this.size = size;
		this.weight = weight;
		this.flavor = flavor;
	}

	// Method 1
	// To decorate the cake
	private void decorateCake()
	{

		// Display commands only
		System.out.println("Decorating cake");
		System.out.println("Adding pineapple pieces");
	}

	// Method 2
	// To add cream to the flavored pineapple cake
	private void addCream()
	{

		System.out.println("Adding white cream");
	}
	// Method 3
	// To bake a flavored pineapple cake
	public void bake()
	{

		// Super keyword calls the Cake class bake() method
		super.bake();

		// Calling the above two methods
		addCream();
		decorateCake();

		// Printing the dimensions of
		// flavoured pineapple cake
		System.out.println("Pineapple cake - " + this.size
						+ " inches is ready");
	}
}

//Similarly setting the same for
//the 'flavoured' chocolate cake

//Class 3
//Helper class (Base class of parent class)
class ChocolateCakeS extends CakeS {

	private int size;
	private float weight;
	private String flavor;

	// Updated constructor
	public ChocolateCakeS(int size, float weight,
						String flavor)
	{

		super(size, weight, flavor);

		this.size = size;
		this.weight = weight;
		this.flavor = flavor;
	}

	// Method 1
	// To decorate the flavored chocolate cake
	private void decorateCake()
	{

		System.out.println("Decorating cake");
		System.out.println("Adding chocolate chips");
	}

	// Method 2
	// To add cream to the flavoured chocolate cake
	private void addCream()
	{

		System.out.println("Adding chocolate cream");
	}

	// Method 3
	// To bake a flavoured chocolate cake
	public void bake()
	{

		super.bake();

		addCream();
		decorateCake();

		System.out.println("Chocolate cake - " + this.size
						+ " inches is ready");
	}
}

//Class 4
//Main class
public class MainJavaSOLIDOpenClosedDesignPrincipleSecond {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating a pineapple cake in the main() method
		// Custom dimensions are passed as in arguments
		PineappleCakeS pineappleCake
			= new PineappleCakeS(7, 3, "vanilla");

		// Calling the bake() method of the PineappleCake
		// Class to bake the pineapple cake
		pineappleCake.bake();

		// Similarly repeating the same with the chocolate
		// cake

		// Creating a chocolate cake by creating an object
		// of ChocolateCake class in the main method
		ChocolateCakeS chocolateCake
			= new ChocolateCakeS(5, 2, "chocolate");

		// Calling the bake() method of the ChocolateCake
		// Class to bake the chocolate cake
		chocolateCake.bake();
	}
}
