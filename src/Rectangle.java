import java.util.Objects;

public class Rectangle {
  private int length;
  private int width;

  public Rectangle(int length, int width) {
    setLength(length);
    setWidth(width);
  }

  public void setLength(int length) {
    if (length < 0) {
      throw new IllegalArgumentException();
    }
    this.length = length;
  }

  public void setWidth(int width) {
    if (width < 0) {
      throw new IllegalArgumentException();
    }
    this.width = width;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) obj;
    return (length == rectangle.length && width == rectangle.width)
        || (length == rectangle.width && width == rectangle.length);
  }

  @Override
  public int hashCode() {
    return 31 * (length * width);
  }
}
