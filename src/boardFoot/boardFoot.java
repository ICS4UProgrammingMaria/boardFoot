/*
 * Created by: Maria Temu
 * Created on: 24-Feb-2020
 * Created for: ICS4U
 * Day #6 (Board Foot)
 * This program that acts a board foot calculator,
 * letting the user input numbers and find the third
 * dimension
 */
package boardFoot;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class boardFoot {
    private JTextField txtWidth;
    private JTextField txtLength;
    private JButton btnCalculate;
    private JPanel bftpanel;
    private JLabel lblWidth;
    private JLabel lblLength;
    private JLabel lblHeight;

    private static DecimalFormat df2 = new DecimalFormat("####.##");

    public static void main(String[] args) {
        JFrame frame = new JFrame("boardFoot");
        frame.setContentPane((new boardFoot().bftpanel));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public boardFoot() {
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double width = Double.parseDouble(String.valueOf(txtWidth.getText()));
                double length = Double.parseDouble(String.valueOf(txtLength.getText()));
                Double subT = width * length;
                Double total = subT/144;
                //String answer = Double.toString(total);
                //DecimalFormat heightFormat = new DecimalFormat("#.00");
                lblHeight.setText( df2.format(total));
            }
        });
    }
}
