package aa;

public class Member{

	private String name;
	private int age;
	
//	public�� ������� Ex01������ aa��Ű�� �ȿ� ������ �����ϴ�
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
