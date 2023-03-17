//  Задача 2* (не обязательно)
//  Создайте класс Rectangle (прямоугольник).
//
//  При создании класс должен получать длины сторон. Сохраните их в памяти как поля (атрибуты)
//  класса "длина" и "ширина".
//
//  При попытке сравнить два прямоугольника они должны оказываться одинаковыми,
//  если сами прямоугольники как геометрические фигуры равны - если их можно совместить,
//  повернув и наложив друг на друга.
public class Rectangle {
  private int width;
  private int length;

  public Rectangle(int width, int length) {
    this.width = width;
    this.length = length;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Rectangle other)) {
      return false; //
    }
    if (this.length == other.length && this.width == other.width) {
      return true;
    } else if (this.length == other.width && this.width == other.length) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 17 * width * length;
  }
}
