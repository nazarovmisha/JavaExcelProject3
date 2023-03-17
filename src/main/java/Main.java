import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Student> students = Input.inputStudents("src/main/resources/universityInfo.xlsx");
        String jsonStudentList = JsonUtil.studentListToJson(students);
        System.out.println("Сериализация коллекций студентов");
        System.out.println(jsonStudentList);
        System.out.println("Десериализация в коллекцию студентов");
        List<Student> newStudents = JsonUtil.fromJsonToStudentList(jsonStudentList);
        System.out.println("Коллекции равны по длине " + (newStudents.size()==students.size()));
        for (Student stud:newStudents){
            System.out.println(stud);
        }
        System.out.println("Сериализация элементов коллекции студентов");
        students.forEach(student -> {
            String studentJsonObj = JsonUtil.studentsToJSON(student);
            System.out.println(studentJsonObj);
        });

        List<University> universities = Input.inputUniversities("src/main/resources/universityInfo.xlsx");
        String jsonUniversityList = JsonUtil.universityListToJson(universities);
        System.out.println("Сериализация коллекции университетов");
        System.out.println(jsonUniversityList);
        System.out.println("Сериализация элементов коллекции университетов");
        universities.forEach(university -> {
            String universityJsonObj = JsonUtil.universityToJson(university);
            System.out.println(universityJsonObj);
        });
    }
}

