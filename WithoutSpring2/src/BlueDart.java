public class BlueDart implements DeliveryService{
    @Override
    public boolean courierService(double amount) {
        System.out.println("Courier is delivered through BlueDart and amount paid is "+amount);
        return true;
    }
}
