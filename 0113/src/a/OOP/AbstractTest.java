package a.OOP;

public class AbstractTest {
	static Shape[] ss = new Shape[5];
	static int count = 0;

	public static void main(String[] args) {

		ss[count++] = new Circle("빨강", 1, 2, 3);
		ss[count++] = new Circle("파랑", 2, -1, 5);
		
		for (int i = 0; i < count; i++) {
			ss[i].draw();
		}
	}
}

abstract class Shape {
	String color;

	Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	abstract void draw();
}

class Circle extends Shape {
	int x, y, r;

	public Circle(String color) {
		super(color);
	}

	public Circle(String color, int x, int y, int r) {
		super(color);
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	void draw() {
//		System.out.println("[원:색-" + getColor() + "중심점-(" + x + y + "), 반지름-" + r + "]");
		System.out.printf("[원:색-%s, 중심점-(%d, %d), 반지름-%d]\n", getColor(), x, y, r);
	}

}
