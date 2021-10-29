package aa;
//ctrl + 1 (member m1~ 커서 두고) import aa~ 생김

/*
 * 변수랑 메서드
 * public protected default private
 * 
 * class public default
 */
public class Ex01 {
	
	public static void main(String[] args) {
		Member m1 = new Member();
//		m1.name = "asdf"; (오류나는 것)
		m1.setName("홍길동");
		m1.setAge(10);
		m1.print();
		
		Member m2 = new Member();
		m2.setName("김길동");
		m2.setAge(20);
		m2.print();
		
		Member m3 = new Member();
		m3.setName("이길동");
		m3.setAge(30);
		m3.print();
	}

}
