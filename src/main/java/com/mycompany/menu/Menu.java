package com.mycompany.menu;

import javax.swing.JOptionPane;
public class Menu {

    public static void main(String[] args) {
        Menu2 m = new Menu2();
        int opcao = 0;
        
    opcao = Integer.parseInt( JOptionPane.showInputDialog(""
            + "+++++++ Menu ++++++++\n"
            + "1. Média aritmética\n"
            + "2. Média ponderada\n"
            + "3. Sair"));
    if (opcao > 3 || opcao < 1){
        JOptionPane.showMessageDialog(null, "Opção inválida");
    }
        while (opcao < 3 || opcao >= 1){
        if (opcao == 1){
        m.n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota: "));
        m.n2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota: "));
        if (m.n1 < 0 || m.n1 > 10 || m.n2 < 0 || m.n2 > 10){
        JOptionPane.showMessageDialog(null, "Nota inválida");
        }
        else {
            JOptionPane.showMessageDialog(null, "Sua média é: "+m.mediaa());
            opcao = 3;
        }
        }
       if (opcao == 2){
       m.n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota (Peso 2): "));
       m.n2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota (Peso 3): "));
       m.n3 = Double.parseDouble(JOptionPane.showInputDialog("Terceira nota (Peso 4): "));
       
        if (m.n1 < 0 || m.n1 > 10 || m.n2 < 0 || m.n2 > 10 || m.n3 < 0 || m.n3 > 10){
        JOptionPane.showMessageDialog(null, "Nota inválida");
        }
        else {
            JOptionPane.showMessageDialog(null, "Sua média ponderada é: " +m.mediap());
            opcao = 3;
        }
       }
        }
        }
      }

