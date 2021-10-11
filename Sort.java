import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import SampleProject.src.shape.MyPanel;
import SampleProject.src.shape.MyRectangle;

public class Sort extends JPanel{
	/**
	 * This method displays the creates the shapes.
	 */
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g;

      List<Shape> sortedShapesList = ShapeFactory.sortedList();
      List<Shape> sortedShapesToDisplay = displaySortedShapes(sortedShapesList);

      for (Shape shape: sortedShapesToDisplay) {
    	  g2d.setColor(shape.getColor());
    	  shape.draw(g2d);
      }
   }
   
  	private List<Shape> displaySortedShapes(List<Shape> sortedSHapes){
  		int upperX = 0;
  		int upperY = 0;
        for (Shape shape: sortedSHapes) {
			upperX += 70;
  			upperY += 70;
        	shape.upperX = upperX;
        	shape.upperY = upperY;
        }
  		return sortedSHapes;
  	}
}