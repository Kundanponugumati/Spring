public class Amazon {
    private DeliveryService service;
    public void setDeliveryService(DeliveryService service)
    {
     this.service = service;
    }
    public Amazon()
    {
    }
    public Amazon(DeliveryService service)
    {
        this.service = service;
    }
    public boolean initiateDelivery(double amount)
    {
       return  service.courierService(amount);
    }
}
