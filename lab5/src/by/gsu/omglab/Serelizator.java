package by.gsu.omglab;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import by.gsu.omglab.exceptions.SerializeException;

public class Serelizator {
	public static final String FILENAME = "src/races.bin";
	public static void serialize(Race obj[]) throws SerializeException{
		FileOutputStream outFile;
		try {
			outFile = new FileOutputStream(FILENAME);
			ObjectOutputStream out = new ObjectOutputStream(outFile);
			out.writeObject(obj);
			out.flush();
			out.close();
			outFile.close();
		} catch (IOException e) {
			throw new SerializeException("Serialize error: "  + e.getMessage());
		}
	}
	public static Race[] deSerialize() throws SerializeException{
		Race out[]= null;
		FileInputStream inFile;
		try {
			inFile = new FileInputStream(FILENAME);
			ObjectInputStream  in = new ObjectInputStream(inFile);
			out = (Race[])in.readObject();
			in.close();
			inFile.close();
		} catch (IOException | ClassNotFoundException e) {
			throw new SerializeException("Serialize error: " + e.getMessage());
		}
		return out;
		
	}
}
