// SCENARIO BASED QUESTION- CONDUCTOR PROVIDES TICKET
class Conductor{
    TICKET Provides(){
        System.out.println("Conductor Provides Ticket");
        TICKET t = new TICKET();
        return t;
    }
    
    public static void main(String[] args) {
        Conductor C = new Conductor();
        TICKET TIC= C.Provides();
        System.out.println(TIC);
    }
}

class TICKET {
    
}
