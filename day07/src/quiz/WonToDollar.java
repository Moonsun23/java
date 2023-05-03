package quiz;

public class WonToDollar extends Converter{

	//생성자 만드는게 첫번째..
	public WonToDollar(double ratio) {
		this.ratio=ratio;
	}
	
	
	@Override
	public double convert(double src) {
		return src/ratio;
	}

	@Override
	public String srcString() {
		return "원";
	}

	@Override
	public String destString() {
		return "달러";
	}

}
