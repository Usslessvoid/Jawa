package by.gsu.pms;
import by.gsu.pms.CoinConverter;
public class BuisinessTrip {
public static final int COINS_PER_DAY= 600;
private String name;
private String lastName;
private int transportExpences;
private int days;
public BuisinessTrip() {
	super();
}
public BuisinessTrip(String name, String lastName,
		int transportExpences, int days) {
	super();
	this.name = name;
	this.lastName = lastName;
	this.transportExpences = transportExpences;
	this.days = days;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
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
public static int getCoinsPerDay() {
	return COINS_PER_DAY;
}
public int getTotal(){
	return transportExpences+(days*COINS_PER_DAY);
}
public void show(){
	System.out.println("rate = "+COINS_PER_DAY);
	System.out.println("account = "+name+" "+lastName);
	System.out.println("transport = "+transportExpences);
	System.out.println("days = "+days);
	System.out.println("total = "+CoinConverter.convert(getTotal(), CoinConverter.BYN, 2));
}

public String toString(){
	return COINS_PER_DAY+";"+name+" "+lastName+";"+transportExpences+";"+days+";"+CoinConverter.convert(getTotal(), CoinConverter.BYN, 2);
}
}
