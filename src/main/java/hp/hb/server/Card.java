package hp.hb.server;

public class Card {
    private String name;
    private Category category;
    private int price=0;


    public Card(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    void play(){
        System.out.println(name + "zagrana");
    }



}
