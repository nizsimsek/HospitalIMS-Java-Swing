package com.nizsimsek.hospitalims.Business.Concrete;

import com.nizsimsek.hospitalims.Business.Abstract.IUserService;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.UserDao;
import com.nizsimsek.hospitalims.Entities.Concrete.User;

import java.util.List;

public class UserManager implements IUserService {

    private final UserDao _userDao;

    public UserManager(UserDao userDao) {
        this._userDao = userDao;
    }

    @Override
    public List<User> GetAll(){
        return _userDao.GetAll();
    }

    @Override
    public void Add(User user) {
        _userDao.Add(user);
    }

    @Override
    public void Update(User user) {
        _userDao.Update(user);
    }

    @Override
    public void Delete(String nationalId) {
        _userDao.Delete(nationalId);
    }

    @Override
    public User GetByUsername(String username) {
        return _userDao.GetByUsername(username);
    }
}
