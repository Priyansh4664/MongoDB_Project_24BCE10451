package college_management_system.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "staff")
public class StaffM {

    @Id
    private String staffId;

    private String name;
    private String designation;
    private double salary;

    @DBRef
    private DepartmentM department;
}