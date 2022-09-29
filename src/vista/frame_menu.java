package vista;
import modelo.Aseguradora;
import modelo.Cliente;
import modelo.Conductor;
import modelo.Empresa;
import modelo.Pago;
import modelo.Persona;
import modelo.Usuario;
import modelo.Vehiculo;
import modelo.Viaje;
import conexion_BBDD.Auxiliar;
import controlador.DAOClienteImpl;
import controlador.DAOConductorImpl;
import controlador.DAOEmpresaImpl;
import controlador.DAOPagoImpl;
import controlador.DAOPersonaImpl;
import controlador.DAOViajeImpl;
import interfaces.DAOCliente;
import interfaces.DAOConductor;
import interfaces.DAOEmpresa;
import interfaces.DAOPago;
import interfaces.DAOPersona;
import interfaces.DAOViaje;
import java.awt.Image;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import rojeru_san.RSPanelsSlider;

public class frame_menu extends javax.swing.JFrame {
    int xx,xy;
    byte imagenChofer[];//VARIABLE PARA RECEPCIONAR LA FOTO SUBIDA EL DESDE FILE-CHOOSEER
    byte imagenVehiculo[];//VARIABLE PARA RECEPCIONAR LA FOTO SUBIDA EL DESDE FILE-CHOOSEER    
    public frame_menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.imagenChofer=null;
        this.imagenVehiculo=null;
        this.setResetCamposRegistroConductor();

