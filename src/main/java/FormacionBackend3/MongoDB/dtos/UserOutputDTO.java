package FormacionBackend3.MongoDB.dtos;

import FormacionBackend3.MongoDB.domain.User;
import lombok.Getter;

@Getter
public class UserOutputDTO {

    private String userId;
    private String name;
    private Integer age;


    public UserOutputDTO(User user) {
        this.userId = user.getUserId();
        this.name = user.getName();
        this.age = user.getAge();
    }
}
