// Base class
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclasses
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Pig extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Oink");
    }
}

class Goat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bleat");
    }
}

class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}

// Voice class with the prepareVoice() method
class Voice {
    public void prepareVoice() {
        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.prepareVoice();
    }
}
