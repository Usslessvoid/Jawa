package by.gsu.omglab;

public class CalculatorThread extends Thread {
	private int a = 0;
	private int result = 0;
	
	public CalculatorThread() {
		super();
	}

	public CalculatorThread(int a, int result) {
		super();
		this.a = a;
		this.result = result;
	}
	
	public CalculatorThread(int a) {
		super();
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public void run() {
		int result = 1;
		for(int i = 1;i <= a;i++) {
			if(i%4 == 0) {
				result *= i;
			}
		}
		this.result = result;
	}

}
