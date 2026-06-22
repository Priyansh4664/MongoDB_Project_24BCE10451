package college_management_system.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "departments")
public class DepartmentM {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String departmentId;

    private String departmentName;
    private String hodName;
}