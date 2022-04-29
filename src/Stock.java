public class Stock {
    private String symbol;
    private int totalShares;
    private double totalCost;

    public String getSymbol() {
        return symbol;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    // Initializes a new Stock with no shares purchased.
    public Stock(String theSymbol) {
        symbol = theSymbol;
        totalShares = 0;
        totalCost = 0.0;
    }

    // Returns the total shares purchased of this stock.
    public int getTotalShares() {  return totalShares; }
    // Returns the total profit or loss earned on this stock.
    public double getProfit(double currentPrice) {
        double marketValue = totalShares * currentPrice;
        return  marketValue - totalCost;
    }
    // Records purchase of the given shares at the given price.
    public void purchase(int shares, double pricePerShare) {
        totalShares += shares;
        totalCost += shares * pricePerShare;
    }
    @Override
    public String toString() {
        return "Stock [symbol=" + symbol + ", totalShares=" + totalShares + ", totalCost=" + totalCost + "]";
    }
}
class DividendStock extends Stock{
    private double dividents;

    public DividendStock(String theSymbol) {
        super(theSymbol);
    }

    @Override
    public double getProfit(double currentPrice)
    {
        double marketValue = getTotalShares() * currentPrice + dividents;
        return  marketValue - getTotalCost();
    }
    public void payDividend(double amountPerShare)
    {
        dividents=getTotalShares()*amountPerShare;
    }
    @Override
    public String toString() {
        return "DividendStock [symbol=" + super.getSymbol() + ", totalShares=" + getTotalShares() + ", totalCost=" + getTotalCost() + ", dividends= "+dividents+"]";
    }
}
class testDividentsStock{
    public static void main(String[] args) {
        DividendStock dividendStock=new DividendStock("Oracle");
        dividendStock.purchase(200,32);
        dividendStock.purchase(350,40);
        dividendStock.payDividend(2.8);
        System.out.println(dividendStock.toString());
        System.out.println(dividendStock.getProfit(50));
    }
}
