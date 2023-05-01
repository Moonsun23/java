package day05;

public class ChangeMoneyArray {
	public static void main(String[] args) {
		int units[]= {50000, 10000, 5000, 1000, 500,100, 50};
		int money=768686;
		for(int i=0; i<units.length; i++) {
			//System.out.println(units[i]);
			System.out.println(units[i]+"원==="+money/units[i]+"장");
			money=money%units[i];
		}
		// 배열은 규칙이 없는 것에 규칙을 만들어 줄 때 사용한다.
		// 
		//규칙이 없는걸 번호를 매기면 된다 - 배열
		// 규칙이 없을 때 번호를 매길 수 있어서 배열을 쓴다 // 반복문과 잘 어울린다...
		//
		// 위 내용을 반복해서 쓴다면
//		System.out.println(units[0]);
//		System.out.println(units[1]);
//		System.out.println(units[2]);
		//.... 계속 쓸 수 있게 units[] 안에 배열된 내용을 쓴다.
	}
}
