package ex0516;

public class CarMain {
	public static void main(String[] args) {
		Car myCar=new Car();
		// myCar에 객체의 주소를 리턴한다.
		// 객체를 생성하면 기본생성자가 자동으로 만들어진다.
		// new는 연산자.. 그 옆이 생성자
		// new는 객체 생성 후 생성자의 (); 부분을 실행한다(생성자 호출)
		// 기본생성자는 만들지 않으면 컴파일 단계에서 생성된다.
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.maxSpeed);
		System.out.println("변경전"+myCar.speed);
		
		// 변수의 값 변경
		myCar.speed=60;
		System.out.println("변경후"+ myCar.speed);
	}
}
