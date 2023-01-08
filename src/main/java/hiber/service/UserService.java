package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers(); // на что его переименовать ? и зачем ?

    User getUser(Car car);
}
