public class FedEx implements DeliveryService{
    @Override
    public boolean courierService(double amount) {
        System.out.println("Courier is delivered through FedEx and amount paid is "+amount);
        return true;
    }
}
