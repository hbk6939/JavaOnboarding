package a.OOP;

class TempClass
{
	int value; // 인스턴스 변수
	static int svalue; // 이미 생성된 변수 사이에 공유해라!

	void func()
	{
		value = 10;
		svalue = 20;
		sfunc();
	}

	void func2()
	{
		func();
	}

	static void sfunc()
	{
//		value1=1; // static method는 instance 변수 접근 불가능
//		func(); // static method는 instance 메서드 호출 불가능
		svalue = 2;
		sfunc();
	}

}

public class StaticTest
{

	public static void main(String[] args)
	{
		// 클래스(정적) 변수는 클래스를 인스턴스화 안해도 클래스명으로 사용 가능
		// 정적 변수는 이미 클래스를 불러올 때 메소드 영역(코드+데이터 영역)에서 메모리에 올라와 있음
		TempClass.svalue = 100;
		System.out.println("TempClass.svalue : " + TempClass.svalue);

		// 인스턴스 변수는 클래스를 메모리에 올려 인스턴스화 이후
		// 래퍼런스 변수를 통해서만 접근 가능
		TempClass tc = new TempClass();
		tc.value = 200;
		System.out.println("tc.value : " + tc.value);
		System.out.println("tc.svalue : " + tc.svalue);
	}
}
