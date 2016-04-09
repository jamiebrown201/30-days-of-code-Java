package cointoss;

import java.util.Random;

public class CoinToss {
    
    public String tossACoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        if(toss == 1){
            return "Tails";
        } else {
            return "Heads";
        }
    }
    
    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }
    
}
