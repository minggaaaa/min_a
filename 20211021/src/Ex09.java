class A{
	public void doCalc(int a,int b) {
		System.out.println("���ϱ� = "+(a+b));
		System.out.println("���� = "+(a-b));
		System.out.println("���ϱ� = "+(a*b));
		System.out.println("�� = "+(a/b)+" ������ = "+(a%b));
		
	}
}

public class Ex09 {
	public static void main(String[] args) {
		A a = new A();
		a.doCalc(3,4);
		
		
	}
}
