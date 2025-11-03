public class Subscribes extends Passenger{

    @Override
    public void Reserved(Car car) {
        double trip=car.getRoute().getTripPrice();
        setTripCost(trip*0.5);
        System.out.println("Your Trip Cost After Discount is: "+getTripCost());
    }

    @Override
    public String DisplayInfo() {
        return "===============================================================\n" +"\uD83D\uDD39 Passenger Name:"+getName()+"\n\uD83D\uDD39 Passenger ID: "+getID()+"\n\uD83D\uDD39 Passenger: Subscribed " +"\n"+ getReservedCar().DisplayInfo() ;
    }
}
