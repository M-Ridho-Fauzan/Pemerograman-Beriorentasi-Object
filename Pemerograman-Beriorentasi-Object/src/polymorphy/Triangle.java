package polymorphy;

class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double calculateArea() {
		// Implementasi rumus perhitungan luas segitiga
		double semiPerimeter = (side1 + side2 + side3) / 2;
		return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
	}

	public double calculatePerimeter() {
		return side1 + side2 + side3;
	}
}
