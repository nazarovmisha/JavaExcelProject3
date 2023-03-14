
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.List;

public class JsonUtil {
    private JsonUtil() {
    }

    public static String studentsToJSON(Student student) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(student);
    }

    public static String studentListToJson(List<Student>students){
        return new GsonBuilder().setPrettyPrinting().create().toJson(students);
    }
}
