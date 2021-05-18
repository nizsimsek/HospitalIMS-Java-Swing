package com.nizsimsek.hospitalims.Business.Abstract;

import com.nizsimsek.hospitalims.Entities.Concrete.Doctor;

import java.util.List;

public interface IDoctorService {
    List<Doctor> GetAll();

    void Add(Doctor doctor);

    void Update(Doctor doctor);

    void Delete(String nationalId);

    Doctor GetByNationalId(String nationalId);
}
