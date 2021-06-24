public class SnakeAndLadderSimulator {
 	
	public static int rollDice() {
		return (int) Math.floor(Math.random() * 10) % 6 + 1;
	}

	public static int checkOption() {
		return (int) Math.floor(Math.random() * 10) % 3 + 1;
	}

public static void main(String args[]) {
		int playerPosition = 0;
		int Winpoint = 100;
		while(playerPosition < 100){
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
			
			if (playerPosition < 0) {
				playerPosition = 0;
			} else{
				playerPosition -= random;
			}
			break;
		default:
			System.out.println("Something Wrong");

		}
		System.out.println("Player position is:" + playerPosition);
		System.out.println();
	}
    }
}
