package in.srnyapathi.lms.controller;

import in.srnyapathi.lms.mappers.CourseMapper;
import in.srnyapathi.lms.model.Course;
import in.srnyapathi.lms.service.CourseService;
import java.util.function.Consumer;
import java.util.function.Function;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/course/")
@RequiredArgsConstructor
@Slf4j
public class CourseController {

  final CourseService courseService;

  Consumer<Course> mapperLog = mapperVal -> log.debug("Value returning from mapper {}", mapperVal);
  Function<in.srnyapathi.lms.domain.Course, Course> domainToDto =
      CourseMapper.INSTANCE::courseDomainToDto;
  Function<Course, in.srnyapathi.lms.domain.Course> dtoToDomain =
      CourseMapper.INSTANCE::courseDtoToDomain;
  Consumer<in.srnyapathi.lms.domain.Course> valueFromService =
      srVal -> log.debug("Value returning from service {} ", srVal);
  Consumer<Void> valueFromDelete = srVal -> log.debug("service layer value deleted from db");

  @GetMapping("/{id}")
  public ResponseEntity<Mono<Course>> get(@PathVariable("id") String id) {
    return ResponseEntity.ok(
        courseService.find(id).doOnNext(valueFromService).map(domainToDto).doOnNext(mapperLog));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Mono<Void>> delete(@PathVariable("id") String id) {
    return ResponseEntity.status(HttpStatus.OK)
        .body(courseService.delete(id).doOnNext(valueFromDelete));
  }

  @PostMapping
  public ResponseEntity<Mono<Course>> create(@RequestBody Course course) {
    return ResponseEntity.status(HttpStatus.OK)
        .body(
            courseService
                .save(dtoToDomain.apply(course))
                .doOnNext(valueFromService)
                .map(domainToDto));
  }

  @PatchMapping("/{id}")
  public ResponseEntity<Mono<Course>> create(
      @PathVariable("id") String id, @RequestBody Course course) {
    return ResponseEntity.status(HttpStatus.OK)
        .body(
            courseService
                .edit(id, dtoToDomain.apply(course))
                .doOnNext(valueFromService)
                .map(domainToDto));
  }

  @GetMapping
  public ResponseEntity<Flux<Course>> list() {
    return ResponseEntity.status(HttpStatus.OK).body(courseService.getAll().map(domainToDto));
  }
}
