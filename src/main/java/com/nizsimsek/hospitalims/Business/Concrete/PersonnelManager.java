package com.nizsimsek.hospitalims.Business.Concrete;

import com.nizsimsek.hospitalims.Business.Abstract.IPersonnelService;
import com.nizsimsek.hospitalims.DataAccess.Concrete.Hibernate.PersonnelDao;
import com.nizsimsek.hospitalims.Entities.Concrete.Personnel;

import java.util.List;

public class PersonnelManager implements IPersonnelService {

    private final PersonnelDao _personnelDao;

    public PersonnelManager(PersonnelDao personnelDao) {
        this._personnelDao = personnelDao;
    }

    @Override
    public List<Personnel> GetAll() {
        return _personnelDao.GetAll();
    }

    @Override
    public void Add(Personnel personnel) {
        _personnelDao.Add(personnel);
    }

    @Override
    public void Update(Personnel personnel) {
        _personnelDao.Update(personnel);
    }

    @Override
    public void Delete(String nationalId) {
        _personnelDao.Delete(nationalId);
    }

    @Override
    public Personnel GetByNationalId(String nationalId) {
        return _personnelDao.GetByNationalId(nationalId);
    }
}
