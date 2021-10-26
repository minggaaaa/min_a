/*문제1
구구단의 짝수 답안 2,4,6,8단만 출력하는 프로그램을 작성하되
2*2까지, 4단은 4*4까지 6단은 6*6까지 8단은 8*8까지

문제2
다음 식을 만족하는 모든 A B를 구하자
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
