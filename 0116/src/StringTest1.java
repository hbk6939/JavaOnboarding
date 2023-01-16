
public class StringTest1 {
	public static void main(String[] args) {
		String str1 = "string"; // 파이썬 처럼 작동 (Perm 영역 내 string constant pool에 저장)
		String str2 = "string";
		String str3 = new String("string"); // heap에 저장
		String str4 = new String("string"); // heap에 저장

		System.out.println(str1 == str2); // true
		System.out.println(str2 == str3); // false
		System.out.println(str1 == str3); // false

		System.out.println(str3 == str4); // false
		
		System.out.println(str3.equals(str4)); //true 
	}
}
