import java.util.Scanner;

import aa.Exam;

// ���� 1 ���� n�� ���޹޾Ƽ� 2�� n���� ����Ͽ� ��ȯ�ϴ� ��� �޼���
public class Ex01 {
	
	public static void main(String[] args) {
//		Exam ex= new Exam();
//		int result = ex.exam01(4);
//		System.out.println("result = "+result);
//		�� ��� = �������� �� �����°� //�ؿ� ��� = �� �޾Ƽ� �� ������ ��
		
		Exam ex = new Exam();
		Scanner scan = new  Scanner(System.in);
		while(true) {
			System.out.println("����� ���Ͻʴϱ�?");
			int inputNum = scan.nextInt();
			int result = ex.exam01(inputNum);
			if(inputNum == -1) {
				System.out.println("�����մϴ�.");
				break;	//while Ż����, if�� Ż��x
			}
			else {
				System.out.println("result = "+result);
			}
		}
	}
}
