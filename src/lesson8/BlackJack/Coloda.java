package lesson8.BlackJack;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Coloda {
    private ArrayList<Card> cards = new ArrayList<>();

    public Coloda() {
        Card card1 = new Card("двойка трефы",2);
        Card card2 = new Card("двойка червей",2);
        Card card3 = new Card("двойка пика",2);
        Card card4 = new Card("двойка бубна",2);

        Card card5 = new Card("тройка трефы",3);
        Card card6 = new Card("тройка червей",3);
        Card card7 = new Card("тройка пика",3);
        Card card8 = new Card("тройка бубна",3);

        Card card9 = new Card("четвёрка трефы",4);
        Card card10 = new Card("четвёрка червей",4);
        Card card11 = new Card("четвёрка пика",4);
        Card card12 = new Card("четвёрка бубна",4);

        Card card13 = new Card("пятёрка трефы",5);
        Card card14 = new Card("пятёрка червей",5);
        Card card15 = new Card("пятёрка пика",5);
        Card card16 = new Card("пятёрка бубна",5);

        Card card17 = new Card("шестёрка трефы",6);
        Card card18 = new Card("шестёрка червей",6);
        Card card19 = new Card("шестёрка пика",6);
        Card card20 = new Card("шестёрка бубна",6);

        Card card21 = new Card("семёрка трефы",7);
        Card card22 = new Card("семёрка червей",7);
        Card card23 = new Card("семёрка пика",7);
        Card card24 = new Card("семёрка бубна",7);

        Card card25 = new Card("восьмёрка трефы",8);
        Card card26 = new Card("восьмёрка червей",8);
        Card card27 = new Card("восьмёрка пика",8);
        Card card28 = new Card("восьмёрка бубна",8);

        Card card29 = new Card("девятка трефы",9);
        Card card30 = new Card("девятка червей",9);
        Card card31 = new Card("девятка пика",9);
        Card card32 = new Card("девятка бубна",9);

        Card card33 = new Card("десятка трефы",10);
        Card card34 = new Card("десятка червей",10);
        Card card35 = new Card("десятка пика",10);
        Card card36 = new Card("десятка бубна",10);

        Card card37 = new Card("валет трефы",10);
        Card card38 = new Card("валет червей",10);
        Card card39 = new Card("валет пика",10);
        Card card40 = new Card("валет бубна",10);

        Card card41 = new Card("дама трефы",10);
        Card card42 = new Card("дама червей",10);
        Card card43 = new Card("дама пика",10);
        Card card44 = new Card("дама бубна",10);

        Card card45 = new Card("король трефы",10);
        Card card46 = new Card("король червей",10);
        Card card47 = new Card("король пика",10);
        Card card48 = new Card("король бубна",10);

        Card card49 = new Card("туз трефы",1);
        Card card50 = new Card("туз червей",1);
        Card card51 = new Card("туз пика",1);
        Card card52 = new Card("туз бубна",1);

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        cards.add(card8);
        cards.add(card9);
        cards.add(card10);
        cards.add(card11);
        cards.add(card12);
        cards.add(card13);
        cards.add(card14);
        cards.add(card15);
        cards.add(card16);
        cards.add(card17);
        cards.add(card18);
        cards.add(card19);
        cards.add(card20);
        cards.add(card21);
        cards.add(card22);
        cards.add(card23);
        cards.add(card24);
        cards.add(card25);
        cards.add(card26);
        cards.add(card27);
        cards.add(card28);
        cards.add(card29);
        cards.add(card30);
        cards.add(card31);
        cards.add(card32);
        cards.add(card33);
        cards.add(card34);
        cards.add(card35);
        cards.add(card36);
        cards.add(card37);
        cards.add(card38);
        cards.add(card39);
        cards.add(card40);
        cards.add(card41);
        cards.add(card42);
        cards.add(card43);
        cards.add(card44);
        cards.add(card45);
        cards.add(card46);
        cards.add(card47);
        cards.add(card48);
        cards.add(card49);
        cards.add(card50);
        cards.add(card51);
        cards.add(card52);
    }


    public Card randomCard(){
        int randomNum = ThreadLocalRandom.current().nextInt(0,52);
        return cards.get(randomNum);
    }
}
