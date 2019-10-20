package adapter.a2;

import java.io.IOException;

/**
 * @author ningxy
 * @date 2019/10/20
 */
public interface FileIO {
    void readFromFile(String filename) throws IOException;

    void writeToFile(String filename) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);
}
