package by.gsu.omglab;

public class EquipmentBoots extends Equipment{
	private int size;
	private String color;
	public EquipmentBoots() {
		super();
	}
	public EquipmentBoots(String name, double weight, int price, String material, int size, String color) {
		super(name, weight, price, material);
		this.size = size;
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return super.toString() +";" + size + ";" + color;
	}
	
}
