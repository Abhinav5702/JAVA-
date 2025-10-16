// SCENARIO BASED QUESTION- COW GIVES MILK
class COW{
    MILK gives(){
        System.out.println("Cow gives Milk");
        MILK c = new MILK();
        return c;
    }
    
    public static void main(String[] args) {
        COW C = new COW();
        MILK M= C.gives();
        System.out.println(M);
    }
}

class MILK {
    
}
