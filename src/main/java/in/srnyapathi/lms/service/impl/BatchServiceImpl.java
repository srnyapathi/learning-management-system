package in.srnyapathi.lms.service.impl;

import in.srnyapathi.lms.domain.Batch;
import in.srnyapathi.lms.repository.BatchRepository;
import in.srnyapathi.lms.service.BatchService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class BatchServiceImpl implements BatchService {

  private final BatchRepository repository;

  @Override
  public Mono<Batch> find(String id) {
    return repository.findById(id);
  }

  @Override
  public Flux<Batch> getAll() {
    return repository.findAll();
  }

  @Override
  public Mono<Batch> save(@NonNull Batch batch) {
    return repository.save(batch).doOnNext(cr -> log.debug("Batch Created {}", cr));
  }

  @Override
  public Mono<Batch> edit(String id, @NonNull Batch batch) {
    return repository.save(batch).doOnNext(cr -> log.debug("Batch modified {} ", cr));
  }

  @Override
  public Mono<Void> delete(String id) {
    return repository.deleteById(id).doOnNext(cr -> log.debug("Batch Deleted {} ", cr));
  }
}
