public class IceCreamStore
{
    private final double tax = 0.00;
    public static String[][] userPass = {{"Username","password"},{"Gelato","199 Chambers"}};
    public static String[] itemNames = {"chocolate","Vanilla","Strawberry","Mint"};
    public static double[] itemPrices = {7.00,10.00,12.00,15.00};
    public static String getusername()
    {
        return userPass[0][1];
    }

    public static String getPassword()
    {
        return userPass[1][1];
    }

    public static String[] getitemname()
    {
        return itemNames;
    }

    public static double[] getitemprice()
    {
        return itemPrices;
    }

    public double CalcCost()
    {
    return 0;
    }

    public double CalcTax()
    {
      return tax;
    }

    public double Calctotal()
    {
    return 0;
    }
}