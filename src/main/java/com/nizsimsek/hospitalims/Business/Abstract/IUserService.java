package com.nizsimsek.hospitalims.Business.Abstract;

import com.nizsimsek.hospitalims.Entities.Concrete.User;

import java.util.List;

public interface IUserService {
    List<User> GetAll();

    void Add(User user);

    void Update(User user);

    void Delete(String nationalId);

    User GetByUsername(String username);
}
