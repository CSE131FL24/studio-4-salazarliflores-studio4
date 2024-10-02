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
		Scanner scan = new Scanner(f); //making Scanner with a File
		String shapeType = scan.next();
		int redComponent = scan.nextInt();
		int greenComponent = scan.nextInt();
		int blueComponent = scan.nextInt();
		boolean isFilled= scan.nextBoolean();
		double parameterOne = scan.nextDouble();
		double parameterTwo = scan.nextDouble();
		double parameterThree = scan.nextDouble();
		double parameterFour = scan.nextDouble();

		if( shapeType.equals("rectangle")){
			if (isFilled == true) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
	}
	}
