package shiyan2;

public class bornTester {
	public static void main(String[] args) {
		Born born=new Born();
		//测试加法算式的生成
		System.out.println("test1:add");
		born.getAdd();
		born.printResult();
		//测试减法算式的生成
		System.out.println("test1:sub");
		born.getSub();
		born.printResult();
		//测试随机算式的生成
		System.out.println("test1:ran");
		born.getRan();
		born.printResult();
	}
}
