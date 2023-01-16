
import java.util.ArrayList;
import java.util.Iterator;

public class ListTest1 {
	public static void main(String[] args) {
		// ArrayList<String> list = new ArrayList<String>();
		ArrayList list = new ArrayList();

		list.add("hong");
		list.add("park");
		list.add("song");
		list.add(0, "Lee");
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println();

		ArrayList list2 = new ArrayList();
		list2.add(100);
		list2.add(200);

		ArrayList list3 = new ArrayList();
		list3.add(new Person(20, "홍길동"));
		list3.add(new Person(30, "고길동"));
		list3.add(new Person(40, "하길동"));

		ArrayList<Person> list4 = new ArrayList<>();
		list4.add(new Person(20, "홍길동"));
		list4.add(new Person(30, "고길동"));
		list4.add(new Person(40, "하길동"));

		for (Person person : list4) {
			System.out.println(person.info());
		}
		System.out.println();

		Iterator<Person> it = list4.iterator();
		if (it.hasNext()) {
			System.out.println(it.next().info());
		}

	}

}
