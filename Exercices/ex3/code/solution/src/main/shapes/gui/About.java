package shapes.gui;

public class About extends javax.swing.JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3762533433968375093L;
	
	public About(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(new java.awt.GridLayout(4, 1));

        setTitle("Shapes...");
        setName("aboutinfo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel3.setMinimumSize(new java.awt.Dimension(182, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(182, 50));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("G\u00e9nie Logiciel I 2015");
        jLabel1.setMaximumSize(new java.awt.Dimension(572, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(572, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(572, 20));
        jPanel3.add(jLabel1);

        getContentPane().add(jPanel3);

        jPanel1.setMinimumSize(new java.awt.Dimension(485, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(485, 50));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Exercices - Shapes (version finale)");
        jPanel1.add(jLabel3);

        getContentPane().add(jPanel1);

        jPanel5.setMinimumSize(new java.awt.Dimension(493, 50));
        jPanel5.setPreferredSize(new java.awt.Dimension(493, 50));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        // SOL Putting the correct names in the "About box"
        jLabel2.setText("Andreas Ruppen (andreas.ruppen@unifr.ch)");
        jPanel5.add(jLabel2);

        getContentPane().add(jPanel5);

        jPanel2.setMinimumSize(new java.awt.Dimension(185, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(185, 50));
        jLabel4.setFont(new java.awt.Font("Courier New", 0, 12));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("http://diuf.unifr.ch/");
        jLabel4.setMaximumSize(new java.awt.Dimension(527, 14));
        jLabel4.setMinimumSize(new java.awt.Dimension(527, 14));
        jLabel4.setPreferredSize(new java.awt.Dimension(527, 14));
        jPanel2.add(jLabel4);

        getContentPane().add(jPanel2);

        pack();
    }//GEN-END:initComponents

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    /**
    * @param args the command line arguments
    */
//    public static void main(String args[]) {
//        new About(new javax.swing.JFrame(), true).show();
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
