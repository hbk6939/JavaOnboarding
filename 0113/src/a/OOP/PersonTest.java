package a.OOP;

import c.pac.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(10);
		p.setName("김철수");

		System.out.println(p.toString());
	}
}