        DAOConductor dao1=new DAOConductorImpl();
        DAOViaje dao2=new DAOViajeImpl();
        //Aqui cargo todas mis tablas
        try{
            dao1.getTableConductoresDisponibles(this.tblTaxisDisponibles);
            dao2.setViajeIniciadosToTable(this.tblViajeIniciados);
            dao1.getTableConductores(this.tblListaConductoresRegistrados);
            dao1.setConductoresPagoToTable(this.tblConductoresPago);
        }catch (Exception ex) {
            System.out.println("NO CARGO TABLAS");
        }        
    }
    //RESETAR CAMPOS
    public void setResetCamposRegistroConductor(){
        this.txtNombreConductor.setText("");
        this.txtApellidoConductor.setText("");
        this.txtDNIConductor.setText("");
        this.txtCelularConductor.setText("");
        this.txtCtaBancaria.setText("");
        this.lblIdConductor.setText("");
        this.txtMarca.setText("");
        this.txtModelo.setText("");
        this.txtPlaca.setText("");
        this.dateFechaNacimiento.setDate(new Date());
        this.dateFechaVencimientoLicencia.setDate(new Date());
        this.dateFechaVencimientoSeguro.setDate(new Date());
        this.comboAseguradora.setSelectedIndex(0);
        this.comboCategoria.setSelectedIndex(0);
        this.comboTipoSeguro.setSelectedIndex(0);
        //Estableciendo imagen por default de la foto del chofer
        ImageIcon mi_imagenConductor=new ImageIcon(getClass().getResource("/iconos/conductor.png"));
        ImageIcon iconoConductor=new ImageIcon(mi_imagenConductor.getImage().getScaledInstance(this.lblFotoChofer.getWidth(), this.lblFotoChofer.getHeight(), Image.SCALE_DEFAULT));
        this.lblFotoChofer.setIcon(iconoConductor);
        //Estableciendo imagen por default de la foto del vehiculo
        ImageIcon mi_imagenVehiculo=new ImageIcon(getClass().getResource("/iconos/vehiculo.png"));
        ImageIcon icono2Vehiculo=new ImageIcon(mi_imagenVehiculo.getImage().getScaledInstance(this.lblFotoVehiculo.getWidth(), this.lblFotoVehiculo.getHeight(), Image.SCALE_DEFAULT));
        this.lblFotoVehiculo.setIcon(icono2Vehiculo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        barraBotonesIziquierda = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnViaje = new rojeru_san.RSButtonRiple();
        btnTaxi = new rojeru_san.RSButtonRiple();
        btnPago = new rojeru_san.RSButtonRiple();
        btnSallir = new rojeru_san.RSButtonRiple();
        pnlContenido = new javax.swing.JPanel();
        barraTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnX = new rojeru_san.RSButtonRiple();
        lblFecha = new rojeru_san.RSLabelFecha();
        lblHora = new rojeru_san.RSLabelHora();
        lbl_ID_USER = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        pnlSliderContenido = new rojeru_san.RSPanelsSlider();
        pnlViaje = new javax.swing.JPanel();
        btnNuevoViaje = new rojeru_san.RSButtonRiple();
        btnViajesIniciados = new rojeru_san.RSButtonRiple();
        pnlSliderViajeContenido = new rojeru_san.RSPanelsSlider();
        pnlNuevoViaje = new javax.swing.JPanel();
        lblTaxisDisponibles = new javax.swing.JLabel();
        pnlSliderDatosCliente = new rojeru_san.RSPanelsSlider();
        pnlPersonaNatutal = new javax.swing.JPanel();
        txtNombrePersonaN = new rojeru_san.RSMTextFull();
        txtDNIpesonarN = new rojeru_san.RSMTextFull();
        txtApellidoPersonaN = new rojeru_san.RSMTextFull();
        txtCelularPersonaN = new rojeru_san.RSMTextFull();
        txtCodigoPersonaN = new rojeru_san.RSMTextFull();
        txtEmailPersonaN = new rojeru_san.RSMTextFull();
        btnBuscarCodigoPersona = new rojeru_san.RSButtonRiple();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnGenerarCodigoPersona = new rojeru_san.RSButtonRiple();
        pnlEmpresa = new javax.swing.JPanel();
        txtRazonSocialEmpresa = new rojeru_san.RSMTextFull();
        txtRucEmpresa = new rojeru_san.RSMTextFull();
        txtEmailEmpresa = new rojeru_san.RSMTextFull();
        txtCelularEmpresa = new rojeru_san.RSMTextFull();
        txtCodigoEmpresa = new rojeru_san.RSMTextFull();
        btnBuscarCodigoEmpresa = new rojeru_san.RSButtonRiple();
        btnGenerarCodigoEmpresa = new rojeru_san.RSButtonRiple();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        scrollTaxisDisponibles = new javax.swing.JScrollPane();
        tblTaxisDisponibles = new rojerusan.RSTableMetro();
        pnlRuta = new javax.swing.JPanel();
        txtOrigen = new rojeru_san.RSMTextFull();
        txtD_Origen = new rojeru_san.RSMTextFull();
        txtDestino = new rojeru_san.RSMTextFull();
        txtD_Destino = new rojeru_san.RSMTextFull();
        txtMontoViaje = new rojeru_san.RSMTextFull();
        btnGoogleMap = new rojeru_san.RSButtonRiple();
        lblDatosCliente = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnNuevosConductores = new rojeru_san.RSButtonRiple();
        btnBuscarTaxiDisponible = new rojeru_san.RSButtonRiple();
        btnIniciarViaje = new rojeru_san.RSButtonRiple();
        comboTipoCliente = new rojerusan.RSComboMetro();
        txtConductorDestinoUltimoViaje = new rojeru_san.RSMTextFull();
        jSeparator1 = new javax.swing.JSeparator();
        lblDatosCliente1 = new javax.swing.JLabel();
        btnResetCamposCliente = new rojeru_san.RSButtonRiple();
        pnlViajesIniciados = new javax.swing.JPanel();
        scrollViajesIniciados = new javax.swing.JScrollPane();
        tblViajeIniciados = new rojerusan.RSTableMetro();
        btnBuscarCodigoViaje = new rojeru_san.RSButtonRiple();
        btnTerminado = new rojeru_san.RSButtonRiple();
        txtCodigoViaje = new rojeru_san.RSMTextFull();
        lblActualizarListaViajeIniciados = new javax.swing.JLabel();
        comboMarcarViaje = new rojerusan.RSComboMetro();
        pnlTaxi = new javax.swing.JPanel();
        pnlDatosTaxi = new javax.swing.JPanel();
        pnlDatosPersonales = new javax.swing.JPanel();
        lblDatosPesonalesChofer = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblLicenciaConducir = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblFechaVencimiento = new javax.swing.JLabel();
        lblFotoChofer = new javax.swing.JLabel();
        txtNombreConductor = new rojeru_san.RSMTextFull();
        txtApellidoConductor = new rojeru_san.RSMTextFull();
        txtDNIConductor = new rojeru_san.RSMTextFull();
        txtCelularConductor = new rojeru_san.RSMTextFull();
        btnsubirFotoChofer = new rojeru_san.RSButtonRiple();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        comboCategoria = new rojerusan.RSComboMetro();
        dateFechaVencimientoLicencia = new com.toedter.calendar.JDateChooser();
        dateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        pnlDatosVehiculo = new javax.swing.JPanel();
        lblModelo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblFechaVencimientoSeguroT = new javax.swing.JLabel();
        lblDatosVehiculo = new javax.swing.JLabel();
        lblFotoVehiculo = new javax.swing.JLabel();
        lblSOAT = new javax.swing.JLabel();
        lblTipoSeguro = new javax.swing.JLabel();
        lblAseguradoraNombre = new javax.swing.JLabel();
        txtMarca = new rojeru_san.RSMTextFull();
        txtModelo = new rojeru_san.RSMTextFull();
        txtPlaca = new rojeru_san.RSMTextFull();
        btnSubirFotoVehiculo = new rojeru_san.RSButtonRiple();
        dateFechaVencimientoSeguro = new com.toedter.calendar.JDateChooser();
        jSeparator4 = new javax.swing.JSeparator();
        comboAseguradora = new rojerusan.RSComboMetro();
        comboTipoSeguro = new rojerusan.RSComboMetro();
        jSeparator6 = new javax.swing.JSeparator();
        lblCodigoConductor = new javax.swing.JLabel();
        txtCtaBancaria = new rojeru_san.RSMTextFull();
        btnResetearCampos = new rojeru_san.RSButtonRiple();
        btnRegistrarNuevo = new rojeru_san.RSButtonRiple();
        btnActualizar = new rojeru_san.RSButtonRiple();
        lblCtaBancaria = new javax.swing.JLabel();
        lblIdConductor = new javax.swing.JLabel();
        pnlListaTaxis = new javax.swing.JPanel();
        txtBusquedaConductor = new rojeru_san.RSMTextFull();
        comoBusquedaConductor = new rojerusan.RSComboMetro();
        btnBuscarTAXI = new rojeru_san.RSButtonRiple();
        lblListaTaxisTAXI = new javax.swing.JLabel();
        scrollListaTaxis = new javax.swing.JScrollPane();
        tblListaConductoresRegistrados = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        pnlPago = new javax.swing.JPanel();
        scrollChoferes = new javax.swing.JScrollPane();
        tblConductoresPago = new rojerusan.RSTableMetro();
        scrollPagosPendientes = new javax.swing.JScrollPane();
        tblPagosPendientes = new rojerusan.RSTableMetro();
        scrollViajesRealizados = new javax.swing.JScrollPane();
        tblViajesRealizados = new rojerusan.RSTableMetro();
        scrollHistorialPagos = new javax.swing.JScrollPane();
        tblHistorialPagos = new rojerusan.RSTableMetro();
        lblPagosPendientes = new javax.swing.JLabel();
        lblChoferes = new javax.swing.JLabel();
        lblViajeRealizados = new javax.swing.JLabel();
        lblHistorialPagos = new javax.swing.JLabel();
        lblNameChofer2 = new javax.swing.JLabel();
        lblNameChofer1 = new javax.swing.JLabel();
        lblChofer = new javax.swing.JLabel();
        btnMostrarConductoreConPendientes = new rojeru_san.RSButtonRiple();
        btnMarcarComoPendiente = new rojeru_san.RSButtonRiple();
        btnRegistrarPago = new rojeru_san.RSButtonRiple();
        btnRegistrarPendiente = new rojeru_san.RSButtonRiple();
        txtBusquedaConductor2 = new rojeru_san.RSMTextFull();
        comoBusquedaConductor2 = new rojerusan.RSComboMetro();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarConductor = new rojeru_san.RSButtonRiple();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBase.setBackground(new java.awt.Color(0, 0, 0));
        pnlBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraBotonesIziquierda.setBackground(new java.awt.Color(0, 26, 41));
        barraBotonesIziquierda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraBotonesIziquierdaMouseDragged(evt);
            }
        });
        barraBotonesIziquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraBotonesIziquierdaMousePressed(evt);
            }
        });
        barraBotonesIziquierda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/taxis_icono6.png"))); // NOI18N
        barraBotonesIziquierda.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 140));

        btnViaje.setBackground(new java.awt.Color(0, 26, 41));
        btnViaje.setText("VIAJE");
        btnViaje.setColorHover(new java.awt.Color(48, 227, 202));
        btnViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajeActionPerformed(evt);
            }
        });
        barraBotonesIziquierda.add(btnViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, -1));

        btnTaxi.setBackground(new java.awt.Color(0, 26, 41));
        btnTaxi.setText("TAXI");
        btnTaxi.setColorHover(new java.awt.Color(48, 227, 202));
        btnTaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxiActionPerformed(evt);
            }
        });
        barraBotonesIziquierda.add(btnTaxi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, -1));

        btnPago.setBackground(new java.awt.Color(0, 26, 41));
        btnPago.setText("PAGO");
        btnPago.setColorHover(new java.awt.Color(48, 227, 202));
        btnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoActionPerformed(evt);
            }
        });
        barraBotonesIziquierda.add(btnPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, -1));

        btnSallir.setBackground(new java.awt.Color(48, 227, 202));
        btnSallir.setText("SALIR");
        btnSallir.setColorHover(new java.awt.Color(48, 227, 202));
        btnSallir.setColorText(new java.awt.Color(0, 26, 41));
        btnSallir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSallirActionPerformed(evt);
            }
        });
        barraBotonesIziquierda.add(btnSallir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, 40));

        pnlBase.add(barraBotonesIziquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 720));

        pnlContenido.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraTitulo.setBackground(new java.awt.Color(48, 227, 202));
        barraTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraTituloMouseDragged(evt);
            }
        });
        barraTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraTituloMousePressed(evt);
            }
        });
        barraTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 26, 41));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ID:");
        barraTitulo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 60, 40));

        btnX.setBackground(new java.awt.Color(0, 26, 41));
        btnX.setText("X");
        btnX.setColorHover(new java.awt.Color(48, 227, 202));
        btnX.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        barraTitulo.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 60, -1));

        lblFecha.setForeground(new java.awt.Color(0, 26, 41));
        barraTitulo.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 20));

        lblHora.setForeground(new java.awt.Color(0, 26, 41));
        barraTitulo.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 20));

        lbl_ID_USER.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        lbl_ID_USER.setForeground(new java.awt.Color(0, 26, 41));
        lbl_ID_USER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ID_USER.setText("1");
        barraTitulo.add(lbl_ID_USER, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 50, 40));

        lblTitulo1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 26, 41));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("SISTEMA GESTION DE TAXIS");
        barraTitulo.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 420, 40));

        pnlContenido.add(barraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 40));

        pnlViaje.setBackground(new java.awt.Color(255, 255, 255));
        pnlViaje.setName("pnlViaje"); // NOI18N
        pnlViaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevoViaje.setBackground(new java.awt.Color(0, 26, 41));
        btnNuevoViaje.setText("NUEVO VIAJE");
        btnNuevoViaje.setColorHover(new java.awt.Color(48, 227, 202));
        btnNuevoViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoViajeActionPerformed(evt);
            }
        });
        pnlViaje.add(btnNuevoViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnViajesIniciados.setBackground(new java.awt.Color(0, 26, 41));
        btnViajesIniciados.setText("VIAJES INICIADOS");
        btnViajesIniciados.setColorHover(new java.awt.Color(48, 227, 202));
        btnViajesIniciados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajesIniciadosActionPerformed(evt);
            }
        });
        pnlViaje.add(btnViajesIniciados, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        pnlSliderViajeContenido.setBackground(new java.awt.Color(51, 153, 255));

        pnlNuevoViaje.setBackground(new java.awt.Color(255, 255, 255));
        pnlNuevoViaje.setName("pnlNuevoViaje"); // NOI18N
        pnlNuevoViaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTaxisDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        lblTaxisDisponibles.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        lblTaxisDisponibles.setForeground(new java.awt.Color(0, 26, 41));
        lblTaxisDisponibles.setText("TAXIS DISPONIBLES");
        lblTaxisDisponibles.setOpaque(true);
        pnlNuevoViaje.add(lblTaxisDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 30));

        pnlPersonaNatutal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPersonaNatutal.setName("pnlPersonaNarutal"); // NOI18N
        pnlPersonaNatutal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombrePersonaN.setForeground(new java.awt.Color(64, 81, 78));
        txtNombrePersonaN.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtNombrePersonaN.setBotonColor(new java.awt.Color(64, 81, 78));
        txtNombrePersonaN.setPlaceholder("Nombre");
        txtNombrePersonaN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePersonaNKeyTyped(evt);
            }
        });
        pnlPersonaNatutal.add(txtNombrePersonaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 180, 40));

        txtDNIpesonarN.setForeground(new java.awt.Color(64, 81, 78));
        txtDNIpesonarN.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtDNIpesonarN.setBotonColor(new java.awt.Color(64, 81, 78));
        txtDNIpesonarN.setPlaceholder("D.N.I.");
        txtDNIpesonarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIpesonarNActionPerformed(evt);
            }
        });
        txtDNIpesonarN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIpesonarNKeyTyped(evt);
            }
        });
        pnlPersonaNatutal.add(txtDNIpesonarN, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 130, 40));

        txtApellidoPersonaN.setForeground(new java.awt.Color(64, 81, 78));
        txtApellidoPersonaN.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtApellidoPersonaN.setBotonColor(new java.awt.Color(64, 81, 78));
        txtApellidoPersonaN.setPlaceholder("Apellidos");
        txtApellidoPersonaN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPersonaNKeyTyped(evt);
            }
        });
        pnlPersonaNatutal.add(txtApellidoPersonaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, 40));

        txtCelularPersonaN.setForeground(new java.awt.Color(64, 81, 78));
        txtCelularPersonaN.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtCelularPersonaN.setBotonColor(new java.awt.Color(64, 81, 78));
        txtCelularPersonaN.setPlaceholder("N° Celular");
        txtCelularPersonaN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularPersonaNKeyTyped(evt);
            }
        });
        pnlPersonaNatutal.add(txtCelularPersonaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 130, 40));

        txtCodigoPersonaN.setForeground(new java.awt.Color(64, 81, 78));
        txtCodigoPersonaN.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtCodigoPersonaN.setBotonColor(new java.awt.Color(64, 81, 78));
        txtCodigoPersonaN.setPlaceholder("CODIGO");
        txtCodigoPersonaN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoPersonaNKeyTyped(evt);
            }
        });
        pnlPersonaNatutal.add(txtCodigoPersonaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 100, 40));

        txtEmailPersonaN.setForeground(new java.awt.Color(64, 81, 78));
        txtEmailPersonaN.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtEmailPersonaN.setBotonColor(new java.awt.Color(64, 81, 78));
        txtEmailPersonaN.setPlaceholder("E-mail");
        txtEmailPersonaN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailPersonaNKeyTyped(evt);
            }
        });
        pnlPersonaNatutal.add(txtEmailPersonaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 250, 40));

        btnBuscarCodigoPersona.setBackground(new java.awt.Color(48, 227, 202));
        btnBuscarCodigoPersona.setText("BUSCAR PERSONA");
        btnBuscarCodigoPersona.setColorHover(new java.awt.Color(48, 227, 202));
        btnBuscarCodigoPersona.setColorText(new java.awt.Color(0, 26, 41));
        btnBuscarCodigoPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCodigoPersonaActionPerformed(evt);
            }
        });
        pnlPersonaNatutal.add(btnBuscarCodigoPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 160, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 26, 41));
        jLabel14.setText("Apellidos:");
        jLabel14.setOpaque(true);
        pnlPersonaNatutal.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 90, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 26, 41));
        jLabel15.setText("ID:");
        jLabel15.setOpaque(true);
        pnlPersonaNatutal.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 30, 30));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 26, 41));
        jLabel16.setText("Nombre:");
        jLabel16.setOpaque(true);
        pnlPersonaNatutal.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 26, 41));
        jLabel17.setText("E-mail:");
        jLabel17.setOpaque(true);
        pnlPersonaNatutal.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, 30));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 26, 41));
        jLabel18.setText("Celular:");
        jLabel18.setOpaque(true);
        pnlPersonaNatutal.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 30));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 26, 41));
        jLabel19.setText("DNI:");
        jLabel19.setOpaque(true);
        pnlPersonaNatutal.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 50, 30));

        btnGenerarCodigoPersona.setBackground(new java.awt.Color(48, 227, 202));
        btnGenerarCodigoPersona.setText("GENERAR CODIGO");
        btnGenerarCodigoPersona.setColorHover(new java.awt.Color(48, 227, 202));
        btnGenerarCodigoPersona.setColorText(new java.awt.Color(0, 26, 41));
        btnGenerarCodigoPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCodigoPersonaActionPerformed(evt);
            }
        });
        pnlPersonaNatutal.add(btnGenerarCodigoPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 160, 30));

        pnlSliderDatosCliente.add(pnlPersonaNatutal, "card2");

        pnlEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        pnlEmpresa.setName("pnlEmpresa"); // NOI18N
        pnlEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRazonSocialEmpresa.setForeground(new java.awt.Color(64, 81, 78));
        txtRazonSocialEmpresa.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtRazonSocialEmpresa.setBotonColor(new java.awt.Color(64, 81, 78));
        txtRazonSocialEmpresa.setPlaceholder("Razón social");
        txtRazonSocialEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazonSocialEmpresaKeyTyped(evt);
            }
        });
        pnlEmpresa.add(txtRazonSocialEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 240, 40));

        txtRucEmpresa.setForeground(new java.awt.Color(64, 81, 78));
        txtRucEmpresa.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtRucEmpresa.setBotonColor(new java.awt.Color(64, 81, 78));
        txtRucEmpresa.setPlaceholder("R.U.C.");
        txtRucEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucEmpresaKeyTyped(evt);
            }
        });
        pnlEmpresa.add(txtRucEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 160, 40));

        txtEmailEmpresa.setForeground(new java.awt.Color(64, 81, 78));
        txtEmailEmpresa.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtEmailEmpresa.setBotonColor(new java.awt.Color(64, 81, 78));
        txtEmailEmpresa.setPlaceholder("E-mail");
        txtEmailEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailEmpresaKeyTyped(evt);
            }
        });
        pnlEmpresa.add(txtEmailEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 290, 40));

        txtCelularEmpresa.setForeground(new java.awt.Color(64, 81, 78));
        txtCelularEmpresa.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtCelularEmpresa.setBotonColor(new java.awt.Color(64, 81, 78));
        txtCelularEmpresa.setPlaceholder("N° Celular");
        txtCelularEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularEmpresaKeyTyped(evt);
            }
        });
        pnlEmpresa.add(txtCelularEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 160, 40));

        txtCodigoEmpresa.setForeground(new java.awt.Color(64, 81, 78));
        txtCodigoEmpresa.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtCodigoEmpresa.setBotonColor(new java.awt.Color(64, 81, 78));
        txtCodigoEmpresa.setPlaceholder("CODIGO");
        txtCodigoEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoEmpresaKeyTyped(evt);
            }
        });
        pnlEmpresa.add(txtCodigoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 90, 40));

        btnBuscarCodigoEmpresa.setBackground(new java.awt.Color(48, 227, 202));
        btnBuscarCodigoEmpresa.setText("BUSCAR EMPRESA");
        btnBuscarCodigoEmpresa.setColorHover(new java.awt.Color(48, 227, 202));
        btnBuscarCodigoEmpresa.setColorText(new java.awt.Color(0, 26, 41));
        btnBuscarCodigoEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCodigoEmpresaActionPerformed(evt);
            }
        });
        pnlEmpresa.add(btnBuscarCodigoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 160, 30));

        btnGenerarCodigoEmpresa.setBackground(new java.awt.Color(48, 227, 202));
        btnGenerarCodigoEmpresa.setText("GENERAR CODIGO");
        btnGenerarCodigoEmpresa.setColorHover(new java.awt.Color(48, 227, 202));
        btnGenerarCodigoEmpresa.setColorText(new java.awt.Color(0, 26, 41));
        btnGenerarCodigoEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCodigoEmpresaActionPerformed(evt);
            }
        });
        pnlEmpresa.add(btnGenerarCodigoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 26, 41));
        jLabel13.setText("Celular:");
        jLabel13.setOpaque(true);
        pnlEmpresa.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 70, 30));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 26, 41));
        jLabel21.setText("Razón social:");
        jLabel21.setOpaque(true);
        pnlEmpresa.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 26, 41));
        jLabel22.setText("E-mail:");
        jLabel22.setOpaque(true);
        pnlEmpresa.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 60, 30));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 26, 41));
        jLabel23.setText("RUC:");
        jLabel23.setOpaque(true);
        pnlEmpresa.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 50, 30));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 26, 41));
        jLabel24.setText("ID:");
        jLabel24.setOpaque(true);
        pnlEmpresa.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 30, 30));

        pnlSliderDatosCliente.add(pnlEmpresa, "card3");

        pnlNuevoViaje.add(pnlSliderDatosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 490, 180));

        tblTaxisDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "CHOFER", "CELULAR", "DESTINO DE ULTIMO VIAJE", "HORA "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTaxisDisponibles.setAltoHead(20);
        tblTaxisDisponibles.setColorBackgoundHead(new java.awt.Color(0, 26, 41));
        tblTaxisDisponibles.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblTaxisDisponibles.setColorFilasForeground1(new java.awt.Color(0, 26, 41));
        tblTaxisDisponibles.setColorFilasForeground2(new java.awt.Color(0, 26, 41));
        tblTaxisDisponibles.setColorSelBackgound(new java.awt.Color(0, 26, 41));
        tblTaxisDisponibles.setName(""); // NOI18N
        tblTaxisDisponibles.setShowHorizontalLines(false);
        tblTaxisDisponibles.setShowVerticalLines(false);
        tblTaxisDisponibles.setSurrendersFocusOnKeystroke(true);
        scrollTaxisDisponibles.setViewportView(tblTaxisDisponibles);
        if (tblTaxisDisponibles.getColumnModel().getColumnCount() > 0) {
            tblTaxisDisponibles.getColumnModel().getColumn(0).setMinWidth(50);
            tblTaxisDisponibles.getColumnModel().getColumn(0).setMaxWidth(50);
            tblTaxisDisponibles.getColumnModel().getColumn(1).setMinWidth(350);
            tblTaxisDisponibles.getColumnModel().getColumn(1).setMaxWidth(350);
            tblTaxisDisponibles.getColumnModel().getColumn(2).setMinWidth(100);
            tblTaxisDisponibles.getColumnModel().getColumn(2).setMaxWidth(100);
            tblTaxisDisponibles.getColumnModel().getColumn(3).setMinWidth(480);
            tblTaxisDisponibles.getColumnModel().getColumn(3).setMaxWidth(480);
            tblTaxisDisponibles.getColumnModel().getColumn(4).setMinWidth(100);
            tblTaxisDisponibles.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        pnlNuevoViaje.add(scrollTaxisDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 1080, 260));

        pnlRuta.setBackground(new java.awt.Color(255, 255, 255));
        pnlRuta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOrigen.setForeground(new java.awt.Color(64, 81, 78));
        txtOrigen.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtOrigen.setBotonColor(new java.awt.Color(64, 81, 78));
        txtOrigen.setPlaceholder("Origen");
        txtOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrigenKeyTyped(evt);
            }
        });
        pnlRuta.add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 40));

        txtD_Origen.setForeground(new java.awt.Color(64, 81, 78));
        txtD_Origen.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtD_Origen.setBotonColor(new java.awt.Color(64, 81, 78));
        txtD_Origen.setPlaceholder("O. Distrito");
        txtD_Origen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtD_OrigenKeyTyped(evt);
            }
        });
        pnlRuta.add(txtD_Origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 260, 40));

        txtDestino.setForeground(new java.awt.Color(64, 81, 78));
        txtDestino.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtDestino.setBotonColor(new java.awt.Color(64, 81, 78));
        txtDestino.setPlaceholder("Destino");
        txtDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDestinoKeyTyped(evt);
            }
        });
        pnlRuta.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 260, 40));

        txtD_Destino.setForeground(new java.awt.Color(64, 81, 78));
        txtD_Destino.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtD_Destino.setBotonColor(new java.awt.Color(64, 81, 78));
        txtD_Destino.setPlaceholder("D. Distrito");
        txtD_Destino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtD_DestinoKeyTyped(evt);
            }
        });
        pnlRuta.add(txtD_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 260, 40));

        txtMontoViaje.setForeground(new java.awt.Color(64, 81, 78));
        txtMontoViaje.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtMontoViaje.setBotonColor(new java.awt.Color(64, 81, 78));
        txtMontoViaje.setPlaceholder("Monto S/.");
        txtMontoViaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoViajeKeyTyped(evt);
            }
        });
        pnlRuta.add(txtMontoViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 140, 40));

        btnGoogleMap.setBackground(new java.awt.Color(48, 227, 202));
        btnGoogleMap.setText("GOOGLE MAP");
        btnGoogleMap.setColorHover(new java.awt.Color(48, 227, 202));
        btnGoogleMap.setColorText(new java.awt.Color(0, 26, 41));
        btnGoogleMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoogleMapActionPerformed(evt);
            }
        });
        pnlRuta.add(btnGoogleMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 150, 30));

        lblDatosCliente.setBackground(new java.awt.Color(255, 255, 255));
        lblDatosCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblDatosCliente.setForeground(new java.awt.Color(0, 26, 41));
        lblDatosCliente.setText("Monto S/. : ");
        lblDatosCliente.setOpaque(true);
        pnlRuta.add(lblDatosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 100, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 26, 41));
        jLabel20.setText("Ruta:");
        jLabel20.setOpaque(true);
        pnlRuta.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        pnlNuevoViaje.add(pnlRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 540, 210));

        btnNuevosConductores.setBackground(new java.awt.Color(0, 26, 41));
        btnNuevosConductores.setText("NUEVOS CONDUCTORES");
        btnNuevosConductores.setColorHover(new java.awt.Color(48, 227, 202));
        btnNuevosConductores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevosConductoresActionPerformed(evt);
            }
        });
        pnlNuevoViaje.add(btnNuevosConductores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, 30));

        btnBuscarTaxiDisponible.setBackground(new java.awt.Color(0, 26, 41));
        btnBuscarTaxiDisponible.setText("BUSCAR");
        btnBuscarTaxiDisponible.setColorHover(new java.awt.Color(48, 227, 202));
        btnBuscarTaxiDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTaxiDisponibleActionPerformed(evt);
            }
        });
        pnlNuevoViaje.add(btnBuscarTaxiDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, 30));

        btnIniciarViaje.setBackground(new java.awt.Color(0, 26, 41));
        btnIniciarViaje.setText("INICIAR VIAJE");
        btnIniciarViaje.setColorHover(new java.awt.Color(48, 227, 202));
        btnIniciarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarViajeActionPerformed(evt);
            }
        });
        pnlNuevoViaje.add(btnIniciarViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 580, -1, 30));

        comboTipoCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Persona natural", "Empresa" }));
        comboTipoCliente.setColorArrow(new java.awt.Color(0, 26, 41));
        comboTipoCliente.setColorBorde(new java.awt.Color(0, 26, 41));
        comboTipoCliente.setColorFondo(new java.awt.Color(0, 26, 41));
        comboTipoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboTipoCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoClienteItemStateChanged(evt);
            }
        });
        comboTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoClienteActionPerformed(evt);
            }
        });
        pnlNuevoViaje.add(comboTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 140, 30));

        txtConductorDestinoUltimoViaje.setForeground(new java.awt.Color(64, 81, 78));
        txtConductorDestinoUltimoViaje.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtConductorDestinoUltimoViaje.setBotonColor(new java.awt.Color(64, 81, 78));
        txtConductorDestinoUltimoViaje.setPlaceholder("Buscar ultimo destino");
        txtConductorDestinoUltimoViaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConductorDestinoUltimoViajeKeyTyped(evt);
            }
        });
        pnlNuevoViaje.add(txtConductorDestinoUltimoViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 410, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlNuevoViaje.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 10, 190));

        lblDatosCliente1.setBackground(new java.awt.Color(255, 255, 255));
        lblDatosCliente1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblDatosCliente1.setForeground(new java.awt.Color(0, 26, 41));
        lblDatosCliente1.setText("Datos del cliente:");
        lblDatosCliente1.setOpaque(true);
        pnlNuevoViaje.add(lblDatosCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 30));

        btnResetCamposCliente.setBackground(new java.awt.Color(48, 227, 202));
        btnResetCamposCliente.setText("RESET CAMPOS");
        btnResetCamposCliente.setColorHover(new java.awt.Color(48, 227, 202));
        btnResetCamposCliente.setColorText(new java.awt.Color(0, 26, 41));
        btnResetCamposCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCamposClienteActionPerformed(evt);
            }
        });
        pnlNuevoViaje.add(btnResetCamposCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 160, 30));

        pnlSliderViajeContenido.add(pnlNuevoViaje, "card3");

        pnlViajesIniciados.setBackground(new java.awt.Color(255, 255, 255));
        pnlViajesIniciados.setName("pnlViajesIniciados"); // NOI18N
        pnlViajesIniciados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblViajeIniciados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "ORIGEN", "DESTINO", "HORA/INICIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblViajeIniciados.setAltoHead(20);
        tblViajeIniciados.setColorBackgoundHead(new java.awt.Color(0, 26, 41));
        tblViajeIniciados.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblViajeIniciados.setColorFilasForeground1(new java.awt.Color(0, 26, 41));
        tblViajeIniciados.setColorFilasForeground2(new java.awt.Color(0, 26, 41));
        tblViajeIniciados.setColorSelBackgound(new java.awt.Color(0, 26, 41));
        tblViajeIniciados.setName(""); // NOI18N
        tblViajeIniciados.setShowHorizontalLines(false);
        tblViajeIniciados.setShowVerticalLines(false);
        tblViajeIniciados.setSurrendersFocusOnKeystroke(true);
        scrollViajesIniciados.setViewportView(tblViajeIniciados);
        if (tblViajeIniciados.getColumnModel().getColumnCount() > 0) {
            tblViajeIniciados.getColumnModel().getColumn(0).setMinWidth(50);
            tblViajeIniciados.getColumnModel().getColumn(0).setMaxWidth(50);
            tblViajeIniciados.getColumnModel().getColumn(1).setMinWidth(440);
            tblViajeIniciados.getColumnModel().getColumn(1).setMaxWidth(440);
            tblViajeIniciados.getColumnModel().getColumn(2).setMinWidth(440);
            tblViajeIniciados.getColumnModel().getColumn(2).setMaxWidth(440);
            tblViajeIniciados.getColumnModel().getColumn(3).setMinWidth(150);
            tblViajeIniciados.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        pnlViajesIniciados.add(scrollViajesIniciados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1090, 540));

        btnBuscarCodigoViaje.setBackground(new java.awt.Color(0, 26, 41));
        btnBuscarCodigoViaje.setText("BUSCAR");
        btnBuscarCodigoViaje.setColorHover(new java.awt.Color(48, 227, 202));
        btnBuscarCodigoViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCodigoViajeActionPerformed(evt);
            }
        });
        pnlViajesIniciados.add(btnBuscarCodigoViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 120, 30));

        btnTerminado.setBackground(new java.awt.Color(0, 26, 41));
        btnTerminado.setText("MARCAR VIAJE");
        btnTerminado.setColorHover(new java.awt.Color(48, 227, 202));
        btnTerminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminadoActionPerformed(evt);
            }
        });
        pnlViajesIniciados.add(btnTerminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 160, 30));

        txtCodigoViaje.setForeground(new java.awt.Color(64, 81, 78));
        txtCodigoViaje.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtCodigoViaje.setBotonColor(new java.awt.Color(64, 81, 78));
        txtCodigoViaje.setPlaceholder("INGRESE CODIGO");
        txtCodigoViaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoViajeKeyTyped(evt);
            }
        });
        pnlViajesIniciados.add(txtCodigoViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 140, 40));

        lblActualizarListaViajeIniciados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblActualizarListaViajeIniciados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/update1.png"))); // NOI18N
        lblActualizarListaViajeIniciados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarListaViajeIniciadosMouseClicked(evt);
            }
        });
        pnlViajesIniciados.add(lblActualizarListaViajeIniciados, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 60, 40));

        comboMarcarViaje.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECCIONAR", "TERMINADO", "INCONCLUSO" }));
        comboMarcarViaje.setColorArrow(new java.awt.Color(0, 26, 41));
        comboMarcarViaje.setColorBorde(new java.awt.Color(0, 26, 41));
        comboMarcarViaje.setColorFondo(new java.awt.Color(0, 26, 41));
        comboMarcarViaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pnlViajesIniciados.add(comboMarcarViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, 160, 30));

        pnlSliderViajeContenido.add(pnlViajesIniciados, "card2");

        pnlViaje.add(pnlSliderViajeContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1120, 630));

        pnlSliderContenido.add(pnlViaje, "card2");

        pnlTaxi.setBackground(new java.awt.Color(255, 255, 255));
        pnlTaxi.setName("pnlTaxi"); // NOI18N
        pnlTaxi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDatosTaxi.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatosTaxi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDatosPersonales.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatosPersonales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDatosPesonalesChofer.setBackground(new java.awt.Color(255, 255, 255));
        lblDatosPesonalesChofer.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblDatosPesonalesChofer.setForeground(new java.awt.Color(0, 26, 41));
        lblDatosPesonalesChofer.setText("DATOS PERSONALES");
        lblDatosPesonalesChofer.setOpaque(true);
        pnlDatosPersonales.add(lblDatosPesonalesChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        lblNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 26, 41));
        lblNombre.setText("Nombre:");
        lblNombre.setOpaque(true);
        pnlDatosPersonales.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 90, 30));

        lblApellido.setBackground(new java.awt.Color(255, 255, 255));
        lblApellido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(0, 26, 41));
        lblApellido.setText("Apellidos:");
        lblApellido.setOpaque(true);
        pnlDatosPersonales.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 90, 30));

        lblDNI.setBackground(new java.awt.Color(255, 255, 255));
        lblDNI.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(0, 26, 41));
        lblDNI.setText("D.N.I.:");
        lblDNI.setOpaque(true);
        pnlDatosPersonales.add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 50, 30));

        lblCelular.setBackground(new java.awt.Color(255, 255, 255));
        lblCelular.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(0, 26, 41));
        lblCelular.setText("Cel.:");
        lblCelular.setOpaque(true);
        pnlDatosPersonales.add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 40, 30));

        lblLicenciaConducir.setBackground(new java.awt.Color(255, 255, 255));
        lblLicenciaConducir.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblLicenciaConducir.setForeground(new java.awt.Color(0, 26, 41));
        lblLicenciaConducir.setText("LICENCIA DE CONDUCIR");
        lblLicenciaConducir.setOpaque(true);
        pnlDatosPersonales.add(lblLicenciaConducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 210, 30));

        lblFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaNacimiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblFechaNacimiento.setForeground(new java.awt.Color(0, 26, 41));
        lblFechaNacimiento.setText("Fecha nac.:");
        lblFechaNacimiento.setOpaque(true);
        pnlDatosPersonales.add(lblFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 90, 30));

        lblCategoria.setBackground(new java.awt.Color(255, 255, 255));
        lblCategoria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 26, 41));
        lblCategoria.setText("Categoria:");
        lblCategoria.setOpaque(true);
        pnlDatosPersonales.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 90, 30));

        lblFechaVencimiento.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaVencimiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblFechaVencimiento.setForeground(new java.awt.Color(0, 26, 41));
        lblFechaVencimiento.setText("Fecha venc.:");
        lblFechaVencimiento.setOpaque(true);
        pnlDatosPersonales.add(lblFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 100, 30));

        lblFotoChofer.setBackground(new java.awt.Color(204, 204, 204));
        lblFotoChofer.setForeground(new java.awt.Color(255, 255, 255));
        lblFotoChofer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoChofer.setName(""); // NOI18N
        lblFotoChofer.setOpaque(true);
        pnlDatosPersonales.add(lblFotoChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 140, 140));

        txtNombreConductor.setForeground(new java.awt.Color(64, 81, 78));
        txtNombreConductor.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtNombreConductor.setBotonColor(new java.awt.Color(64, 81, 78));
        txtNombreConductor.setPlaceholder("");
        txtNombreConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreConductorKeyTyped(evt);
            }
        });
        pnlDatosPersonales.add(txtNombreConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, 40));

        txtApellidoConductor.setForeground(new java.awt.Color(64, 81, 78));
        txtApellidoConductor.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtApellidoConductor.setBotonColor(new java.awt.Color(64, 81, 78));
        txtApellidoConductor.setPlaceholder("");
        txtApellidoConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoConductorKeyTyped(evt);
            }
        });
        pnlDatosPersonales.add(txtApellidoConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 180, 40));

        txtDNIConductor.setForeground(new java.awt.Color(64, 81, 78));
        txtDNIConductor.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtDNIConductor.setBotonColor(new java.awt.Color(64, 81, 78));
        txtDNIConductor.setPlaceholder("");
        txtDNIConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIConductorKeyTyped(evt);
            }
        });
        pnlDatosPersonales.add(txtDNIConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 120, 40));

        txtCelularConductor.setForeground(new java.awt.Color(64, 81, 78));
        txtCelularConductor.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtCelularConductor.setBotonColor(new java.awt.Color(64, 81, 78));
        txtCelularConductor.setPlaceholder("");
        txtCelularConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularConductorKeyTyped(evt);
            }
        });
        pnlDatosPersonales.add(txtCelularConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 120, -1));

        btnsubirFotoChofer.setBackground(new java.awt.Color(0, 26, 41));
        btnsubirFotoChofer.setText("Subir foto");
        btnsubirFotoChofer.setColorHover(new java.awt.Color(48, 227, 202));
        btnsubirFotoChofer.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btnsubirFotoChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubirFotoChoferActionPerformed(evt);
            }
        });
        pnlDatosPersonales.add(btnsubirFotoChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 120, 20));
        pnlDatosPersonales.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 450, 10));
        pnlDatosPersonales.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 450, 10));

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "A-IIa", "A-IIb", "A-IIIa", "A-IIIb", "A-IIIc" }));
        comboCategoria.setColorArrow(new java.awt.Color(0, 26, 41));
        comboCategoria.setColorBorde(new java.awt.Color(0, 26, 41));
        comboCategoria.setColorFondo(new java.awt.Color(0, 26, 41));
        comboCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pnlDatosPersonales.add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 110, 30));

        dateFechaVencimientoLicencia.setBackground(new java.awt.Color(0, 26, 41));
        dateFechaVencimientoLicencia.setForeground(new java.awt.Color(0, 26, 41));
        dateFechaVencimientoLicencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pnlDatosPersonales.add(dateFechaVencimientoLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 130, 20));

        dateFechaNacimiento.setBackground(new java.awt.Color(0, 26, 41));
        dateFechaNacimiento.setForeground(new java.awt.Color(0, 26, 41));
        dateFechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pnlDatosPersonales.add(dateFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 130, 20));

        pnlDatosTaxi.add(pnlDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 600, 220));

        pnlDatosVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatosVehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblModelo.setBackground(new java.awt.Color(255, 255, 255));
        lblModelo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(0, 26, 41));
        lblModelo.setText("Modelo:");
        lblModelo.setOpaque(true);
        pnlDatosVehiculo.add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 30));

        lblMarca.setBackground(new java.awt.Color(255, 255, 255));
        lblMarca.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(0, 26, 41));
        lblMarca.setText("Marca:");
        lblMarca.setOpaque(true);
        pnlDatosVehiculo.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 30));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 26, 41));
        jLabel33.setText("Compañia:");
        jLabel33.setOpaque(true);
        pnlDatosVehiculo.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 90, 30));

        lblPlaca.setBackground(new java.awt.Color(255, 255, 255));
        lblPlaca.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(0, 26, 41));
        lblPlaca.setText("Placa:");
        lblPlaca.setOpaque(true);
        pnlDatosVehiculo.add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, 30));

        lblFechaVencimientoSeguroT.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaVencimientoSeguroT.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblFechaVencimientoSeguroT.setForeground(new java.awt.Color(0, 26, 41));
        lblFechaVencimientoSeguroT.setText("Fecha venc.:");
        lblFechaVencimientoSeguroT.setOpaque(true);
        pnlDatosVehiculo.add(lblFechaVencimientoSeguroT, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 100, 30));

        lblDatosVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        lblDatosVehiculo.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblDatosVehiculo.setForeground(new java.awt.Color(0, 26, 41));
        lblDatosVehiculo.setText("DATOS DEL VEHICULO");
        lblDatosVehiculo.setOpaque(true);
        pnlDatosVehiculo.add(lblDatosVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 30));

        lblFotoVehiculo.setBackground(new java.awt.Color(204, 204, 204));
        lblFotoVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        lblFotoVehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFotoVehiculo.setOpaque(true);
        pnlDatosVehiculo.add(lblFotoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 350, 190));

        lblSOAT.setBackground(new java.awt.Color(255, 255, 255));
        lblSOAT.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblSOAT.setForeground(new java.awt.Color(0, 26, 41));
        lblSOAT.setText("ASEGURADORA");
        lblSOAT.setOpaque(true);
        pnlDatosVehiculo.add(lblSOAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, 30));

        lblTipoSeguro.setBackground(new java.awt.Color(255, 255, 255));
        lblTipoSeguro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblTipoSeguro.setForeground(new java.awt.Color(0, 26, 41));
        lblTipoSeguro.setText("Tipo seguro:");
        lblTipoSeguro.setOpaque(true);
        pnlDatosVehiculo.add(lblTipoSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, 30));

        lblAseguradoraNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblAseguradoraNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblAseguradoraNombre.setForeground(new java.awt.Color(0, 26, 41));
        lblAseguradoraNombre.setText("Nombre:");
        lblAseguradoraNombre.setOpaque(true);
        pnlDatosVehiculo.add(lblAseguradoraNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, 30));

        txtMarca.setForeground(new java.awt.Color(64, 81, 78));
        txtMarca.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtMarca.setBotonColor(new java.awt.Color(64, 81, 78));
        txtMarca.setPlaceholder("");
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });
        pnlDatosVehiculo.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 150, 40));

        txtModelo.setForeground(new java.awt.Color(64, 81, 78));
        txtModelo.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtModelo.setBotonColor(new java.awt.Color(64, 81, 78));
        txtModelo.setPlaceholder("");
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });
        pnlDatosVehiculo.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 150, 40));

        txtPlaca.setForeground(new java.awt.Color(64, 81, 78));
        txtPlaca.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtPlaca.setBotonColor(new java.awt.Color(64, 81, 78));
        txtPlaca.setPlaceholder("");
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });
        pnlDatosVehiculo.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, 40));

        btnSubirFotoVehiculo.setBackground(new java.awt.Color(0, 26, 41));
        btnSubirFotoVehiculo.setText("Subir foto");
        btnSubirFotoVehiculo.setColorHover(new java.awt.Color(48, 227, 202));
        btnSubirFotoVehiculo.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btnSubirFotoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirFotoVehiculoActionPerformed(evt);
            }
        });
        pnlDatosVehiculo.add(btnSubirFotoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 120, 20));

        dateFechaVencimientoSeguro.setBackground(new java.awt.Color(0, 26, 41));
        dateFechaVencimientoSeguro.setForeground(new java.awt.Color(0, 26, 41));
        dateFechaVencimientoSeguro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pnlDatosVehiculo.add(dateFechaVencimientoSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 130, 20));
        pnlDatosVehiculo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 240, 10));

        comboAseguradora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "RIMAC", "MAPFRE", "PACIFICO", "PROTECTA SECURITY", "LA POSITIVA", "CRECER SEGUROS", "HDI SEGUROS" }));
        comboAseguradora.setColorArrow(new java.awt.Color(0, 26, 41));
        comboAseguradora.setColorBorde(new java.awt.Color(0, 26, 41));
        comboAseguradora.setColorFondo(new java.awt.Color(0, 26, 41));
        comboAseguradora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pnlDatosVehiculo.add(comboAseguradora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 190, 30));

        comboTipoSeguro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "SOAT", "VEHICULAR" }));
        comboTipoSeguro.setColorArrow(new java.awt.Color(0, 26, 41));
        comboTipoSeguro.setColorBorde(new java.awt.Color(0, 26, 41));
        comboTipoSeguro.setColorFondo(new java.awt.Color(0, 26, 41));
        comboTipoSeguro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pnlDatosVehiculo.add(comboTipoSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 190, 30));

        pnlDatosTaxi.add(pnlDatosVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 610, 280));
        pnlDatosTaxi.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 590, 10));

        lblCodigoConductor.setBackground(new java.awt.Color(255, 255, 255));
        lblCodigoConductor.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblCodigoConductor.setForeground(new java.awt.Color(0, 26, 41));
        lblCodigoConductor.setText("CODIGO: ");
        lblCodigoConductor.setOpaque(true);
        pnlDatosTaxi.add(lblCodigoConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 80, 30));

        txtCtaBancaria.setForeground(new java.awt.Color(64, 81, 78));
        txtCtaBancaria.setBordeColorFocus(new java.awt.Color(0, 26, 41));
        txtCtaBancaria.setBotonColor(new java.awt.Color(64, 81, 78));
        txtCtaBancaria.setPlaceholder("");
        txtCtaBancaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCtaBancariaKeyTyped(evt);
            }
        });
        pnlDatosTaxi.add(txtCtaBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 190, 40));

        btnResetearCampos.setBackground(new java.awt.Color(48, 227, 202));
        btnResetearCampos.setText("RESETEAR CAMPOS");
        btnResetearCampos.setColorHover(new java.awt.Color(48, 227, 202));
        btnResetearCampos.setColorText(new java.awt.Color(0, 26, 41));
        btnResetearCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetearCamposActionPerformed(evt);
            }
        });
        pnlDatosTaxi.add(btnResetearCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 170, 30));

        btnRegistrarNuevo.setBackground(new java.awt.Color(48, 227, 202));
        btnRegistrarNuevo.setText("REGISTRAR NUEVO");
        btnRegistrarNuevo.setColorHover(new java.awt.Color(48, 227, 202));
        btnRegistrarNuevo.setColorText(new java.awt.Color(0, 26, 41));
        btnRegistrarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevoActionPerformed(evt);
            }
        });
        pnlDatosTaxi.add(btnRegistrarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, 170, 30));

        btnActualizar.setBackground(new java.awt.Color(48, 227, 202));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setColorHover(new java.awt.Color(48, 227, 202));
        btnActualizar.setColorText(new java.awt.Color(0, 26, 41));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        pnlDatosTaxi.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 160, 30));

        lblCtaBancaria.setBackground(new java.awt.Color(255, 255, 255));
        lblCtaBancaria.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblCtaBancaria.setForeground(new java.awt.Color(0, 26, 41));
        lblCtaBancaria.setText("CTA. BANCARIA:");
        lblCtaBancaria.setOpaque(true);
        pnlDatosTaxi.add(lblCtaBancaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 140, 30));

        lblIdConductor.setBackground(new java.awt.Color(255, 255, 255));
        lblIdConductor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblIdConductor.setForeground(new java.awt.Color(0, 26, 41));
        lblIdConductor.setOpaque(true);
        pnlDatosTaxi.add(lblIdConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 80, 30));

        pnlTaxi.add(pnlDatosTaxi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 610, 660));

        pnlListaTaxis.setBackground(new java.awt.Color(255, 255, 255));
        pnlListaTaxis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBusquedaConductor.setForeground(new java.awt.Color(64, 81, 78));
        txtBusquedaConductor.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtBusquedaConductor.setBotonColor(new java.awt.Color(64, 81, 78));
        txtBusquedaConductor.setPlaceholder("Buscar...");
        txtBusquedaConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaConductorActionPerformed(evt);
            }
        });
        txtBusquedaConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaConductorKeyTyped(evt);
            }
        });
        pnlListaTaxis.add(txtBusquedaConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 40));

        comoBusquedaConductor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Nombre", "Apellido", "D.N.I" }));
        comoBusquedaConductor.setColorArrow(new java.awt.Color(0, 26, 41));
        comoBusquedaConductor.setColorBorde(new java.awt.Color(0, 26, 41));
        comoBusquedaConductor.setColorFondo(new java.awt.Color(0, 26, 41));
        comoBusquedaConductor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comoBusquedaConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comoBusquedaConductorActionPerformed(evt);
            }
        });
        pnlListaTaxis.add(comoBusquedaConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 130, -1));

        btnBuscarTAXI.setBackground(new java.awt.Color(48, 227, 202));
        btnBuscarTAXI.setText("BUSCAR");
        btnBuscarTAXI.setColorHover(new java.awt.Color(48, 227, 202));
        btnBuscarTAXI.setColorText(new java.awt.Color(0, 26, 41));
        btnBuscarTAXI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTAXIActionPerformed(evt);
            }
        });
        pnlListaTaxis.add(btnBuscarTAXI, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 120, 30));

        lblListaTaxisTAXI.setBackground(new java.awt.Color(255, 255, 255));
        lblListaTaxisTAXI.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        lblListaTaxisTAXI.setForeground(new java.awt.Color(0, 26, 41));
        lblListaTaxisTAXI.setText("LISTA DE TAXIS");
        lblListaTaxisTAXI.setOpaque(true);
        pnlListaTaxis.add(lblListaTaxisTAXI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 30));

        tblListaConductoresRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRES", "APELLIDOS", "D.N.I."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaConductoresRegistrados.setAltoHead(20);
        tblListaConductoresRegistrados.setColorBackgoundHead(new java.awt.Color(0, 26, 41));
        tblListaConductoresRegistrados.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblListaConductoresRegistrados.setColorFilasForeground1(new java.awt.Color(0, 26, 41));
        tblListaConductoresRegistrados.setColorFilasForeground2(new java.awt.Color(0, 26, 41));
        tblListaConductoresRegistrados.setColorSelBackgound(new java.awt.Color(0, 26, 41));
        tblListaConductoresRegistrados.setName(""); // NOI18N
        tblListaConductoresRegistrados.setShowHorizontalLines(false);
        tblListaConductoresRegistrados.setShowVerticalLines(false);
        tblListaConductoresRegistrados.setSurrendersFocusOnKeystroke(true);
        tblListaConductoresRegistrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaConductoresRegistradosMouseClicked(evt);
            }
        });
        scrollListaTaxis.setViewportView(tblListaConductoresRegistrados);
        if (tblListaConductoresRegistrados.getColumnModel().getColumnCount() > 0) {
            tblListaConductoresRegistrados.getColumnModel().getColumn(0).setMinWidth(50);
            tblListaConductoresRegistrados.getColumnModel().getColumn(0).setMaxWidth(50);
            tblListaConductoresRegistrados.getColumnModel().getColumn(1).setMinWidth(100);
            tblListaConductoresRegistrados.getColumnModel().getColumn(1).setMaxWidth(100);
            tblListaConductoresRegistrados.getColumnModel().getColumn(2).setMinWidth(200);
            tblListaConductoresRegistrados.getColumnModel().getColumn(2).setMaxWidth(200);
            tblListaConductoresRegistrados.getColumnModel().getColumn(3).setMinWidth(100);
            tblListaConductoresRegistrados.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        pnlListaTaxis.add(scrollListaTaxis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 470, 490));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/update1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });
        pnlListaTaxis.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 40, 40));

        pnlTaxi.add(pnlListaTaxis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 670));

        pnlSliderContenido.add(pnlTaxi, "card3");

        pnlPago.setBackground(new java.awt.Color(255, 255, 255));
        pnlPago.setName("pnlPago"); // NOI18N
        pnlPago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblConductoresPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDOS", "DNI", " TOTAL S/."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConductoresPago.setAltoHead(20);
        tblConductoresPago.setColorBackgoundHead(new java.awt.Color(0, 26, 41));
        tblConductoresPago.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblConductoresPago.setColorFilasForeground1(new java.awt.Color(0, 26, 41));
        tblConductoresPago.setColorFilasForeground2(new java.awt.Color(0, 26, 41));
        tblConductoresPago.setColorSelBackgound(new java.awt.Color(0, 26, 41));
        tblConductoresPago.setName(""); // NOI18N
        tblConductoresPago.setShowHorizontalLines(false);
        tblConductoresPago.setShowVerticalLines(false);
        tblConductoresPago.setSurrendersFocusOnKeystroke(true);
        tblConductoresPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConductoresPagoMouseClicked(evt);
            }
        });
        tblConductoresPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblConductoresPagoKeyPressed(evt);
            }
        });
        scrollChoferes.setViewportView(tblConductoresPago);
        if (tblConductoresPago.getColumnModel().getColumnCount() > 0) {
            tblConductoresPago.getColumnModel().getColumn(0).setMinWidth(50);
            tblConductoresPago.getColumnModel().getColumn(0).setMaxWidth(50);
            tblConductoresPago.getColumnModel().getColumn(1).setMinWidth(150);
            tblConductoresPago.getColumnModel().getColumn(1).setMaxWidth(150);
            tblConductoresPago.getColumnModel().getColumn(2).setMinWidth(250);
            tblConductoresPago.getColumnModel().getColumn(2).setMaxWidth(250);
            tblConductoresPago.getColumnModel().getColumn(3).setMinWidth(125);
            tblConductoresPago.getColumnModel().getColumn(3).setMaxWidth(125);
            tblConductoresPago.getColumnModel().getColumn(4).setMinWidth(125);
            tblConductoresPago.getColumnModel().getColumn(4).setMaxWidth(125);
        }

        pnlPago.add(scrollChoferes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 700, 240));

        tblPagosPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "FECHA", "MON. S/."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPagosPendientes.setAltoHead(20);
        tblPagosPendientes.setColorBackgoundHead(new java.awt.Color(0, 26, 41));
        tblPagosPendientes.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tblPagosPendientes.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblPagosPendientes.setColorFilasForeground1(new java.awt.Color(0, 26, 41));
        tblPagosPendientes.setColorFilasForeground2(new java.awt.Color(0, 26, 41));
        tblPagosPendientes.setColorSelBackgound(new java.awt.Color(0, 26, 41));
        tblPagosPendientes.setName(""); // NOI18N
        tblPagosPendientes.setShowHorizontalLines(false);
        tblPagosPendientes.setShowVerticalLines(false);
        tblPagosPendientes.setSurrendersFocusOnKeystroke(true);
        scrollPagosPendientes.setViewportView(tblPagosPendientes);
        if (tblPagosPendientes.getColumnModel().getColumnCount() > 0) {
            tblPagosPendientes.getColumnModel().getColumn(0).setMinWidth(50);
            tblPagosPendientes.getColumnModel().getColumn(0).setMaxWidth(50);
            tblPagosPendientes.getColumnModel().getColumn(1).setMinWidth(100);
            tblPagosPendientes.getColumnModel().getColumn(1).setMaxWidth(100);
            tblPagosPendientes.getColumnModel().getColumn(2).setMinWidth(100);
            tblPagosPendientes.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        pnlPago.add(scrollPagosPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 270, 100));

        tblViajesRealizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "ORIGEN", "DESTINO", "FECHA", "MONTO S/."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblViajesRealizados.setAltoHead(20);
        tblViajesRealizados.setColorBackgoundHead(new java.awt.Color(0, 26, 41));
        tblViajesRealizados.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tblViajesRealizados.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblViajesRealizados.setColorFilasForeground1(new java.awt.Color(0, 26, 41));
        tblViajesRealizados.setColorFilasForeground2(new java.awt.Color(0, 26, 41));
        tblViajesRealizados.setColorSelBackgound(new java.awt.Color(0, 26, 41));
        tblViajesRealizados.setName(""); // NOI18N
        tblViajesRealizados.setShowHorizontalLines(false);
        tblViajesRealizados.setShowVerticalLines(false);
        tblViajesRealizados.setSurrendersFocusOnKeystroke(true);
        scrollViajesRealizados.setViewportView(tblViajesRealizados);
        if (tblViajesRealizados.getColumnModel().getColumnCount() > 0) {
            tblViajesRealizados.getColumnModel().getColumn(0).setMinWidth(50);
            tblViajesRealizados.getColumnModel().getColumn(0).setMaxWidth(50);
            tblViajesRealizados.getColumnModel().getColumn(1).setMinWidth(360);
            tblViajesRealizados.getColumnModel().getColumn(1).setMaxWidth(360);
            tblViajesRealizados.getColumnModel().getColumn(2).setMinWidth(360);
            tblViajesRealizados.getColumnModel().getColumn(2).setMaxWidth(360);
            tblViajesRealizados.getColumnModel().getColumn(3).setMinWidth(150);
            tblViajesRealizados.getColumnModel().getColumn(3).setMaxWidth(150);
            tblViajesRealizados.getColumnModel().getColumn(4).setMinWidth(150);
            tblViajesRealizados.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        pnlPago.add(scrollViajesRealizados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 1080, 160));

        tblHistorialPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "FECHA", "MON. S/."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHistorialPagos.setAltoHead(20);
        tblHistorialPagos.setColorBackgoundHead(new java.awt.Color(0, 26, 41));
        tblHistorialPagos.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tblHistorialPagos.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblHistorialPagos.setColorFilasForeground1(new java.awt.Color(0, 26, 41));
        tblHistorialPagos.setColorFilasForeground2(new java.awt.Color(0, 26, 41));
        tblHistorialPagos.setColorSelBackgound(new java.awt.Color(0, 26, 41));
        tblHistorialPagos.setName(""); // NOI18N
        tblHistorialPagos.setShowHorizontalLines(false);
        tblHistorialPagos.setShowVerticalLines(false);
        tblHistorialPagos.setSurrendersFocusOnKeystroke(true);
        scrollHistorialPagos.setViewportView(tblHistorialPagos);
        if (tblHistorialPagos.getColumnModel().getColumnCount() > 0) {
            tblHistorialPagos.getColumnModel().getColumn(0).setMinWidth(50);
            tblHistorialPagos.getColumnModel().getColumn(0).setMaxWidth(50);
            tblHistorialPagos.getColumnModel().getColumn(1).setMinWidth(100);
            tblHistorialPagos.getColumnModel().getColumn(1).setMaxWidth(100);
            tblHistorialPagos.getColumnModel().getColumn(2).setMinWidth(100);
            tblHistorialPagos.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        pnlPago.add(scrollHistorialPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 270, 160));

        lblPagosPendientes.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblPagosPendientes.setForeground(new java.awt.Color(0, 26, 41));
        lblPagosPendientes.setText("PAGOS PENDIENTES:");
        pnlPago.add(lblPagosPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 260, 30));

        lblChoferes.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblChoferes.setForeground(new java.awt.Color(0, 26, 41));
        lblChoferes.setText("CHOFERES");
        pnlPago.add(lblChoferes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        lblViajeRealizados.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblViajeRealizados.setForeground(new java.awt.Color(0, 26, 41));
        lblViajeRealizados.setText("VIAJE REALIZADOS POR:");
        pnlPago.add(lblViajeRealizados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 270, 30));

        lblHistorialPagos.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblHistorialPagos.setForeground(new java.awt.Color(0, 26, 41));
        lblHistorialPagos.setText("HISTORIAL PAGOS:");
        pnlPago.add(lblHistorialPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 260, 30));

        lblNameChofer2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblNameChofer2.setForeground(new java.awt.Color(0, 26, 41));
        pnlPago.add(lblNameChofer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 490, 30));

        lblNameChofer1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblNameChofer1.setForeground(new java.awt.Color(0, 26, 41));
        pnlPago.add(lblNameChofer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 30, 380, 30));

        lblChofer.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        lblChofer.setForeground(new java.awt.Color(0, 26, 41));
        lblChofer.setText("CHOFER");
        pnlPago.add(lblChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 100, 30));

        btnMostrarConductoreConPendientes.setBackground(new java.awt.Color(48, 227, 202));
        btnMostrarConductoreConPendientes.setText("CON PAGOS PENDIENTES");
        btnMostrarConductoreConPendientes.setColorHover(new java.awt.Color(48, 227, 202));
        btnMostrarConductoreConPendientes.setColorText(new java.awt.Color(0, 26, 41));
        btnMostrarConductoreConPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarConductoreConPendientesActionPerformed(evt);
            }
        });
        pnlPago.add(btnMostrarConductoreConPendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 220, 30));

        btnMarcarComoPendiente.setBackground(new java.awt.Color(48, 227, 202));
        btnMarcarComoPendiente.setText("MARCAR COMO PENDIENTE");
        btnMarcarComoPendiente.setColorHover(new java.awt.Color(48, 227, 202));
        btnMarcarComoPendiente.setColorText(new java.awt.Color(0, 26, 41));
        btnMarcarComoPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarComoPendienteActionPerformed(evt);
            }
        });
        pnlPago.add(btnMarcarComoPendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 220, 30));

        btnRegistrarPago.setBackground(new java.awt.Color(48, 227, 202));
        btnRegistrarPago.setText("REGISTRAR PAGO");
        btnRegistrarPago.setColorHover(new java.awt.Color(48, 227, 202));
        btnRegistrarPago.setColorText(new java.awt.Color(0, 26, 41));
        btnRegistrarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPagoActionPerformed(evt);
            }
        });
        pnlPago.add(btnRegistrarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 220, 30));

        btnRegistrarPendiente.setBackground(new java.awt.Color(48, 227, 202));
        btnRegistrarPendiente.setText("REGISTRAR PENDIENTE");
        btnRegistrarPendiente.setColorHover(new java.awt.Color(48, 227, 202));
        btnRegistrarPendiente.setColorText(new java.awt.Color(0, 26, 41));
        btnRegistrarPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPendienteActionPerformed(evt);
            }
        });
        pnlPago.add(btnRegistrarPendiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 200, 30));

        txtBusquedaConductor2.setForeground(new java.awt.Color(64, 81, 78));
        txtBusquedaConductor2.setBordeColorFocus(new java.awt.Color(48, 227, 202));
        txtBusquedaConductor2.setBotonColor(new java.awt.Color(64, 81, 78));
        txtBusquedaConductor2.setPlaceholder("Buscar...");
        txtBusquedaConductor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaConductor2ActionPerformed(evt);
            }
        });
        txtBusquedaConductor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaConductor2KeyTyped(evt);
            }
        });
        pnlPago.add(txtBusquedaConductor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 320, 40));

        comoBusquedaConductor2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Nombre", "Apellido", "DNI" }));
        comoBusquedaConductor2.setColorArrow(new java.awt.Color(0, 26, 41));
        comoBusquedaConductor2.setColorBorde(new java.awt.Color(0, 26, 41));
        comoBusquedaConductor2.setColorFondo(new java.awt.Color(0, 26, 41));
        comoBusquedaConductor2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pnlPago.add(comoBusquedaConductor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 140, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/update1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });
        pnlPago.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 50, 50));

        btnBuscarConductor.setBackground(new java.awt.Color(48, 227, 202));
        btnBuscarConductor.setText("BUSCAR");
        btnBuscarConductor.setColorHover(new java.awt.Color(48, 227, 202));
        btnBuscarConductor.setColorText(new java.awt.Color(0, 26, 41));
        btnBuscarConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConductorActionPerformed(evt);
            }
        });
        pnlPago.add(btnBuscarConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 150, 30));

        pnlSliderContenido.add(pnlPago, "card4");

        pnlContenido.add(pnlSliderContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1120, 680));

        pnlBase.add(pnlContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1120, 720));

        getContentPane().add(pnlBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnXActionPerformed
    private void barraTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraTituloMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_barraTituloMouseDragged
    private void barraTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraTituloMousePressed
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_barraTituloMousePressed
    private void barraBotonesIziquierdaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraBotonesIziquierdaMousePressed
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_barraBotonesIziquierdaMousePressed
    private void barraBotonesIziquierdaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraBotonesIziquierdaMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_barraBotonesIziquierdaMouseDragged
    private void btnNuevoViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoViajeActionPerformed
        if (!this.btnNuevoViaje.isSelected()) {
            this.btnNuevoViaje.setSelected(true);
            
            this.btnViajesIniciados.setSelected(false);
            this.pnlSliderViajeContenido.setPanelSlider(1, this.pnlNuevoViaje, RSPanelsSlider.DIRECT.DOWN);
        }
    }//GEN-LAST:event_btnNuevoViajeActionPerformed
    private void btnBuscarCodigoViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodigoViajeActionPerformed
        Viaje viaje=new Viaje();
        viaje.setId(Integer.parseInt(this.txtCodigoViaje.getText()));
        DAOViaje dao=new DAOViajeImpl();
        try{
            dao.setBuscarViajeIniciadoToTable(viaje, this.tblViajeIniciados);
        }catch (Exception ex) {
            System.out.println("ERROR: Boton buscarViaje");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarCodigoViajeActionPerformed
    private void btnViajesIniciadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajesIniciadosActionPerformed
        if (!this.btnViajesIniciados.isSelected()) {
            this.btnViajesIniciados.setSelected(true);
            
            this.btnNuevoViaje.setSelected(false);
            this.pnlSliderViajeContenido.setPanelSlider(1, this.pnlViajesIniciados, RSPanelsSlider.DIRECT.DOWN);
        }
    }//GEN-LAST:event_btnViajesIniciadosActionPerformed
    private void btnGoogleMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoogleMapActionPerformed
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop xd=java.awt.Desktop.getDesktop();
            
            if(xd.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri=new java.net.URI("https://www.google.com.pe/maps/dir///@-12.0630178,-77.0952795,12z/data=!4m2!4m1!3e0?hl=es-419");
                    xd.browse(uri);
                }catch (URISyntaxException | IOException ex) {
                    System.out.println(ex.getMessage());
                } 
            }
        }
    }//GEN-LAST:event_btnGoogleMapActionPerformed
    private void btnBuscarTaxiDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTaxiDisponibleActionPerformed
        Viaje v=new Viaje();
        v.setD_destino(this.txtConductorDestinoUltimoViaje.getText());
        Conductor c=new Conductor();
        c.setViaje(v);
        
        DAOConductor dao=new DAOConductorImpl();
        try{
            dao.setBusquedaConductoresDisponiblesToTable(c, this.tblTaxisDisponibles);
        }catch (Exception ex) {
            System.out.println("ERROR: Boton buscar Taxis Disponible x Ultimo viaje");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } 
        
    }//GEN-LAST:event_btnBuscarTaxiDisponibleActionPerformed
    private void btnBuscarCodigoEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodigoEmpresaActionPerformed
        if(!this.txtCodigoEmpresa.getText().equals("")){
            Empresa em=new Empresa();
            em.setId(Integer.parseInt(this.txtCodigoEmpresa.getText()));
            DAOCliente dao=new DAOClienteImpl();
            try{
                em=(Empresa)dao.getBuscarCliente(em, "1");
                this.txtEmailEmpresa.setText(em.getEmail());
                this.txtCelularEmpresa.setText(em.getCelular());
                this.txtRazonSocialEmpresa.setText(em.getRazon_social());
                this.txtRucEmpresa.setText(em.getRuc());
                System.out.println("EMPRESA OK");
            }catch (Exception ex) {
                System.out.println("ERROR: Boton: buscarEMPRESA");
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
        else{
            System.out.println("RELLENE CAMPOS");            
        }
    }//GEN-LAST:event_btnBuscarCodigoEmpresaActionPerformed
    private void txtBusquedaConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaConductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaConductorActionPerformed
    private void comoBusquedaConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comoBusquedaConductorActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_comoBusquedaConductorActionPerformed
    private void btnBuscarTAXIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTAXIActionPerformed
        DAOConductor dao=new DAOConductorImpl();
        Conductor conductor=new Conductor();

        if (this.comoBusquedaConductor.getSelectedIndex()==0) {
            conductor.setId(Integer.parseInt(this.txtBusquedaConductor.getText()));
            try {
                dao.setBusquedaConductoresToTable(conductor, this.tblListaConductoresRegistrados, "0");
            } catch (Exception ex) {
                System.out.println("ERROR: Buscar ID");
            }
        }
        else if(this.comoBusquedaConductor.getSelectedIndex()==1) {
            conductor.setNombre(this.txtBusquedaConductor.getText());
            try {
                dao.setBusquedaConductoresToTable(conductor, this.tblListaConductoresRegistrados, "1");
            } catch (Exception ex) {
                System.out.println("ERROR: Buscar NOMBRE");
            }
        }
        else if (this.comoBusquedaConductor.getSelectedIndex()==2) {
            conductor.setApellido(this.txtBusquedaConductor.getText());
            try {
                dao.setBusquedaConductoresToTable(conductor, this.tblListaConductoresRegistrados, "2");
            } catch (Exception ex) {
                System.out.println("ERROR: Buscar APELLIDO");
            }
        }
        else if(this.comoBusquedaConductor.getSelectedIndex()==3) {
            conductor.setDni(this.txtBusquedaConductor.getText());
            try {
                dao.setBusquedaConductoresToTable(conductor, this.tblListaConductoresRegistrados, "3");
            } catch (Exception ex) {
                System.out.println("ERROR: Buscar DNI");
            }
        }
    }//GEN-LAST:event_btnBuscarTAXIActionPerformed
    private void btnViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajeActionPerformed
        if (!this.btnViaje.isSelected()) {
            this.btnViaje.setSelected(true);
            
            this.btnTaxi.setSelected(false);
            this.btnPago.setSelected(false);
            this.pnlSliderContenido.setPanelSlider(1, this.pnlViaje, RSPanelsSlider.DIRECT.DOWN);
        }
    }//GEN-LAST:event_btnViajeActionPerformed
    private void btnsubirFotoChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubirFotoChoferActionPerformed
        Auxiliar m=new Auxiliar();
        imagenChofer=m.getConvertImagenToBytes(this.lblFotoChofer);  
    }//GEN-LAST:event_btnsubirFotoChoferActionPerformed
    private void btnSubirFotoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirFotoVehiculoActionPerformed
        Auxiliar m=new Auxiliar();
        imagenVehiculo=m.getConvertImagenToBytes(this.lblFotoVehiculo);
    }//GEN-LAST:event_btnSubirFotoVehiculoActionPerformed
    private void btnRegistrarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevoActionPerformed
        //Clase que contiene metodos auxiliares.
        Auxiliar m=new Auxiliar();
        
        Aseguradora aseguradora=new Aseguradora();
        aseguradora.setNombre((String)this.comboAseguradora.getSelectedItem());
        aseguradora.setTipo_seguro((String) this.comboTipoSeguro.getSelectedItem()); 
        aseguradora.setFecha_venc(m.getConvertDateUtilToDateSql(this.dateFechaVencimientoSeguro.getDate()));
               
        Vehiculo vehiculo=new Vehiculo();
        vehiculo.setModelo(this.txtModelo.getText());
        vehiculo.setMarca(this.txtMarca.getText());
        vehiculo.setPlaca(this.txtPlaca.getText());
        vehiculo.setFoto(imagenVehiculo);
        vehiculo.setAseguradora(aseguradora);
        
        Conductor conductor=new Conductor();
        conductor.setNombre(this.txtNombreConductor.getText());
        conductor.setApellido(this.txtApellidoConductor.getText());
        conductor.setDni(this.txtDNIConductor.getText());
        conductor.setFecha_nac(m.getConvertDateUtilToDateSql(this.dateFechaNacimiento.getDate()));
        conductor.setCelular(this.txtCelularConductor.getText());
        conductor.setFoto(imagenChofer);
        conductor.setCta_bancaria(this.txtCtaBancaria.getText());
        conductor.setLic_Categoria((String) this.comboCategoria.getSelectedItem());
        conductor.setLic_venc(m.getConvertDateUtilToDateSql(this.dateFechaVencimientoLicencia.getDate()));
        conductor.setVehiculo(vehiculo);
        
        if(m.getCamposLLenosRegistroConductor(conductor)){
            DAOConductor dao=new DAOConductorImpl();
            try{
                dao.setRegistrarConductor(conductor);
                System.out.println("SE REGISTRO EXITOSAMENTE");
                
                this.setResetCamposRegistroConductor();
                mensaje_registro_ok b=new mensaje_registro_ok();
                b.setVisible(true);
            }catch (Exception ex) {
                System.out.println("ERROR: boton --> Registrar");
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
        else{
            mensaje_rellene_campos x=new mensaje_rellene_campos();
            x.setVisible(true);
            System.out.println("RELLENE CAMPOS");
        }
        
    }//GEN-LAST:event_btnRegistrarNuevoActionPerformed
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //Clase que contiene metodos auxiliares.
        Auxiliar m=new Auxiliar();
        
        Aseguradora aseguradora=new Aseguradora();
        aseguradora.setNombre((String)this.comboAseguradora.getSelectedItem());
        aseguradora.setTipo_seguro((String) this.comboTipoSeguro.getSelectedItem()); 
        aseguradora.setFecha_venc(m.getConvertDateUtilToDateSql(this.dateFechaVencimientoSeguro.getDate()));
        
        Vehiculo vehiculo=new Vehiculo();
        vehiculo.setModelo(this.txtModelo.getText());
        vehiculo.setMarca(this.txtMarca.getText());
        vehiculo.setPlaca(this.txtPlaca.getText());
        vehiculo.setFoto(imagenVehiculo);
        vehiculo.setAseguradora(aseguradora);
                
        Conductor conductor=new Conductor();
        conductor.setId(Integer.parseInt(this.lblIdConductor.getText()));
        conductor.setNombre(this.txtNombreConductor.getText());
        conductor.setApellido(this.txtApellidoConductor.getText());
        conductor.setDni(this.txtDNIConductor.getText());
        conductor.setFecha_nac(m.getConvertDateUtilToDateSql(this.dateFechaNacimiento.getDate()));
        conductor.setCelular(this.txtCelularConductor.getText());
        conductor.setFoto(imagenChofer);
        conductor.setCta_bancaria(this.txtCtaBancaria.getText());
        conductor.setLic_Categoria((String) this.comboCategoria.getSelectedItem());
        conductor.setLic_venc(m.getConvertDateUtilToDateSql(this.dateFechaVencimientoLicencia.getDate()));
        conductor.setVehiculo(vehiculo);
        
        if(m.getCamposLLenosRegistroConductor(conductor)){
            DAOConductor dao=new DAOConductorImpl();
            try{
                dao.setUpdateConductor(conductor);
                System.out.println("SE ACTUALIZO EXITOSAMENTE");
                //Estableco la lista de conductores en mi "tabla"
                //dao.getTableConductores(this.tblListaTaxis);
                mensaje_actualizar_ok a=new mensaje_actualizar_ok();
                a.setVisible(true);
            }catch (Exception ex) {
                System.out.println("ERROR: boton --> Actualizar");
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
        else{
            System.out.println("RELLENE CAMPOS");
        }    
    }//GEN-LAST:event_btnActualizarActionPerformed
    private void btnResetearCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetearCamposActionPerformed
        this.setResetCamposRegistroConductor();
    }//GEN-LAST:event_btnResetearCamposActionPerformed
    private void btnTaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaxiActionPerformed
        if (!this.btnTaxi.isSelected()) {
            this.btnTaxi.setSelected(true);
            
            this.btnViaje.setSelected(false);
            this.btnPago.setSelected(false);
            this.pnlSliderContenido.setPanelSlider(1, this.pnlTaxi, RSPanelsSlider.DIRECT.DOWN);
        }
    }//GEN-LAST:event_btnTaxiActionPerformed
    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoActionPerformed
        if (!this.btnPago.isSelected()) {
            this.btnPago.setSelected(true);
            
            this.btnTaxi.setSelected(false);
            this.btnViaje.setSelected(false);
            this.pnlSliderContenido.setPanelSlider(1, this.pnlPago, RSPanelsSlider.DIRECT.DOWN);
        }
    }//GEN-LAST:event_btnPagoActionPerformed
    private void btnMostrarConductoreConPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarConductoreConPendientesActionPerformed
        DAOConductor dao=new DAOConductorImpl();
        try{
            dao.setTableConductoresPagoPendiente(this.tblConductoresPago);
        }catch (Exception ex) {
            System.out.println("NO CARGO CONDUCTORES PENDIENTES");
        }
    }//GEN-LAST:event_btnMostrarConductoreConPendientesActionPerformed
    private void btnSallirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSallirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSallirActionPerformed
    private void btnIniciarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarViajeActionPerformed
        if(this.txtOrigen.getText().equals("") || this.txtD_Origen.getText().equals("") ||
           this.txtDestino.getText().equals("") || this.txtD_Destino.getText().equals("") ||
           this.txtMontoViaje.getText().equals("")){
            mensaje_rellene_campos a=new mensaje_rellene_campos();
            a.setVisible(true);
        }
        else if(this.comboTipoCliente.getSelectedIndex()==0 && this.txtCodigoPersonaN.getText().equals("") ){
            mensaje_rellene_campos a=new mensaje_rellene_campos();
           a.setVisible(true);
        }
        else if(this.comboTipoCliente.getSelectedIndex()==1 && this.txtCodigoEmpresa.getText().equals("") ){
            mensaje_rellene_campos a=new mensaje_rellene_campos();
            a.setVisible(true);
        }
        else if(this.tblTaxisDisponibles.getSelectedRow()==-1) {
            System.out.println("no selecciono");
        }
        else{
            Viaje viaje = new Viaje();
            viaje.setOrigen(this.txtOrigen.getText());
            viaje.setD_origen(this.txtD_Origen.getText());
            viaje.setDestino(this.txtDestino.getText());
            viaje.setD_destino(this.txtD_Destino.getText());
            viaje.setMonto(Double.parseDouble(this.txtMontoViaje.getText()));

            Cliente cliente = new Cliente();
            if (this.txtCodigoEmpresa.getText().equals("") && !this.txtCodigoPersonaN.getText().equals("")) {
                cliente.setId(Integer.parseInt(this.txtCodigoPersonaN.getText()));
            } else if (!this.txtCodigoEmpresa.getText().equals("") && this.txtCodigoPersonaN.getText().equals("")) {
                cliente.setId(Integer.parseInt(this.txtCodigoEmpresa.getText()));
            }

            Usuario usuario = new Usuario();
            usuario.setId(Integer.parseInt(this.lbl_ID_USER.getText()));

            Conductor conductor = new Conductor();
            if (this.tblTaxisDisponibles.getSelectedRow()!=-1) {
                int conductorSeleccionado = this.tblTaxisDisponibles.getSelectedRow();
                conductor.setId((int) this.tblTaxisDisponibles.getValueAt(conductorSeleccionado, 0));
            }
            viaje.setCliente(cliente);
            viaje.setUsuario(usuario);
            viaje.setConductor(conductor);

            DAOViaje dao = new DAOViajeImpl();
            try {
                dao.setRegistrarViaje(viaje);
                this.txtNombrePersonaN.setText("");
                this.txtApellidoPersonaN.setText("");
                this.txtDNIpesonarN.setText("");
                this.txtEmailPersonaN.setText("");
                this.txtCodigoPersonaN.setText("");
                this.txtCelularPersonaN.setText("");
                
                this.txtRazonSocialEmpresa.setText("");
                this.txtEmailEmpresa.setText("");
                this.txtCelularEmpresa.setText("");
                this.txtRucEmpresa.setText("");
                this.txtCodigoEmpresa.setText("");
                
                this.txtOrigen.setText("");
                this.txtD_Origen.setText("");
                this.txtDestino.setText("");
                this.txtD_Destino.setText("");
                this.txtMontoViaje.setText("");
                
            } catch (Exception ex) {
                System.out.println("ERROR: Boton --> Iniciar Viaje");
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnIniciarViajeActionPerformed
    private void btnBuscarCodigoPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodigoPersonaActionPerformed
        if(!this.txtCodigoPersonaN.getText().equals("")){
            Persona pe=new Persona();
            pe.setId(Integer.parseInt(this.txtCodigoPersonaN.getText()));
            DAOCliente dao=new DAOClienteImpl();
            try{
                pe=(Persona)dao.getBuscarCliente(pe, "0");
                this.txtEmailPersonaN.setText(pe.getEmail());
                this.txtCelularPersonaN.setText(pe.getCelular());
                this.txtNombrePersonaN.setText(pe.getNombre());
                this.txtApellidoPersonaN.setText(pe.getApellido());
                this.txtDNIpesonarN.setText(pe.getDni());
                System.out.println("PERSONA OK");
            }catch (Exception ex) {
                System.out.println("ERROR: Boton: buscarPersona");
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
        else{
            System.out.println("RELLENE CAMPOS");            
        }        
    }//GEN-LAST:event_btnBuscarCodigoPersonaActionPerformed
    private void btnGenerarCodigoPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCodigoPersonaActionPerformed
        if(this.txtNombrePersonaN.getText().equals("") || this.txtApellidoPersonaN.getText().equals("") ||
           this.txtDNIpesonarN.getText().equals("") || this.txtCelularPersonaN.getText().equals("") ||
           this.txtEmailPersonaN.getText().equals("")){
            
            System.out.println("RELLENE CAMPOS");
            mensaje_rellene_campos c=new mensaje_rellene_campos();
            c.setVisible(true);
        }
        else{
            Persona persona=new Persona();
            persona.setNombre(this.txtNombrePersonaN.getText());
            persona.setApellido((this.txtApellidoPersonaN.getText()));
            persona.setDni(this.txtDNIpesonarN.getText());
            persona.setCelular(this.txtCelularPersonaN.getText());
            persona.setEmail(this.txtEmailPersonaN.getText());
            
            DAOPersona dao=new DAOPersonaImpl();
            try{
                dao.setRegistrarPersona(persona, "0");
                System.out.println("REGISTRO PERSONA");
                persona=dao.getBuscarPersonaDNI(persona);
                this.txtCodigoPersonaN.setText(String.valueOf(persona.getId_persona()));
                System.out.println("SE CONSULTO SU ID PERSONA");
            }catch (Exception ex) {
                System.out.println("ERROR: Boton generarCodigoPersona");
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnGenerarCodigoPersonaActionPerformed
    private void btnTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminadoActionPerformed
        Viaje viaje = new Viaje();
        //SELECCIONO EL "ID" DE LA FILA ESPECIFICA DE MI TABLA "this.tblViajeIniciados".
        if (this.tblViajeIniciados.getSelectedRow() != -1) {
            int viajeSeleccionado = this.tblViajeIniciados.getSelectedRow();
            viaje.setId((int) this.tblViajeIniciados.getValueAt(viajeSeleccionado, 0));  
            if (this.comboMarcarViaje.getSelectedIndex() == 1) {//MARCARCION COMO TERMINADO
                try {
                    DAOViaje dao=new DAOViajeImpl();
                    dao.setMarcarViajeIniciado(viaje, "1");
                    
                    frame_email xd=frame_email.getInstancia();
                    
                    Viaje v=dao.getDatosEmail(viaje);
                    xd.setLocationRelativeTo(null);
                    xd.txtClienteEmail.setText(v.getCliente().getEmail());
                    xd.txtEmailAsunto.setText("COMPROBANTE DE PAGO - EMPRESA DE TAXIS");
                    xd.txtEmailContenido.setText("ORIGEN        : "+ v.getOrigen()+", "+v.getD_origen()+"\n"
                                                +"DESTINO       : "+ v.getDestino()+", "+v.getD_destino()+"\n"
                                                +"MONTO         : S/."+ v.getMonto()+" NUEVOS SOLES\n"
                                                +"FECHA/HORA: "+ v.getFecha());                   
                    xd.setVisible(true);
                } catch (Exception ex) {
                    System.out.println("ERROR: BOTON FINALIZAR VIAJE 1");
                }
            }
            else if (this.comboMarcarViaje.getSelectedIndex() == 2) {//MARCARCION COMO INCONCLUSO
                try {
                    DAOViaje dao=new DAOViajeImpl();
                    dao.setMarcarViajeIniciado(viaje, "2");
                } catch (Exception ex) {
                    System.out.println("ERROR: BOTON FINALIZAR VIAJE 2");
                }
            }
            else if (this.comboMarcarViaje.getSelectedIndex() == 0) {//NO HASELECCIONADO UNA MARCACION
                mensaje_marcacion_invalida c=new mensaje_marcacion_invalida();
                c.setVisible(true);
            }
        }
        else  if(this.tblViajeIniciados.getSelectedRow()==-1){
            mensaje_selecione_viaje x=new mensaje_selecione_viaje();
            x.setVisible(true);
        }
    }//GEN-LAST:event_btnTerminadoActionPerformed
    private void btnMarcarComoPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarComoPendienteActionPerformed
        if (this.tblConductoresPago.getSelectedRow()!=-1) {
            int conductorSeleccionado = this.tblConductoresPago.getSelectedRow();
            Conductor co = new Conductor();
            co.setId((int) this.tblConductoresPago.getValueAt(conductorSeleccionado, 0));
            try {
                DAOPago dao = new DAOPagoImpl();
                dao.setPagoPendiente(co);
                mensaje_marcar_pago_pendiente b=new mensaje_marcar_pago_pendiente();
                b.setVisible(true);
            } catch (Exception ex) {
                System.out.println("ERROR: NO MARCO PAGO COMO PENDIENTE");
            }
        }
        else{
            mensaje_asignar_conductor a=new mensaje_asignar_conductor();
            a.setVisible(true);
        }      
    }//GEN-LAST:event_btnMarcarComoPendienteActionPerformed
    private void btnRegistrarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPagoActionPerformed
        if (this.tblConductoresPago.getSelectedRow()!=-1) {
            int conductorSeleccionado = this.tblConductoresPago.getSelectedRow();
            Conductor co = new Conductor();
            co.setId((int) this.tblConductoresPago.getValueAt(conductorSeleccionado, 0));
            try {
                DAOPago dao = new DAOPagoImpl();
                dao.setRegistrarPago(co);
                mensaje_registro_pago b=new mensaje_registro_pago();
                b.setVisible(true);
            } catch (Exception ex) {
                System.out.println("ERROR: NO REGISTRO PAGO");
            }
        }
        else{
            mensaje_asignar_conductor a=new mensaje_asignar_conductor();
            a.setVisible(true);
        }       
    }//GEN-LAST:event_btnRegistrarPagoActionPerformed
    private void btnRegistrarPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPendienteActionPerformed
        if (this.tblPagosPendientes.getSelectedRow()!=-1) {
            int pagoSeleccionado = this.tblPagosPendientes.getSelectedRow();
            int id_pago=(int) this.tblPagosPendientes.getValueAt(pagoSeleccionado, 0);
            
            Pago pa = new Pago();
            pa.setId(id_pago);
            try {
                DAOPago dao = new DAOPagoImpl();
                dao.setRegistrarPagoPendiente(pa);
                
            } catch (Exception ex) {
                System.out.println("ERROR: NO REGISTRO PAGO PENDIENTE");
            }
        }
        else{
            mensaje_seleccione_pago_pendiente a=new mensaje_seleccione_pago_pendiente();
            a.setVisible(true);
        }       
    }//GEN-LAST:event_btnRegistrarPendienteActionPerformed
    private void btnGenerarCodigoEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCodigoEmpresaActionPerformed
        if(this.txtRazonSocialEmpresa.getText().equals("") || this.txtRucEmpresa.getText().equals("") ||
           this.txtCelularEmpresa.getText().equals("") || this.txtEmailEmpresa.getText().equals("")){
            System.out.println("RELLENE CAMPOS");
        }
        else{
            Empresa empresa=new Empresa();
            empresa.setRazon_social(this.txtRazonSocialEmpresa.getText());
            empresa.setRuc(this.txtRucEmpresa.getText());
            empresa.setCelular(this.txtCelularEmpresa.getText());
            empresa.setEmail(this.txtEmailEmpresa.getText());
            DAOEmpresa dao=new DAOEmpresaImpl(); 
            
            try{
                dao.setRegistrarEmpresa(empresa, "1");
                System.out.println("REGISTRO EMPRESA");
                empresa=dao.getBuscarEmpresaRuc(empresa);
                this.txtCodigoEmpresa.setText(String.valueOf(empresa.getId_empresa()));
                System.out.println("SE CONSULTO SU ID EMPRESA");
            }catch (Exception ex) {
                System.out.println("ERROR: Boton generarCodigoEmpresa");
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnGenerarCodigoEmpresaActionPerformed
    private void txtBusquedaConductor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaConductor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaConductor2ActionPerformed
    private void txtDNIpesonarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIpesonarNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIpesonarNActionPerformed
    private void comboTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoClienteActionPerformed
    private void comboTipoClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoClienteItemStateChanged
        String tipoCliente=(String)this.comboTipoCliente.getSelectedItem();
        if(tipoCliente.equals("Persona natural")){
            this.pnlSliderDatosCliente.setPanelSlider(1, this.pnlPersonaNatutal, RSPanelsSlider.DIRECT.DOWN);
        }
        else if(tipoCliente.equals("Empresa")){
            this.pnlSliderDatosCliente.setPanelSlider(1, this.pnlEmpresa, RSPanelsSlider.DIRECT.DOWN);
        }
    }//GEN-LAST:event_comboTipoClienteItemStateChanged
    private void tblListaConductoresRegistradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaConductoresRegistradosMouseClicked
                          //Obtengo el "numero se fila" donde hago click
        int seleccion=this.tblListaConductoresRegistrados.rowAtPoint(evt.getPoint());
                                                 //(fila, columna)
        int id=(int)(this.tblListaConductoresRegistrados.getValueAt(seleccion, 0));
        Conductor conductor=new Conductor();
        conductor.setId(id);
        
        try{
            DAOConductor dao=new DAOConductorImpl();
            Conductor co=dao.getDetalleConductor(conductor);
            this.lblIdConductor.setText(String.valueOf(co.getId()));
            this.txtNombreConductor.setText(co.getNombre());
            this.txtApellidoConductor.setText(co.getApellido());
            this.txtDNIConductor.setText(co.getDni());
            this.txtCelularConductor.setText(co.getCelular());
            this.txtCtaBancaria.setText(co.getCta_bancaria());
            this.dateFechaNacimiento.setDate(co.getFecha_nac());
            //Estableciendo imagen del "chofer"
            this.imagenChofer=co.getFoto();
            ImageIcon imagen1=new ImageIcon(this.imagenChofer);
            Icon icono1=new ImageIcon(imagen1.getImage().getScaledInstance(this.lblFotoChofer.getWidth(), this.lblFotoChofer.getHeight(), Image.SCALE_DEFAULT));
            this.lblFotoChofer.setIcon(icono1);   
            
            //Estableciendo categoria en el "comboBox"
            for (int i = 0; i < 6; i++) {
                if(co.getLic_Categoria().equalsIgnoreCase((String)this.comboCategoria.getItemAt(i))){
                    this.comboCategoria.setSelectedIndex(i);
                }
            }
            this.dateFechaVencimientoLicencia.setDate(co.getLic_venc());
            this.txtMarca.setText(co.getVehiculo().getMarca());
            this.txtModelo.setText(co.getVehiculo().getModelo());
            this.txtPlaca.setText(co.getVehiculo().getPlaca());
            //Establecer imagen del "vehiculo"
            this.imagenVehiculo=co.getVehiculo().getFoto();
            ImageIcon imagen2=new ImageIcon(this.imagenVehiculo);
            Icon icono3=new ImageIcon(imagen2.getImage().getScaledInstance(this.lblFotoVehiculo.getWidth(), this.lblFotoVehiculo.getHeight(), Image.SCALE_DEFAULT));
            this.lblFotoVehiculo.setIcon(icono3); 
            //Estableciendo nombre de la aseguradora en el "comboBox"
            for (int i = 0; i < 9; i++) {
                if(co.getVehiculo().getAseguradora().getNombre().equalsIgnoreCase((String) this.comboAseguradora.getItemAt(i))){
                    this.comboAseguradora.setSelectedIndex(i);
                }
            }  
            //Establecer tipo de seguro en el "comboBox"
            for (int i = 0; i < 3; i++) {
                if (co.getVehiculo().getAseguradora().getTipo_seguro().equalsIgnoreCase((String) this.comboTipoSeguro.getItemAt(i))) {
                    this.comboTipoSeguro.setSelectedIndex(i);
                }
            }
            this.dateFechaVencimientoSeguro.setDate(co.getVehiculo().getAseguradora().getFecha_venc());  
        }catch (Exception ex) {
            System.out.println("ERROR: Seleccion del registro de la tabla de conductores");
        }
        
    }//GEN-LAST:event_tblListaConductoresRegistradosMouseClicked
    private void txtBusquedaConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaConductorKeyTyped
        Auxiliar m=new Auxiliar();
        if(this.comoBusquedaConductor.getSelectedIndex()==0){
            m.setCantidadTipoCharacter(this.txtBusquedaConductor, 10, false, evt);
        }
        if(this.comoBusquedaConductor.getSelectedIndex()==1){
            m.setCantidadTipoCharacter(this.txtBusquedaConductor, 10, true, evt);
        }
        if(this.comoBusquedaConductor.getSelectedIndex()==2){
            m.setCantidadTipoCharacter(this.txtBusquedaConductor, 10, true, evt);
        }
        if(this.comoBusquedaConductor.getSelectedIndex()==3){
            m.setCantidadTipoCharacter(this.txtBusquedaConductor, 10, false, evt);
        }
    }//GEN-LAST:event_txtBusquedaConductorKeyTyped
    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
        
    }//GEN-LAST:event_jLabel1KeyPressed
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        DAOConductor dao=new DAOConductorImpl();
        try{
            dao.getTableConductores(this.tblListaConductoresRegistrados);
            System.out.println("OK");
        }catch (Exception ex) {
            
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnResetCamposClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCamposClienteActionPerformed
        this.txtApellidoPersonaN.setText("");
        this.txtNombrePersonaN.setText("");
        this.txtDNIpesonarN.setText("");
        this.txtCodigoPersonaN.setText("");
        this.txtCelularPersonaN.setText("");
        this.txtCelularEmpresa.setText("");
        this.txtCodigoEmpresa.setText("");
        this.txtRucEmpresa.setText("");
        this.txtRazonSocialEmpresa.setText("");
        this.txtEmailPersonaN.setText("");
        this.txtEmailEmpresa.setText("");
    }//GEN-LAST:event_btnResetCamposClienteActionPerformed

    private void btnNuevosConductoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevosConductoresActionPerformed
        DAOConductor dao=new DAOConductorImpl();
        try{
            dao.setConductoresNuevosToTable(this.tblTaxisDisponibles);
        }catch (Exception ex) {
            System.out.println("ERROR: Boton: Mostrar nuevos conductores");
        }
    }//GEN-LAST:event_btnNuevosConductoresActionPerformed

    private void lblActualizarListaViajeIniciadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarListaViajeIniciadosMouseClicked
        DAOViaje dao=new DAOViajeImpl();
     
        try{
            dao.setViajeIniciadosToTable(this.tblViajeIniciados);
            System.out.println("ok");
        }catch (Exception ex) {
            System.out.println("ERROR: Boton actualizar viaje iniciados.");
        }
    }//GEN-LAST:event_lblActualizarListaViajeIniciadosMouseClicked

    private void tblConductoresPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblConductoresPagoKeyPressed
        
    }//GEN-LAST:event_tblConductoresPagoKeyPressed

    private void tblConductoresPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConductoresPagoMouseClicked
                           //Obtengo el "numero se fila" donde hago click
        int seleccion=this.tblConductoresPago.rowAtPoint(evt.getPoint());
                                                      //(fila, columna)
        int id=(int)(this.tblConductoresPago.getValueAt(seleccion, 0));
        Conductor co=new Conductor();
        co.setId(id);
        try{
            DAOPago dao=new DAOPagoImpl();
            dao.setTableHistorialPago(this.tblHistorialPagos, co);
            dao.setTablePagosPendientes(this.tblPagosPendientes, co);
            DAOViaje dao1=new DAOViajeImpl();
            dao1.setTableViajesRealizadosConductor(this.tblViajesRealizados, co); 
            DAOConductor dao2=new DAOConductorImpl();
            Conductor c=dao2.getNombreConductor(co);
            this.lblNameChofer1.setText(c.getNombre()+", "+c.getApellido());
            this.lblNameChofer2.setText(c.getNombre()+", "+c.getApellido());
        }catch (Exception ex) {
            System.out.println("NO CARGO TABLA");
        }
    }//GEN-LAST:event_tblConductoresPagoMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        DAOConductor dao=new DAOConductorImpl();
        try{
            dao.setConductoresPagoToTable(this.tblConductoresPago);
        }catch (Exception ex) {
            System.out.println("NO CARGO TABLA DE CONDUCTORES CON SUS PAGOS");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2KeyPressed

    private void btnBuscarConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConductorActionPerformed
        DAOConductor dao=new DAOConductorImpl();
        Conductor conductor=new Conductor();

        if (this.comoBusquedaConductor2.getSelectedIndex()==0) {
            conductor.setId(Integer.parseInt(this.txtBusquedaConductor2.getText()));
            try {
                dao.setTableBusquedaConductorConPago(conductor, this.tblConductoresPago, "0");
            } catch (Exception ex) {
                System.out.println("ERROR: Buscar ID");
            }
        }
        else if(this.comoBusquedaConductor2.getSelectedIndex()==1) {
            conductor.setNombre(this.txtBusquedaConductor2.getText());
            try {
                dao.setTableBusquedaConductorConPago(conductor, this.tblConductoresPago, "1");
            } catch (Exception ex) {
                System.out.println("ERROR: Buscar NOMBRE");
            }
        }
        else if (this.comoBusquedaConductor2.getSelectedIndex()==2) {
            conductor.setApellido(this.txtBusquedaConductor2.getText());
            try {
                dao.setTableBusquedaConductorConPago(conductor, this.tblConductoresPago, "2");
            } catch (Exception ex) {
                System.out.println("ERROR: Buscar APELLIDO");
            }
        }
        else if(this.comoBusquedaConductor2.getSelectedIndex()==3) {
            conductor.setDni(this.txtBusquedaConductor2.getText());
            try {
                dao.setTableBusquedaConductorConPago(conductor, this.tblConductoresPago, "3");
            } catch (Exception ex) {
                System.out.println("ERROR: Buscar DNI");
            }
        }
    }//GEN-LAST:event_btnBuscarConductorActionPerformed

    private void txtNombreConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreConductorKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtNombreConductor, 15, true, evt);
    }//GEN-LAST:event_txtNombreConductorKeyTyped

    private void txtApellidoConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoConductorKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtApellidoConductor, 15, true, evt);
    }//GEN-LAST:event_txtApellidoConductorKeyTyped

    private void txtDNIConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIConductorKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtDNIConductor, 8, false, evt);
    }//GEN-LAST:event_txtDNIConductorKeyTyped

    private void txtCelularConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularConductorKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtCelularConductor, 9, false, evt);
    }//GEN-LAST:event_txtCelularConductorKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtMarca, 12, true, evt);
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtModelo, 12);
    }//GEN-LAST:event_txtModeloKeyTyped

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtPlaca, 6);
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtCtaBancariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCtaBancariaKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtCtaBancaria, 11);
    }//GEN-LAST:event_txtCtaBancariaKeyTyped

    private void txtNombrePersonaNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePersonaNKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtNombrePersonaN, 15, true, evt);
    }//GEN-LAST:event_txtNombrePersonaNKeyTyped

    private void txtApellidoPersonaNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPersonaNKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtApellidoPersonaN, 15, true, evt);
    }//GEN-LAST:event_txtApellidoPersonaNKeyTyped

    private void txtEmailPersonaNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailPersonaNKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtApellidoPersonaN, 24);
    }//GEN-LAST:event_txtEmailPersonaNKeyTyped
        
    private void txtCelularPersonaNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularPersonaNKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtCelularPersonaN, 9, false, evt);
    }//GEN-LAST:event_txtCelularPersonaNKeyTyped
        
    private void txtDNIpesonarNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIpesonarNKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtDNIpesonarN, 8, false, evt);
    }//GEN-LAST:event_txtDNIpesonarNKeyTyped

    private void txtCodigoPersonaNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoPersonaNKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtCodigoPersonaN, 4, false, evt);
    }//GEN-LAST:event_txtCodigoPersonaNKeyTyped

    private void txtRazonSocialEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialEmpresaKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtRazonSocialEmpresa, 20, true, evt);
    }//GEN-LAST:event_txtRazonSocialEmpresaKeyTyped

    private void txtEmailEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailEmpresaKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtEmailEmpresa, 24);
    }//GEN-LAST:event_txtEmailEmpresaKeyTyped

    private void txtCelularEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularEmpresaKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtCelularEmpresa, 9, false, evt);
    }//GEN-LAST:event_txtCelularEmpresaKeyTyped

    private void txtRucEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucEmpresaKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtRucEmpresa, 11, false, evt);
    }//GEN-LAST:event_txtRucEmpresaKeyTyped

    private void txtCodigoEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEmpresaKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtCodigoEmpresa, 4, false, evt);
    }//GEN-LAST:event_txtCodigoEmpresaKeyTyped

    private void txtMontoViajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoViajeKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtMontoViaje, 5, false, evt);
    }//GEN-LAST:event_txtMontoViajeKeyTyped

    private void txtOrigenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrigenKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtOrigen, 24);
    }//GEN-LAST:event_txtOrigenKeyTyped

    private void txtD_OrigenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtD_OrigenKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtD_Origen, 24);
    }//GEN-LAST:event_txtD_OrigenKeyTyped

    private void txtDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinoKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtDestino, 24);
    }//GEN-LAST:event_txtDestinoKeyTyped

    private void txtD_DestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtD_DestinoKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtD_Destino, 24);
    }//GEN-LAST:event_txtD_DestinoKeyTyped

    private void txtConductorDestinoUltimoViajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConductorDestinoUltimoViajeKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtConductorDestinoUltimoViaje, 28);
    }//GEN-LAST:event_txtConductorDestinoUltimoViajeKeyTyped

    private void txtCodigoViajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoViajeKeyTyped
        Auxiliar m=new Auxiliar();
        m.setCantidadTipoCharacter(this.txtCodigoViaje, 5, false, evt);
    }//GEN-LAST:event_txtCodigoViajeKeyTyped

    private void txtBusquedaConductor2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaConductor2KeyTyped
        Auxiliar m=new Auxiliar();
        if(this.comoBusquedaConductor2.getSelectedIndex()==0){
            m.setCantidadTipoCharacter(this.txtBusquedaConductor2, 10, false, evt);
        }
        if(this.comoBusquedaConductor2.getSelectedIndex()==1){
            m.setCantidadTipoCharacter(this.txtBusquedaConductor2, 10, true, evt);
        }
        if(this.comoBusquedaConductor2.getSelectedIndex()==2){
            m.setCantidadTipoCharacter(this.txtBusquedaConductor2, 10, true, evt);
        }
        if(this.comoBusquedaConductor2.getSelectedIndex()==3){
            m.setCantidadTipoCharacter(this.txtBusquedaConductor2, 10, false, evt);
        }
    }//GEN-LAST:event_txtBusquedaConductor2KeyTyped
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
            java.util.logging.Logger.getLogger(frame_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new frame_menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraBotonesIziquierda;
    private javax.swing.JPanel barraTitulo;
    private rojeru_san.RSButtonRiple btnActualizar;
    private rojeru_san.RSButtonRiple btnBuscarCodigoEmpresa;
    private rojeru_san.RSButtonRiple btnBuscarCodigoPersona;
    private rojeru_san.RSButtonRiple btnBuscarCodigoViaje;
    private rojeru_san.RSButtonRiple btnBuscarConductor;
    private rojeru_san.RSButtonRiple btnBuscarTAXI;
    private rojeru_san.RSButtonRiple btnBuscarTaxiDisponible;
    private rojeru_san.RSButtonRiple btnGenerarCodigoEmpresa;
    private rojeru_san.RSButtonRiple btnGenerarCodigoPersona;
    private rojeru_san.RSButtonRiple btnGoogleMap;
    private rojeru_san.RSButtonRiple btnIniciarViaje;
    private rojeru_san.RSButtonRiple btnMarcarComoPendiente;
    private rojeru_san.RSButtonRiple btnMostrarConductoreConPendientes;
    private rojeru_san.RSButtonRiple btnNuevoViaje;
    private rojeru_san.RSButtonRiple btnNuevosConductores;
    private rojeru_san.RSButtonRiple btnPago;
    private rojeru_san.RSButtonRiple btnRegistrarNuevo;
    private rojeru_san.RSButtonRiple btnRegistrarPago;
    private rojeru_san.RSButtonRiple btnRegistrarPendiente;
    private rojeru_san.RSButtonRiple btnResetCamposCliente;
    private rojeru_san.RSButtonRiple btnResetearCampos;
    private rojeru_san.RSButtonRiple btnSallir;
    private rojeru_san.RSButtonRiple btnSubirFotoVehiculo;
    private rojeru_san.RSButtonRiple btnTaxi;
    private rojeru_san.RSButtonRiple btnTerminado;
    private rojeru_san.RSButtonRiple btnViaje;
    private rojeru_san.RSButtonRiple btnViajesIniciados;
    private rojeru_san.RSButtonRiple btnX;
    private rojeru_san.RSButtonRiple btnsubirFotoChofer;
    public rojerusan.RSComboMetro comboAseguradora;
    private rojerusan.RSComboMetro comboCategoria;
    private rojerusan.RSComboMetro comboMarcarViaje;
    private rojerusan.RSComboMetro comboTipoCliente;
    public rojerusan.RSComboMetro comboTipoSeguro;
    private rojerusan.RSComboMetro comoBusquedaConductor;
    private rojerusan.RSComboMetro comoBusquedaConductor2;
    private com.toedter.calendar.JDateChooser dateFechaNacimiento;
    private com.toedter.calendar.JDateChooser dateFechaVencimientoLicencia;
    private com.toedter.calendar.JDateChooser dateFechaVencimientoSeguro;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblActualizarListaViajeIniciados;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblAseguradoraNombre;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblChofer;
    private javax.swing.JLabel lblChoferes;
    private javax.swing.JLabel lblCodigoConductor;
    private javax.swing.JLabel lblCtaBancaria;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDatosCliente;
    private javax.swing.JLabel lblDatosCliente1;
    private javax.swing.JLabel lblDatosPesonalesChofer;
    private javax.swing.JLabel lblDatosVehiculo;
    private rojeru_san.RSLabelFecha lblFecha;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblFechaVencimiento;
    private javax.swing.JLabel lblFechaVencimientoSeguroT;
    public javax.swing.JLabel lblFotoChofer;
    public javax.swing.JLabel lblFotoVehiculo;
    private javax.swing.JLabel lblHistorialPagos;
    private rojeru_san.RSLabelHora lblHora;
    private javax.swing.JLabel lblIdConductor;
    private javax.swing.JLabel lblLicenciaConducir;
    private javax.swing.JLabel lblListaTaxisTAXI;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNameChofer1;
    private javax.swing.JLabel lblNameChofer2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPagosPendientes;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblSOAT;
    private javax.swing.JLabel lblTaxisDisponibles;
    private javax.swing.JLabel lblTipoSeguro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblViajeRealizados;
    public javax.swing.JLabel lbl_ID_USER;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlDatosPersonales;
    private javax.swing.JPanel pnlDatosTaxi;
    private javax.swing.JPanel pnlDatosVehiculo;
    private javax.swing.JPanel pnlEmpresa;
    private javax.swing.JPanel pnlListaTaxis;
    private javax.swing.JPanel pnlNuevoViaje;
    private javax.swing.JPanel pnlPago;
    private javax.swing.JPanel pnlPersonaNatutal;
    private javax.swing.JPanel pnlRuta;
    private rojeru_san.RSPanelsSlider pnlSliderContenido;
    private rojeru_san.RSPanelsSlider pnlSliderDatosCliente;
    private rojeru_san.RSPanelsSlider pnlSliderViajeContenido;
    private javax.swing.JPanel pnlTaxi;
    private javax.swing.JPanel pnlViaje;
    private javax.swing.JPanel pnlViajesIniciados;
    private javax.swing.JScrollPane scrollChoferes;
    private javax.swing.JScrollPane scrollHistorialPagos;
    private javax.swing.JScrollPane scrollListaTaxis;
    private javax.swing.JScrollPane scrollPagosPendientes;
    private javax.swing.JScrollPane scrollTaxisDisponibles;
    private javax.swing.JScrollPane scrollViajesIniciados;
    private javax.swing.JScrollPane scrollViajesRealizados;
    private rojerusan.RSTableMetro tblConductoresPago;
    private rojerusan.RSTableMetro tblHistorialPagos;
    private rojerusan.RSTableMetro tblListaConductoresRegistrados;
    private rojerusan.RSTableMetro tblPagosPendientes;
    private rojerusan.RSTableMetro tblTaxisDisponibles;
    private rojerusan.RSTableMetro tblViajeIniciados;
    private rojerusan.RSTableMetro tblViajesRealizados;
    private rojeru_san.RSMTextFull txtApellidoConductor;
    private rojeru_san.RSMTextFull txtApellidoPersonaN;
    private rojeru_san.RSMTextFull txtBusquedaConductor;
    private rojeru_san.RSMTextFull txtBusquedaConductor2;
    private rojeru_san.RSMTextFull txtCelularConductor;
    private rojeru_san.RSMTextFull txtCelularEmpresa;
    private rojeru_san.RSMTextFull txtCelularPersonaN;
    private rojeru_san.RSMTextFull txtCodigoEmpresa;
    private rojeru_san.RSMTextFull txtCodigoPersonaN;
    private rojeru_san.RSMTextFull txtCodigoViaje;
    private rojeru_san.RSMTextFull txtConductorDestinoUltimoViaje;
    private rojeru_san.RSMTextFull txtCtaBancaria;
    private rojeru_san.RSMTextFull txtDNIConductor;
    private rojeru_san.RSMTextFull txtDNIpesonarN;
    private rojeru_san.RSMTextFull txtD_Destino;
    private rojeru_san.RSMTextFull txtD_Origen;
    private rojeru_san.RSMTextFull txtDestino;
    private rojeru_san.RSMTextFull txtEmailEmpresa;
    private rojeru_san.RSMTextFull txtEmailPersonaN;
    private rojeru_san.RSMTextFull txtMarca;
    private rojeru_san.RSMTextFull txtModelo;
    private rojeru_san.RSMTextFull txtMontoViaje;
    private rojeru_san.RSMTextFull txtNombreConductor;
    private rojeru_san.RSMTextFull txtNombrePersonaN;
    private rojeru_san.RSMTextFull txtOrigen;
    private rojeru_san.RSMTextFull txtPlaca;
    private rojeru_san.RSMTextFull txtRazonSocialEmpresa;
    private rojeru_san.RSMTextFull txtRucEmpresa;
    // End of variables declaration//GEN-END:variables
}
