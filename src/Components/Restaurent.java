package Components;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Restaurent{
    private String _id;
    private String restoName;
    private String restoAddress;
    private int orderQuantity;
    private int restoOwnerCode = 500;

//    private List<String> menuItems;
    HashMap<String, Integer> menuItems;
//    list<String> checkUserName;

    public Restaurent(String _id, String userName, String name, String address, int orderQuantity, List<String> menuItems) {

        this._id = _id;
        this.restoName = name;
        this.restoAddress = address;
        this.orderQuantity = orderQuantity;
        this.menuItems = new HashMap<>();
    }
    public int getPrice(String item){
        if(menuItems.containsKey(item)){
            int rs = menuItems.get(item);
            return rs;
        }
            return 0;

    }
    public void setMenuItems(HashMap menuItems, int codeOfUser) {
        if(codeOfUser == restoOwnerCode){
            this.menuItems = menuItems;
        }else{
            System.out.println("You are not authorized to do that, Code is wrong");
        }
    }
    public HashMap getMenu() {
        return this.menuItems;
    }
    public void addItemsInMenu(String newMenuItem, int price,int codeOfUser){
        if(codeOfUser == restoOwnerCode){
            if(!menuItems.containsKey(newMenuItem)){
                menuItems.put(newMenuItem, price);
            }else{
                System.out.println("Item is already present in menu");
            }
        }
    }
    public void removeMenuItem(List<String> menuItems, int codeOfUser, String menuToRemove){
        if(codeOfUser == restoOwnerCode){
            menuItems.remove(menuToRemove);
        }
    }

//    public void booking(){
//
//    }
}









