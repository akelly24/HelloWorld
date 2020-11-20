
package HelloWorld;
import java.util.Scanner;
import java.lang.Math;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World, this is Aaron!");

		Scanner scnr = new Scanner(System.in);
		
	    double wallHeight;
	    double wallWidth;
	    double wallArea;
	      
	    wallHeight = scnr.nextDouble();
	    wallWidth = scnr.nextDouble();
	    wallArea = wallHeight * wallWidth;
	    scnr.close();
	    System.out.println("Enter wall height (feet):");
	      //System.out.println("" + wallHeight);
	    System.out.println("Enter wall width (feet):");
	     //System.out.println("" + wallWidth);
	    System.out.println("Wall area: " + wallArea + " square feet");
	      
	    double wallPaint = wallArea / 350.0;
	      
	    System.out.println("Paint needed: " + wallPaint + " gallons");
	      
	      
	    System.out.println("Cans needed: " + Math.round(wallPaint) + " can(s)");
	
	}

}
