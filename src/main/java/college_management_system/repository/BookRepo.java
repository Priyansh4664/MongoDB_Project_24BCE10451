package college_management_system.repository;

import college_management_system.model.BookM;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<BookM, String> {
}