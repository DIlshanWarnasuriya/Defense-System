package defense.system;

import java.awt.Color;

public class Submarine extends javax.swing.JFrame implements Observer{

    private int SoldierCount=0;
    private int AmmoAmount=0;
    private int fualValue=0;
    private int OxigenLevel=0;
    private String message="";
    
    public Submarine() {
        initComponents();
        setVisible(true);
    }
    
    public int getSoldierCount(){
        return SoldierCount;
    }    
    public int getAmmoAmount(){
        return AmmoAmount;
    }
    public int getFualValue(){
        return fualValue;
    }
    public int getOxigenLevel(){
        return OxigenLevel;
    }
    
    public void getMessage(String message){
        this.message+=message;
        notifyMessage();
    }
    
    private void notifyMessage(){
        System.out.println("Submarine : " + message);
        txtMessageBox.setText(message);
    }
    
    
    
    
    
    
    
    @Override
    public String toString(){
        return "Submarine";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        cbPosition = new javax.swing.JCheckBox();
        btnShoot = new javax.swing.JButton();
        btnMissileOp = new javax.swing.JButton();
        btnLaserOp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessageBox = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        btnRotateSh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtMessage = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtSoldierCount = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        txtAmmoAmount = new javax.swing.JTextField();
        btnSet = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sliderFuel = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        sliderOxigen = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        ErrorMessagePanal = new javax.swing.JPanel();
        lblErrorMessages = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(152, 227, 212));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(4, 83, 67));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Submarine");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(429, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(426, 426, 426))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1059, 91);

        lblArea.setBackground(new java.awt.Color(255, 255, 255));
        lblArea.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblArea.setForeground(new java.awt.Color(0, 0, 0));
        lblArea.setText("Area Is NOt Cleared");
        jPanel1.add(lblArea);
        lblArea.setBounds(93, 153, 241, 26);

        cbPosition.setBackground(new java.awt.Color(255, 255, 255));
        cbPosition.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        cbPosition.setForeground(new java.awt.Color(0, 0, 0));
        cbPosition.setText("Position");
        cbPosition.setContentAreaFilled(false);
        cbPosition.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbPosition.setFocusable(false);
        jPanel1.add(cbPosition);
        cbPosition.setBounds(654, 149, 105, 30);

        btnShoot.setBackground(new java.awt.Color(4, 83, 67));
        btnShoot.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnShoot.setForeground(new java.awt.Color(255, 255, 255));
        btnShoot.setText("Shoot");
        btnShoot.setBorderPainted(false);
        btnShoot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShoot.setDefaultCapable(false);
        btnShoot.setFocusPainted(false);
        btnShoot.setFocusable(false);
        jPanel1.add(btnShoot);
        btnShoot.setBounds(90, 220, 196, 60);

        btnMissileOp.setBackground(new java.awt.Color(4, 83, 67));
        btnMissileOp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMissileOp.setForeground(new java.awt.Color(255, 255, 255));
        btnMissileOp.setText("Missile Operation");
        btnMissileOp.setBorderPainted(false);
        btnMissileOp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMissileOp.setDefaultCapable(false);
        btnMissileOp.setFocusPainted(false);
        btnMissileOp.setFocusable(false);
        jPanel1.add(btnMissileOp);
        btnMissileOp.setBounds(90, 307, 196, 60);

        btnLaserOp.setBackground(new java.awt.Color(4, 83, 67));
        btnLaserOp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLaserOp.setForeground(new java.awt.Color(255, 255, 255));
        btnLaserOp.setText("Laser Operation");
        btnLaserOp.setBorderPainted(false);
        btnLaserOp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLaserOp.setDefaultCapable(false);
        btnLaserOp.setFocusPainted(false);
        btnLaserOp.setFocusable(false);
        jPanel1.add(btnLaserOp);
        btnLaserOp.setBounds(90, 390, 196, 57);

        jScrollPane1.setBackground(new java.awt.Color(152, 227, 212));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 227, 212)));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtMessageBox.setEditable(false);
        txtMessageBox.setBackground(new java.awt.Color(255, 255, 255));
        txtMessageBox.setColumns(20);
        txtMessageBox.setForeground(new java.awt.Color(51, 51, 51));
        txtMessageBox.setRows(5);
        txtMessageBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(txtMessageBox);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(351, 307, 405, 160);

        btnSend.setBackground(new java.awt.Color(4, 83, 67));
        btnSend.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 255, 255));
        btnSend.setText("Send");
        btnSend.setBorderPainted(false);
        btnSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSend.setDefaultCapable(false);
        btnSend.setFocusPainted(false);
        btnSend.setFocusable(false);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        jPanel1.add(btnSend);
        btnSend.setBounds(660, 490, 95, 40);

        btnRotateSh.setBackground(new java.awt.Color(4, 83, 67));
        btnRotateSh.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRotateSh.setForeground(new java.awt.Color(255, 255, 255));
        btnRotateSh.setText("Rotate Shooting");
        btnRotateSh.setBorderPainted(false);
        btnRotateSh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRotateSh.setDefaultCapable(false);
        btnRotateSh.setFocusPainted(false);
        btnRotateSh.setFocusable(false);
        jPanel1.add(btnRotateSh);
        btnRotateSh.setBounds(90, 470, 196, 60);

        jPanel3.setBackground(new java.awt.Color(152, 227, 212));

        txtMessage.setBackground(new java.awt.Color(152, 227, 212));
        txtMessage.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtMessage.setForeground(new java.awt.Color(0, 0, 0));
        txtMessage.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(350, 490, 297, 40);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(152, 227, 212));

        txtSoldierCount.setBackground(new java.awt.Color(152, 227, 212));
        txtSoldierCount.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtSoldierCount.setForeground(new java.awt.Color(0, 0, 0));
        txtSoldierCount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSoldierCount, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSoldierCount)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(152, 227, 212));

        txtAmmoAmount.setBackground(new java.awt.Color(152, 227, 212));
        txtAmmoAmount.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAmmoAmount.setForeground(new java.awt.Color(0, 0, 0));
        txtAmmoAmount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAmmoAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAmmoAmount)
                .addContainerGap())
        );

        btnSet.setBackground(new java.awt.Color(4, 83, 67));
        btnSet.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSet.setForeground(new java.awt.Color(255, 255, 255));
        btnSet.setText("Set");
        btnSet.setBorderPainted(false);
        btnSet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSet.setDefaultCapable(false);
        btnSet.setFocusPainted(false);
        btnSet.setFocusable(false);
        btnSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Soldier Count");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ammo Amount");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnSet, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSet, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(339, 197, 420, 104);

        sliderFuel.setBackground(new java.awt.Color(255, 255, 255));
        sliderFuel.setMajorTickSpacing(20);
        sliderFuel.setMinorTickSpacing(10);
        sliderFuel.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderFuel.setPaintLabels(true);
        sliderFuel.setPaintTicks(true);
        sliderFuel.setToolTipText("");
        sliderFuel.setValue(0);
        sliderFuel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sliderFuel.setFocusable(false);
        jPanel1.add(sliderFuel);
        sliderFuel.setBounds(819, 197, 50, 341);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fuel");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(828, 160, 31, 19);

        sliderOxigen.setBackground(new java.awt.Color(255, 255, 255));
        sliderOxigen.setMajorTickSpacing(20);
        sliderOxigen.setMinorTickSpacing(10);
        sliderOxigen.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderOxigen.setPaintLabels(true);
        sliderOxigen.setPaintTicks(true);
        sliderOxigen.setToolTipText("");
        sliderOxigen.setValue(0);
        sliderOxigen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sliderOxigen.setFocusable(false);
        jPanel1.add(sliderOxigen);
        sliderOxigen.setBounds(919, 197, 50, 341);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Oxigen");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(919, 160, 50, 19);

        ErrorMessagePanal.setBackground(new java.awt.Color(255, 255, 255));
        ErrorMessagePanal.setLayout(null);

        lblErrorMessages.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblErrorMessages.setForeground(new java.awt.Color(255, 255, 255));
        lblErrorMessages.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorMessages.setText("jLabel6");
        ErrorMessagePanal.add(lblErrorMessages);
        lblErrorMessages.setBounds(20, 6, 840, 20);

        jPanel1.add(ErrorMessagePanal);
        ErrorMessagePanal.setBounds(90, 110, 880, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetActionPerformed
        if (txtSoldierCount.getText().equals("") || txtAmmoAmount.getText().equals("")) {                
            ErrorMessagePanal.setVisible(true);
            lblErrorMessages.setVisible(true);  
            ErrorMessagePanal.setBackground(Color.RED);
            lblErrorMessages.setText("Enter Soldier And Ammo and Fuel Details");
        }  
        else if(sliderFuel.getValue()==0 || sliderOxigen.getValue()==0){
            ErrorMessagePanal.setVisible(true);
            lblErrorMessages.setVisible(true);    
            ErrorMessagePanal.setBackground(Color.RED);
            lblErrorMessages.setText("Set Fual and Oxigen Value");
        }
        else{
            ErrorMessagePanal.setVisible(true);
            lblErrorMessages.setVisible(true); 
            lblErrorMessages.setText("Detail Set Successful");
            ErrorMessagePanal.setBackground(new Color(5,153,0));
            
            SoldierCount=Integer.parseInt(txtSoldierCount.getText());
            AmmoAmount=Integer.parseInt(txtAmmoAmount.getText());
            fualValue = sliderFuel.getValue();
            OxigenLevel = sliderOxigen.getValue();
        }
    }//GEN-LAST:event_btnSetActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        if(txtMessage.getText().equals("")){
            ErrorMessagePanal.setVisible(true); 
            ErrorMessagePanal.setBackground(Color.RED);
            lblErrorMessages.setText("Please Enter Message on message feald");
            lblErrorMessages.setVisible(true);
        }
        else{
            ErrorMessagePanal.setVisible(true); 
            ErrorMessagePanal.setBackground(new Color(5,153,0));
            lblErrorMessages.setText("Send Message Successful");
            lblErrorMessages.setVisible(true);
            
            mainController.ShowMessage("Submarine : "+txtMessage.getText());
        }
    }//GEN-LAST:event_btnSendActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ErrorMessagePanal;
    private javax.swing.JButton btnLaserOp;
    private javax.swing.JButton btnMissileOp;
    private javax.swing.JButton btnRotateSh;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSet;
    private javax.swing.JButton btnShoot;
    private javax.swing.JCheckBox cbPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblErrorMessages;
    private javax.swing.JSlider sliderFuel;
    private javax.swing.JSlider sliderOxigen;
    private javax.swing.JTextField txtAmmoAmount;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextArea txtMessageBox;
    private javax.swing.JTextField txtSoldierCount;
    // End of variables declaration//GEN-END:variables
}
