package hp.hb.server;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> draw = new ArrayList<>();
    private List<Card> hand = new ArrayList<>();
    private List<Card> discard = new ArrayList<>();

    public Player() {
        Card  card1= new Card("Wingardium Leviosa", Category.SPELL);
        //5 kard dobierajacych monete
        //5 kard dodajace blyskace
    }
}
