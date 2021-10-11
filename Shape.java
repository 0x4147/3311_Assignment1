import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Comparable <Shape>{
	protected int upperX; 
	protected int upperY;
	protected int width;
	protected int height;
	protected int surfaceArea;
	protected Color shapeColor;
	
	public Shape(int upperX, int upperY, int width, int height, int surfaceArea, Color shapeColor) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = height;
		this.surfaceArea = surfaceArea;
		this.shapeColor = shapeColor;

	}
	public int compareTo(Shape o) {
		if(this.surfaceArea > o.surfaceArea) {
			return 1;
		}
		else if(this.surfaceArea < o.surfaceArea){
			return -1;
		}
		return 0;
	}
	abstract void draw(Graphics form);
	abstract Color getColor();
}
