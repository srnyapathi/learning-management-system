package in.srnyapathi.lms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Instructor {
  @Id private String id;
  private String name;
  private String title;
  private String qualification;
  private Integer exp;
}
