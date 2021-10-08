import java.util.ArrayList;

public class DeleteSQL {
    static ArrayList<User> users = UserService.readUsers();
    static void delete(String SQL){
        String[] a = SQL.split(" ");
        String id = a[4].split("=")[1];;

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)){
                users.remove(i);
                UserService.saveUsers(users);
                return;
            }
        }



    }
}
