/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Patient;

/**
 *
 * @author amirp
 */
public class FormJPanel extends javax.swing.JPanel {

    ImageIcon profilePicture;
    JPanel BottomJPanel;
    
    public FormJPanel(JPanel BottomJPanel) {
        this.BottomJPanel = BottomJPanel;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jPanel = new javax.swing.JPanel();
        age = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        lastname = new javax.swing.JTextField();
        female = new javax.swing.JRadioButton();
        phone = new javax.swing.JTextField();
        other = new javax.swing.JRadioButton();
        uploade = new javax.swing.JButton();
        first_name = new javax.swing.JLabel();
        imgUploader_label = new javax.swing.JLabel();
        last_name = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        gender_label = new javax.swing.JLabel();
        age_label = new javax.swing.JLabel();
        phone_label = new javax.swing.JLabel();
        PatinetLabel = new javax.swing.JLabel();
        patientType = new javax.swing.JComboBox<>();
        title = new javax.swing.JLabel();
        sign_up = new javax.swing.JButton();
        email_label = new javax.swing.JLabel();
        email = new javax.swing.JTextField();

        jPanel.setBackground(new java.awt.Color(51, 102, 255));

        firstname.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        firstname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });

        gender.add(male);
        male.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        male.setText("Male");
        male.setActionCommand("male");

        lastname.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });

        gender.add(female);
        female.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        female.setText("Female");
        female.setActionCommand("female");

        phone.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        gender.add(other);
        other.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        other.setText("Prefer not to say");
        other.setActionCommand("other");

        uploade.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        uploade.setText("Upload");
        uploade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadeActionPerformed(evt);
            }
        });

        first_name.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        first_name.setText("First Name:");

        imgUploader_label.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        imgUploader_label.setText("Upload Your Photo Here:");

        last_name.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        last_name.setText("Last Name:");

        img.setPreferredSize(new java.awt.Dimension(50, 50));

        gender_label.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        gender_label.setText("I am a:");

        age_label.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        age_label.setText("Age:");

        phone_label.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        phone_label.setText("Phone Number:");

        PatinetLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        PatinetLabel.setText("Patient Type:");

        patientType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appoinment", "Walk-In" }));
        patientType.setSelectedIndex(-1);

        title.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        title.setText("Patinet Registration");

        sign_up.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        sign_up.setText("Sign Up");
        sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_upActionPerformed(evt);
            }
        });

        email_label.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        email_label.setText("Email:");

        email.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age_label, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatinetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone_label, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(age)
                            .addComponent(phone)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(other)
                                .addGap(0, 264, Short.MAX_VALUE))
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(uploade, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(imgUploader_label, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(sign_up, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLayout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gender_label, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(firstname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(lastname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)))
                    .addContainerGap(229, Short.MAX_VALUE)))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(other)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientType, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PatinetLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_label)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(imgUploader_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uploade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sign_up, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLayout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(last_name))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gender_label))
                    .addContainerGap(325, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_upActionPerformed

        try{
            String fname = this.firstname.getText();
            String lname = this.lastname.getText();
            String name = fname + " " + lname;
            String gender_var = (this.gender.getSelection().getActionCommand());
            String age_var = (this.age.getText());
            String phone_var = (this.phone.getText());
            String email_var = (this.email.getText());
            String patient_type = this.patientType.getSelectedItem().toString();
            String message = "Name: " + name + System.lineSeparator() + "Gender: " + gender_var  + System.lineSeparator() + "Patient Type: " + patient_type  + System.lineSeparator() + "Age: " + age_var + " years old"  + System.lineSeparator() + "Phone Number: " + phone_var + System.lineSeparator() + "Email: " + email_var;

            if(name.equals("")){
                message = "Enter Your Name Please";
            }

            else if(age_var.equals("")){
                message = "Enter Your Age Please";
            }

            else if(email_var.equals("")){
                message = "Enter Your Email Please";
            }

            else if(phone_var.equals("")){
                message = "Enter Your Phone Please";
            }
            JOptionPane.showMessageDialog(this, message, "Success", HEIGHT, profilePicture);
            Patient p1 = new Patient();
            p1.setFname(fname);
            p1.setLname(lname);
            p1.setGender(gender_var);
            p1.setAge(age_var);
            p1.setEmail(email_var);
            p1.setPatient_type(patient_type);
            p1.setPhone(phone_var);
            p1.setProfilePicture(profilePicture);
            
            ViewJPanel newViewJPanel = new ViewJPanel(p1);
            this.BottomJPanel.add(newViewJPanel);
            CardLayout layout = (CardLayout) this.BottomJPanel.getLayout();
            layout.next(BottomJPanel);
        }

        catch(NullPointerException ne){
            String errormsg = "Please fill out all of the information";
            JOptionPane.showMessageDialog(this,errormsg);
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(this, "");
        }
    }//GEN-LAST:event_sign_upActionPerformed

    private void uploadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadeActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
                if (edited_image != null) {
                    this.img.setIcon(new ImageIcon(edited_image));
                    this.profilePicture = new ImageIcon(edited_image);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please upload image correctly.", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_uploadeActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PatinetLabel;
    private javax.swing.JTextField age;
    private javax.swing.JLabel age_label;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_label;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel first_name;
    private javax.swing.JTextField firstname;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel gender_label;
    private javax.swing.JLabel img;
    private javax.swing.JLabel imgUploader_label;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel last_name;
    private javax.swing.JTextField lastname;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton other;
    private javax.swing.JComboBox<String> patientType;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phone_label;
    private javax.swing.JButton sign_up;
    private javax.swing.JLabel title;
    private javax.swing.JButton uploade;
    // End of variables declaration//GEN-END:variables
}