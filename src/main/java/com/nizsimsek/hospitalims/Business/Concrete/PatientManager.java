package com.nizsimsek.hospitalims.Business.Concrete;

import com.nizsimsek.hospitalims.Business.Abstract.IPatientService;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PatientDao;
import com.nizsimsek.hospitalims.Entities.Concrete.Patient;

import java.util.List;

public class PatientManager implements IPatientService {

    private final PatientDao _patientDao;

    public PatientManager(PatientDao patientDao) {
        this._patientDao = patientDao;
    }

    @Override
    public List<Patient> GetAll() {
        return _patientDao.GetAll();
    }

    @Override
    public void Add(Patient patient) {
        _patientDao.Add(patient);
    }

    @Override
    public void Update(Patient patient) {
        _patientDao.Update(patient);
    }

    @Override
    public void Delete(String nationalId) {
        _patientDao.Delete(nationalId);
    }

    @Override
    public Patient GetByNationalId(String nationalId) {
        return _patientDao.GetByNationalId(nationalId);
    }
}
