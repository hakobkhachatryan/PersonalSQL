import java.util.ArrayList;

public class SelectSQL {
    static ArrayList<User> users = UserService.readUsers();
    static void select(String SQL){
        String[] a = SQL.split(" ");
        String id = "";
        String name = "";
        String age = "";

        if (a.length <= 4){
            for (int i = 0; i < users.size(); i++) {
                System.out.println(users.get(i).toString());
            }
        }
        else {
            for (int j = 3; j < a.length; j++) {
                if ("id".equals(a[j].split("=")[0])) {
                    id = a[j].split("=")[1];
                } else if ("name".equals(a[j].split("=")[0])) {
                    name = a[j].split("=")[1];
                }else if ("age".equals(a[j].split("=")[0])) {
                    age = a[j].split("=")[1];
                }
            }
            System.out.println(id + " " + name + " " + age );

            if ((id.length() > 0) || (name.length() > 0) || (age.length() >0)){
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).getId().equals(id) || users.get(i).getName().equals(name) || users.get(i).getAge().equals(age))
                        System.out.println(users.get(i).toString());
                }
            }
            else if ((id.length() > 0) || (name.length() > 0)){
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).getId().equals(id) || users.get(i).getName().equals(name))
                        System.out.println(users.get(i).toString());
                }
            }
            else if ((id.length() > 0) || (age.length() >0)){
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).getId().equals(id) || users.get(i).getAge().equals(age))
                        System.out.println(users.get(i).toString());
                }
            }
            else if ((name.length() > 0) || (age.length() >0)){
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).getName().equals(name) || users.get(i).getAge().equals(age))
                        System.out.println(users.get(i).toString());
                }
            }
            else if (id.length() > 0){
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).getId().equals(id))
                        System.out.println(users.get(i).toString());
                }
            }
            else if (name.length() > 0){
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).getName().equals(name))
                        System.out.println(users.get(i).toString());
                }
            }
            else if (age.length() > 0){
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).getAge().equals(age))
                        System.out.println(users.get(i).toString());
                }
            }
        }



    }

}
