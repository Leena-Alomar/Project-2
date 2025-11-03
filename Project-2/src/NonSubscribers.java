public class NonSubscribers extends Passenger{

    @Override
    public void Reserved(Car car) {
        double trip=car.getRoute().getTripPrice();
        setTripCost(trip*1.0);
        System.out.println("Your Trip Cost After Discount is: "+getTripCost());
    }

    @Override
    public String DisplayInfo() {
        return"===============================================================\n" + "Passenger Name:"+getName()+"\nPassenger ID: "+getID()+"\nPassenger:Non Subscribed " +"\n"+ getReservedCar().DisplayInfo() ;
    }
}
