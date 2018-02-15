package by.gsu.pms;
import by.gsu.pms.WeekDay;
public class Purchase implements Comparable<Purchase>{
	private final static String name="iPhone";
	private final static int price=200005;
	private int quantity;
	private WeekDay day;
	public Purchase(int quantity, WeekDay day) {
		super();
		this.quantity = quantity;
		this.day = day;
	}
	public Purchase() {
		super();
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public WeekDay getDay() {
		return day;
	}
	public void setDay(WeekDay day) {
		this.day = day;
	}
	public static String getName() {
		return name;
	}
	public static int getPrice() {
		return price;
	}
	public int getCost() {
		return price*quantity;
	}
	
	
	@Override
	public String toString() {
		return quantity+";"+day+";"+CoinConverter.convert(this.getCost()) ;		
	}
	
	public int compareTo(Purchase purchase) {
		return (int)(this.getCost()-purchase.getCost());
	}

}
