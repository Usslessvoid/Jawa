import java.util.Arrays;
import java.util.Scanner;

import by.gsu.omglab.ComparatorInt;
import by.gsu.omglab.ComparatorString;
import by.gsu.omglab.Race;
import by.gsu.omglab.Serelizator;



public class Runner {
	public static void printAll(Object obj[]){
		for(Object item:obj){
			System.out.println(item);
		}
	}
	public static void main(String[] args) {
		int num;
		String date;
		int racers;
		int prize;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num of objects");
		num  = input.nextInt();
		Race races[] = new Race[num];
		for (int i = 0;i<num;i++){
			System.out.println("Enter date.");
			date = input.next();
			System.out.println("Enter num of racers.");
			racers = input.nextInt();
			System.out.println("Enter 1 if there a price, 0 otherwice");
			prize = input.nextInt();
			races[i] = new Race(date, racers, prize);
		}
		input.close();
		
		Serelizator.serialize(races);
		races = Serelizator.deSerialize();
		
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
	System.out.println("Total"+total);
	System.out.println("Races with prize"+prizes);
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
