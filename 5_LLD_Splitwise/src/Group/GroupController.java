package Group;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupController {
    List<Group> groups;

    public GroupController() {
        groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void deleteGroup(String groupId) throws Exception{
        Group group = getGroupById(groupId);
        groups.remove(group);
    }

    public Group getGroupById(String groupId) throws Exception{
        List<Group> filteredGroup = groups.stream().filter(group -> group.getGroupId().equalsIgnoreCase(groupId)).collect(Collectors.toList());

        if(filteredGroup.isEmpty())
            throw new Exception("groupId " + groupId + " not found");

        return filteredGroup.get(0);
    }

    public List<Group> getAll() {
        return groups;
    }

    public List<Group> getByUserId(String userId) {
        return groups.stream().filter(group -> group.getUsers().stream().filter(user -> !user.getUserId().equalsIgnoreCase(userId)).toList().isEmpty()).toList();
    }
}
