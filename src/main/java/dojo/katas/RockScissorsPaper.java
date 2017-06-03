package dojo.katas;

public class RockScissorsPaper {

	public static final String ROCK = "Rock";
	public static final String PAPER = "Paper";
	public static final String SPOCK = "Spock";
	public static final String DRAW = "Draw";
	public static final String PLAYER1WINS = "Player1Wins";
	public static final String PLAYER2WINS = "Player2Wins";
	public static final String SCISSORS = "Tijeras";
	public static final String LIZARD = "Lagarto";
	private String message;

	public String playRound(String option1, String option2) {
		logical(option1, option2);
		return this.message;
	}

	private void logical(String option1, String option2) {
		if (option1 == option2) {
			this.message = DRAW;
		} else {
			switch (option1) {
			case ROCK:
				rock(option2);
				break;
			case PAPER:
				paper(option2);
				break;
			case SCISSORS:
				scissors(option2);
				break;
			case LIZARD:
				lizard(option2);
				break;
			case SPOCK:
				spock(option2);
				break;
			}
		}
	}

	private void spock(String option) {
		winsTo(option,ROCK,SCISSORS);				
	}

	private void lizard(String option) {
		winsTo(option,SPOCK,PAPER);		
	}

	private void scissors(String option) {
		winsTo(option,PAPER,LIZARD);		
	}
	
	private void paper(String option) {
		winsTo(option,ROCK,SPOCK);		
	}
	
	private void rock(String option) {
		winsTo(option,SCISSORS,LIZARD);		
	}

	private void winsTo(String option, String winnerOp1, String winnerOp2) {
		if (option == winnerOp1 || option == winnerOp2) {
			this.message = PLAYER1WINS;
		} else {
			this.message = PLAYER2WINS;
		}		
	}
	
}
