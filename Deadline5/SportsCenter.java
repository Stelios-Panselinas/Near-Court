/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class SportsCenter {
    private String selectedSport;

    public SportsCenter(String selectedSport) {
        this.selectedSport = selectedSport;
    }

    public void open() {
        // Perform actions when the SportsCenter is opened
        System.out.println("Opening SportsCenter for " + selectedSport);
        // Add your desired functionality here
        String url = "jdbc:mysql://localhost:3306/nearcourtdatabase";
        String username = "root";
        String password = "";

        // SQL query
        String query = "SELECT * FROM timetable WHERE court_type = ? AND Availability=0";

        List<String> sportList = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(query)) {
            // Set the selected sport as a parameter in the query
            statement.setString(1, selectedSport);

            // Execute the query and retrieve the result set
            try (ResultSet resultSet = statement.executeQuery()) {
                // Process the result set
                while (resultSet.next()) {
                    // Retrieve data from the result set
                    String time = resultSet.getString("time");
                    String player = resultSet.getString("court_name");
                    // ...

                    // Do something with the retrieved data
                    // System.out.println("Sport: " + type);
                    //System.out.println("Player: " + player);
                    // ...

                    // Add the retrieved items to the list

                    //sportList.add(player);
                    sportList.add(time);

                    for (String item : sportList) {
                        System.out.println(item);
                    }
                }
            }

            SelectCourt selectCourt = new SelectCourt();
            selectCourt.setItems(sportList);
            selectCourt.setVisible(true);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
// Other methods and functionality for SportsCenter
// ...