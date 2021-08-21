package in.srnyapathi.lms.repository;

import in.srnyapathi.lms.domain.Batch;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepository extends ReactiveMongoRepository<Batch, String> {}
