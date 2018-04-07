package by.gsu.omglab;

import java.util.Comparator;

public class ComparatorInt implements Comparator<Race> {
	public ComparatorInt(){
		super();
	}
	public int compare(Race arg0, Race arg1) {
		return arg0.getRacersNumber()-arg1.getRacersNumber();
	}
	

}