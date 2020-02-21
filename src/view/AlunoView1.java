//package view;
//
///**
// * classe pra configurar a janela
// * @author vbsantos
// * @since 19/02/20
// * @version 0.1
// */
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//
//import controller.AlunoController;
//import model.Aluno;
//import model.Data;
//
//public class AlunoView1 {
//
//	private JTextField txtNome;
//	private JButton botao1;
//	private JButton botao2;	
//	private JTextField txtMatricula;
//	private JTextField txtDataNasc;
//	private JTextField txtSexo;
//	private JFrame janela;
//
//	public void novaJanela() {
//		
//		// defininir tela e suas caracteristicas
//		JFrame janela = new JFrame();
//		janela.setTitle("Cadastro de Alunos");
//		janela.setSize(500, 300);
//		janela.getContentPane().setLayout(null);
//		janela.setLocationRelativeTo(null);
//	
//
//		// definir botão e suas caracteristicas 1
//		botao1 = new JButton();
//		botao1.setText("Salvar");
//		botao1.setBounds(140, 200, 100, 30);
//		botao1.addActionListener(new CadastroListener());
//		
//		// definir botão e suas caracteristicas 2
//		botao2 = new JButton();
//		botao2.setText("Cancelar");
//		botao2.setBounds(260, 200, 100, 30);
//		botao2.addActionListener(new CancelaListener());
//
//		// definir componente jlabel de rotulo
//		JLabel rotulo1 = new JLabel();
//		rotulo1.setText("Nome:");
//		rotulo1.setBounds(100, 40, 40, 20);
//		JLabel rotulo2 = new JLabel();
//		rotulo2.setText("N° Matricula:");
//		rotulo2.setBounds(64, 65, 100, 20);
//		JLabel rotulo3 = new JLabel();
//		rotulo3.setText("Data de nascimento:");
//		rotulo3.setBounds(20, 90, 120, 20);
//		JLabel rotulo4 = new JLabel();
//		rotulo4.setText("Sexo:");
//		rotulo4.setBounds(104, 115, 40, 20);
//
//		// definir campo de texto jtextfield
//		txtNome = new JTextField();
//		txtNome.setBounds(150, 40, 180, 20);
//		JTextField txtMatricula = new JTextField();
//		txtMatricula.setBounds(150, 65, 180, 20);
//		JTextField txtDataNasc = new JTextField();
//		txtDataNasc.setBounds(150, 90, 180, 20);
//		JTextField txtSexo = new JTextField();
//		txtSexo.setBounds(150, 115, 180, 20);
//
//		// adicionando componentes da tela
//		janela.getContentPane().add(botao1);
//		janela.getContentPane().add(botao2);
//		janela.getContentPane().add(txtNome);
//		janela.getContentPane().add(txtMatricula);
//		janela.getContentPane().add(txtDataNasc);
//		janela.getContentPane().add(txtSexo);
//		janela.getContentPane().add(rotulo1);
//		janela.getContentPane().add(rotulo2);
//		janela.getContentPane().add(rotulo3);
//		janela.getContentPane().add(rotulo4);
//
//		// visibilidade da janela
//		janela.setVisible(true);
//	}
//
//}
