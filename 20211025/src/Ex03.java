import aa.Triangle;

/*
 * Ex01, Ex02 -> Exam
 * Ex03 -> Triangle
 * 
 * �غ��� ���� ������ �����ϰ�
 * �غ��� ���̸� �����ϴ� �޼���
 * �ﰢ�� ���̸� ���ϴ� �޼���
 * */
public class Ex03 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(5,3);
		double result = t1.traArea();
		System.out.println("���� = "+result);
	}
}
