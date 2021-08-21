package in.srnyapathi.lms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Subject {
  private String id;
  private String name;
  private Type type;
  private Instructor instructorName;
}
