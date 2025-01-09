package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FrmPrincipal extends JFrame{

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private MenuBarPrincipal menuBarPrincipal;
    private PanelPrincipal panPrincipal;
    private PanelValidarEntrar panValidarEntrar;
    private PanelValidarSalir panValidarSalir;
    private PanelVisualizarDetalle panVisualizarDetalle;
    private PanelVisualizarTodo panelVisualizarTodo;
    private PanelAcercaDe panelAcercade;

    public FrmPrincipal() {
        setTitle("Aplicacion BDD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 500);
        setLocationRelativeTo(null);

        contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel);

        //panPrincipal = new PanelPrincipalPrueba(this, panValidarEntrar, panVisualizarDetalle, panelVisualizarTodo);
        panPrincipal = new PanelPrincipal();
        panValidarEntrar = new PanelValidarEntrar();
        panValidarSalir = new PanelValidarSalir();
        panVisualizarDetalle = new PanelVisualizarDetalle();
        panelVisualizarTodo = new PanelVisualizarTodo();
        panelAcercade = new PanelAcercaDe();

        menuBarPrincipal = new MenuBarPrincipal(this, panValidarEntrar, panValidarSalir, panVisualizarDetalle, panelVisualizarTodo, panelAcercade);
        setJMenuBar(menuBarPrincipal.mnBarPrincipal());

        contentPane.add(panPrincipal, BorderLayout.CENTER);
        setVisible(true);

    }
}
