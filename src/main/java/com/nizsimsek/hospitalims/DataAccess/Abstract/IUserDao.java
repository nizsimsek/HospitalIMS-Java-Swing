package com.nizsimsek.hospitalims.DataAccess.Abstract;

import com.nizsimsek.hospitalims.Entities.Concrete.User;

import java.util.List;

public interface IUserDao {
    List<User> GetAll();

    void Add(User user);

    void Update(User user);

    void Delete(String nationalId);

    User GetByUsername(String username);
}
