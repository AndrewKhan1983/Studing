package lesson8.BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Coloda coloda = new Coloda();
    private ArrayList<Player> players = new ArrayList<>();

    public void addPlaeyrToGame(Player player) {
        players.add(player);
    }

    public void addTwoCardsToPlayers() {
        for (Player p : players) {
            Card randomCard = coloda.randomCard();
            p.saveCardToHand(randomCard);

            Card randomCard2 = coloda.randomCard();
            p.saveCardToHand(randomCard2);
        }
    }

    public void addCardsTillNeed(Player player) {
        player.printCardsinHand();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Need one more card? (yes/no)");
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            Card card = coloda.randomCard();
            player.saveCardToHand(card);
            addCardsTillNeed(player);
        }
    }

    public void addCardsTillNeed(Diler diler) {

        if (diler.countValueInHand() < 18) {
            Card card = coloda.randomCard();
            diler.saveCardToHand(card);
            addCardsTillNeed(diler);
        }
    }

    public void printWinner(Player player, Diler diler) {
        if (player.countValueInHand() > 21) {
            System.out.println("Выиграл крупье !!!");
            diler.printCardsinHand();
            return;
        }

        if (player.countValueInHand() <= 21 && diler.countValueInHand() > 21){
            System.out.println("Поздравляю Вы выиграли!!!");
            player.printCardsinHand();
            return;

        }

        if (player.countValueInHand() >= diler.countValueInHand()) {
            System.out.println("Поздравляю Вы выиграли !!!");
            player.printCardsinHand();
        } else {
            System.out.println("Выиграл крупье !!!");
            diler.printCardsinHand();
        }
    }
}