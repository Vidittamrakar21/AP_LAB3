abstract class Bharatvanshi {
    abstract void fight();
    abstract void obey();
    abstract void kind();
}

class Pandav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Pandav fights bravely.");
    }

    @Override
    void obey() {
        System.out.println("Pandav obeys orders.");
    }

    @Override
    void kind() {
        System.out.println("Pandav is kind.");
    }
}

class Kaurav extends Bharatvanshi {
    @Override
    void fight() {
        System.out.println("Kaurav fights fiercely.");
    }

    @Override
    void obey() {
        System.out.println("Kaurav disobeys orders.");
    }

    @Override
    void kind() {
        System.out.println("Kaurav is cruel.");
    }
}

class Vikarn extends Kaurav {
    @Override
    void obey() {
        System.out.println("Vikarn obeys orders.");
    }

    @Override
    void kind() {
        System.out.println("Vikarn is kind.");
    }
}

public class Main {
    public static void main(String[] args) {
        Pandav arjun = new Pandav();
        Pandav bheem = new Pandav();
        Kaurav duryodhan = new Kaurav();
        Vikarn vikarn = new Vikarn();

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
