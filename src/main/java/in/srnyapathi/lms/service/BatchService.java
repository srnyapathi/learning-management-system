package in.srnyapathi.lms.service;

import in.srnyapathi.lms.domain.Batch;
import lombok.NonNull;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BatchService {
  Mono<Batch> find(String id);

  Flux<Batch> getAll();

  Mono<Batch> save(@NonNull Batch course);

  Mono<Batch> edit(String id, @NonNull Batch course);

  Mono<Void> delete(String id);
}
