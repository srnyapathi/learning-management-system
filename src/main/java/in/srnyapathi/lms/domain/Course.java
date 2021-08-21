package in.srnyapathi.lms.domain;

import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Data
@Document
public class Course {
  @Id private String id;
  private String courseName;
  @DBRef private List<Subject> subjects;
}
