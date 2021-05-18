package com.nizsimsek.hospitalims.DataAccess.Abstract;

import com.nizsimsek.hospitalims.Entities.Concrete.Personnel;

import java.util.List;

public interface IPersonnelDao {
    List<Personnel> GetAll();

    void Add(Personnel personnel);

    void Update(Personnel personnel);

    void Delete(String nationalId);

    Personnel GetByNationalId(String nationalId);
}
