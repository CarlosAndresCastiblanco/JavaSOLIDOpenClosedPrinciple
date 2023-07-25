package co.com.java;

//Java Program to illustrate Open Closed Principle

//class 1
//Helper class
//To store dimensions of a cuboid
//used to store length, breadth and height of a cuboid
class CuboidS {

	// Member variables of this class
	public double length;
	public double breadth;
	public double height;
}

//Class 2
//Helper class
//To store dimensions of a sphere
class SphereS {

	// Storing radius of a sphere
	public double radius;
}

//Class 3
//Helper class
//This class helps to calculate the volume of geometric
//objects
class ApplicationS {

	// Returning the total volume of the geometric objects
	public double get_total_volume(CuboidS[] c_geo_objects,
								SphereS[] s_geo_objects)
	{
		// Variable used to store total volume
		double vol_sum = 0;

		// Iteratively calculating the volume of each Cuboid
		// and adding it to the total volume

		// Iterating using for each loop to
		// calculate the volume of a cuboid
		for (CuboidS geo_obj : c_geo_objects) {

			vol_sum += geo_obj.length * geo_obj.breadth
					* geo_obj.height;
		}

		// Iterating using for each loop to
		// calculate the volume of a cuboid
		for (SphereS geo_obj : s_geo_objects) {

			// Iteratively calculating the volume of each
			// Sphere and adding it to the total volume
			vol_sum += (4 / 3) * Math.PI * geo_obj.radius
					* geo_obj.radius * geo_obj.radius;
		}

		// Returning the to total volume
		return vol_sum;
	}
}

//Class 4
//Main class
//To demonstrate working of all classes
public class MainJavaSOLIDOpenClosedPrincipleSecond {

	// Main driver method
	public static void main(String args[])
	{
		// Initializing a cuboid one as well as declaring
		// its dimensions.
		CuboidS cb1 = new CuboidS();
		cb1.length = 5;
		cb1.breadth = 10;
		cb1.height = 15;

		// Initializing a cuboid two as well as declaring
		// its dimensions.
		CuboidS cb2 = new CuboidS();
		cb2.length = 2;
		cb2.breadth = 4;
		cb2.height = 6;

		////Initializing a cuboid three as well as declaring
		/// its dimensions.
		CuboidS cb3 = new CuboidS();
		cb3.length = 3;
		cb3.breadth = 12;
		cb3.height = 15;

		// Initializing and declaring an array of cuboids
		CuboidS[] c_arr = new CuboidS[3];
		c_arr[0] = cb1;
		c_arr[1] = cb2;
		c_arr[2] = cb3;

		// Initializing a sphere one as well as declaring
		// its dimension.
		SphereS sp1 = new SphereS();
		sp1.radius = 5;

		// Initializing a sphere two as well as declaring
		// its dimension.
		SphereS sp2 = new SphereS();
		sp2.radius = 2;

		// Initializing a sphere three as well as declaring
		// its dimension.
		SphereS sp3 = new SphereS();
		sp3.radius = 3;

		// Initializing and declaring an array of spheres
		SphereS[] s_arr = new SphereS[3];
		s_arr[0] = sp1;
		s_arr[1] = sp2;
		s_arr[2] = sp3;

		// Initializing Application class
		ApplicationS app = new ApplicationS();

		// Getting the total volume
		// using get_total_volume
		double vol = app.get_total_volume(c_arr, s_arr);

		// Print and display the total volume
		System.out.println("The total volume is " + vol);
	}
}
