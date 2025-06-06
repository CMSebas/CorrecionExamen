package ec.edu.ups.poo;

import java.awt.*;
import java.awt.event.*;

public class VentanaExamen extends Frame {

    private TextField txtCedula;
    private TextField txtNombre;
    private TextField txtApellido;
    private Panel panelSuperior;
    private Panel panelCentral;
    private Panel panelInferior;
    private Button botonGuardar;
    private Button botonCancelar;

    public VentanaExamen() {
        setTitle("Gestión de Estudiantes");
        setSize(400, 200);
        setLayout(new BorderLayout());


        panelSuperior = new Panel(new FlowLayout());
        panelSuperior.add(new Button("Agregar"));
        panelSuperior.add(new Button("Modificar"));
        panelSuperior.add(new Button("Eliminar"));
        add(panelSuperior, BorderLayout.NORTH);


        panelCentral = new Panel(new GridLayout(3, 2));
        panelCentral.add(new Label("Cédula:"));
        txtCedula = new TextField();
        panelCentral.add(txtCedula);

        panelCentral.add(new Label("Nombre:"));
        txtNombre = new TextField();
        panelCentral.add(txtNombre);

        panelCentral.add(new Label("Apellido:"));
        txtApellido = new TextField();
        panelCentral.add(txtApellido);

        add(panelCentral, BorderLayout.CENTER);


        panelInferior = new Panel(new FlowLayout());
        botonGuardar = new Button("Guardar");
        botonCancelar = new Button("Cancelar");
        panelInferior.add(botonGuardar);
        panelInferior.add(botonCancelar);
        add(panelInferior, BorderLayout.SOUTH);


        botonGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaExamen();
    }
}