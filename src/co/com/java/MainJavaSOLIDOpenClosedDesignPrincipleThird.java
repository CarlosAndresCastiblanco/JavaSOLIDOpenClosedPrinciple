package co.com.java;

//Java Program to Illustrate Open Closed Design Principle
//Using Interfaces and abstract methods

//Importing input output classes
import java.io.*;

//Interface
interface CakeT {

	// Abstract methods of this interface
	public void bake();
	public void addCream();
	public void decorateCake();
}

//Class 1
//Helper class implementing above interface
class ChocolateCakeT implements CakeT {

	// Member variables of this class
	private String base;
	private int size;
	private float weight;

	// Constructor
	// To set the dimension to chocolate cake
	public ChocolateCakeT(String base, int size,
						float weight)
	{

		this.base = base;
		this.size = size;
		this.weight = weight;
	}

	// @Override
	// Method 1
	// To add cream to chocolate cake
	public void addCream()
	{
		System.out.println("Adding chocolate cream");
	}

	// @Override
	// Method 3
	// To bake the chocolate cake
	public void bake()
	{

		// Printing the base of the cake
		System.out.println("Baking cake with base as "
						+ this.base);

		// Calling the methods
		addCream();
		decorateCake();

		// Printing the dimension of the chocolate cake
		System.out.println("Chocolate cake with "
						+ this.size
						+ " inches and weight:"
						+ this.weight + " kg is ready");
	}

	// @Override
	// Method 2
	// To decorate the chocolate cake
	public void decorateCake()
	{

		// Print statement only
		System.out.println(
			"Cake decoration with choco chips");
	}
}

//Repeating the same for pineapple cake
//as we did above for chocolate cake

//Class 2
//Helper class implementing the 'Cake' interface
class PineappleCakeT implements CakeT {

	// Member variable
	private String base;
	private int size;
	private float weight;

	// Constructor
	// To set the dimension to pineapple cake
	public PineappleCakeT(String base, int size,
						float weight)
	{

		this.base = base;
		this.size = size;
		this.weight = weight;
	}

	// @Override
	// Method 1
	// To add cream to pineapple cake
	public void addCream()
	{

		System.out.println("Adding white cream");
	}

	//@Override
	//Method 3
	//To bake the pineapple cake
	public void bake()
	{

		System.out.println("Baking cake with base as "
						+ this.base);
		addCream();
		decorateCake();

		System.out.println("Pineapple cake with " + this.size
						+ " inches and weight:" + this.weight
						+ " kg is ready");
	}
	
	// @Override
	// Method 2
	// To decorate the pineapple cake
	public void decorateCake()
	{

		System.out.println(
			"Cake decoration with pineapple pieces");
	}
}



//Class 3
//Main class
public class MainJavaSOLIDOpenClosedDesignPrincipleThird {

	// Main driver method
	public static void main(String[] args)
	{

		// Making cakes using interface and abstract methods
		// by creating objects here in main() method

		// Custom dimensional to both cakes are passed
		// as in arguments

		// 1. Pineapple cake
		CakeT pineappleCake
			= new PineappleCakeT("vanilla", 7, 3);

		// Calling the bake() to
		// bake pineapple cake
		pineappleCake.bake();

		// 2. Chocolate cake
		CakeT chocolateCake
			= new ChocolateCakeT("chocolate", 5, 2);

		// Calling the bake() to
		// bake chocolate cake
		chocolateCake.bake();
	}
}
