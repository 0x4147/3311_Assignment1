import java.awt.Color;
import java.awt.Graphics;


public class Circle extends Shape{
	/**
	 * Class's constructor
	 * @param upperX
	 * @param upperY
	 * @param width
	 * @param height
	 * @param shapeColor
	 */
	public Circle(int upperX, int upperY, int width, int height, int surfaceArea, Color shapeColor) {
		super(upperX, upperY, width, height, surfaceArea, shapeColor);
	}
	
	/**
	 * Method to draw a rectangle
	 * @param form
	 */
	public  void draw(Graphics	form) {
		form.fillOval(upperX, upperY, width, height);
	}
	
    
    //getters
    
    public Color getColor() {
		return shapeColor;
	}
    
    public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }
    
	public int getUpperX() {
		return upperX;
	}
	
	public int getUpperY() {
		return upperY;
	}
	
	//setters
	 public void setColor(Color aShapeColor) {
		 this.shapeColor = aShapeColor;
	 }
	 
	 public void setWidth( int width) {
		 this.width = width;
	 }
	    
	 public void setHeight(int height) {
		 this.height = height;
	 }
	 
	 public void setUpperX(int upperX) {
		 this.upperX = upperX;
	 }
		
	 public void setUpperY(int upperY) {
		 this.upperY = upperY;
	 }


}
