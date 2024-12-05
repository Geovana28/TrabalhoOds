package ods;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import ods.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class JanelaEmpresas {

	   public static void mostrarJanelaEmpresas() {
	        JFrame janelaEmpresas = new JFrame("Empresas que Fazem Coleta Seletiva");
	        janelaEmpresas.setSize(900, 750); 
	        janelaEmpresas.setLayout(null);
	        janelaEmpresas.setLocationRelativeTo(null);

	        JLabel labelTexto = new JLabel("<html>"
	                + "<h3>Empresas que Fazem Coleta Seletiva</h3>"
	                + "<p>Conheça algumas empresas que realizam a coleta seletiva e ajudam a construir um futuro mais sustentável.</p>"
	                + "</html>");
	        labelTexto.setBounds(20, 20, 840, 60);
	        labelTexto.setFont(new Font("Arial", Font.ITALIC, 14));  
	        janelaEmpresas.add(labelTexto);

	        JLabel labelDrogaRaia = new JLabel("<html>"
    + "<strong><h4>Droga Raia</h4>"
    + "<p>1. Incentivo ao descarte correto:</p>"
    + "<ul>"
    + "<li>Medicamentos: Oferece pontos de coleta para descarte seguro de medicamentos vencidos ou sem uso.</li>"
    + "<li>Pilhas: Programa de logística reversa para pilhas e baterias.</li>"
    + "</ul>"
    + "<p>2. Redução do impacto ambiental:</p>"
    + "<ul>"
    + "<li>Cupom digital: Reduz o consumo de papel e incentiva o plantio de árvores.</li>"
    + "<li>Sacolas retornáveis: Promove o uso de sacolas reutilizáveis.</li>"
    + "</ul>"
    + "<p>3. Compromisso social:</p>"
    + "<ul>"
    + "<li>Revista Sorria: Recursos revertidos para projetos sociais, como o GRAACC.</li>"
    + "<li>Comunidades ribeirinhas: Parte das vendas da linha Vegan by Needs apoia comunidades fornecedoras de matérias-primas.</li>"
    + "</ul></strong>"
    + "</html>");
	        labelDrogaRaia.setBounds(20, 100, 820, 230); 
	        labelDrogaRaia.setFont(new Font("Arial", Font.ITALIC, 12)); 
	        janelaEmpresas.add(labelDrogaRaia);

	        JLabel linkDrogaRaia = new JLabel("<html><a href=''>Sustentabilidade - Droga Raia</a></html>");
	        linkDrogaRaia.setBounds(20, 350, 300, 20); 
	        linkDrogaRaia.setForeground(Color.BLUE);
	        linkDrogaRaia.setCursor(new Cursor(Cursor.HAND_CURSOR));
	        linkDrogaRaia.addMouseListener(new MouseAdapter() {
	           
	            public void mouseClicked(MouseEvent e) {
	                try {
	                    Desktop.getDesktop().browse(new URI("https://www.drogaraia.com.br/sustentabilidade#descarte-consciente"));
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
	            }
	        });
	        janelaEmpresas.add(linkDrogaRaia);

	        JLabel labelBoticario = new JLabel("<html>"
	                + "<h4>O Boticário</h4>"
	                + "<p>A campanha <strong>Boti Recicla</strong> incentiva os clientes a reciclar embalagens vazias de cosméticos. "
	                + "Ao trazer 3 ou mais embalagens para as lojas, clientes Clube Viva ganham R$15 de desconto em compras acima de R$150.</p>"
	                + "</html>");
	        labelBoticario.setBounds(20, 380, 800, 80); 
	        labelBoticario.setFont(new Font("Arial", Font.ITALIC, 12)); 
	        janelaEmpresas.add(labelBoticario);

	        JLabel linkBoticario = new JLabel("<html><a href=''>Boti Recicla - O Boticário</a></html>");
	        linkBoticario.setBounds(20, 470, 300, 20); 
	        linkBoticario.setForeground(Color.BLUE);
	        linkBoticario.setCursor(new Cursor(Cursor.HAND_CURSOR));
	        linkBoticario.addMouseListener(new MouseAdapter() {
	           
	            public void mouseClicked(MouseEvent e) {
	                try {
	                    Desktop.getDesktop().browse(new URI("https://www.boticario.com.br/boti-recicla/"));
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
	            }
	        });
	        janelaEmpresas.add(linkBoticario);

	        JLabel labelNatura = new JLabel("<html>"
	                + "<h4>Natura</h4>"
	                + "<p>Na entrega de 5 embalagens vazias para reciclagem, você garante um desconto de 10% na próxima compra. "
	                + "A promoção vale para lojas físicas e no site.</p>"
	                + "</html>");
	        labelNatura.setBounds(20, 500, 800, 80); 
	        labelNatura.setFont(new Font("Arial", Font.ITALIC, 12)); 
	        janelaEmpresas.add(labelNatura);

	        JLabel linkNatura = new JLabel("<html><a href=''>Programa de Reciclagem - Natura</a></html>");
	        linkNatura.setBounds(20, 590, 300, 20); 
	        linkNatura.setForeground(Color.BLUE);
	        linkNatura.setCursor(new Cursor(Cursor.HAND_CURSOR));
	        linkNatura.addMouseListener(new MouseAdapter() {
	           
	            public void mouseClicked(MouseEvent e) {
	                try {
	                    Desktop.getDesktop().browse(new URI("https://www.natura.com.br/logistica-reversa/"));
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
	            }
	        });
	        janelaEmpresas.add(linkNatura);

	        JButton botaoNext = new JButton("Próximo");
	        botaoNext.setBounds(720, 600, 120, 40); 
	        botaoNext.setBackground(new Color(102, 205, 170));
	        botaoNext.setForeground(Color.WHITE);
	        botaoNext.setFont(new Font("Arial", Font.BOLD, 16));
	        botaoNext.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                janelaEmpresas.dispose();
	                mostrarJanelaQuiz();
	            }
	        });
	        janelaEmpresas.add(botaoNext);

	        janelaEmpresas.setVisible(true);
	    }
	   public static void mostrarJanelaQuiz() {
		    QuizReciclagem.mostrarJanelaQuiz();
		}
	   
		public void actionPerformed(ActionEvent e) {
		    ConsultaMaterial material = new ConsultaMaterial();
		    material.mostrarJanelaConsultaMaterial();
		}
}
