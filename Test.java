public class Test 
{
    public static void main(String[] args)
    {
        Bank b=new Bank("SBI","Hyderabad");
        System.out.println(b.addAccount(new SavingAccount(1005.00,5,10106,100000.00,"15/7/2023")));
        System.out.println(b.addAccount(new SavingAccount(1005.00,5,20202,1000000.00,"21/9/2020")));
        System.out.println(b.addAccount(new CurrentAccount(100000,30303,300000.00,"15/8/2016")));
        System.out.println(b.addAccount(new CurrentAccount(100000,40404,400000.00,"15/10/2017")));
        b.showAccounts();
        System.out.println(b.transaction('w',10106, 10000));
        System.out.println(b.transaction('d',10106, 10000));
    }
}
