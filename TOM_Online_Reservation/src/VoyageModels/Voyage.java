package VoyageModels;

public abstract class Voyage {
    protected String origin;
    protected String destination;
    protected String date;
    protected String time;
    protected String voyageType;  // "Bus" or "Plane"
    protected String voyageCode;
    protected boolean[] seats;

    public Voyage(String origin, String destination, String date, String time, String voyageType, String voyageCode) {
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.voyageType = voyageType;
        this.voyageCode = voyageCode;
        this.seats = new boolean[16];
    }

    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getVoyageType() { return voyageType; }
    public String getVoyageCode() {return voyageCode;}
    public boolean[] getSeats() {return seats;}

    public void setOrigin(String origin) { this.origin = origin; }
    public void setDestination(String destination) { this.destination = destination; }
    public void setDate(String date) { this.date = date; }
    public void setTime(String time) { this.time = time; }
    public void setVoyageType(String voyageType) { this.voyageType = voyageType; }
    public void setVoyageCode(String voyageCode) {this.voyageCode = voyageCode;}

    public void reserveSeat(int seatNumber) { //When a user make a reservation by selecting a seat, that seat is going to be reserved for that trip
        seats[seatNumber] = true;}
    public void unReserveSeat(int seatNumber) { //When a user removes their reservation that seat will be available again
        seats[seatNumber] = false;}

}