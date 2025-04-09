package User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> users;

    public UserController() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUserById(String id) throws Exception{
        List<User> filteredUsers = users.stream().filter((user) -> user.getUserId().equalsIgnoreCase(id)).toList();

        if(filteredUsers.isEmpty())
            throw new Exception("Invalid User Id");

        return filteredUsers.get(0);
    }

    public void deleteUserById(String id) throws Exception {
        User user = getUserById(id);

        users.remove(user);
    }

    public List<User> getAll() {
        return users;
    }
}
