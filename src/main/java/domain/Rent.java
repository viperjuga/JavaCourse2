package domain;

import enums.CarStatus;

import java.util.Date;

public class Rent {
    private Long id;
    private User client;
    private Car car;
    private Date dateFrom;
    private Date dateTo;
    private CarStatus status;
    private Date reservDate;
    private Date returnDate;
    private User operatorGaveCar;
    private User operatorAcceptCar;

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }

    public Date getReservDate() {
        return reservDate;
    }

    public void setReservDate(Date reservDate) {
        this.reservDate = reservDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public User getOperatorGaveCar() {
        return operatorGaveCar;
    }

    public void setOperatorGaveCar(User operatorGaveCar) {
        this.operatorGaveCar = operatorGaveCar;
    }

    public User getOperatorAcceptCar() {
        return operatorAcceptCar;
    }

    public void setOperatorAcceptCar(User operatorAcceptCar) {
        this.operatorAcceptCar = operatorAcceptCar;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
