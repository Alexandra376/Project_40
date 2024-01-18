public class Coins {
    public static double printCoins(Coin coin) {
        return switch(coin) {
            case PENNY -> Coin.PENNY.getValue();
            case NICKEL -> Coin.NICKEL.getValue();
            case DIME -> Coin.DIME.getValue();
            case QUARTER -> Coin.QUARTER.getValue();
        };
    }
    public static void main(String[] args) {
        System.out.println("Penny value: $" + printCoins(Coin.PENNY));
        System.out.println("Nickel value: $" + printCoins(Coin.NICKEL));
        System.out.println("Dime value: $" + printCoins(Coin.DIME));
        System.out.println("Quarter value: $" + printCoins(Coin.QUARTER));
    }
}
