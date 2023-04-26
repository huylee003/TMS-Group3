/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Quân
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationSystem extends JFrame {
    private JTextField nameField, dateField, timeField;
    private JButton addButton, editButton, deleteButton;
    private JTable reservationTable;

    private List<Reservation> reservations = new ArrayList<>();
    private DefaultTableModel tableModel;

    public ReservationSystem() {
        setTitle("Reservation System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        JLabel dateLabel = new JLabel("Date (YYYY-MM-DD):");
        dateField = new JTextField(10);

        JLabel timeLabel = new JLabel("Time (HH:MM):");
        timeField = new JTextField(10);

        addButton = new JButton("Add");
        editButton = new JButton("Edit");
        deleteButton = new JButton("Delete");

        tableModel = new DefaultTableModel(new String[]{"Name", "Date", "Time"}, 0);
        reservationTable = new JTable(tableModel);

        // Add components to frame
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(dateLabel);
        inputPanel.add(dateField);
        inputPanel.add(timeLabel);
        inputPanel.add(timeField);
        inputPanel.add(addButton);
        inputPanel.add(editButton);
        inputPanel.add(deleteButton);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(reservationTable), BorderLayout.CENTER);

        // Add event listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String dateStr = dateField.getText();
                String timeStr = timeField.getText();

                LocalDateTime dateTime = LocalDateTime.parse(dateStr + "T" + timeStr);
                Reservation reservation = new Reservation(name, dateTime);

                reservations.add(reservation);
                tableModel.addRow(new Object[]{name, dateStr, timeStr});

                clearFields();
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = reservationTable.getSelectedRow();

                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(ReservationSystem.this, "Please select a reservation to edit.");
                    return;
                }

                Reservation reservation = reservations.get(selectedRow);
                String newName = nameField.getText();
                String newDateStr = dateField.getText();
                String newTimeStr = timeField.getText();

                LocalDateTime newDateTime = LocalDateTime.parse(newDateStr + "T" + newTimeStr);
                reservation.setName(newName);
                reservation.setDateTime(newDateTime);

                tableModel.setValueAt(newName, selectedRow, 0);
                tableModel.setValueAt(newDateStr, selectedRow, 1);
                tableModel.setValueAt(newTimeStr, selectedRow, 2);

                clearFields();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = reservationTable.getSelectedRow();

                if (selectedRow == -1) {
                    JOptionPane.showMessageDialog(ReservationSystem.this, "Please select a reservation to delete.");
                    return;
                }

                reservations.remove(selectedRow);
                tableModel.removeRow(selectedRow);

                clearFields();
            }
        });
    }

    private void clearFields() {
        nameField.setText("");
        dateField.setText("");
        timeField.setText("");
}

public static void main(String[] args) {
    ReservationSystem reservationSystem = new ReservationSystem();
    reservationSystem.setVisible(true);
}
}

class Reservation {
private String name;
private LocalDateTime dateTime;
public Reservation(String name, LocalDateTime dateTime) {
    this.name = name;
    this.dateTime = dateTime;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public LocalDateTime getDateTime() {
    return dateTime;
}

public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
}
}