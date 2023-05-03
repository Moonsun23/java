package abs;

public class CalculatorTest {
	public static void main(String[] args) {
		SamsungCalculator samsung=new SamsungCalculator();
		LgCalculator lg= new LgCalculator();
		int nums[]= {98,88,75};
		
		
		System.out.println(samsung.add(10, 23));
		System.out.println(lg.add(10,23));
		System.out.println(samsung.average(nums));
		System.out.println(lg.average(nums));
	}
}
