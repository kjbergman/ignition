package view.swing;
import co.nz.ignite.dtoLayer.ExtraEquipmentDTO;
import co.nz.ignite.util.UtilMethods;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VehiclePage extends Page {
    private int buttonCounter = 0;

    public VehiclePage() {
        super();
    }

    @Override
    public void setUpPage(){
        ArrayList<ExtraEquipmentDTO> arrayList = new ArrayList<>();
        arrayList.add(new ExtraEquipmentDTO("Cargoliner", 210, 232.25, false));
        arrayList.add(new ExtraEquipmentDTO("Fab Protection (p)", 3200., 40., false));
        arrayList.add(new ExtraEquipmentDTO("Fire Extinguisher (p)", 800., 49.15, false));

        for (ExtraEquipmentDTO equipment : arrayList) {
            JPanel panel = addExtraBox(equipment.getName(), equipment.getPrice());
            super.addComponent(panel, "panel");
        }
        JButton jb1 = addButton("Add component");

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        // Define the panel to hold the buttons

        //panel.add(jb1);
    }

    private JPanel addExtraBox(String name, double price){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(addLabel(name + "\t"));
        panel.add(addLabel("$" + UtilMethods.round(price,2)+ "\t") );
        panel.add(addCheckBox());
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        return  panel;
    }

    private JCheckBox addCheckBox(){
        JCheckBox checkBox = new JCheckBox();
        checkBox.setBounds(20, 20, 20, 20);
        checkBox.setText("Include");
        return checkBox;
    }

    private JLabel addLabel(String name){
        JLabel label = new JLabel();
        label.setBounds(50, 10, 50, 10);
        label.setText(name);
        return label;
    }

    private void addPanel(JPanel panel){
        addComponent(panel, "panel");
    }

    private JTextField addTextField(/*int xAxis, int yAxis, int width, int height*/){
        JTextField textField = new JTextField();
        //textField.setBounds(xAxis,yAxis,width, height); // x axis, y axis, width, height
        textField.setText("Enter extra");
        return textField;
    }


    private JButton addButton(String buttonName){
        return new JButton(buttonName);
    }
}
