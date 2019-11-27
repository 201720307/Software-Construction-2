package shiyan22;

public class SubOpration extends Equation {
	public SubOpration() {//ºı∑®À„ Ω
		do {
			ldate = random.nextInt(101);
			rdate = random.nextInt(101);
			op = '-';
			value = ldate - rdate;
		} while (value < 0);// ∑∂Œß‘º ¯
	}
}
 