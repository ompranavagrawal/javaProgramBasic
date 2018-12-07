package P1;

public class Box {
	double height;
	double width;
	double depth;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public double volume() {
		return height*width*depth;
	}
	public Box(double height, double width, double depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
}
