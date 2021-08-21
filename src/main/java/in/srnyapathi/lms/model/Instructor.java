package in.srnyapathi.lms.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Instructor {
    @Id
    private String id;
    private String name;
    private String title;
    private String qualification;
    private Integer exp;
}
