import java.util.ArrayList;

public class UpdateSQL {
    static ArrayList<User> users = UserService.readUsers();
    static void update(String SQL){
        String[] a = SQL.split(" ");
        String id = a[4].split("=")[1];
        String name = "name";
        String password = "password";
        String age = "age";

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)){
                for (int j = 4; j < a.length; j++) {
                    if (name.equals(a[j].split("=")[0])){
                        users.get(i).setName(a[j].split("=")[1]);
                    }
                    else if (password.equals(a[j].split("=")[0])){
                        users.get(i).setPassword(a[j].split("=")[1]);
                    }
                    else if (age.equals(a[j].split("=")[0])){
                        users.get(i).setAge(a[j].split("=")[1]);
                    }

                }
            }
        }
        UserService.saveUsers(users);




    }
}
