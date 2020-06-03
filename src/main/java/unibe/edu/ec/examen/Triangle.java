package unibe.edu.ec.examen;

public class Triangle {
private double side;

public Triangle(double side) {
	super();
	this.side = side;
}

public double getSide() {
	return side;
}

public void setSide(double side) {
	this.side = side;
}

public double calculatePerimetro() {
	double perimetro = this.side + this.side +this.side;
	return perimetro;
}
public double calculateArea(double heigh) {
	return (this.side*heigh)/3.0;
	
}

public double calculateVolume(double sidebase,double heigh) {
	double volume= sidebase*sidebase*heigh*1/3;
	return volume;
}

}
