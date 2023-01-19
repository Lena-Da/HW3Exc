public class Main {

  public static void main(String[] args) throws Exception, InputException {
    String str = new Input().inputString();
    int count = 6;
    String[] inputStr = str.split(" ");

    InputCheck check = new InputCheck();
    check.setArray(inputStr);
    check.setCount(count);
    var err = check.check();
    switch (err) {
      case -1:
        System.out.println("Вы ввели много данных");
        break;
      case -2:
        System.out.println("Вы ввели мало данных");
        break;
    }

    String[] result = new String[6];

    Birthday birth = new Birthday();
    birth.setArray(inputStr);
    int dateIndex = birth.getDate();
    if (dateIndex >= 0) {
      result[3] = inputStr[dateIndex];
    } else {
      throw new RuntimeException("Проверьте дату рождения");
    }

    Telephone tel = new Telephone();
    tel.setArray(inputStr);
    int telIndex = tel.getTel();
    if (telIndex >= 0) {
      result[4] = inputStr[telIndex];
    } else {
      throw new RuntimeException("Проверьте номер телефона");
    }

    Gender gen = new Gender();
    gen.setArray(inputStr);
    int genderIndex = gen.getGender();
    if (genderIndex >= 0) {
      result[5] = result[genderIndex];
    } else {
      throw new RuntimeException("Проверьте пол");
    }

    for (int i = 0; i < 3; i++) {
      result[i] = inputStr[i];
    }
    FileCreate create = new FileCreate();
    create.setData(result);
    create.setPath(result[0] + ".txt");
    create.create();
  }

}
