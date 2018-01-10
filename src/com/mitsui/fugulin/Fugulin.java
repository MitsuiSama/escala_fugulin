/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitsui.fugulin;

import com.mitsui.fugulin.model.Selectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author mitsui
 */
public class Fugulin extends javax.swing.JFrame {

    /**
     * Creates new form Fugulin
     */
    private final DefaultListModel<Selectable> estadoMentalModel;
    private final DefaultListModel<Selectable> oxigenacaoModel;
    private final DefaultListModel<Selectable> sinaisVitaisModel;
    private final DefaultListModel<Selectable> motilidadeModel;
    private final DefaultListModel<Selectable> deambulacaoModel;
    private final DefaultListModel<Selectable> alimentacaoModel;
    private final DefaultListModel<Selectable> cuidadoCorporalModel;
    private final DefaultListModel<Selectable> eliminacaoModel;
    private final DefaultListModel<Selectable> terapeuticaModel;
    private final DefaultListModel<Selectable> integridadeModel;
    private final DefaultListModel<Selectable> curativoModel;
    private final DefaultListModel<Selectable> tempoCurativoModel;
    private final List<JList<Selectable>> jListList;
    private ListSelectionListener listSelectionListener;

    public Fugulin() {
        initComponents();
        //
        estadoMentalModel = new DefaultListModel<>();
        oxigenacaoModel = new DefaultListModel<>();
        sinaisVitaisModel = new DefaultListModel<>();
        motilidadeModel = new DefaultListModel<>();
        deambulacaoModel = new DefaultListModel<>();
        alimentacaoModel = new DefaultListModel<>();
        cuidadoCorporalModel = new DefaultListModel<>();
        eliminacaoModel = new DefaultListModel<>();
        terapeuticaModel = new DefaultListModel<>();
        integridadeModel = new DefaultListModel<>();
        curativoModel = new DefaultListModel<>();
        tempoCurativoModel = new DefaultListModel<>();
        jListList = new ArrayList<>();
        setUp();
        setUpList();
        setUpListeners();
    }

