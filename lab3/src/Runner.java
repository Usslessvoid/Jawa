import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import by.gsu.omglab.*;
public class Runner {

	public static void main(String[] args) {
		
		String FILE_NAME = "src/text.txt";
		
		File f = new File(FILE_NAME);
		Scanner scanner = null;
		PrintWriter printer = null;
		List<Word> words = new ArrayList<>();
		try {
			scanner = new Scanner(f);
			while (scanner.hasNext()) {
				words.add(new Word(scanner.next()));	
			}
			words.sort(new ComparatorWord());
			printer =  new PrintWriter(f);
			for(Word w:words) {
				printer.print(w+" ");
			}
			System.out.println("Sorted "+words.size() + " words");
		} catch (FileNotFoundException e) {
			System.err.println("Can't read/write file");
		}finally {
			if(printer!=null) {
				printer.close();
			}
			if(scanner!=null) {
				scanner.close();
			}			
		}
	}

}
