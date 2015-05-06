package tr.com.desa.domain;

import javax.persistence.*;

@Entity
@Table(name="autos")
public class AutoMobile {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "PLATE")
    public String plate;

    @Column(name = "DEPARTURE")
    public String departurePoint;

    @Column(name="DESTINATION")
    public String destinationPoint;

    @Column(name = "CARRY")
    public String carry;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String  getDestinationPoint() {
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
