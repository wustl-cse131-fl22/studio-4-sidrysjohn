package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(0.5, 0.35, 0.4, 0.25);
		StdDraw.setPenRadius(0.05);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.line(0.9, 0.6, 0.1, 0.1);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.line(0.9, 0.1, 0.1, 0.6);
		
		StdDraw.setPenRadius(0.1);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.line(0.1, 0.35, 0.9, 0.35);
		
		StdDraw.setPenRadius(0.1);
		StdDraw.setPenColor(Color.PINK);
		StdDraw.line(0.5, 0.1, 0.5, 0.6);
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledCircle(0.5, 0.35, 0.2);
		
		
	}
}