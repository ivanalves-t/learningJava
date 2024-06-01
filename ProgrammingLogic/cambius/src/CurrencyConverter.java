public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double cambius (double price, double dollar) {

        return (dollar*price) + (dollar*price) * IOF;
    }

}
