package SpringBoot.example.firstProjectOfSpringBoot.repository;

import SpringBoot.example.firstProjectOfSpringBoot.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
