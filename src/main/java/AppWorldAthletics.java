import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AppWorldAthletics extends JFrame{
    private JPanel paginasGerir;
    private JPanel menuLateral;
    private JButton botaoDefinicoes;
    private JPanel elementoMenuInicial;
    private JButton botaoMenuInicial;
    private JPanel elementoGerirEventos;
    private JPanel elementoGerirAtletas;
    private JPanel elementoGerirProvas;
    private JPanel elementoTopMedalhados;
    private JPanel conteudoGerirAtletas;
    private JPanel conteudoGerir;
    private JPanel conteudoGerirEventos;
    private JButton botaoGerirEventos;
    private JButton botaoGerirAtletas;
    private JButton botaoGerirProvas;
    private JButton botaoTopMedalhados;
    private JPanel conteudoGerirProvas;
    private JPanel conteudoTopMedalhados;
    private JPanel PainelPrincipal;
    private JPanel menuInicial;
    private JButton botaoGerirEventosMI;
    private JButton botaoGerirAtletasMI;
    private JButton botaoGerirProvasMI;
    private JButton botaoTopMedalhadosMI;
    private JPanel adicionarEvento;
    private JPanel editarEvento;
    private JPanel programaEvento;
    private JPanel adicionarAtleta;
    private JPanel editarAtleta;
    private JPanel inscreverAtleta;
    private JPanel cancelarInscricaoAtleta;
    private JPanel consultarHistoricoAtleta;
    private JPanel melhorTempoAtleta;
    private JPanel provasAtleta;
    private JPanel criarProva;
    private JPanel editarProva;
    private JPanel atletasPorProva;
    private JPanel registarResultadoProva;
    private JPanel resultadosFinaisProva;
    private JPanel recordesProva;
    private JList list1;
    private JTextField paísTextField;
    private JTextField localTextField;
    private JTextField dataFimTextField;
    private JTextField dataInícioTextField;
    private JTextField nomeTextField;
    private JButton botaoVerPrograma;
    private JButton botaoImportarEventos;
    private JButton botaoAdicionarEvento;
    private JButton botaoRemoverEvento;
    private JButton botaoEditarEvento;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField2;
    private JComboBox selecionarProva;
    private JComboBox selecionarProva2;
    private JButton botaoAdicionarProva;
    private JButton botaoRemoverProva;
    private JButton botaoOk;
    private JButton botaoCancelar;
    private JButton botaoOk2;
    private JButton botaoCancelar2;
    private JComboBox selecionarProva3;
    private JComboBox selecionarProva4;
    private JButton botaoAdicionar2;
    private JButton botaoRemover2;
    private JButton botaoImportarProvas;
    private JButton button2;
    private JButton button3;
    private JButton botaoCriarProva;
    private JButton botaoEliminarProva;
    private JButton botaoEditarProva;
    private JTable table1;
    private JComboBox comboBox1;

    private CardLayout cardLayoutGerir;
    private CardLayout cardLayoutNormalPages;
    private JPanel[] elementos = {elementoGerirEventos, elementoGerirAtletas, elementoGerirProvas, elementoTopMedalhados};

    public AppWorldAthletics() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(PainelPrincipal);
        pack();

        cardLayoutGerir = (CardLayout) (conteudoGerir.getLayout());
        cardLayoutNormalPages = (CardLayout) (PainelPrincipal.getLayout());

        //Menu Lateral
        botaoGerirEventos.addActionListener(this::botaoGerirEventosActionPerformed);
        botaoGerirAtletas.addActionListener(this::botaoGerirAtletasActionPerformed);
        botaoGerirProvas.addActionListener(this::botaoGerirProvasActionPerformed);
        botaoTopMedalhados.addActionListener(this::botaoTopMedalhadosActionPerformed);
        botaoMenuInicial.addActionListener(this::botaoMenuInicialActionPerformed);

        //Menu Inicial
        botaoGerirEventosMI.addActionListener(this::botaoGerirEventosActionPerformed);
        botaoGerirAtletasMI.addActionListener(this::botaoGerirAtletasActionPerformed);
        botaoGerirProvasMI.addActionListener(this::botaoGerirProvasActionPerformed);
        botaoTopMedalhadosMI.addActionListener(this::botaoTopMedalhadosActionPerformed);

        //Gerir Eventos
        botaoAdicionarEvento.addActionListener(this::botaoAdicionarEventoActionPerformed);
        botaoEditarEvento.addActionListener(this::botaoEditarEventoActionPerformed);
        botaoRemoverEvento.addActionListener(this::botaoRemoverEventoActionPerformed);
        botaoVerPrograma.addActionListener(this::botaoVerProgramaActionPerformed);
        botaoImportarEventos.addActionListener(this::botaoImportarEventosActionPerformed);

        //Gerir Provas
        botaoCriarProva.addActionListener(this::botaoCriarProvaActionPerformed);
        botaoEditarProva.addActionListener(this::botaoEditarProvaActionPerformed);
        botaoEliminarProva.addActionListener(this::botaoEliminarProvaActionPerformed);
        botaoImportarProvas.addActionListener(this::botaoImportarProvasActionPerformed);

        cardLayoutNormalPages.show(PainelPrincipal, "cardMenuPrincipal");
    }

    //------------------------------ MENU LATERAL/INICIAL ------------------------------

    private void botaoGerirEventosActionPerformed(ActionEvent e) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardGerir");
        cardLayoutGerir.show(conteudoGerir, "cardGerirEventos");
        setElementsBackgroundColor(elementoGerirEventos);
    }

    private void botaoGerirAtletasActionPerformed(ActionEvent e) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardGerir");
        cardLayoutGerir.show(conteudoGerir, "cardGerirAtletas");
        setElementsBackgroundColor(elementoGerirAtletas);
    }

    private void botaoGerirProvasActionPerformed(ActionEvent e) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardGerir");
        cardLayoutGerir.show(conteudoGerir, "cardGerirProvas");
        setElementsBackgroundColor(elementoGerirProvas);
    }

    private void botaoTopMedalhadosActionPerformed(ActionEvent e) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardGerir");
        cardLayoutGerir.show(conteudoGerir, "cardTopMedalhados");
        setElementsBackgroundColor(elementoTopMedalhados);
    }

    private void botaoMenuInicialActionPerformed(ActionEvent e) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardMenuPrincipal");
    }

    //------------------------------ GERIR EVENTOS ------------------------------

    private void botaoAdicionarEventoActionPerformed(ActionEvent actionEvent) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardAdicionarEvento");
    }

    private void botaoEditarEventoActionPerformed(ActionEvent actionEvent) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardEditarEvento");
    }

    private void botaoRemoverEventoActionPerformed(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "O evento foi removido com sucesso!");
    }

    private void botaoVerProgramaActionPerformed(ActionEvent actionEvent) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardProgramaEvento");
    }

    private void botaoImportarEventosActionPerformed(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Filler Text");
    }

    //------------------------------ GERIR PROVAS ------------------------------

    private void botaoCriarProvaActionPerformed(ActionEvent actionEvent) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardCriarProva");
    }

    private void botaoEditarProvaActionPerformed(ActionEvent actionEvent) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardEditarProva");
    }

    private void botaoEliminarProvaActionPerformed(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "A prova foi eliminada com sucesso!");
    }

    private void botaoImportarProvasActionPerformed(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Filler Text");
    }

    //------------------------------ FUNÇÕES AUXILIARES ------------------------------

    private void setElementsBackgroundColor(JPanel elementoHighlight) {
        for (JPanel elemento : elementos) {
            elemento.setBackground(new Color(0x222222));
        }
        elementoHighlight.setBackground(new Color(0x363636));
    }

    public static void main(String[] args) {
        new AppWorldAthletics().setVisible(true);
    }
}
