package practice.day1;

public class RemoveSpecialCharacterInGIvenString {

	public static void main(String[] args) {

		String s = "kai&las@!$dandale";

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}
}
