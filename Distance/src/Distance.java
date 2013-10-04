//********************************************************************
//  Distance.java       Author: Luxing Huang (100113287)
//
//  Calculate the distance between two points.
//********************************************************************
import java.util.Scanner;

public class Distance
{
	// --------------------------------------
	// Assignment 3 / PP 3.4
	//
	// Use split string tokens to determine
	// x1, x2, y1 and y2.
	// --------------------------------------
	public static void main(String[] args)
	{
		// Initialise variables
		String coordinateOne, coordinateTwo;
		double distance;
		Scanner scan = new Scanner(System.in);

		// Get the coordinates
		System.out.println("Coordinate 1: in the format of x,y");
		coordinateOne = scan.nextLine();

		System.out.println("Coordinate 2: in the format of x,y");
		coordinateTwo = scan.nextLine();

		// Split and assign numbers
		String break1[] = coordinateOne.split(",");
		int x1 = Integer.parseInt(break1[0]);
		int y1 = Integer.parseInt(break1[1]);

		String break2[] = coordinateTwo.split(",");
		int x2 = Integer.parseInt(break2[0]);
		int y2 = Integer.parseInt(break2[1]);

		// Calculate the distance
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out
				.println("The distance between the two points is " + distance);
	}
}
