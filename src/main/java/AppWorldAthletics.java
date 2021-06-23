import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    private JComboBox<Pais> adicionarEventoPais;
    private JComboBox selecionarProvaAdicionarEvento;
    private JButton botaoAdicionarProvaAdicionarEvento;
    private JButton botaoRemoverProvaAdicionarEvento;
    private JButton botaoOkAdicionarEvento;
    private JButton botaoCancelarCriarEvento;
    private JButton botaoOkEditarEvento;
    private JButton botaoCancelarEditarEvento;
    private JComboBox selecionarProvaEditarEvento;
    private JButton botaoAdicionarProvaEditarEvento;
    private JButton botaoRemoverProvaEditarEvento;
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
    private JList gerirAtletasList;
    private JButton botaoAdicionarAtleta;
    private JButton botaoInscreverAtleta;
    private JButton botaoImportarDados;
    private JButton botaoEditarAtleta;
    private JButton botaoCancelarInscricao;
    private JButton botaoConsultarHistorico;
    private JButton botaoProvasPorAtleta;
    private JButton botaoImportarInscricoes;
    private JButton botaoMelhorTempo;
    private JButton botaoCriarAtleta;
    private JButton botaoCancelarCriarAtleta;
    private JTextField textNomeAtleta;
    private JTextField textDataNascimento;
    private JTextField textContacto;
    private JComboBox<SexoParticipantes> listGenero;
    private JComboBox<Pais> listPais;
    private JList listProvasAssociadas;
    private JButton botaoDesinscrever;
    private JButton botaoCancelarDesisncricao;
    private JButton botaoOKInscreverAtleta;
    private JButton botaoCancelarIncreverAtleta;
    private JComboBox listInscricaoEvento;
    private JComboBox listInscricaoProva;
    private JTextField textMarcaAlcancada;
    private JButton botaoOKEditarAtleta;
    private JButton botaoCancelarEditarAtleta;
    private JComboBox listEditarPais;
    private JComboBox listEditarGenero;
    private JTextField textEditarNome;
    private JTextField textEditarDataNascimento;
    private JTextField textEditarContacto;
    private JTable tabelaRecordePessoal;
    private JButton botaoVoltarMelhorTempo;
    private JTable table2;
    private JTable tabelaHistorico;
    private JScrollPane scrollAtletas;
    private JButton botaoVoltar;
    private JTextField editarEventoNome;
    private JTextField editarEventoDataInicio;
    private JTextField editarEventoDataFim;
    private JTextField editarEventoLocal;
    private JTextField editarEventoPais;
    private JButton botaoVoltarProvasAtleta;


    private CardLayout cardLayoutGerir;
    private CardLayout cardLayoutNormalPages;
    private final JPanel[] elementos = {elementoGerirEventos, elementoGerirAtletas, elementoGerirProvas, elementoTopMedalhados};

    //Gerir Eventos
    private ArrayList<Evento> listaEventos = new ArrayList<>();
    private ArrayList<Prova> listaProvasEvento = new ArrayList<>();
    private Evento eventoSelecionado = null;
    private Map<String, Float> listaMinimosProvas = new HashMap<>();

    //Gerir Provas
    private ArrayList<Prova> listaProvas = new ArrayList<>();
    private Prova provaSelecionada = null;

    //Gerir Atletas
    private final ArrayList<Atleta> listaAtletas = new ArrayList<>();
    private int atletaSelecionado = -1;
    private int posicaoProva = -1;

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
        botaoAdicionarProvaAdicionarEvento.addActionListener(this::botaoAdicionarProvaActionPerformed);
        botaoRemoverProvaAdicionarEvento.addActionListener(this::botaoRemoverProvaActionPerformed);
        botaoOkAdicionarEvento.addActionListener(this::botaoOkAdicionarEventoActionPerformed);
        botaoOkEditarEvento.addActionListener(this::botaoOkEditarEventoActionPerformed);
        botaoAdicionarProvaEditarEvento.addActionListener(this::botaoAdicionarProvaActionPerformed);
        botaoRemoverProvaEditarEvento.addActionListener(this::botaoRemoverProvaActionPerformed);
        gerirEventosLista.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                eventoSelecionado = (Evento) gerirEventosLista.getSelectedValue();
                gerirEventosNome.setText(eventoSelecionado.getNome());
                gerirEventosDataInicio.setText(eventoSelecionado.getDataInicio().toString());
                gerirEventosDataFim.setText(eventoSelecionado.getDataFim().toString());
                gerirEventosLocal.setText(eventoSelecionado.getLocal());
                gerirEventosPais.setText(eventoSelecionado.getPais().toString());
            }
        });

        //Gerir Atletas
        botaoAdicionarAtleta.addActionListener(this::botaoAdicionarAtletaActionPerformed);
        botaoEditarAtleta.addActionListener(this::botaoEditarAtletaActionPerformed);
        botaoInscreverAtleta.addActionListener(this::botaoInscreverAtletaActionPerformed);
        botaoCancelarInscricao.addActionListener(this::botaoCancelarInscricaoActionPerformed);
        botaoImportarDados.addActionListener(this::botaoImportarDadosActionPerformed);
        botaoImportarInscricoes.addActionListener(this::botaoImportarInscricoesActionPerformed);
        botaoProvasPorAtleta.addActionListener(this::botaoProvasPorAtletaActionPerformed);
        botaoConsultarHistorico.addActionListener(this::botaoConsultarHistoricoActionPerformed);
        botaoMelhorTempo.addActionListener(this::botaoMelhorTempoActionPerformed);

        ///     Adicionar Atleta
        botaoCriarAtleta.addActionListener(this::botaoCriarAtletaActionPerformed);
        botaoCancelarCriarAtleta.addActionListener(this::botaoGerirAtletasActionPerformed);

        ///     Editar Atleta
        botaoOKEditarAtleta.addActionListener(this::botaoAlterarAtletaActionPerformed);
        botaoCancelarEditarAtleta.addActionListener(this::botaoGerirAtletasActionPerformed);

        ///     Inscrever Atleta
        botaoOKInscreverAtleta.addActionListener(this::botaoIncricaoActionPerformed);
        botaoCancelarIncreverAtleta.addActionListener(this::botaoGerirAtletasActionPerformed);

        ///     Cancelar Atleta
        botaoDesinscrever.addActionListener(this::botaoDesinscreverAtletaActionPerformed);
        botaoCancelarDesisncricao.addActionListener(this::botaoGerirAtletasActionPerformed);

        ///     Consultar Histórico
        botaoVoltar.addActionListener(this::botaoGerirAtletasActionPerformed);

        ///     Melhor Tempo
        botaoVoltarMelhorTempo.addActionListener(this::botaoGerirAtletasActionPerformed);

        ///     Provas por Atleta
        botaoVoltarProvasAtleta.addActionListener(this::botaoGerirAtletasActionPerformed);

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

    private void botaoGerirAtletasActionPerformed(ActionEvent e) { buildGerirAtletaList(); }

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
        adicionarEventoPais.setModel(new DefaultComboBoxModel(Pais.values()));
        selecionarProvaAdicionarEvento.setModel(new DefaultComboBoxModel(listaProvas.toArray()));

        cardLayoutNormalPages.show(PainelPrincipal, "cardAdicionarEvento");
    }

    private void botaoEditarEventoActionPerformed(ActionEvent actionEvent) {
        if(eventoSelecionado == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Tem de selecionar um evento!");
        } else {
            editarEventoNome.setText(eventoSelecionado.getNome());
            editarEventoDataInicio.setText(eventoSelecionado.getDataInicio().toString());
            editarEventoDataFim.setText(eventoSelecionado.getDataFim().toString());
            editarEventoLocal.setText(eventoSelecionado.getLocal());
            editarEventoPais.setModel(new DefaultComboBoxModel(Pais.values()));
            editarEventoPais.setSelectedItem(eventoSelecionado.getPais());
            selecionarProvaEditarEvento.setModel(new DefaultComboBoxModel(listaProvas.toArray()));

            cardLayoutNormalPages.show(PainelPrincipal, "cardEditarEvento");
        }
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
        if(listaProvas.isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Não existem provas!");
        } else {
            String input = JOptionPane.showInputDialog(new JFrame(), "Insira os minimos:");
            if(input != null && !input.isBlank()) {
                float minimo = Float.parseFloat(input);
                if (eventoSelecionado == null) {
                    Prova provaToAdd = (Prova) selecionarProvaAdicionarEvento.getSelectedItem();
                    if(listaProvasEvento.contains(provaToAdd)) {
                        JOptionPane.showMessageDialog(new JFrame(), "Prova já adicionada!");
                    } else {
                        listaProvasEvento.add(provaToAdd);
                        listaMinimosProvas.put(provaToAdd.getNome(), minimo);
                    }
                } else {
                    Prova provaToAdd = (Prova) selecionarProvaEditarEvento.getSelectedItem();
                    if(eventoSelecionado.isProvaAdicionada(provaToAdd)) {
                        JOptionPane.showMessageDialog(new JFrame(), "Prova já adicionada!");
                    } else {
                        eventoSelecionado.adicionarProva(provaToAdd);
                        eventoSelecionado.inserirMinimo(minimo, provaToAdd.getNome());
                    }
                }
            }
        }
    }

    private void botaoRemoverProvaActionPerformed(ActionEvent actionEvent) {
        Prova provaARemover = (Prova) selecionarProvaAdicionarEvento.getSelectedItem();
        if (eventoSelecionado == null) {
            if(!listaProvasEvento.contains(provaARemover)) {
                JOptionPane.showMessageDialog(new JFrame(), "O evento não tem esta prova!");
            }
            else {
                listaProvasEvento.remove(provaARemover);
                listaMinimosProvas.remove(provaARemover.getNome());
            }
        } else {
            if(!eventoSelecionado.isProvaAdicionada(provaARemover)) {
                JOptionPane.showMessageDialog(new JFrame(), "O evento não tem esta prova!");
            } else {
                eventoSelecionado.removerProva(provaARemover);
            }
        }

    }

    private void botaoOkAdicionarEventoActionPerformed(ActionEvent actionEvent) {
        if (verifyEvent(adicionarEventoNome.getText(), adicionarEventoDataInicio.getText(), adicionarEventoDataFim.getText(), adicionarEventoLocal.getText(), adicionarEventoPais.getSelectedItem())) {
            Evento evento = new Evento(adicionarEventoNome.getText(), Data.parse(adicionarEventoDataInicio.getText()), Data.parse(adicionarEventoDataFim.getText()), adicionarEventoLocal.getText(), (Pais) adicionarEventoPais.getSelectedItem());
            for (Prova prova : listaProvasEvento) {
                evento.adicionarProva(prova);
            }
            listaEventos.add(evento);
            evento.inserirMinimos(listaMinimosProvas);

            buildGerirEventosList();
        }
    }

    private void botaoOkEditarEventoActionPerformed(ActionEvent actionEvent) {
        if (verifyEvent(editarEventoNome.getText(), editarEventoDataInicio.getText(), editarEventoDataFim.getText(), editarEventoLocal.getText(), editarEventoPais.getSelectedItem())) {

            eventoSelecionado.setNome(editarEventoNome.getText());
            eventoSelecionado.setDataInicio(Data.parse(editarEventoDataInicio.getText()));
            eventoSelecionado.setDataFim(Data.parse(editarEventoDataFim.getText()));
            eventoSelecionado.setLocal(editarEventoLocal.getText());
            eventoSelecionado.setPais((Pais) editarEventoPais.getSelectedItem());

            buildGerirEventosList();
        }
    }

    private boolean verifyEvent(String nome, String dataInicio, String dataFim, String local, Object pais) {
        if (nome.isBlank() || dataInicio.isBlank() || dataFim.isBlank() || local.isBlank() || pais == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Tem de preencher todos os campos!");
        } else {
            Data data = null;
            try {
                data = Data.parse(dataInicio);
                try {
                    data = Data.parse(dataFim);
                    if(eventoSelecionado == null) {
                        if (listaProvasEvento.isEmpty()) {
                            JOptionPane.showMessageDialog(new JFrame(), "Tem de adicionar provas ao evento!");
                        } else {
                            return true;
                        }
                    } else {
                        if(eventoSelecionado.getListaProvas().isEmpty()) {
                            JOptionPane.showMessageDialog(new JFrame(), "Tem de adicionar provas ao evento!");
                        } else {
                            return true;
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(new JFrame(), "Data tem de ser no formato dd/mm/yyyy");
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
        listaProvasEvento.clear();
        cardLayoutNormalPages.show(PainelPrincipal, "cardGerir");
        cardLayoutGerir.show(conteudoGerir, "cardGerirEventos");
        setElementsBackgroundColor(elementoGerirEventos);
    }

    //------------------------------ GERIR ATLETAS -----------------------------------

    private void buildGerirAtletaList(){
        DefaultListModel gerirAtletasListModel = new DefaultListModel();
        for (Atleta atleta : listaAtletas){
            gerirAtletasListModel.addElement((atleta.getNome() + " "
                    + atleta.getGenero() + " " + atleta.getDataNascimento() + " "
                    + atleta.getPais() + " " + atleta.getContacto() + " "
                    + atleta.getnInscricoes() + " Prova(s) inscrita(s)"));
        }
        gerirAtletasList.setModel(gerirAtletasListModel);
        gerirAtletasList.setBorder((BorderFactory.createLineBorder(Color.black)));

        setCurrentGerirAtleta();
    }

    private void setCurrentGerirAtleta() {
        gerirAtletasList.clearSelection();
        atletaSelecionado = -1;
        cardLayoutNormalPages.show(PainelPrincipal, "cardGerir");
        cardLayoutGerir.show(conteudoGerir, "cardGerirAtletas");
        setElementsBackgroundColor(elementoGerirAtletas);
    }

    private void botaoAdicionarAtletaActionPerformed(ActionEvent actionEvent){
        cardLayoutNormalPages.show(PainelPrincipal, "cardAdicionarAtleta");
        textNomeAtleta.setText("");
        textDataNascimento.setText("");
        textContacto.setText("");
        listPais.setModel(new DefaultComboBoxModel(Pais.values()));
        listGenero.setModel(new DefaultComboBoxModel(SexoParticipantes.values()));
    }

    private void botaoEditarAtletaActionPerformed(ActionEvent actionEvent){
        atletaSelecionado = gerirAtletasList.getSelectedIndex();
        if (atletaSelecionado < 0){
            JOptionPane.showMessageDialog(new JFrame(), "Tem de selecionar um Atleta!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Atleta atleta = listaAtletas.get(atletaSelecionado);

        cardLayoutNormalPages.show(PainelPrincipal, "cardEditarAtleta");
        textEditarNome.setText(atleta.getNome());
        textEditarDataNascimento.setText(atleta.getDataNascimento().toString());
        textEditarContacto.setText((Long.toString(atleta.getContacto())));

        listEditarPais.setModel(new DefaultComboBoxModel(Pais.values()));
        listEditarGenero.setModel(new DefaultComboBoxModel(SexoParticipantes.values()));
        listEditarPais.setSelectedItem(atleta.getPais());
        listEditarGenero.setSelectedItem(atleta.getGenero());
    }

    private void botaoInscreverAtletaActionPerformed(ActionEvent actionEvent){
        atletaSelecionado = gerirAtletasList.getSelectedIndex();
        if (atletaSelecionado < 0){
            JOptionPane.showMessageDialog(new JFrame(), "Tem de selecionar um Atleta!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Atleta atleta = listaAtletas.get(atletaSelecionado);
        cardLayoutNormalPages.show(PainelPrincipal, "cardInscreverAtleta");
        textMarcaAlcancada.setText("");
        listInscricaoProva.setModel(new DefaultComboBoxModel(listaProvas.toArray()));
        listInscricaoEvento.setModel(new DefaultComboBoxModel(listaEventos.toArray()));
    }

    private void botaoCancelarInscricaoActionPerformed(ActionEvent actionEvent){
        atletaSelecionado = gerirAtletasList.getSelectedIndex();
        if (atletaSelecionado < 0){
            JOptionPane.showMessageDialog(new JFrame(), "Tem de selecionar um Atleta!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Atleta atleta = listaAtletas.get(atletaSelecionado);

        DefaultListModel provasAssociadas = new DefaultListModel();
        for (Prova prova: listaProvas){
            provasAssociadas.addElement(prova);
        }
        listProvasAssociadas.setModel(provasAssociadas);
        listProvasAssociadas.setBorder((BorderFactory.createLineBorder(Color.black)));
        cardLayoutNormalPages.show(PainelPrincipal, "cardCancelarInscricaoAtleta");
    }

    private void botaoImportarDadosActionPerformed(ActionEvent actionEvent){
        importarFicheiro();
        //TODO
    }

    private void botaoImportarInscricoesActionPerformed(ActionEvent actionEvent){
        importarFicheiro();
        //TODO
    }

    private void botaoProvasPorAtletaActionPerformed(ActionEvent actionEvent){
        atletaSelecionado = gerirAtletasList.getSelectedIndex();
        if (atletaSelecionado < 0){
            JOptionPane.showMessageDialog(new JFrame(), "Tem de selecionar um Atleta!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Atleta atleta = listaAtletas.get(atletaSelecionado);

        cardLayoutNormalPages.show(PainelPrincipal, "cardProvasAtleta");
    }

    private void botaoConsultarHistoricoActionPerformed(ActionEvent actionEvent){
        atletaSelecionado = gerirAtletasList.getSelectedIndex();
        if (atletaSelecionado < 0){
            JOptionPane.showMessageDialog(new JFrame(), "Tem de selecionar um Atleta!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Atleta atleta = listaAtletas.get(atletaSelecionado);

        //TODO
        tabelaHistorico = criarTabelaHistorico();
        cardLayoutNormalPages.show(PainelPrincipal, "cardConsultarHistoricoAtleta");
    }
    private void botaoMelhorTempoActionPerformed(ActionEvent actionEvent){
        atletaSelecionado = gerirAtletasList.getSelectedIndex();
        if (atletaSelecionado < 0){
            JOptionPane.showMessageDialog(new JFrame(), "Tem de selecionar um Atleta!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Atleta atleta = listaAtletas.get(atletaSelecionado);

        //TODO
        tabelaRecordePessoal = criarTabelRecordePessoal();
        cardLayoutNormalPages.show(PainelPrincipal, "cardMelhorTempoAtleta");
    }

    private void botaoCriarAtletaActionPerformed(ActionEvent actionEvent){
        if (verifyAtleta(textNomeAtleta.getText(), textDataNascimento.getText(), textContacto.getText(), listGenero.getSelectedItem(), listPais.getSelectedItem())){
            Atleta atleta = new Atleta(textNomeAtleta.getText(),(SexoParticipantes) listGenero.getSelectedItem(),
                    Data.parse(textDataNascimento.getText()), (Pais) listPais.getSelectedItem(),
                    Long.parseLong(textContacto.getText())
                    );
            listaAtletas.add(atleta);
            buildGerirAtletaList();
        }
    }

    private void botaoAlterarAtletaActionPerformed(ActionEvent actionEvent){
        if (verifyAtleta(textEditarNome.getText(), textEditarDataNascimento.getText(), textEditarContacto.getText(), listEditarGenero.getSelectedItem(), listEditarPais.getSelectedItem())){
            Atleta atleta = listaAtletas.get(atletaSelecionado);
            atleta.setNome(textEditarNome.getText());
            atleta.setGenero((SexoParticipantes) listEditarGenero.getSelectedItem());
            atleta.setDataNascimento(Data.parse(textEditarDataNascimento.getText()));
            atleta.setPais((Pais) listEditarPais.getSelectedItem());
            atleta.setContacto(Long.parseLong(textEditarContacto.getText()));

            JOptionPane.showMessageDialog(new JFrame(), "Atleta alterado com sucesso!");
            buildGerirAtletaList();
        }
    }

    private void botaoIncricaoActionPerformed(ActionEvent actionEvent){
        Atleta atleta = listaAtletas.get(atletaSelecionado);

        if (verifyIncricao(atleta, (Evento) listInscricaoEvento.getSelectedItem(), (Prova) listInscricaoProva.getSelectedItem(), textMarcaAlcancada.getText())){
            Inscricao inscricao = new Inscricao((Prova) listInscricaoProva.getSelectedItem(), (Evento) listInscricaoEvento.getSelectedItem(), atleta);
            JOptionPane.showMessageDialog(new JFrame(), "Atleta inscrito com sucesso!");

            listaAtletas.get(atletaSelecionado).inscrever(inscricao);
            buildGerirAtletaList();
        }
    }

    private void botaoDesinscreverAtletaActionPerformed(ActionEvent actionEvent){
        posicaoProva = listProvasAssociadas.getSelectedIndex();
        if (posicaoProva < 0){
            JOptionPane.showMessageDialog(new JFrame(), "Tem de selecionar uma Prova para anular a inscrição!");
            return;
        }
        //TODO


        JOptionPane.showMessageDialog(new JFrame(), "Inscrição do alteta na prova " + " (Placeholder) " + "anulada com sucesso!");
        buildGerirAtletaList();
    }



    private boolean verifyAtleta(String nome, String dataNascimento, String contacto, Object genero, Object pais){
        if (nome.isBlank() || dataNascimento.isBlank() || contacto.isBlank() || genero == null || pais == null){
            JOptionPane.showMessageDialog(new JFrame(), "Tem preencher os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else{
            Data data = null;
            try {
                data = Data.parse(dataNascimento);
                if (contacto.length() != 9){
                    JOptionPane.showMessageDialog(new JFrame(), "Deve inserir um número com 9 dígitos", "Erro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                long telefone = 0;
                try {
                    telefone = Long.parseLong(contacto);
                    for (Atleta atleta: listaAtletas){
                        if (atleta.equals(new Atleta(nome,(SexoParticipantes) genero, data,(Pais) pais, telefone))){
                            JOptionPane.showMessageDialog(new JFrame(), "O atleta já existe", "Erro", JOptionPane.ERROR_MESSAGE);
                            return false;
                        }
                    }
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(new JFrame(), "Deve inserir um número de 0-9 para o contacto", "Erro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }

            }
            catch (Exception e){
                JOptionPane.showMessageDialog(new JFrame(), "Data tem de ser no formato dd/mm/yyyy", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    private boolean verifyIncricao(Atleta atleta, Evento evento, Prova prova, String marcaAlcancada){
        if (evento == null){
            JOptionPane.showMessageDialog(new JFrame(), "Não selecionou um evento", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (prova == null){
            JOptionPane.showMessageDialog(new JFrame(), "Não selecionou uma prova", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!evento.isProvaAdicionada(prova)){
            JOptionPane.showMessageDialog(new JFrame(), "A prova não pertence a esse evento", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        float marca = 0;
        try {
            marca = Float.parseFloat(marcaAlcancada);
            if (marca < 0 || marca < evento.getMinimosProva(prova.getNome())){
                JOptionPane.showMessageDialog(new JFrame(), "A marca não atinge os mínimos", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "Deve inserir um número para a marca", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (atleta.getGenero().toString() != prova.getSexoParticipantes()){
            JOptionPane.showMessageDialog(new JFrame(), "O atleta não pode inscrever numa prova do sexo oposto", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (atleta.isIncrito(new Inscricao(prova, evento, atleta))){
            JOptionPane.showMessageDialog(new JFrame(), "O atleta já tá inscrito nessa prova", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
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
        if (nomeCriarProva.getText().isBlank()) {
            JOptionPane.showMessageDialog(new JFrame(), "Tem de preencher o nome!");
        }
        else {
            Prova prova = new Prova(nomeCriarProva.getText(), sexoParticipantesComboBox.getSelectedItem().toString(), tipoPontuacaoComboBox.getSelectedItem().toString());
            listaProvas.add(prova);

            buildGerirProvasList();
        }
    }

    public void botaoOkEditarProvaActionPerformed(ActionEvent actionEvent) {
        if (editarProvaNome.getText().isBlank()) {
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

    public void importarFicheiro() {
        JFileChooser fc = new JFileChooser(new java.io.File("."));
        int returnVal = fc.showOpenDialog(this);

        //TODO
        /*
        try {
            if (returnVal == JFileChooser.APPROVE_OPTION) {

            }
        } catch (IOException e1) {
            e1.printStackTrace(System.err);
        } catch (java.util.NoSuchElementException e2) {
            JOptionPane.showMessageDialog(this, "File format not valid", "Error!", JOptionPane.ERROR_MESSAGE);
        }
         */
    }

    private JTable criarTabelaHistorico(){
        String[] colunas = {"Evento", "Local do Evento", "Prova", "Resultado"};
        Object[][] dados;
        //TODO

        //JTable tabela = new JTable(dados, colunas);
        //tabela.setFillsViewportHeight(true);
        //return tabela;

        return null;
    }

    private JTable criarTabelRecordePessoal(){
        String[] colunas = {"Nome da Prova", "Evento", "Dia da Competição", "Melhor Tempo Obtido"};
        Object[][] dados;
        //TODO

        //JTable tabela = new JTable(dados, colunas);
        //tabela.setFillsViewportHeight(true);
        //return tabela;
        return null;
    }

    public static void main(String[] args) {
        new AppWorldAthletics().setVisible(true);
    }
}
