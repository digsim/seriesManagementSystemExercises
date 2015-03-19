/*
 * MoveAllDialog.java
 *
 * Created on 15. novembre 2001, 09:34
 */

package shapes.gui;

import shapes.WorkShapes;
/**
 *
 * @author  fuhrer
 */
public class MoveAllDialog extends javax.swing.JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3258128063794788401L;
	private WorkShapes w;
    
    /** Creates new form MoveAllDialog */
    public MoveAllDialog(java.awt.Frame parent) {
        super(parent, true);
        w = (WorkShapes)parent;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jLabel1 = new javax.swing.JLabel();
        horizontal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vertical = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridLayout(3, 2));

        setTitle("Moving all shapes...");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jLabel1.setText("Move all shapes horizontally by: ");
        getContentPane().add(jLabel1);

        horizontal.setText("20");
        getContentPane().add(horizontal);

        jLabel2.setText("Move all shapes vertically by:");
        getContentPane().add(jLabel2);

        vertical.setText("20");
        getContentPane().add(vertical);

        getContentPane().add(jPanel1);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.add(jButton1);

        getContentPane().add(jPanel2);

        pack();
    }//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Add your handling code here:
        w.moveAllShapes(Integer.valueOf(horizontal.getText()).intValue(),
        Integer.valueOf(vertical.getText()).intValue());
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField vertical;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField horizontal;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}