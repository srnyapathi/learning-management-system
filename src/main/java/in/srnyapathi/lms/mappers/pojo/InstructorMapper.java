package in.srnyapathi.lms.mappers.pojo;

import in.srnyapathi.lms.model.Instructor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InstructorMapper {
  InstructorMapper INSTANCE = Mappers.getMapper(InstructorMapper.class);

  Instructor instructorDomainToDto(in.srnyapathi.lms.domain.Instructor instructor);

  in.srnyapathi.lms.domain.Instructor batchDtoToDomain(Instructor instructor);
}
