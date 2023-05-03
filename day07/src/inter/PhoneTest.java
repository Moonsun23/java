package inter;

public class PhoneTest {
	public static void main(String[] args) {
		Galaxy galaxy22= new Galaxy();
		galaxy22.sendCall();
		galaxy22.receiveCall();
		galaxy22.samsungPay();
		galaxy22.sendSMS();
		
		Iphone iphone10=new Iphone();
		iphone10.sendCall();
		iphone10.receiveCall();
		iphone10.applePay();
		
		PhoneInterface myPhone=new Iphone();
		// 같은 부모클래스에서 내려왔으므로 앞에 폰인터페이스 라고 써도 ㅇㅋ(업캐스팅) - 하지만 이 경우 삼성페이/ 애플페이는 못쓴다.
		
		
	}
	
}
