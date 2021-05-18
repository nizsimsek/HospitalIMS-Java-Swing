package com.nizsimsek.hospitalims.DataAccess.Abstract;

import com.nizsimsek.hospitalims.Entities.Concrete.Doctor;

import java.util.List;

public interface IDoctorDao {
    List<Doctor> GetAll();

    void Add(Doctor doctor);

    void Update(Doctor doctor);

    void Delete(String nationalId);

    Doctor GetByNationalId(String nationalId);
}
