package collections;
import java.util.HashMap;

public class MapTest1 {

	public static void main(String[] args) {

		HashMap<Integer, Stucent> studs = new HashMap<>();
		studs.put(100, new Stucent(20, "홍길동", 100, "산업공학"));
		studs.put(101, new Stucent(21, "김길동", 101, "컴퓨터공학"));
		studs.put(102, new Stucent(22, "하길동", 102, "기계공학"));

		System.out.println(studs.get(100));

		for (Integer key : studs.keySet()) {
			System.out.println(key);
		}

	}

}