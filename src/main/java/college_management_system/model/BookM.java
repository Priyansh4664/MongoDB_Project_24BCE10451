package college_management_system.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "books")
public class BookM {

    @Id
    private String bookId;

    private String bookName;
    private String author;
    private int quantity;
}