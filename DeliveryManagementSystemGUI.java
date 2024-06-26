import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DeliveryManagementSystemGUI extends JFrame {

    public DeliveryManagementSystemGUI() {
        setTitle("Delivery Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Center the window

        // Create components
        JLabel titleLabel = new JLabel("Delivery Management System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton optimizeRouteButton = new JButton("Optimize Route");
        optimizeRouteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Simulate Dijkstra's algorithm for route optimization
                JOptionPane.showMessageDialog(null, "Running Dijkstra's algorithm for route optimization.");

                // Additional logic for testing purposes
                String result = simulateDijkstraAlgorithm();
                JOptionPane.showMessageDialog(null, "Dijkstra's algorithm result: " + result);
            }
        });

        JButton processDataButton = new JButton("Process Data");
        processDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Simulate sorting algorithm for data processing
                JOptionPane.showMessageDialog(null, "Running sorting algorithm for data processing.");

                // Additional logic for testing purposes
                String result = simulateSortingAlgorithm();
                JOptionPane.showMessageDialog(null, "Sorting algorithm result: " + result);
            }
        });

        // Layout using GridBagLayout for flexibility
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10); // Padding

        // Add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        panel.add(titleLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        panel.add(optimizeRouteButton, constraints);

        constraints.gridx = 1;
        panel.add(processDataButton, constraints);

        // Add panel to the frame
        add(panel);

        // Display the window
        setVisible(true);
    }

    // Simulate Dijkstra's algorithm
    private String simulateDijkstraAlgorithm() {
        // Replace with actual Dijkstra's algorithm logic
        return "Shortest path from A to B";
    }

    // Simulate a sorting algorithm
    private String simulateSortingAlgorithm() {
        // Replace with actual sorting algorithm logic
        return "Data sorted in ascending order";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DeliveryManagementSystemGUI();
            }
        });
    }
}
