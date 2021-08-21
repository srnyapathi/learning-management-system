package in.srnyapathi.lms.service;

import in.srnyapathi.lms.domain.Student;
import lombok.NonNull;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentService {
  Mono<Student> find(String id);

  Flux<Student> getAll();

  Mono<Student> save(@NonNull Student course);

  Mono<Student> edit(String id, @NonNull Student course);

  Mono<Void> delete(String id);
}
