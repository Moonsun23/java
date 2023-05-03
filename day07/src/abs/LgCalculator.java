package abs;

public class LgCalculator extends Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] nums) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int num: nums) {				// 반복문의 개수를 모를때
			sum+=num;
		}
		return sum/nums.length;
	}

}
