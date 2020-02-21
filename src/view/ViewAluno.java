package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ViewAluno {

	private JFrame janela;
	private JPanel painelDaJanela;
	private JLabel jlNome;
	private JTextField txNome;
	private JLabel jlMatricula;
	private JTextField txMatricula;
	private JLabel jlDtNasc;
	private JTextField txDtNasc;
	private JLabel jlLogradouro;
	private JTextField txLogradouro;
	private JLabel jlNumero;
	private JTextField txNumero;
	private JLabel jlComplemento;
	private JTextField txComplemento;
	private JLabel jlCEP;
	private JTextField txCEP;
	private JLabel jlResult;
	private JTextField txResult;
	private JLabel jlRG;
	private JTextField txRG;
	private JLabel jlCPF;
	private JTextField txCPF;
	private JLabel jlTelefone;
	private JTextField txTelefone;
	private JButton save;
	private JButton cancel;
	private JLabel jlSexo;
	private JLabel jlBarra;
	private JLabel jlSenha;
	private JRadioButton masc;
	private JRadioButton femin;
	private ButtonGroup grpSexo;
	private JPasswordField jpwSenha;
	private JLabel jlCidade;
	private JComboBox cbCidade;
	private String[] cidade = { "Osasco", "ourinhos", "Barueri", "Guaruja" };
	private JLabel jlEstado;
	private JComboBox cbEstado;
	private String[] estado = { "SP-São Paulo" };

	public void janelaAluno() {

		// instancias da tela
		janela = new JFrame("Cadastro Aluno");
		painelDaJanela = (JPanel) janela.getContentPane();

		// instancias JLabel
		jlNome = new JLabel();
		jlSexo = new JLabel();
		jlMatricula = new JLabel();
		jlDtNasc = new JLabel();
		jlLogradouro = new JLabel();
		jlNumero = new JLabel();
		jlComplemento = new JLabel();
		jlRG = new JLabel();
		jlCPF = new JLabel();
		jlTelefone = new JLabel();
		jlCEP = new JLabel();
		jlResult = new JLabel();
		jlBarra = new JLabel();
		jlSenha = new JLabel();
		jlCidade = new JLabel();
		jlEstado = new JLabel();

		// instancias TextField
		txNome = new JTextField();
		txMatricula = new JTextField();
		txDtNasc = new JTextField();
		txLogradouro = new JTextField();
		txNumero = new JTextField();
		txCEP = new JTextField();
		txRG = new JTextField();
		txCPF = new JTextField();
		txTelefone = new JTextField();

		// instancias RadioButton
		masc = new JRadioButton();
		femin = new JRadioButton();
		grpSexo = new ButtonGroup();

		// instancias ComboBox
		cbCidade = new JComboBox(cidade);
		cbEstado = new JComboBox(estado);

		// instancias botões de ação
		save = new JButton();
		cancel = new JButton();

		// instancias da Senha
		jpwSenha = new JPasswordField();

		// -----------=======FIM DAS INSTANCIAS=======-----------//
		// confirmar
		save.setText("Confirmar");
		save.setBounds(220, 260, 100, 30);
		save.setBackground(new Color(254, 141, 78));
		save.setForeground(Color.BLACK);
		// cancelar
		cancel.setText("Cancelar");
		cancel.setBounds(360, 260, 100, 30);
		cancel.setBackground(new Color(254, 141, 78));
		cancel.setForeground(Color.BLACK);

		// adicionar função do botao Salvar
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cadastro concluido");
			}
		});
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cadastro Cancelado");
			}
		});

		/////////////////////////////////////////// - + - +
		/// -- - -- ///************- +
		/// ---- - DADOS DO PESSOAIS -- ///********************- + - +
		/// - -- -- - -///***********- + - +
		/////////////////////////////////////////// - + + -

		// adiciona os botões ao grupo
		grpSexo.add(masc);
		grpSexo.add(femin);

		// label nome e campo do nome
		jlNome.setText("Nome:");
		jlNome.setBounds(30, 30, 40, 25);
		jlNome.setForeground(new Color(254, 141, 79));
		txNome.setBounds(70, 30, 310, 25);
		txNome.setBackground(new Color(17, 17, 36));
		txNome.setForeground(Color.WHITE);

		// label data de nascimento e campo com mascara
		jlDtNasc.setText("Data Nascimento:");
		jlDtNasc.setBounds(30, 65, 110, 25);
		jlDtNasc.setForeground(new Color(254, 141, 79));
		txDtNasc = new JTextField();
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("  ##/##/####");
			txDtNasc = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txDtNasc.setBounds(140, 65, 100, 25);
		txDtNasc.setBackground(new Color(17, 17, 36));
		txDtNasc.setForeground(Color.WHITE);

		// label RG e CPF

		// RG
		jlRG.setText("RG:");
		jlRG.setBounds(263, 65, 60, 25);
		jlRG.setForeground(new Color(254, 141, 79));
		txRG = new JTextField();
		try {
			javax.swing.text.MaskFormatter dt1 = new javax.swing.text.MaskFormatter("  ##.###.###-A");
			txRG = new javax.swing.JFormattedTextField(dt1);
		} catch (Exception e) {
		}
		txRG.setBounds(290, 65, 90, 25);
		txRG.setBackground(new Color(17, 17, 36));
		txRG.setForeground(Color.WHITE);

		// CPF
		jlCPF.setText("CPF:");
		jlCPF.setBounds(405, 65, 60, 25);
		jlCPF.setForeground(new Color(254, 141, 79));
		txCPF = new JTextField();
		try {
			javax.swing.text.MaskFormatter dt2 = new javax.swing.text.MaskFormatter("  ###.###.###-##");
			txCPF = new javax.swing.JFormattedTextField(dt2);
		} catch (Exception e) {
		}
		txCPF.setBounds(435, 65, 100, 25);
		txCPF.setBackground(new Color(17, 17, 36));
		txCPF.setForeground(Color.WHITE);

		// grupo de opções
		jlSexo.setText("Sexo:");
		jlSexo.setBounds(450, 35, 40, 25);
		jlSexo.setForeground(new Color(254, 141, 79));
		masc.setText("Masculino");
		masc.setBounds(490, 35, 90, 25);
		masc.setForeground(Color.WHITE);
		masc.setBackground(new Color(28, 28, 56));
		femin.setText("Feminino");
		femin.setBounds(580, 35, 90, 25);
		femin.setForeground(Color.WHITE);
		femin.setBackground(new Color(28, 28, 56));

		// MATRICULA
		jlMatricula.setText("N° Matricula:");
		jlMatricula.setBounds(30, 100, 80, 25);
		jlMatricula.setForeground(new Color(254, 141, 79));

		txMatricula = new JTextField();
		try {
			javax.swing.text.MaskFormatter dt4 = new javax.swing.text.MaskFormatter("  ########-#");
			txMatricula = new javax.swing.JFormattedTextField(dt4);
		} catch (Exception e) {
		}
		txMatricula.setBounds(110, 100, 85, 25);
		txMatricula.setBackground(new Color(17, 17, 36));
		txMatricula.setForeground(Color.WHITE);

		// TELEFONE
		jlTelefone.setText("Telefone:");
		jlTelefone.setBounds(220, 100, 80, 25);
		jlTelefone.setForeground(new Color(254, 141, 79));
		txTelefone = new JTextField();
		try {
			javax.swing.text.MaskFormatter dt4 = new javax.swing.text.MaskFormatter("  (##)####-####");
			txTelefone = new javax.swing.JFormattedTextField(dt4);
		} catch (Exception e) {
		}
		txTelefone.setBounds(280, 100, 100, 25);
		txTelefone.setBackground(new Color(17, 17, 36));
		txTelefone.setForeground(Color.WHITE);

		// SENHA
		jlSenha.setText("Senha:");
		jlSenha.setBounds(435, 100, 80, 25);
		jlSenha.setForeground(new Color(254, 141, 79));
		jpwSenha.setBackground(new Color(17, 17, 36));
		jpwSenha.setBounds(480, 100, 100, 25);
		jpwSenha.setForeground(Color.white);

		// ---------====FIM DOS DADOS DE PESSOAS====---------//

		/////////////////////////////////////////// - + - +
		/// -- - -- ///************- +
		/// ---- - DADOS DO ENDEREÇO -- ///********************- + - +
		/// - -- -- - -///***********- + - +
		/////////////////////////////////////////// - + + -

		// LOGRADOURO
		jlLogradouro.setText("Logradouro:");
		jlLogradouro.setBounds(30, 160, 70, 25);
		jlLogradouro.setForeground(new Color(254, 141, 79));
		txLogradouro.setBounds(105, 160, 370, 25);
		txLogradouro.setBackground(new Color(17, 17, 36));
		txLogradouro.setForeground(Color.WHITE);

		// numero do endereço
		jlNumero.setText("Numero:");
		jlNumero.setBounds(505, 160, 60, 25);
		jlNumero.setForeground(new Color(254, 141, 79));
		txNumero = new JTextField();
		try {
			javax.swing.text.MaskFormatter dt3 = new javax.swing.text.MaskFormatter("  #####");
			txNumero = new javax.swing.JFormattedTextField(dt3);
		} catch (Exception e) {
		}
		txNumero.setBounds(560, 160, 100, 25);
		txNumero.setBackground(new Color(17, 17, 36));
		txNumero.setForeground(Color.WHITE);

		// config combo box
		jlCidade.setText("Cidade:");
		jlCidade.setBounds(30, 200, 50, 30);
		jlCidade.setForeground(new Color(254, 141, 79));
		cbCidade.setSelectedIndex(-1);
		cbCidade.setBounds(105, 200, 200, 25);
		cbCidade.setMaximumRowCount(10);

		// config combo box
		jlEstado.setText("Estado:");
		jlEstado.setBounds(390, 200, 50, 30);
		jlEstado.setForeground(new Color(254, 141, 79));
		cbEstado.setSelectedIndex(-1);
		cbEstado.setBounds(460, 200, 200, 25);
		cbEstado.setMaximumRowCount(10);

		// --------====FIM DOS DADOS DE ENDEREÇO====--------//

		//
		//
		//
		// Barra de separação dados pessoais e endereço
		jlBarra.setText(
				"_______________________________________________________________________________________________");
		jlBarra.setForeground(new Color(254, 141, 79));
		jlBarra.setBounds(20, 130, 710, 20);
		//
		//
		//
		//

		// configurar painel
		painelDaJanela.setLayout(null);
		painelDaJanela.setBackground(new Color(28, 28, 56));
		painelDaJanela.add(jlNome);
		painelDaJanela.add(txNome);
		painelDaJanela.add(jlSexo);
		painelDaJanela.add(masc);
		painelDaJanela.add(femin);
		painelDaJanela.add(jlDtNasc);
		painelDaJanela.add(txDtNasc);
		painelDaJanela.add(jlRG);
		painelDaJanela.add(txRG);
		painelDaJanela.add(jlCPF);
		painelDaJanela.add(txCPF);
		painelDaJanela.add(jlMatricula);
		painelDaJanela.add(txMatricula);
		painelDaJanela.add(jlBarra);
		painelDaJanela.add(jlLogradouro);
		painelDaJanela.add(txLogradouro);
		painelDaJanela.add(jlCEP);
		painelDaJanela.add(txCEP);
		painelDaJanela.add(jlTelefone);
		painelDaJanela.add(txTelefone);
		painelDaJanela.add(jlNumero);
		painelDaJanela.add(txNumero);
		painelDaJanela.add(jlSenha);
		painelDaJanela.add(jpwSenha);
		painelDaJanela.add(cbCidade);
		painelDaJanela.add(cbEstado);
		painelDaJanela.add(jlCidade);
		painelDaJanela.add(jlEstado);
		painelDaJanela.add(save);
		painelDaJanela.add(cancel);

		// configurar tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(new Dimension(720, 350));
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);

	}

	public static void main(String[] args) {
		new ViewAluno().janelaAluno();
	}

}
