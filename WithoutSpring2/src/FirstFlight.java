public class FirstFlight implements DeliveryService{
    @Override
    public boolean courierService(double amount) {
        System.out.println("Courier is delivered through FirstFlight and amount paid is "+amount);
        return true;
    }
}
