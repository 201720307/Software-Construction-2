package shiyan2;

public class bornTester {
	public static void main(String[] args) {
		Born born=new Born();
		//���Լӷ���ʽ������
		System.out.println("test1:add");
		born.getAdd();
		born.printResult();
		//���Լ�����ʽ������
		System.out.println("test1:sub");
		born.getSub();
		born.printResult();
		//���������ʽ������
		System.out.println("test1:ran");
		born.getRan();
		born.printResult();
	}
}
