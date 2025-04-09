import Expense.Expense;
import Group.Group;
import Split.*;
import Splitwise.Splitwise;
import User.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("001" , "Khabilan");
        User user2 = new User("002" , "Deepak");
        User user3 = new User("003" , "Guru");
        User user4 = new User("004" , "Shiva");

        user1.addFriend(user2);
        user1.addFriend(user3);
        user1.addFriend(user4);

        user2.addFriend(user1);
        user2.addFriend(user3);
        user2.addFriend(user4);

        user3.addFriend(user1);
        user3.addFriend(user2);
        user3.addFriend(user4);

        user4.addFriend(user1);
        user4.addFriend(user2);
        user4.addFriend(user3);

        Splitwise splitwise = new Splitwise();

        splitwise.getUserController().addUser(user1);
        splitwise.getUserController().addUser(user2);
        splitwise.getUserController().addUser(user3);
        splitwise.getUserController().addUser(user4);

        Group group1 = new Group("GRP_1" , "Group 1");
        group1.addUser(user1);
        group1.addUser(user2);
        group1.addUser(user3);

        Group group2 = new Group("GRP_2" , "Group 2");
        group2.addUser(user1);
        group2.addUser(user2);
        group2.addUser(user4);

        Group group3 = new Group("GRP_3" , "Group 3");
        group2.addUser(user2);
        group2.addUser(user3);
        group2.addUser(user4);

        splitwise.getGroupController().addGroup(group1);
        splitwise.getGroupController().addGroup(group2);
        splitwise.getGroupController().addGroup(group3);

        // Expense 1
        List<Split> splits1 = new ArrayList<>();
        splits1.add(new Split(user2 , 1000, false));
        splits1.add(new Split(user3 , 1000, false));
        splits1.add(new Split(user4 , 1000, false));
        Expense expense1 = new Expense("EXP_1", "Expense 1", "Expense Description 1", user1, splits1, SplitType.EQUAL, 3000);
        try {
            expense1.validateExpense();
            expense1.getPaidBy().addExpense(expense1);
            splits1.forEach(split -> split.getUser().addExpense(expense1));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Expense 2
        List<Split> splits2 = new ArrayList<>();
        splits2.add(new Split(user1 , 1500, false));
        splits2.add(new Split(user3 , 1000, false));
        splits2.add(new Split(user4 , 2000, false));
        Expense expense2 = new Expense("EXP_2", "Expense 2", "Expense Description 2", user2, splits2, SplitType.UNEQUAL, 4500);
        try {
            expense2.validateExpense();
            expense2.getPaidBy().addExpense(expense2);
            splits2.forEach(split -> split.getUser().addExpense(expense2));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}