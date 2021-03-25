/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseSeven;

/**
 *
 * @author AldyAkbarrizky
 */
// ******************************************************************
// RatePanel.java
//
// Panel for a program that converts different currencies to
// U.S. Dollars
// ******************************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RatePanel extends JPanel {

    private double[] rate; // exchange rates
    private String[] currencyName;
    private JLabel result;
    // Add combobox
    private JComboBox cb;
    private JTextField cost_tf;

    // ------------------------------------------------------------
    // Sets up a panel to convert cost from one of 6 currencies
    // into U.S. Dollars. The panel contains a heading, a text
    // field for the cost of the item, a combo box for selecting
    // the currency, and a label to display the result.
    // ------------------------------------------------------------
    public RatePanel() {
        this.setLayout(new BorderLayout());
        JLabel title = new JLabel("How much is that in dollars?");
        JPanel header = new JPanel();
        title.setFont(new Font("Helvetica", Font.BOLD, 20));
        // Set up the arrays for the currency conversions
        currencyName = new String[]{"Select the currency..",
            "European Euro", "Canadian Dollar",
            "Japanese Yen", "Australian Dollar",
            "Indian Rupee", "Mexican Peso"};
        rate = new double[]{0.0, 1.2103, 0.7351,
            0.0091, 0.6969,
            0.0222, 0.0880};
        result = new JLabel(" ------------ ");
        header.add(title);
        header.add(result);
        
        // Add combo box
        cb = new JComboBox(currencyName);
        cb.addActionListener(new ComboListener());
        cb.setPreferredSize(new Dimension(100, 10));
        
        // Add text field and label
        JPanel tf_panel = new JPanel();
        JLabel tf = new JLabel("Amount");
        cost_tf = new JTextField(12);
        cost_tf.setPreferredSize(new Dimension(120, 20));
        tf_panel.add(tf);
        tf_panel.add(cost_tf);
        
        add(header, BorderLayout.NORTH);
        add(cb, BorderLayout.CENTER);
        add(tf_panel, BorderLayout.SOUTH);
    }

    // ******************************************************
    // Represents an action listener for the combo box.
    // ******************************************************
    private class ComboListener implements ActionListener {

        // --------------------------------------------------
        // Determines which currency has been selected and
        // the value in that currency then computes and
        // displays the value in U.S. Dollars.
        // --------------------------------------------------
        public void actionPerformed(ActionEvent event) {
            try {
                int index = cb.getSelectedIndex();
                double amount = Double.valueOf(cost_tf.getText());
                result.setText(amount +" " + currencyName[index]
                        + " = " + rate[index]*amount + " U.S. Dollars");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please only input number in text field.");
            }
        }
    }
}