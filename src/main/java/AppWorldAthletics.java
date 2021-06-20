import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.ArrayList;
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
    private JList gerirEventosLista;
    private JTextField gerirEventosPais;
    private JTextField gerirEventosLocal;
    private JTextField gerirEventosDataFim;
    private JTextField gerirEventosDataInicio;
    private JTextField gerirEventosNome;
    private JButton botaoVerPrograma;
    private JButton botaoImportarEventos;
    private JButton botaoAdicionarEvento;
    private JButton botaoRemoverEvento;
    private JButton botaoEditarEvento;
    private JTextField adicionarEventoNome;
    private JTextField adicionarEventoDataInicio;
    private JTextField adicionarEventoDataFim;
    private JTextField adicionarEventoLocal;
    private JTextField adicionarEventoPais;
    private JComboBox selecionarProva;
    private JButton botaoAdicionarProva;
    private JButton botaoRemoverProva;
    private JButton botaoOkAdicionarEvento;
    private JButton botaoCancelarCriarEvento;
    private JButton botaoOk2;
    private JButton botaoCancelarEditarEvento;
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
    private JButton botaoVoltarProgramaEvento;
    private JButton botaoCancelarCriarProva;
    private JButton botaoCancelarEditarProva;
    private JButton botaoOkCriarProva;
    private JTextField nomeCriarProva;
    private JComboBox tipoPontuacaoComboBox;
    private JComboBox sexoParticipantesComboBox;
    private JList gerirProvasLista;
    private JTextField gerirProvasNome;
    private JTextField gerirProvasSexoParticipantes;
    private JButton botaoOkEditarProva;
    private JTextField editarProvaNome;
    private JComboBox editarProvaTipoPontuacao;
    private JComboBox editarProvaSexoParticipantes;

    private CardLayout cardLayoutGerir;
    private CardLayout cardLayoutNormalPages;
    private JPanel[] elementos = {elementoGerirEventos, elementoGerirAtletas, elementoGerirProvas, elementoTopMedalhados};

    //Gerir Eventos
    private ArrayList<Evento> listaEventos = new ArrayList<>();
    private ArrayList<Prova> listaProvasEvento = new ArrayList<>();
    private Evento eventoSelecionado = null;

    //Gerir Provas
    private ArrayList<Prova> listaProvas = new ArrayList<>();
    private Prova provaSelecionada = null;

    //Gerir Atletas

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
        botaoCancelarCriarEvento.addActionListener(this::botaoGerirEventosActionPerformed);
        botaoCancelarEditarEvento.addActionListener(this::botaoGerirEventosActionPerformed);
        botaoVoltarProgramaEvento.addActionListener(this::botaoGerirEventosActionPerformed);
        botaoAdicionarProva.addActionListener(this::botaoAdicionarProvaActionPerformed);
        botaoRemoverProva.addActionListener(this::botaoRemoverProvaActionPerformed);
        botaoOkAdicionarEvento.addActionListener(this::botaoOkAdicionarEventoActionPerformed);

        //Gerir Provas
        botaoCriarProva.addActionListener(this::botaoCriarProvaActionPerformed);
        botaoEditarProva.addActionListener(this::botaoEditarProvaActionPerformed);
        botaoEliminarProva.addActionListener(this::botaoEliminarProvaActionPerformed);
        botaoImportarProvas.addActionListener(this::botaoImportarProvasActionPerformed);
        botaoCancelarCriarProva.addActionListener(this::botaoGerirProvasActionPerformed);
        botaoCancelarEditarProva.addActionListener(this::botaoGerirProvasActionPerformed);
        botaoOkCriarProva.addActionListener(this::botaoOkCriarProvaActionPerformed);
        botaoOkEditarProva.addActionListener(this::botaoOkEditarProvaActionPerformed);
        gerirProvasLista.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                provaSelecionada = (Prova) gerirProvasLista.getSelectedValue();
                gerirProvasNome.setText(provaSelecionada.getNome());
                gerirProvasSexoParticipantes.setText(provaSelecionada.getSexoParticipantes());
            }
        });

        cardLayoutNormalPages.show(PainelPrincipal, "cardMenuPrincipal");

    }

    //------------------------------ MENU LATERAL/INICIAL ------------------------------

    private void botaoGerirEventosActionPerformed(ActionEvent e) {
        buildGerirEventosList();
    }

    private void botaoGerirAtletasActionPerformed(ActionEvent e) {
        cardLayoutNormalPages.show(PainelPrincipal, "cardGerir");
        cardLayoutGerir.show(conteudoGerir, "cardGerirAtletas");
        setElementsBackgroundColor(elementoGerirAtletas);
    }

    private void botaoGerirProvasActionPerformed(ActionEvent e) {
        buildGerirProvasList();
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
        adicionarEventoNome.setText("");
        adicionarEventoDataInicio.setText("");
        adicionarEventoDataFim.setText("");
        adicionarEventoLocal.setText("");
        adicionarEventoPais.setText("");
        selecionarProva.setModel(new DefaultComboBoxModel(listaProvas.toArray()));

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

    private void botaoAdicionarProvaActionPerformed(ActionEvent actionEvent) {
        if(listaProvasEvento.contains((Prova) selecionarProva.getSelectedItem())) {
            JOptionPane.showMessageDialog(new JFrame(), "Prova já adicionada!");
        }
        else {
            listaProvasEvento.add((Prova) selecionarProva.getSelectedItem());
        }
    }

    private void botaoRemoverProvaActionPerformed(ActionEvent actionEvent) {
        if(!listaProvasEvento.contains((Prova) selecionarProva.getSelectedItem())) {
            JOptionPane.showMessageDialog(new JFrame(), "O evento não tem esta prova!");
        }
        else {
            listaProvasEvento.remove((Prova) selecionarProva.getSelectedItem());
        }
    }

    private void botaoOkAdicionarEventoActionPerformed(ActionEvent actionEvent) {
        if (verifyEvent(adicionarEventoNome.getText(), adicionarEventoDataInicio.getText(), adicionarEventoDataFim.getText(), adicionarEventoLocal.getText(), adicionarEventoPais.getText())) {
            Evento evento = new Evento(adicionarEventoNome.getText(), Data.parse(adicionarEventoDataInicio.getText()), Data.parse(adicionarEventoDataFim.getText()), adicionarEventoLocal.getText(), adicionarEventoPais.getText());
            for (Prova prova : listaProvasEvento) {
                evento.adicionarProva(prova);
            }
            listaEventos.add(evento);

            buildGerirEventosList();
        }
    }

    private boolean verifyEvent(String nome, String dataInicio, String dataFim, String local, String pais) {
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Tem de preencher o nome!");
        } else if(dataInicio.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Tem de preencher a data de ínicio!");
        } else {
            Data data = null;
            try {
                data = Data.parse(dataInicio);
                if (dataFim.isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Tem de preencher a data de fim!");
                } else {
                    try {
                        data = Data.parse(dataFim);
                        if (local.isEmpty()) {
                            JOptionPane.showMessageDialog(new JFrame(), "Tem de preencher o local do evento!");
                        } else if (pais.isEmpty()) {
                            JOptionPane.showMessageDialog(new JFrame(), "Tem de preencher o país do evento!");
                        } else if (listaProvasEvento.isEmpty()) {
                            JOptionPane.showMessageDialog(new JFrame(), "Tem de adicionar provas ao evento!");
                        } else {
                            return true;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(new JFrame(), "Data tem de ser no formato dd/mm/yyyy");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(new JFrame(), "Data tem de ser no formato dd/mm/yyyy");
            }
        }
        return false;
    }

    private void buildGerirEventosList() {
        DefaultListModel gerirEventosListModel = new DefaultListModel();
        for (Evento evento : listaEventos) {
            gerirEventosListModel.addElement(evento);
        }
        gerirEventosLista.setModel(gerirEventosListModel);
        gerirEventosLista.setBorder(BorderFactory.createLineBorder(Color.black));
        setCurrentGerirEventos();
    }

    private void setCurrentGerirEventos() {
        gerirEventosNome.setText("");
        gerirEventosDataInicio.setText("");
        gerirEventosDataFim.setText("");
        gerirEventosLocal.setText("");
        gerirEventosPais.setText("");
        gerirEventosLista.clearSelection();
        eventoSelecionado = null;
        cardLayoutNormalPages.show(PainelPrincipal, "cardGerir");
        cardLayoutGerir.show(conteudoGerir, "cardGerirEventos");
        setElementsBackgroundColor(elementoGerirEventos);
    }


    //------------------------------ GERIR PROVAS ------------------------------

    private void botaoCriarProvaActionPerformed(ActionEvent actionEvent) {
        nomeCriarProva.setText("");
        tipoPontuacaoComboBox.setModel(new DefaultComboBoxModel(TipoPontuacao.values()));
        sexoParticipantesComboBox.setModel(new DefaultComboBoxModel(SexoParticipantes.values()));
        cardLayoutNormalPages.show(PainelPrincipal, "cardCriarProva");
    }

    private void botaoEditarProvaActionPerformed(ActionEvent actionEvent) {
        if(provaSelecionada == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Tem de selecionar uma prova!");
        }
        else {
            editarProvaNome.setText("");
            editarProvaTipoPontuacao.setModel(new DefaultComboBoxModel(TipoPontuacao.values()));
            editarProvaSexoParticipantes.setModel(new DefaultComboBoxModel(SexoParticipantes.values()));
            cardLayoutNormalPages.show(PainelPrincipal, "cardEditarProva");

            editarProvaNome.setText(provaSelecionada.getNome());
            for (int i = 0; i < TipoPontuacao.values().length; i++) {
                if(provaSelecionada.getTipoPontuacao() == TipoPontuacao.values()[i].toString()){
                    editarProvaTipoPontuacao.setSelectedIndex(i);
                }
            }
            for (int i = 0; i < SexoParticipantes.values().length; i++) {
                if(provaSelecionada.getTipoPontuacao() == SexoParticipantes.values()[i].toString()){
                    editarProvaSexoParticipantes.setSelectedIndex(i);
                }
            }
        }
    }

    private void botaoEliminarProvaActionPerformed(ActionEvent actionEvent) {
        if(provaSelecionada == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Tem de selecionar uma prova!");
        }
        else {
            listaProvas.remove(provaSelecionada);
            JOptionPane.showMessageDialog(null, "A prova foi eliminada com sucesso!");
            buildGerirProvasList();
        }
    }

    private void botaoImportarProvasActionPerformed(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Filler Text");
    }

    private void botaoOkCriarProvaActionPerformed(ActionEvent actionEvent) {
        if (nomeCriarProva.getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Tem de preencher o nome!");
        }
        else {
            Prova prova = new Prova(nomeCriarProva.getText(), sexoParticipantesComboBox.getSelectedItem().toString(), tipoPontuacaoComboBox.getSelectedItem().toString());
            listaProvas.add(prova);

            buildGerirProvasList();
        }
    }

    public void botaoOkEditarProvaActionPerformed(ActionEvent actionEvent) {
        if (editarProvaNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Tem de preencher o nome!");
        }
        else {
            provaSelecionada.setNome(editarProvaNome.getText());
            provaSelecionada.setSexoParticipantes(editarProvaSexoParticipantes.getSelectedItem().toString());
            provaSelecionada.setTipoPontuacao(editarProvaTipoPontuacao.getSelectedItem().toString());

            buildGerirProvasList();
        }
    }

    private void buildGerirProvasList() {
        DefaultListModel gerirProvasListModel = new DefaultListModel();
        for (Prova prova : listaProvas) {
            gerirProvasListModel.addElement(prova);
        }
        gerirProvasLista.setModel(gerirProvasListModel);
        gerirProvasLista.setBorder(BorderFactory.createLineBorder(Color.black));
        setCurrentGerirProvas();
    }

    private void setCurrentGerirProvas() {
        gerirProvasNome.setText("");
        gerirProvasSexoParticipantes.setText("");
        gerirProvasLista.clearSelection();
        provaSelecionada = null;
        cardLayoutNormalPages.show(PainelPrincipal, "cardGerir");
        cardLayoutGerir.show(conteudoGerir, "cardGerirProvas");
        setElementsBackgroundColor(elementoGerirProvas);
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
