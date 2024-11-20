package ods;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import ods.*;

public class InformacoesReciclagem {

	public static void mostrarJanelaReciclagem() {
        JFrame janelaReciclagem = new JFrame("O que é Reciclagem?");
        janelaReciclagem.setSize(800, 700);
        janelaReciclagem.setLayout(null);
        janelaReciclagem.setLocationRelativeTo(null);

        JLabel labelTexto = new JLabel("<html>"
                + "<h3>A Importância da Reciclagem no Nosso Dia a Dia</h3>"
                + "<p>A reciclagem é uma prática fundamental para a preservação do meio ambiente e para a construção de um futuro mais sustentável. "
                + "Ao reciclarmos materiais como papel, plástico, vidro e metal, estamos dando um novo destino a esses resíduos, reduzindo a quantidade "
                + "de lixo enviada para aterros sanitários e contribuindo para a conservação dos recursos naturais.</p>"
                + "<h4>Por que a reciclagem é tão importante?</h4>"
                + "<ul>"
                + "  <li><strong>Preservação do Meio Ambiente:</strong> A reciclagem diminui a necessidade de extração de matérias-primas virgens, "
                + "reduzindo a pressão sobre ecossistemas e biodiversidade. Além disso, reduz emissões de gases do efeito estufa.</li>"
                + "  <li><strong>Conservação de Recursos Naturais:</strong> Reutilizar materiais economiza água e energia, recursos cada vez mais escassos.</li>"
                + "  <li><strong>Redução da Poluição:</strong> Diminui a quantidade de lixo nos oceanos, rios e solos, protegendo a água, o solo e a vida marinha.</li>"
                + "  <li><strong>Criação de Empregos:</strong> A indústria de reciclagem gera oportunidades de emprego e renda para muitas comunidades.</li>"
                + "  <li><strong>Economia Financeira:</strong> Pode reduzir os custos com coleta e tratamento de lixo para governos e empresas.</li>"
                + "</ul>"
                + "<h4>Como podemos adotar a reciclagem no dia a dia?</h4>"
                + "<ul>"
                + "  <li><strong>Separe o Lixo:</strong> Classifique materiais recicláveis, orgânicos e não recicláveis.</li>"
                + "  <li><strong>Informe-se:</strong> Conheça os tipos de materiais recicláveis e as regras de coleta seletiva da sua cidade.</li>"
                + "  <li><strong>Reduza o Consumo:</strong> Prefira produtos reutilizáveis e evite embalagens excessivas.</li>"
                + "  <li><strong>Reutilize:</strong> Utilize garrafas de água, sacolas de tecido e outros utensílios duráveis.</li>"
                + "  <li><strong>Incentive:</strong> Divulgue a importância da reciclagem para amigos, familiares e colegas.</li>"
                + "</ul>"
                + "</html>");
        
        labelTexto.setBounds(20, 20, 600,500);
        janelaReciclagem.add(labelTexto);
        

        JButton botaoNext = new JButton("Próximo");
        botaoNext.setBounds(600, 600, 150, 40);
        botaoNext.setBackground(new Color(102, 205, 170));
        botaoNext.setForeground(Color.WHITE);
        botaoNext.setFont(new Font("Arial", Font.BOLD, 16));
        botaoNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                janelaReciclagem.dispose(); 
                JanelaImportancia.mostrarJanelaImportancia(); 
            }
        });
        janelaReciclagem.add(botaoNext);

        janelaReciclagem.setVisible(true);
    }

	public static void mostrarJanelaMensagemFinal() {
		
	}
}