/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Jireh Castillo
 */
public class viewClientes extends javax.swing.JPanel {

    /**
     * Creates new form viewCliente
     */
    public viewClientes() {
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

        jl_Titulo = new javax.swing.JLabel();
        jl_Datos_Personales = new javax.swing.JLabel();
        jl_Nombre_Cliente = new javax.swing.JLabel();
        jl_Ap_Paterno = new javax.swing.JLabel();
        jl_Ap_Materno = new javax.swing.JLabel();
        jl_Rfc = new javax.swing.JLabel();
        jl_Telefono = new javax.swing.JLabel();
        jtf_Nombre_Cliente = new javax.swing.JTextField();
        jtf_Ap_Paterno_Cliente = new javax.swing.JTextField();
        jtf_Ap_Materno_Cliente = new javax.swing.JTextField();
        jtf_Rfc_Cliente = new javax.swing.JTextField();
        jtf_Telefono_Cliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jl_Direccion_Cliente = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jl_Calle_Clientes = new javax.swing.JLabel();
        jl_Colonia_Clientes = new javax.swing.JLabel();
        jl_Exterior_Cliente = new javax.swing.JLabel();
        jl_Interior_Cliente = new javax.swing.JLabel();
        jl_Codigo_Postal_Cliente = new javax.swing.JLabel();
        jtf_Calle_Cliente = new javax.swing.JTextField();
        jtf_Colonia_Cliente = new javax.swing.JTextField();
        jtf_Exterior_Cliente = new javax.swing.JTextField();
        jtf_Interior_Cliente = new javax.swing.JTextField();
        jtf_Codigo_Postal_Cliente = new javax.swing.JTextField();
        jb_Guardar_Cliente = new javax.swing.JButton();
        jb_Modificar_Cliente = new javax.swing.JButton();
        jb_Nuevo_Cliente = new javax.swing.JButton();
        jb_Eliminar_Cliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Tabla_Clientes = new javax.swing.JTable();
        jl_Genero_Cliente = new javax.swing.JLabel();
        jl_Correo_Cliente = new javax.swing.JLabel();
        jtf_Correo_Cliente = new javax.swing.JTextField();
        jcb_Genero_Cliente = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jl_Fondo_Cliente = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(557, 576));
        setLayout(null);

        jl_Titulo.setFont(new java.awt.Font("AR DESTINE", 1, 68)); // NOI18N
        jl_Titulo.setForeground(new java.awt.Color(255, 102, 0));
        jl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_Titulo.setText("Clientes");
        add(jl_Titulo);
        jl_Titulo.setBounds(0, 10, 1070, 61);

        jl_Datos_Personales.setFont(new java.awt.Font("AR DESTINE", 1, 18)); // NOI18N
        jl_Datos_Personales.setForeground(new java.awt.Color(255, 102, 0));
        jl_Datos_Personales.setText("DATOS PERSONALES");
        add(jl_Datos_Personales);
        jl_Datos_Personales.setBounds(20, 220, 184, 21);

        jl_Nombre_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jl_Nombre_Cliente.setText("Nombre");
        add(jl_Nombre_Cliente);
        jl_Nombre_Cliente.setBounds(30, 260, 56, 17);

        jl_Ap_Paterno.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jl_Ap_Paterno.setText("Apellido Paterno");
        add(jl_Ap_Paterno);
        jl_Ap_Paterno.setBounds(270, 260, 138, 17);

        jl_Ap_Materno.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jl_Ap_Materno.setText("Apellido Materno");
        add(jl_Ap_Materno);
        jl_Ap_Materno.setBounds(580, 260, 133, 17);

        jl_Rfc.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jl_Rfc.setText("RFC");
        add(jl_Rfc);
        jl_Rfc.setBounds(830, 260, 27, 17);

        jl_Telefono.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jl_Telefono.setText("Telefono");
        add(jl_Telefono);
        jl_Telefono.setBounds(29, 315, 66, 17);

