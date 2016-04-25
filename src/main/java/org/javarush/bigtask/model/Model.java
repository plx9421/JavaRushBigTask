package org.javarush.bigtask.model;


/**
 * Created by Alexey on 28.03.2016.
 */
public interface Model {
    ModelData getModelData();

    void loadUserById(long userId);

    void loadUsers();

    void loadDeletedUsers();

    void deleteUserById(long id);

    void changeUserData(String name, long id, int level);
}
