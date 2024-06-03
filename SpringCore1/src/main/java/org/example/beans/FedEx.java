package org.example.beans;

public class FedEx implements DeliveryService{

    static
    {
        System.out.println("FedEx class is loaded.");
    }
    public FedEx()
    {
        System.out.println("FedEx object is created");

    }
    @Override
    public boolean courierService(double amount) {
        System.out.println("Courier is delivered through FedEx and amount "+amount+" is paid");
        return true;
    }
}
