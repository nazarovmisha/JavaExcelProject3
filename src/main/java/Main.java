
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Student> students = Input.inputStudents("src/main/resources/universityInfo.xlsx");
        String jsonStudentList = JsonUtil.studentListToJson(students);
        System.out.println(jsonStudentList);
        students.forEach(student -> {
            String studentJsonObj = JsonUtil.studentsToJSON(student);
            System.out.println(studentJsonObj);
        });
        List<University> universities = Input.inputUniversities("src/main/resources/universityInfo.xlsx");


//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String jsonUniversities = gson.toJson(universities);
//        String jsonStudents = gson.toJson(students);
//        System.out.println(jsonUniversities);
//        System.out.println(jsonStudents);
    }
}

