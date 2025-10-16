 // ATM MACHINE PROGRAM

public class ATM {
    int balance = 1000;
    int pin = 4652;
    
    // Withdraw method 
    cash withdraw(int wamt){
        balance= balance- wamt;
        System.out.println("Amount withdrawn & remaining balance = "+balance);
        cash c = new cash();
        return c;
    }
    
    
    //deposit method
     void deposit(int amt){
         balance= balance+amt;
         System.out.println("Updated balance ="+ balance);
     }
    
    
    //check balance method
    void checkbalance(){
        System.out.println("Balance = "+ balance);
    }
    
    
    //change pin method 
    void changepin(int newpin ){
        pin = newpin;
        System.out.println("Pin changed to "+ pin);
        
    }
    
    
    
    public static void main(String[] args) {
        ATM A = new ATM();
        A.withdraw(100);
        A.deposit(1000);
        A.checkbalance();
        A.changepin(1455);
    }
}

class cash{
    
}
