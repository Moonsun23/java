package quiz;

public class ColorTVTest {
	public static void main(String[] args) {
		ColorTV colorTv= new ColorTV(66, 2480);
		colorTv.showInfo();
		
		// Iptv quiz-->>>>>>>
		Iptv iptv=new Iptv("192.168.0.8", 66, 3840);
		iptv.showInfo();
	
	}

}
