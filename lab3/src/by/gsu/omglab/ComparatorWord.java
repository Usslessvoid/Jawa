package by.gsu.omglab;

public class ComparatorWord implements java.util.Comparator<Word>{
	
	public ComparatorWord() {
		super();
	}

	@Override
	public int compare(Word arg0, Word arg1) {
		return (int)(arg0.getPercent()-arg1.getPercent());
	}

}
