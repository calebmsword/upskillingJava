public class Rectangle {
	private double width;
	private double height;
	
	public Rectange(double width, double height) {
		this.width = width;
		this.height = height;
	}	

	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return this.width * this.height;
	}

	public double getPerimeter() {
		return 2*(this.width+this.height);
	}

	public boolean isSquare() {
		return this.width == this.height;
	}
}