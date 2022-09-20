package FormacionBackend3.MongoDB.controller;

import FormacionBackend3.MongoDB.domain.User;
import FormacionBackend3.MongoDB.dtos.UserInputDTO;
import FormacionBackend3.MongoDB.dtos.UserOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    MongoTemplate mt;

    @PostMapping
    public UserOutputDTO addUser(@RequestBody UserInputDTO userInputDTO) {

        User user = new User();
        mt.insert(user);
        mt.save(user);
        return new UserOutputDTO(user);
    }

    @GetMapping("findById/id")
    public UserOutputDTO findById(@PathVariable Integer id) {
        User user = mt.findById(id, User.class);
        return new UserOutputDTO(user);
    }

    @GetMapping("get")
    public UserOutputDTO getAll() {
        List<User> users = mt.findAll(User.class);
        users.forEach(System.out::println);
        return null;
    }
}
