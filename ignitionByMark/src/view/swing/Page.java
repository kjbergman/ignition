package view.swing;

import javax.swing.*;

/**
 * Created by jesperbergman on 2018-03-26.
 */
public abstract class Page {
    private JFrame frame;

    public Page() {
        // Create and set up a frame window

        JFrame.setDefaultLookAndFeelDecorated(true);
        this.frame = new JFrame("IgnitionByMark");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // yield page content
        setUpPage();


        this.frame.pack();
        this.frame.setVisible(true);
    }

    void addComponent(Object one, String componentType){
        switch (componentType){
            case "button":
                JLabel buttonLabel = new JLabel();
                buttonLabel.setText("Button");
                frame.add((JButton) one);
                break;
            case "panel":
                //JLabel panelLabel = new JLabel();
                //panelLabel.setText("Panel");
                frame.add((JPanel) one);
                break;
            default:
                JLabel unknownLabel = new JLabel();
                unknownLabel.setText("Unknown");
        }

    }


    public void setUpPage(){
    };
}
