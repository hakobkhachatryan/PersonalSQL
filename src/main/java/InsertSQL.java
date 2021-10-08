import java.util.ArrayList;

//insert into users id:1,name:valod,password:1234,age:5
//        remove from users where id = 1
//        update
//        read


public class InsertSQL {
    static ArrayList<User> users = UserService.readUsers();

    static void insert(String insert){

        String id = "";
        String name = "";
        String password = "";
        String age = "";
        String[] a = insert.split(" ");

        for (int j = 3; j < a.length; j++) {
            if ("id".equals(a[j].split("=")[0])) {
                id = a[j].split("=")[1];
            } else if ("name".equals(a[j].split("=")[0])) {
                name = a[j].split("=")[1];
            } else if ("password".equals(a[j].split("=")[0])) {
                password = a[j].split("=")[1];
            } else if ("age".equals(a[j].split("=")[0])) {
                age = a[j].split("=")[1];
            }
        }
        User user = new User(id,name,password,age);
        users.add(user);
        UserService.saveUsers(users);

    }

}
