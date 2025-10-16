// SCENARIO BASED QUESTION- DANCER DANCES AND THROWS JACKET

class DANCER{
    void dance(){
         System.out.print("Dancer dances ");
    }
    
    JACKET throwsjacket(){
        System.out.println(" and throws jacket");
       JACKET J = new JACKET();
       return J;
    }
    
    public static void main(String[] args) {
        DANCER D = new DANCER();
        D.dance();
        JACKET JCK = D.throwsjacket();
        System.out.println(JCK);
    }
}

class JACKET {
    
}
