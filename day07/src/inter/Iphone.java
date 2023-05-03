package inter;

public class Iphone implements MobilePhoneInterface {

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("아이폰 신호음이 울립니다.");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 왔어요...");
	}
	public void applePay() {
		System.out.println("애플페이 결제가 가능합니다.");
	}


	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	
	public void receiveSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
