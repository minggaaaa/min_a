package aa;

public class Car {
	//Ŭ���� ����,�Ӽ�,property
	private String name;
	private double height;
	private double in_area;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getIn_area() {
		return in_area;
	}

	public void setIn_area(double in_area) {
		if (in_area<0) return;
		this.in_area = in_area;
	}

	public Car() {
		System.out.println("�⺻������");
	}
	
	public void doPrint() {
		System.out.println("�̸� = "+name);
		System.out.println("Ű = "+height);
		System.out.println("�������� = "+in_area);
	}
}