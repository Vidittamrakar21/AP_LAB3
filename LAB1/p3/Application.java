class Mother {
    static void show() {  // Remove 'static' if you want instance methods
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    static void show() {  // Remove 'static' if you want instance methods
        System.out.println("Hello JUET");
    }
}

public class Application {
    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.show();  // This will display "Hello World"
        
        Child child = new Child();
        child.show();  // This will display "Hello JUET"
        
        Mother m1 = new Child();
        m1.show();  // This will display "Hello World" because static methods are not polymorphic
    }
}
