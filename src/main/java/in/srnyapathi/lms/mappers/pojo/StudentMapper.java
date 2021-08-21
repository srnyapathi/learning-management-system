package in.srnyapathi.lms.mappers.pojo;

import in.srnyapathi.lms.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
  StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

  Student studentDomainToDto(in.srnyapathi.lms.domain.Student student);

  in.srnyapathi.lms.domain.Student studentDtoToDomain(Student student);
}
