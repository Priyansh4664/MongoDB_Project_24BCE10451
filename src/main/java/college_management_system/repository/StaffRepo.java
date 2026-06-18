package college_management_system.repository;

import college_management_system.model.StaffM;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StaffRepo extends MongoRepository<StaffM, String> {
}