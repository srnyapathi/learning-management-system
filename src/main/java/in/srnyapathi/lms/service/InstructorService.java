package in.srnyapathi.lms.service;

import in.srnyapathi.lms.domain.Instructor;
import lombok.NonNull;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface InstructorService {
  Mono<Instructor> find(String id);

  Flux<Instructor> getAll();

  Mono<Instructor> save(@NonNull Instructor course);

  Mono<Instructor> edit(String id, @NonNull Instructor course);

  Mono<Void> delete(String id);
}
