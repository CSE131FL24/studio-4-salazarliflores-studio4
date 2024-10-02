package studio4;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(512, 512);
		StdDraw.clear(StdDraw. GREEN);
		double[] x = { 0.4, 0.5, 0.5, 0.6 };
		double[] y = { 0.5, 0.6, 0.4, 0.5 };
		StdDraw.filledPolygon(x, y);
		double[] rotatedX = {0.5, 0.6, 0.4, 0.5};
		double[] rotatedY = {0.6, 0.5, 0.5, 0.4};
		StdDraw.filledPolygon(rotatedX, rotatedY);
	}
	
}