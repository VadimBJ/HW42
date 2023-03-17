public class RectangleRunner {
  public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle(20, 30);
    Rectangle rectangle2 = new Rectangle(30, 20);
    Rectangle rectangle3 = new Rectangle(35, 20);
    Rectangle rectangle4 = new Rectangle(20, 30);
    System.out.println("r1=r2? " + rectangle1.equals(rectangle2));
    System.out.println("r2=r3? " + rectangle2.equals(rectangle3));
    System.out.println("r1=r4? " + rectangle1.equals(rectangle4));
  }
}
