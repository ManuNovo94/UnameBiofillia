package biofiliaproject;

import biofiliaproject.preguntas.Nature;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FirstForm extends javax.swing.JFrame {

    private String nombre, curso;
    /**
     * Creates new form Form2
     */
    public FirstForm() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel_inicio.setVisible(true);
        
        
        //Layout 
        /*
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        contenedor.add(txt_title);
        contenedor.add(txt_descripcion);
        contenedor.add(txt_name);
        contenedor.add(txt_course);
        contenedor.add(btn_aceptar);
        contenedor.add(txt_curso);
        contenedor.add(txt_nombre);
        
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        contenedor.add(txt_title, BorderLayout.NORTH);
        //contenedor.add(txt_descripcion);
        contenedor.add(txt_name, BorderLayout.CENTER);
        contenedor.add(txt_nombre, BorderLayout.CENTER);
        contenedor.add(txt_course, BorderLayout.CENTER);
        contenedor.add(txt_course, BorderLayout.CENTER);
        contenedor.add(btn_aceptar, BorderLayout.SOUTH);
        */
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_inicio = new javax.swing.JPanel();
        btn_aceptar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_title = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JLabel();
        txt_curso = new javax.swing.JTextField();
        txt_name = new javax.swing.JLabel();
        txt_course = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusCycleRoot(false);
        setName("frame_inicio"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1020, 720));

        panel_inicio.setBackground(new java.awt.Color(255, 255, 255));
        panel_inicio.setPreferredSize(new java.awt.Dimension(1020, 720));

        btn_aceptar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_aceptar.setText("ACEPTAR");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        txt_title.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txt_title.setText("BIENVENIDO");
        txt_title.setToolTipText("");
        txt_title.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txt_descripcion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_descripcion.setText("Introduzca el nombre y el curso del alumno:");

        txt_name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_name.setText("Nombre");

        txt_course.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_course.setText("Curso");

        javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
        panel_inicio.setLayout(panel_inicioLayout);
        panel_inicioLayout.setHorizontalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_inicioLayout.createSequentialGroup()
                        .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_name))
                        .addGap(300, 300, 300)
                        .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_course)))
                    .addComponent(txt_title, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_inicioLayout.setVerticalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(txt_title, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name)
                    .addComponent(txt_course))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(btn_aceptar)
                .addGap(200, 200, 200))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 1183, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
        
        if((txt_nombre.getText().isEmpty())&&txt_curso.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Los campos son obligatorios");
            System.exit(0);
        }
            
        
        Save();
        Nature nature = new Nature();
        nature.setVisible(true);

        String nombre = txt_nombre.getText();
        String curso = txt_curso.getText();

        Nature.nombreAlumno.setText(nombre);
        Nature.cursoAlumno.setText(curso);
        dispose();

        /*NaturePanel panel_naturaleza = new NaturePanel();
        panel_naturaleza.setSize(1020,720);

        panel_inicio.removeAll();
        panel_inicio.add(panel_naturaleza, BorderLayout.CENTER);
        panel_inicio.revalidate();
        panel_inicio.repaint();
        */
        //panel_inicio.setVisible(false);
        //panel_naturaleza.setVisible(true);
        //Nature second = new Nature();
        //second.setVisible(true);
        //dispose();
    }//GEN-LAST:event_btn_aceptarActionPerformed

    
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
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstForm().setVisible(true);
            }
        });
    }
    
    public void Save(){
    
       try {
            // Cargar el driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/biofilia_bd", "biofilia", "biofilia");
            Statement sentencia = conexion.createStatement();
            String nombre = txt_nombre.getText();
            String curso = txt_curso.getText();
            String sql = "insert into alumnos (nombre, curso) values ('"+nombre+"','"+curso+"')";
           sentencia.executeUpdate(sql);
            System.out.println("Registro realizado");
          //  ResultSet resul = sentencia.executeQuery(sql);
/*
            while (resul.next()) {
                System.out.printf("%s \n", resul.getString(1));
            }*/

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JLabel txt_course;
    public static javax.swing.JTextField txt_curso;
    private javax.swing.JLabel txt_descripcion;
    private javax.swing.JLabel txt_name;
    public static javax.swing.JTextField txt_nombre;
    private javax.swing.JLabel txt_title;
    // End of variables declaration//GEN-END:variables
}
