package FormacionBackend3.MongoDB.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("usuario")
public class User {

    @Id
    private String userId;
    private String name;
    private Integer age;
}
