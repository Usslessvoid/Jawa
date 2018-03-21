import java.util.Arrays;
import java.util.Scanner;

import by.gsu.omglab.Biker;
import by.gsu.omglab.Equipment;
import by.gsu.omglab.EquipmentBoots;
import by.gsu.omglab.EquipmentHelmet;
import by.gsu.omglab.EquipmentJacket;
import by.gsu.omglab.WriterInfo;

public class Runner {
	private static void printAll(Object obj[]) {
		System.out.println("----------------");
		for(Object object:obj) {
			System.out.println(object);
		}
		System.out.println("----------------");
	}
	public static void main(String[] args) {
		Equipment inventory[] = {
				new EquipmentHelmet("Hlem of dominator", 2, 6000, "plastic", "black"),
				new EquipmentHelmet("4 Pro", 0.7, 5500, "carbon", "red"),
				new EquipmentJacket("Base jacket", 2.5, 20500, "leather", "Collin's", 170),
				new EquipmentJacket("Glamur", 1.2, 69900, "cotton", "Gucci", 155),
				new EquipmentJacket("Metalica", 3.1, 32100, "carbon, leather ", "Pro Biker", 155),
				new EquipmentJacket("Bab Boy",3.9, 42100, "carbon, leather, iron ", "Ghost racer", 155),
				new EquipmentBoots("Boots of travel", 0.9, 20050, "leather", 44, "black"),
				new EquipmentBoots("Boots of speed", 0.7, 9100, "old leather", 45, "brown"),
				new EquipmentBoots("Macasiny", 0.5, 51800, "old leather", 43, "red")
		};
		int minCost=0;
		int maxCost=0;
		Scanner console = new Scanner(System.in);
		Biker biker = new Biker(inventory[1], inventory[4], inventory[6]);
		printAll(inventory);
		System.out.println("Equip:");
		System.out.println(biker);
		System.out.println("Cost:"+ biker.getTotal());
		Arrays.sort(inventory);
		printAll(inventory);
		WriterInfo.showInfo(inventory[3]);
		System.out.println("----------------");
		System.out.println("Enter min cost");
		minCost = console.nextInt();
		System.out.println("Enter max cost");
		maxCost = console.nextInt();
		console.close();
		System.out.println("----------------");
		for(Equipment item:inventory) {
			if((item.getPrice()>=minCost)&&(item.getPrice()<=maxCost)) {
				System.out.println(item);
			}
		}

	}

}
