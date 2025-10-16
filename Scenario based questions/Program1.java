// SCENARIO BASED QUESTION- ATM DISPENSES CASH 

class ATM{
    cash dispense(){
        System.out.println("ATM Dispences cash");
        cash c = new cash();
        return c;
    }
    
    public static void main(String[] args) {
        ATM A = new ATM();
        cash sh = A.dispense();
        System.out.println(sh);
    }
}

class cash {
    
}
