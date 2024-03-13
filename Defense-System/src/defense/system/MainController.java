package defense.system;

import java.awt.Color;

public class MainController extends javax.swing.JFrame{
    
    private Observer[] ob = new Observer[0];
    
    private String message;

    public MainController() {
        initComponents(); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
        setVisible(true);
        
        lblErrorMessages.setVisible(false);        
        ErrorMessagePanal.setVisible(false);        
    }
    
    
    public void addComponent(Observer component){
        extendObserver();
        ob[ob.length-1] = component;
        
    }
    private void extendObserver(){
        Observer[] temp = new Observer[ob.length+1];
        for (int i = 0; i < ob.length; i++) {
            temp[i] = ob[i];
        }
        ob=temp;
    }    
    
    
    
    public void ShowMessage(String messagees){
        txtMessageBox.setText(messagees);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbArea = new javax.swing.JCheckBox();
        btnCollect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessageBox = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtMessage = new javax.swing.JTextField();
        cbOption = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sliderPosition = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        lblSoldire = new javax.swing.JLabel();
        lblFuel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblAmmo = new javax.swing.JLabel();
        ErrorMessagePanal = new javax.swing.JPanel();
        lblErrorMessages = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(152, 227, 212));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(4, 83, 67));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Main Controller");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(407, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(404, 404, 404))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1100, 91);

        cbArea.setBackground(new java.awt.Color(255, 255, 255));
        cbArea.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        cbArea.setForeground(new java.awt.Color(0, 0, 0));
        cbArea.setText("Area not Clear");
        cbArea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbArea.setFocusPainted(false);
        cbArea.setFocusable(false);
        cbArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaActionPerformed(evt);
            }
        });
        jPanel1.add(cbArea);
        cbArea.setBounds(820, 180, 170, 30);

        btnCollect.setBackground(new java.awt.Color(4, 83, 67));
        btnCollect.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCollect.setForeground(new java.awt.Color(255, 255, 255));
        btnCollect.setText("Collect Informations");
        btnCollect.setBorderPainted(false);
        btnCollect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCollect.setFocusPainted(false);
        btnCollect.setFocusable(false);
        btnCollect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectActionPerformed(evt);
            }
        });
        jPanel1.add(btnCollect);
        btnCollect.setBounds(318, 170, 210, 43);

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
        jScrollPane1.setBounds(580, 234, 405, 210);

        btnSend.setBackground(new java.awt.Color(4, 83, 67));
        btnSend.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 255, 255));
        btnSend.setText("Send");
        btnSend.setBorderPainted(false);
        btnSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSend.setFocusPainted(false);
        btnSend.setFocusable(false);
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        jPanel1.add(btnSend);
        btnSend.setBounds(890, 460, 95, 40);

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
        jPanel3.setBounds(580, 460, 297, 40);

        cbOption.setBackground(new java.awt.Color(255, 255, 255));
        cbOption.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbOption.setForeground(new java.awt.Color(0, 0, 0));
        cbOption.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Option", "Helicopter", "Tank", "Submarine" }));
        cbOption.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 227, 212)));
        cbOption.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbOption.setFocusable(false);
        jPanel1.add(cbOption);
        cbOption.setBounds(100, 170, 204, 43);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Soldier Count    : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(102, 260, 151, 24);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fuel Amount      : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 300, 160, 24);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Position");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 430, 71, 24);

        sliderPosition.setBackground(new java.awt.Color(255, 255, 255));
        sliderPosition.setForeground(new java.awt.Color(0, 0, 0));
        sliderPosition.setMajorTickSpacing(20);
        sliderPosition.setMinorTickSpacing(10);
        sliderPosition.setPaintLabels(true);
        sliderPosition.setPaintTicks(true);
        sliderPosition.setToolTipText("");
        sliderPosition.setValue(0);
        sliderPosition.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sliderPosition.setFocusable(false);
        jPanel1.add(sliderPosition);
        sliderPosition.setBounds(100, 460, 428, 43);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1095, 936, 0, 0);

        lblSoldire.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSoldire.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblSoldire);
        lblSoldire.setBounds(260, 260, 60, 30);

        lblFuel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFuel.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblFuel);
        lblFuel.setBounds(260, 300, 60, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ammo Amount  : ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 340, 160, 24);

        lblAmmo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAmmo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblAmmo);
        lblAmmo.setBounds(260, 340, 60, 30);

        ErrorMessagePanal.setBackground(new java.awt.Color(255, 255, 255));
        ErrorMessagePanal.setLayout(null);

        lblErrorMessages.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblErrorMessages.setForeground(new java.awt.Color(255, 255, 255));
        lblErrorMessages.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorMessages.setText("jLabel6");
        ErrorMessagePanal.add(lblErrorMessages);
        lblErrorMessages.setBounds(20, 6, 860, 20);

        jPanel1.add(ErrorMessagePanal);
        ErrorMessagePanal.setBounds(100, 110, 890, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1096, 591));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Send Button
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        if (txtMessage.getText().equals("")) {            
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
            
            for(Observer comp : ob){
                comp.getMessage("Main Controller : " + txtMessage.getText());
            }
            
        }               
    }//GEN-LAST:event_btnSendActionPerformed
    
    // Collect Informations Button
    private void btnCollectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectActionPerformed
        if (cbOption.getSelectedItem().equals("Select Option")) {            
            ErrorMessagePanal.setVisible(true); 
            ErrorMessagePanal.setBackground(Color.RED);
            lblErrorMessages.setText("Please Select Armer Option");
            lblErrorMessages.setVisible(true);            
        }
        else{
            ErrorMessagePanal.setVisible(true); 
            ErrorMessagePanal.setBackground(new Color(5,153,0));
            lblErrorMessages.setText("Find Armer Details");
            lblErrorMessages.setVisible(true); 
            
            for(Observer comp : ob){
                if (comp.toString().equals(cbOption.getSelectedItem())) {
                    lblSoldire.setText(Integer.toString(comp.getSoldierCount()));
                    lblAmmo.setText(Integer.toString(comp.getAmmoAmount()));
                    lblFuel.setText(Integer.toString(comp.getFualValue()) + "%");
                }
            }
        } 
        
    }//GEN-LAST:event_btnCollectActionPerformed

    private void cbAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAreaActionPerformed
        if (cbArea.isSelected()) {
            cbArea.setText("Area is Clear");
            for(Observer comp : ob){
                comp.SetAreaClearance("is Clear");
            }
        }
        else{
            cbArea.setText("Area not Clear");
            for(Observer comp : ob){
                comp.SetAreaClearance("is not Clear");
            }
        }
    }//GEN-LAST:event_cbAreaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ErrorMessagePanal;
    private javax.swing.JButton btnCollect;
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox cbArea;
    private javax.swing.JComboBox cbOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmmo;
    private javax.swing.JLabel lblErrorMessages;
    private javax.swing.JLabel lblFuel;
    private javax.swing.JLabel lblSoldire;
    private javax.swing.JSlider sliderPosition;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextArea txtMessageBox;
    // End of variables declaration//GEN-END:variables
}
