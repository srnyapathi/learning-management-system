package in.srnyapathi.lms.service;

import in.srnyapathi.lms.domain.Subject;
import lombok.NonNull;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SubjectService {
  Mono<Subject> find(String id);

  Flux<Subject> getAll();

  Mono<Subject> save(@NonNull Subject course);

  Mono<Subject> edit(String id, @NonNull Subject course);

  Mono<Void> delete(String id);
}
