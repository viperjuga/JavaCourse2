package database;

import domain.Car;
import domainProduct.Product;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class MSDatabaseImpl extends JDBCRepository implements Database {
    @Override
    public void addProduct(Car car) {
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
            System.out.println("Exception while execute ProductDAOImpl.save()");
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            closeConnection(connection);
        }
    }

    @Override
    public Optional<Product> getByTitle(String title) {
        return Optional.empty();
    }

    @Override
    public boolean remove(Product product) {
        return false;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }
}
