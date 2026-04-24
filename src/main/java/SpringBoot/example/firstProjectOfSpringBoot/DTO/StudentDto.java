package SpringBoot.example.firstProjectOfSpringBoot.DTO;

public class StudentDto {


    private String email;
    private  String studentName;
    private  boolean  isAdult;
    private  long id;
    private  int age ;



    public StudentDto(long id, String email, String studentName, boolean isAdult,  int age ) {

        this.email = email;
        this.studentName = studentName;
        this.isAdult = isAdult;
        this.id = id;
        this.age = age;
    }

    public StudentDto() {

    }

    public StudentDto(long id, String mail, String yash, boolean b, int i, int i1) {
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
