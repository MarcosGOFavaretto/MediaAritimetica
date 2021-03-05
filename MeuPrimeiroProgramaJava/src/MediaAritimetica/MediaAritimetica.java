/*
 * Programa exercício número 2 - Média
 * Autor: Marcos Gabriel De Oliveira Favaretto
 * Aula de D.S. 23/07/2019
 */
package MediaAritimetica;

import javax.swing.JOptionPane;

/**
 *
 * @author ETEC ALUNO
 */
public class MediaAritimetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float media;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota:"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
        media = (nota1 + nota2) / 2;
        JOptionPane.showMessageDialog(null, "A média do aluno é igual a: " + media, "ETEC", JOptionPane.WARNING_MESSAGE);
    }

}
