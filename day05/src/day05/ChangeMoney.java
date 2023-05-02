package day05;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		//
		// 50000, 10000, 5000, 1000, 500, 100, 50, 10
		System.out.println("얼마를 바꿀건가요? 금액을 입력하시고 엔터 치세요.");
		Scanner scanner= new Scanner(System.in);	//스캐너의 타입은 스캐너다
	// 스캐너 타입은 자바에 없기 때문에 어디서 가져와야함.(Ctrl + Space로 java.util에서 받아오기)
		
	    int money= scanner.nextInt();	// nextInt: 정수를 입력하겠다.
	    // scanner에 정수를 입력하겠다.
	    /// 위 결과: 콘솔 창에 얼마를 바꿀건가요? 가 나오고 아래 숫자를 쓰면 얼마로 바꿔지는지 나옴
	    
	    
//		int money= 1809880;
		
		// 나누기 연산과 나머지 연산
		System.out.println("오만원==="+money/50000+"장");
		money=money%50000;
		System.out.println("만원==="+money/10000+"장");
		money=money%10000;
		System.out.println("오천원==="+money/5000+"장");
		money=money%5000;
		System.out.println("천원==="+money/1000+"장");
		money=money%1000;
		System.out.println("오백원==="+money/500+"장");
		money=money%500;
		System.out.println("백원==="+money/100+"장");
		money=money%100;
		System.out.println("오십원==="+money/50+"장");
		money=money%50;
		System.out.println("십원==="+money/10+"장");
		money=money%10;
		
		scanner.close();
		//--->> 닫아주면 가비지컬렉션의 수집 대상이 될 수 있음. close 해주는 것이 좋음
		
		
//		내가 쓴 답변 // --> 
//		int moneys[]= {50000, 10000, 5000, 1000, 500, 100, 50, 10};
//		+ int howmuch=343434343; 라고 추가해줘야 함 
//		for(int a=0; a<moneys.length; a++) {
//		여기부터는 아예 틀림	 if(moneys[a]%50000==0) { // 
//				 System.out.print(moneys[a]);
//			 }
//			 System.out.println("오만원"+ a +"장");
		  
//			오만원 30장
//			만원 4장
//			오천원 1장
//			천원 4장
//			오백원 1장
//			백원 4장
//			오십원 1장
//			십원 3장
			
	}
}
