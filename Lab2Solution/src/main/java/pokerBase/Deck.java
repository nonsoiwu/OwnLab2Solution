package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();

	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				//TODO Lab3 - Fix this
				//if (eSuit != eSuit.JOKER) <-- you'll thank me :)
				//{
					deckCards.add(new Card(eSuit, eRank, iCardNbr++));
				//}
			}
			 
		}
		Collections.shuffle(deckCards);
	}
	
	public Deck(int NbrOfJokers) {

		//TODO Lab3 - Implement joker constructor
	}
	
	
	public Deck(int NbrOfJokers, ArrayList<Card> Wilds) {

		//TODO Lab3 - Implement joker and wild constructor
	 
		
	}
	public Card Draw(){
		//TODO Lab 3 - Implement exception handling for overdraw
		return deckCards.remove(0);
	}
}
