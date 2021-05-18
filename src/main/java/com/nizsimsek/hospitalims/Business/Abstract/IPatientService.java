package com.nizsimsek.hospitalims.Business.Abstract;

import com.nizsimsek.hospitalims.Entities.Concrete.Patient;

import java.util.List;

public interface IPatientService {
    List<Patient> GetAll();

    void Add(Patient patient);

    void Update(Patient patient);

    void Delete(String nationalId);

    Patient GetByNationalId(String nationalId);
}
