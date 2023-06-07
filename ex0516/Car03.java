package ex0516;

public class Car03 {
	String company;	//  매개변수
	String model;
	String color;
	int maxSpeed;
	
	// 생성자의 역할: 변수 초기화의 역할을 함
	// 생성자의 모습: 클래스이름(){...}
	// 생성자 오버로딩: 매개변수의 타입, 개수, 순서가 다르게 여러개의 생성자를 생성하는 것.
	// 생성자 오버로딩 이유: 매개변수에 맞게 다양하게 초기화 하기 위함.
	// this는 선언된 구역의 맨위에 써줘야 한다.
	
	Car03(){
		
	}
	Car03(String company){
		this.company=company;
	}
	Car03(String company, String model){
		this.company=company;
		this.model=model;
	}
	Car03(String company, String model, String color){	
		this.company=company;
		this.model=model;
		this.color=color;
	}
}
