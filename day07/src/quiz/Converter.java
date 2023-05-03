package quiz;

import java.util.Scanner;

public abstract class Converter {
	abstract public double convert(double src);			// 바꿔주기... 	double 을 return.. // double src가 몸통이라고 생각/ 
	abstract public String srcString();
	abstract public String destString();				// destination					// 여기까지 구현해줘야 하는 곳(WonToDollar)
	protected double ratio;
	public void converting() {
	//	8000000
		Scanner scanner= new Scanner(System.in);
		System.out.println(srcString()+"을 "+destString()+"로 바꾸어줍니다.");
		System.out.println(srcString()+"을 입력하세요.");
		double inputValue= scanner.nextDouble();
		double result= convert(inputValue); 
		System.out.println("변환결과: "+result+destString()+"입니다.");
	}
}
// 위안화 만들어보기
// 