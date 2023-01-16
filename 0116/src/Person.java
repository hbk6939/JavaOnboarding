class Person {
	int age;
	String name;

	public Person() {
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String info() {
		return "이름 : " + name + ", 나이 : " + age;
	}

	@Override
	public String toString() {
		return "나이 : " + age + ", 이름" + name;
	}

}