package nitro.com.Entity;

import javax.persistence.*;

@Entity
public class StudentDetail {



    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

private String passport;

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public StudentDetail() {
    }

    public StudentDetail(String passport) {
        this.passport = passport;
    }
    public String toString(){
        return " pass "+getPassport();

    }
}
