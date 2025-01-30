
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}


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


class Voice {
    private Animal[] animals;

    public void prepareVoice() {
        animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void hear() {
        if (animals == null) {
            System.out.println("You need to call prepareVoice() first!");
            return;
        }
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}


class Voice2 extends Voice {
    public void templateMethod() {
        prepareVoice();
        hear();
    }

    public static void main(String[] args) {
        Voice2 voice2 = new Voice2();
        voice2.templateMethod(); 
    }
}
