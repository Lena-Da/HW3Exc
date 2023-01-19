public class InputCheck {
  String[] array;
  int count;
  int result;

  public void setArray (String[] array) {
    this.array = array;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int check() {
    result = 0;
    if (array.length > count) {
      return -1;
    } else if (array.length < count) {
      return -2;
    }
    return result;
  }
}