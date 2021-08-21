package in.srnyapathi.lms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Batch {
    @Id
    private String id;
    private String title;
    private Course course;
    @DBRef
    private BatchType type;
    private String roomName;
    private String meetingId;
    @DBRef
    private List<Student> students;
}

