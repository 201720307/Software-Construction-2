package shiyan2;

import java.util.Random;

public class Equation {//算式类，产生算式
	
	private Random random=new Random();
	private int ldate;
	private int rdate;
	private char   op;
	private int value;
	
	//随机
	public void ranOpration() {
		int a = random.nextInt(2);
		if (a == 0) {
			addOpration();
		}	
		else {
			subOpration();
		}
	}
	
	//加法
	public void addOpration() {
		do {
			ldate = random.nextInt(101);
			rdate = random.nextInt(101);
			op	  = '+';
			value = ldate+rdate;
		} while (value>100);
	}
	
	//减法
	public void subOpration() {
		do {
			ldate = random.nextInt(101);
			rdate = random.nextInt(101);
			op	  = '-';
			value = ldate-rdate;
		} while (value<0);
	}
	 
	//字符串格式返回算式
	public String toString() {
		return "" + ldate + op + rdate + "=" + value;
	}

}
