package Components;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
public class User extends Restaurent{
    private String _id;
    private String userName;
    private String Name;
    private String Address;
//    private int orderQuantity;
    HashMap<String, ArrayList<Integer>> Cart;

    public User(String _id, String userName, String name, String address) {
        if(userAvailibility.checkUsers(userName)){
            System.out.println("User with that name Already exists choose different userName");
            return;
        }
        this._id = _id;
        this.userName = userName;
        this.Name = name;
        this.Address = address;
        Cart= new HashMap<>();

    }

    public void addToCart(String item, int quantity){
        if(getPrice(item) != 0){
            if(Cart.containsKey(item)){
                int getQuantitiy = Cart.get(item).get(0);
                int newQuantity = getQuantitiy+ quantity;
                int getPrice = Cart.get(item).get(1);
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(newQuantity);
                temp.add(getPrice);
                Cart.put(item,  temp);
            }else{
                int price = getPrice(item);
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(quantity);
                temp.add(price);
                Cart.put(item,  temp);
            }
        }else{
            System.out.println("This item is not even present in menu");
        }
//        else{
//            ArrayList<Integer> temp = new ArrayList<>();
//            temp.add(quantity);
//            temp.add(getPrice);
//            Cart.put(item,  temp);
//        }
    }
    public HashMap<String, ArrayList<Integer>> getTheCart(){
        return Cart;
    }

    public void placeOrder(String name, ){
        if(userName.equals(name)){

        }
        System.out.println("You are not the user, access denied");
    }

}
