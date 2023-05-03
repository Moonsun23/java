package quiz;

public class WonToEuro extends Converter {

	public WonToEuro(double ratio) {
		this.ratio=ratio;
	}
	@Override
	public double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	public String srcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	public String destString() {
		// TODO Auto-generated method stub
		return "유로";
	}
	
}
