/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.serialcom;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author User
 */
public class SerialMon extends javax.swing.JFrame {

    private SerialPort serialPort;
    private Timer timer;
    private static final List<Color> screenColors = new ArrayList<>();
    private static final int POINTS = 29;

    /**
     * Creates new form SerialMon
     */
    public SerialMon() {
        initComponents();
        portOpenButton.setEnabled(false);
        portcloseButton.setEnabled(false);
        startScreenTrackButton.setEnabled(false);

        SerialPort[] ports = SerialPort.getCommPorts();
        // portCombo = new JComboBox();
        if (ports.length > 0) {

            String[] myArray = new String[ports.length];

            for (int i = 0; i < ports.length; i++) {
                myArray[i] = ports[i].getSystemPortName();
            }

            portCombo.setModel(new javax.swing.DefaultComboBoxModel<>(myArray));

            portOpenButton.setEnabled(true);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        portCombo = new javax.swing.JComboBox<>();
        headerLabel = new javax.swing.JLabel();
        serialPortLabel = new javax.swing.JLabel();
        portOpenButton = new javax.swing.JButton();
        portcloseButton = new javax.swing.JButton();
        startScreenTrackButton = new javax.swing.JButton();
        responseTextLabel = new javax.swing.JLabel();
        ledPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Screen Tracker");
        setResizable(false);

        portCombo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        portCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        headerLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        headerLabel.setText("Screen Tracker");

        serialPortLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        serialPortLabel.setText("Serial Port");

        portOpenButton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        portOpenButton.setText("Open port");
        portOpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portOpenButtonActionPerformed(evt);
            }
        });

        portcloseButton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        portcloseButton.setText("Close port");
        portcloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portcloseButtonActionPerformed(evt);
            }
        });

        startScreenTrackButton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        startScreenTrackButton.setText("Screen Track");
        startScreenTrackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startScreenTrackButtonActionPerformed(evt);
            }
        });

        responseTextLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        ledPanel.setMinimumSize(new java.awt.Dimension(300, 10));
        ledPanel.setPreferredSize(new java.awt.Dimension(300, 10));

        javax.swing.GroupLayout ledPanelLayout = new javax.swing.GroupLayout(ledPanel);
        ledPanel.setLayout(ledPanelLayout);
        ledPanelLayout.setHorizontalGroup(
            ledPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        ledPanelLayout.setVerticalGroup(
            ledPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(portOpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(startScreenTrackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(responseTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(340, 340, 340))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(portcloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ledPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(serialPortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(portCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 309, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serialPortLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(portOpenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(responseTextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startScreenTrackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(portcloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ledPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void portcloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portcloseButtonActionPerformed
        // TODO add your handling code here:

        if (timer != null) {
            timer.stop();
        }

        if (serialPort != null) {
            if (serialPort.isOpen()) {
                serialPort.closePort();

                portOpenButton.setEnabled(true);
                portcloseButton.setEnabled(false);
                startScreenTrackButton.setEnabled(false);

            }

        }


    }//GEN-LAST:event_portcloseButtonActionPerformed

    private void portOpenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portOpenButtonActionPerformed
        // TODO add your handling code here:
        serialPort = SerialPort.getCommPort(portCombo.getSelectedItem().toString());
        serialPort.setBaudRate(115200);
        serialPort.openPort(); //open the port

        if (serialPort.isOpen()) {

            serialPort.addDataListener(new SerialPortDataListener() {
                @Override
                public int getListeningEvents() {
                    return SerialPort.LISTENING_EVENT_DATA_AVAILABLE;
                }

                @Override
                public void serialEvent(SerialPortEvent event) {
                    if (event.getEventType() == SerialPort.LISTENING_EVENT_DATA_AVAILABLE) {
                        byte[] readBuffer = new byte[1024]; // Set the size of the read buffer to 1024 bytes
                        int numBytes = ((SerialPort) event.getSource()).readBytes(readBuffer, readBuffer.length);

                        if (numBytes > 0) {
                            String data = new String(readBuffer, 0, numBytes);
                            System.out.println("Received data: " + data);
                           
                        }
                    }

                    //  System.out.println(".serialEvent()"+response);
                }
            });

            portOpenButton.setEnabled(false);
            portcloseButton.setEnabled(true);
            startScreenTrackButton.setEnabled(true);
        }

    }//GEN-LAST:event_portOpenButtonActionPerformed

    private void startScreenTrackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startScreenTrackButtonActionPerformed
        // TODO add your handling code here:

        if (serialPort != null) {
            if (serialPort.isOpen()) {

                timer = new Timer(100, e -> {
                    try {
                        getScreenColors(POINTS);
                        sendScreenColors(serialPort.getOutputStream());
                        updateLedPanel();
                    } catch (Exception ex) {
                        Logger.getLogger(SerialMon.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
                timer.start();
            }
        }
    }//GEN-LAST:event_startScreenTrackButtonActionPerformed

   
    
     private static void getScreenColors(int points) throws AWTException {
        screenColors.clear();

        Dimension screenRes = Toolkit.getDefaultToolkit().getScreenSize();
        int xStep = screenRes.width / points;

        for (int i = 0; i < points; i++) {
            int x = xStep * i;
            Color pixelColor = new Robot().getPixelColor(x, 100);
            screenColors.add(pixelColor);
        }
    }
    
    private static void sendScreenColors(OutputStream output) throws IOException {
    StringBuilder colorHex = new StringBuilder();

    for (Color color : screenColors) {
        colorHex.append(String.format("%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue()));
    }

    String message = "c" + colorHex.toString() + "e";
    output.write(message.getBytes());
}


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SerialMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SerialMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SerialMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SerialMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SerialMon().setVisible(true);
            }
        });
    }
    
    private void updateLedPanel() {
        ledPanel.removeAll();
        ledPanel.revalidate();
        ledPanel.repaint();
        ledPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        for (Color color : screenColors) {
            ledPanel.add(new CirclePanel(color, 10));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel ledPanel;
    private javax.swing.JComboBox<String> portCombo;
    private javax.swing.JButton portOpenButton;
    private javax.swing.JButton portcloseButton;
    private javax.swing.JLabel responseTextLabel;
    private javax.swing.JLabel serialPortLabel;
    private javax.swing.JButton startScreenTrackButton;
    // End of variables declaration//GEN-END:variables

}
