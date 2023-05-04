package quiz;

public class RotateText {	// 4번 퀴즈 선생님 답
	public static void main(String[] args) {
		String str="오늘 지나면 3일 연휴입니다. 신난다.";
		int total=str.length();
		for(int i=0; i<total; i++) {
			String first=str.substring(0);
			String rest=str.substring(1);
			
			str=rest+first;
			System.out.println(str);
		}
	}
}
