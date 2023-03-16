import com.google.gson.annotations.SerializedName;

public class University {
    @SerializedName("Айди университета")
    private String id;
    @ SerializedName("Название университета")
    private String fullName;
    @SerializedName("Краткое название")
    private String shortName;
    @SerializedName("Год основания")
    private int yearOfFoundation;
    @SerializedName("Факультет")
    private StudyProfile studyProfile;



    public String getId() {
        return id;
    }

    public University setId(String id) {
        this.id = id;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public University setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getShortName() {
        return shortName;
    }

    public University setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public University setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
        return this;
    }

    public StudyProfile getStudyProfile() {
        return studyProfile;
    }

    public University setStudyProfile(StudyProfile studyProfile) {
        this.studyProfile = studyProfile;
        return this;
    }

    @Override
    public String toString() {
        return "University{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", studyProfile=" + studyProfile.profileName +
                '}';
    }
}









