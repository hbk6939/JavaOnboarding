package innerClass;

class Button {
	void onClic() {
		System.out.println("버튼이 꾹 눌림");
	}
}

class LoginButton extends Button {
	@Override
	void onClic() {
		super.onClic();
		System.out.println("로그인 처리");
	}
}

public class AnonyClassTest2 { // 익명클래스
	public static void main(String[] args) {
		Button lb = new Button() {
			@Override
			void onClic() {
				super.onClic();
				System.out.println("로그인 처리\n");
			}
		};
		lb.onClic();

		Button jb = new Button() {
			@Override
			void onClic() {
				super.onClic();
				System.out.println("회원가입 처리\n");
			}
		};
		jb.onClic();

	}
}
