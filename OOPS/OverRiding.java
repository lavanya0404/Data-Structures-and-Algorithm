public class OverRiding {
  public static void main(String[] args) {
      Deer d = new Deer();
      d.eat();
      d.breathes();
      Animals s = new Animals();
      s.eat();
      s.breathes();
      d.legs();
  }
}
class Animals {
  void eat(){
    System.out.println("Eats anything");
  }
  void breathes(){
    System.out.println("Breathes");
  }
}
class Deer extends Animals{
  void eat(){
    System.out.println("Eats grass");
  }
  void legs()
  {
    System.out.println("Has legs");
  }
}