package OOP;
class Animal{
    String sound;
    void MakeSound(){
        System.out.println("These are animals.");
    }
}
class Dog extends Animal{
    Dog(String sound){
        this.sound = sound;
    }
    void MakeSound(){
        System.out.println("I am a dog.");
        System.out .println(sound);
    }
}

class Cat extends Animal{
    Cat(String sound){
        this.sound = sound;
    }
    void MakeSound(){
        System.out.println("I am a Cat.");
        System.out .println(sound);
    }
}

class Zoo extends Animal{

    String DogSound = "woof woof woof...";
    String CatSound = "meow meow meow...";

    void Speak(){

        super.MakeSound();
        System.out.println("Dog's sound : " + DogSound);
        System.out.println("Cat's sound : " + CatSound);
    }
}

class Exercise3 {
    public static void main(String[] args){

        System.out.println();
        Dog dog = new Dog("woof woof woof...");
        dog.MakeSound();

        System.out.println();
        Cat cat = new Cat("meow meow meow...");
        cat.MakeSound();

        System.out.println();
        Zoo sound = new Zoo();
        sound.Speak();
        System.out.println();

    }
}
