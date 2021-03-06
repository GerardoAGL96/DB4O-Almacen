/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Dialogs;

import Controllers.Validations.Name;
import Controllers.Validations.UserName;
import Views.Decorations.TextHint;

/**
 *
 * @author GerardoAGL
 */
public class AddCharacteristic extends javax.swing.JDialog {

    /**
     * Creates new form AddCharacteristic
     */
    public AddCharacteristic(java.awt.Frame parent, boolean modal) {
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
        jLabel1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_value = new javax.swing.JLabel();
        txt_value = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_info = new javax.swing.JTextArea();
        btn_accept = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        pnl_background.setBackground(new java.awt.Color(255, 255, 255));
        pnl_background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_title.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        lbl_title.setText("Agregar característica");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Nombre");

        txt_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_name.setText("Ej: Procesador");
        txt_name.setToolTipText("");
        txt_name.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 145, 234));
        jSeparator1.setForeground(new java.awt.Color(0, 145, 234));

        lbl_value.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_value.setText("Valor");
        lbl_value.setToolTipText("");

        txt_value.setForeground(new java.awt.Color(102, 102, 102));
        txt_value.setText("Ej: 2.60 Ghz");
        txt_value.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(0, 145, 234));
        jSeparator2.setForeground(new java.awt.Color(0, 145, 234));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Información");
        jLabel2.setToolTipText("");

        txt_info.setColumns(20);
        txt_info.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_info.setForeground(new java.awt.Color(102, 102, 102));
        txt_info.setRows(5);
        txt_info.setText("Ej: Intel i7 2330K");
        txt_info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 145, 234)));
        jScrollPane1.setViewportView(txt_info);
        txt_info.addFocusListener(new TextHint(txt_info, "Ej: Intel i7 2330K"));

        btn_accept.setBackground(new java.awt.Color(0, 145, 234));
        btn_accept.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_accept.setForeground(new java.awt.Color(255, 255, 255));
        btn_accept.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_accept.setText("Aceptar");
        btn_accept.setToolTipText("acceptCha");
        btn_accept.setOpaque(true);

        btn_cancel.setBackground(new java.awt.Color(213, 0, 0));
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cancel.setText("Cancelar");
        btn_cancel.setToolTipText("cancelCha");
        btn_cancel.setOpaque(true);

        javax.swing.GroupLayout pnl_backgroundLayout = new javax.swing.GroupLayout(pnl_background);
        pnl_background.setLayout(pnl_backgroundLayout);
        pnl_backgroundLayout.setHorizontalGroup(
            pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_backgroundLayout.createSequentialGroup()
                        .addGroup(pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_name)
                            .addComponent(jSeparator1)
                            .addComponent(lbl_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_value)
                            .addComponent(jSeparator2)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_backgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_accept, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_backgroundLayout.setVerticalGroup(
            pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_value)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_accept, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_name.addFocusListener(new TextHint(txt_name, "Ej: Procesador"));
        txt_name.addKeyListener(new Name());
        txt_value.addFocusListener(new TextHint(txt_value, "Ej: 2.60 Ghz"));
        txt_value.addKeyListener(new UserName());

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_value;
    private javax.swing.JPanel pnl_background;
    public javax.swing.JTextArea txt_info;
    public javax.swing.JTextField txt_name;
    public javax.swing.JTextField txt_value;
    // End of variables declaration//GEN-END:variables
}
