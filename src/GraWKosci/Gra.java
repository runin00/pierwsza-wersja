package GraWKosci;

import java.util.Random;
import java.util.Scanner;


public class Gra {
    /*
    Two players roll the dice.
    The first player to score the required number of points wins.
    If the number of spots on one of the dices is one, rolling is stoped an the current player's score is eresed.
    Player can stop rolling at any moment. Then his score is adding to his global points.
    The essence of the game is to get the required amount of points before your opponent.

    roll the dices - method rollDices,
    Player 1 global score - static pole p1Score
    Player 2 global score - static pole p2Score
    points to win - static pole pointsToWin
    veryfication of game state after dices roll, changeing players, checking win points - method game
    @ problem: kolejność wpływa na możliwości zwycięstwa
     */

    private static Random rand = new Random();
    private static Scanner scan = new Scanner(System.in);
    private static int player;
    private static int[] playersGlobalScore = new int[2];
    private static String[] players = {"Gracz pierwszy", "Gracz drugi"};
    private static boolean end;
    private static int winPoints;


    public static void main(String[] args) {
        // dlaczego klasa wyskoczyła mi na czerwono - czy to github?
        // czy można zastąpić funkcję main funkcją o innej nazwie i co z argumentami funkcji main?
        // przećwiczyć githuba z Danielem

        //System.out.println("Do ilu punktów gramy? >> ");
        //winPoints = scan.nextInt();
        // oddzielna metoda wyboru elementu spośród elementów w tablicy
        player = rand.nextInt(0,2);

        // czy trzeba tworzyć oddzielną zmienną dla losowania numeru playera? - wrzuciłem losowanie do parametrów
        // metody start
        // problem z liczbami pseudolosowymi
        end = false;
        System.out.println("fafsfsfsf");
        System.out.println("hdsgdgdsg");
        System.out.println("Drogą losowania zaczyna " + players[player]);

        while (!end) {
            System.out.println("Wynik Gracza Pierwszego: " + playersGlobalScore[0] + "\n" +
            "Wynik Gracza Drugiego: " + playersGlobalScore[1]);
            System.out.println("Teraz rzuca " + players[player] + " >>");
            game(rollDices());
            //czy trzeba przekazywać pole statyczne do metody?
            System.out.println("player przed zmianą " + player);
            if player
            player = nextElementInArray.start(players, player);
            System.out.println("player po zmianie " + player);
            // oddzielna metoda przechodzenia do następnego elementu tablicy i przejście do pierwszego gdy sie skończy
        }
    }

    private static int[] rollDices() {

        int[] dices = new int[2];
        dices[0] = rand.nextInt(1,7);
        dices[1] = rand.nextInt(1,7);
        System.out.println("kostka 1: " + dices[0] + " kostka 2: " + dices[1]);
        return dices;
    }

    private static void game(int[] dices) {

       // spraewdzamy czy jest jedynka na którejś z kostek czy sumujemy wynik

        if (dices[0] == 1 || dices[1] == 1) {
           System.out.println("Wypadła jedynka");
            return;
       } else {
           if (player == 0) {
               playersGlobalScore[0] += (dices[0] + dices[1]);
           } else if (player == 1) {
               playersGlobalScore[1] += (dices[0] + dices[1]);
           }
       }
        // sprawdzamy czy bieżący gracz uzyskał zwycięską liczbę punktów
        // semantyka tych warunków - różne if odnośnie różnych elementów

       if (player == 0) {
           if (playersGlobalScore[0] >= winPoints) {
               System.out.println("Gracz pierwszy wygrywa");
               end = true;
           }

       } else if (player == 1) {
           if (playersGlobalScore[1] >= winPoints) {
               System.out.println("Gracz drugi wygrywa");
               end = true;
           }

       }
    }
}