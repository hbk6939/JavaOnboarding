interface IMovable {
	// 인터페이스의 추상메서드는 public -> 상속 했을 때 public 필수
	void move(int x, int y);
}
interface IFiterble extends IMovable {

}
class Fitter implements IMovable {
	
	@Override
	public void move(int x, int y) {

	}
}

public class InterfaceTest {

	public static void main(String[] args) {

	}

}
