import java.util.Arrays;
import by.gsu.pms.*;
public class Runner {
	public static void printAll(Object obj[]){
		for(Object item:obj){
			System.out.println(item);
		}
	}
	public static void main(String[] args) {
		int sum=0;
		int monday_sum=0;
		double average=0;
		Purchase max_cost=new Purchase();
		Purchase purchases[]={
				new Purchase(2,WeekDay.Monday),
				new Purchase(3,WeekDay.Tuesday),
				new Purchase(6,WeekDay.Friday),
				new Purchase(1,WeekDay.Saturday),
				new Purchase(4,WeekDay.Monday),
		};
		System.out.println("Name= "+Purchase.getName());
		System.out.println("Price= "+CoinConverter.convert(Purchase.getPrice()));
		printAll(purchases);
		for(Purchase purchase:purchases){
			sum+=purchase.getCost();
			if(purchase.getDay()==WeekDay.Monday) {																//task4.1
				monday_sum+=purchase.getCost();														//task4.2
			}
			if(purchase.getCost()>max_cost.getCost()) {
				max_cost=purchase;																	//task4.3
			}			
		}
		
		average=sum/purchases.length;
		System.out.println("Mean cost = "+average);
		System.out.println("The total cost on Monday = "+monday_sum);
		System.out.println("The day with the maximum cost purchase is "+max_cost);
		Arrays.sort(purchases);																			//task5
		printAll(purchases);
	}
}
