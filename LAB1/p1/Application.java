// Class Mother
class Mother {
    int x;

    void show() {
        System.out.println("Show of Mother is called");
    }
}

// Class Child that extends Mother
class Child extends Mother {
    // Empty body
}

// Class Application to test the inheritance
public class Application {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show(); // Show of Mother is called

        Child ch = new Child();
        ch.show(); // Show inherited in Child from Mother is called
    }
}
