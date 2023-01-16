import java.util.StringTokenizer;

public class StringTest1 {
	public static void main(String[] args) {
		// String str1 = "string"; // 파이썬 처럼 작동 (Perm 영역 내 string constant pool에
		// // 저장)
		// String str2 = "string";
		// String str3 = new String("string"); // heap에 저장
		// String str4 = new String("string"); // heap에 저장
		//
		// System.out.println(str1 == str2); // true
		// System.out.println(str2 == str3); // false
		// System.out.println(str1 == str3); // false
		//
		// System.out.println(str3 == str4); // false
		//
		// System.out.println(str3.equals(str4)); // true
		//
		// System.out.println(str1.charAt(str1.length() - 1));
		// String rstr = str1.replace("i", "o"); // 원본을 바꿔서 새로운 문자열 return
		// System.out.println(rstr);

		String animals = "monkey, -dog, -cat";
		String[] animalsArr = animals.split(",");
		for (String ani : animalsArr) {
			System.out.println(ani.trim());
		}

		// StringTokenizer로 다중 구분자
		StringTokenizer stk = new StringTokenizer(animals, " -,"); // StringTokenizer(변수, "다중 구분자")
		while (stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}

	}
}
