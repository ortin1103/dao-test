package nitro.com.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String firstName;
    String secondName;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "passport")
private Set<StudentDetail> studentDetails;

    public Student() {
    }

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void addDetail(StudentDetail studentDetail){
        if (studentDetails == null) studentDetails=new HashSet<StudentDetail>();
        studentDetails.add(studentDetail);

    }
    public Set<StudentDetail> getStudentDetails(){
        return studentDetails;
    }
    public String toString(){
        return "["+getFirstName()+" , "+getSecondName()+" "+getStudentDetails().toString()+" ]";
    }
}
