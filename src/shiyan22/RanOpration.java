package shiyan22;

public class RanOpration extends Equation {
	Equation RanEq;

	public RanOpration() {// Ëæ»úËãÊ½
		int a = random.nextInt(2);
		if (a == 0) {
			RanEq = new AddOpration();
		} else {
			RanEq = new SubOpration();
		}
	}
}
 