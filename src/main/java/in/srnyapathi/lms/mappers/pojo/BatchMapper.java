package in.srnyapathi.lms.mappers.pojo;

import in.srnyapathi.lms.model.Batch;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BatchMapper {
  BatchMapper INSTANCE = Mappers.getMapper(BatchMapper.class);

  Batch batchDomainToDto(in.srnyapathi.lms.domain.Batch batch);

  in.srnyapathi.lms.domain.Batch batchDtoToDomain(Batch batch);
}
