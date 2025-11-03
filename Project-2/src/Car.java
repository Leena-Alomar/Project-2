public class Car{
    private String code;
    private Route route;
    private int maxCapacity;

    public Car(){}

    public Car(String code, Route route, int maxCapacity){
        this.code=code;
        this.route=route;
        this.maxCapacity=maxCapacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity=maxCapacity;

    }
    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String DisplayInfo() {
        return "Car Information \uD83D\uDE98:\n\uD83D\uDD39 The Car Code : "+getCode()+"\n"+route.DisplayInfo()+"\n\uD83D\uDD39 The Maximum Capacity: "+getMaxCapacity();
    }

    public boolean CheckSeat(){
        if(maxCapacity>0){
            setMaxCapacity(maxCapacity-1);
            System.out.println("The Car Is Booked");
            return true;
        }else{
            System.out.println("The Car Is Full");
            return false;
        }

    }

}
