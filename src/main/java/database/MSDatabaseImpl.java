package database;

import domain.Car;
import domain.Rent;
import domain.User;
import enums.CarStatus;
import enums.UserType;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class MSDatabaseImpl extends JDBCRepository implements Database {
    private String birthDateFormat = "yyyy-MM-dd";
    private String rentDateFormat = "yyyy-MM-dd HH:mm:ss";

    @Override
    public void addUser(User user) {
        Connection connection = null;
        try {
            connection = getConnection();
            String sql = "insert into User(Id, FirstName, SecondName, BirthDate, HomeAddressId, UserTypeId) values(default, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement =
                    connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getSecondName());
            SimpleDateFormat sdfr = new SimpleDateFormat(birthDateFormat);
            preparedStatement.setString(3, sdfr.format(user.getBirthDate()));
            preparedStatement.setString(4, String.valueOf(user.getAdrress().getId()));
            preparedStatement.setString(5, String.valueOf(user.getType().getValue()));

            preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()){
                user.setId(rs.getLong(1));
            }
        } catch (SQLException e) {
            System.out.println("Exception while execute MSDatabaseImpl.save()");
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            closeConnection(connection);
        }
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> getAllUsersByType(UserType type) {
        return null;
    }

    @Override
    public void addCar(Car car) {
        Connection connection = null;
        try {
            connection = getConnection();
            String sql = "insert into Car(Id, Mark, Model, MotorCapacity, Color, FuelTypeId, GearboxTypeId) values(default, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement =
                    connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, car.getMark());
            preparedStatement.setString(2, car.getModel());
            preparedStatement.setString(3, String.valueOf(car.getMotorCapacity()));
            preparedStatement.setString(4, car.getColor());
            preparedStatement.setString(5, String.valueOf(car.getFuelType().getValue()));
            preparedStatement.setString(6, String.valueOf(car.getGearboxType().getValue()));

            preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()){
                car.setId(rs.getLong(1));
            }
        } catch (SQLException e) {
            System.out.println("Exception while execute MSDatabaseImpl.save()");
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            closeConnection(connection);
        }
    }

    @Override
    public void removeCar(Car car) {

    }

    @Override
    public void updateCar(Car car) {

    }

    @Override
    public List<Car> getAllCars() {
        return null;
    }

    @Override
    public Optional<Car> getCarById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Car> getFreeCarsForDate(Date date) {
        return null;
    }

    @Override
    public void addRent(Rent rent) {
        Connection connection = null;
        try {
            connection = getConnection();
            String sql = "insert into Rent(Id, ClientId, CarId, DateFrom, DateTo, CarStatusId, ReserveDate, ReturnDate, OperatorIdGaveCar, OperatorIdAcceptCar) values(default, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement =
                    connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, String.valueOf(rent.getClient().getId()));
            preparedStatement.setString(2, String.valueOf(rent.getCar().getId()));
            SimpleDateFormat sdfr = new SimpleDateFormat(rentDateFormat);
            preparedStatement.setString(3, sdfr.format(rent.getDateFrom()));
            preparedStatement.setString(4, sdfr.format(rent.getDateTo()));
            preparedStatement.setString(5, String.valueOf(rent.getStatus().getValue()));
            preparedStatement.setString(6, sdfr.format(rent.getReservDate()));
            preparedStatement.setString(7, sdfr.format(rent.getReturnDate()));
            preparedStatement.setString(8, String.valueOf(rent.getOperatorGaveCar().getId()));
            preparedStatement.setString(9, String.valueOf(rent.getOperatorAcceptCar().getId()));

            preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()){
                rent.setId(rs.getLong(1));
            }
        } catch (SQLException e) {
            System.out.println("Exception while execute MSDatabaseImpl.save()");
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            closeConnection(connection);
        }
    }

    @Override
    public void updateRentStatus(long rentId, CarStatus status) {

    }

    @Override
    public List<Rent> getAllRents() {
        return null;
    }

    @Override
    public List<Rent> getRentsForCar(Long carId) {
        return null;
    }

    @Override
    public List<Rent> getCurrentClientRents(Long clientId) {
        return null;
    }

    @Override
    public List<Rent> getCurrentOperatorRents(Long operatorId) {
        return null;
    }

    @Override
    public List<Rent> getRentWithStatus(CarStatus status) {
        return null;
    }
}
