import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

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
    private JPanel logoArea;
    private JPanel buttonArea;
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
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    private CardLayout cardLayoutGerir;
    private CardLayout cardLayoutNormalPages;
    private JPanel[] elementos = {elementoGerirEventos, elementoGerirAtletas, elementoGerirProvas, elementoTopMedalhados};

    public AppWorldAthletics() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(PainelPrincipal);

        pack();

        cardLayoutGerir = (CardLayout) (conteudoGerir.getLayout());
        cardLayoutNormalPages = (CardLayout) (PainelPrincipal.getLayout());

        botaoGerirEventos.addActionListener(this::botaoGerirEventosActionPerformed);
        botaoGerirAtletas.addActionListener(this::botaoGerirAtletasActionPerformed);
        botaoGerirProvas.addActionListener(this::botaoGerirProvasActionPerformed);
        botaoTopMedalhados.addActionListener(this::botaoTopMedalhadosActionPerformed);
        botaoMenuInicial.addActionListener(this::botaoMenuInicialActionPerformed);

        botaoGerirEventosMI.addActionListener(this::botaoGerirEventosActionPerformed);
        botaoGerirAtletasMI.addActionListener(this::botaoGerirAtletasActionPerformed);
        botaoGerirProvasMI.addActionListener(this::botaoGerirProvasActionPerformed);
        botaoTopMedalhadosMI.addActionListener(this::botaoTopMedalhadosActionPerformed);

        cardLayoutNormalPages.show(PainelPrincipal, "cardMenuPrincipal");
    }

    private void botaoGerirEventosActionPerformed(ActionEvent e) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardFuncionalidades");
        cardLayoutGerir.show(conteudoGerir, "cardGerirEventos");
        setElementsBackgroundColor(elementoGerirEventos);
    }

    private void botaoGerirAtletasActionPerformed(ActionEvent e) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardFuncionalidades");
        cardLayoutGerir.show(conteudoGerir, "cardGerirAtletas");
        setElementsBackgroundColor(elementoGerirAtletas);
    }

    private void botaoGerirProvasActionPerformed(ActionEvent e) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardFuncionalidades");
        cardLayoutGerir.show(conteudoGerir, "cardGerirProvas");
        setElementsBackgroundColor(elementoGerirProvas);
    }

    private void botaoTopMedalhadosActionPerformed(ActionEvent e) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardFuncionalidades");
        cardLayoutGerir.show(conteudoGerir, "cardTopMedalhados");
        setElementsBackgroundColor(elementoTopMedalhados);
    }

    private void botaoMenuInicialActionPerformed(ActionEvent e) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardMenuPrincipal");
    }

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
