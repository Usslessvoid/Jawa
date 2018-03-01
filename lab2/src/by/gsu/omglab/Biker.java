package by.gsu.omglab;

public class Biker {
	
	private Equipment head;
	private Equipment body;
	private Equipment legs;
	public Biker() {
		super();
		// TODO јвтоматически созданна€ заглушка конструктора
	}
	public Biker(Equipment head, Equipment body, Equipment legs) {
		super();
		this.head = head;
		this.body = body;
		this.legs = legs;
	}
	public int getTotal() {
		return head.getPrice()+body.getPrice()+legs.getPrice();
	}
	@Override
	public String toString() {
		return head + ";\n" + body + ";\n" + legs;
	}
	

}
