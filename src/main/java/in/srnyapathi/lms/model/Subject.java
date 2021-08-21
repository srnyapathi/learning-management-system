package in.srnyapathi.lms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Subject {
  @Id private String id;
  private String name;
  private Type type;
  @DBRef private Instructor instructorName;
}
