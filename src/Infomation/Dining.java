package Infomation;

import javafx.beans.property.SimpleStringProperty;

public class Dining {
	private final SimpleStringProperty id = new SimpleStringProperty(); 
	private final SimpleStringProperty type = new SimpleStringProperty(); 
	private final SimpleStringProperty status = new SimpleStringProperty(); 
	private final SimpleStringProperty orderId = new SimpleStringProperty(); 
	private final SimpleStringProperty dishId = new SimpleStringProperty(); 

    public String getId() {  
        return id.get();  
    }  
    public void setId(String id) {  
        this.id.set(id);  
    }  
    
    public String getType() {
    	return type.get();
    }
    public void setType(String id) {  
        this.type.set(id);  
    } 
    
    public String getStatus() {  
        return status.get();  
    }  
    public void setStatus(String id) {  
        this.status.set(id);  
    }
    
    public String getOrderId() {
    	return orderId.get();
    }
    public void setOrderId(String id) {  
        this.orderId.set(id);  
    } 
    
    public String getDishId() {  
        return dishId.get();  
    }  
    public void setDishId(String id) {  
        this.dishId.set(id);  
    }
}
