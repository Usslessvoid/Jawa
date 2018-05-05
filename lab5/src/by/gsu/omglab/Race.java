package by.gsu.omglab;

import java.io.Serializable;

import by.gsu.omglab.exceptions.NegativeNumberException;

public class Race implements Serializable{
private static final long serialVersionUID = 1L;
private String date;
private int racersNumber;
private boolean havePrize;
public Race(String date, int racersNumber, boolean havePrize) throws NegativeNumberException{
	super();
	if(racersNumber<1) {
		throw new NegativeNumberException();
	}
	this.date = date;
	this.racersNumber = racersNumber;
	this.havePrize = havePrize;
}
public Race(String date, int racersNumber, int havePrize) throws NegativeNumberException {
	this(date,racersNumber,havePrize>0);
}
public Race() {
	super();
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getRacersNumber() {
	return racersNumber;
}
public void setRacersNumber(int racersNumber) {
	this.racersNumber = racersNumber;
}
public boolean isHavePrize() {
	return havePrize;
}
public void setHavePrize(boolean havePrize) {
	this.havePrize = havePrize;
}
public String toString() {
	return date+";"+racersNumber+";"+havePrize;
}


}
