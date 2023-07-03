/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package beli.in;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * FXML Controller class
 *
 * @author user
 */
public class CobainController implements Initializable {

    @FXML
    private TableView<Item> tableView;
    @FXML
    private TableColumn<Item, String> idBarangColumn;
    @FXML
    private TableColumn<Item, String> namaBarangColumn;
    @FXML
    private TableColumn<Item, String> hargaBarangColumn;
    @FXML
    private Spinner<Integer> jumlahSpinner;
    @FXML
    private Button resetButton;
    @FXML
    private Button checkoutButton;
    @FXML
    private Label hargaTotalLabel;
    @FXML
    private ImageView imageView;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public void initialize() {
        // Initialize database connection
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdatabase", "username", "password");
            statement = connection.createStatement();

            // Perform database operations
            resultSet = statement.executeQuery("SELECT * FROM yourtable");
            while (resultSet.next()) {
                // Retrieve data from the result set
                String idBarang = resultSet.getString("IDBarang");
                String namaBarang = resultSet.getString("NamaBarang");
                String hargaBarang = resultSet.getString("HargaBarang");

                // Create an Item object and add it to the table view
                Item item = new Item(idBarang, namaBarang, hargaBarang);
                tableView.getItems().add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