        jtf_Nombre_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 12)); // NOI18N
        add(jtf_Nombre_Cliente);
        jtf_Nombre_Cliente.setBounds(30, 280, 140, 20);

        jtf_Ap_Paterno_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 12)); // NOI18N
        jtf_Ap_Paterno_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_Ap_Paterno_ClienteActionPerformed(evt);
            }
        });
        add(jtf_Ap_Paterno_Cliente);
        jtf_Ap_Paterno_Cliente.setBounds(270, 280, 150, 20);

        jtf_Ap_Materno_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 12)); // NOI18N
        add(jtf_Ap_Materno_Cliente);
        jtf_Ap_Materno_Cliente.setBounds(580, 280, 150, 20);

        jtf_Rfc_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 12)); // NOI18N
        add(jtf_Rfc_Cliente);
        jtf_Rfc_Cliente.setBounds(830, 280, 150, 20);

        jtf_Telefono_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 12)); // NOI18N
        add(jtf_Telefono_Cliente);
        jtf_Telefono_Cliente.setBounds(30, 340, 140, 20);
        add(jSeparator1);
        jSeparator1.setBounds(20, 213, 1050, 10);

        jl_Direccion_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 18)); // NOI18N
        jl_Direccion_Cliente.setForeground(new java.awt.Color(255, 102, 0));
        jl_Direccion_Cliente.setText("DIRECCIÓN");
        add(jl_Direccion_Cliente);
        jl_Direccion_Cliente.setBounds(20, 370, 92, 21);
        add(jSeparator2);
        jSeparator2.setBounds(20, 367, 1050, 10);

        jl_Calle_Clientes.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jl_Calle_Clientes.setText("Calle");
        add(jl_Calle_Clientes);
        jl_Calle_Clientes.setBounds(30, 420, 37, 17);

        jl_Colonia_Clientes.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jl_Colonia_Clientes.setText("Colonia");
        add(jl_Colonia_Clientes);
        jl_Colonia_Clientes.setBounds(270, 420, 55, 17);

        jl_Exterior_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jl_Exterior_Cliente.setText("No. Exterior");
        add(jl_Exterior_Cliente);
        jl_Exterior_Cliente.setBounds(500, 420, 97, 17);

        jl_Interior_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jl_Interior_Cliente.setText("No. Interior");
        add(jl_Interior_Cliente);
        jl_Interior_Cliente.setBounds(690, 420, 93, 17);

        jl_Codigo_Postal_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jl_Codigo_Postal_Cliente.setText("Codigo Postal");
        add(jl_Codigo_Postal_Cliente);
        jl_Codigo_Postal_Cliente.setBounds(880, 410, 107, 17);

        jtf_Calle_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 12)); // NOI18N
        add(jtf_Calle_Cliente);
        jtf_Calle_Cliente.setBounds(30, 440, 136, 20);

        jtf_Colonia_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 12)); // NOI18N
        add(jtf_Colonia_Cliente);
        jtf_Colonia_Cliente.setBounds(270, 440, 136, 20);

        jtf_Exterior_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 12)); // NOI18N
        jtf_Exterior_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_Exterior_ClienteActionPerformed(evt);
            }
        });
        add(jtf_Exterior_Cliente);
        jtf_Exterior_Cliente.setBounds(500, 440, 79, 20);

        jtf_Interior_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 12)); // NOI18N
        add(jtf_Interior_Cliente);
        jtf_Interior_Cliente.setBounds(690, 440, 73, 20);

        jtf_Codigo_Postal_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 12)); // NOI18N
        add(jtf_Codigo_Postal_Cliente);
        jtf_Codigo_Postal_Cliente.setBounds(880, 440, 107, 20);

        jb_Guardar_Cliente.setBackground(new java.awt.Color(255, 102, 0));
        jb_Guardar_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jb_Guardar_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        jb_Guardar_Cliente.setText("Guardar");
        add(jb_Guardar_Cliente);
        jb_Guardar_Cliente.setBounds(50, 500, 140, 40);

        jb_Modificar_Cliente.setBackground(new java.awt.Color(255, 102, 0));
        jb_Modificar_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jb_Modificar_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        jb_Modificar_Cliente.setText("Modificar");
        add(jb_Modificar_Cliente);
        jb_Modificar_Cliente.setBounds(270, 500, 150, 40);

        jb_Nuevo_Cliente.setBackground(new java.awt.Color(255, 102, 0));
        jb_Nuevo_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jb_Nuevo_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        jb_Nuevo_Cliente.setText("Nuevo");
        add(jb_Nuevo_Cliente);
        jb_Nuevo_Cliente.setBounds(520, 500, 140, 40);

        jb_Eliminar_Cliente.setBackground(new java.awt.Color(255, 102, 0));
        jb_Eliminar_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jb_Eliminar_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        jb_Eliminar_Cliente.setText("Eliminar");
        add(jb_Eliminar_Cliente);
        jb_Eliminar_Cliente.setBounds(770, 500, 150, 40);

        jt_Tabla_Clientes.setFont(new java.awt.Font("AR DESTINE", 1, 14)); // NOI18N
        jt_Tabla_Clientes.setForeground(new java.awt.Color(255, 102, 0));
        jt_Tabla_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido Paterno", "Apellido Materno", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jt_Tabla_Clientes);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 990, 103);

        jl_Genero_Cliente.setFont(new java.awt.Font("AR DESTINE", 0, 14)); // NOI18N
        jl_Genero_Cliente.setText("Genero");
        add(jl_Genero_Cliente);
        jl_Genero_Cliente.setBounds(270, 320, 47, 17);

        jl_Correo_Cliente.setFont(new java.awt.Font("AR DESTINE", 0, 14)); // NOI18N
        jl_Correo_Cliente.setText("Correo");
        add(jl_Correo_Cliente);
        jl_Correo_Cliente.setBounds(580, 320, 46, 17);

        jtf_Correo_Cliente.setFont(new java.awt.Font("AR DESTINE", 1, 12)); // NOI18N
        add(jtf_Correo_Cliente);
        jtf_Correo_Cliente.setBounds(580, 340, 150, 20);

        jcb_Genero_Cliente.setFont(new java.awt.Font("AR DESTINE", 0, 14)); // NOI18N
        jcb_Genero_Cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        add(jcb_Genero_Cliente);
        jcb_Genero_Cliente.setBounds(270, 340, 60, 23);
        add(jSeparator3);
        jSeparator3.setBounds(20, 469, 1050, 10);

        jl_Fondo_Cliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jireh Castillo\\Documents\\acme\\fondo.jpg")); // NOI18N
        add(jl_Fondo_Cliente);
        jl_Fondo_Cliente.setBounds(-30, 0, 1110, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_Exterior_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_Exterior_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_Exterior_ClienteActionPerformed

    private void jtf_Ap_Paterno_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_Ap_Paterno_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_Ap_Paterno_ClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JButton jb_Eliminar_Cliente;
    public javax.swing.JButton jb_Guardar_Cliente;
    public javax.swing.JButton jb_Modificar_Cliente;
    public javax.swing.JButton jb_Nuevo_Cliente;
    public javax.swing.JComboBox<String> jcb_Genero_Cliente;
    public javax.swing.JLabel jl_Ap_Materno;
    public javax.swing.JLabel jl_Ap_Paterno;
    public javax.swing.JLabel jl_Calle_Clientes;
    public javax.swing.JLabel jl_Codigo_Postal_Cliente;
    public javax.swing.JLabel jl_Colonia_Clientes;
    private javax.swing.JLabel jl_Correo_Cliente;
    public javax.swing.JLabel jl_Datos_Personales;
    public javax.swing.JLabel jl_Direccion_Cliente;
    public javax.swing.JLabel jl_Exterior_Cliente;
    private javax.swing.JLabel jl_Fondo_Cliente;
    private javax.swing.JLabel jl_Genero_Cliente;
    public javax.swing.JLabel jl_Interior_Cliente;
    public javax.swing.JLabel jl_Nombre_Cliente;
    public javax.swing.JLabel jl_Rfc;
    public javax.swing.JLabel jl_Telefono;
    public javax.swing.JLabel jl_Titulo;
    public javax.swing.JTable jt_Tabla_Clientes;
    public javax.swing.JTextField jtf_Ap_Materno_Cliente;
    public javax.swing.JTextField jtf_Ap_Paterno_Cliente;
    public javax.swing.JTextField jtf_Calle_Cliente;
    public javax.swing.JTextField jtf_Codigo_Postal_Cliente;
    public javax.swing.JTextField jtf_Colonia_Cliente;
    public javax.swing.JTextField jtf_Correo_Cliente;
    public javax.swing.JTextField jtf_Exterior_Cliente;
    public javax.swing.JTextField jtf_Interior_Cliente;
    public javax.swing.JTextField jtf_Nombre_Cliente;
    public javax.swing.JTextField jtf_Rfc_Cliente;
    public javax.swing.JTextField jtf_Telefono_Cliente;
    // End of variables declaration//GEN-END:variables
}
