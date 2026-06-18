package college_management_system.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "departments")
public class DepartmentM {

    @Id
    private String departmentId;

    private String departmentName;
    private String hodName;
}