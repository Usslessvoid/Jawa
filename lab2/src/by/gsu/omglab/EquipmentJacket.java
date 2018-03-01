package by.gsu.omglab;

public class EquipmentJacket extends Equipment{
	
	private String brend;
	private int size;
	public EquipmentJacket() {
		super();
	}
	public EquipmentJacket(String name, double weight, int price, String material, String brend, int size) {
		super(name, weight, price, material);
		this.brend = brend;
		this.size = size;
	}
	
	public String getBrend() {
		return brend;
	}
	public void setBrend(String brend) {
		this.brend = brend;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return super.toString()+ ";" + brend + ";" + size;
	}
	

}
