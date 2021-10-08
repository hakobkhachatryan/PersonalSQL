import java.io.*;
import java.util.ArrayList;

public class UserService {
    public static  final  String USERS_FILE_NAME = "users";

    public static void saveUsers(ArrayList<User> all) {
        try {
            FileOutputStream fos = new FileOutputStream(USERS_FILE_NAME);
            try {
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for (User user : all){
                    try {
                        oos.writeObject(user);
                    } catch (NotSerializableException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static ArrayList<User> readUsers(){
        ArrayList<User> all = new ArrayList<>();
        boolean cont = true;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(USERS_FILE_NAME));
            while(cont){
                User user = new User();
                try {
                    user = (User)ois.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                if(user != null)
                    all.add(user);
                else
                    cont = false;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e){
            System.out.println();;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return all;
    }
}

