import by.gsu.omglab.Commodity;
import by.gsu.omglab.Purchase;



public class Runner {

	public static void main(String[] args) {
		Commodity book = new Commodity("1001 way of suicide", 700);
		Purchase purchase1 = new Purchase(book, 5);
		Purchase purchase2 = new Purchase(book,12);
		System.out.println(purchase1);
		System.out.println(purchase2);
		purchase2.setCommodity(new Commodity(book.getName(),250));
		System.out.println(purchase2);
		Commodity cookbook = new Commodity("how to cook rolton", 500);
		purchase1.setCommodity(cookbook);
		purchase2.setCommodity(cookbook);
		System.out.println(purchase1);
		System.out.println(purchase2);
		System.out.println("--------------------------------------------------------");
		Commodity magazine = new Commodity("Playboy", 150);
		Purchase purchase3 = new Purchase(magazine,5);
		System.out.println(purchase3);
		purchase3.setNumberOfCommodity(3);
		System.out.println(purchase3);
	}

}
