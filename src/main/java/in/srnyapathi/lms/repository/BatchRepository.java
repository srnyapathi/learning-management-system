package in.srnyapathi.lms.repository;

import in.srnyapathi.lms.domain.Batch;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BatchRepository extends ReactiveMongoRepository<Batch, String> {}
