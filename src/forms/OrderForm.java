/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;
import Enums.Crust;
import Enums.Sauce;
import Enums.Size;
import Enums.Topping;
import classes.*;

/**
 *
 * @author Zé Maria Valentim
 */
public class OrderForm extends javax.swing.JFrame {

    /**
     * Creates new form OrderForm
     */
    
    public Order myOrder;
    public OrderForm() {
        initComponents();
        myOrder = new Order();
        myOrder.addOrder(Size.LARGE, Crust.THIN, Sauce.TOMATO, Topping.MUSHROOM, Topping.OLIVES);
        myOrder.addOrder(Size.MEDIUM, Crust.STUFFED, Sauce.TOMATO, Topping.PEPPERONI, Topping.EXTRA_CHEESE);
        myOrder.addOrder(Size.SMALL, Crust.DEEP, Sauce.PESTO, Topping.CHILLI, Topping.ONION);
        
        
        this.txtInfo.setText(myOrder.getOrder());
        if(myOrder.getCountPizzas()==0)
            this.txtOrderCost.setText("£0.00");        
        else
            this.txtOrderCost.setText("£"+String.valueOf(myOrder.getCostOrder()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNewPizza = new javax.swing.JButton();
        btnEdit_Delete = new javax.swing.JButton();
        lblOrderCost = new javax.swing.JLabel();
        txtOrderCost = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HOME/ORDER FORM");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N

        btnNewPizza.setText("NEW PIZZA");
        btnNewPizza.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnNewPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPizzaActionPerformed(evt);
            }
        });

        btnEdit_Delete.setLabel("EDIT/DELETE PIZZA");
        btnEdit_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit_DeleteActionPerformed(evt);
            }
        });

        lblOrderCost.setText("TOTAL ORDER COST");

        txtOrderCost.setEditable(false);
        txtOrderCost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnClose.setText("CLOSE");

        txtInfo.setEditable(false);
        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane1.setViewportView(txtInfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrderCost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOrderCost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNewPizza)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit_Delete)
                        .addGap(0, 160, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewPizza)
                    .addComponent(btnEdit_Delete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderCost)
                    .addComponent(txtOrderCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPizzaActionPerformed
        // TODO add your handling code here:
        NewPizzaForm form = new NewPizzaForm(this);        
        form.setVisible(true);       
        txtInfo.setText(myOrder.getOrder());
    }//GEN-LAST:event_btnNewPizzaActionPerformed

    private void btnEdit_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit_DeleteActionPerformed
        // TODO add your handling code here:
        if(myOrder.getCountPizzas() !=0){
            Edit_DeleteForm form = new Edit_DeleteForm(this);
            form.setVisible(true);
            txtInfo.setText(myOrder.getOrder());
        }
    }//GEN-LAST:event_btnEdit_DeleteActionPerformed

    public void addPizza(Pizza  pizza){
        myOrder.addOrder(pizza);
        txtInfo.setText(myOrder.getOrder());
        txtOrderCost.setText("£"+String.valueOf(myOrder.getCostOrder()));
    }
    
    public void deletePizza(int idx){
        myOrder.deletePizza(idx);
        txtInfo.setText(myOrder.getOrder());
        txtOrderCost.setText("£"+String.valueOf(myOrder.getCostOrder()));
    }
    
    public void updatePizza(int idx, Pizza pizza){
        myOrder.updatePizza(idx, pizza);
        txtInfo.setText(myOrder.getOrder());
        txtOrderCost.setText("£"+String.valueOf(myOrder.getCostOrder()));
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
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEdit_Delete;
    private javax.swing.JButton btnNewPizza;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrderCost;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JTextField txtOrderCost;
    // End of variables declaration//GEN-END:variables
}
