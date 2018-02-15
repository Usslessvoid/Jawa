import by.gsu.pms.BuisinessTrip;
import by.gsu.pms.CoinConverter;

public class Runner {
	public static void main(String[] args) {
		System.out.println(CoinConverter.convert(700, 100, 4));
		BuisinessTrip trips[] = {
				new BuisinessTrip("Nikita","Jigurda", 20000,5),
				new BuisinessTrip("Nyx","Lalkin", 30000,7),
				null,
				new BuisinessTrip("Artem","Koro", 1000,6),
				new BuisinessTrip("Nikita","Trasher", 2000,4),
				new BuisinessTrip("Lexus","Ololo", 2000,4),
				new BuisinessTrip()
		};
		for(BuisinessTrip trip:trips){
			if(trip!=null){
				trip.show();
			}
		}
		trips[trips.length-1].setTransportExpences(15000);
		System.out.println("Duration= "+trips[0].getDays());
		System.out.println("Duration= "+trips[1].getDays());
		for (BuisinessTrip trip:trips){
			System.out.println(trip);
		}
		int totalSum=0;
		for (BuisinessTrip trip:trips){
			if(trip!=null){
				totalSum+=trip.getTotal();
			}
		}
		System.out.println("TOTAL SUM    "+totalSum);
		BuisinessTrip maxTransportExpences= new BuisinessTrip();
		for (BuisinessTrip trip:trips){
			if((trip!=null)&&(trip.getTransportExpences()>maxTransportExpences.getTransportExpences())){
				maxTransportExpences=trip;
			}
		}
		System.out.println("Max transport cost:");
		maxTransportExpences.show();
	}

}
