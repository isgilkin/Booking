public class Schedule {
    private String city;
    private String date;
    private int id;
    private int numberOfSeats;
    private String time;
    public Schedule(String city, String date, int id, String time, int numberOfSeats){
        this.city = city;
        this.date = date;
        this.id = id;
        this.time = time;
        this.numberOfSeats = numberOfSeats;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
