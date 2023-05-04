package day08;

public class WrapperTest {
	public static void main(String[] args) {
		char ch= Character.toLowerCase('A');
		System.out.println(ch);
		char ch01='a';
		char ch02='4';
		System.out.println(Character.isDigit(ch01));
		System.out.println(Character.isDigit(ch02));		// 숫자인지 문자인지 따져보는 과정
		
		System.out.println(Character.isAlphabetic(ch01));
		System.out.println(Character.isAlphabetic(ch02));	// 문자인지 숫자인지 따져보는 과정
		
		int age= Integer.parseInt("20"); 	// 문자로 넘어온 것을 숫자로 바꿀 수 있다.
		if(age>20) {
			System.out.println("술집 출입 가능");
		}else {
			System.out.println("술집 출입 안됨");
		}
		
		int num=20;
		Integer objNum=num;
		int unboxingNum=objNum+10;
		System.out.println(unboxingNum);		// 자동으로 형변환 가능
		String str= Integer.toString(unboxingNum);			// 문자로 형변환
		System.out.println(str=="30");			// 그냥 30은 적을 수 없다. 문자기 때문에.
		System.out.println(str.equals("30"));	// 위와 같은 내용...?
	}
}
