/*����1
�������� ¦�� ��� 2,4,6,8�ܸ� ����ϴ� ���α׷��� �ۼ��ϵ�
2*2����, 4���� 4*4���� 6���� 6*6���� 8���� 8*8����

����2
���� ���� �����ϴ� ��� A B�� ������
AB
+BA
99

A + B = 9
A = 1B = 1~8
A = 2B = 1~8
A = 3B = 1~8
...
A = 18B = 1~8
*/
public class Ex03 {
	public static void main(String[] args) {
		int A = 1;
		// A=A+1, A+=1, A++
		for ( ; A < 9; A = A + 1) {
			System.out.println("A = " + A);
			for (int B = 1; B < 9; B = B + 1) {
				System.out.println("B = " + B);
				if((A+B) == 9)
				System.out.println("A = " + A + " B = " + B);
			}
		}
		
	}

}
