
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String SQL = scanner.nextLine();



            switch (SQL.split(" ")[0]){
                case "insert":
                    InsertSQL.insert(SQL);
                    break;
                case "delete":
                    DeleteSQL.delete(SQL);
                    break;
                case "update":
                    UpdateSQL.update(SQL);
                    break;
                case "select":
                    SelectSQL.select(SQL);
                    break;
                default:
                    break;
            }

        }

    }



}

