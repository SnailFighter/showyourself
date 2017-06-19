/**
 * Created by snail on 17-6-19.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @auther cht
 * @create 2017-06-{DAY}-下午7:52
 * @
 */
@Service
public class MyInfoServiceImplements  implements MyInfoService {



    @Override
    public MyInfo query(long id) {
        return null;
    }

    @Override
    public boolean insert(MyInfo info) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public boolean modify(MyInfo info) {
        return false;
    }
}