    private void setUp() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Graduação da Complexidade Assistencial - Fugulin");
        //this.setResizable(false);
        this.jTextFieldCategoria.setEditable(false);
        this.jTextFieldPontuacao.setEditable(false);
    }

    private void setUpList() {
        // EstadoMental
        estadoMentalModel.addElement(new Selectable("Orientação no tempo e no espaço", 1));
        estadoMentalModel.addElement(new Selectable("Períodos de desorientação no tempo e no espaço", 2));
        estadoMentalModel.addElement(new Selectable("Períodos de inconsciência", 3));
        estadoMentalModel.addElement(new Selectable("Inconsciente", 4));
        jListEstadoMental.setModel(estadoMentalModel);

        //Oxigenacao
        oxigenacaoModel.addElement(new Selectable("Não depende de oxigênio", 1));
        oxigenacaoModel.addElement(new Selectable("Uso intermitente de máscara ou cateter de oxigênio", 2));
        oxigenacaoModel.addElement(new Selectable("Uso contínuo de máscara ou cateter de oxigênio", 3));
        oxigenacaoModel.addElement(new Selectable("Ventilação mecânica(uso de ventilador a pressão ou volume)", 4));
        jListOxigenacao.setModel(oxigenacaoModel);

        // Sinais Vitais
        sinaisVitaisModel.addElement(new Selectable("Controle de rotinas 8 horas", 1));
        sinaisVitaisModel.addElement(new Selectable("Controle em intervalos de 6 horas", 2));
        sinaisVitaisModel.addElement(new Selectable("Controle em  intervalos de 4 horas", 3));
        sinaisVitaisModel.addElement(new Selectable("Controle de intervalos menores a duas horas", 4));
        jListSinaisVitais.setModel(sinaisVitaisModel);

        // Motilidade
        motilidadeModel.addElement(new Selectable("Movimenta todos os segmentos corporais .", 1));
        motilidadeModel.addElement(new Selectable("Limitação de movimentos .Porém movimenta sem auxílio .", 2));
        motilidadeModel.addElement(new Selectable("Dificuldade para movimentar segmentos corporais. Mudança de decúbitos e movimentação passiva auxiliada pela enfermagem", 3));
        motilidadeModel.addElement(new Selectable("Incapaz de movimentar qualquer semento corporal .dificuldade para movimentar segmentos corporais.", 4));
        jListMotilidade.setModel(motilidadeModel);

        //deambulacao
        deambulacaoModel.addElement(new Selectable("Ambulante.", 1));
        deambulacaoModel.addElement(new Selectable("Necessita de auxílio para deambular", 2));
        deambulacaoModel.addElement(new Selectable("Locomoção através de cadeira de rodas", 3));
        deambulacaoModel.addElement(new Selectable("Restrito no leito", 4));
        jListDeambulacao.setModel(deambulacaoModel);

        // Alimentacao
        alimentacaoModel.addElement(new Selectable("Auto suficiente", 1));
        alimentacaoModel.addElement(new Selectable("Via oral com auxílio", 2));
        alimentacaoModel.addElement(new Selectable("Através de sonda nasogástrica", 3));
        alimentacaoModel.addElement(new Selectable("Através de cateter central", 4));
        jListAlimentacao.setModel(alimentacaoModel);

        // Cuidado Corporal
        cuidadoCorporalModel.addElement(new Selectable("Auto suficiente.", 1));
        cuidadoCorporalModel.addElement(new Selectable("Auxílio no banho de chuveiro e/ou higiene oral .", 2));
        cuidadoCorporalModel.addElement(new Selectable("Banho de chuveiro , higiene oral realizada pela  enfermagem", 3));
        cuidadoCorporalModel.addElement(new Selectable("Banho no leito, higiene oral , realizada pela enfermagem", 4));
        jListCuidadoCorporal.setModel(cuidadoCorporalModel);

        //
        eliminacaoModel.addElement(new Selectable("Auto suficiente.", 1));
        eliminacaoModel.addElement(new Selectable("Uso de vaso sanitário com auxílio .", 2));
        eliminacaoModel.addElement(new Selectable("Uso de comadre ou eliminações no leito .", 3));
        eliminacaoModel.addElement(new Selectable("Evacuação no leito e uso de sonda vesical para controle da diurese .", 4));
        jListEliminacao.setModel(eliminacaoModel);

        terapeuticaModel.addElement(new Selectable("IM. Ou VO.", 1));
        terapeuticaModel.addElement(new Selectable("E.V. intermitente", 2));
        terapeuticaModel.addElement(new Selectable("E.V contínuo ou através de sonda nasogástrica .", 3));
        terapeuticaModel.addElement(new Selectable("Uso de drogas vaso ativas para manutenção de PA.", 4));
        jListTerapeutica.setModel(terapeuticaModel);

        integridadeModel.addElement(new Selectable("Pele íntegra.", 1));
        integridadeModel.addElement(new Selectable("Presença de alteração da cor da pele (equimose, hiperemia) e/ou presença de solução de continuidade da pele envolvendo a epiderme a  derme ou ambas.", 2));
        integridadeModel.addElement(new Selectable("Presença de solução dle continuidade da pele, envolvendo tecido subcutâneo e músculo. Incisão cirúrgica. Ostomias. Drenos.", 3));
        integridadeModel.addElement(new Selectable("Presença de solução de continuidade da pele c/ destruição da derme, epiderme, músculos e comprometimento das estruturas de suporte como tendões e cápsulas.Eviscerações.", 4));
        jListIntegridade.setModel(integridadeModel);

        curativoModel.addElement(new Selectable("Sem curativo ou limpeza da ferida /incisão cirúrgica , realizada pelo paciente durante o banho .", 1));
        curativoModel.addElement(new Selectable("Curativo realizado 1 vez ao dia pela enfermagem", 2));
        curativoModel.addElement(new Selectable("Curativo realizado 2 vezes ao dia , pela enfermagem .", 3));
        curativoModel.addElement(new Selectable("Curativo realizado 3 vezes ao dia ou mais, pela equipe de enfermagem", 4));
        jListCurativo.setModel(curativoModel);

        tempoCurativoModel.addElement(new Selectable("Sem curativo ou limpeza da ferida realizada durante o banho .", 1));
        tempoCurativoModel.addElement(new Selectable("Entre 5 e 15 minutos", 2));
        tempoCurativoModel.addElement(new Selectable("Entre 15 e 30 minutos", 3));
        tempoCurativoModel.addElement(new Selectable("Superior a 30 minutos", 4));
        jListTempoCurativo.setModel(tempoCurativoModel);

        jListList.add(jListEstadoMental);
        jListList.add(jListOxigenacao);
        jListList.add(jListSinaisVitais);
        jListList.add(jListMotilidade);
        jListList.add(jListDeambulacao);
        jListList.add(jListAlimentacao);
        jListList.add(jListCuidadoCorporal);
        jListList.add(jListEliminacao);
        jListList.add(jListTerapeutica);
        jListList.add(jListIntegridade);
        jListList.add(jListCurativo);
        jListList.add(jListTempoCurativo);
    }

    private void setUpListeners() {
        listSelectionListener = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                generateScore();
            }
        };
        for (JList list : jListList) {
            list.addListSelectionListener(listSelectionListener);
        }

        jButtonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearSelection();
            }
        });
        
        jButtonSobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                About about = new About(null, true);
                about.setVisible(true);
            }
        });

    }

    private boolean checkItemSelection() {
        int count = 0;
        for (JList<Selectable> list : this.jListList) {
            count++;
            if (list.getSelectedIndex() == -1) {
                return false;
            }
        }
        if (count < 12) {
            return false;
        }

        return true;
    }

    private void generateScore() {
        if (checkItemSelection()) {
            int score = 0;
            for (JList<Selectable> list : this.jListList) {
                score += list.getSelectedValue().getValue();
            }
            jTextFieldPontuacao.setText(String.valueOf(score));
            String cuidado = "";
            if (score <= 17) {
                cuidado = "Cuidado Mínimo";
            } else if (score > 17 && score <= 22) {
                cuidado = "Cuidado Inntermediário";
            } else if (score > 22 && score <= 28) {
                cuidado = "Cuidado de Alta Dependênia";
            } else if (score > 28 && score <= 34) {
                cuidado = "Cuidado Semi-Intensivo";
            } else if (score > 34) {
                cuidado = "Cuidado Intensivo";
            }
            jTextFieldCategoria.setText(cuidado);

        } else {
            jTextFieldPontuacao.setText("0");
            jTextFieldCategoria.setText("");
        }
    }

    private void clearSelection() {
        for (JList list : jListList) {
            list.clearSelection();
        }
        jTextFieldCategoria.setText("");
        jTextFieldPontuacao.setText("0");
        jTabbedPane1.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        JPanelSinaisVitais = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListSinaisVitais = new javax.swing.JList<>();
        JPanelOxigenacao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListOxigenacao = new javax.swing.JList<>();
        JPanelEstadoMental = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListEstadoMental = new javax.swing.JList<>();
        JPanelAlimentacao = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListAlimentacao = new javax.swing.JList<>();
        JPanelEliminacao = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jListEliminacao = new javax.swing.JList<>();
        JPanelTerapeutica = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jListTerapeutica = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        JPanelMotilidade = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListMotilidade = new javax.swing.JList<>();
        JPanelIntegridade = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jListIntegridade = new javax.swing.JList<>();
        JPanelDeambulacao = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListDeambulacao = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        JPanelCuidadoCorporal = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListCuidadoCorporal = new javax.swing.JList<>();
        JPanelCurativo = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jListCurativo = new javax.swing.JList<>();
        JPanelTempoCurativo = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jListTempoCurativo = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPontuacao = new javax.swing.JTextField();
        jTextFieldCategoria = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSobre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanelSinaisVitais.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sinais Vitais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jScrollPane3.setViewportView(jListSinaisVitais);

        javax.swing.GroupLayout JPanelSinaisVitaisLayout = new javax.swing.GroupLayout(JPanelSinaisVitais);
        JPanelSinaisVitais.setLayout(JPanelSinaisVitaisLayout);
        JPanelSinaisVitaisLayout.setHorizontalGroup(
            JPanelSinaisVitaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );
        JPanelSinaisVitaisLayout.setVerticalGroup(
            JPanelSinaisVitaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelSinaisVitaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );

        JPanelOxigenacao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Oxigenação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jScrollPane1.setViewportView(jListOxigenacao);

        javax.swing.GroupLayout JPanelOxigenacaoLayout = new javax.swing.GroupLayout(JPanelOxigenacao);
        JPanelOxigenacao.setLayout(JPanelOxigenacaoLayout);
        JPanelOxigenacaoLayout.setHorizontalGroup(
            JPanelOxigenacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );
        JPanelOxigenacaoLayout.setVerticalGroup(
            JPanelOxigenacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelOxigenacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JPanelEstadoMental.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Estado Mental", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jScrollPane2.setViewportView(jListEstadoMental);

        javax.swing.GroupLayout JPanelEstadoMentalLayout = new javax.swing.GroupLayout(JPanelEstadoMental);
        JPanelEstadoMental.setLayout(JPanelEstadoMentalLayout);
        JPanelEstadoMentalLayout.setHorizontalGroup(
            JPanelEstadoMentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );
        JPanelEstadoMentalLayout.setVerticalGroup(
            JPanelEstadoMentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEstadoMentalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );

        JPanelAlimentacao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Alimentação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jScrollPane6.setViewportView(jListAlimentacao);

        javax.swing.GroupLayout JPanelAlimentacaoLayout = new javax.swing.GroupLayout(JPanelAlimentacao);
        JPanelAlimentacao.setLayout(JPanelAlimentacaoLayout);
        JPanelAlimentacaoLayout.setHorizontalGroup(
            JPanelAlimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );
        JPanelAlimentacaoLayout.setVerticalGroup(
            JPanelAlimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelAlimentacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );

        JPanelEliminacao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Eliminação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jScrollPane10.setViewportView(jListEliminacao);

        javax.swing.GroupLayout JPanelEliminacaoLayout = new javax.swing.GroupLayout(JPanelEliminacao);
        JPanelEliminacao.setLayout(JPanelEliminacaoLayout);
        JPanelEliminacaoLayout.setHorizontalGroup(
            JPanelEliminacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10)
        );
        JPanelEliminacaoLayout.setVerticalGroup(
            JPanelEliminacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEliminacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );

        JPanelTerapeutica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Terapêutica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jScrollPane11.setViewportView(jListTerapeutica);

        javax.swing.GroupLayout JPanelTerapeuticaLayout = new javax.swing.GroupLayout(JPanelTerapeutica);
        JPanelTerapeutica.setLayout(JPanelTerapeuticaLayout);
        JPanelTerapeuticaLayout.setHorizontalGroup(
            JPanelTerapeuticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11)
        );
        JPanelTerapeuticaLayout.setVerticalGroup(
            JPanelTerapeuticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTerapeuticaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JPanelSinaisVitais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanelOxigenacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanelEstadoMental, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JPanelAlimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanelEliminacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanelTerapeutica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelEstadoMental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanelOxigenacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanelSinaisVitais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JPanelEliminacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPanelTerapeutica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JPanelAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Sinais Vitais,Oxigenação,Estado Mental, Alimentação, Eliminação e Terapêutica", jPanel1);

        JPanelMotilidade.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Motilidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jScrollPane4.setViewportView(jListMotilidade);

        javax.swing.GroupLayout JPanelMotilidadeLayout = new javax.swing.GroupLayout(JPanelMotilidade);
        JPanelMotilidade.setLayout(JPanelMotilidadeLayout);
        JPanelMotilidadeLayout.setHorizontalGroup(
            JPanelMotilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
        );
        JPanelMotilidadeLayout.setVerticalGroup(
            JPanelMotilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelMotilidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );

        JPanelIntegridade.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Integridade cutaneomucosa /comprometimento tecidual ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jScrollPane12.setViewportView(jListIntegridade);

        javax.swing.GroupLayout JPanelIntegridadeLayout = new javax.swing.GroupLayout(JPanelIntegridade);
        JPanelIntegridade.setLayout(JPanelIntegridadeLayout);
        JPanelIntegridadeLayout.setHorizontalGroup(
            JPanelIntegridadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
        );
        JPanelIntegridadeLayout.setVerticalGroup(
            JPanelIntegridadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelIntegridadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );

        JPanelDeambulacao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Deambulação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jScrollPane5.setViewportView(jListDeambulacao);

        javax.swing.GroupLayout JPanelDeambulacaoLayout = new javax.swing.GroupLayout(JPanelDeambulacao);
        JPanelDeambulacao.setLayout(JPanelDeambulacaoLayout);
        JPanelDeambulacaoLayout.setHorizontalGroup(
            JPanelDeambulacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );
        JPanelDeambulacaoLayout.setVerticalGroup(
            JPanelDeambulacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDeambulacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JPanelMotilidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanelDeambulacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JPanelIntegridade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelDeambulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanelMotilidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPanelIntegridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Motilidade,Deambulação e Integridade Cutaneomucosa", jPanel2);

        JPanelCuidadoCorporal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cuidado Corporal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        JPanelCuidadoCorporal.setPreferredSize(new java.awt.Dimension(869, 121));

        jScrollPane7.setViewportView(jListCuidadoCorporal);

        javax.swing.GroupLayout JPanelCuidadoCorporalLayout = new javax.swing.GroupLayout(JPanelCuidadoCorporal);
        JPanelCuidadoCorporal.setLayout(JPanelCuidadoCorporalLayout);
        JPanelCuidadoCorporalLayout.setHorizontalGroup(
            JPanelCuidadoCorporalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        JPanelCuidadoCorporalLayout.setVerticalGroup(
            JPanelCuidadoCorporalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCuidadoCorporalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        JPanelCurativo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Curativo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        JPanelCurativo.setPreferredSize(new java.awt.Dimension(869, 121));

        jScrollPane13.setViewportView(jListCurativo);

        javax.swing.GroupLayout JPanelCurativoLayout = new javax.swing.GroupLayout(JPanelCurativo);
        JPanelCurativo.setLayout(JPanelCurativoLayout);
        JPanelCurativoLayout.setHorizontalGroup(
            JPanelCurativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13)
        );
        JPanelCurativoLayout.setVerticalGroup(
            JPanelCurativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelCurativoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
        );

        JPanelTempoCurativo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tempo realizado na realização de curativos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jScrollPane14.setViewportView(jListTempoCurativo);

        javax.swing.GroupLayout JPanelTempoCurativoLayout = new javax.swing.GroupLayout(JPanelTempoCurativo);
        JPanelTempoCurativo.setLayout(JPanelTempoCurativoLayout);
        JPanelTempoCurativoLayout.setHorizontalGroup(
            JPanelTempoCurativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14)
        );
        JPanelTempoCurativoLayout.setVerticalGroup(
            JPanelTempoCurativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTempoCurativoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Categoria de Cuidado - Pontuação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Pontuação");

        jLabel3.setText("Categoria");

        jTextFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");

        jButtonSobre.setText("Sobre");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSobre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLimpar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JPanelTempoCurativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelCuidadoCorporal, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelCurativo, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPanelCurativo, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(JPanelCuidadoCorporal, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelTempoCurativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cuidado Corporal e Curativo", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoriaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fugulin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fugulin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fugulin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fugulin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fugulin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelAlimentacao;
    private javax.swing.JPanel JPanelCuidadoCorporal;
    private javax.swing.JPanel JPanelCurativo;
    private javax.swing.JPanel JPanelDeambulacao;
    private javax.swing.JPanel JPanelEliminacao;
    private javax.swing.JPanel JPanelEstadoMental;
    private javax.swing.JPanel JPanelIntegridade;
    private javax.swing.JPanel JPanelMotilidade;
    private javax.swing.JPanel JPanelOxigenacao;
    private javax.swing.JPanel JPanelSinaisVitais;
    private javax.swing.JPanel JPanelTempoCurativo;
    private javax.swing.JPanel JPanelTerapeutica;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<Selectable> jListAlimentacao;
    private javax.swing.JList<Selectable> jListCuidadoCorporal;
    private javax.swing.JList<Selectable> jListCurativo;
    private javax.swing.JList<Selectable> jListDeambulacao;
    private javax.swing.JList<Selectable> jListEliminacao;
    private javax.swing.JList<Selectable> jListEstadoMental;
    private javax.swing.JList<Selectable> jListIntegridade;
    private javax.swing.JList<Selectable> jListMotilidade;
    private javax.swing.JList<Selectable> jListOxigenacao;
    private javax.swing.JList<Selectable> jListSinaisVitais;
    private javax.swing.JList<Selectable> jListTempoCurativo;
    private javax.swing.JList<Selectable> jListTerapeutica;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldPontuacao;
    // End of variables declaration//GEN-END:variables
}
