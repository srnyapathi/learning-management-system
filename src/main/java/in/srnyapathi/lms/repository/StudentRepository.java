package in.srnyapathi.lms.repository;

import in.srnyapathi.lms.domain.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StudentRepository extends ReactiveMongoRepository<Student, String> {}
