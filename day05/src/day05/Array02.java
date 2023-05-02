package day05;

public class Array02 { // Array 복습 필요!!!........ length...
	public static void main(String[] args) {

		int nums[] = { 1, 3, 5, 7, 9, 10, 12, 19, 900, 40 }; // *** 배열은 중요하다.
		// 중괄호 안에 뭘 많이 넣기 위해 nums 앞에 [] 를 넣음
		// nums.length ->> int 안에 숫자가 몇개 있는지 프로그램이 세준다.
		int total = 10;
		// int total=nums.length;
		System.out.println(total);

		// fruits= "포도" // -> 과일 여러개를 쓰고싶다면 배열과 for문을 사용한다.

		String fruits[] = new String[5]; // -> 이렇게 쓰면 5개만 쓸 수 있다.// new: 새로운 객체를 메모리에 띄우겠다.

//		String fruit0="포도"; // 위 내용을 풀면 아래와 같이 5줄로 쓸 수 있다.
//		String fruit1="딸기";
//		String fruit2="사과";
//		String fruit3="오렌지";
//		String fruit4="키위";
		// System.out.println(fruit0); // 5개를 다 써야 한다. // -> 이 경우
//		// -> 이렇게 써도 된다.

		fruits[0] = "포도"; // 숫자는 반드시 0부터 시작한다.
		fruits[1] = "딸기";
		fruits[2] = "사과";
		fruits[3] = "오렌지";
		fruits[4] = "키위"; ///

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		String animals[] = { "강아지", "고양이", "사자", "호랑이" }; // 이 부분의 리스트는 다른데서 넘겨준다.
		// 나는 이중에 고양이가 필요하다?
		System.out.println(animals[1]); // 배열의 숫자는 0부터니까 고양이는 1번으로 기재해야 나온다.
		System.out.println("==========");
		// 만약 포유류를 다 써야 한다면..?
		for (int i = 0; i < animals.length; i++) { // 몇개의 동물이 있는지 모르니까 .length로 써줌
			System.out.println(animals[i]);
		}
		System.out.println("==========");

		// for-each 사용

		for (String animal : animals) { // String 배열로 포문안에 작성 시 변수는 단수로 써준다.
			System.out.println(animal);
		}
		
		//================= 여기까지는 이해 ㅇㅋ 아래 응용버전 다시보기

		// for(int i=0.. 0부터 시작해서 배열, ; i<animals.length; >> 변수가 0부터 시작하기 때문에
		// i<animals.length; i++

		// Quiz: 3,5,6,7,8,14,37,64, 87, 90 중 3의 배수만 추출하고 싶다.(3으로 나눠서 0이 되는 나머지연산 사용)
		int nums02[] = { 23, 45, 67, 78, 56, 3, 9, 12, 85, 889889 };
		for (int i = 0; i < nums02.length; i++) {
			if (nums02[i] % 3 == 0) {
				System.out.print(nums02[i] + " ");
			}
			// 변수 선언하고 if로 만약 nums02[i]가 3으로 나눴을때 0이라면 ->> 

		}
		System.out.println();
		System.out.println("==========");
		
		// for-each
		
		for (int num : nums02) {
			if(num%3==0) {
				System.out.println(num +" ");
			}
			// 
			
		}

	}

//		
//		System.out.println(nums.length); 		// 위 int에 몇개를 썼는지 알 수 있음 length
//		int total=nums.length;
//		int sum=0;
//		for(int i=0; i<total; i++) {
//			sum+=nums[i];	// 합계
//		}
//		System.out.println(sum);
//		System.out.println((double)sum/total);
//		
//		//for-each 각각의 반복문을 돌릴 수 있다.
//		
//		int sum02=0;
//		for(int j:nums) {
//			sum02+=j;
//		}
//		System.out.println(sum02);
//		
//		String fruits[]= {"딸기", "사과", "복숭아", "키위"};   // 배열만들려면 [] 을 붙여준다
//		for(String fruit:fruits) {						// String은 배열 만들 시 단수로 만들어준다(item)..
//			System.out.print(fruit+",");
//			
//		}
//		int intArray[][] = new int[2][3];					// 배열을 2번 쓴 것
//		//첫번째 배열은 2개/ 두번째 배열은 3개
//		intArray[0][0]=1;
//		intArray[0][1]=2;
//		intArray[0][2]=3;
//		
//		intArray[1][0]=100;
//		intArray[1][1]=200;
//		intArray[1][2]=300;
//		
////		intArray[2][0]=500;		// 이 라인 답이 나오지 않음// 선언 시 2개 만 배열이 가능하다고 선언했기 때문에
////		intArray[2][1]=700;
////		intArray[2][2]=900;
//		
//		System.out.println(intArray[0][2]);
//		
//		for(int i=0; i<intArray.length; i++ ) {  //int i=0; i<2; i++ 라고 써도 된다.
//			for(int j=0; j<intArray[i].length; j++) {
//				System.out.println(intArray[i][j]+",");
//			}
//			
//		}
//		

}
//2차원 배열
