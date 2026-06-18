package college_management_system.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "students")
public class StudentM {

    @Id
    private String studentId;

    private String name;
    private String email;
    private String phone;
    private String address;

    @DBRef
    private DepartmentM department;
}