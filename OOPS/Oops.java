public class Oops {
  public static void main(String[] args) {
    Dog fudge = new Dog();
    fudge.breath();
    fudge.legs(4);
    fudge.eat();
    fudge.breed();
  }
}
class Animal {
 String color;
 void eat() {
  System.out.println("Eats");}
 void breath(){
  System.out.println("Breathes");
 }
}
class Mammal extends Animal {
  void legs(int legs) {
    System.out.println("I have "+legs+" legs");
  }
}
class Dog extends Mammal {
  void breed() {
    System.out.println("I am a pug");
  }
}

class Fish extends Animal
{
  void fins(int fin)
  {
    System.out.println("I have "+fin+" fins");
  }
}