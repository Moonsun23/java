package day05;

import java.util.Scanner;

// 대부분의 프로그래밍 언어들의 변수 scope는 block 안에서 유효하다.
// 특정언어들은 function scope를 가지기도 한다.
// main 메소드 바깥에 쓰는 변수 = 전역변수(해당 클래스 아무데서나 쓸 수 있는 변수..)

public class ScoreArray {	// Test02 숙제 풀이
	int num=100;
	public static void main(String[] args) {
		String course[]= {"java", "html", "javascript", "spring", "oracle"}; //선언과 동시에 데이터를 바로 집어넣을수있다 {} 사용
		int score[]= {90, 95, 88, 92, 78};
		
		Scanner scanner= new Scanner(System.in);				// jdk설치 후에 가져올 수 있는 기능
		while(true) {								// 100>1 이렇게 쓰기엔 항상 true니까 그냥 true를 써준다.
			System.out.println("과목이름을 입력해주세요. 점수를 알려드립니다.");
			String courseName=scanner.next();
			if(courseName.equals("exit")) break; // String 을 비교할땐 equals를 쓴다...
		// 여기서부터는 과목입력하면 점수 알려주는 부분... equals.. -> String 쓸때 하는거 복습
			int i=0;								// 포문에 들어간..
			for(i=0; i<score.length; i++) {
				if(course[i].equals(courseName)) {
					System.out.println(courseName+"의 점수는 "+score[i]+"입니다.");
					break;
				}
			}
			// 여기다가 없는 과목 처리
			//System.out.println(i); // 이대로 출력하는 경우 '리스트에 없는 과목'을 치면 계속 5가 나온다.
			if(i==score.length) System.out.println("없는 과목입니다. 다시 입력해주세요.");
		}
		System.out.println("끝났음");	
		// 이 출력문을 써서 exit 입력하면 끝났음이 출력된다.
		
	}
	public void test() {
		System.out.println(num);
	}
}
