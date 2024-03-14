package defense.system;

import java.awt.Color;
import java.awt.Toolkit;

public class Submarine extends javax.swing.JFrame implements Observer{

    private MainController mainController;
    
    private int SoldierCount=0;
    private int AmmoAmount=0;
    private int fualValue=0;    
    private String message="";
    private String position = "not position";
    
    public Submarine() {
        
    }
    
    public Submarine(MainController mainController){
        initComponents();
        setVisible(true);
        setTitle("Defense System");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        this.mainController=mainController;
    }
    
    // get Details to main Controller
    @Override
    public int getSoldierCount(){
        return SoldierCount;
    }   
    @Override
    public int getAmmoAmount(){
        return AmmoAmount;
    }
    @Override
    public int getFualValue(){
        return fualValue;
    }   
    @Override
    public String toString(){
        return "Submarine";
    }
    
    // get message form Main Controller
    @Override
    public void getMessage(String mg){
        if (message.equals("")) {
            message=mg;
            notifyMessage();
        }
        else{
            message+="\n"+mg;
            notifyMessage();
        }      
    }    
    private void notifyMessage(){        
        txtMessageBox.setText(message);
    }
    
    // set Area Clear lable
    @Override
    public void SetAreaClearance(String Situation){
        if (Situation.equals("is Clear")) {
            lblArea.setText("Area is Clear");
        }
        else{
            lblArea.setText("Area not Clear");
        }
    }
    
    // get position status to main controller
    @Override
    public String getposition(){
        return position;
    }
    // button enable 
    @Override
    public void buttonEnable(int level){
        if (level < 20) {
            btnShoot.setEnabled(false);
            btnMissileOp.setEnabled(false);
            btnLaserOp.setEnabled(false);
            btnRotateSh.setEnabled(false);
        }
        if(level > 20 ) {
            btnShoot.setEnabled(true);
            btnMissileOp.setEnabled(false);
            btnLaserOp.setEnabled(false);
            btnRotateSh.setEnabled(false);
        }
        if(level > 40){
            btnShoot.setEnabled(true);
            btnMissileOp.setEnabled(true);
            btnLaserOp.setEnabled(false);
            btnRotateSh.setEnabled(false);
        }
        if(level > 60){
            btnShoot.setEnabled(true);
            btnMissileOp.setEnabled(true);
            btnLaserOp.setEnabled(true);
            btnRotateSh.setEnabled(false);
        }    
        if(level > 80){
            btnShoot.setEnabled(true);
            btnMissileOp.setEnabled(true);
            btnLaserOp.setEnabled(true);
            btnRotateSh.setEnabled(true);
        }
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel1)
                .addContainerGap(379, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 960, 91);

        lblArea.setBackground(new java.awt.Color(255, 255, 255));
        lblArea.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblArea.setForeground(new java.awt.Color(0, 0, 0));
        lblArea.setText("Area Is not Cleared");
        jPanel1.add(lblArea);
        lblArea.setBounds(93, 153, 241, 26);

