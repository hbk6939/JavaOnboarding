package e.OOP;

class Person {
	int age; // 인스턴스 변수
	String name;
	double height;
	
	String info() {
//		return "이름 : " + name + ", 나이 : " + age + ", 키 : " + height;
		return String.format("이름 : %s, 나이 : %d, 키 : %-5.1f", name, age, height);
	}
}


public class ClassTest1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.age = 20;
		p.name = "홍길동";
		p.height = 175.3;
		System.out.println(p.info());
		
//		Person p2 = p; // 같은 주소를 참조
//		p2.age = 30;
//		
//		System.out.println(p.info());
//		System.out.println(p2.info());
		
		
	}

}
