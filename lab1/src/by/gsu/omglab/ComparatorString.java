package by.gsu.omglab;

import java.util.Comparator;

public class ComparatorString implements Comparator<Race> {
	public ComparatorString(){
		super();
	}
	public int compare(Race arg0, Race arg1) {
		return arg0.getDate().compareTo(arg1.getDate());
	}
	

}
