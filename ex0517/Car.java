package ex0517;

public class Car {
	// 변수 선언
	int gas;
	
	
	// 리턴값이 없는 메서드로 매개값을 전달 받아 변수값을 변경
	void setGas(int gas) {
		this.gas= gas;
	}
	
	boolean isGas() {
		if(gas == 0) {
			System.out.println("가스가 없습니다.");
			gas -= 1;  // 대입연산자 gas=gas-1
			return false;
		}
		System.out.println("가스가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if( gas> 0) {
				System.out.println("자동차가 달립니다 "+"gas량: "+gas);
				gas -= 1;
			}else {
				System.out.println("자동차가 멈춥니다 "+"gas량: "+gas);
				return;	// 메서드 종료! 밑의 다른 코드들 실행 안함.
			}
		}
	}
}
