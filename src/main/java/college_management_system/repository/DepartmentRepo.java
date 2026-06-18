package college_management_system.repository;

import college_management_system.model.DepartmentM;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepo extends MongoRepository<DepartmentM, String> {
}