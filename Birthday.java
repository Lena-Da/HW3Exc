import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Birthday {
  String[] array;

  public void setArray(String[] array) {
    this.array = array;
  }

  public int getDate() {
    Date birth;
    SimpleDateFormat df = new SimpleDateFormat("dd.mm.yyyy", Locale.getDefault());
    for (int i = 0; i < array.length; i++) {
      try {
        birth = df.parse(array[i]);
        return i;
      } catch (ParseException ex) {
        if (i == array.length - 1) {
          System.out.println("Проверьте дату рождения");
        }
      }
    } return -1;
  }
}
