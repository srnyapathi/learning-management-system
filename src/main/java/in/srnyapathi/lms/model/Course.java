package in.srnyapathi.lms.model;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Course {
  private String id;
  private String courseName;
}
