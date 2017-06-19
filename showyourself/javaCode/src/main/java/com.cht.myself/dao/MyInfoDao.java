/**
 * Created by snail on 17-6-19.
 */

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther cht
 * @create 2017-06-{DAY}-下午10:28
 * @
 */
public class MyInfoDao {

    private JdbcTemplate jdbcTemplate;

    public MyInfo query(long id){
        return jdbcTemplate.query("select * from myinfo where id=? ", new Object[]{id},
                new ResultSetExtractor<MyInfo>() {
                    @Override
                    public MyInfo extractData(ResultSet rs) throws SQLException, DataAccessException {
                        MyInfo info = new MyInfo();
                        info.setId(rs.getLong("id"));
                        info.setAge(rs.getInt("age"));
                        info.setCreate_time(rs.getDate("create_time"));
                        info.setModify_time(rs.getDate("modify_time"));
                        info.setName(rs.getString("name"));
                        info.setUsername(rs.getString("username"));
                        info.setPassword(rs.getString("password"));
                        info.setAge(rs.getInt("age"));
                        info.setProfessional(rs.getString("professional"));
                        info.setDegree(rs.getString("degree"));
                        info.setSchool_id(rs.getLong("school_id"));
                        info.setSchool_end_time(rs.getDate("school_end_time"));
                        info.setSchool_start_time(rs.getDate("school_start_time"));
                        info.setLogin_ip(rs.getString("login_ip"));
                        info.setSex(rs.getString("sex"));
                        return info;
                    }
                }
        );

    }



    public boolean insert(MyInfo info){
        String sql = "INSERT INTO myinfo VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        List<Object> params = new ArrayList<Object>();
        params.add(info.getCreate_time());
        params.add(info.getModify_time());
        params.add(info.getName());
        params.add(info.getSex());
        params.add(info.getAge());
        params.add(info.getSchool_id());
        params.add(info.getProfessional());
        params.add(info.getDegree());
        params.add(info.getSchool_start_time());
        params.add(info.getSchool_end_time());
        params.add(info.getLogin_ip());
        params.add(info.getPassword());
        return jdbcTemplate.update(sql,params.toArray())==1?true:false;
    }

    public boolean delete(long id){
         int row = jdbcTemplate.update("ALTER TABLE myinfo set status=0 where id=?",new Object[]{id});
         return row == 1?true:false;

    }
    public boolean modify(MyInfo info){
        StringBuilder sql = new StringBuilder("ALTER TABLES myinfo set create_time=?," +
                "create_time=?, modify_time=?, name=?, sex=?, age=?, school_id=?, professional=?, " +
                "degree=?, school_start_time=?, school_end_time=?,login_ip=?,password=?,status=?");
        List<Object> params = new ArrayList<Object>();
        params.add(info.getCreate_time());
        params.add(info.getModify_time());
        params.add(info.getName());
        params.add(info.getSex());
        params.add(info.getAge());
        params.add(info.getSchool_id());
        params.add(info.getProfessional());
        params.add(info.getDegree());
        params.add(info.getSchool_start_time());
        params.add(info.getSchool_end_time());
        params.add(info.getLogin_ip());
        params.add(info.getPassword());
        int row = jdbcTemplate.update(sql.toString(),params.toArray());
        return row==1?true:false;
    }
}
