package SpringBoot.example.firstProjectOfSpringBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.hibernate.annotations.DialectOverride;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "students")
public class StudentEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private String email;
    private  String studentName;
    private  boolean  isAdult;
    private  long id;
    private  int age ;

}
