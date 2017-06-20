package com.chtm.myself.service;


/**
 * Created by snail on 17-6-20.
 */


import com.chtm.myself.dao.ExprienceDao;
import com.chtm.myself.entity.Experience;
import com.chtm.myself.interfaces.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther cht
 * @create 2017-06-20-下午1:39
 * @
 */
@Service("experienceService")
public class ExperienceServiceImplements implements ExperienceService {

    @Autowired
    private ExprienceDao exprienceDao;

    @Override
    public Experience query(long id) {
        return exprienceDao.query(id);
    }

    @Override
    public boolean insert(Experience experience) {
        return exprienceDao.insert(experience);
    }

    @Override
    public boolean delete(long id) {
        return exprienceDao.delete(id);
    }

    @Override
    public boolean modify(Experience experience) {
        return exprienceDao.alter(experience);
    }
}
