class united


{
 public static void main(String [] args)
{
  int balance = 4000;
  int withdrawlamount= 8000;


try
{
 

if(balance <withdrawlamount)
throw new ArithmeticException("insufficient balance");
balance = balance-withdrawlamount ;
System.out.println("Transaction successfully completed");

}
catch(ArithmeticException e)
{
System.out.println("Exception: "+e.getMessage());
}


System.out.println("program continue....");
}
}