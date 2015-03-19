/*
 * CircleDialog.java
 *
 * Created on 13. septembre 2001, 11:05
 */

package shapes.gui;

import shapes.WorkShapes;
import shapes.Circle;

/**
 *
 * @author  fuhrer
 */
public class CircleDialog extends javax.swing.JDialog {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 3257291309659141171L;
	private WorkShapes w;
    private Circle callingShape;
    
    /** Creates new form CircleDialog */
    public CircleDialog(java.awt.Frame parent) {
        super(parent, true);
        w = (WorkShapes)parent;
        initComponents();
    }
    
    public CircleDialog(Circle c) {
        super();
        setModal(true);
        callingShape = c;
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        topPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        downPanel = new javax.swing.JPanel();
        OKbutton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        xposlabel = new javax.swing.JLabel();
        xpos = new javax.swing.JTextField();
        yposlabel = new javax.swing.JLabel();
        ypos = new javax.swing.JTextField();
        radiuslabel = new javax.swing.JLabel();
        radius = new javax.swing.JTextField();

        setTitle("Create/Edit a Circle");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel4.setText("Enter Circle Data");
        topPanel.add(jLabel4);

        getContentPane().add(topPanel, java.awt.BorderLayout.NORTH);

        OKbutton.setText("OK");
        OKbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKbuttonActionPerformed(evt);
            }
        });

        downPanel.add(OKbutton);

        getContentPane().add(downPanel, java.awt.BorderLayout.SOUTH);

        mainPanel.setLayout(new java.awt.GridLayout(3, 2));

        xposlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xposlabel.setText("X Pos :");
        mainPanel.add(xposlabel);

        xpos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xposActionPerformed(evt);
            }
        });

        mainPanel.add(xpos);

        yposlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yposlabel.setText("Y Pos :");
        mainPanel.add(yposlabel);

        mainPanel.add(ypos);

        radiuslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radiuslabel.setText("Radius :");
        mainPanel.add(radiuslabel);

        mainPanel.add(radius);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }//GEN-END:initComponents

    private void xposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xposActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_xposActionPerformed
    
    private void OKbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKbuttonActionPerformed
        // Add your handling code here:
        if (callingShape != null) {
            callingShape.change(
            Integer.valueOf(xpos.getText()).intValue(),
            Integer.valueOf(ypos.getText()).intValue(),
            Integer.valueOf(radius.getText()).intValue());
            setVisible(false);
            dispose();
        }
        else {
            w.createNewCircle(
            Integer.valueOf(xpos.getText()).intValue(),
            Integer.valueOf(ypos.getText()).intValue(),
            Integer.valueOf(radius.getText()).intValue());
            setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_OKbuttonActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel yposlabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton OKbutton;
    private javax.swing.JTextField xpos;
    private javax.swing.JTextField radius;
    private javax.swing.JTextField ypos;
    private javax.swing.JLabel xposlabel;
    private javax.swing.JLabel radiuslabel;
    private javax.swing.JPanel downPanel;
    // End of variables declaration//GEN-END:variables
    
}
