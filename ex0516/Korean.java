package ex0516;

public class Korean {
	// 변수선언
	String nation="대한민국";
	
	//객체마다 다르기 때문에 생성자로 초기화를 해준다.
	String name;		// 이름
	int num;			// 생년월일
	
	Korean(String name,int num){	
		this.name= name;
		this.num= num;
	}
}
