package shiyan2;

public class EquationTester {
	public static void main(String[] args) {
		Equation e =new Equation();
		//���Լӷ���ʽ������
		System.out.println("test1:addOpration");
		for (int i = 0; i < 10; i++) {
			e.addOpration();
			System.out.println(e);	
		}
		//���Լ�����ʽ������
		System.out.println("test1:subOpration");
		for (int i = 0; i < 10; i++) {
			e.subOpration();
			System.out.println(e);	
		}
	}
} 