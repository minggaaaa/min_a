import aa.Exam;

class A{}
class B{}

//import 작성
//full 패키지 작성 

//ctrl + shift + o 단축기 import 정리 단축키

public class Ex04 {
	
//	java - (컴파일) -> class - (압축) -> jar파일(=class 파일의 묶음)
	public static void main(String[] args) {
//		aa.Exam ex01 = new aa.Exam(); //import 적기 싫을 때 이렇게 쓰면 됨
//		이 방법이 풀패키지 작성 방법
		
		Exam ex01 = new Exam();
//		aa에도 Exam,bb에도 Exam있기 때문에 import로 확실히 명시해야함
	}

}
