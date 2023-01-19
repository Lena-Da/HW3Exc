public class Telephone {
  String[] array;

  public void setArray(String[] array) {
    this.array = array;
  }

  public int getTel() {
    for (int i = 0; i < array.length; i++) {
      try {
        int number = Integer.parseInt(array[i]);
        return i;
      } catch (NumberFormatException e) {
        if (i == array.length - 1) {
          System.out.println("Проверьте номер телефона");
        }
      }
    }
    return -1;
  }
}