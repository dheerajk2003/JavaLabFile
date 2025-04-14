class NoMatchException extends Exception{
    public NoMatchException(String msg){
        super(msg);
    }
}

class Matching{
    String s;

    public Matching(String s) throws NoMatchException{
        if(s.equals("India")){
            System.out.println("Matched");
            this.s = s;
        }
        else{
            throw new NoMatchException("Not matching.");
        }
    }
}

public class NoMatch3{
    public static void main(String args[]) throws NoMatchException{
        Matching m = new Matching("Japan");
    }
}