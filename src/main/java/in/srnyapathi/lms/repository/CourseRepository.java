package in.srnyapathi.lms.repository;

import in.srnyapathi.lms.domain.Course;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends ReactiveMongoRepository<Course, String> {}
