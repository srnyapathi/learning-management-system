package in.srnyapathi.lms.repository;

import in.srnyapathi.lms.domain.Instructor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface InstructorRepository extends ReactiveMongoRepository<Instructor, String> {}
