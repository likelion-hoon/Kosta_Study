package kosta.day2.OOPBasicSyntax.step2;

// Test class�� ���� �̿� �����Ǵ� Ŭ������ �޼��带 ���� �غ��� ���� 
public class TestCar {

	public static void main(String[] args) {
		Car c = new Car();  
		c.go(); // �ڵ����� ���� 
		c.run("�ҳ�Ÿ",100); 
		// �ҳ�Ÿ�� 100km�� �޸��� �� ��µȴ� 
		
		System.out.println(c.getInfo());
		// ��: �ҳ�Ÿ, ����: ���� 
	}
}