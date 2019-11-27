package shiyan2;

public class EquationTester {
	public static void main(String[] args) {
		Equation e =new Equation();
		//测试加法算式的生成
		System.out.println("test1:addOpration");
		for (int i = 0; i < 10; i++) {
			e.addOpration();
			System.out.println(e);	
		}
		//测试减法算式的生成
		System.out.println("test1:subOpration");
		for (int i = 0; i < 10; i++) {
			e.subOpration();
			System.out.println(e);	
		}
	}
} 