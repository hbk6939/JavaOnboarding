package innerClass;

interface IClick {
	void click();
}

class MyButton {
	IClick iclick;

	void onClic() {
		System.out.println("꾹 누림");
		if (iclick != null) {
			iclick.click();
		}
	}

	void addClickListner(IClick iclick) {
		this.iclick = iclick;
	}

}

public class AnonyClassTest3 { // 익명클래스
	public static void main(String[] args) {
		MyButton loginBtn = new MyButton();
		loginBtn.addClickListner(new IClick() {

			@Override
			public void click() {
				System.out.println("로그인 처리");
			}
		});
		loginBtn.onClic();

	}
}
