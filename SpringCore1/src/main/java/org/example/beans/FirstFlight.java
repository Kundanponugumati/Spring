package org.example.beans;

public class FirstFlight implements DeliveryService{

    static
    {
        System.out.println("FirstFlight class is loaded.");
    }
    public FirstFlight()
    {
        System.out.println("FirstFlight obj is created");
    }
    @Override
    public boolean courierService(double amount) {
        System.out.println("Courier is delivered through FistFlight and amount "+amount+" is paid");
        return true;
    }
}
