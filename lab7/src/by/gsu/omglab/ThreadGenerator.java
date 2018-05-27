package by.gsu.omglab;

import java.util.Scanner;

public class ThreadGenerator {
	private int numOfThreads = 1;
	private Action action;
	private int parametr;
	private int result;
	private enum Action{
		ADD{
			@Override
			int calculate(int a,int b) {
				return a + b;
			}
			@Override
			int getStart() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		},
		SUB{
			@Override
			int calculate(int a,int b) {
				return a - b;
			}
			@Override
			int getStart() {
				return 0;
			}
			
		},
		MUL{
			
			@Override
			int calculate(int a,int b) {
				return a*b;
			}

			@Override
			int getStart() {
				return 1;
			}
			
		};
	    abstract int getStart();
		abstract int calculate(int a,int b);
		public int decide(int a[]) {
			int result = getStart();
			for(int t:a) {
				result = calculate(result, t);
			}
			return result;
		}
	};

	public ThreadGenerator(int numOfThreads, int parametr) {
		super();
		this.numOfThreads = numOfThreads;
		this.parametr = parametr;
	}
	public ThreadGenerator() {
		super();
	}
	public int getNumOfThreads() {
		return numOfThreads;
	}
	public void setNumOfThreads(int numOfThreads) {
		this.numOfThreads = numOfThreads;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public int getParametr() {
		return parametr;
	}
	public void setParametr(int parametr) {
		this.parametr = parametr;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public static Action menu(Scanner sc) {
		System.out.printf("Choose action: \n1)Add\n2)Sub\n3)Multiple");
		switch (sc.nextInt()) {
		case 1:
			return Action.ADD;
		case 2:
			return Action.SUB;
		case 3:
			return Action.MUL;
		}
		return Action.ADD;
	}		
	public void execute() {
		CalculatorThread threads[] = new CalculatorThread[numOfThreads];
		for(int i = 0;i<numOfThreads;i++) {
			threads[i] = new CalculatorThread(parametr);
		}
		for(CalculatorThread t: threads) {
			t.start();
		}
		int i =0;
		int numbers[] = new int[numOfThreads];
		try {
			for(CalculatorThread t: threads) {		
				t.join();
				numbers[i] = t.getResult();
				i++;
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		result = action.decide(numbers);
	}
	
}
