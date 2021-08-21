package in.srnyapathi.lms.service.impl;

import in.srnyapathi.lms.domain.Subject;
import in.srnyapathi.lms.repository.SubjectRepository;
import in.srnyapathi.lms.service.SubjectService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

  private final SubjectRepository repository;

  @Override
  public Mono<Subject> find(String id) {
    return repository.findById(id);
  }

  @Override
  public Flux<Subject> getAll() {
    return repository.findAll();
  }

  @Override
  public Mono<Subject> save(@NonNull Subject course) {
    return repository.save(course).doOnNext(cr -> log.debug("Subject Created {}", cr));
  }

  @Override
  public Mono<Subject> edit(String id, @NonNull Subject course) {
    return repository.save(course).doOnNext(cr -> log.debug("Subject modified {} ", cr));
  }

  @Override
  public Mono<Void> delete(String id) {
    return repository.deleteById(id).doOnNext(cr -> log.debug("Subject Deleted {} ", cr));
  }
}
