package ex0518;

public class Member {
	final String ID= "java";	// 명시적 초기화
	String pw="1234";
	
	Member(String pw){ // 나중에 다시...........................................
		this.pw=pw;
	}
}
