public interface MyInfoService {

    public MyInfo query(long id);
    public boolean insert(MyInfo info);
    public boolean delete(long id);
    public boolean modify(MyInfo info);
}