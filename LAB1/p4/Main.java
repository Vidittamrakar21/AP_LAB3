class One {
    One(int x) {
        System.out.println("Value of x: " + x);
    }
}

class Two extends One {
    Two(int x) {
        super(x);
        System.out.println("Constructor of Two");
    }
}

public class Main {
    public static void main(String[] args) {
        Two obj = new Two(10);
    }
}
