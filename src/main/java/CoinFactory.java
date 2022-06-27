public class CoinFactory {

    public static Coin getILSInstance(Coins coin){
        switch (coin){case ILS:} return new ILS();}
    public static Coin getUSDInstance(Coins coin){
        switch (coin){case USD:} return new USD();}
}
