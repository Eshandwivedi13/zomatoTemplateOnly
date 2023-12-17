package Components;
import java.util.ArrayList;
import java.util.List;
public class userAvailibility{
    private static List<String> users = new ArrayList<String>();
    private int adminCode;
    public userAvailibility() {
        adminCode = 500;
    }
    public void setUsers(List<String> users, int codeOfUser) {
        if(codeOfUser == this.adminCode){
            userAvailibility.users = users;
        }else{
            System.out.println("You are not authorized to do that, Code is wrong");
        }
    }

    public  List<String> getUsers() {
        return users;
    }

    public boolean checkUsers(String userName){
        if(users.contains(userName)){
            return true;
        }
        users.add(userName);
        return false;
    }
}
