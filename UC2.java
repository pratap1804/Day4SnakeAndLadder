public class SnakeAndLadderSimulator {

 	public static int rollDice() {
		return (int) Math.floor(Math.random() * 10) % 6 + 1;
	}

	public static void main(String args[]) {
		int playerPosition = 0;
		System.out.println("Welcome To Snake And Ladder Simulator");
		int random = rollDice();
		System.out.println(random);
	}
}
