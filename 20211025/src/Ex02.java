import java.util.Scanner;

import aa.Exam;

/*
 * 인자로 십진수 정수를 전달받아서 이에 해당하는 이진수 표현을 출력하는 문제
 * 10 -> 1010
 * 8 -> 1000
 * 6 -> 0110
 * */
public class Ex02 {

	public static void main(String[] args) {
		Exam ex = new Exam();
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int inputNum = scan.nextInt();
		String result = ex.exam02(inputNum);
		System.out.println("result = "+result);
	}
}
