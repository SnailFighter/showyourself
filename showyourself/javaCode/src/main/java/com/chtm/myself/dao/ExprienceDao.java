package com.chtm.myself.dao;


/**
 * Created by snail on 17-6-20.
 */


import com.chtm.myself.entity.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther cht
 * @create 2017-06-20-下午12:50
 * @工作经历dao
 */
@Component
public class ExprienceDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean insert(Experience experience){
        String sql = "insert into experience values (?,?,?,?,?,?,?,?)";
        List<Object> params = new ArrayList<>();
        params.add(experience.getCompany_name());
        params.add(experience.getContent());
        params.add(experience.getDevelop_environment());
        params.add(experience.getDevelop_tool());
        params.add(experience.getEnd_time());
        params.add(experience.getStart_time());
        params.add(experience.getFrameworks());
        params.add(experience.getJob());
        params.add(experience.getStatus());
        return jdbcTemplate.update(sql,params.toArray())==1?true:false;
    }

    public boolean delete(long id){
        String sql ="alter table experience set status=0 where id=?";
        return jdbcTemplate.update(sql,new Object[]{id})==1?true:false;
    }


    public boolean alter(Experience experience){
        StringBuilder sql = new StringBuilder("alter table experience set company_name=?,");
        sql.append("jon=?,start_time=?,end_tiem=?,content=?,develop_environment=?,");
        sql.append("develop_tool=?,frameworks=?,status=? where id=?");
        return jdbcTemplate.update(sql.toString(),experience.getId())==1?true:false;
    }

    public Experience query(long id){
        String sql = "select * from experience where id=?";
        return jdbcTemplate.query(sql, new Object[]{id}, new ResultSetExtractor<Experience>() {
            @Override
            public Experience extractData(ResultSet rs) throws SQLException, DataAccessException {
                rs.next();
                Experience experience = new Experience();
                experience.setCompany_name(rs.getString("company_name"));
                experience.setContent(rs.getString("content"));
                experience.setDevelop_environment(rs.getString("develop_environment"));
                experience.setDevelop_tool(rs.getString("develop_tool"));
                experience.setFrameworks(rs.getString("frameworks"));
                experience.setEnd_time(rs.getDate("end_time"));
                experience.setStart_time(rs.getDate("start_time"));
                experience.setStatus(rs.getInt("status"));
                return experience;
            }
        });
    }

    //根据用户id查询工作经历
    public List<Experience> queryByUserId(long id, int status){
        String sql = "select * from experience where user_id=? and status=?";
        return jdbcTemplate.query(sql,new Object[]{id,status},new RowMapper<Experience>(){
            @Override
            public Experience mapRow(ResultSet rs, int i) throws SQLException {
                rs.next();
                Experience experience = new Experience();
                experience.setCompany_name(rs.getString("company_name"));
                experience.setContent(rs.getString("content"));
                experience.setDevelop_environment(rs.getString("develop_environment"));
                experience.setDevelop_tool(rs.getString("develop_tool"));
                experience.setFrameworks(rs.getString("frameworks"));
                experience.setEnd_time(rs.getDate("end_time"));
                experience.setStart_time(rs.getDate("start_time"));
                experience.setStatus(rs.getInt("status"));
                return experience;
            }
        });
    }

}
