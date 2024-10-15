public class AbstractClass {
    public static void main(String[] args) {
Square s = new Square();
s.area();
s.perimeter();
s.changeSize(4);
s.area();
s.perimeter();
}
}
abstract class Shapes {
    int size;
    Shapes() {
        size = 2;
    }
    void area() {
        System.out.println("Length of shape is " + size +" Area is "+size*size);
    }
    abstract void perimeter();
}
class Square extends Shapes {
    void changeSize(int size) {
        this.size = size;
    }
    void area()
    {
      System.out.println("Length of Square is " + size +" Area is "+size*size); 
    }
    void perimeter() {
        System.out.println("Perimeter of Square " + size * 2);
    }
}
