package hiber.service;

import hiber.dao.UserDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    @Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
    public void add(User user) {
        userDao.add(user);
    }
    @Override
    @Transactional(readOnly = true)
    public List<User> getUserList() {
        return userDao.listUsers();
    }

    @Override
    public User getUserFromCar(Car car) {
        return userDao.getUser(car);

    }

}
