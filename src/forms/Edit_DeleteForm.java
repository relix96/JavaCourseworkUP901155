/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Enums.*;
import classes.Pizza;
/**
 *
 * @author Zé Maria Valentim
 */
public class Edit_DeleteForm extends javax.swing.JFrame {

    /**
     * Creates new form Edit_DeleteForm
     */
    private Pizza pizza;
    private OrderForm orderForm;
    private int idx=0;
    public Edit_DeleteForm(OrderForm parent) {
        initComponents();
        orderForm = parent;
        pizza = orderForm.myOrder.getPizzaByIndex(0);
        
        for(Size s : Size.values()){
            this.cbbSize.addItem(s.name());
            this.cbbSize.setSelectedItem(pizza.getSize().toString());
        }
        
        for(Crust c : Crust.values()){
            this.cbbCrust.addItem(c.name());
            this.cbbCrust.setSelectedItem(pizza.getCrust().toString());
        }
        
        for(Sauce s : Sauce.values()){
            this.cbbSauce.addItem(s.name());
            this.cbbSauce.setSelectedItem(pizza.getSauce().toString());
        }
        
        for(Topping t : Topping.values()){
            this.cbbTopping1.addItem(t.name());
            this.cbbTopping1.setSelectedItem(pizza.getTopping1().toString());
        }
        
         for(Topping t : Topping.values()){
            this.cbbTopping2.addItem(t.name());
            this.cbbTopping2.setSelectedItem(pizza.gettTopping2().toString());
         }
         this.txtInfoPizza.setText(pizza.pizzaInfo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSize = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        cbbCrust = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();
        lblCrust = new javax.swing.JLabel();
        cbbTopping1 = new javax.swing.JComboBox<>();
        lblTopping1 = new javax.swing.JLabel();
        lblTopping2 = new javax.swing.JLabel();
        cbbTopping2 = new javax.swing.JComboBox<>();
        cbbSauce = new javax.swing.JComboBox<>();
        lblSauce = new javax.swing.JLabel();
        cbbSize = new javax.swing.JComboBox<>();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfoPizza = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblSize.setText("SIZE");

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        cbbCrust.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbCrustItemStateChanged(evt);
            }
        });

        btnDelete.setText("DELETE PIZZA");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblCrust.setText("CRUST");

        cbbTopping1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTopping1ItemStateChanged(evt);
            }
        });

        lblTopping1.setText("TOPPING 1");

        lblTopping2.setText("TOPPING 2");

        cbbTopping2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTopping2ItemStateChanged(evt);
            }
        });

        cbbSauce.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbSauceItemStateChanged(evt);
            }
        });

        lblSauce.setText("SAUCE");

        cbbSize.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbSizeItemStateChanged(evt);
            }
        });

        btnPrevious.setText("<");
        btnPrevious.setActionCommand("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        txtInfoPizza.setEditable(false);
        txtInfoPizza.setColumns(20);
        txtInfoPizza.setRows(5);
        jScrollPane1.setViewportView(txtInfoPizza);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnOk))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCrust, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTopping1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSize, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSauce, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTopping2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbSauce, 0, 139, Short.MAX_VALUE)
                            .addComponent(cbbTopping2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbTopping1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbCrust, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSize))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbCrust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCrust))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbTopping1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTopping1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTopping2)
                    .addComponent(cbbTopping2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbSauce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSauce))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnDelete)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        System.out.println("Count pizzas:"+orderForm.myOrder.getCountPizzas()+" | idx="+idx);
        if(idx >0){
            idx--;
            System.out.println("Count pizzas:"+orderForm.myOrder.getCountPizzas()+" | idx="+idx);
            showPizzaInfo(idx,pizza);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        System.out.println("Count pizzas:"+orderForm.myOrder.getCountPizzas()+" | idx="+idx);
        if(idx+1 < orderForm.myOrder.getCountPizzas()){
            System.out.println("Before show pizzaInfo:"+orderForm.myOrder.getPizzaByIndex(0).pizzaInfo());
            idx++;
            System.out.println("Count pizzas:"+orderForm.myOrder.getPizzaByIndex(0).pizzaInfo());
            showPizzaInfo(idx,pizza);
            System.out.println("After show pizzaInfo:"+orderForm.myOrder.getPizzaByIndex(0).pizzaInfo());
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        pizza = orderForm.myOrder.getPizzaByIndex(idx);
        orderForm.updatePizza(idx, pizza);
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        orderForm.deletePizza(idx);
        this.dispose();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cbbSizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbSizeItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() != java.awt.event.ItemEvent.SELECTED ){
            pizza = orderForm.myOrder.getPizzaByIndex(idx);
            pizza.setSize(Size.valueOf(cbbSize.getSelectedItem().toString()));
            infoPizza(pizza);
        }
        
    }//GEN-LAST:event_cbbSizeItemStateChanged

    private void cbbCrustItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbCrustItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() != java.awt.event.ItemEvent.SELECTED ){
            pizza = orderForm.myOrder.getPizzaByIndex(idx);
            pizza.setCrust(Crust.valueOf(cbbCrust.getSelectedItem().toString()));
            infoPizza(pizza);
        }
         
    }//GEN-LAST:event_cbbCrustItemStateChanged

    private void cbbTopping1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTopping1ItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() != java.awt.event.ItemEvent.SELECTED ){
            pizza = orderForm.myOrder.getPizzaByIndex(idx);
            pizza.setTopping1(Topping.valueOf(cbbTopping1.getSelectedItem().toString()));
            infoPizza(pizza);
         }
    }//GEN-LAST:event_cbbTopping1ItemStateChanged

    private void cbbTopping2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTopping2ItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() != java.awt.event.ItemEvent.SELECTED ){
            pizza.setTopping2(Topping.valueOf(cbbTopping2.getSelectedItem().toString()));
            infoPizza(pizza);
         }
    }//GEN-LAST:event_cbbTopping2ItemStateChanged

    private void cbbSauceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbSauceItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() != java.awt.event.ItemEvent.SELECTED ){
            pizza.setSauce(Sauce.valueOf(cbbSauce.getSelectedItem().toString()));
            infoPizza(pizza);
         }
    }//GEN-LAST:event_cbbSauceItemStateChanged

     private void infoPizza(Pizza pizza){
        this.txtInfoPizza.setText(pizza.pizzaInfo());
    }
     
     private void showPizzaInfo(int idx, Pizza pizza){
         System.out.println(idx);
         pizza = orderForm.myOrder.getPizzaByIndex(idx);
         this.cbbSize.setSelectedItem(pizza.getSize().toString());
         this.cbbCrust.setSelectedItem(pizza.getCrust().toString());
         this.cbbSauce.setSelectedItem(pizza.getSauce().toString());
         this.cbbTopping1.setSelectedItem(pizza.getTopping1().toString());
         this.cbbTopping2.setSelectedItem(pizza.gettTopping2().toString());
         this.txtInfoPizza.setText(pizza.pizzaInfo());
     }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Edit_DeleteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Edit_DeleteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Edit_DeleteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Edit_DeleteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Edit_DeleteForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JComboBox<String> cbbCrust;
    private javax.swing.JComboBox<String> cbbSauce;
    private javax.swing.JComboBox<String> cbbSize;
    private javax.swing.JComboBox<String> cbbTopping1;
    private javax.swing.JComboBox<String> cbbTopping2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCrust;
    private javax.swing.JLabel lblSauce;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblTopping1;
    private javax.swing.JLabel lblTopping2;
    private javax.swing.JTextArea txtInfoPizza;
    // End of variables declaration//GEN-END:variables
}
