package in.srnyapathi.lms.service;

import in.srnyapathi.lms.domain.Course;
import in.srnyapathi.lms.repository.CourseRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

  private final CourseRepository repository;

  @Override
  public Mono<Course> find(String id) {
    return repository.findById(id);
  }

  @Override
  public Flux<Course> getAll() {
    return repository.findAll();
  }

  @Override
  public Mono<Course> save(@NonNull Course course) {
     return repository.save(course).doOnNext(cr -> log.debug("Course Created {}", cr));
  }

  @Override
  public Mono<Course> edit(String id, @NonNull Course course) {
    return repository.save(course).doOnNext(cr -> log.debug("Course modified {} ", cr));
  }

  @Override
  public Mono<Void> delete(String id) {
    return repository.deleteById(id).doOnNext(cr -> log.debug("Course Deleted {} ", cr));
  }
}
