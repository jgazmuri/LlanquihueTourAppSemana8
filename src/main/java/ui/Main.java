package ui;

import data.GestorServicios;
import model.PaseoLacustre;
import model.ServicioTuristico;
import model.ExcursionCultural;
import model.RutaGastronomica;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Main extends JFrame {

    private final ArrayList<ServicioTuristico> servicios = new ArrayList<>();

    public Main(){
        super("Gestion de Servicios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(800,600);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Servicios Turisticos", creaPanelServiciosTuristicos());
        tabbedPane.addTab("Ruta Gastronomicas", createPanelRutaGastronomicas());
        tabbedPane.addTab("Paseo Lacustre", createPanelPaseoLacustre());
        tabbedPane.addTab("Excurcion Cultural", createPanelExcurcionCultural());

        setContentPane(tabbedPane);

    }

    private Component createPanelExcurcionCultural() {
        JTextField nombre = new JTextField();
        JTextField duracionHoras = new JTextField();
        JTextField lugarHistorico = new JTextField();

        JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));

        panel.add(new JLabel("Nombre: ")); panel.add(nombre);
        panel.add(new JLabel("Duracion Horas: ")); panel.add(duracionHoras);
        panel.add(new JLabel("Lugar Historico: ")); panel.add(lugarHistorico);

        DefaultListModel<ExcursionCultural> modeloLista = new DefaultListModel<>();
        JList<ExcursionCultural> listaVisual = new JList<>(modeloLista);
        JScrollPane scroll = new JScrollPane(listaVisual);

        JButton btnGuardar = new JButton("Agregar Excurcion");
        btnGuardar.addActionListener(A -> {
            try {
                ExcursionCultural excursion = new ExcursionCultural(nombre.getText(), duracionHoras.getText(), lugarHistorico.getText());
                modeloLista.addElement(excursion);
                nombre.setText("");
                duracionHoras.setText("");
                lugarHistorico.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Verificar los datos");
                System.out.println(ex.getMessage());
            }
        });

        JButton btnVerResumen = new JButton("Ver Resumen");
        btnVerResumen.addActionListener(A -> {
            ExcursionCultural seleccionada = listaVisual.getSelectedValue();
            if (seleccionada == null) {
                JOptionPane.showMessageDialog(this, "Seleccione una excursion de la lista primero");
            } else {
                JOptionPane.showMessageDialog(this, seleccionada.toString());
            }
        });

        JPanel botones = new JPanel(new FlowLayout());
        botones.add(btnGuardar);
        botones.add(btnVerResumen);

        JPanel top = new JPanel();
        top.add(panel);
        top.add(botones);

        JPanel panel2 = new JPanel(new BorderLayout(10, 10));
        panel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel2.add(top, BorderLayout.NORTH);
        panel2.add(scroll, BorderLayout.CENTER);

        return panel2;
    }

    private Component createPanelPaseoLacustre() {
        JTextField nombre = new JTextField();
        JTextField duracionHoras = new JTextField();
        JTextField tipoEmbarcacion = new JTextField();

        JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));

        panel.add(new JLabel("Nombre:")); panel.add(nombre);
        panel.add(new JLabel("Duracion Horas:")); panel.add(duracionHoras);
        panel.add(new JLabel("Tipo Embarcacion:")); panel.add(tipoEmbarcacion);

        DefaultListModel<PaseoLacustre> modeloLista = new DefaultListModel<>();
        JList<PaseoLacustre> listaVisual = new JList<>(modeloLista);
        JScrollPane scroll = new JScrollPane(listaVisual);

        JButton btnGuardar = new JButton("Agregar Paseo");
        btnGuardar.addActionListener(A -> {
            try {
                PaseoLacustre paseo = new PaseoLacustre(nombre.getText(), duracionHoras.getText(), tipoEmbarcacion.getText());
                modeloLista.addElement(paseo);
                nombre.setText("");
                duracionHoras.setText("");
                tipoEmbarcacion.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Verificar los datos");
                System.out.println(ex.getMessage());
            }
        });

        JButton btnVerResumen = new JButton("Ver Resumen");
        btnVerResumen.addActionListener(A -> {
            PaseoLacustre seleccionada = listaVisual.getSelectedValue();
            if (seleccionada == null) {
                JOptionPane.showMessageDialog(this, "Seleccione un paseo de la lista primero");
            } else {
                JOptionPane.showMessageDialog(this, seleccionada.toString());
            }
        });

        JPanel botones = new JPanel(new FlowLayout());
        botones.add(btnGuardar);
        botones.add(btnVerResumen);

        JPanel top = new JPanel();
        top.add(panel);
        top.add(botones);

        JPanel panel2 = new JPanel(new BorderLayout(10, 10));
        panel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel2.add(top, BorderLayout.NORTH);
        panel2.add(scroll, BorderLayout.CENTER);

        return panel2;
    }

    private Component createPanelRutaGastronomicas() {
        JTextField nombre = new JTextField();
        JTextField duracionHoras = new JTextField();
        JTextField numeroDeParadasField = new JTextField();


        JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));

        panel.add(new JLabel("Nombre: ")); panel.add(nombre);
        panel.add(new JLabel("Duracion Horas: ")); panel.add(duracionHoras);
        panel.add(new JLabel("Numero de Paradas: ")); panel.add(numeroDeParadasField);

        DefaultListModel <RutaGastronomica> modeloLista = new DefaultListModel<>();
        JList <RutaGastronomica> listaVisual = new JList<>(modeloLista);
        JScrollPane scroll = new JScrollPane(listaVisual);


        JButton btnGuardar = new JButton("Agregar Ruta");
        btnGuardar.addActionListener(A  -> {
            try{

                int numeroDeParadas = Integer.parseInt(numeroDeParadasField.getText());
                RutaGastronomica ruta = new RutaGastronomica(nombre.getText(),duracionHoras.getText(),numeroDeParadas);
                modeloLista.addElement(ruta);
                nombre.setText("");
                duracionHoras.setText("");
                numeroDeParadasField.setText("");

            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Verificar los datos");
                System.out.println(ex.getMessage());
            }
        });

        JButton btnVerResumen = new JButton("Ver Resumen");
        btnVerResumen.addActionListener(A  -> {

            RutaGastronomica seleccionada = listaVisual.getSelectedValue();
            if(seleccionada == null){
                JOptionPane.showMessageDialog(this, "Seleccione una Ruta de la lista primero");
            }else {
                JOptionPane.showMessageDialog(this,seleccionada.toString());
            }
        });

        JPanel botones = new JPanel(new FlowLayout());
        botones.add(btnGuardar);
        botones.add(btnVerResumen);

        JPanel top = new JPanel();
        top.add(panel);
        top.add(botones);

        JPanel panel2 = new JPanel(new BorderLayout(10,10));
        panel2.setBorder(BorderFactory.createEmptyBorder(10, 10,10,10));
        panel2.add(top, BorderLayout.NORTH);
        panel2.add(scroll, BorderLayout.CENTER);

        return panel2;

    }

    private Component creaPanelServiciosTuristicos() {

        JTextField nombre = new JTextField();
        JTextField duracionHoras = new JTextField();

        DefaultListModel <ServicioTuristico> modeloLista = new DefaultListModel();
        JList <ServicioTuristico> listaVisual = new JList<>(modeloLista);
        JScrollPane scroll = new JScrollPane(listaVisual);

        JPanel panel = new JPanel(new GridLayout(0, 2, 5, 5));

        panel.add(new JLabel("Nombre:")); panel.add(nombre);
        panel.add(new JLabel("Duracion Horas:")); panel.add(duracionHoras);

        JButton btnGuardar = new JButton("Agregar Servicio");
        btnGuardar.addActionListener(A  -> {
            try{

                ServicioTuristico servicio = new ServicioTuristico
                        (nombre.getText(), duracionHoras.getText());
                ogreegarServicio(servicio);
                modeloLista.addElement(servicio);
                nombre.setText("");
                duracionHoras.setText("");

            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Verificar los datos");
                System.out.println(ex.getMessage());
            }
        });

        JButton btnVerResumen = new JButton("Ver Resumen");
        btnVerResumen.addActionListener(A -> {
            ServicioTuristico seleccionada = listaVisual.getSelectedValue();
            if (seleccionada == null) {
                JOptionPane.showMessageDialog(this, "Seleccione un Servicio de la lista primero");
            } else {
                JOptionPane.showMessageDialog(this, seleccionada.toString());
            }
        });

        JPanel botones = new JPanel(new FlowLayout());
        botones.add(btnGuardar);
        botones.add(btnVerResumen);

        JPanel top = new JPanel(); // FlowLayout por defecto
        top.add(panel);
        top.add(botones);

        JPanel panel2 = new JPanel(new BorderLayout(10, 10));
        panel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel2.add(top, BorderLayout.NORTH);  // ← corregido: "top" en vez de "panel"
        panel2.add(scroll, BorderLayout.CENTER);

        return panel2;
    }

    private void ogreegarServicio(ServicioTuristico servicio) {
        servicios.add(servicio);
    }


    public static void main(String[] args){

                    SwingUtilities.invokeLater(() -> {
                        new Main().setVisible(true);
                    });

                    GestorServicios gestor = new GestorServicios();

                    gestor.mostrarTodosLosServicios();

                }
}


