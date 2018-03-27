import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.gsu.omglab.*;
import by.gsu.omglab.tools.BuisinessComparator;

public class Runner {
	private final static String FILE_NAME= "src/in.txt"; 
	
	private static String getParam(List<String> s,String find){
		for(String tmp:s){
			if(tmp.contains(find)){
				s.remove(tmp);
				return tmp.substring(find.length()+1).trim();
			}
		}
		return "0";
	}
	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			String account;
			int days, transport;
			scanner = new Scanner(new File(FILE_NAME));
			List<BuisinessTrip> list = new ArrayList<>();
			List<String> strings = new ArrayList<>();
			while (scanner.hasNext()) {
				strings.add(scanner.nextLine());
			}
			BuisinessTrip.setCOINS_PER_DAY(Integer.parseInt(getParam(strings, "daily-rate")));
			String indexes[]=getParam(strings, "indices").split(";");
			for (String s :indexes){
				if(s.length()<2){
					s="0"+s;
				}
				account = getParam(strings,"account"+s);
				days = Integer.parseInt(getParam(strings, "days"+s));
				transport = Integer.parseInt(getParam(strings, "transport"+s));
				list.add(new BuisinessTrip(account, transport, days));
			}//list parse
			for(BuisinessTrip b : list){
				System.out.println(b);
			}
			list.sort(new BuisinessComparator());
			System.out.println("-----------------");
			for(BuisinessTrip b : list){
				System.out.println(b);
			}
		}catch (FileNotFoundException e) {
			System.err.println("file not found!");
		}finally{
			scanner.close();
		}



	}

}
