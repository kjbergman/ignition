package view.swing;

import co.nz.ignite.dtoLayer.ExtraEquipmentDTO;
import co.nz.ignite.util.UtilMethods;

import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

/**
 * Handles all the window components
 */
public class MainWindow {
    private JFrame frame;
    private JTextField textField;
    private JLabel label;
    private JCheckBox checkBox;
    GridBagConstraints gbc = new GridBagConstraints();

    public MainWindow(String s, String t) {
        ArrayList<ExtraEquipmentDTO> arrayList = getExtras();
        frame = new JFrame(); // creating instance of JFrame
        frame.setSize(500,500);
        frame.setLayout(new GridBagLayout());
        int number =1;
        Font font = new Font("Verdana", Font.ITALIC, 12);

        JButton settingsBtn = new JButton("Settings");
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(settingsBtn, gbc);

        /**
         *
         */
        JLabel vehicleMakeLabel = new JLabel("Vehicle Make: ");
        vehicleMakeLabel.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        frame.add(vehicleMakeLabel, gbc);

        JTextField makeTextField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(makeTextField, gbc);

        /**
         * Model entry
         */
        JLabel vehicleModelLabel = new JLabel("Vehicle Model: ");
        vehicleModelLabel.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        frame.add(vehicleModelLabel, gbc);

        JTextField modelTextField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(modelTextField, gbc);

        /**
         * Price entry
         */
        JLabel vehiclePriceLabel = new JLabel("Vehicle Price: ");
        vehiclePriceLabel.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        frame.add(vehiclePriceLabel, gbc);

        JTextField vehiclePriceField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(vehiclePriceField, gbc);

        JLabel vehicleRebateLabel = new JLabel("Vehicle Rebate: ");
        vehicleRebateLabel.setFont(font);
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        frame.add(vehicleRebateLabel, gbc);

        JTextField vehicleRebateField = new JTextField();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(vehicleRebateField, gbc);

        JLabel vehicleCostLabel = new JLabel("Vehicle Cost: ");
        vehicleCostLabel.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        frame.add(vehicleCostLabel, gbc);

        JTextField vehicleCostField = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(vehicleCostField, gbc);

        JLabel vehicleTypeLabel = new JLabel("Vehicle Type: ");
        vehicleTypeLabel.setFont(font);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        frame.add(vehicleTypeLabel, gbc);

        JRadioButton vehicleTypePassengerRadio = new JRadioButton("Passenger");
        JRadioButton vehicleTypeCommercialRadio = new JRadioButton("Commercial");
        ButtonGroup vehicleTypeRadioBtn = new ButtonGroup();
        vehicleTypeRadioBtn.add(vehicleTypePassengerRadio);
        vehicleTypeRadioBtn.add(vehicleTypeCommercialRadio);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(vehicleTypePassengerRadio, gbc);

        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(vehicleTypeCommercialRadio, gbc);



        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Ignition");
        frame.setVisible(true); // making the frame visible
    }

    public ArrayList<ExtraEquipmentDTO> getExtras(){
        ArrayList<ExtraEquipmentDTO> arrayList = new ArrayList<>();
        arrayList.add(new ExtraEquipmentDTO("Cargoliner", 210, 232.25, false));
        arrayList.add(new ExtraEquipmentDTO("Fab Protection (p)", 3200., 40., false));
        arrayList.add(new ExtraEquipmentDTO("Fire Extinguisher (p)", 800., 49.15, false));
        return arrayList;
    }

    public MainWindow(String s) {
        ArrayList<ExtraEquipmentDTO> arrayList = getExtras();
        frame = new JFrame(); // creating instance of JFrame
        frame.setLayout(new GridLayout(arrayList.size() + 3, 1));
        frame.setSize(400,500); // 400 width and 500 height
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel vehicleDataPanel = new JPanel();
        vehicleDataPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        vehicleDataPanel.add(new JTextField("MAKE"), gbc);

        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        vehicleDataPanel.add(new JTextField("MODEL"), gbc);

        frame.add(vehicleDataPanel);
        frame.add(addColumnNameBox());

        for (ExtraEquipmentDTO equipment : arrayList) {
            JPanel panel = addExtraBox(equipment.getName(), equipment.getPrice());
            this.frame.add(panel);
        }

        JButton jButton = new JButton("Submit");
        jButton.setEnabled(true);
        jButton.setBackground(Color.GREEN);
        this.frame.add(jButton);
        frame.setTitle("Ignition");
        frame.setVisible(true); // making the frame visible
    }

    private JLabel addLabel(String name){
        JLabel label = new JLabel();
        label.setBounds(20, 10, 20, 10);
        label.setText(name);
        return label;
    }

    private JCheckBox addCheckBox(){
        JCheckBox checkBox = new JCheckBox();
        checkBox.setBounds(10, 10, 10, 10);
        return checkBox;
    }

    private JPanel addExtraBox(String name, double price){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,3));
        panel.add(addLabel("\t" + name + "\t"));
        panel.add(addLabel("\t$" + UtilMethods.round(price,2)+ "\t") );
        panel.add(addCheckBox());
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        return  panel;
    }

    private JPanel addColumnNameBox(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,3));
        panel.add(addLabel("\tEXTRA\t"));
        panel.add(addLabel("\tPRICE\t") );
        panel.add(addLabel("\tINCLUDE\t"));
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        return panel;
    }



    /*
    public MainWindow() {
        frame = new JFrame(); // creating instance of JFrame
        addCheckBox();
        addLabel("Testing Swing", 100,50,100, 40);
        addButton("Button", 100,200,200, 40);
        addTextField(100,100, 250,20);
        frame.setSize(400,500); // 400 width and 500 height
        frame.setLayout(null); // using no layout managers
        frame.setTitle("Swing is fun!");
        frame.setVisible(true); // making the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addCheckBox(){
        checkBox = new JCheckBox();
        checkBox.setBounds(100, 10, 250, 20);
        checkBox.setText("Reverse");
        frame.add(checkBox);
    }

    private void addLabel(String name, int xAxis, int yAxis, int width, int height){
        label = new JLabel();
        label.setBounds(xAxis, yAxis, width, height);
        label.setText(name);
        frame.add(label);
    }

    private void addTextField(int xAxis, int yAxis, int width, int height){
        textField = new JTextField();
        textField.setBounds(xAxis,yAxis,width, height); // x axis, y axis, width, height
        textField.setText("Enter name!");
        frame.add(textField);
    }

    private void addButton(String name, int xAxis, int yAxis, int width, int height){
        JButton button = new JButton(name); // creating instance of JButton
        button.setBounds(xAxis,yAxis,width, height); // x axis, y axis, width, height
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder input = new StringBuilder(textField.getText());
                if (!checkBox.isSelected())
                    textField.setText("Hey " + input);
                else
                    textField.setText("Hey " + input.reverse());
            }
        });
        frame.add(button);
    }
    */
}
