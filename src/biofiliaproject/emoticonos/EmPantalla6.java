/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biofiliaproject.emoticonos;

import biofiliaproject.imagenes.ImInicio;
import static biofiliaproject.preguntas.Nature.cursoAlumno;
import static biofiliaproject.preguntas.Nature.nombreAlumno;
import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;

/**
 *
 * @author 47448880
 */
public class EmPantalla6 extends javax.swing.JFrame {

    final int ID_EMOTICONO=6;
    /**
     * Creates new form EmPantalla1
     */
    public EmPantalla6() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        btn_siguiente.setEnabled(false);
        btn_siguiente.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_emPantalla1 = new javax.swing.JPanel();
        btn_alegria = new javax.swing.JButton();
        btn_tristeza = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombreAlumno = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cursoAlumno = new javax.swing.JLabel();
        btn_relajacion = new javax.swing.JButton();
        btn_miedo = new javax.swing.JButton();
        btn_asco = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();
        em_imagen = new javax.swing.JLabel();
        btn_enfado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1020, 720));

        panel_emPantalla1.setPreferredSize(new java.awt.Dimension(1020, 720));

        btn_alegria.setBackground(new java.awt.Color(255, 255, 255));
        btn_alegria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_alegria.setText("Alegría");
        btn_alegria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alegriaActionPerformed(evt);
            }
        });

        btn_tristeza.setBackground(new java.awt.Color(255, 255, 255));
        btn_tristeza.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_tristeza.setText("Tristeza");
        btn_tristeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tristezaActionPerformed(evt);
            }
        });

        jLabel1.setText("Alumno:");

        nombreAlumno.setText("Nombre");

        jLabel3.setText("Curso:");

        cursoAlumno.setText("XX");

        btn_relajacion.setBackground(new java.awt.Color(255, 255, 255));
        btn_relajacion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_relajacion.setText("Relajación");
        btn_relajacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_relajacionActionPerformed(evt);
            }
        });

        btn_miedo.setBackground(new java.awt.Color(255, 255, 255));
        btn_miedo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_miedo.setText("Miedo");
        btn_miedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_miedoActionPerformed(evt);
            }
        });

        btn_asco.setBackground(new java.awt.Color(255, 255, 255));
        btn_asco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_asco.setText("Asco");
        btn_asco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ascoActionPerformed(evt);
            }
        });

        btn_siguiente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_siguiente.setText("SIGUIENTE");
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        em_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/biofiliaproject/rsc/icon/angry6.png"))); // NOI18N

        btn_enfado.setBackground(new java.awt.Color(255, 255, 255));
        btn_enfado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_enfado.setText("Enfado");
        btn_enfado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enfadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_emPantalla1Layout = new javax.swing.GroupLayout(panel_emPantalla1);
        panel_emPantalla1.setLayout(panel_emPantalla1Layout);
        panel_emPantalla1Layout.setHorizontalGroup(
            panel_emPantalla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_emPantalla1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_emPantalla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_emPantalla1Layout.createSequentialGroup()
                        .addComponent(btn_alegria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 75, Short.MAX_VALUE)
                        .addComponent(btn_tristeza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 75, Short.MAX_VALUE)
                        .addComponent(btn_relajacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 75, Short.MAX_VALUE)
                        .addComponent(btn_miedo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 75, Short.MAX_VALUE)
                        .addComponent(btn_asco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 76, Short.MAX_VALUE)
                        .addComponent(btn_enfado))
                    .addGroup(panel_emPantalla1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cursoAlumno)
                        .addGap(11, 11, 11)))
                .addGap(50, 50, 50))
            .addGroup(panel_emPantalla1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(em_imagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_emPantalla1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_siguiente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_emPantalla1Layout.setVerticalGroup(
            panel_emPantalla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_emPantalla1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_emPantalla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(nombreAlumno)
                    .addComponent(cursoAlumno))
                .addGap(18, 18, 18)
                .addComponent(em_imagen)
                .addGap(50, 50, 50)
                .addGroup(panel_emPantalla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_asco)
                    .addComponent(btn_miedo)
                    .addComponent(btn_relajacion)
                    .addComponent(btn_tristeza)
                    .addComponent(btn_alegria)
                    .addComponent(btn_enfado))
                .addGap(30, 30, 30)
                .addComponent(btn_siguiente))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_emPantalla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_emPantalla1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed

        ImInicio iminicio = new ImInicio();
        iminicio.setVisible(true);

        String nombre = nombreAlumno.getText();
        String curso = cursoAlumno.getText();

        iminicio.nombreAlumno.setText(nombre);
        iminicio.cursoAlumno.setText(curso);
        dispose();

    }//GEN-LAST:event_btn_siguienteActionPerformed

    private void btn_ascoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ascoActionPerformed
        int id_alumno = Consulta(nombreAlumno.getText(), cursoAlumno.getText());
        SaveAsco(id_alumno);

        btn_tristeza.setEnabled(false);
        btn_alegria.setEnabled(false);
        btn_relajacion.setEnabled(false);
        btn_miedo.setEnabled(false);
        btn_asco.setEnabled(false);
        btn_enfado.setEnabled(false);

        btn_siguiente.setEnabled(true);
        btn_siguiente.setVisible(true);
    }//GEN-LAST:event_btn_ascoActionPerformed

    private void btn_miedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_miedoActionPerformed
        int id_alumno = Consulta(nombreAlumno.getText(), cursoAlumno.getText());
        SaveMiedo(id_alumno);

        btn_tristeza.setEnabled(false);
        btn_alegria.setEnabled(false);
        btn_relajacion.setEnabled(false);
        btn_miedo.setEnabled(false);
        btn_asco.setEnabled(false);
        btn_enfado.setEnabled(false);

        btn_siguiente.setEnabled(true);
        btn_siguiente.setVisible(true);
    }//GEN-LAST:event_btn_miedoActionPerformed

    private void btn_relajacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_relajacionActionPerformed
        int id_alumno = Consulta(nombreAlumno.getText(), cursoAlumno.getText());
        SaveRelajacion(id_alumno);

        btn_tristeza.setEnabled(false);
        btn_alegria.setEnabled(false);
        btn_relajacion.setEnabled(false);
        btn_miedo.setEnabled(false);
        btn_asco.setEnabled(false);
        btn_enfado.setEnabled(false);

        btn_siguiente.setEnabled(true);
        btn_siguiente.setVisible(true);
    }//GEN-LAST:event_btn_relajacionActionPerformed

    private void btn_tristezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tristezaActionPerformed
        int id_alumno = Consulta(nombreAlumno.getText(), cursoAlumno.getText());
        SaveTristeza(id_alumno);

        btn_tristeza.setEnabled(false);
        btn_alegria.setEnabled(false);
        btn_relajacion.setEnabled(false);
        btn_miedo.setEnabled(false);
        btn_asco.setEnabled(false);
        btn_enfado.setEnabled(false);

        btn_siguiente.setEnabled(true);
        btn_siguiente.setVisible(true);
    }//GEN-LAST:event_btn_tristezaActionPerformed

    private void btn_alegriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alegriaActionPerformed
        int id_alumno = Consulta(nombreAlumno.getText(), cursoAlumno.getText());
        SaveAlegria(id_alumno);

        btn_tristeza.setEnabled(false);
        btn_alegria.setEnabled(false);
        btn_relajacion.setEnabled(false);
        btn_miedo.setEnabled(false);
        btn_asco.setEnabled(false);
        btn_enfado.setEnabled(false);

        btn_siguiente.setEnabled(true);
        btn_siguiente.setVisible(true);
    }//GEN-LAST:event_btn_alegriaActionPerformed

    private void btn_enfadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enfadoActionPerformed
        int id_alumno = Consulta(nombreAlumno.getText(), cursoAlumno.getText());
        SaveEnfado(id_alumno);

        btn_tristeza.setEnabled(false);
        btn_alegria.setEnabled(false);
        btn_relajacion.setEnabled(false);
        btn_miedo.setEnabled(false);
        btn_asco.setEnabled(false);
        btn_enfado.setEnabled(false);

        btn_siguiente.setEnabled(true);
        btn_siguiente.setVisible(true);
    }//GEN-LAST:event_btn_enfadoActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(EmPantalla6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmPantalla6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmPantalla6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmPantalla6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmPantalla6().setVisible(true);
            }
        });
    }
    
    public int Consulta(String name, String course){
        int id=0;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String consultaSQL = "SELECT id_alumno FROM alumnos WHERE nombre = '" + name + "' AND '" + course + "'";
            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biofilia_bd", "biofilia", "biofilia");
            
            PreparedStatement sentencia = (PreparedStatement) conexion.prepareStatement(consultaSQL);
            ResultSet result = sentencia.executeQuery();
            
            
            
            while(result.next()){
                id=result.getInt(1);
                System.out.printf("%d",result.getInt(1));
            }
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
        return id;
        
    }
    
    public void SaveAlegria(int id_alumno){
        
       try {
            // Cargar el driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biofilia_bd", "biofilia", "biofilia");
            Statement sentencia = conexion.createStatement();
            String respuesta = "alegria";
            String sql = "insert into emoticonos (id_emoticono, id_alumno, respuesta) values ('"+ID_EMOTICONO+"','"+id_alumno+"','"+respuesta+"')";
            sentencia.executeUpdate(sql);
            System.out.println("Registro realizado");

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void SaveTristeza(int id_alumno){
        
       try {
            // Cargar el driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biofilia_bd", "biofilia", "biofilia");
            Statement sentencia = conexion.createStatement();
            String respuesta = "tristeza";
            String sql = "insert into emoticonos (id_emoticono, id_alumno, respuesta) values ('"+ID_EMOTICONO+"','"+id_alumno+"','"+respuesta+"')";
            sentencia.executeUpdate(sql);
            System.out.println("Registro realizado");

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void SaveRelajacion(int id_alumno){
        
       try {
            // Cargar el driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biofilia_bd", "biofilia", "biofilia");
            Statement sentencia = conexion.createStatement();
            String respuesta = "relajacion";
            String sql = "insert into emoticonos (id_emoticono, id_alumno, respuesta) values ('"+ID_EMOTICONO+"','"+id_alumno+"','"+respuesta+"')";
            sentencia.executeUpdate(sql);
            System.out.println("Registro realizado");

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void SaveMiedo(int id_alumno){
        
       try {
            // Cargar el driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biofilia_bd", "biofilia", "biofilia");
            Statement sentencia = conexion.createStatement();
            String respuesta = "miedo";
            String sql = "insert into emoticonos (id_emoticono, id_alumno, respuesta) values ('"+ID_EMOTICONO+"','"+id_alumno+"','"+respuesta+"')";
            sentencia.executeUpdate(sql);
            System.out.println("Registro realizado");

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void SaveAsco(int id_alumno){
        
       try {
            // Cargar el driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biofilia_bd", "biofilia", "biofilia");
            Statement sentencia = conexion.createStatement();
            String respuesta = "asco";
            String sql = "insert into emoticonos (id_emoticono, id_alumno, respuesta) values ('"+ID_EMOTICONO+"','"+id_alumno+"','"+respuesta+"')";
            sentencia.executeUpdate(sql);
            System.out.println("Registro realizado");

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
       
    }

    public void SaveEnfado(int id_alumno) {
        
        try {
            // Cargar el driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biofilia_bd", "biofilia", "biofilia");
            Statement sentencia = conexion.createStatement();
            String respuesta = "enfado";
            String sql = "insert into emoticonos (id_emoticono, id_alumno, respuesta) values ('"+ID_EMOTICONO+"','"+id_alumno+"','"+respuesta+"')";
            sentencia.executeUpdate(sql);
            System.out.println("Registro realizado");

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alegria;
    private javax.swing.JButton btn_asco;
    private javax.swing.JButton btn_enfado;
    private javax.swing.JButton btn_miedo;
    private javax.swing.JButton btn_relajacion;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JButton btn_tristeza;
    public static javax.swing.JLabel cursoAlumno;
    private javax.swing.JLabel em_imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel nombreAlumno;
    private javax.swing.JPanel panel_emPantalla1;
    // End of variables declaration//GEN-END:variables

    
}
