
import com.google.gson.GsonBuilder;

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
    public static String universityToJson(University university){
        return new GsonBuilder().setPrettyPrinting().create().toJson(university);
    }

    public static String universityListToJson(List<University>universities){
        return new GsonBuilder().setPrettyPrinting().create().toJson(universities);
    }

    public static List<Student> fromJsonToStudentList(String string){
        return new GsonBuilder().setPrettyPrinting().create().fromJson(string);
    }
}
