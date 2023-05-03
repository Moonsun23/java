package quiz;

public class Iptv extends ColorTV {
// IPTV는
	// ColorTv를 상속받아서
	// String ip를 속성으로 가진다.
	// 생성자 함수에  new IPTV("192.168.0.8", 66, 3840)
	
	private String ip;
	public Iptv(String ip, int size, int color) {
		super(size, color);
		this.ip=ip;
		
	}
	public void showInfo() {
		System.out.println("IP 주소는 "+ip);
		super.showInfo();
		
	}
	
	
//	public Iptv(String ip) {
//		super();
//		this.ip=ip;
//		
//	}
}
