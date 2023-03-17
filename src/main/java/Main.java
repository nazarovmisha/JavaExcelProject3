import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Student> students = Input.inputStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator = ComparatorClass.getStudentEnum(StudentEnum.AVG_EXAM_SCORE);
        students.stream()
                .sorted(studentComparator.reversed());
        //Создаем Json из коллекции студентов
        String jsonStudentList = JsonUtil.studentListToJson(students);
        System.out.println("Сериализация коллекций студентов");
        System.out.println(jsonStudentList);
        //Создаем новую коллекцию из Json
        System.out.println("Десериализация в коллекцию студентов");
        List<Student> newStudents = JsonUtil.fromJsonToStudentList(jsonStudentList);
        for (Student stud : newStudents) {
            System.out.println(stud);
        }
        //Сравниваем коллекции по длине
        System.out.println("Коллекции равны по длине ?" + (newStudents.size() == students.size()));
        System.out.println("Сериализация элементов коллекции студентов");
        //Создаем Json из отдельных элементов коллеции студентов
        students.forEach(student -> {
            String studentJsonObj = JsonUtil.studentsToJSON(student);
            System.out.println(studentJsonObj);
            System.out.println("Объект студента из Json");
            //Создаем элемент студента из Json
            Student studentFromJson = JsonUtil.fromJsonToStudent(studentJsonObj);
            System.out.println(studentFromJson);
        });

        List<University> universities = Input.inputUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator = ComparatorClass
                .getUniversityEnum(UniversityEnum.FULL_NAME);
        universities.stream()
                .sorted(universityComparator);
        //Создаем Json из коллекции университетов
        System.out.println("Сериализация элементов коллекции университетов");
        String jsonUniversityList = JsonUtil.universityListToJson(universities);
        System.out.println(jsonUniversityList);
        //Десериализация коллекции университетов
        System.out.println("Десериализация в коллекцию университетов");
        List<University> newUniversities = JsonUtil.fromJsonToUniversityList(jsonUniversityList);
        for (University uni : newUniversities) {
            System.out.println(uni);
        }
        System.out.println("Коллекции равны по длине?" + (universities.size() == newUniversities.size()));
        System.out.println("Сериализация коллекции университетов");
        //Создаем Json из отдельных элементов университетов
        universities.forEach(university -> {
            String universityJsonObj = JsonUtil.universityToJson(university);
            System.out.println(universityJsonObj);
            University universityFromJson = JsonUtil.fromJsonToUniversity(universityJsonObj);
            System.out.println("Создаем элемент университета из Json");
            //Создаем элемент университета из Json
            System.out.println(universityFromJson);
        });
    }
}

