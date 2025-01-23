class Mother {
    void show() {
        System.out.println("Hello World");
    }
}


class Child extends Mother {
    @Override
    void show() {
        System.out.println("Hello JUET");
    }
}


public class Application {
    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.show();  // This will display "Hello World"
        
        Child child = new Child();
        child.show();  // This will display "Hello JUET"
    }
}
