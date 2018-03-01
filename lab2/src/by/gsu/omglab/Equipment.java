package by.gsu.omglab;

public class Equipment implements Comparable<Equipment>{

protected String name;
protected double weight;
protected int price;
protected String material;
public Equipment(String name, double weight, int price, String material) {
	super();
	this.name = name;
	this.weight = weight;
	this.price = price;
	this.material=material;
}

public Equipment(String name, double weight, int price) {
	super();
	this.name = name;
	this.weight = weight;
	this.price = price;
}

public Equipment() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return name + ";" + weight + ";" + price + ";" + material;
}
@Override
public int compareTo(Equipment arg0) {
	return (int)(this.weight-arg0.weight);
}



}
