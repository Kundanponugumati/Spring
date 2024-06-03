package org.example.beans;

public class Amazon {

    static
    {
        System.out.println("amazon class is loaded.");
    }
    DeliveryService service;
    public Amazon(){
        System.out.println("Amazon class is instantiated.");
    }
    public Amazon(DeliveryService service)
    {
        this.service = service;
    }
    public void setService(DeliveryService service)
    {
        this.service = service;
    }

    public void delivery(double amount)
    {
        service.courierService(amount);
    }
}
