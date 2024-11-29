//EXAMPLE-1
class Pen{
    String color; //properties
    String type;  //properties
    void print(){   //method
        System.out.println("writing something");
    }
    void print2()
    {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
public class Example1 {
    public static void main(String[] args) {
       Pen p1 = new Pen();
       p1.color = "blue";
       p1.type = "gel";
       p1.print();
       p1.print2();
       Pen p2 = new Pen();
       p2.color = "red";
       p2.type = "ball";
       p2.print2();
    }
}
