/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author GerardoAGL
 */
public class Apps extends javax.swing.JFrame {

    /**
     * Creates new form Characteristics
     */
    public Apps(ArrayList<String> apps) {
        initComponents();
        
        DefaultListModel dlm = new DefaultListModel();
        for(int i = 0; i < apps.size(); i++){
            String name = apps.get(i);
            dlm.addElement(name);
        }
        
        lst_apps.setModel(dlm);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_apps = new javax.swing.JList<>();
        btn_accept = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_background.setBackground(new java.awt.Color(255, 255, 255));

        lbl_title.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        lbl_title.setText("Aplicaciones");

        jScrollPane1.setViewportView(lst_apps);

        btn_accept.setBackground(new java.awt.Color(0, 145, 234));
        btn_accept.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_accept.setForeground(new java.awt.Color(255, 255, 255));
        btn_accept.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_accept.setText("Aceptar");
        btn_accept.setToolTipText("accept");
        btn_accept.setOpaque(true);

        javax.swing.GroupLayout pnl_backgroundLayout = new javax.swing.GroupLayout(pnl_background);
        pnl_background.setLayout(pnl_backgroundLayout);
        pnl_backgroundLayout.setHorizontalGroup(
            pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_backgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_accept, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_backgroundLayout.setVerticalGroup(
            pnl_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btn_accept, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JList<String> lst_apps;
    private javax.swing.JPanel pnl_background;
    // End of variables declaration//GEN-END:variables
}
