package lab2_rodriguezaaron_gutierrezcamilo;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class View extends javax.swing.JFrame {

    public class Imagenes extends javax.swing.JPanel {

        public Imagenes() {
            this.setSize(900, 630);
        }

        @Override
        public void paint(Graphics grafico) {
            Dimension height = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/fondo2-01.png"));
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

    int matriz_vendedor[][] = new int[100][4], matriz_vendedor_mas[][] = new int[100][3], matriz_venta[][] = new int[100][6], matriz_producto[][] = new int[100][4], matriz_aux[][] = new int[100][2];
    float matriz_sueldo[][] = new float[100][7];
    float aux_sueldo[][] = new float[100][7];
    int topeF = 0, topeF1 = 0, topeF2 = 0, topeaux = -1, topeF4 = 0, mejor_vendedor = 0, topeF5 = 0, add, add2, topeaux2 = -1, compraMasAlta = 0, compraMasAltaClienteP = 0, compraMasAltaClienteT = 0;
    String pago[][] = new String[100][1], nombreVendedor[][] = new String[100][2], nombreVendedorMas[][] = new String[100][2], matriz_cliente[][] = new String[100][5], matriz_descripcionproducto[][] = new String[100][1], descripcion[][] = new String[100][1], matriz_mp[][] = new String[100][4]; //las columnas 0 y 4 de la matriz_cliente son int pero lo dejare como string;

    public View() {
        initComponents();
        setIconImage(getIconImage());
        Imagenes Imagenes = new Imagenes();
        Imagenes Imagenes1 = new Imagenes();
        Imagenes Imagenes2 = new Imagenes();
        Imagenes Imagenes3 = new Imagenes();
        Imagenes Imagenes4 = new Imagenes();
        Imagenes Imagenes5 = new Imagenes();
        Imagenes Imagenes6 = new Imagenes();
        Imagenes Imagenes7 = new Imagenes();
        jv.add(Imagenes1);
        jv.repaint();
        wc.add(Imagenes2);
        wc.repaint();
        jvn.add(Imagenes3);
        jvn.repaint();
        cl.add(Imagenes4);
        cl.repaint();
        in.add(Imagenes5);
        in.repaint();
        mv.add(Imagenes6);
        mv.repaint();
        mmv.add(Imagenes);
        mmv.repaint();
        sul.add(Imagenes7);
        sul.repaint();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Errores/icono-01.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        salirB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        salirB1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Bvendedor = new javax.swing.JButton();
        Bventas = new javax.swing.JButton();
        Bclientes = new javax.swing.JButton();
        Bsuel = new javax.swing.JButton();
        Bmv = new javax.swing.JButton();
        Btv = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Binv = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        Welcon = new javax.swing.JTabbedPane();
        pbv = new javax.swing.JPanel();
        wc = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        Venta = new javax.swing.JPanel();
        errorMenssage = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jvn = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ventasTbl = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        ingresar2B = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        tf_cvendida2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tf_preciou = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tf_cproducto1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tf_comprador = new javax.swing.JTextField();
        tf_cvendedor2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tarjetasBox = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Vendedor = new javax.swing.JPanel();
        jv = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vendedorTbl = new javax.swing.JTable();
        errorMenssage1 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel14 = new javax.swing.JPanel();
        ingresar1B = new javax.swing.JButton();
        tf_cvendedor1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tf_apellidovendedor = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tf_nombrevendedor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Cliente = new javax.swing.JPanel();
        errorMenssage3 = new javax.swing.JPanel();
        jToggleButton3 = new javax.swing.JToggleButton();
        cl = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientesTbl = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        ingresar4B = new javax.swing.JButton();
        tf_correo = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tf_apellidosclientes = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tf_nombresclientes = new javax.swing.JTextField();
        tf_cedula = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Inv = new javax.swing.JPanel();
        errorMenssage2 = new javax.swing.JPanel();
        jToggleButton4 = new javax.swing.JToggleButton();
        in = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        inventarioTbl = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        ingresar4B4 = new javax.swing.JButton();
        tf_cantidadproducto = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        tf_vproducto = new javax.swing.JTextField();
        tf_cproducto2 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        tf_descripcion = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        ingresar4B5 = new javax.swing.JButton();
        tf_descripcion1 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        tf_cantidadproducto1 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        tf_vproducto1 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        tf_cproducto3 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        Mv = new javax.swing.JPanel();
        mv = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        vendedorMenos = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        vendedorMas = new javax.swing.JLabel();
        codigoVendedorMas = new javax.swing.JLabel();
        cantidadVendedorMenos = new javax.swing.JLabel();
        codigoVendedorMenos = new javax.swing.JLabel();
        cantidadVendedorMas = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        vendedorTbl1 = new javax.swing.JTable();
        Pmv = new javax.swing.JPanel();
        mmv = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        productoMVTbl = new javax.swing.JTable();
        jLabel48 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        numerosUnidades = new javax.swing.JLabel();
        descripcionProducto = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        codigoProducto = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        sul = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        sueldoTbl = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        ingresar4B3 = new javax.swing.JButton();
        tf_codigobuscar = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(66, 70, 66));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirB.setBackground(new java.awt.Color(243, 244, 237));
        salirB.setForeground(new java.awt.Color(22, 135, 167));
        jPanel4.add(salirB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 50, 50));

        jLabel2.setText("Aqui el logo");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jPanel3.setBackground(new java.awt.Color(243, 244, 237));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 29, 37));
        jLabel1.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        jLabel1.setText("Productos");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 29, 37));
        jLabel3.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        jLabel3.setText("Productos");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 29, 37));
        jLabel5.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        jLabel5.setText("Productos");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 29, 37));
        jLabel6.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        jLabel6.setText("Productos");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 440));

        jLabel4.setBackground(new java.awt.Color(0, 29, 37));
        jLabel4.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        jLabel4.setText("Productos");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jPanel5.setBackground(new java.awt.Color(66, 70, 66));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirB1.setBackground(new java.awt.Color(243, 244, 237));
        salirB1.setForeground(new java.awt.Color(22, 135, 167));
        jPanel5.add(salirB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 50, 50));

        jLabel7.setText("Aqui el logo");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jPanel6.setBackground(new java.awt.Color(243, 244, 237));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 29, 37));
        jLabel8.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        jLabel8.setText("Productos");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 29, 37));
        jLabel9.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        jLabel9.setText("Productos");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 29, 37));
        jLabel10.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        jLabel10.setText("Productos");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 29, 37));
        jLabel11.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        jLabel11.setText("Productos");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 440));

        jLabel12.setBackground(new java.awt.Color(0, 29, 37));
        jLabel12.setFont(new java.awt.Font("Oswald", 1, 14)); // NOI18N
        jLabel12.setText("Productos");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jPanel7.setBackground(new java.awt.Color(83, 97, 98));

        jPanel8.setBackground(new java.awt.Color(83, 97, 98));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 10, 440));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 440));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 490));
        setResizable(false);
        setSize(new java.awt.Dimension(840, 490));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(66, 70, 66));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 15, 650));

        jPanel9.setBackground(new java.awt.Color(83, 97, 98));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 20, 650));

        jPanel2.setBackground(new java.awt.Color(243, 244, 237));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bvendedor.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        Bvendedor.setForeground(new java.awt.Color(51, 51, 51));
        Bvendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VendedorF1-01.png"))); // NOI18N
        Bvendedor.setText("Vendedor");
        Bvendedor.setBorderPainted(false);
        Bvendedor.setContentAreaFilled(false);
        Bvendedor.setDefaultCapable(false);
        Bvendedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bvendedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VendedorF1-01.png"))); // NOI18N
        Bvendedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2-01.png"))); // NOI18N
        Bvendedor.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2-01.png"))); // NOI18N
        Bvendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BvendedorMouseClicked(evt);
            }
        });
        Bvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvendedorActionPerformed(evt);
            }
        });
        jPanel2.add(Bvendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 190, 160, 40));

        Bventas.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        Bventas.setForeground(new java.awt.Color(51, 51, 51));
        Bventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventas1-01.png"))); // NOI18N
        Bventas.setText("Venta");
        Bventas.setBorderPainted(false);
        Bventas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bventas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventas1-01.png"))); // NOI18N
        Bventas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventas2-01.png"))); // NOI18N
        Bventas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventas2-01.png"))); // NOI18N
        Bventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BventasMouseClicked(evt);
            }
        });
        Bventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BventasActionPerformed(evt);
            }
        });
        jPanel2.add(Bventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 230, 160, 40));

        Bclientes.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        Bclientes.setForeground(new java.awt.Color(51, 51, 51));
        Bclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente1-01.png"))); // NOI18N
        Bclientes.setText("Cliente");
        Bclientes.setBorderPainted(false);
        Bclientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bclientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente1-01.png"))); // NOI18N
        Bclientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente2-01.png"))); // NOI18N
        Bclientes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente2-01.png"))); // NOI18N
        Bclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BclientesMouseClicked(evt);
            }
        });
        Bclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BclientesActionPerformed(evt);
            }
        });
        jPanel2.add(Bclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 270, 160, 40));

        Bsuel.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        Bsuel.setForeground(new java.awt.Color(51, 51, 51));
        Bsuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Suel1-01.png"))); // NOI18N
        Bsuel.setText("Sueldo");
        Bsuel.setBorderPainted(false);
        Bsuel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bsuel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Suel1-01.png"))); // NOI18N
        Bsuel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Suel2-01.png"))); // NOI18N
        Bsuel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Suel2-01.png"))); // NOI18N
        Bsuel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BsuelMouseClicked(evt);
            }
        });
        Bsuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsuelActionPerformed(evt);
            }
        });
        jPanel2.add(Bsuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 350, 160, 40));

        Bmv.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        Bmv.setForeground(new java.awt.Color(51, 51, 51));
        Bmv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mv2-01.png"))); // NOI18N
        Bmv.setText("Vendedor±");
        Bmv.setBorderPainted(false);
        Bmv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bmv.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mv2-01.png"))); // NOI18N
        Bmv.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mv1-01.png"))); // NOI18N
        Bmv.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mv1-01.png"))); // NOI18N
        Bmv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BmvMouseClicked(evt);
            }
        });
        Bmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmvActionPerformed(evt);
            }
        });
        jPanel2.add(Bmv, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 390, 160, 40));

        Btv.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        Btv.setForeground(new java.awt.Color(51, 51, 51));
        Btv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mvv1-01.png"))); // NOI18N
        Btv.setText("Top Venta");
        Btv.setBorderPainted(false);
        Btv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btv.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mvv1-01.png"))); // NOI18N
        Btv.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventas2-01-01.png"))); // NOI18N
        Btv.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventas2-01-01.png"))); // NOI18N
        Btv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtvMouseClicked(evt);
            }
        });
        Btv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtvActionPerformed(evt);
            }
        });
        jPanel2.add(Btv, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 430, 160, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar1-01.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar2-01.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 560, 30, 30));

        Binv.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        Binv.setForeground(new java.awt.Color(51, 51, 51));
        Binv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario1-01.png"))); // NOI18N
        Binv.setText("Inventario");
        Binv.setBorderPainted(false);
        Binv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Binv.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario1-01.png"))); // NOI18N
        Binv.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario2-01.png"))); // NOI18N
        Binv.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario2-01.png"))); // NOI18N
        Binv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BinvMouseClicked(evt);
            }
        });
        Binv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinvActionPerformed(evt);
            }
        });
        jPanel2.add(Binv, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 310, 160, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Errores/Logo-01.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Errores/Logo2-01.png"))); // NOI18N
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 650));

        jPanel11.setBackground(new java.awt.Color(192, 96, 20));
        jPanel11.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 900, 30));

        Welcon.setBackground(new java.awt.Color(255, 255, 255));
        Welcon.setAlignmentX(0.0F);
        Welcon.setAlignmentY(0.0F);
        Welcon.setEnabled(false);

        pbv.setBackground(new java.awt.Color(255, 255, 255));
        pbv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wc.setAlignmentX(0.0F);
        wc.setAlignmentY(0.0F);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bnv-01.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bnv1-01.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wcLayout = new javax.swing.GroupLayout(wc);
        wc.setLayout(wcLayout);
        wcLayout.setHorizontalGroup(
            wcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wcLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        wcLayout.setVerticalGroup(
            wcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wcLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        pbv.add(wc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        Welcon.addTab("Welcon", pbv);

        Venta.setBackground(new java.awt.Color(255, 255, 255));
        Venta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        errorMenssage.setBackground(new java.awt.Color(219, 96, 75));
        errorMenssage.setPreferredSize(new java.awt.Dimension(50, 50));
        errorMenssage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(219, 96, 75));
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        errorMenssage.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        Venta.add(errorMenssage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 570, 0));

        ventasTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Vendedor", "Cédula ", "Código Producto", "Valor Unitario", "Cantidad Ventas", "Puntos de Venta", "Medio de Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ventasTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ventasTbl);
        if (ventasTbl.getColumnModel().getColumnCount() > 0) {
            ventasTbl.getColumnModel().getColumn(0).setResizable(false);
            ventasTbl.getColumnModel().getColumn(1).setResizable(false);
            ventasTbl.getColumnModel().getColumn(2).setResizable(false);
            ventasTbl.getColumnModel().getColumn(3).setResizable(false);
            ventasTbl.getColumnModel().getColumn(5).setResizable(false);
            ventasTbl.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel22.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N

        jPanel13.setBackground(new java.awt.Color(243, 244, 237));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        ingresar2B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ok-01.png"))); // NOI18N
        ingresar2B.setBorderPainted(false);
        ingresar2B.setContentAreaFilled(false);
        ingresar2B.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ok-2-01.png"))); // NOI18N
        ingresar2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar2BActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel24.setText("Medio de Pago");

        tf_cvendida2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_cvendida2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cvendida2KeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel25.setText("Cantidad a Vender");

        tf_preciou.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_preciou.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_preciouKeyTyped(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel26.setText("Precio Por Unidad");

        tf_cproducto1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_cproducto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cproducto1KeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel16.setText("Código de Producto");

        tf_comprador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_comprador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_compradorKeyTyped(evt);
            }
        });

        tf_cvendedor2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_cvendedor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cvendedor2KeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel17.setText("Código de Vendedor");

        jLabel18.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel18.setText("Cédula");

        tarjetasBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Efectivo", "Tarjeta Debito", "Puntos" }));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mmm-01.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mmm-2-01.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel24)
                            .addComponent(tf_cvendida2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(tf_preciou, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(tf_cproducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(tf_comprador, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(tf_cvendedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(ingresar2B, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tarjetasBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel17)
                .addGap(13, 13, 13)
                .addComponent(tf_cvendedor2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(13, 13, 13)
                        .addComponent(tf_comprador, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel16)
                        .addGap(13, 13, 13)
                        .addComponent(tf_cproducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel26)
                        .addGap(13, 13, 13)
                        .addComponent(tf_preciou, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel25)
                        .addGap(13, 13, 13)
                        .addComponent(tf_cvendida2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel24)
                        .addGap(13, 13, 13)
                        .addComponent(tarjetasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(ingresar2B, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jLabel13.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 36)); // NOI18N
        jLabel13.setText("Registro de Ventas");

        javax.swing.GroupLayout jvnLayout = new javax.swing.GroupLayout(jvn);
        jvn.setLayout(jvnLayout);
        jvnLayout.setHorizontalGroup(
            jvnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jvnLayout.createSequentialGroup()
                .addGroup(jvnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jvnLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jvnLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel13))
                    .addGroup(jvnLayout.createSequentialGroup()
                        .addGap(715, 715, 715)
                        .addComponent(jLabel22)))
                .addContainerGap())
        );
        jvnLayout.setVerticalGroup(
            jvnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jvnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addGap(32, 32, 32)
                .addGroup(jvnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jvnLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addGap(237, 237, 237))
                    .addGroup(jvnLayout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Venta.add(jvn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        Welcon.addTab("Venta", Venta);

        Vendedor.setBackground(new java.awt.Color(255, 255, 255));
        Vendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vendedorTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Vendedor", "Apellido (s)", "Nombre (s)", "Cantidad Vendida", "Total de Ventas en Pesos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vendedorTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(vendedorTbl);
        if (vendedorTbl.getColumnModel().getColumnCount() > 0) {
            vendedorTbl.getColumnModel().getColumn(0).setResizable(false);
            vendedorTbl.getColumnModel().getColumn(1).setResizable(false);
            vendedorTbl.getColumnModel().getColumn(2).setResizable(false);
            vendedorTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        errorMenssage1.setBackground(new java.awt.Color(219, 96, 75));
        errorMenssage1.setPreferredSize(new java.awt.Dimension(50, 50));
        errorMenssage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton2.setBackground(new java.awt.Color(219, 96, 75));
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        errorMenssage1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        jPanel14.setBackground(new java.awt.Color(243, 244, 237));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        ingresar1B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ok-01.png"))); // NOI18N
        ingresar1B.setBorderPainted(false);
        ingresar1B.setContentAreaFilled(false);
        ingresar1B.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ok-2-01.png"))); // NOI18N
        ingresar1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar1BActionPerformed(evt);
            }
        });

        tf_cvendedor1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_cvendedor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cvendedor1KeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel28.setText("Código de Vendedor");

        tf_apellidovendedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_apellidovendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_apellidovendedorKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel29.setText("Apellido (s)");

        tf_nombrevendedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_nombrevendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nombrevendedorKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel19.setText("Nombre (s)");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tf_cvendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(tf_apellidovendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(tf_nombrevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(ingresar1B, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel19)
                .addGap(13, 13, 13)
                .addComponent(tf_nombrevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel29)
                .addGap(13, 13, 13)
                .addComponent(tf_apellidovendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel28)
                .addGap(13, 13, 13)
                .addComponent(tf_cvendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ingresar1B, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 36)); // NOI18N
        jLabel14.setText("Información del Vendedor");

        javax.swing.GroupLayout jvLayout = new javax.swing.GroupLayout(jv);
        jv.setLayout(jvLayout);
        jvLayout.setHorizontalGroup(
            jvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jvLayout.createSequentialGroup()
                .addGroup(jvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jvLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel14))
                    .addGroup(jvLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(errorMenssage1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jvLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jvLayout.setVerticalGroup(
            jvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jvLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addGroup(jvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jvLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jvLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMenssage1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Vendedor.add(jv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        Welcon.addTab("Vendedor", Vendedor);

        Cliente.setBackground(new java.awt.Color(255, 255, 255));
        Cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        errorMenssage3.setBackground(new java.awt.Color(219, 96, 75));
        errorMenssage3.setPreferredSize(new java.awt.Dimension(50, 50));
        errorMenssage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton3.setBackground(new java.awt.Color(219, 96, 75));
        jToggleButton3.setBorderPainted(false);
        jToggleButton3.setContentAreaFilled(false);
        jToggleButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        errorMenssage3.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        Cliente.add(errorMenssage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 570, 0));

        cl.setAlignmentX(0.0F);
        cl.setAlignmentY(0.0F);

        clientesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Apellido (s)", "Nombre (s)", "Correo Electrónico", "Puntos Acumulados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientesTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(clientesTbl);
        if (clientesTbl.getColumnModel().getColumnCount() > 0) {
            clientesTbl.getColumnModel().getColumn(0).setResizable(false);
            clientesTbl.getColumnModel().getColumn(1).setResizable(false);
            clientesTbl.getColumnModel().getColumn(2).setResizable(false);
            clientesTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel15.setBackground(new java.awt.Color(243, 244, 237));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        ingresar4B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ok-01.png"))); // NOI18N
        ingresar4B.setBorderPainted(false);
        ingresar4B.setContentAreaFilled(false);
        ingresar4B.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ok-2-01.png"))); // NOI18N
        ingresar4B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar4BActionPerformed(evt);
            }
        });

        tf_correo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel31.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel31.setText("Correo Electrónico");

        tf_apellidosclientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_apellidosclientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_apellidosclientesKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel20.setText("Apellido (s)");

        tf_nombresclientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_nombresclientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nombresclientesKeyTyped(evt);
            }
        });

        tf_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cedulaKeyTyped(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel21.setText("Cédula");

        jLabel23.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel23.setText("Nombre (s)");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(tf_apellidosclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(tf_nombresclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(ingresar4B, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel21)
                .addGap(13, 13, 13)
                .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel23)
                .addGap(13, 13, 13)
                .addComponent(tf_nombresclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel20)
                .addGap(13, 13, 13)
                .addComponent(tf_apellidosclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel31)
                .addGap(13, 13, 13)
                .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(ingresar4B, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 36)); // NOI18N
        jLabel15.setText("Información del Cliente");

        javax.swing.GroupLayout clLayout = new javax.swing.GroupLayout(cl);
        cl.setLayout(clLayout);
        clLayout.setHorizontalGroup(
            clLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clLayout.createSequentialGroup()
                .addGroup(clLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel15))
                    .addGroup(clLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        clLayout.setVerticalGroup(
            clLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addGap(32, 32, 32)
                .addGroup(clLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(clLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        Cliente.add(cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        Welcon.addTab("Cliente", Cliente);

        Inv.setBackground(new java.awt.Color(255, 255, 255));
        Inv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        errorMenssage2.setBackground(new java.awt.Color(219, 96, 75));
        errorMenssage2.setPreferredSize(new java.awt.Dimension(50, 50));
        errorMenssage2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton4.setBackground(new java.awt.Color(219, 96, 75));
        jToggleButton4.setBorderPainted(false);
        jToggleButton4.setContentAreaFilled(false);
        jToggleButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        errorMenssage2.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        Inv.add(errorMenssage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 570, 0));

        inventarioTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripción", "Código de Producto", "Valor Unitario", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventarioTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(inventarioTbl);
        if (inventarioTbl.getColumnModel().getColumnCount() > 0) {
            inventarioTbl.getColumnModel().getColumn(0).setResizable(false);
            inventarioTbl.getColumnModel().getColumn(1).setResizable(false);
            inventarioTbl.getColumnModel().getColumn(2).setResizable(false);
            inventarioTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel34.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 36)); // NOI18N
        jLabel34.setText("Inventario");

        jPanel20.setBackground(new java.awt.Color(243, 244, 237));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        ingresar4B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ok-01.png"))); // NOI18N
        ingresar4B4.setBorderPainted(false);
        ingresar4B4.setContentAreaFilled(false);
        ingresar4B4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ok-2-01.png"))); // NOI18N
        ingresar4B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar4B4ActionPerformed(evt);
            }
        });

        tf_cantidadproducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_cantidadproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cantidadproductoActionPerformed(evt);
            }
        });
        tf_cantidadproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cantidadproductoKeyTyped(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel55.setText("Unidades Disponibles");

        tf_vproducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_vproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_vproductoKeyTyped(evt);
            }
        });

        tf_cproducto2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_cproducto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cproducto2KeyTyped(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel56.setText("Código de Producto");

        jLabel57.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel57.setText("Valor Unitario");

        jLabel58.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel58.setText("Ingreso de Información");

        tf_descripcion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel59.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel59.setText("Descripción");

        ingresar4B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/updt-01.png"))); // NOI18N
        ingresar4B5.setBorderPainted(false);
        ingresar4B5.setContentAreaFilled(false);
        ingresar4B5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/updt2-01.png"))); // NOI18N
        ingresar4B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar4B5ActionPerformed(evt);
            }
        });

        tf_descripcion1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel60.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel60.setText("Descripción");

        tf_cantidadproducto1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_cantidadproducto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cantidadproducto1KeyTyped(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel61.setText("Unidades Disponibles");

        tf_vproducto1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_vproducto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_vproducto1KeyTyped(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel62.setText("Valor Unitario");

        tf_cproducto3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_cproducto3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cproducto3KeyTyped(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel63.setText("Código de Producto");

        jLabel64.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel64.setText("Cambio de Información");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ingresar4B5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_descripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60)
                    .addComponent(tf_cantidadproducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(tf_vproducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(tf_cproducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64)
                    .addComponent(ingresar4B4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(tf_cantidadproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(tf_vproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(tf_cproducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel58))
                .addGap(65, 65, 65))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_cproducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_vproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_cantidadproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresar4B4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_cproducto3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_vproducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_cantidadproducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_descripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresar4B5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout inLayout = new javax.swing.GroupLayout(in);
        in.setLayout(inLayout);
        inLayout.setHorizontalGroup(
            inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inLayout.createSequentialGroup()
                .addGroup(inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inLayout.setVerticalGroup(
            inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel34)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Inv.add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        Welcon.addTab("Inventario", Inv);

        Mv.setBackground(new java.awt.Color(255, 255, 255));
        Mv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mv.setAlignmentX(0.0F);
        mv.setAlignmentY(0.0F);

        jLabel39.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 36)); // NOI18N
        jLabel39.setText("Ranking Vendedores");

        vendedorMenos.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 18)); // NOI18N
        vendedorMenos.setText("NOMBRE Y APELLIDO");

        jLabel41.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 12)); // NOI18N
        jLabel41.setText("*En la tabla se observan los vendedores, organizados desde el mejor al peor.");

        vendedorMas.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 18)); // NOI18N
        vendedorMas.setText("NOMBRE Y APELLIDO");

        codigoVendedorMas.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 12)); // NOI18N
        codigoVendedorMas.setText("Código de Vendedor");

        cantidadVendedorMenos.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 12)); // NOI18N
        cantidadVendedorMenos.setText("Total Vendido");

        codigoVendedorMenos.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 12)); // NOI18N
        codigoVendedorMenos.setText("Código de Vendedor");

        cantidadVendedorMas.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 12)); // NOI18N
        cantidadVendedorMas.setText("Total Vendido");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bs-01.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bs2-01.png"))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ws-01.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ws2-01.png"))); // NOI18N

        vendedorTbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Vendedor", "Apellido (s)", "Nombre (s)", "Unidades Vendidas", "Total Vendido en pesos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vendedorTbl1.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(vendedorTbl1);
        if (vendedorTbl1.getColumnModel().getColumnCount() > 0) {
            vendedorTbl1.getColumnModel().getColumn(0).setResizable(false);
            vendedorTbl1.getColumnModel().getColumn(1).setResizable(false);
            vendedorTbl1.getColumnModel().getColumn(2).setResizable(false);
            vendedorTbl1.getColumnModel().getColumn(3).setResizable(false);
            vendedorTbl1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout mvLayout = new javax.swing.GroupLayout(mv);
        mv.setLayout(mvLayout);
        mvLayout.setHorizontalGroup(
            mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mvLayout.createSequentialGroup()
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vendedorMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigoVendedorMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantidadVendedorMas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vendedorMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigoVendedorMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantidadVendedorMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel39)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        mvLayout.setVerticalGroup(
            mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mvLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel39)
                .addGap(18, 18, 18)
                .addGroup(mvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mvLayout.createSequentialGroup()
                        .addComponent(vendedorMas)
                        .addGap(9, 9, 9)
                        .addComponent(codigoVendedorMas)
                        .addGap(6, 6, 6)
                        .addComponent(cantidadVendedorMas))
                    .addGroup(mvLayout.createSequentialGroup()
                        .addComponent(vendedorMenos)
                        .addGap(9, 9, 9)
                        .addComponent(codigoVendedorMenos)
                        .addGap(6, 6, 6)
                        .addComponent(cantidadVendedorMenos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addGap(49, 49, 49))
        );

        Mv.add(mv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        Welcon.addTab("Más vendio", Mv);

        Pmv.setBackground(new java.awt.Color(255, 255, 255));
        Pmv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mmv.setAlignmentX(0.0F);
        mmv.setAlignmentY(0.0F);

        productoMVTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripción", "Código de Producto", "Unidades Vendidas", "Ventas en Pesos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productoMVTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(productoMVTbl);
        if (productoMVTbl.getColumnModel().getColumnCount() > 0) {
            productoMVTbl.getColumnModel().getColumn(0).setResizable(false);
            productoMVTbl.getColumnModel().getColumn(1).setResizable(false);
            productoMVTbl.getColumnModel().getColumn(2).setResizable(false);
            productoMVTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel48.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 12)); // NOI18N
        jLabel48.setText("*En la tabla se observan los productos, organizados desde el más vendido, al menos vendido.");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pbs-01.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pbs-2-01.png"))); // NOI18N

        numerosUnidades.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 12)); // NOI18N
        numerosUnidades.setText("Número de Unidades vendidas");

        descripcionProducto.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 18)); // NOI18N
        descripcionProducto.setText("Descripción del producto");

        jLabel54.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 36)); // NOI18N
        jLabel54.setText("Ranking Productos");

        codigoProducto.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 12)); // NOI18N
        codigoProducto.setText("Código de Producto");

        javax.swing.GroupLayout mmvLayout = new javax.swing.GroupLayout(mmv);
        mmv.setLayout(mmvLayout);
        mmvLayout.setHorizontalGroup(
            mmvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mmvLayout.createSequentialGroup()
                .addGroup(mmvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mmvLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel54))
                    .addGroup(mmvLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(mmvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mmvLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mmvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(codigoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numerosUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(92, 92, 92))
        );
        mmvLayout.setVerticalGroup(
            mmvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mmvLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel54)
                .addGap(29, 29, 29)
                .addGroup(mmvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mmvLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(descripcionProducto)
                        .addGap(6, 6, 6)
                        .addComponent(codigoProducto)
                        .addGap(6, 6, 6)
                        .addComponent(numerosUnidades)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addGap(49, 49, 49))
        );

        Pmv.add(mmv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        Welcon.addTab("Más vendido", Pmv);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sul.setAlignmentX(0.0F);
        sul.setAlignmentY(0.0F);

        sueldoTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Vendedor", "Ganancias", "Comisiones", "Total", "Descuentos", "Monto a Pagar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sueldoTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(sueldoTbl);
        if (sueldoTbl.getColumnModel().getColumnCount() > 0) {
            sueldoTbl.getColumnModel().getColumn(0).setResizable(false);
            sueldoTbl.getColumnModel().getColumn(1).setResizable(false);
            sueldoTbl.getColumnModel().getColumn(2).setResizable(false);
            sueldoTbl.getColumnModel().getColumn(3).setResizable(false);
            sueldoTbl.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel19.setBackground(new java.awt.Color(243, 244, 237));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        ingresar4B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar1-01.png"))); // NOI18N
        ingresar4B3.setBorderPainted(false);
        ingresar4B3.setContentAreaFilled(false);
        ingresar4B3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busca2-01.png"))); // NOI18N
        ingresar4B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar4B3ActionPerformed(evt);
            }
        });

        tf_codigobuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tf_codigobuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_codigobuscarKeyTyped(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel49.setText("Búsqueda por Código");

        jLabel50.setFont(new java.awt.Font("Comfortaa Medium", 1, 12)); // NOI18N
        jLabel50.setText("Código de Vendedor");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ingresar4B3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_codigobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel49))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addGap(13, 13, 13)
                .addComponent(tf_codigobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ingresar4B3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel47.setFont(new java.awt.Font("Comfortaa SemiBold", 1, 36)); // NOI18N
        jLabel47.setText("Sueldo a Pagar");

        javax.swing.GroupLayout sulLayout = new javax.swing.GroupLayout(sul);
        sul.setLayout(sulLayout);
        sulLayout.setHorizontalGroup(
            sulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sulLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel47))
            .addGroup(sulLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        sulLayout.setVerticalGroup(
            sulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sulLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel47)
                .addGap(33, 33, 33)
                .addGroup(sulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sulLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel18.add(sul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 630));

        Welcon.addTab("Sueldoa", jPanel18);

        jPanel1.add(Welcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 900, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BvendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BvendedorMouseClicked
        Bvendedor.setSelected(true);
        //******************************CANCELACIONES***************************************
        Bventas.setSelected(false);
        Bclientes.setSelected(false);
        Bsuel.setSelected(false);
        Bmv.setSelected(false);
        Btv.setSelected(false);
        Binv.setSelected(false);
    }//GEN-LAST:event_BvendedorMouseClicked

    private void BventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BventasMouseClicked
        Bventas.setSelected(true);
        //******************************CANCELACIONES***************************************
        Bvendedor.setSelected(false);
        Bclientes.setSelected(false);
        Bsuel.setSelected(false);
        Bmv.setSelected(false);
        Btv.setSelected(false);
        Binv.setSelected(false);
    }//GEN-LAST:event_BventasMouseClicked

    private void BventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BventasActionPerformed
        Welcon.setSelectedIndex(1);
    }//GEN-LAST:event_BventasActionPerformed

    private void BclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BclientesMouseClicked
        Bclientes.setSelected(true);
        //******************************CANCELACIONES***************************************
        Bventas.setSelected(false);
        Bvendedor.setSelected(false);
        Bsuel.setSelected(false);
        Bmv.setSelected(false);
        Btv.setSelected(false);
        Binv.setSelected(false);
    }//GEN-LAST:event_BclientesMouseClicked

    private void BsuelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BsuelMouseClicked
        Bsuel.setSelected(true);
        //******************************CANCELACIONES***************************************
        Bclientes.setSelected(false);
        Bventas.setSelected(false);
        Bvendedor.setSelected(false);
        Bmv.setSelected(false);
        Btv.setSelected(false);
        Binv.setSelected(false);
    }//GEN-LAST:event_BsuelMouseClicked

    private void BsuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsuelActionPerformed
        Welcon.setSelectedIndex(7);
    }//GEN-LAST:event_BsuelActionPerformed

    private void BmvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BmvMouseClicked
        Bmv.setSelected(true);
        //******************************CANCELACIONES***************************************
        Bclientes.setSelected(false);
        Bventas.setSelected(false);
        Bvendedor.setSelected(false);
        Bsuel.setSelected(false);
        Btv.setSelected(false);
        Binv.setSelected(false);
    }//GEN-LAST:event_BmvMouseClicked

    private void BmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmvActionPerformed
        Welcon.setSelectedIndex(5);
    }//GEN-LAST:event_BmvActionPerformed

    private void BtvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtvMouseClicked
        Btv.setSelected(true);
        //******************************CANCELACIONES***************************************
        Bclientes.setSelected(false);
        Bventas.setSelected(false);
        Bvendedor.setSelected(false);
        Bsuel.setSelected(false);
        Bmv.setSelected(false);
        Binv.setSelected(false);
    }//GEN-LAST:event_BtvMouseClicked

    private void BtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtvActionPerformed
        Welcon.setSelectedIndex(6);
        obtenerDatosInventario();
        ordenarMatrizInventario();
        mostrarMatrizProductoMV(matriz_mp, topeF2);
    }//GEN-LAST:event_BtvActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvendedorActionPerformed
        Welcon.setSelectedIndex(2);
    }//GEN-LAST:event_BvendedorActionPerformed

    private void BclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BclientesActionPerformed
        Welcon.setSelectedIndex(3);
    }//GEN-LAST:event_BclientesActionPerformed

    private void ingresar2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar2BActionPerformed
        int rectificar = 0, i = 0, j, c = 6, rectificar2 = 0, aux_mejor_vendedor = 0, aux = 0;
        boolean code = true, sueldob = true;
        String texto = "";
        if ("Seleccione...".equals(tarjetasBox.getSelectedItem().toString())) {
            c = 7;
            texto = texto + "Metodo de pago, ";
        }
        if ("".equals(tf_comprador.getText())) {
            c = 1;
            texto = texto + "Codigo de comprador, ";
        }
        if ("".equals(tf_cproducto1.getText())) {
            c = 1;
            texto = texto + "Codigo del producto, ";
        } else if ((Integer.parseInt(tf_cproducto1.getText()) > 9999999)) {
            c = 4;
        }
        if ("".equals(tf_preciou.getText())) {
            tf_preciou.setText("0");
            texto = texto + "Precio por unidad, ";
        }
        if ("".equals(tf_cvendedor2.getText())) {
            c = 1;
            texto = texto + "Codigo de vendedor, ";
        } else if (Integer.parseInt(tf_cvendedor2.getText()) > 9999999) {
            c = 2;
        }
        if ("".equals(tf_cvendida2.getText())) {
            c = 1;
            texto = texto + "Cantidad vendida, ";
        } else if (Integer.parseInt(tf_cvendida2.getText()) <= 0 || Integer.parseInt(tf_cvendida2.getText()) > 4) {
            c = 3;
        }
        switch (c) {
            case 6:
                matriz_venta[topeF][0] = Integer.parseInt(tf_cvendedor2.getText());
                while (i <= topeF1 && rectificar2 == 0) {
                    if (matriz_venta[topeF][0] != matriz_vendedor[i][0]) {
                        rectificar = 1;
                        rectificar2 = 0;
                        errorMenssage.setBackground(new Color(219, 96, 75));
                        jToggleButton1.setText("Lo sentimos, el Código de Vendedor ingresado no existe.");
                        timerDown.start();
                    } else if (matriz_venta[topeF][0] == matriz_vendedor[i][0]) {
                        rectificar = 0;
                        rectificar2 = 1;
                    }
                    i++;
                }
                if (rectificar == 0) {
                    matriz_venta[topeF][1] = Integer.parseInt(tf_comprador.getText());
                    matriz_venta[topeF][2] = Integer.parseInt(tf_cproducto1.getText());
                    matriz_venta[topeF][3] = Integer.parseInt(tf_preciou.getText());
                    matriz_venta[topeF][4] = Integer.parseInt(tf_cvendida2.getText());
                    pago[topeF][0] = tarjetasBox.getSelectedItem().toString();
                    errorMenssage.setBackground(new Color(75, 219, 137));
                    jToggleButton1.setText("Se han ingresado los datos con éxito.");
                    timerDown.start();
                    topeaux++;
                    i = 0;
                    while (code == true) {
                        if (matriz_venta[topeF][2] == matriz_producto[i][0]) {
                            if (matriz_venta[topeF][3] == matriz_producto[i][1]) {
                                if (matriz_venta[topeF][4] > matriz_producto[i][2]) {
                                    errorMenssage.setBackground(new Color(219, 96, 75));
                                    jToggleButton1.setText("Lo sentimos, no poseemos la cantidad de producto solicitado.");
                                    timerDown.start();
                                    rectificar = 1;
                                } else {
                                    aux = i;
                                }
                                code = false;
                            } else if (matriz_venta[topeF][3] == 0) {
                                if (matriz_venta[topeF][4] > matriz_producto[i][2]) {
                                    errorMenssage.setBackground(new Color(219, 96, 75));
                                    jToggleButton1.setText("Lo sentimos, no poseemos la cantidad de producto solicitado.");
                                    timerDown.start();
                                    rectificar = 1;
                                }
                                aux = i;
                                matriz_venta[topeF][3] = matriz_producto[i][1];
                                code = false;
                            } else if (matriz_venta[topeF][3] != matriz_producto[i][1]) {
                                errorMenssage.setBackground(new Color(219, 96, 75));
                                jToggleButton1.setText("Lo sentimos, el precio ingresado no coincide con el producto.");
                                timerDown.start();
                                rectificar = 1;
                                topeaux--;
                                code = false;
                            }
                        } else if (i == topeF2) {
                            if (matriz_venta[topeF][3] == 0) {
                                errorMenssage.setBackground(new Color(219, 96, 75));
                                jToggleButton1.setText("Lo sentimos, el producto ingresado no tiene un precio asignado.");
                                timerDown.start();
                                topeaux--;
                                rectificar = 1;
                                code = false;
                            } else {
                                aux = i;
                                add2 = 1;
                                tf_cproducto2.setText("" + matriz_venta[topeF][2]);
                                tf_vproducto.setText("" + matriz_venta[topeF][3]);
                                code = false;
                            }
                        }
                        i++;
                    }
                }
                if (rectificar == 1) {
                    matriz_venta[topeF][0] = 0;
                    matriz_venta[topeF][1] = 0;
                    matriz_venta[topeF][2] = 0;
                    matriz_venta[topeF][3] = 0;
                    matriz_venta[topeF][4] = 0;
                    matriz_venta[topeF][5] = 0;
                    pago[topeF][0] = "";
                    topeF--;
                } else {
                    add = rectificarCodigoCliente();
                    int puntos = 0;
                    if ("Puntos".equals(tarjetasBox.getSelectedItem().toString())) {
                        puntos = 1;
                    }
                    matriz_cliente[topeF5][0] = "" + matriz_venta[topeF][1];
                    if (add == 1 && puntos == 0) {
                        Welcon.setSelectedIndex(3);
                        Bvendedor.setEnabled(false);
                        Bsuel.setEnabled(false);
                        Bventas.setEnabled(false);
                        Bclientes.setEnabled(false);
                        Binv.setEnabled(false);
                        Bmv.setEnabled(false);
                        Btv.setEnabled(false);
                        tf_cedula.setText("" + matriz_venta[topeF][1]);
                        bloquearTextCedula();
                    } else if (add2 == 1 && puntos == 0) {
                        Welcon.setSelectedIndex(4);
                        tf_cproducto2.setEnabled(false);
                        Bvendedor.setEnabled(false);
                        Bsuel.setEnabled(false);
                        Bventas.setEnabled(false);
                        Bclientes.setEnabled(false);
                        Binv.setEnabled(false);
                        Bmv.setEnabled(false);
                        Btv.setEnabled(false);
                        tf_vproducto.setEnabled(false);
                        tf_cproducto3.setEnabled(false);
                        tf_vproducto1.setEnabled(false);
                        tf_cantidadproducto1.setEnabled(false);
                        tf_descripcion1.setEnabled(false);
                        ingresar4B5.setEnabled(false);
                        mostrarMatrizInventario(matriz_producto, topeF2, descripcion);
                    } else if (add == 1 && puntos == 1) {
                        errorMenssage.setBackground(new Color(219, 96, 75));
                        jToggleButton1.setText("El usuario no es encuentra registrado, por lo tanto no posee puntos.");
                        timerDown.start();
                        matriz_venta[topeF][0] = 0;
                        matriz_venta[topeF][1] = 0;
                        matriz_venta[topeF][2] = 0;
                        matriz_venta[topeF][3] = 0;
                        matriz_venta[topeF][4] = 0;
                        matriz_venta[topeF][5] = 0;
                        pago[topeF][0] = "";
                        topeF--;
                    } else if (add == 0 && puntos == 1) {
                        code = true;
                        i = 0;
                        while (code) {
                            if (Integer.parseInt(matriz_cliente[i][0]) == matriz_venta[topeF][1]) {
                                if (Integer.parseInt(matriz_cliente[i][4]) >= (matriz_venta[topeF][3] * matriz_venta[topeF][4])) {
                                    matriz_cliente[i][4] = "" + (Integer.parseInt(matriz_cliente[i][4]) - ((matriz_venta[topeF][3] * matriz_venta[topeF][4])));
                                    puntos = 0;
                                    code = false;
                                } else {
                                    errorMenssage.setBackground(new Color(219, 96, 75));
                                    jToggleButton1.setText("Lo sentimos, no posee puntos suficientes.");
                                    timerDown.start();
                                    matriz_venta[topeF][0] = 0;
                                    matriz_venta[topeF][1] = 0;
                                    matriz_venta[topeF][2] = 0;
                                    matriz_venta[topeF][3] = 0;
                                    matriz_venta[topeF][4] = 0;
                                    matriz_venta[topeF][5] = 0;
                                    pago[topeF][0] = "";
                                    topeF--;
                                    puntos = 1;
                                    code = false;
                                }
                            }
                            i++;
                        }
                    }
                    if (puntos == 0) {
                        if (compraMasAltaClienteP != topeF) {
                            if (matriz_venta[compraMasAltaClienteP][3] * matriz_venta[compraMasAltaClienteP][4] < matriz_venta[topeF][3] * matriz_venta[topeF][4]) {
                                compraMasAltaClienteP = topeF;
                                compraMasAltaClienteT = matriz_venta[topeF][3] * matriz_venta[topeF][4];
                            }
                        } else {
                            compraMasAltaClienteP = topeF;
                        }
                        matriz_producto[aux][3] = matriz_producto[aux][3] + matriz_venta[topeF][4];
                        if (add2 == 0) {
                            actualizarInventario();
                        }
                        if ((matriz_venta[topeF][3] * matriz_venta[topeF][4]) > compraMasAlta) {
                            compraMasAlta = matriz_venta[topeF][3] * matriz_venta[topeF][4];
                        }
                        if ("Puntos".equals(tarjetasBox.getSelectedItem().toString())) {
                        } else {
                            if (matriz_venta[topeF][4] * matriz_venta[topeF][3] >= 1000) {
                                if ((matriz_venta[topeF][4] * matriz_venta[topeF][3]) % 1000 > 0) {
                                    matriz_venta[topeF][5] = ((matriz_venta[topeF][4] * matriz_venta[topeF][3]) / 1000) + 1;
                                } else {
                                    matriz_venta[topeF][5] = (matriz_venta[topeF][4] * matriz_venta[topeF][3]) / 1000;
                                }
                                code = true;
                                i = 0;
                                while (code) {
                                    if (Integer.parseInt(matriz_cliente[i][0]) == matriz_venta[topeF][1]) {
                                        if (matriz_cliente[i][4] == null) {
                                            matriz_cliente[i][4] = "0";
                                        }
                                        matriz_cliente[i][4] = "" + (Integer.parseInt(matriz_cliente[i][4]) + matriz_venta[topeF][5]);
                                        code = false;
                                    }
                                    i++;
                                }
                            }
                        }
                        for (i = 0; i <= topeF1; i++) {
                            for (j = 0; j <= topeF; j++) {
                                if (matriz_vendedor[i][0] == matriz_venta[topeaux + j][0]) {
                                    matriz_vendedor[i][1] = matriz_vendedor[i][1] + matriz_venta[topeaux + j][4];
                                    matriz_vendedor[i][2] = matriz_vendedor[i][2] + (matriz_venta[topeaux + j][3] * matriz_venta[topeaux + j][4]);
                                }
                                if (aux_mejor_vendedor < matriz_vendedor[i][2]) {
                                    aux_mejor_vendedor = matriz_vendedor[i][2];
                                    mejor_vendedor = matriz_vendedor[i][0];
                                }

                            }
                        }

                        i = 0;
                        while (sueldob) {
                            if (matriz_vendedor[i][0] == matriz_venta[topeF][0]) {
                                aux_sueldo[i][1] = (float) (aux_sueldo[i][1] + matriz_venta[topeF][4] * matriz_venta[topeF][3] * 0.30);
                                sueldob = false;
                            }
                            i++;
                        }
                    }
                    obtenerDatosVendedor();
                    ordenarMatrizVendedor();
                    mostrarMatrizVendedorMas(matriz_vendedor_mas, topeF1, nombreVendedorMas);
                    obtenerDatosInventario();
                    ordenarMatrizInventario();
                    mostrarMatrizProductoMV(matriz_mp, topeF2);
                }
                break;
            case 1:
                texto = texto.substring(0, texto.length() - 2);
                errorMenssage.setBackground(new Color(219, 96, 75));
                jToggleButton1.setText("Algunos de estos elementos no se ingresaron correctamente: " + texto);
                timerDown.start();
                topeF--;
                break;
            case 2:
                errorMenssage.setBackground(new Color(219, 96, 75));
                jToggleButton1.setText("Lo sentimos el Código de Vendedor ingresado es inválido. Recuerde que debe tener máximo 8 dígitos");
                timerDown.start();
                topeF--;
                break;
            case 3:
                errorMenssage.setBackground(new Color(219, 96, 75));
                if (Integer.parseInt(tf_cvendida2.getText()) > 4) {
                    jToggleButton1.setText("Lo sentimos, no es posible comprar más de 4 productos iguales.");
                } else {
                    jToggleButton1.setText("Recuerde ingresar valores válidos (desde 1 a 4 unidades).");
                }
                timerDown.start();
                topeF--;
                break;
            case 4:
                errorMenssage.setBackground(new Color(219, 96, 75));
                jToggleButton1.setText("Lo sentimos el Código de Producto ingresado es inválido. Recuerde que debe tener máximo 8 dígitos.");
                timerDown.start();
                topeF--;
                break;
            case 5:
                errorMenssage.setBackground(new Color(219, 96, 75));
                jToggleButton1.setText("Lo sentimos el Código de Comprador ingresado es inválido. Recuerde que debe tener máximo 8 dígitos.");
                timerDown.start();
                topeF--;
                break;
            case 7:
                errorMenssage.setBackground(new Color(219, 96, 75));
                jToggleButton1.setText("Por favor, recuerde seleccionar un medio de pago.");
                timerDown.start();
                topeF--;
                break;
            default:
                break;
        }
        tf_cvendedor2.setText("");
        tf_comprador.setText("");
        tf_cproducto1.setText("");
        tf_preciou.setText("");
        tf_cvendida2.setText("");
        for (i = 0; i <= topeF; i++) {
            //Mostrar datos de tablas ventas
        }
        for (i = 0; i <= topeF1 - 1; i++) {
            int porcentaje_sueldo = 0;
            if (matriz_vendedor[i][0] == mejor_vendedor) {
                porcentaje_sueldo = 20;
            }
            if (matriz_vendedor[i][1] >= 30 && matriz_vendedor[i][1] < 50) {
                porcentaje_sueldo = (porcentaje_sueldo + 5);
            } else if (matriz_vendedor[i][1] >= 50 && matriz_vendedor[i][1] < 100) {
                porcentaje_sueldo = (porcentaje_sueldo + 10);
            } else if (matriz_vendedor[i][1] >= 100) {
                porcentaje_sueldo = (porcentaje_sueldo + 15);
            }
            matriz_sueldo[i][1] = aux_sueldo[i][1];
            matriz_sueldo[i][2] = matriz_vendedor[i][2] * porcentaje_sueldo / 100;
            matriz_sueldo[i][3] = matriz_sueldo[i][1] + matriz_sueldo[i][2];
            matriz_sueldo[i][4] = matriz_sueldo[i][3] * 4 / 100;
            matriz_sueldo[i][5] = matriz_sueldo[i][3] * 4 / 100;
            matriz_sueldo[i][6] = matriz_sueldo[i][3] - (matriz_sueldo[i][5] + matriz_sueldo[i][4]);
        }
        topeF++;
        mostrarMatrizVentas(matriz_venta, topeF, pago);
        mostrarMatrizInventario(matriz_producto, topeF2, descripcion);
        mostrarMatrizCliente(matriz_cliente, topeF5);
        mostrarMatrizVendedor(matriz_vendedor, topeF1, nombreVendedor);
        mostrarMatrizSueldo(matriz_sueldo, topeF1);
    }//GEN-LAST:event_ingresar2BActionPerformed

    private void ingresar1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar1BActionPerformed
        int buscar_b = 0, aux1 = 0, i, c = 0;
        if ("".equals(tf_nombrevendedor.getText())) {
            c = 0; //Por el momento
        }
        if ("".equals(tf_apellidovendedor.getText())) {
            c = 0; //Por el momento
        }
        if ("".equals(tf_cvendedor1.getText())) {
            c = 1;
            errorMenssage1.setBackground(new Color(219, 96, 75));
            jToggleButton2.setText("Por favor, recuerde ingresar el Código de Vendedor a registrar.");
            timerDown1.start();
            topeF1--;
        } else {
            matriz_vendedor[topeF1][0] = Integer.parseInt(tf_cvendedor1.getText());
            matriz_vendedor[topeF1][1] = 0;
            matriz_vendedor[topeF1][2] = 0;
            matriz_vendedor_mas[topeF1][0] = 0;
            matriz_vendedor_mas[topeF1][1] = 0;
            matriz_vendedor_mas[topeF1][2] = 0;
        }
        if (c == 0) {
            String auxNombre[] = tf_nombrevendedor.getText().toLowerCase().split(" "), auxApellido[] = tf_apellidovendedor.getText().toLowerCase().split(" ");
            nombreVendedor[topeF1][0] = "";
            if ("".equals(tf_nombrevendedor.getText())) {
            } else {
                nombreVendedorSubRutina(auxNombre);
                nombreVendedorMas[topeF1][0] = nombreVendedor[topeF1][0];
            }
            nombreVendedor[topeF1][1] = "";
            if ("".equals(tf_apellidovendedor.getText())) {
            } else {
                apellidoVendedorSubRutina(auxApellido);
                nombreVendedorMas[topeF1][1] = nombreVendedor[topeF1][1];
            }
            if (matriz_vendedor[topeF1][0] > 9999999) {
                errorMenssage1.setBackground(new Color(219, 96, 75));
                jToggleButton2.setText("Lo sentimos el Código de Vendedor ingresado es inválido. Recuerde que debe tener máximo 8 dígitos.");
                timerDown1.start();
                matriz_vendedor[topeF1][0] = 0;
                topeF1--;
            } else if (topeF1 >= 0) {
                i = 0;
                do {
                    if (matriz_vendedor[topeF1][0] == matriz_vendedor[i][0]) {
                        buscar_b = 1;
                        aux1 = i;
                    } else if (i == topeF1 - 1) {
                        buscar_b = 1;
                    }
                    i++;
                } while (buscar_b == 0);
                if (matriz_vendedor[topeF1][0] == matriz_vendedor[aux1][0] && aux1 != topeF1) {
                    errorMenssage1.setBackground(new Color(219, 96, 75));
                    jToggleButton2.setText("El Código de Vendedor ya ha sido ingresado anteriormente. Por favor, ingrese uno nuevo.");
                    timerDown1.start();
                    matriz_vendedor[topeF1][0] = 0;
                    topeF1--;
                } else {
                    matriz_sueldo[topeF1][0] = matriz_vendedor[topeF1][0];
                    matriz_vendedor_mas[topeF1][0] = matriz_vendedor[topeF1][0];
                    errorMenssage1.setBackground(new Color(75, 219, 137));
                    jToggleButton2.setText("Se ingreso corectamente el Código de Vendedor: " + matriz_vendedor[topeF1][0]);
                    timerDown1.start();
                }
            }
        }
        tf_cvendedor1.setText("");
        tf_nombrevendedor.setText("");
        tf_apellidovendedor.setText("");
        topeF1++;
        mostrarMatrizSueldo(matriz_sueldo, topeF1);
        mostrarMatrizVendedor(matriz_vendedor, topeF1, nombreVendedor);
        mostrarMatrizVendedorMas(matriz_vendedor_mas, topeF1, nombreVendedorMas);
    }//GEN-LAST:event_ingresar1BActionPerformed

    private void ingresar4BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar4BActionPerformed
        int c = 0, i = 0, rectificar = 0;
        boolean code = true;
        if ("".equals(tf_cedula.getText())) {
            c = 1;
        }
        if ("".equals(tf_nombresclientes.getText())) {
            c = 1;
        }
        if ("".equals(tf_apellidosclientes.getText())) {
            c = 1;
        }
        if ("".equals(tf_correo.getText())) {
            c = 1;
        }
        switch (c) {
            case 0:
                matriz_cliente[topeF5][0] = tf_cedula.getText();
                while (code) {
                    if (i != topeF5) {
                        if (Integer.parseInt(matriz_cliente[topeF5][0]) == Integer.parseInt((matriz_cliente[i][0]))) {
                            code = false;
                            rectificar = 1;
                        }
                    } else if (i == topeF5) {
                        code = false;
                        rectificar = 0;
                    }
                    i++;
                }
                if (buscarArrobaCorreo() == 1) {
                    rectificar = 2;
                }
                switch (rectificar) {
                    case 0:
                        errorMenssage3.setBackground(new Color(75, 219, 137));
                        jToggleButton3.setText("Se han ingresado los datos con éxito.");
                        timerDown3.start();
                        matriz_cliente[topeF5][1] = "";
                        matriz_cliente[topeF5][2] = "";
                        matriz_cliente[topeF5][3] = tf_correo.getText().toLowerCase();
                        matriz_cliente[topeF5][4] = "0";
                        nombreClienteSubRutina();
                        apellidoClienteSubRutina();
                        if (add == 1) {
                            Welcon.setSelectedIndex(1);
                            Bvendedor.setEnabled(true);
                            Bventas.setEnabled(true);
                            Bclientes.setEnabled(true);
                            Binv.setEnabled(true);
                            Bmv.setEnabled(true);
                            Btv.setEnabled(true);
                            tf_cedula.setEnabled(true);
                            Bsuel.setEnabled(true);
                            add = 0;
                            matriz_cliente[topeF5][4] = "" + (Integer.parseInt(matriz_cliente[topeF5][4]) + matriz_venta[topeF - 1][5]);
                        }
                        if (add2 == 1) {
                            Welcon.setSelectedIndex(4);
                            tf_cproducto2.setEnabled(false);
                            Bvendedor.setEnabled(false);
                            Bsuel.setEnabled(false);
                            Bventas.setEnabled(false);
                            Bclientes.setEnabled(false);
                            Binv.setEnabled(false);
                            Bmv.setEnabled(false);
                            Btv.setEnabled(false);
                            tf_vproducto.setEnabled(false);
                            tf_cproducto3.setEnabled(false);
                            tf_vproducto1.setEnabled(false);
                            tf_cantidadproducto1.setEnabled(false);
                            tf_descripcion1.setEnabled(false);
                            ingresar4B5.setEnabled(false);
                            mostrarMatrizInventario(matriz_producto, topeF2, descripcion);
                        }
                        break;
                    case 2:
                        errorMenssage3.setBackground(new Color(219, 96, 75));
                        jToggleButton3.setText("Lo sentimos, el Correo ingresado es inválido.");
                        timerDown3.start();
                        matriz_cliente[topeF5][0] = "";
                        matriz_cliente[topeF5][1] = "";
                        matriz_cliente[topeF5][2] = "";
                        matriz_cliente[topeF5][3] = "";
                        matriz_cliente[topeF5][4] = "";
                        topeF5--;
                        break;
                    default:
                        errorMenssage3.setBackground(new Color(219, 96, 75));
                        jToggleButton3.setText("La Cédula ya ha sido ingresado anteriormente. Por favor, ingrese una nueva.");
                        timerDown3.start();
                        matriz_cliente[topeF5][0] = "";
                        matriz_cliente[topeF5][1] = "";
                        matriz_cliente[topeF5][2] = "";
                        matriz_cliente[topeF5][3] = "";
                        matriz_cliente[topeF5][4] = "";
                        topeF5--;
                        break;
                }
                break;

            case 1:
                errorMenssage3.setBackground(new Color(219, 96, 75));
                jToggleButton3.setText("Por favor, rectifique los datos ingresados e intente nuevamente.");
                timerDown3.start();
                matriz_cliente[topeF5][0] = "";
                matriz_cliente[topeF5][1] = "";
                matriz_cliente[topeF5][2] = "";
                matriz_cliente[topeF5][3] = "";
                matriz_cliente[topeF5][4] = "";
                topeF5--;
                break;
        }
        if (add == 0) {
            tf_cedula.setText("");
            tf_correo.setText("");
            tf_nombresclientes.setText("");
            tf_apellidosclientes.setText("");
        } else {
            tf_correo.setText("");
            tf_nombresclientes.setText("");
            tf_apellidosclientes.setText("");
        }
        topeF5++;
        mostrarMatrizCliente(matriz_cliente, topeF5);
    }//GEN-LAST:event_ingresar4BActionPerformed

    private void BinvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BinvMouseClicked
        Binv.setSelected(true);
        //******************************CANCELACIONES***************************************
        Bclientes.setSelected(false);
        Bventas.setSelected(false);
        Bvendedor.setSelected(false);
        Bsuel.setSelected(false);
        Bmv.setSelected(false);
        Btv.setSelected(false);
    }//GEN-LAST:event_BinvMouseClicked

    private void BinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinvActionPerformed
        Welcon.setSelectedIndex(4);
    }//GEN-LAST:event_BinvActionPerformed

    private void ingresar4B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar4B3ActionPerformed
        float sueldo = 0;
        int i = 0, buscar = 0, vendedor, c = 0;
        if ("".equals(tf_codigobuscar.getText())) {
            c = 1;
        } else if (tf_codigobuscar.getText().length() > 8) {
            JOptionPane.showMessageDialog(null, "Lo sentimos el Código de Vendedor ingresado es inválido. Recuerde que debe tener máximo 8 dígitos.", "Por favor, rectifique...", 0);
            c = 2;
        }
        if (c == 0) {
            vendedor = Integer.parseInt(tf_codigobuscar.getText());
            while (topeF1 != 0 && i < topeF1 && buscar == 0) {
                if (matriz_vendedor[i][0] == vendedor) {
                    buscar = 1;
                    sueldo = matriz_sueldo[i][6];
                }
                i++;
            }
            if (buscar == 1) {
                JOptionPane.showMessageDialog(null, "El sueldo del vendedor " + vendedor + " es de " + sueldo + " pesos.", null, -1);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos el Código de Vendedor ingresado no existe.", "Por favor, rectifique...", 0);
            }
        }
        tf_codigobuscar.setText("");
    }//GEN-LAST:event_ingresar4B3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        timerUp.start();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        timerUp1.start();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        timerUp3.start();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        timerUp2.start();
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void tf_cvendedor2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cvendedor2KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_cvendedor2KeyTyped

    private void tf_compradorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_compradorKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_compradorKeyTyped

    private void tf_cproducto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cproducto1KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_cproducto1KeyTyped

    private void tf_preciouKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_preciouKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_preciouKeyTyped

    private void tf_cvendida2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cvendida2KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_cvendida2KeyTyped

    private void tf_nombrevendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombrevendedorKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_nombrevendedorKeyTyped

    private void tf_apellidovendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_apellidovendedorKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_apellidovendedorKeyTyped

    private void tf_cvendedor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cvendedor1KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_cvendedor1KeyTyped

    private void tf_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cedulaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_cedulaKeyTyped

    private void tf_nombresclientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombresclientesKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_nombresclientesKeyTyped

    private void tf_apellidosclientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_apellidosclientesKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_apellidosclientesKeyTyped

    private void tf_codigobuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codigobuscarKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_codigobuscarKeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ingresar4B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar4B4ActionPerformed
        int c = 0, rectificar = 0, i = 0, rectificar2 = 0;
        if ("".equals(tf_descripcion.getText())) {
            c = 4;
        }
        if ("".equals(tf_cproducto2.getText())) {
            c = 1;
        } else if (Integer.parseInt(tf_cproducto2.getText()) > 9999999) {
            c = 2;
        }
        if ("".equals(tf_vproducto.getText())) {
            c = 1;
        }
        if ("".equals(tf_cantidadproducto.getText())) {
            c = 1;
        } else if (Integer.parseInt(tf_cantidadproducto.getText()) < 0) {
            c = 3;
        }
        switch (c) {
            case 0:
                matriz_producto[topeF2][0] = Integer.parseInt(tf_cproducto2.getText());
                while (i != topeF2 && rectificar2 == 0) {
                    if (matriz_producto[topeF2][0] != matriz_producto[i][0]) {
                        rectificar = 1;
                        rectificar2 = 0;
                    } else if (matriz_producto[topeF2][0] == matriz_producto[i][0]) {
                        rectificar = 0;
                        rectificar2 = 1;
                    } else if (i == topeF2) {
                        rectificar = 1;
                        rectificar2 = 1;
                    }
                    i++;
                }
                if (topeF2 == 0) {
                    rectificar = 1;
                }
                if (rectificar == 1) {
                    matriz_producto[topeF2][1] = Integer.parseInt(tf_vproducto.getText());
                    matriz_producto[topeF2][2] = Integer.parseInt(tf_cantidadproducto.getText());
                    descripcion[topeF2][0] = tf_descripcion.getText().toUpperCase();
                    errorMenssage2.setBackground(new Color(75, 219, 137));
                    jToggleButton4.setText("Se ha registrado correctamente la información.");
                    timerDown2.start();
                    if (add2 == 1) {
                        if (matriz_producto[topeF2][2] >= matriz_venta[topeF - 1][4]) {
                            Welcon.setSelectedIndex(1);
                            matriz_producto[topeF2][2] = matriz_producto[topeF2][2] - matriz_venta[topeF - 1][4];
                            Bvendedor.setEnabled(true);
                            Bventas.setEnabled(true);
                            Bclientes.setEnabled(true);
                            Binv.setEnabled(true);
                            Bmv.setEnabled(true);
                            Btv.setEnabled(true);
                            tf_cproducto2.setEnabled(true);
                            tf_cedula.setEnabled(true);
                            Bsuel.setEnabled(true);
                            tf_vproducto.setEnabled(true);
                            tf_cproducto3.setEnabled(true);
                            tf_vproducto1.setEnabled(true);
                            tf_cantidadproducto1.setEnabled(true);
                            tf_descripcion1.setEnabled(true);
                            ingresar4B5.setEnabled(true);
                            add2 = 0;
                            actualizarInventario();
                            ordenarMatrizInventario();
                        } else {
                            errorMenssage2.setBackground(new Color(219, 96, 75));
                            jToggleButton4.setText("Lo sentimos, la cantidad ingresada no es válida.");
                            timerDown2.start();
                            matriz_producto[topeF2][0] = 0;
                            matriz_producto[topeF2][1] = 0;
                            matriz_producto[topeF2][2] = 0;
                            descripcion[topeF2][0] = "";
                            topeF2--;
                        }
                    }
                } else if (rectificar == 0) {
                    errorMenssage2.setBackground(new Color(219, 96, 75));
                    jToggleButton4.setText("La Código de Producto ya ha sido ingresado anteriormente. Por favor, ingrese uno nuevo.");
                    timerDown2.start();
                    matriz_producto[topeF2][0] = 0;
                    matriz_producto[topeF2][1] = 0;
                    matriz_producto[topeF2][2] = 0;
                    descripcion[topeF2][0] = "";
                    topeF2--;
                }
                break;
            case 1:
                errorMenssage2.setBackground(new Color(219, 96, 75));
                jToggleButton4.setText("Por favor, ingrese la información solicitada en cada campo.");
                timerDown2.start();
                topeF2--;
                break;
            case 2:
                errorMenssage2.setBackground(new Color(219, 96, 75));
                jToggleButton4.setText("Recuerde, el Código de Producto puede poseer un máximo de 8 digitos.");
                timerDown2.start();
                topeF2--;
                break;
            case 3:
                errorMenssage2.setBackground(new Color(219, 96, 75));
                jToggleButton4.setText("Lo sentimos, la cantidad ingresada no es válida.");
                timerDown2.start();
                topeF2--;
                break;
            case 4:
                errorMenssage2.setBackground(new Color(219, 96, 75));
                jToggleButton4.setText("Por favor, ingrese la descripción del producto.");
                timerDown2.start();
                topeF2--;
                break;
            default:
                break;
        }
        if (add2 == 0) {
            tf_cproducto2.setText("");
            tf_vproducto.setText("");
            tf_cantidadproducto.setText("");
            tf_descripcion.setText("");
        } else {
            tf_cantidadproducto.setText("");
            tf_descripcion.setText("");
        }
        topeF2++;
        if (topeF2 > 0) {
            obtenerDatosInventario();
        }
        mostrarMatrizProductoMV(matriz_mp, topeF2);
        mostrarMatrizInventario(matriz_producto, topeF2, descripcion);
    }//GEN-LAST:event_ingresar4B4ActionPerformed

    private void ingresar4B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar4B5ActionPerformed
        boolean code = true;
        int i = 0, c = 0;
        if ("".equals(tf_cproducto3.getText())) {
            c = 1;
        } else if (Integer.parseInt(tf_cproducto3.getText()) > 99999999) {
            c = 2;
        }
        switch (c) {
            case 0:
                while (code) {
                    if (matriz_producto[i][0] == Integer.parseInt(tf_cproducto3.getText())) {
                        if ("".equals(tf_vproducto1.getText())) {
                        } else {
                            matriz_producto[i][1] = Integer.parseInt(tf_vproducto1.getText());
                        }
                        if ("".equals(tf_cantidadproducto1.getText())) {
                        } else {
                            matriz_producto[i][2] = Integer.parseInt(tf_cantidadproducto1.getText());
                        }
                        if ("".equals(tf_descripcion1.getText())) {
                        } else {
                            descripcion[i][0] = tf_descripcion1.getText().toUpperCase();
                        }
                        errorMenssage2.setBackground(new Color(75, 219, 137));
                        jToggleButton4.setText("La información se ha actualizado satisfactoriamente.");
                        timerDown2.start();
                        mostrarMatrizInventario(matriz_producto, topeF2, descripcion);
                        code = false;
                    } else if (i == topeF2) {
                        errorMenssage2.setBackground(new Color(219, 96, 75));
                        jToggleButton4.setText("Lo sentimos, el Código de Producto ingresado no existe.");
                        timerDown2.start();
                        code = false;
                    }
                    i++;
                }
                break;
            case 1:
                errorMenssage2.setBackground(new Color(219, 96, 75));
                jToggleButton4.setText("Por favor, ingrese el Código de Producto del elemento a actualizar.");
                timerDown2.start();
                break;
            case 2:
                errorMenssage2.setBackground(new Color(219, 96, 75));
                jToggleButton4.setText("Recuerde, el Código de Producto puede poseer un máximo de 8 digitos.");
                timerDown2.start();
                break;
        }
        tf_cproducto3.setText("");
        tf_vproducto1.setText("");
        tf_cantidadproducto1.setText("");
        tf_descripcion1.setText("");
    }//GEN-LAST:event_ingresar4B5ActionPerformed

    private void tf_cantidadproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cantidadproductoActionPerformed

    }//GEN-LAST:event_tf_cantidadproductoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int aux;
        aux = (matriz_venta[compraMasAltaClienteP][3] * matriz_venta[compraMasAltaClienteP][4]);
        if (topeF > 0) {
            JOptionPane.showMessageDialog(null, "La compra mas alta tiene un valor de " + aux + " que le corresponde al cliente con la cedula " + matriz_venta[compraMasAltaClienteP][1], "¡Wow, vaya venta!", -1);
        } else {
            JOptionPane.showMessageDialog(null, "Lo sentimos, no se ha registrado ninguna venta por el momento...", "¡Upss!", 0);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tf_cproducto2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cproducto2KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_cproducto2KeyTyped

    private void tf_vproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_vproductoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_vproductoKeyTyped

    private void tf_cantidadproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cantidadproductoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_cantidadproductoKeyTyped

    private void tf_cproducto3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cproducto3KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_cproducto3KeyTyped

    private void tf_vproducto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_vproducto1KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_vproducto1KeyTyped

    private void tf_cantidadproducto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cantidadproducto1KeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_cantidadproducto1KeyTyped

    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    public void mostrarMatrizVentas(int matriz[][], int topeF, String metodoDePago[][]) {
        DefaultTableModel model = (DefaultTableModel) ventasTbl.getModel();
        if (topeF > 0) {
            model.setRowCount(topeF);
            for (int i = 0; i < topeF; i++) {
                ventasTbl.setValueAt(matriz[i][0], i, 0);
                ventasTbl.setValueAt(matriz[i][1], i, 1);
                ventasTbl.setValueAt(matriz[i][2], i, 2);
                ventasTbl.setValueAt(matriz[i][3], i, 3);
                ventasTbl.setValueAt(matriz[i][4], i, 4);
                ventasTbl.setValueAt(matriz[i][5], i, 5);
                ventasTbl.setValueAt(metodoDePago[i][0], i, 6);
            }
        }
    }

    public void mostrarMatrizVendedor(int matriz[][], int topeF, String NombreDelVendedor[][]) {
        DefaultTableModel model = (DefaultTableModel) vendedorTbl.getModel();
        if (topeF > 0) {
            model.setRowCount(topeF);
            for (int i = 0; i < topeF; i++) {
                vendedorTbl.setValueAt(matriz[i][0], i, 0);
                vendedorTbl.setValueAt(matriz[i][1], i, 3);
                vendedorTbl.setValueAt(matriz[i][2], i, 4);
                vendedorTbl.setValueAt(NombreDelVendedor[i][0], i, 1);
                vendedorTbl.setValueAt(NombreDelVendedor[i][1], i, 2);
            }
        }
    }

    public void mostrarMatrizVendedorMas(int matriz[][], int topeF, String NombreDelVendedor[][]) {
        DefaultTableModel model = (DefaultTableModel) vendedorTbl1.getModel();
        if (topeF > 0) {
            model.setRowCount(topeF);
            for (int i = 0; i < topeF; i++) {
                vendedorTbl1.setValueAt(matriz[i][0], i, 0);
                vendedorTbl1.setValueAt(matriz[i][1], i, 3);
                vendedorTbl1.setValueAt(matriz[i][2], i, 4);
                vendedorTbl1.setValueAt(NombreDelVendedor[i][0], i, 1);
                vendedorTbl1.setValueAt(NombreDelVendedor[i][1], i, 2);
            }
            if (topeF == 1 && matriz[0][2] > 0) {
                vendedorMas.setText("" + NombreDelVendedor[0][0] + NombreDelVendedor[0][1]);
                codigoVendedorMas.setText("C. de vendedor: " + matriz[0][0]);
                cantidadVendedorMas.setText("Cantidad vendida: $" + matriz[0][2]);
            } else if (topeF > 1) {
                vendedorMas.setText("" + NombreDelVendedor[0][0] + NombreDelVendedor[0][1]);
                vendedorMenos.setText("" + NombreDelVendedor[topeF1 - 1][0] + NombreDelVendedor[topeF1 - 1][1]);
                codigoVendedorMas.setText("C. de vendedor: " + matriz[0][0]);
                codigoVendedorMenos.setText("C. de vendedor: " + matriz[topeF1 - 1][0]);
                cantidadVendedorMas.setText("Cantidad vendida: $" + matriz[0][2]);
                cantidadVendedorMenos.setText("Cantidad vendida: $" + matriz[topeF1 - 1][2]);
            }
        }
    }

    public void mostrarMatrizInventario(int matriz[][], int topeF, String matrizDescripcion[][]) {
        DefaultTableModel model = (DefaultTableModel) inventarioTbl.getModel();
        if (topeF > 0) {
            model.setRowCount(topeF);
            for (int i = 0; i < topeF; i++) {
                inventarioTbl.setValueAt(matrizDescripcion[i][0], i, 0);
                inventarioTbl.setValueAt(matriz[i][0], i, 1);
                inventarioTbl.setValueAt(matriz[i][1], i, 2);
                inventarioTbl.setValueAt(matriz[i][2], i, 3);
            }
        }
    }

    public void mostrarMatrizCliente(String matriz[][], int topeF) {
        DefaultTableModel model = (DefaultTableModel) clientesTbl.getModel();
        if (topeF > 0) {
            model.setRowCount(topeF);
            for (int i = 0; i < topeF; i++) {
                clientesTbl.setValueAt(matriz[i][0], i, 0);
                clientesTbl.setValueAt(matriz[i][1], i, 1);
                clientesTbl.setValueAt(matriz[i][2], i, 2);
                clientesTbl.setValueAt(matriz[i][3], i, 3);
                clientesTbl.setValueAt(matriz[i][4], i, 4);
            }
        }
    }

    public void mostrarMatrizSueldo(float matriz[][], int topeF) {
        DefaultTableModel model = (DefaultTableModel) sueldoTbl.getModel();
        if (topeF > 0) {
            model.setRowCount(topeF);
            for (int i = 0; i < topeF; i++) {
                sueldoTbl.setValueAt(matriz[i][0], i, 0);
                sueldoTbl.setValueAt(matriz[i][1], i, 1);
                sueldoTbl.setValueAt(matriz[i][2], i, 2);
                sueldoTbl.setValueAt(matriz[i][3], i, 3);
                sueldoTbl.setValueAt(matriz[i][4], i, 4);
                sueldoTbl.setValueAt(matriz[i][6], i, 5);
            }
        }
    }

    public void mostrarMatrizProductoMV(String matriz[][], int topeF) {
        DefaultTableModel model = (DefaultTableModel) productoMVTbl.getModel();
        if (topeF > 0) {
            model.setRowCount(topeF);
            for (int i = 0; i < topeF; i++) {
                productoMVTbl.setValueAt(matriz[i][0], i, 0);
                productoMVTbl.setValueAt(matriz[i][1], i, 1);
                productoMVTbl.setValueAt(matriz[i][2], i, 2);
                productoMVTbl.setValueAt(matriz[i][3], i, 3);
            }
            descripcionProducto.setText(matriz[0][0]);
            codigoProducto.setText("Código de Producto: " + matriz[0][1]);
            numerosUnidades.setText("Número de Unidades vendidas: " + matriz[0][2]);
        }
    }

    public void actualizarInventario() {
        boolean code = true;
        int i = 0;
        while (code == true) {
            if (matriz_venta[topeF][2] == matriz_producto[i][0]) {
                if (add2 == 0) {
                    matriz_producto[i][2] = matriz_producto[i][2] - matriz_venta[topeF][4];
                } else {
                    matriz_producto[i][2] = matriz_producto[i][2] - matriz_venta[topeF - 1][4];
                }
                code = false;
            }
            i++;
        }
    }

    public void nombreVendedorSubRutina(String Nombre[]) {
        int i;
        for (i = 0; i < Nombre.length; i++) {
            String aux = Nombre[i];
            int auxTam = aux.length();
            nombreVendedor[topeF1][0] = nombreVendedor[topeF1][0] + Nombre[i].substring(0, 1).toUpperCase() + Nombre[i].substring(1, auxTam);
            if (i == 0) {
                nombreVendedor[topeF1][0] += " ";
            }
        }
    }

    public void apellidoVendedorSubRutina(String auxApellido[]) {
        int i;
        for (i = 0; i < auxApellido.length; i++) {
            String aux = auxApellido[i];
            int auxTam = aux.length();
            nombreVendedor[topeF1][1] = nombreVendedor[topeF1][1] + auxApellido[i].substring(0, 1).toUpperCase() + auxApellido[i].substring(1, auxTam);
            if (i == 0) {
                nombreVendedor[topeF1][1] += " ";
            }
        }
    }

    //tf_apellidosclientes.getText()
    public void nombreClienteSubRutina() {
        int i;
        String auxNombre[] = tf_nombresclientes.getText().toLowerCase().split(" ");
        for (i = 0; i < auxNombre.length; i++) {
            String aux = auxNombre[i];
            int auxTam = aux.length();
            matriz_cliente[topeF5][1] = matriz_cliente[topeF5][1] + auxNombre[i].substring(0, 1).toUpperCase() + auxNombre[i].substring(1, auxTam);
            if (i == 0) {
                matriz_cliente[topeF5][1] += " ";
            }
        }
    }

    public void apellidoClienteSubRutina() {
        int i;
        String auxApellido[] = tf_apellidosclientes.getText().toLowerCase().split(" ");
        for (i = 0; i < auxApellido.length; i++) {
            String aux = auxApellido[i];
            int auxTam = aux.length();
            matriz_cliente[topeF5][2] = matriz_cliente[topeF5][2] + auxApellido[i].substring(0, 1).toUpperCase() + auxApellido[i].substring(1, auxTam);
            if (i == 0) {
                matriz_cliente[topeF5][2] += " ";
            }
        }
    }

    public int rectificarCodigoCliente() {
        boolean code = true;
        int i = 0, rectificar = 0;
        while (code) {
            if (i != topeF5) {
                if (matriz_venta[topeF][1] == Integer.parseInt(matriz_cliente[i][0])) {
                    rectificar = 0;
                    code = false;
                }
            } else if (i == topeF5) {
                rectificar = 1;
                code = false;
            }
            i++;
        }
        return rectificar;
    }

    public void bloquearTextCedula() {
        tf_cedula.setEnabled(false);
    }

    public int buscarArrobaCorreo() {
        int rectificar = 0, i = 0, argumento1 = 0;
        String aux;
        boolean rec = true, rec1 = true;
        aux = tf_correo.getText().toLowerCase();
        while (rec) {
            if (aux.substring(i, i + 1).equals("@")) {
                if (i == 0) {
                    argumento1 = i;
                    rectificar = 1;
                    rec = false;
                } else {
                    rectificar = 0;
                    rec = false;
                }
            } else if (i >= aux.length() - 1) {
                rectificar = 1;
                rec = false;
            }
            i++;
        }
        if (rectificar == 0) {
            if (aux.substring(i, aux.length()).equals("gmail.com") || aux.substring(i, aux.length()).equals("hotmail.com") || aux.substring(i, aux.length()).equals("yahoo.com")) {
                rec1 = false;
                rectificar = 0;
            } else {
                rec1 = false;
                rectificar = 1;
            }
        }
        return rectificar;
    }

    public void ordenarMatrizVendedor() {
        int i, j, aux, aux2;
        String aux3;
        for (i = 0; i < topeF1; i++) {
            aux = i;
            for (j = i + 1; j <= topeF1; j++) {
                if (matriz_vendedor_mas[aux][2] < matriz_vendedor_mas[j][2]) {
                    aux = j;
                }
            }
            if (i != aux) {
                aux2 = matriz_vendedor_mas[i][0];
                matriz_vendedor_mas[i][0] = matriz_vendedor_mas[aux][0];
                matriz_vendedor_mas[aux][0] = aux2;
                aux2 = matriz_vendedor_mas[i][1];
                matriz_vendedor_mas[i][1] = matriz_vendedor_mas[aux][1];
                matriz_vendedor_mas[aux][1] = aux2;
                aux2 = matriz_vendedor_mas[i][2];
                matriz_vendedor_mas[i][2] = matriz_vendedor_mas[aux][2];
                matriz_vendedor_mas[aux][2] = aux2;
                aux3 = nombreVendedorMas[i][0];
                nombreVendedorMas[i][0] = nombreVendedorMas[aux][0];
                nombreVendedorMas[aux][0] = aux3;
                aux3 = nombreVendedorMas[i][1];
                nombreVendedorMas[i][1] = nombreVendedorMas[aux][1];
                nombreVendedorMas[aux][1] = aux3;
            }
        }
    }

    public void ordenarMatrizInventario() {
        int i, j, aux;
        String aux2;
        if (topeF2 > 0) {
            for (i = 0; i < topeF2; i++) {
                aux = i;
                for (j = i + 1; j < topeF2; j++) {
                    if (Integer.parseInt(matriz_mp[aux][2]) < Integer.parseInt(matriz_mp[j][2])) {
                        aux = j;
                    }
                }
                if (i != aux) {
                    aux2 = matriz_mp[i][0];
                    matriz_mp[i][0] = matriz_mp[aux][0];
                    matriz_mp[aux][0] = aux2;
                    aux2 = matriz_mp[i][1];
                    matriz_mp[i][1] = matriz_mp[aux][1];
                    matriz_mp[aux][1] = aux2;
                    aux2 = matriz_mp[i][2];
                    matriz_mp[i][2] = matriz_mp[aux][2];
                    matriz_mp[aux][2] = aux2;
                    aux2 = matriz_mp[i][3];
                    matriz_mp[i][3] = matriz_mp[aux][3];
                    matriz_mp[aux][3] = aux2;
                }
            }
        }
    }

    public void ordenarMatrizProducto() {
        int i, j, aux, aux2;
        String aux3;
        for (i = 0; i < topeF1; i++) {
            aux = i;
            for (j = i + 1; j <= topeF1; j++) {
                if (matriz_vendedor_mas[aux][2] < matriz_vendedor_mas[j][2]) {
                    aux = j;
                }
            }
            if (i != aux) {
                aux2 = matriz_vendedor_mas[i][0];
                matriz_vendedor_mas[i][0] = matriz_vendedor_mas[aux][0];
                matriz_vendedor_mas[aux][0] = aux2;
                aux2 = matriz_vendedor_mas[i][1];
                matriz_vendedor_mas[i][1] = matriz_vendedor_mas[aux][1];
                matriz_vendedor_mas[aux][1] = aux2;
                aux2 = matriz_vendedor_mas[i][2];
                matriz_vendedor_mas[i][2] = matriz_vendedor_mas[aux][2];
                matriz_vendedor_mas[aux][2] = aux2;
                aux3 = nombreVendedorMas[i][0];
                nombreVendedorMas[i][0] = nombreVendedorMas[aux][0];
                nombreVendedorMas[aux][0] = aux3;
                aux3 = nombreVendedorMas[i][1];
                nombreVendedorMas[i][1] = nombreVendedorMas[aux][1];
                nombreVendedorMas[aux][1] = aux3;
            }
        }
    }

    public void obtenerDatosVendedor() {
        int i;
        for (i = 0; i < topeF1; i++) {
            nombreVendedorMas[i][0] = nombreVendedor[i][0];
            nombreVendedorMas[i][1] = nombreVendedor[i][1];
            matriz_vendedor_mas[i][0] = matriz_vendedor[i][0];
            matriz_vendedor_mas[i][1] = matriz_vendedor[i][1];
            matriz_vendedor_mas[i][2] = matriz_vendedor[i][2];
        }
    }

    public void obtenerDatosInventario() {
        int i;
        for (i = 0; i < topeF2; i++) {
            matriz_mp[i][0] = descripcion[i][0];
            matriz_mp[i][1] = "" + matriz_producto[i][0];
            matriz_mp[i][2] = "" + matriz_producto[i][3];
            matriz_mp[i][3] = "" + (matriz_producto[i][1] * matriz_producto[i][3]);
        }
    }

    //Ocultar el mensaje de error ventas
    Timer timerUp = new Timer(3, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (errorMenssage.getHeight() != 0) {
                errorMenssage.setBounds(errorMenssage.getX(), errorMenssage.getY(), errorMenssage.getWidth(), errorMenssage.getHeight() - 5);
            } else {
                timerUp.stop();
            }
        }

    });
    //Mostrar el mensaje de error ventas
    Timer timerDown = new Timer(3, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (errorMenssage.getHeight() != 50) {
                errorMenssage.setBounds(errorMenssage.getX(), errorMenssage.getY(), errorMenssage.getWidth(), errorMenssage.getHeight() + 5);
            } else {
                timerDown.stop();
            }
        }

    });
    //Ocultar el mensaje de error vendedor
    Timer timerUp1 = new Timer(3, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (errorMenssage1.getHeight() != 0) {
                errorMenssage1.setBounds(errorMenssage1.getX(), errorMenssage1.getY(), errorMenssage1.getWidth(), errorMenssage1.getHeight() - 5);
            } else {
                timerUp1.stop();
            }
        }

    });
    //Mostrar el mensaje de error vendedor
    Timer timerDown1 = new Timer(3, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (errorMenssage1.getHeight() != 50) {
                errorMenssage1.setBounds(errorMenssage1.getX(), errorMenssage1.getY(), errorMenssage1.getWidth(), errorMenssage1.getHeight() + 5);
            } else {
                timerDown1.stop();
            }
        }

    });
    //Ocultar el mensaje de error inventario
    Timer timerUp2 = new Timer(3, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (errorMenssage2.getHeight() != 0) {
                errorMenssage2.setBounds(errorMenssage2.getX(), errorMenssage2.getY(), errorMenssage2.getWidth(), errorMenssage2.getHeight() - 5);
            } else {
                timerUp2.stop();
            }
        }

    });
    //Mostrar el mensaje de error inventario
    Timer timerDown2 = new Timer(3, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (errorMenssage2.getHeight() != 50) {
                errorMenssage2.setBounds(errorMenssage2.getX(), errorMenssage2.getY(), errorMenssage2.getWidth(), errorMenssage2.getHeight() + 5);
            } else {
                timerDown2.stop();
            }
        }

    });
    //Ocultar el mensaje de error inventario
    Timer timerUp3 = new Timer(3, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (errorMenssage3.getHeight() != 0) {
                errorMenssage3.setBounds(errorMenssage3.getX(), errorMenssage3.getY(), errorMenssage3.getWidth(), errorMenssage3.getHeight() - 5);
            } else {
                timerUp3.stop();
            }
        }

    });
    //Mostrar el mensaje de error inventario
    Timer timerDown3 = new Timer(3, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (errorMenssage3.getHeight() != 50) {
                errorMenssage3.setBounds(errorMenssage3.getX(), errorMenssage3.getY(), errorMenssage3.getWidth(), errorMenssage3.getHeight() + 5);
            } else {
                timerDown3.stop();
            }
        }

    });


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bclientes;
    private javax.swing.JButton Binv;
    private javax.swing.JButton Bmv;
    private javax.swing.JButton Bsuel;
    private javax.swing.JButton Btv;
    private javax.swing.JButton Bvendedor;
    private javax.swing.JButton Bventas;
    private javax.swing.JPanel Cliente;
    private javax.swing.JPanel Inv;
    private javax.swing.JPanel Mv;
    private javax.swing.JPanel Pmv;
    private javax.swing.JPanel Vendedor;
    private javax.swing.JPanel Venta;
    private javax.swing.JTabbedPane Welcon;
    private javax.swing.JLabel cantidadVendedorMas;
    private javax.swing.JLabel cantidadVendedorMenos;
    private javax.swing.JPanel cl;
    private javax.swing.JTable clientesTbl;
    private javax.swing.JLabel codigoProducto;
    private javax.swing.JLabel codigoVendedorMas;
    private javax.swing.JLabel codigoVendedorMenos;
    private javax.swing.JLabel descripcionProducto;
    private javax.swing.JPanel errorMenssage;
    private javax.swing.JPanel errorMenssage1;
    private javax.swing.JPanel errorMenssage2;
    private javax.swing.JPanel errorMenssage3;
    private javax.swing.JPanel in;
    private javax.swing.JButton ingresar1B;
    private javax.swing.JButton ingresar2B;
    private javax.swing.JButton ingresar4B;
    private javax.swing.JButton ingresar4B3;
    private javax.swing.JButton ingresar4B4;
    private javax.swing.JButton ingresar4B5;
    private javax.swing.JTable inventarioTbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JPanel jv;
    private javax.swing.JPanel jvn;
    private javax.swing.JPanel mmv;
    private javax.swing.JPanel mv;
    private javax.swing.JLabel numerosUnidades;
    private javax.swing.JPanel pbv;
    private javax.swing.JTable productoMVTbl;
    private javax.swing.JButton salirB;
    private javax.swing.JButton salirB1;
    private javax.swing.JTable sueldoTbl;
    private javax.swing.JPanel sul;
    private javax.swing.JComboBox<String> tarjetasBox;
    private javax.swing.JTextField tf_apellidosclientes;
    private javax.swing.JTextField tf_apellidovendedor;
    private javax.swing.JTextField tf_cantidadproducto;
    private javax.swing.JTextField tf_cantidadproducto1;
    private javax.swing.JTextField tf_cedula;
    private javax.swing.JTextField tf_codigobuscar;
    private javax.swing.JTextField tf_comprador;
    private javax.swing.JTextField tf_correo;
    private javax.swing.JTextField tf_cproducto1;
    private javax.swing.JTextField tf_cproducto2;
    private javax.swing.JTextField tf_cproducto3;
    private javax.swing.JTextField tf_cvendedor1;
    private javax.swing.JTextField tf_cvendedor2;
    private javax.swing.JTextField tf_cvendida2;
    private javax.swing.JTextField tf_descripcion;
    private javax.swing.JTextField tf_descripcion1;
    private javax.swing.JTextField tf_nombresclientes;
    private javax.swing.JTextField tf_nombrevendedor;
    private javax.swing.JTextField tf_preciou;
    private javax.swing.JTextField tf_vproducto;
    private javax.swing.JTextField tf_vproducto1;
    private javax.swing.JLabel vendedorMas;
    private javax.swing.JLabel vendedorMenos;
    private javax.swing.JTable vendedorTbl;
    private javax.swing.JTable vendedorTbl1;
    private javax.swing.JTable ventasTbl;
    private javax.swing.JPanel wc;
    // End of variables declaration//GEN-END:variables
}
