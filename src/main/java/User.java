import java.io.Serializable;

public class User implements Serializable {
//    public static final long serialVersionUID = 123455661L;
    private String id;
    private String name;
    private String password;
    private String age;

    public User() {
    }

    public User(String id, String login, String password, String year) {
        this.id = id;
        this.name = login;
        this.password = password;
        this.age = year;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + name + '\'' +
                ", password='" + password + '\'' +
                ", year=" + age +
                '}';
    }
}
