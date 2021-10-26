class A{
	public void doCalc(int a,int b) {
		System.out.println("´õÇÏ±â = "+(a+b));
		System.out.println("»©±â = "+(a-b));
		System.out.println("°öÇÏ±â = "+(a*b));
		System.out.println("¸ò = "+(a/b)+" ³ª¸ÓÁö = "+(a%b));
		
	}
}

public class Ex09 {
	public static void main(String[] args) {
		A a = new A();
		a.doCalc(3,4);
		
		
	}
}
