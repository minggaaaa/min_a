package aa;

public class Member{

	private String name;
	private int age;
	
//	public를 지우려면 Ex01파일을 aa패키지 안에 넣으면 가능하다
	void setName(String name) {
		this.name = name;
	}
//	alt + shift +s ->r
	void setAge(int age) {
		this.age = age;
	}
	
	
	public void print() {
		System.out.println("MmeberClass");
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}
	
	
}
