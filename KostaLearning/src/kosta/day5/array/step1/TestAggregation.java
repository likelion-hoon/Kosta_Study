package kosta.day5.array.step1;


public class TestAggregation {

	public static void main(String[] args) {
		Student s = new Student("������", new Book("������ ����", "���ù�")); 
		System.out.println(s.getName()); // ������
		System.out.println(s.getBook()); // Book ��ü �ּҰ� ��� 
		System.out.println(s.getBook().getTitle()); // ������ ����
		System.out.println(s.getBook().getWriter()); // ���ù�
	}
}