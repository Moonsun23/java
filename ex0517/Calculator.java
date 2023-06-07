package ex0517;

public class Calculator {
	// 메서드 선언
	
	//  return값이 없는 메서드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	 void powerOff() {
		 System.out.println("전원을 끕니다.");
	 }
	 
	 // return값이 있는 메서드 선언
	 int plus(int x, int y) {
		 int result = x+y;
		 return result; //int타입의 결과를 달라.
	 }
	 
	 double divice(double x, double y) {
		 double result= (double)(x/y); 
		 return result;
	 }
}
