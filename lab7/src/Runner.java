import java.util.Scanner;

import by.gsu.omglab.*;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ThreadGenerator generator = new ThreadGenerator();
		System.out.println("Enter num of threads");
		generator.setNumOfThreads(sc.nextInt());
		generator.setAction(ThreadGenerator.menu(sc));
		System.out.println("Enter parametr");
		generator.setParametr(sc.nextInt());
		generator.execute();
		System.out.println("Result: " + generator.getResult());
	}

}
