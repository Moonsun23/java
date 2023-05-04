package quiz;

import java.util.Scanner;

//Player 라는 객체를 만들고 나(player)랑 컴퓨터랑 할 수 있도록
// Player vs Computer

class Player {

	private String name;
	private Scanner scanner = new Scanner(System.in);

	public String getName() { /// 아래 누구와 대결할지 위 private이 막혀있어서.. 여기 name을 가져오는 getter를 쓴다..
		return name;
	}

	public Player(String name) { // 생성자
		this.name = name;
	}

	public int turn() {
		System.out.print(name + "[가위 (1), 바위(2), 보(3), 끝내기(4)]");
		return scanner.nextInt();
	}

}

class Computer extends Player {
	public Computer(String name) {
		super(name);
	}

	public int turn() {
		return (int) (Math.random() * 3 + 1);

	}
}

public class RockPaperScissors {
	public static void main(String[] args) {
		String rockPaperScissors[] = { "가위", "바위", "보" };
		Player me = new Player("문선"); // 타입이 Player
		Computer computer = new Computer("슈퍼컴퓨터"); // 타입이 컴터

		while (true) { // 다시 해보기...
			int playerChoice = me.turn();
			if (playerChoice == 4)
				break;
			System.out.println(me.getName() + " : " + rockPaperScissors[playerChoice - 1]);
			int computerChoice = computer.turn();
			System.out.println(computer.getName() + " : " + rockPaperScissors[playerChoice - 1]);
			if (playerChoice == computerChoice) {
				System.out.println(me.getName() + "비겼음");
			} else if (playerChoice == 1 && computerChoice == 3) {
				System.out.println(me.getName() + "이겼음");
			} else if (playerChoice == 2 && computerChoice == 1) {
				System.out.println(me.getName() + "이겼음");
			} else if (playerChoice == 3 && computerChoice == 2) {
				System.out.println(me.getName() + "이겼음");
			} else {
				System.out.println(computer.getName() + "이겼음");
			}
		}
	}
}

//		System.out.println(computer.getName());
//		int computerChoice=computer.turn();
//		System.out.println(rockPaperScissors[playerChoice-1]);
//		if(playerChoice==computerChoice) {
//			System.out.println("비겼음");
//		}else if(playerChoice==1 && computerChoice==3) {
//			System.out.println("이겼음");
//		}else if(playerChoice==2 && computerChoice==1) {
//			System.out.println("이겼음");
//		}else if(playerChoice==3 && computerChoice==2) {
//			System.out.println("이겼음");
//		}else {
//				System.out.println("졌음");
//		}
//	}
//}

//		for(int a=1; a<4; a++) {	/// 내가 쓴 답변...
//		if("문선"=="슈퍼컴퓨터") {
//			System.out.println("비겼습니다.");
//		}else({
//			System.out.println("dfdf?"); break;
//		}
//	}
