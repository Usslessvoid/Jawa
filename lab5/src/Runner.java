import java.util.Scanner;
import by.gsu.omglab.Race;
import by.gsu.omglab.Serelizator;
import by.gsu.omglab.exceptions.NegativeNumberException;
import by.gsu.omglab.exceptions.SerializeException;



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
		try {
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
		} catch (SerializeException |NegativeNumberException e) {
			System.err.println(e);
		}
		printAll(races);
	}

}
