package dojo.katas;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockScissorsPaperTest {
	RockScissorsPaper game = new RockScissorsPaper();

	@Test
	public void stoneVsStoneIsDraw() {
		drawResult(RockScissorsPaper.ROCK, RockScissorsPaper.ROCK);
	}

	@Test
	public void stoneVsPaperWins2Player() {
		player2WinsResult(RockScissorsPaper.ROCK, RockScissorsPaper.PAPER);
	}

	@Test
	public void stoneVsScissorsWins1Player() {
		player1WinsResult(RockScissorsPaper.ROCK, RockScissorsPaper.SCISSORS);
	}

	@Test
	public void stoneVsLizardWins1Player() {
		player1WinsResult(RockScissorsPaper.ROCK, RockScissorsPaper.LIZARD);
	}

	@Test
	public void stoneVsSpockWins2Player() {
		player2WinsResult(RockScissorsPaper.ROCK, RockScissorsPaper.SPOCK);
	}

	@Test
	public void paperVsStoneWins1Player() {
		player1WinsResult(RockScissorsPaper.PAPER, RockScissorsPaper.ROCK);
	}

	@Test
	public void paperVsScissorsWins2Player() {
		player2WinsResult(RockScissorsPaper.PAPER, RockScissorsPaper.SCISSORS);
	}

	@Test
	public void paperVsLizardWins2Player() {
		player2WinsResult(RockScissorsPaper.PAPER, RockScissorsPaper.LIZARD);
	}

	@Test
	public void paperVsSpockWins1Player() {
		player1WinsResult(RockScissorsPaper.PAPER, RockScissorsPaper.SPOCK);
	}

	@Test
	public void scissorsVsRockWins2Player() {
		player2WinsResult(RockScissorsPaper.SCISSORS, RockScissorsPaper.ROCK);
	}

	@Test
	public void scissorsVsPaperWins1Player() {
		player1WinsResult(RockScissorsPaper.SCISSORS, RockScissorsPaper.PAPER);
	}

	@Test
	public void scissorsVsLizardWins1Player() {
		player1WinsResult(RockScissorsPaper.SCISSORS, RockScissorsPaper.LIZARD);
	}

	@Test
	public void scissorsVsSpockWins2Player() {
		player2WinsResult(RockScissorsPaper.SCISSORS, RockScissorsPaper.SPOCK);
	}
	
	@Test
	public void lizardVsRockWins2Player() {
		player2WinsResult(RockScissorsPaper.LIZARD, RockScissorsPaper.ROCK);
	}
	
	@Test
	public void lizardVsPaperWins1Player() {
		player1WinsResult(RockScissorsPaper.LIZARD, RockScissorsPaper.PAPER);
	}
	
	@Test
	public void lizardVsScissorsWins2Player() {
		player2WinsResult(RockScissorsPaper.LIZARD, RockScissorsPaper.SCISSORS);
	}
	
	@Test
	public void lizardVsSpockWins1Player() {
		player1WinsResult(RockScissorsPaper.LIZARD, RockScissorsPaper.SPOCK);
	}
	
	@Test
	public void spockVsRockWins1Player() {
		player1WinsResult(RockScissorsPaper.SPOCK, RockScissorsPaper.ROCK);
	}

	@Test
	public void spockVsScissorsWins1Player() {
		player1WinsResult(RockScissorsPaper.SPOCK, RockScissorsPaper.SCISSORS);
	}

	@Test
	public void spockVsLizardWins2Player() {
		player2WinsResult(RockScissorsPaper.SPOCK, RockScissorsPaper.LIZARD);
	}

	@Test
	public void spockVsPaperWins2Player() {
		player2WinsResult(RockScissorsPaper.SPOCK, RockScissorsPaper.PAPER);
	}

	private void drawResult(String player1, String player2) {
		String result = game.playRound(player1, player2);
		assertEquals(RockScissorsPaper.DRAW, result);
	}

	private void player1WinsResult(String player1, String player2) {
		String result = game.playRound(player1, player2);
		assertEquals(RockScissorsPaper.PLAYER1WINS, result);
	}

	private void player2WinsResult(String player1, String player2) {
		String result = game.playRound(player1, player2);
		assertEquals(RockScissorsPaper.PLAYER2WINS, result);
	}
}
