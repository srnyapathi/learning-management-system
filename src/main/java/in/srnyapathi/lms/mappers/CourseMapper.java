package in.srnyapathi.lms.mappers;

import in.srnyapathi.lms.model.Course;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseMapper {
    CourseMapper INSTANCE = Mappers.getMapper( CourseMapper.class );

    Course courseDomainToDto(in.srnyapathi.lms.domain.Course course);
    in.srnyapathi.lms.domain.Course courseDtoToDomain(Course course);
}
