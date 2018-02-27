package by.gsu.omglab;

public class Purchase {
	private Commodity commodity;
	private int numberOfCommodity;
	public Purchase(Commodity commodity, int numberOfCommodity) {
		super();
		this.commodity = commodity;
		this.numberOfCommodity = numberOfCommodity;
	}
	public Purchase() {
		super();
	}
	public Commodity getCommodity() {
		return commodity;
	}
	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}
	public int getNumberOfCommodity() {
		return numberOfCommodity;
	}
	public void setNumberOfCommodity(int numberOfCommodity) {
		this.numberOfCommodity = numberOfCommodity;
	}
	public int getCost(){
		return commodity.getPrice()*numberOfCommodity;
	}
	public String toString() {
		return commodity+";"+numberOfCommodity+";"+CoinConverter.convert(getCost());
	}
	
	
}
