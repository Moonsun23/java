package day06;

public class Lotto {	// class 3
	public Lotto() {
		
	}
	public Lotto(int many) {
		howMany(many);
	}
	
	public void howMany(int many) {
		for(int i=0; i<many; i++) {
			makeLotto();
		} // LottoTest의 makeLotto에 2를 넣으면 로또6자리가 2개 출력된다.
		
	}
	
	private void makeLotto() {			// 여기를 public으로 쓸때랑 private으로 쓸때랑 LottoTest에 나오는 결과가 다르다.
		// public으로 쓰면 makeLotto도 유효한 
		int lotto[]= new int[6];	
		for(int i=0; i<lotto.length; i++) {
			lotto[i]= (int)(Math.random()*45)+1;
		
			for(int j=0; j<i; j++) {					// i랑 비교해서 숫자 하나가 빠지게끔
				if(lotto[i]==lotto[j]) { 				// 그냥 j와 lotto[j]의 숫자가 다르다는 것.
					i--;							// 증감연산...위에서 중복이 됐다면 빼버려야 하니까 
					
					break;
					}		
			}			
			
		} 
		for(int j=0; j<lotto.length; j++) {
			
			System.out.print(lotto[j]+",");
		}
			System.out.println();
		}
	
}
