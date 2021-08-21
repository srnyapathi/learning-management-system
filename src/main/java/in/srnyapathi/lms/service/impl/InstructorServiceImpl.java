package in.srnyapathi.lms.service.impl;

import in.srnyapathi.lms.domain.Instructor;
import in.srnyapathi.lms.repository.InstructorRepository;
import in.srnyapathi.lms.service.InstructorService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService {

  private final InstructorRepository repository;

  @Override
  public Mono<Instructor> find(String id) {
    return repository.findById(id);
  }

  @Override
  public Flux<Instructor> getAll() {
    return repository.findAll();
  }

  @Override
  public Mono<Instructor> save(@NonNull Instructor course) {
    return repository.save(course).doOnNext(cr -> log.debug("Instructor Created {}", cr));
  }

  @Override
  public Mono<Instructor> edit(String id, @NonNull Instructor course) {
    return repository.save(course).doOnNext(cr -> log.debug("Instructor modified {} ", cr));
  }

  @Override
  public Mono<Void> delete(String id) {
    return repository.deleteById(id).doOnNext(cr -> log.debug("Instructor Deleted {} ", cr));
  }
}
