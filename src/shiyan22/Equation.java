package shiyan22;

import java.util.Random;

public abstract class Equation {// ËãÊ½¸¸Àà
	public Random random = new Random();
	public int ldate;
	public int rdate;
	public char op;
	public int value;

	// ·µ»ØËãÊ½×Ö·û´®
	public String toStringResult() {
		return "" + ldate + op + rdate + "=" + value;
	}
}

 