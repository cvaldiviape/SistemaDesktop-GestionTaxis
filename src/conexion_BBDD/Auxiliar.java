package conexion_BBDD;

import Atxy2k.CustomTextField.RestrictedTextField;
import modelo.Persona;
import modelo.Conductor;
import vista.mensaje_email_confirmacion;
import java.awt.Panel;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import rojeru_san.RSMTextFull;

public class Auxiliar {

    //Convierte un objeto tipo "File" en "Bytes[]".
    public byte[] getConvertFileToBytes(File archivo) {
        FileInputStream entrada;
        byte bytesImg[] = new byte[1024 * 100 * 100];//Declaramos un array de 100 megas "1024*1024*100"
        try {
            entrada = new FileInputStream(archivo);//instanciamos la variable entrada, asi mismo recibira parametro "la imagen"
            entrada.read(bytesImg);//Leera el archivo, y a la vez se almacenara en el array de bytes
        } catch (Exception e) {
            System.out.println("ERROR: Metodos, metodo:setConvertImagenaMatrizBytes");
        }
        return bytesImg;//AL FINAL NOS PROPORCIONARA UN ARREGLO CON LOS BYTES DE LA IMAGEN
    }

    //Habilita un ventana para buscar una imagen y establecerla en el "JLabel"
    public void setImagenToLabel(JLabel foto) {
        JFileChooser selec = new JFileChooser();
        File archivo_imagen;
        if (selec.showDialog(null, "ELEGIR IMAGEN") == JFileChooser.APPROVE_OPTION) {
            archivo_imagen = selec.getSelectedFile();
            if (archivo_imagen.canRead()) {
                if (archivo_imagen.getName().endsWith("jpg") || archivo_imagen.getName().endsWith("png") || archivo_imagen.getName().endsWith("gif")) {
                    byte imagenByte[] = new byte[1024 * 100 * 100];
                    imagenByte = getConvertFileToBytes(archivo_imagen);
                    foto.setIcon(new ImageIcon(imagenByte));
                    //"label" ruta del archivo
                    rsscalelabel.RSScaleLabel.setScaleLabel(foto, archivo_imagen.getAbsolutePath());//Ajusto la imagen
                    //rsscalelabel.RSScaleLabel
                } else {
                    JOptionPane.showMessageDialog(null, "ARCHIVO NO COMPATIBLE");
                }
            }
        }
    }

    //Habilita un ventana para buscar una imagen para establecerla en el "JLabel" y convierte un "JLabel" en "bytes[]" el cual es retornado. 
    public byte[] getConvertImagenToBytes(JLabel foto) {
        JFileChooser selec = new JFileChooser();
        File archivo_imagen;
        byte imagenByte[] = new byte[1024 * 100 * 100];
        if (selec.showDialog(null, "ELEGIR IMAGEN") == JFileChooser.APPROVE_OPTION) {
            archivo_imagen = selec.getSelectedFile();
            if (archivo_imagen.canRead()) {
                if (archivo_imagen.getName().endsWith("jpg") || archivo_imagen.getName().endsWith("png") || archivo_imagen.getName().endsWith("gif") || archivo_imagen.getName().endsWith("jpeg")) {
                    imagenByte = getConvertFileToBytes(archivo_imagen);
                    foto.setIcon(new ImageIcon(imagenByte));
                    //"label" ruta del archivo
                    rsscalelabel.RSScaleLabel.setScaleLabel(foto, archivo_imagen.getAbsolutePath());//Ajusto la imagen
                    //rsscalelabel.RSScaleLabel
                } else {
                    JOptionPane.showMessageDialog(null, "ARCHIVO NO COMPATIBLE");
                }
            }
        }
        return imagenByte;
    }

    //Metodo permite convertior un objeto "java.util.Date" a "java.sql.Date"
    public java.sql.Date getConvertDateUtilToDateSql(java.util.Date fecha) {
        java.sql.Date fecha1 = null;
        if (fecha != null) {
            fecha1 = new java.sql.Date(fecha.getTime());
        }
        return fecha1;
    }

    //Metodo que me permite saber si estan llenos todos los campos.
    public boolean getCamposLLenosRegistroConductor(Conductor c) {
        boolean campos_llenos = true;
        if (c.getVehiculo().getAseguradora().getNombre().equals("Seleccionar")
                || c.getVehiculo().getAseguradora().getTipo_seguro().equals("Seleccionar")
                || c.getVehiculo().getAseguradora().getFecha_venc() == null
                || c.getNombre().equals("")
                || c.getApellido().equals("")
                || c.getDni().equals("")
                || c.getFecha_nac() == null
                || c.getCelular().equals("")
                || c.getFoto() == null
                || c.getCta_bancaria().equals("")
                || c.getLic_Categoria().equals("Seleccionar")
                || c.getLic_venc() == null
                || c.getVehiculo().getModelo().equals("")
                || c.getVehiculo().getMarca().equals("")
                || c.getVehiculo().getPlaca().equals("")
                || c.getVehiculo().getFoto() == null) {

            campos_llenos = false;
        }
        return campos_llenos;
    }

    //Permite definir la cantidad de caracteres ingresar en un texto, y si es digito o cadena.
    public void setCantidadTipoCharacter(RSMTextFull campoTexto, int cantidadCaracteres, boolean xd, java.awt.event.KeyEvent evt) {
        RestrictedTextField rn = new RestrictedTextField(campoTexto);
        rn.setLimit(cantidadCaracteres);
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == xd) {//si true, se podra escribir texto, si el fase podra escribir solo digitos
            evt.consume();
        }
    }

    public void setCantidadTipoCharacter(RSMTextFull campoTexto, int cantidadCaracteres) {
        RestrictedTextField rn = new RestrictedTextField(campoTexto);
        rn.setLimit(cantidadCaracteres);
    }

    public boolean getCamposLLenosRegistroPersona(Persona pe) {
        boolean campos_llenos = true;
        if (pe.getEmail().equals("") || pe.getCelular().equals("")
                || pe.getNombre().equals("") || pe.getApellido().equals("")
                || pe.getDni().equals("")) {

            campos_llenos = false;
        }
        return campos_llenos;
    }

    public void setEnviarEmail(String destinatario, String asunto, String mensaje) {
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");

        Session sesion = Session.getDefaultInstance(propiedad);

        String correoEnvia = "sathielx9@gmail.com";
        String contraseña = "akasgyeyyiuhfjsu";

        MimeMessage mail = new MimeMessage(sesion);

        try {
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto);
            mail.setText(mensaje);

            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia, contraseña);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();

            mensaje_email_confirmacion xd = new mensaje_email_confirmacion();
            xd.setVisible(true);

        } catch (AddressException ex) {
            System.out.println("ERROR ADREES");
            //Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            System.out.println("ERROR MENSAJEANDO");
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
