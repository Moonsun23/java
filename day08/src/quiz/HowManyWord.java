package quiz;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HowManyWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String str=scanner.nextLine();
			
			if(str.equals("exit")) {									// 만약에 
			System.out.println("종료합니다.");
			break;
			}
			// 개수 세기...
			// 여기다가 출력(단어 개수)
			StringTokenizer st=new StringTokenizer(str, " ");
			System.out.println("단어의 개수는 "+st.countTokens());
		}
	}
}
