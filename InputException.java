public class InputException extends Exception {
  private String str;

  public void str(String str) throws Exception {
    this.str = str;
    try {
      if (this.str.equals("")) {
        throw new Exception("Пустая строка");
      }
    } catch (NullPointerException ex) {
      throw new NullPointerException("Ошибка в строке");
    }
  }
}
