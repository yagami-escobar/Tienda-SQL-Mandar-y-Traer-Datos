/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import bean.Articulo;
import bean.Categoria;
import com.sun.org.apache.xml.internal.resolver.Catalog;
import dao.ArticuloDAO;
import dao.CategoriaDAO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edcobar
 */
public class Frm_Listar extends javax.swing.JFrame {

   
    String Cabecera_Tabla[]={"ID","NOMBRE","DESCRIPCIÓN","PRECIO"};
    DefaultTableModel modtabla = new DefaultTableModel(Cabecera_Tabla,0);
    String Cabecera_Combo[]={"Estilo Informal","Estilo Elegante","Estilo Deportivo","Estilo Conservador"};
    DefaultComboBoxModel modcombo = new DefaultComboBoxModel(Cabecera_Combo);
    
    
    public Frm_Listar() {
        initComponents();
        setTitle("Listar_Articulos");
        setSize(800,400);
        setLocationRelativeTo(null);
        tbl_Tabla.setModel(modtabla);
        //cbo_Categoria.setModel(modcombo);
        Agregar_Categoria();
       
        
    }
    
    public void Agregar_Categoria()
    {
        ArrayList<Categoria> Lista =CategoriaDAO.listar();
        for(Categoria cat : Lista)
        {
            cbo_Categoria.addItem(cat.getCategoria());
        }
        
        
    }
    
    
    public void Limpiar()
    {
       while (tbl_Tabla.getRowCount() > 0) 
{((DefaultTableModel) tbl_Tabla.getModel()).removeRow(0);}
    }
    public void Total()
    {
        lbl_Total.setText("Total:"+modtabla.getRowCount());
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Listar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        cbo_Categoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Tabla = new javax.swing.JTable();
        lbl_Total = new javax.swing.JLabel();
        lbl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.gif"))); // NOI18N
        btn_Listar.setText("Listar");
        btn_Listar.setBorder(new javax.swing.border.MatteBorder(null));
        btn_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 110, 40));

        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir2.png"))); // NOI18N
        btn_Salir.setText("Salir");
        btn_Salir.setBorder(new javax.swing.border.MatteBorder(null));
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 120, 40));

        btn_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.gif"))); // NOI18N
        btn_Limpiar.setText("Eliminar");
        btn_Limpiar.setBorder(new javax.swing.border.MatteBorder(null));
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 110, 40));

        cbo_Categoria.setBorder(new javax.swing.border.MatteBorder(null));
        cbo_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_CategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(cbo_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 550, 40));

        tbl_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 720, 120));

        lbl_Total.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Total.setText("Total:");
        getContentPane().add(lbl_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 70, 30));

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo 3.jpg"))); // NOI18N
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 790, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void cbo_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_CategoriaActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListarActionPerformed
        Limpiar();
        String cat =cbo_Categoria.getSelectedItem().toString();
        ArrayList<Articulo> lista = null;
       lista= ArticuloDAO.Listar_por_Categoria(cat);
       
       for(Articulo a :lista)
       {modtabla.addRow(new Object[]{a.getIdarticulo(),a.getNombre(),a.getDescripción(),a.getPrecio()});}
       Total();
    }//GEN-LAST:event_btn_ListarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Listar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Listar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JComboBox<String> cbo_Categoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_Total;
    private javax.swing.JTable tbl_Tabla;
    // End of variables declaration//GEN-END:variables
}
