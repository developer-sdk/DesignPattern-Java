package sdk.pattern.strategy;

public class Main {

	public static void main(String[] args) {
		Player p1 = new Player("홍길동", new WinningStrategy(3));
		Player p2 = new Player("임꺽정", new ProbStrategy(5));

		for (int i = 1; i <= 100; i++) {
			Hand h1 = p1.nextHand();
			Hand h2 = p2.nextHand();

			if (h1.isStrongerThan(h2)) {
				System.out.println(String.format("%s 승!", p1));
				p1.win();
				p2.lose();
			} else if (h2.isStrongerThan(h1)) {
				System.out.println(String.format("%s 승!", p2));
				p1.lose();
				p2.win();
			} else {
				System.out.println("무승부");
				p1.even();
				p2.even();
			}
		}

		System.out.println("최종 결과");
		System.out.println(p1);
		System.out.println(p2);
	}
}
