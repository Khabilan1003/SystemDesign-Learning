package Splitwise;

import Group.GroupController;
import User.UserController;

public class Splitwise {
    private UserController userController;
    private GroupController groupController;

    public Splitwise() {
        userController = new UserController();
        groupController = new GroupController();
    }

    public UserController getUserController() {
        return userController;
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    public GroupController getGroupController() {
        return groupController;
    }

    public void setGroupController(GroupController groupController) {
        this.groupController = groupController;
    }
}
