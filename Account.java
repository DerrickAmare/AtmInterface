public class Account {
    private int userId,userPin;
    private static double amountInAccount;

   public Account(int id,int pin){
        userId=id;
        userPin=pin;
    }

    public int getUserId(){
        return userId;

    }
    public int getUserPin(){
        return userPin;
    }
    public static void setAmountInAccount(double amount){
       amountInAccount=amount;
    }
    public static double getAmountInAccount(){
      return amountInAccount;
    }


}
