package com.deckofcards;

public class DeckOfCards {
	public static void main(String[] args) {
		DistributeCards distributeCards = new DistributeCards();	//	class object
		
		//	allots cards for each player
		for (int playerNumber = 1; playerNumber <= 4; playerNumber++) {
			distributeCards.DistributeCards(playerNumber);
			System.out.println("Player "  + playerNumber + "'s cards:");
			//prints cards of respective player
			distributeCards.showCards(playerNumber);
		}
	}
}
