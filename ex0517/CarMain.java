package ex0517;

public class CarMain {
	public static void main(String[] args) {
		//객체 사용 위해 생성
		Car c= new Car();
		
		c.setGas(5);
		
		if(c.isGas()) {	// 가스가 있다면  true
			System.out.println("출발");
			
			c.run();
		}
		System.out.println("가스를 넣어주세요");
		
	}
}
