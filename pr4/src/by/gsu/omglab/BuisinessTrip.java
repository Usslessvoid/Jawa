package by.gsu.omglab;
import by.gsu.omglab.tools.CoinConverter;

public class BuisinessTrip {
	public static int COINS_PER_DAY;
	private String name;
	private int transportExpences;
	private int days;
	
public BuisinessTrip() {
	super();
}
public BuisinessTrip(String name,
		int transportExpences, int days) {
	super();
	this.name = name;
	this.transportExpences = transportExpences;
	this.days = days;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTransportExpences() {
	return transportExpences;
}
public void setTransportExpences(int transportExpences) {
	this.transportExpences = transportExpences;
}
public int getDays() {
	return days;
}

public void setDays(int days) {
	this.days = days;
}

public static int getCOINS_PER_DAY() {
	return COINS_PER_DAY;
}

public static void setCOINS_PER_DAY(int cOINS_PER_DAY) {
	COINS_PER_DAY = cOINS_PER_DAY;
}
public int getTotal(){
	return transportExpences+(days*COINS_PER_DAY);
}
public void show(){
	System.out.println("rate = "+COINS_PER_DAY);
	System.out.println("account = "+name);
	System.out.println("transport = "+transportExpences);
	System.out.println("days = "+days);
	System.out.println("total = "+CoinConverter.convert(getTotal(), CoinConverter.BYN, 2));
}

public String toString(){
	return CoinConverter.convert(COINS_PER_DAY)+";"+name+";"+CoinConverter.convert(transportExpences)+";"+days+";"+CoinConverter.convert(getTotal(), CoinConverter.BYN, 2);
}
}
