/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Dialogs;

import Controllers.Validations.NumberInteger;
import Controllers.Validations.UserName;
import Views.Decorations.TextHint;

/**
 *
 * @author GerardoAGL
 */
public class AddProvider extends javax.swing.JDialog {

    /**
     * Creates new form AddProvider
     */
    public AddProvider(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        lbl_title = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_phone = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_accept = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_background.setBackground(new java.awt.Color(255, 255, 255));

        lbl_title.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        lbl_title.setText("Agregar proveedor");

        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_name.setText("Nombre");
        txt_name.setToolTipText("");
        txt_name.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 145, 234));
        jSeparator1.setForeground(new java.awt.Color(0, 145, 234));

        txt_phone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(102, 102, 102));
        txt_phone.setText("Nro de telefono");
        txt_phone.setToolTipText("");
        txt_phone.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(0, 145, 234));
        jSeparator2.setForeground(new java.awt.Color(0, 145, 234));

        btn_accept.setBackground(new java.awt.Color(0, 145, 234));
        btn_accept.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_accept.setForeground(new java.awt.Color(255, 255, 255));
        btn_accept.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_accept.setText("Aceptar");
        btn_accept.setToolTipText("accept provider");
        btn_accept.setOpaque(true);

        btn_cancel.setBackground(new java.awt.Color(213, 0, 0));
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cancel.setText("Cancelar");
        btn_cancel.setToolTipText("cancel provider");
        btn_cancel.setOpaque(true);

        javax.swing.GroupLayout pnl_backgroundLayout = new javax.swing.GroupLayout(pnl_background);
        pnl_background.setLayout(pnl_backgroundLayout);
        pnl_backgroundLayout.setHorizontalGroup(
            pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_name)
                    .addComponent(jSeparator1)
                    .addComponent(txt_phone)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_backgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_accept, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_backgroundLayout.setVerticalGroup(
            pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title)
                .addGap(18, 18, 18)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_accept, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txt_name.addFocusListener(new TextHint(txt_name, "Nombre"));
        txt_name.addKeyListener(new UserName());
        txt_phone.addFocusListener(new TextHint(txt_phone, "Nro de telefono"));
        txt_phone.addKeyListener(new NumberInteger());

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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel pnl_background;
    public javax.swing.JTextField txt_name;
    public javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
