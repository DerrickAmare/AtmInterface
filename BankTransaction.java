public class BankTransaction {

    Double amountLeft;
    AccountHolder ah;
    Account found=  ah.getFound();;
 public void deposit(double deposit){

     amountLeft=found.getAmountInAccount()+deposit;
     found.setAmountInAccount(amountLeft);
 }
 public void transfer( Object o1,double transfer){

     Account account1=(Account) o1;

     amountLeft=found.getAmountInAccount();
     amountLeft=amountLeft-transfer;

     account1.setAmountInAccount(amountLeft);


 }
 public void withdrawal(double withdrawal ){
    amountLeft = found.getAmountInAccount() - withdrawal;
     found.setAmountInAccount(amountLeft);
 }
}
