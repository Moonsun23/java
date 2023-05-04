package day08;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str="아이언맨/토르/헐크/스파이더맨/앤트맨/블랙핑크";
		StringTokenizer st= new StringTokenizer(str,"/");
	//	System.out.println(st.countTokens()); 					// 결과는 6
	//	System.out.println(st.toString()); // 결과: java.util.StringTokenizer@5e91993f
		
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		
		for(int i=0; i<st.countTokens(); i++) {
			System.out.println(st.nextToken());
					}							// 왜 3개만 출력되는지 다음에 알려주신다고 함...
		
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());	// 6개 모두 출력됨
		//}
		
	}
}
