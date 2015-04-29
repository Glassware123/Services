package tr.com.desa.request;


public class AutoSeviceRequest {
    private String plate;
    private String departurePoint;
    private String destinationPoint;
    private String carry;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public String getCarry() {
        return carry;
    }

    public void setCarry(String carry) {
        this.carry = carry;
    }
}
