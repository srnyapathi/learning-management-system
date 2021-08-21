package in.srnyapathi.lms.repository;

import in.srnyapathi.lms.domain.Subject;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends ReactiveMongoRepository<Subject, String> {}
