package org.example.beans;

public class BlueDart implements DeliveryService{

    static
    {
        System.out.println("BlueDart class is loaded.");
    }
    public BlueDart()
    {
        System.out.println("BlueDart object is created");

    }
    @Override
    public boolean courierService(double amount) {
        System.out.println("Courier is delivered through BlueDart and amount "+amount+" is paid");
        return true;
    }
}
