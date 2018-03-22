package by.gsu.omglab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word {
private String word;


public Word() {
	super();
}


public Word(String word) {
	super();
	word = word.replaceAll(",", "");
	word = word.replaceAll("\\.", "");
	this.word = word.toLowerCase();
}



public String getWord() {
	return word;
}


public void setWord(String word) {
	this.word = word;
}

public int getLength() {
	return word.length();
}

public double getPercent() {
	int num = 0;
	int length = word.length();
	if(length==0||this==null) {
		return 0;
	}
	Pattern gl = Pattern.compile("([σεϋΰξύÿθώ])");
	Matcher mather = gl.matcher(word);
	while(mather.find()) {
		num++;
	}
	return (double)num/length*100;
	
}
@Override
public String toString() {
	return word;
}


}