        cbPosition.setBackground(new java.awt.Color(255, 255, 255));
        cbPosition.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        cbPosition.setForeground(new java.awt.Color(0, 0, 0));
        cbPosition.setText("Position");
        cbPosition.setContentAreaFilled(false);
        cbPosition.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbPosition.setFocusable(false);
        cbPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPositionActionPerformed(evt);
            }
        });
        jPanel1.add(cbPosition);
        cbPosition.setBounds(654, 149, 105, 30);

        btnShoot.setBackground(new java.awt.Color(4, 83, 67));
        btnShoot.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnShoot.setForeground(new java.awt.Color(255, 255, 255));
        btnShoot.setText("Shoot");
        btnShoot.setBorderPainted(false);
        btnShoot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShoot.setDefaultCapable(false);
        btnShoot.setEnabled(false);
        btnShoot.setFocusPainted(false);
        btnShoot.setFocusable(false);
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });
        jPanel1.add(btnShoot);
        btnShoot.setBounds(90, 220, 196, 60);

        btnMissileOp.setBackground(new java.awt.Color(4, 83, 67));
        btnMissileOp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMissileOp.setForeground(new java.awt.Color(255, 255, 255));
        btnMissileOp.setText("Missile Operation");
        btnMissileOp.setBorderPainted(false);
        btnMissileOp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMissileOp.setDefaultCapable(false);
        btnMissileOp.setEnabled(false);
        btnMissileOp.setFocusPainted(false);
        btnMissileOp.setFocusable(false);
        btnMissileOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissileOpActionPerformed(evt);
            }
        });
        jPanel1.add(btnMissileOp);
        btnMissileOp.setBounds(90, 307, 196, 60);

        btnLaserOp.setBackground(new java.awt.Color(4, 83, 67));
        btnLaserOp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLaserOp.setForeground(new java.awt.Color(255, 255, 255));
        btnLaserOp.setText("Laser Operation");
        btnLaserOp.setBorderPainted(false);
        btnLaserOp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLaserOp.setDefaultCapable(false);
        btnLaserOp.setEnabled(false);
        btnLaserOp.setFocusPainted(false);
        btnLaserOp.setFocusable(false);
        btnLaserOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaserOpActionPerformed(evt);
            }
        });
        jPanel1.add(btnLaserOp);
        btnLaserOp.setBounds(90, 390, 196, 57);

        jScrollPane1.setBackground(new java.awt.Color(152, 227, 212));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 227, 212)));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtMessageBox.setEditable(false);
        txtMessageBox.setBackground(new java.awt.Color(255, 255, 255));
        txtMessageBox.setColumns(20);
        txtMessageBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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
        btnRotateSh.setEnabled(false);
        btnRotateSh.setFocusPainted(false);
        btnRotateSh.setFocusable(false);
        btnRotateSh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotateShActionPerformed(evt);
            }
        });
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

        ErrorMessagePanal.setBackground(new java.awt.Color(255, 255, 255));
        ErrorMessagePanal.setLayout(null);

        lblErrorMessages.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblErrorMessages.setForeground(new java.awt.Color(255, 255, 255));
        lblErrorMessages.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorMessages.setText("jLabel6");
        ErrorMessagePanal.add(lblErrorMessages);
        lblErrorMessages.setBounds(20, 6, 740, 20);

        jPanel1.add(ErrorMessagePanal);
        ErrorMessagePanal.setBounds(90, 110, 770, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Detail Set Button
    private void btnSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetActionPerformed
        if (txtSoldierCount.getText().equals("") || txtAmmoAmount.getText().equals("") && Integer.parseInt(txtSoldierCount.getText())<0 || Integer.parseInt(txtAmmoAmount.getText())<0) {                
            ErrorMessagePanal.setVisible(true);
            lblErrorMessages.setVisible(true);  
            ErrorMessagePanal.setBackground(Color.RED);
            lblErrorMessages.setText("Enter Soldier And Ammo details. Insert only positive Numbers");
        }   
        else if(sliderFuel.getValue()==0){
            ErrorMessagePanal.setVisible(true);
            lblErrorMessages.setVisible(true);    
            ErrorMessagePanal.setBackground(Color.RED);
            lblErrorMessages.setText("Set Fual Value");
        }
        else{
            ErrorMessagePanal.setVisible(true);
            lblErrorMessages.setVisible(true); 
            lblErrorMessages.setText("Detail Set Successful");
            ErrorMessagePanal.setBackground(new Color(5,153,0));
            
            SoldierCount=Integer.parseInt(txtSoldierCount.getText());
            AmmoAmount=Integer.parseInt(txtAmmoAmount.getText());
            fualValue = sliderFuel.getValue();            
        }
    }//GEN-LAST:event_btnSetActionPerformed

    // Message Send Button
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
            
            mainController.getMessage("Submarine : "+txtMessage.getText());
            txtMessage.setText("");
        }
    }//GEN-LAST:event_btnSendActionPerformed

    // position checkBox
    private void cbPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPositionActionPerformed
        if (cbPosition.isSelected()) {
            position = "position";
           
        }
        else{
            position = "not position";
            btnShoot.setEnabled(false);
            btnMissileOp.setEnabled(false);
            btnLaserOp.setEnabled(false);
            btnRotateSh.setEnabled(false);
        }
    }//GEN-LAST:event_cbPositionActionPerformed

    // Shoot button
    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        if (txtAmmoAmount.getText().equals("") || txtAmmoAmount.getText().equals("0")) {
            ErrorMessagePanal.setVisible(true);
            lblErrorMessages.setVisible(true);    
            ErrorMessagePanal.setBackground(Color.RED);
            lblErrorMessages.setText("Ammo count is Zero. Set new Ammo Count");
        }
        else{
            txtAmmoAmount.setText(Integer.toString(--AmmoAmount));
            ErrorMessagePanal.setVisible(false);
            lblErrorMessages.setVisible(false);  
        }
    }//GEN-LAST:event_btnShootActionPerformed

    // Missile OpAction button
    private void btnMissileOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissileOpActionPerformed
        if (txtAmmoAmount.getText().equals("") || txtAmmoAmount.getText().equals("0")) {
            ErrorMessagePanal.setVisible(true);
            lblErrorMessages.setVisible(true);    
            ErrorMessagePanal.setBackground(Color.RED);
            lblErrorMessages.setText("Ammo count is Zero. Set new Ammo Count");
        }
        else{   
            txtAmmoAmount.setText(Integer.toString(--AmmoAmount));
            ErrorMessagePanal.setVisible(false);
            lblErrorMessages.setVisible(false);   
        }
    }//GEN-LAST:event_btnMissileOpActionPerformed

    // Laser OpAction Button
    private void btnLaserOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaserOpActionPerformed
        if (txtAmmoAmount.getText().equals("") || txtAmmoAmount.getText().equals("0")) {
            ErrorMessagePanal.setVisible(true);
            lblErrorMessages.setVisible(true);    
            ErrorMessagePanal.setBackground(Color.RED);
            lblErrorMessages.setText("Ammo count is Zero. Set new Ammo Count");
        }
        else{            
            ErrorMessagePanal.setVisible(false);
            lblErrorMessages.setVisible(false);   
        }
    }//GEN-LAST:event_btnLaserOpActionPerformed

    // Rotate Shoot button
    private void btnRotateShActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotateShActionPerformed
        if (txtAmmoAmount.getText().equals("") || txtAmmoAmount.getText().equals("0")) {
            ErrorMessagePanal.setVisible(true);
            lblErrorMessages.setVisible(true);    
            ErrorMessagePanal.setBackground(Color.RED);
            lblErrorMessages.setText("Ammo count is Zero. Set new Ammo Count");
        }
        else{            
            ErrorMessagePanal.setVisible(false);
            lblErrorMessages.setVisible(false);   
        }
    }//GEN-LAST:event_btnRotateShActionPerformed

    
    

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
    private javax.swing.JTextField txtAmmoAmount;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextArea txtMessageBox;
    private javax.swing.JTextField txtSoldierCount;
    // End of variables declaration//GEN-END:variables
}
