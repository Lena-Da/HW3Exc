import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Input {
  private String inputStr;
  public String inputString() throws Exception {
    System.out.print("Ваедите данные через пробел: Фамилия Имя Отчество, дата рождения dd.mm.yyyy, номер телефона, пол м/ж \n");
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, Charset.forName("Cp866")))) {
      inputStr = br.readLine();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
    new InputException().str(inputStr);
    return inputStr;
  }
}