public class SnakeAndLadderSimulator {
 	
	public static int rollDice() {
		return (int) Math.floor(Math.random() * 10) % 6 + 1;
	}

	public static int checkOption() {
		return (int) Math.floor(Math.random() * 10) % 3 + 1;
	}

	public static void main(String args[]) {
		int playerPosition = 0;
		System.out.println("Welcome To Snake And Ladder Simulator");
		int random = rollDice();
		int option = checkOption();
		switch (option) {
		case 1:
			System.out.println("Player do not plays");
			break;
		case 2:
			System.out.println("Player got the Ladder");
			playerPosition += random;
			break;
		case 3:
			System.out.println("Oops! Player got the Snake");
			playerPosition -= random;
			break;
		default:
			System.out.println("Something Wrong");

		}
	}
}
