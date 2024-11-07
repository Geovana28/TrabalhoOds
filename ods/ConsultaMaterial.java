package ods;

import javax.swing.*;

public class ConsultaMaterial {


	    public static String obterInformacoes(String material) {
	    	
	        material = material.trim().toLowerCase();
	        
	        switch (material) {
	            case "papel":
	                return "O papel pode ser reciclado e transformado em novos produtos como papel reciclado, embalagens e mais.";
	            case "plastico":
	                return "O plástico pode ser reciclado para criar novos produtos como garrafas e outros itens de plástico.";
	            case "vidro":
	                return "O vidro pode ser reciclado infinitamente, sendo reutilizado para produzir novos vidros.";
	            case "metal":
	                return "Os metais, como o alumínio, podem ser reciclados e reutilizados para diversos fins.";
	            default:
	                return "Material não encontrado. Por favor, insira um material válido.";
	        }
	    }
	}

