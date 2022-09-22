package FormacionBackend3.MongoDB.domain;

import FormacionBackend3.MongoDB.dtos.UserInputDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User {

    @Id
    private String userId;
    private String name;
    private Integer age;

    public void createUser(UserInputDTO userInputDTO) {
        this.userId = userInputDTO.getUserId();
        this.name = userInputDTO.getName();
        this.age = userInputDTO.getAge();
    }
}
