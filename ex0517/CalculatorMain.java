package ex0517;

public class CalculatorMain {
	public static void main(String[] args) {
		//객체를 생성해보자!
		Calculator c= new Calculator();
		
		// 메서드 호출 = 사용해보자!
		c.powerOn(); //->  이 자체로 호출임(powerOn 이 메서드)
		// c라는 참조변수가 .(=가지고 있는) powerOn()이라는 메서드를 호출한다.
		// 결과: 전원을 켭니다.
		
		int result =c.plus(5, 6);
		System.out.println(result);
		
		byte x = 10;
		byte y= 4;
		double result2= c.divice(x, y);
		System.out.println(result2);
		
		c.powerOff();
		
		
	}
}
