package day08;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("This");

		sb.append(" is pencil");
		System.out.println(sb);
		sb.insert(7, " my");			//offset -> 몇번째에 떨어져있는 숫자인지? 인식해서 7번째 문자 뒤에 " my"를 넣는다.
		System.out.println(sb);
		sb.replace(8, 10, "your");		// 다른 글씨로 대체할때
		System.out.println(sb);
		sb.delete(8, 13);				// 추가한것 지울 때
		System.out.println(sb);
		sb.setLength(4);				// 길이를 제한하여 쓸 때
		System.out.println(sb);
		
		
		// StringBuffer에는 concat을 못쓴다...
		// 문자열 데이터에 넣어야겟다면
		
		String str=sb.toString(); // sb는 그냥 객체다!
		
	}
}
