package in.srnyapathi.lms.mappers.pojo;

import in.srnyapathi.lms.model.Subject;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SubjectMapper {
  SubjectMapper INSTANCE = Mappers.getMapper(SubjectMapper.class);

  Subject subjectDomainToDto(in.srnyapathi.lms.domain.Student student);

  in.srnyapathi.lms.domain.Student subjectDtoToDomain(Subject subject);
}
