class A{
	public void take() { 
		System.out.println("A 약 복용");
		}
}
class B{
	public void take() { 
		System.out.println("B 약 복용");
		}
}
class C{
	public void take() { 
		System.out.println("C 약 복용");
		}
}
public class ABC {
	public void takeA(A a) {
		a.take();
	}
	public void takeB(B b) {
			b.take();
	}
	public void takeC(C c) {
				c.take();
	}
	public void seqtakeABC(A a, B b, C c) {
		a.take();
		b.take();
		c.take();
	}
}
