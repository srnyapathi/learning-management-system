package in.srnyapathi.lms.service;

import in.srnyapathi.lms.domain.Course;
import lombok.NonNull;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CourseService {

    Mono<Course> find(String id);

    Flux<Course> getAll();

    Mono<Course> save(@NonNull Course course);

    Mono<Course> edit(String id, @NonNull Course course);

    Mono<Void> delete(String id);
}
