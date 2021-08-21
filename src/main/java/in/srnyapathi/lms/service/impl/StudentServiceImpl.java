package in.srnyapathi.lms.service.impl;

import in.srnyapathi.lms.domain.Student;
import in.srnyapathi.lms.repository.StudentRepository;
import in.srnyapathi.lms.service.StudentService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

  private final StudentRepository repository;

  @Override
  public Mono<Student> find(String id) {
    return repository.findById(id);
  }

  @Override
  public Flux<Student> getAll() {
    return repository.findAll();
  }

  @Override
  public Mono<Student> save(@NonNull Student course) {
    return repository.save(course).doOnNext(cr -> log.debug("Student Created {}", cr));
  }

  @Override
  public Mono<Student> edit(String id, @NonNull Student course) {
    return repository.save(course).doOnNext(cr -> log.debug("Student modified {} ", cr));
  }

  @Override
  public Mono<Void> delete(String id) {
    return repository.deleteById(id).doOnNext(cr -> log.debug("Student Deleted {} ", cr));
  }
}
