package by.gsu.omglab.tools;

import java.util.Comparator;

import by.gsu.omglab.BuisinessTrip;

public class BuisinessComparator extends BuisinessTrip implements Comparator<BuisinessTrip> {
	
	public BuisinessComparator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int compare(BuisinessTrip b1,BuisinessTrip b2) {
		return b1.getTotal()-b2. getTotal();
	}
}
