/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author manl_
 */
public class viewCatalogo extends javax.swing.JPanel {

    /**
     * Creates new form viewCatalogo
     */
    public viewCatalogo() {
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

        jPanel1 = new javax.swing.JPanel();
        jl_buscar = new javax.swing.JLabel();
        jtf_buscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_catalogo = new javax.swing.JTable();
        jl_nombre = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jl_codigobarras = new javax.swing.JLabel();
        jtf_codigobarras = new javax.swing.JTextField();
        jl_iva = new javax.swing.JLabel();
        jcb_iva = new javax.swing.JComboBox<>();
        jl_descripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_descripcion = new javax.swing.JTextArea();
        jl_preciou = new javax.swing.JLabel();
        jtf_preciou = new javax.swing.JTextField();
        jl_preciom = new javax.swing.JLabel();
        jtf_preciom = new javax.swing.JTextField();
        jl_unidadmedida = new javax.swing.JLabel();
        jcb_unidadmedida = new javax.swing.JComboBox<>();
        jl_capacidad = new javax.swing.JLabel();
        jtf_capacidad = new javax.swing.JTextField();
        jb_agregar = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jb_volver = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(1068, 543));
        jPanel1.setLayout(null);

        jl_buscar.setText("Buscar:");
        jPanel1.add(jl_buscar);
        jl_buscar.setBounds(317, 43, 36, 14);
        jPanel1.add(jtf_buscar);
        jtf_buscar.setBounds(363, 40, 191, 20);

        jt_catalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio unitario", "Precio Mayoreo", "Unidad", "Capacidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_catalogo);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(45, 100, 970, 189);

        jl_nombre.setText("Nombre:");
        jPanel1.add(jl_nombre);
        jl_nombre.setBounds(149, 322, 41, 14);
        jPanel1.add(jtf_nombre);
        jtf_nombre.setBounds(194, 319, 168, 20);

        jl_codigobarras.setText("Codigo de barras:");
        jPanel1.add(jl_codigobarras);
        jl_codigobarras.setBounds(104, 356, 86, 14);
        jPanel1.add(jtf_codigobarras);
        jtf_codigobarras.setBounds(194, 353, 168, 20);

        jl_iva.setText("IVA:");
        jPanel1.add(jl_iva);
        jl_iva.setBounds(169, 390, 21, 14);

        jcb_iva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "No" }));
        jPanel1.add(jcb_iva);
        jcb_iva.setBounds(211, 387, 38, 20);

        jl_descripcion.setText("Descripción:");
        jPanel1.add(jl_descripcion);
        jl_descripcion.setBounds(132, 420, 58, 14);

        jta_descripcion.setColumns(20);
        jta_descripcion.setRows(5);
        jScrollPane1.setViewportView(jta_descripcion);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(194, 420, 289, 64);

        jl_preciou.setText("Precio unitario:");
        jPanel1.add(jl_preciou);
        jl_preciou.setBounds(525, 322, 72, 14);
        jPanel1.add(jtf_preciou);
        jtf_preciou.setBounds(607, 319, 83, 20);

        jl_preciom.setText("Precio mayoreo:");
        jPanel1.add(jl_preciom);
        jl_preciom.setBounds(519, 352, 78, 14);
        jPanel1.add(jtf_preciom);
        jtf_preciom.setBounds(607, 353, 83, 20);

        jl_unidadmedida.setText("Unidad de medida:");
        jPanel1.add(jl_unidadmedida);
        jl_unidadmedida.setBounds(508, 390, 89, 14);

        jcb_unidadmedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KILOS", "LITROS", "METRO LINEAL", "PIEZAS" }));
        jPanel1.add(jcb_unidadmedida);
        jcb_unidadmedida.setBounds(607, 387, 97, 20);

        jl_capacidad.setText("Capacidad:");
        jPanel1.add(jl_capacidad);
        jl_capacidad.setBounds(543, 423, 54, 14);
        jPanel1.add(jtf_capacidad);
        jtf_capacidad.setBounds(607, 420, 83, 20);

        jb_agregar.setText("Agregar");
        jPanel1.add(jb_agregar);
        jb_agregar.setBounds(813, 318, 71, 23);

        jb_modificar.setText("Modificar");
        jPanel1.add(jb_modificar);
        jb_modificar.setBounds(813, 352, 75, 23);

        jb_eliminar.setText("Eliminar");
        jPanel1.add(jb_eliminar);
        jb_eliminar.setBounds(813, 386, 78, 23);

        jb_guardar.setText("Guardar");
        jPanel1.add(jb_guardar);
        jb_guardar.setBounds(909, 318, 78, 23);

        jb_cancelar.setText("Cancelar");
        jPanel1.add(jb_cancelar);
        jb_cancelar.setBounds(909, 352, 78, 23);

        jb_volver.setText("Volver");
        jPanel1.add(jb_volver);
        jb_volver.setBounds(940, 486, 63, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_volver;
    private javax.swing.JComboBox<String> jcb_iva;
    private javax.swing.JComboBox<String> jcb_unidadmedida;
    private javax.swing.JLabel jl_buscar;
    private javax.swing.JLabel jl_capacidad;
    private javax.swing.JLabel jl_codigobarras;
    private javax.swing.JLabel jl_descripcion;
    private javax.swing.JLabel jl_iva;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_preciom;
    private javax.swing.JLabel jl_preciou;
    private javax.swing.JLabel jl_unidadmedida;
    private javax.swing.JTable jt_catalogo;
    private javax.swing.JTextArea jta_descripcion;
    private javax.swing.JTextField jtf_buscar;
    private javax.swing.JTextField jtf_capacidad;
    private javax.swing.JTextField jtf_codigobarras;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_preciom;
    private javax.swing.JTextField jtf_preciou;
    // End of variables declaration//GEN-END:variables
}
