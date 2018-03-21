import java.util.Arrays;

import by.gsu.omglab.ComparatorInt;
import by.gsu.omglab.ComparatorString;
import by.gsu.omglab.Race;



public class Runner {
	public static void printAll(Object obj[]){
		for(Object item:obj){
			System.out.println(item);
		}
	}
	public static void main(String[] args) {
	Race races[] = {
			new Race("2018.02.25", 10, 1),
			new Race("2018.04.19", 20, 1),
			new Race("2018.09.6", 2, 0),
			new Race("2018.06.11", 5, 1),
			new Race("2019.05.7", 16, 0),
			new Race("2018.04.5", 4, 1),
			new Race("2018.11.6", 22, 0),
			new Race("2018.03.9", 30, 1),
			new Race("2019.01.30", 9, 0),
			new Race("2018.08.12", 4, 0),
	};
	int total=0;
	int prizes=0;
	final ComparatorInt comp1= new ComparatorInt();
	final ComparatorString comp2 = new ComparatorString();
	for ( Race race:races){
		total+=race.getRacersNumber();
		if(race.isHavePrize()){
			prizes++;
		}
	}
	System.out.println("Total: "+total);
	System.out.println("Races with prize: "+prizes);
	System.out.println("--------------------");
	printAll(races);
	System.out.println("--------------------");
	Arrays.sort(races,comp1);
	printAll(races);
	System.out.println("--------------------");
	Arrays.sort(races,comp2);
	printAll(races);

	}

}
