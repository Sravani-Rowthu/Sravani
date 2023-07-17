public class SavingAccount extends Account 
{
    private double minimumDepositAmount;
    private int noOfTransactionsPerDay;
    public SavingAccount() {}
    public SavingAccount(double minimumDepositAmount, int noOfTransactionsPerDay,int accountNo, double balance, String openedDate) 
    {
    	super(accountNo,balance,openedDate);
        this.minimumDepositAmount = validateminimumDepositAmount(minimumDepositAmount);
        this.noOfTransactionsPerDay = validatenoOfTransactionsPerDay(noOfTransactionsPerDay);
    }
    private int validatenoOfTransactionsPerDay(int noOfTransactionsPerDay) 
    {
        if(noOfTransactionsPerDay<=10)
            return noOfTransactionsPerDay;
        throw new RuntimeException("No more transactions can be done");
    }
    private double validateminimumDepositAmount(double minimumDepositAmount) 
    {
        if(minimumDepositAmount>1000)
            return minimumDepositAmount;
        throw new RuntimeException("amount should not be less than 1000");
    }
    public double getMinimumDepositAmount() 
    {
        return minimumDepositAmount;
    }
    public void setMinimumDepositAmount(double minimumDepositAmount) 
    {
        this.minimumDepositAmount = validateminimumDepositAmount(minimumDepositAmount);
    }
    public int getNoOfTransactionsPerDay() 
    {
        return noOfTransactionsPerDay;
    }
    public void setNoOfTransactionsPerDay(int noOfTransactionsPerDay) 
    {
        this.noOfTransactionsPerDay = validatenoOfTransactionsPerDay(noOfTransactionsPerDay);
    }


}