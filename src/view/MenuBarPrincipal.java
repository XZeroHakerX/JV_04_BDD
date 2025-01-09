package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarPrincipal implements ActionListener {
    private JMenuBar menuBar;
    private JMenu mnValidar, mnVisualizar, mnAcercaDe;
    private JMenuItem itemValidarEntrar, itemValidarSalir, itemVisualizarDetalle, itemVisualizarResumen , itemAcercaDe;
    private FrmPrincipal frmPrincipal;
    private JPanel  panValidarEntrar, panValidarSalir, panVisualizarDetalle, panVisualizarResumen, panAcercaDe;

    public MenuBarPrincipal( FrmPrincipal frmPrincipal, PanelValidarEntrar panValidarEntrar, PanelValidarSalir panValidarSalir, PanelVisualizarDetalle panVisualizarDetalle, PanelVisualizarTodo panVisualizarResumen, PanelAcercaDe panAcercaDe) {
        this.frmPrincipal = frmPrincipal;
        this.panValidarEntrar = panValidarEntrar;
        this.panValidarSalir = panValidarSalir;
        this.panVisualizarDetalle = panVisualizarDetalle;
        this.panVisualizarResumen = panVisualizarResumen;
        this.panAcercaDe = panAcercaDe;
    }

    public JMenuBar mnBarPrincipal() {
        menuBar = new JMenuBar();

        mnValidar = new JMenu("Validar");
        mnVisualizar = new JMenu("Visualizar");
        mnAcercaDe = new JMenu("Acerca De");

        itemValidarEntrar = new JMenuItem("Login/ Entrar");
        itemValidarSalir = new JMenuItem("Login/ Salir");
        itemVisualizarDetalle = new JMenuItem("Visualizar/ Detalles");
        itemVisualizarResumen = new JMenuItem("Visualizar/ Resumen");
        itemAcercaDe = new JMenuItem("Acerda de...");

        mnValidar.add(itemValidarEntrar);
        mnValidar.add(itemValidarSalir);
        mnVisualizar.add(itemVisualizarDetalle);
        mnVisualizar.add(itemVisualizarResumen);
        mnAcercaDe.add(itemAcercaDe);

        itemValidarEntrar.addActionListener(this);
        itemValidarSalir.addActionListener(this);
        itemVisualizarDetalle.addActionListener(this);
        itemVisualizarResumen.addActionListener(this);
        itemAcercaDe.addActionListener(this);

        menuBar.add(mnValidar);
        menuBar.add(mnVisualizar);
        menuBar.add(mnAcercaDe);


        return menuBar;
    }

    private void cambiarPanel(JPanel panelNuevo) {
        frmPrincipal.getContentPane().removeAll();
        frmPrincipal.getContentPane().add(panelNuevo, BorderLayout.CENTER);
        frmPrincipal.revalidate();
        frmPrincipal.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == itemValidarEntrar) {
            cambiarPanel(panValidarEntrar);
            frmPrincipal.setTitle("Login");
        } else if (e.getSource() == itemValidarSalir) {
            cambiarPanel(panValidarSalir);
            frmPrincipal.setTitle("Salir Login");
        } else if (e.getSource() == itemVisualizarDetalle) {
            cambiarPanel(panVisualizarDetalle);
            frmPrincipal.setTitle("Visualizar Detalles");
        } else if (e.getSource() == itemVisualizarResumen) {
            //CtrlPanelVisualizarTodo.mostrarLista();
            cambiarPanel(panVisualizarResumen);
            frmPrincipal.setTitle("VIsualizar Resumen");
        } else if (e.getSource() == itemAcercaDe) {
            //CtrlPanelVisualizarIndividual.actualizarLista();
            cambiarPanel(panAcercaDe);
            frmPrincipal.setTitle("Acerca de...");
        }
    }
}


