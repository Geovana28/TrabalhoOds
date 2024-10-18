import javax.swing.*;

public class Trabalho {
    public static void main(String[] args) {
        // Exibe a primeira janela perguntando sobre reciclagem
        int escolha = JOptionPane.showOptionDialog(null, 
            "Obrigado por usar nosso programa! Gostaria de saber mais sobre reciclagem e seus benefícios?", 
            "Reciclagem", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, null, null);
        
        // Se o usuário escolher "Sim"
        if (escolha == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, 
                "A reciclagem é uma prática fundamental para a preservação do meio ambiente e para a construção de um futuro mais sustentável. " +
                "Ao reciclar, estamos contribuindo para a conservação dos recursos naturais, a redução da poluição, a proteção da biodiversidade " +
                "e o combate às mudanças climáticas. Alguns dos principais benefícios incluem:\n\n" +
                "- Conservação dos recursos naturais\n" +
                "- Redução da poluição\n" +
                "- Diminuição da quantidade de lixo em aterros sanitários\n" +
                "- Economia de energia\n" +
                "- Proteção da biodiversidade\n" +
                "- Combate às mudanças climáticas\n");
            
            // Mostrar informações sobre lixões e aterros sanitários
            JOptionPane.showMessageDialog(null, 
                "Lixões e Aterros Sanitários: Um Contraste Essencial\n" +
                "Lixões são locais onde os resíduos são depositados de forma irregular e sem tratamento, enquanto aterros sanitários " +
                "são planejados para minimizar os impactos ambientais, utilizando tecnologias para evitar a contaminação do solo e da água.\n\n" +
                "Lixões: Contaminação do solo e água, proliferação de vetores de doenças, emissão de gases do efeito estufa.\n" +
                "Aterros Sanitários: Impermeabilização, coleta de chorume, captação de gases, cobertura diária.");
            
            // Mais uma mensagem sobre reciclagem na Coreia do Sul
            JOptionPane.showMessageDialog(null, 
                "A Coreia do Sul recicla cerca de 97% de seus resíduos, graças a um sistema eficiente de coleta e a uma população consciente. " +
                "Além disso, o governo oferece incentivos fiscais para quem recicla corretamente.");
            
            // Exibir uma última mensagem sobre o descarte adequado
            JOptionPane.showMessageDialog(null, 
                "O descarte adequado de lixo é fundamental. Itens como lixo eletrônico, lâmpadas e óleo de cozinha possuem pontos de coleta específicos. " +
                "Consulte a prefeitura de sua cidade para mais informações.");
        }

        // Perguntar qual material o usuário deseja descartar
        String material = JOptionPane.showInputDialog("Digite o nome do material que você deseja descartar:");
        
        // Verificar o tipo de material e informar o descarte correto
        if (material != null) {
            switch(material.toLowerCase()) {
                case "papel":
                    JOptionPane.showMessageDialog(null, "O papel deve ser descartado na lixeira azul.");
                    break;
                case "plástico":
                    JOptionPane.showMessageDialog(null, "O plástico deve ser descartado na lixeira vermelha.");
                    break;
                case "eletronico":
                    JOptionPane.showMessageDialog(null, "Lixo eletrônico deve ser levado a pontos de coleta especializados.");
                    break;
                case "orgânico":
                case "restos de comida":
                    JOptionPane.showMessageDialog(null, "Restos de comida como cascas de frutas podem ser usados para compostagem.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Material não reconhecido. Consulte as diretrizes locais.");
                    break;
            }
        }
    }
}
