package org.example;

class Jeuxvideo {
    public void animalSound() {
        System.out.println("The witcher en avril");
    }
}
class games extends Jeuxvideo {
    public void animalSound() {
        System.out.println("Games jeux video");
    }
}

class mystere extends Jeuxvideo {
    public void animalSound() {
        System.out.println("tu verras si tu es sage");
    }
}

class Main {
    public static void main(String[] args) {
        Jeuxvideo myAnimal = new Jeuxvideo();
        Jeuxvideo myPig = new games();
        Jeuxvideo myDog = new mystere();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}

