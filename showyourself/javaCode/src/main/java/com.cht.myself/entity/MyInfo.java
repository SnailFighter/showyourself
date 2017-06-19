import java.util.Date;

public class MyInfo {

    private long id;
    private String username;
    private String password;
    private String name;
    private String sex;
    private int age;
    private long school_id;
    private String professional;
    private String degree;
    private Date school_start_time;
    private Date school_end_time;
    private String login_ip;
    private Date create_time;
    private Date modify_time;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSchool_id() {
        return school_id;
    }

    public void setSchool_id(long school_id) {
        this.school_id = school_id;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Date getSchool_start_time() {
        return school_start_time;
    }

    public void setSchool_start_time(Date school_start_time) {
        this.school_start_time = school_start_time;
    }

    public Date getSchool_end_time() {
        return school_end_time;
    }

    public void setSchool_end_time(Date school_end_time) {
        this.school_end_time = school_end_time;
    }

    public String getLogin_ip() {
        return login_ip;
    }

    public void setLogin_ip(String login_ip) {
        this.login_ip = login_ip;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }
}