package dfdpsimulation.foodorder.observer;

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(String status);
}
class Customer implements Observer{
String name;
Customer(String name){
    this.name=name;
}
    @Override
    public void update(String status) {
        System.out.println(name+"  received Update:"+status);
    }
}
public class updatestatus {

    List<Observer>customers=new ArrayList<>();
    public void addCustomer(Observer customer){
        customers.add(customer);
    }
    public void notificationToAll(String status){
        for(Observer c:customers){
            c.update("Ready  Go and Collect at Shop");
        }
    }
}
