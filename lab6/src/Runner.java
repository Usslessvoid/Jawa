import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import by.gsu.omglab.Computer;

public class Runner {
	static final String IN = "src/in.txt";
	static final String OUT = "src/out.txt";
	public static void main(String[] args) {
		Scanner input = null;
		FileWriter output = null;
		ArrayList<Computer> list = new ArrayList<Computer>();
		try {
			input = new Scanner(new File(IN));
			output = new FileWriter(new File(OUT));
			while (input.hasNextLine()) {
				list.add(new Computer(input.nextInt(),input.nextInt(),input.next()));			
			}
			Collections.sort(list);
			for(int i = 0;i<list.size();i++) {
				output.append(list.get(i).toString());
				output.append("\n");
			}
			if(output != null) {
				output.close();
			}
		} catch (FileNotFoundException e) {
			System.err.println("No input file");
		}catch (IOException e) {
			System.err.println("Can't write file");
		}finally {
			if(input != null) {
				input.close();
			}			
		}

	}

}
