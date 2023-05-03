package inter;

public class Galaxy implements MobilePhoneInterface, Mp3Interface {			// 설계도의 내용을 구현하는 것.

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("띵띠링띠 띵띠링띠디");
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화왔어요...");
	}
	
	// 위 공통된것만 인터페이스로 구현하고 아래 나머지는 알아서 해라...
	
	public void samsungPay() {
		System.out.println("삼성페이 결제할 수 있음");
	}
/////// MobilePhoneInterface 에서 다시 생성된 내용들(아래)
	
	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("sms 보낼 수 있음");
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("sms 받을 수 있음");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("music stop");
	}

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("music start");
	}

}
