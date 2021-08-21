package in.srnyapathi.lms.repository;

import in.srnyapathi.lms.domain.Subject;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SubjectRepository extends ReactiveMongoRepository<Subject, String> {}
