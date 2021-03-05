/**
 * Programa: Média Aritimética.
 * Autor: Marcos Gabriel De Oliveira Favaretto.
 * Data: 23 de Julho de 2019.
 */
package MediaAritimetica;

import javax.swing.JOptionPane;

public class MediaAritimetica {

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