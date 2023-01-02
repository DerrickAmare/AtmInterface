import java.util.Scanner;

public class Bank implements ATM {
Scanner scanner= new Scanner(System.in);
    AccountHolder ai= new AccountHolder();

    @Override
    public void accept(){

        ai.accounts();

        System.out.println(" What Services are looking for today?");

        System.out.println("1.Deposit");
        System.out.println("2.Withdrawal");
        System.out.println("3.Transfer");

          int pick= scanner.nextInt();
         choice(pick);
    }
    @Override
    public void choice(int pick) {
        BankTransaction bankTransaction= new BankTransaction();
        Object o1 = null;

        switch (pick) {
            case 1:
                System.out.println(" how much do you want to deposit?");
                int amount= scanner.nextInt();
                bankTransaction.deposit(amount);
                System.out.println("Deposit Success.");
                break;
            case 2:
                System.out.println(" how much do you want to withdrawal?");
                int withdrawal= scanner.nextInt();
                bankTransaction.withdrawal(withdrawal);
                System.out.println("Withdrawal Success.");
                break;
            case 3:
                System.out.println(" how much do you want to transfer?");
                int transfer= scanner.nextInt();
                bankTransaction.transfer(o1,transfer);
                System.out.println("Withdrawal Success.");
                break;
        }
    }
}
