package org.javarush.bigtask;


import org.javarush.bigtask.controller.Controller;
import org.javarush.bigtask.model.MainModel;
import org.javarush.bigtask.model.Model;
import org.javarush.bigtask.view.EditUserView;
import org.javarush.bigtask.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();

        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventShowDeletedUsers();
        usersView.fireEventOpenUserEditForm(126);

        editUserView.fireEventUserDeleted(124);
        editUserView.fireEventUserChanged("Ivanov Ivan", 123, 5);
    }
}
