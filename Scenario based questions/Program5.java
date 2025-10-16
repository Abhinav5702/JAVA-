// SCENARIO BASED QUESTION- ATM DISPENSES CASH USING PIN

class ATM  {
    CASH DISPENSES(int pin){
        System.out.println("ATM DISPENCES CASH USING THE PIN "+ pin);
        CASH C = new CASH();
        return C;
        
    }
    
    
    public static void main(String[] args) {
       ATM A = new ATM();
       A.DISPENSES(2255);
       System.out.println( A.DISPENSES(2255));
    }
}

class CASH{
    
}
