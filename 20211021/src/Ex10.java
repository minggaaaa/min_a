class B{
	public void doABS(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		if(a > b) {
			System.out.println("차의 절대값 = "+(a-b));
		}else {
			System.out.println("차의 절대값 = "+(a-b));
		}
	}
}
public class Ex10 {
	public static void main(String[] args) {
		
		B b = new B();
		b.doABS(3, 4);
	}
}
