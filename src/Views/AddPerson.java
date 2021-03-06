/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.Validations.Name;
import Controllers.Validations.NumberInteger;
import Views.Decorations.TextHint;
import java.awt.image.BufferedImage;

/**
 *
 * @author GerardoAGL
 */
public class AddPerson extends javax.swing.JFrame {
    
    public BufferedImage photo = null;
    /**
     * Creates new form AddPerson
     */
    public AddPerson() {
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

        pnl_background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_id = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_photo = new javax.swing.JLabel();
        btn_accept = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_background.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel1.setText("Agregar personal");

        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_name.setText("Nombre y apellido");
        txt_name.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 145, 234));
        jSeparator1.setForeground(new java.awt.Color(0, 145, 234));

        txt_id.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_id.setText("Nro de cédula");
        txt_id.setToolTipText("");
        txt_id.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(0, 145, 234));
        jSeparator2.setForeground(new java.awt.Color(0, 145, 234));

        btn_photo.setBackground(new java.awt.Color(117, 117, 117));
        btn_photo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_photo.setForeground(new java.awt.Color(255, 255, 255));
        btn_photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_photo.setText("Foto");
        btn_photo.setToolTipText("photo person");
        btn_photo.setOpaque(true);

        btn_accept.setBackground(new java.awt.Color(0, 145, 234));
        btn_accept.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_accept.setForeground(new java.awt.Color(255, 255, 255));
        btn_accept.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_accept.setText("Aceptar");
        btn_accept.setToolTipText("accept add");
        btn_accept.setOpaque(true);

        btn_cancel.setBackground(new java.awt.Color(213, 0, 0));
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cancel.setText("Cancelar");
        btn_cancel.setToolTipText("cancel add");
        btn_cancel.setOpaque(true);

        javax.swing.GroupLayout pnl_backgroundLayout = new javax.swing.GroupLayout(pnl_background);
        pnl_background.setLayout(pnl_backgroundLayout);
        pnl_backgroundLayout.setHorizontalGroup(
            pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addComponent(txt_name)
                    .addComponent(jSeparator1)
                    .addComponent(txt_id)
                    .addComponent(jSeparator2)
                    .addComponent(btn_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_backgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_accept, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_backgroundLayout.setVerticalGroup(
            pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btn_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_accept, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_name.addFocusListener(new TextHint(txt_name, "Nombre y apellido"));
        txt_name.addKeyListener(new Name());
        txt_id.addFocusListener(new TextHint(txt_id, "Nro de cédula"));
        txt_id.addKeyListener(new NumberInteger());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btn_accept;
    public javax.swing.JLabel btn_cancel;
    public javax.swing.JLabel btn_photo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pnl_background;
    public javax.swing.JTextField txt_id;
    public javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
