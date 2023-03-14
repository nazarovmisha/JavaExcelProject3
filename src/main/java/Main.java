
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonUtil.studentsToJSON("src/main/resources/universityInfo.xlsx");
        List<University> universities = Input.inputUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator = ComparatorClass
                .getUniversityEnum(UniversityEnum.FULL_NAME);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);

        List<Student> students = Input.inputStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator = ComparatorClass.getStudentEnum(StudentEnum.AVG_EXAM_SCORE);
        students.stream()
                .sorted(studentComparator.reversed())
                .forEach(System.out::println);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonUniversities = gson.toJson(universities);
        String jsonStudents = gson.toJson(students);
        System.out.println(jsonUniversities);
        System.out.println(jsonStudents);
    }
}

