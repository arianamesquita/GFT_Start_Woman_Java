package CollectionsJava;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Exemplo911 {
    public static void main(String[] args) {

        List<String> Ligacao911 = new ArrayList<>();
        Ligacao911.add("1 - Crimes com v�timas");
        Ligacao911.add("2 - Resgates");
        Ligacao911.add("3 - Assaltos ou furtos");
        Ligacao911.add("4 - Outros");

        List<String> Crime = new ArrayList<>();
        Crime.add("Telefonou para a v�tima? Digite 1 para Sim ou 2 para N�o.");
        Crime.add("Esteve no local do crime? Digite 1 para Sim ou 2 para N�o.");
        Crime.add("Mora perto da v�tima? Digite 1 para Sim ou 2 para N�o.");
        Crime.add("Devia para a v�tima? Digite 1 para Sim ou 2 para N�o.");
        Crime.add("J� trabalhou com a v�tima? Digite 1 para Sim ou 2 para N�o.");

        int ligacao;
        int crimeOpcoes;
        int countYes = 0;
        int countNo = 0;

        ligacao = Integer.parseInt(JOptionPane.showInputDialog("911! Qual motivo da sua liga��o? Escolha uma op��o: " + "\n" + Ligacao911.get(0) + "\n" + Ligacao911.get(1) + "\n" + Ligacao911.get(2) + "\n" + Ligacao911.get(3), JOptionPane.QUESTION_MESSAGE));
        if (ligacao == 1) {
            crimeOpcoes = Integer.parseInt(JOptionPane.showInputDialog(Crime.get(0)));
            if (crimeOpcoes == 1){
                countYes += 1;
            } else {
                countNo += 1;
            }
            crimeOpcoes = Integer.parseInt(JOptionPane.showInputDialog(Crime.get(1)));
            if (crimeOpcoes == 1){
                countYes += 1;
            } else {
                countNo += 1;
            }
            crimeOpcoes = Integer.parseInt(JOptionPane.showInputDialog(Crime.get(2)));
            if (crimeOpcoes == 1){
                countYes += 1;
            } else {
                countNo += 1;
            }
            crimeOpcoes = Integer.parseInt(JOptionPane.showInputDialog(Crime.get(3)));
            if (crimeOpcoes == 1){
                countYes += 1;
            } else {
                countNo += 1;
            }
            crimeOpcoes = Integer.parseInt(JOptionPane.showInputDialog(Crime.get(4)));
            if (crimeOpcoes == 1){
                countYes += 1;
            } else {
                countNo += 1;
            }

            if (countYes == 2){
                JOptionPane.showMessageDialog(null, "Voc� est� listado como suspeito! A delegacia j� foi informada, se apresente ou ir�o te apreender em casa.");
            } if (countYes == 3 || countYes == 4){
                JOptionPane.showMessageDialog(null, "Voc� est� listado como c�mplice! A delegacia j� foi informada, se apresente ou ir�o te apreender em casa.");
            } if (countYes == 5){
                JOptionPane.showMessageDialog(null, "Voc� est� listado como assassino! A delegacia j� foi informada da sua localiza��o e est�o a caminho para te apreender.");
            } if (countNo >= 1 && countYes < 2){
                JOptionPane.showMessageDialog(null, "Voc� � inocente! Estamos registrando seu contato e j� iremos te atender.");
            }

        } if (ligacao == 2) {
            JOptionPane.showMessageDialog(null, "Voc� est� sendo transferido para o atendimento dos bombeiros.");
        } if (ligacao == 3) {
            JOptionPane.showMessageDialog(null, "Voc� est� sendo transferirdo para o atendimento da pol�cia civil.");
        } if (ligacao == 4) {
            JOptionPane.showMessageDialog(null, "Voc� ser� transferido para o atendimento.");
        }
    }
}
