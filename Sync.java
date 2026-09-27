import java.util.Scanner;
class Account
{
    private int bal;
    public Account (int bal)
    {this .bal=bal;}
    public boolean isSufficientBalance(int w)
    {
        if (bal> w)
            return(true);
        else
            return(false);
    }
    public void withdraw (int amt)
    {
        bal= bal-amt;
        System.out.println("withdrwal money is  "+ amt);
        System.out.println(" your current balance is   "+bal);
    }
}
class customer implements Runnable
{
    private String name;

    private Account account;
    public customer (Account account , String n)
    {
        this.account=account;
        name =n;
    }


    public void run()
    {
        Scanner kb= new Scanner(System.in);
        System.out.println(name+ " enter amount to withdraw");
        int amt=kb.nextInt();

    synchronized (account){


    if (account.isSufficientBalance(amt))
    {
        System.out.println(name);
        account.withdraw (amt);
    }
    else


        System.out.println("insufficient balance");

}
}
	 }

public class Sync
{
    public static void main(String [] args)
    {
        Account a1=new Account (1000);
        customer c1=new customer (a1 ,"Urbim");
        customer c2= new customer(a1,"Alok");
        Thread t1= new Thread(c1);
        Thread t2= new Thread(c2);
        t1.start();
        t2.start();
    }
}


























