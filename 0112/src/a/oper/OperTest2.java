package a.oper;


public class OperTest2 {

	public static void main(String[] args) {
		int a=10, b=5;
		// and 연산은 False만나면 뒤에 실행 x
		// or 연산은 True만나면 뒤에 실행 x
		if (a>b || ++b==6) { 
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		System.out.println(a);
		System.out.println(b);
	}

}
