package com.nizsimsek.hospitalims.DataAccess.Abstract;

import com.nizsimsek.hospitalims.Entities.Concrete.Patient;

import java.util.List;

public interface IPatientDao {
    List<Patient> GetAll();

    void Add(Patient patient);

    void Update(Patient patient);

    void Delete(String nationalId);

    Patient GetByNationalId(String nationalId);
}
