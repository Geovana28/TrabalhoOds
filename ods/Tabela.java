package ods;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ods.ConsultaMaterial;

public class Tabela {

    public static void main(String[] args) {
        JFrame janelaPrincipal = new JFrame("Reciclagem - Menu Principal");
        janelaPrincipal.setSize(500, 400); 
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setLayout(null);

        JButton botaoReciclagem = new JButton("Informações sobre Reciclagem");
        botaoReciclagem.setBounds(100, 70, 300, 30);
        botaoReciclagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarJanelaReciclagem();
            }
        });

        JButton botaoAterros = new JButton("Problemas dos Aterros");
        botaoAterros.setBounds(100, 130, 300, 30);
        botaoAterros.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarJanelaAterros();
            }
        });

        JButton botaoConsultaMaterial = new JButton("Consulta de Materiais");
        botaoConsultaMaterial.setBounds(100, 190, 300, 30);
        botaoConsultaMaterial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarJanelaConsultaMaterial();
            }
        });

        janelaPrincipal.add(botaoReciclagem);
        janelaPrincipal.add(botaoAterros);
        janelaPrincipal.add(botaoConsultaMaterial);
        janelaPrincipal.setVisible(true);
    }

    private static void mostrarJanelaReciclagem() {
        JFrame janelaReciclagem = new JFrame("Informações sobre Reciclagem");
        janelaReciclagem.setSize(700, 600); 
        janelaReciclagem.setLayout(null);

        String textoReciclagem = "Benefícios Reciclagem\n"
                + "A reciclagem traz uma série de benefícios para o meio ambiente, contribuindo para um futuro mais sustentável. "
                + "Alguns dos principais benefícios incluem:\n\n"
                + "- Conservação dos recursos naturais\n"
                + "- Redução da poluição\n"
                + "- Diminuição da quantidade de lixo em aterros sanitários\n"
                + "- Economia de energia\n"
                + "- Proteção da biodiversidade\n"
                + "- Combate às mudanças climáticas\n\n"
                + "Em resumo, a reciclagem é uma prática fundamental para a preservação do meio ambiente e para a construção de um futuro mais sustentável.";

        JTextArea labelInfo = new JTextArea(textoReciclagem);
        labelInfo.setBounds(20, 20, 600, 500);
        labelInfo.setLineWrap(true); 
        labelInfo.setWrapStyleWord(true);  
        labelInfo.setEditable(false); 
        janelaReciclagem.add(labelInfo);

        janelaReciclagem.setVisible(true);
    }

    private static void mostrarJanelaAterros() {
        JFrame janelaAterros = new JFrame("Problemas dos Aterros");
        janelaAterros.setSize(700, 600); 
        janelaAterros.setLayout(null);

        String textoAterros = "Lixões e Aterros Sanitários\n\n"
                + "Lixões: Locais onde resíduos são depositados sem controle, causando contaminação do solo e da água, "
                + "além de proliferação de doenças e gases poluentes.\n\n"
                + "Aterros Sanitários: Projetados para reduzir impactos ambientais, possuem sistemas de impermeabilização de solo, "
                + "coleta de chorume e captação de gases. Após o encerramento, podem ser recuperados e utilizados para outras finalidades.\n\n"
                + "Vantagens dos Aterros Sanitários:\n"
                + "- Reduzem contaminação do solo e da água\n"
                + "- Controlam a emissão de gases\n"
                + "- Geram energia a partir do biogás produzido.";

        JTextArea labelInfo = new JTextArea(textoAterros);
        labelInfo.setBounds(20, 20, 650, 500);
        labelInfo.setLineWrap(true);  
        labelInfo.setWrapStyleWord(true); 
        labelInfo.setEditable(false); 
        janelaAterros.add(labelInfo);

        janelaAterros.setVisible(true);
    }
    private static void mostrarJanelaConsultaMaterial() {
        JFrame janelaConsulta = new JFrame("Consulta de Materiais");
        janelaConsulta.setSize(500, 400); 
        janelaConsulta.setLayout(null);

        JLabel labelPrompt = new JLabel("Digite o material:");
        labelPrompt.setBounds(20, 20, 150, 30);
        janelaConsulta.add(labelPrompt);

        JTextField campoMaterial = new JTextField();
        campoMaterial.setBounds(20, 60, 300, 30);
        janelaConsulta.add(campoMaterial);

        JButton botaoConsultar = new JButton("Consultar");
        botaoConsultar.setBounds(330, 60, 100, 30);
        botaoConsultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String material = campoMaterial.getText();
                if (material.isEmpty()) {
                    JOptionPane.showMessageDialog(janelaConsulta, "Por favor, insira o nome de um material para consulta.");
                } else {
                	
                    String informacoes = ConsultaMaterial.obterInformacoes(material);
                    JOptionPane.showMessageDialog(janelaConsulta, informacoes);
                }
            }
        });
        janelaConsulta.add(botaoConsultar);

        janelaConsulta.setVisible(true);
    }
}
