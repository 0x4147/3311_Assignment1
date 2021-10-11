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

public class ShapeFactory extends JPanel{
	/**
	 * This method displays the creates the shapes.
	 */
	protected static List<Shape> sortedShapesList = null;
	
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g;

      List<Shape> shapesList = createShapes();
      sortedShapesList = SortingTechnique.bubbleSort(shapesList);

      for (Shape shape: shapesList) {
    	  g2d.setColor(shape.getColor());
    	  shape.draw(g2d);
      }
   }
   
   public static List<Shape> sortedList(){
	   return sortedShapesList;
   }
      
  	/**
  	 * This method creates two rectangles
  	 * @return
  	 */
  	private List<Shape> createShapes(){
  		
  		int shapeCount = 0;
  		int upperX = 0;
  		int upperY = 0;
  		List<Shape> shapeList = new ArrayList <Shape>();
  		
  		while(shapeCount < 6) {
  			int typeOfShape = (int)(Math.random()*(3-1+1)+1); 
  			int height = (int)(Math.random()*(70-20+1)+20); 
  			int width = (int)(Math.random()*(70-20+1)+20);
			upperX += 70;
  			upperY += 70;
  			if(typeOfShape == 1) {
  		  		Color myColor = new Color((int)(Math.random()*(255-0+1)+0), (int)(Math.random()*(255-0+1)+0), (int)(Math.random()*(255-0+1)+0));
  		  		int surfaceArea = height * width;
  		  		Rectangle rectangleShape = new Rectangle (upperX, upperY, height, width, surfaceArea, myColor);
  		  		shapeList.add(rectangleShape);
  			}
  			else if(typeOfShape == 2) {
  		  		Color myColor = new Color((int)(Math.random()*(255-0+1)+0), (int)(Math.random()*(255-0+1)+0), (int)(Math.random()*(255-0+1)+0));
  		  		int surfaceArea = (int) (Math.PI * ((height/2) * (height/2))) ;
  		  		Circle cirlceShape = new Circle (upperX, upperY, height, height, surfaceArea, myColor);
  		  		shapeList.add(cirlceShape);
  			}
  			else if(typeOfShape == 3){
  		  		Color myColor = new Color((int)(Math.random()*(255-0+1)+0), (int)(Math.random()*(255-0+1)+0), (int)(Math.random()*(255-0+1)+0));
  		  		int surfaceArea = height * height;
  		  		Square squareShape = new Square (upperX, upperY , height, height, surfaceArea, myColor);
  		  		shapeList.add(squareShape);
  			}
  			shapeCount++;
  		}

  		return shapeList;
  	}
	
   public static void main(String[] args) {
	  JFrame frame = new JFrame("Shapes"); 
      JPanel buttonPanel = new JPanel(); 
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      
      JButton loadButton = new JButton();  
      JButton sortButton = new JButton(); 
      loadButton.setText("Load Shapes");  
      sortButton.setText("Sort Shapes"); 
      
      loadButton.addActionListener(new ActionListener(){  
		@Override
		public void actionPerformed(ActionEvent e) {
			ShapeFactory mainPanel = new ShapeFactory();
		    frame.add(mainPanel); 
		    frame.setVisible(true);
		}  
      });  
      
      sortButton.addActionListener(new ActionListener(){  
		@Override
		public void actionPerformed(ActionEvent e) {
			Sort sortPanel = new Sort();
		    frame.add(sortPanel); 
		    frame.setVisible(true);
		}  
      });
      
      buttonPanel.add(loadButton);
      buttonPanel.add(sortButton);   

      frame.getContentPane().add(BorderLayout.NORTH, buttonPanel);
      frame.setSize(600, 600);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
