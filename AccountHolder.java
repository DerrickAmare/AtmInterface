import javax.xml.validation.Validator;
import java.lang.invoke.VarHandle;
import java.util.*;

public class AccountHolder {
    Scanner scanner = new Scanner(System.in);
    HashMap<Integer,Integer> demoAccount = new HashMap<>();
    Account found;
    public void accounts(){


        System.out.println("Please input your User Id");
        int id=scanner.nextInt();
        System.out.println("Please input your User Pin");
        int pin= scanner.nextInt();
        demoAccount.put(id,pin);


        Account account1=new Account(123,23);
        Account account2=new Account(234,34);
        Account account3=new Account(345,45);
        Account account4=new Account(456,56);
        Account account5=new Account(567,67);

        List<Account> listAccount= new ArrayList<>();
        listAccount.add(account1);
        listAccount.add(account2);
        listAccount.add(account3);
        listAccount.add(account4);
        listAccount.add(account5);

        validator(demoAccount,listAccount);


    }
    public void validator(HashMap<Integer,Integer> hs, List<Account> listA){
        boolean flag= false;

        Iterator i =listA.iterator();

        for(Account li:listA){
            for(Map.Entry<Integer,Integer> e: demoAccount.entrySet())

                if((li.getUserId()==e.getKey())&& li.getUserPin()==e.getValue()){
                   flag=true;
                    found= new Account(e.getKey(),e.getValue());


                }

        }

        if(flag)
            System.out.println("Welcome Dear Customer!");

        else
            System.out.println("UserId and Pin Mismatch! please try again.");


    }public Account getFound() {

        return found;
    }


}










