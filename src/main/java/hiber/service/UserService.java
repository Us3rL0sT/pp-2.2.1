package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> getUserList(); // 👍🏻

    User getUserFromCar(Car car);
}
