package com.chtm.myself.interfaces;

import com.chtm.myself.entity.Experience;

import java.util.List;

/**
 * Created by snail on 17-6-20.
 */
public interface ExperienceService {
    public Experience query(long id);
    public boolean insert(Experience experience);
    public boolean delete(long id);
    public boolean modify(Experience experience);
    public List<Experience> queryByUserId(Long id,int status);
}
