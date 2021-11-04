package br.ucsal.app.view;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet.FontAttribute;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame {
	
	//JFRAME -> Layout Padrão é o BorderLayout
	// null -> devo definir a posição e tamonho de cada componente //não recomendado
	//FlowLayout -> Layout que respeita o tamanho dos componentes e permite que eu 
	//adicione qualquer numero de componentes a ele.
	
	
	public Janela(String titulo) {
		super(titulo);
		this.setLayout(new BorderLayout());
		//define o tamanho da tela
		this.setSize(400,300);
		final JTextField campo = new JTextField();
		final JEditorPane editor = new JEditorPane();
		
		JButton b1 = new JButton("Copiar");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				editor.setText(campo.getText());
			}
			
		});
		
		
		
		JButton b2 = new JButton("Limpar");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				campo.setText("");
			}
			
			
		});
		
		
		JButton b3 = new JButton("Sair");

		b3.addActionListener(new Sair());
		
		//FlowLayout
		JPanel botoes = new JPanel(new GridLayout(3,1));
		
		
		botoes.add(b1);
		botoes.add(b2);
		botoes.add(b3);
		
		JPanel lateral = new JPanel();
		
		lateral.add(botoes);
		
		this.add(lateral,BorderLayout.LINE_START);
		
		this.add(editor);

		this.add(campo,BorderLayout.PAGE_START);
		
		//Quando clicar no X saia
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//tornar a tela visivel 
		this.setVisible(true);
	}

	
	public static void main(String[] args) {
		
		JFrame janela = new Janela("Janela 1.0");
		
	}
}
