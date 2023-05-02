package day06;

public class BookTest {
	public static void main(String[] args) {
//		Book littlePrince = new Book();
//		System.out.println(littlePrince.author);
//		System.out.println(littlePrince.title);  
		// ->>> 이 상태로는 아무것도 안뜸
		
		Book littlePrince = new Book("어린왕자", "생떽쥐베리");
//		System.out.println(littlePrince.author);
//		System.out.println(littlePrince.title);  
		littlePrince.showInfo();
		
		Book java=new Book("java 코딩");
//		System.out.println(java.author);
//		System.out.println(java.title);
		java.showInfo();
	
		
		Book untitle=new Book();
		untitle.showInfo();
		
		Book myBook= littlePrince;
		littlePrince.author="san theckjjiberry";
		myBook.author="장성호";	// 결과는 장성호로 나올지라도 바뀐 내용을 참조만 한다...?
		
		System.out.println(littlePrince.author);	// 이 경우 위에 새로 지정된 san theckjjiberry가 뜬다.
		System.out.println(myBook.author);
		
		// 기본 타입이 아닌 변수들은 참조를 한다. 복사하지 않는다.
		
		int arr01[]= {1,2,3};
		int arr02[]= arr01;			//복사가 되는게 아니다.
		arr02[1]=200;				
		System.out.println(arr01[1]);	// 결론은 200이 나오지만.. 여전히 arr01[]의 값은 {1,2,3}
		
		
	}
}
