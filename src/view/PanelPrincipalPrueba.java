package view;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipalPrueba extends JPanel {
    private static final long serialVersionUID = 1L;
    public static JPanel panelBotones;
    public static JButton btnLogin, btnVisualizarDetalle, btnVisualizarResumen;
    private FrmPrincipal frmPrincipal;
    private JPanel  panValidarEntrar, panVisualizarDetalle, panVisualizarResumen;

    public PanelPrincipalPrueba(FrmPrincipal frmPrincipal, PanelValidarEntrar panValidarEntrar, PanelVisualizarDetalle panVisualizarDetalle, PanelVisualizarTodo panVisualizarResumen) {
        setLayout(new BorderLayout(0, 0));
        this.frmPrincipal = frmPrincipal;
        this.panValidarEntrar = panValidarEntrar;
        this.panVisualizarDetalle = panVisualizarDetalle;
        this.panVisualizarResumen = panVisualizarResumen;

        addComponents();
        addListeners();
    }

    private void addComponents() {
        panelBotones = new JPanel();
        add(panelBotones, BorderLayout.CENTER);
        panelBotones.setLayout(new GridLayout(3, 3, 10, 10));

        btnLogin = new JButton("Login");
        btnVisualizarDetalle = new JButton("Visualizar Detalle");
        btnVisualizarResumen = new JButton("Visualizar Resumen");

        panelBotones.add(btnLogin);
        panelBotones.add(btnVisualizarDetalle);
        panelBotones.add(btnVisualizarResumen);
    }

    private void addListeners() {
        btnLogin.addActionListener(e -> {
            cambiarPanel(panValidarEntrar);
        });
        btnVisualizarDetalle.addActionListener(e -> {
            cambiarPanel(panVisualizarDetalle);
        });
        btnVisualizarResumen.addActionListener(e -> {
            cambiarPanel(panVisualizarResumen);
        });

    }

    private void cambiarPanel(JPanel panelNuevo) {
        frmPrincipal.getContentPane().removeAll();
        frmPrincipal.getContentPane().add(panelNuevo, BorderLayout.CENTER);
        frmPrincipal.revalidate();
        frmPrincipal.repaint();
    }
}
