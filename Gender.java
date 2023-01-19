public class Gender {
    String[] array;

    public void setArray(String[] array) {
        this.array = array;
    }

    public int getGender() throws Exception {
        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals("м") || array[i].equals("ж")) {
                    return i;
                }
            }
        } catch (Exception ex) {
            System.out.println("Проверьте пол");
        } 
        return -1;
    }
}
