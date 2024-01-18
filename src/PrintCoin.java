public class PrintCoin {
    public static void main(String[] args) {
        Coin penny = Coin.PENNY;
        Coin nickel = Coin.NICKEL;
        Coin dime = Coin.DIME;
        Coin quarter = Coin.QUARTER;

        System.out.println("Penny value: $" + penny.getValue());
        System.out.println("Nickel value: $" + nickel.getValue());
        System.out.println("Dime value: $" + dime.getValue());
        System.out.println("Quarter value: $" + quarter.getValue());
    }
}
