package ex0516;

public class Car02Main {
	public static void main(String[] args) {
	//	Car02 c= new Car02();
		// 이미 Car02에 2개의 매개변수를 선언해서 new Car02();에 빨간줄이 뜸
		
		Car02 c= new Car02("검정", 3000);
		// 매개변수가 있는 생성자가 있기 때문에 기본생성자 사용 못함.
		// 매개변수의 타입과 순서를 지켜줘야 한다.
	}
}
