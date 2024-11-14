package Oops.Abstractions;
// interface


interface Phone {
    public void calling();
    public void message();
}

class Samsung implements Phone {
    public void  calling() {
        System.out.println("Phone use for calling");
    }
    public void message() {
        System.out.println("Phone use for message");
    }

}

public class Test22 {
    public static void main(String[] args) {
        Samsung s1 = new Samsung();
        s1.calling();
        s1.message();

    }
}
