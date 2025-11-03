public class Route {
    private String startAddress;
    private String endAddress;
    private int tripPrice;

    public Route(){}

    public Route(String startAddress, String endAddress, int tripPrice){
        this.startAddress=startAddress;
        this.endAddress=endAddress;
        this.tripPrice=tripPrice;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }

    public String DisplayInfo() {
        return "The Route Information \uD83D\uDEE3\uFE0F: " +
                "\n\uD83D\uDD39 The Start Destination: "+getStartAddress()+"\n\uD83D\uDD39 The End Destination: "+
                getEndAddress()+"\n\uD83D\uDD39 Trip Price: "+getTripPrice();
    }
}
