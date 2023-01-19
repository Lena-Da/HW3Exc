import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {
  String[] data;
  String path;

  public void setData(String[] data) {
    this.data = data;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public void create() {
    try (FileWriter write = new FileWriter(new File(path), true)) {
      write.write(this.toString() + "\n");

    } catch (RuntimeException | IOException ex) {
      ex.printStackTrace();
    }
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < this.data.length; i++) {
      result.append("-" + data[i] + "-");
    }
    return result.toString();
  }
}
