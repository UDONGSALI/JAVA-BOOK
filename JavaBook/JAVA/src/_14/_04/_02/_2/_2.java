package _14._04._02._2;

class A{
    void abc() throws NumberFormatException{
        bcd();
    }
    void bcd() throws NumberFormatException{
        cde();
    }
    void cde() throws NumberFormatException{
        int num = Integer.parseInt("19D");
    }
}

public class _2 {
    public static void main(String[] args) {
        A a = new A();

        try {
            a.abc();
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
