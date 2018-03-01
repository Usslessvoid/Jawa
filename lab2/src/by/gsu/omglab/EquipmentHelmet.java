package by.gsu.omglab;

public class EquipmentHelmet extends Equipment {
	
	private String color;
	public EquipmentHelmet() {
		super();
	}
	public EquipmentHelmet(String name, double weight, int price, String material, String color) {
		super(name, weight, price, material);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return super.toString()+";"+ color;
	}
	

}
