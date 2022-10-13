package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapetype = in.next() ; 
		int redcomponent = in.nextInt(); 
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour =  in.nextDouble();

		
		double x = parameterOne ; 
		double y = parameterTwo ; 
		double halfWidth = parameterThree ; 
		double halfHeigh = parameterFour ; 
		
		StdDraw.setPenColor(redcomponent, greenComponent, blueComponent);
		
		if (shapetype.equals("triangle")) {
			double parameterFive = in.nextDouble();
			double parameterSix = in.nextDouble();
			double[] x1 = {parameterOne, parameterThree, parameterFive};
			double[] y1 = {parameterTwo, parameterFour, parameterSix};
			StdDraw.polygon(x1, y1);
			if (isFilled = true ) {
				StdDraw.filledPolygon(x1, y1);
			}
		}
		
		if (shapetype.equals("ellipse")) {
			StdDraw.ellipse(x, y, x, x);
			if (isFilled = true ) {
				StdDraw.filledEllipse(x, y, x, x);
			}
		}
		
		if (shapetype.equals("rectangle") ) {
			StdDraw.rectangle(x, y, halfWidth, halfHeigh);
			if (isFilled == true ){
				StdDraw.filledRectangle(x, y, halfWidth, halfHeigh);
			}
		}
		
	}
}
