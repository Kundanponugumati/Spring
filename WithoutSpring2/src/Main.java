public class Main {
    public static void main(String[] args)
    {
        Amazon obj = new Amazon(new BlueDart());// constructor injection.
//        DeliveryService service = new FirstFlight();
//        obj.setDeliveryService(new FedEx()); // setter injection.
        obj.initiateDelivery(2235);
    }
}