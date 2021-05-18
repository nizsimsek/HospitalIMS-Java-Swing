package com.nizsimsek.hospitalims.Business.Concrete;

import com.nizsimsek.hospitalims.Business.Abstract.IDoctorService;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.DoctorDao;
import com.nizsimsek.hospitalims.Entities.Concrete.Doctor;

import java.util.List;

public class DoctorManager implements IDoctorService {

    private final DoctorDao _doctorDao;

    public DoctorManager(DoctorDao doctorDao) {
        this._doctorDao = doctorDao;
    }

    @Override
    public List<Doctor> GetAll() {
        return _doctorDao.GetAll();
    }

    @Override
    public void Add(Doctor doctor) {
        _doctorDao.Add(doctor);
    }

    @Override
    public void Update(Doctor doctor) {
        _doctorDao.Update(doctor);
    }

    @Override
    public void Delete(String nationalId) {
        _doctorDao.Delete(nationalId);
    }

    @Override
    public Doctor GetByNationalId(String nationalId) {
        return _doctorDao.GetByNationalId(nationalId);
    }
}
