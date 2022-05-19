package CollectionsJava;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Exemplo911 {
    public static void main(String[] args) {

        List<String> Ligacao911 = new ArrayList<>();
        Ligacao911.add("1 - Crimes com vítimas");
        Ligacao911.add("2 - Resgates");
        Ligacao911.add("3 - Assaltos ou furtos");
        Ligacao911.add("4 - Outros");

        List<String> Crime = new ArrayList<>();
        Crime.add("Telefonou para a vítima? Digite 1 para Sim ou 2 para Não.");
        Crime.add("Esteve no local do crime? Digite 1 para Sim ou 2 para Não.");
        Crime.add("Mora perto da vítima? Digite 1 para Sim ou 2 para Não.");
        Crime.add("Devia para a vítima? Digite 1 para Sim ou 2 para Não.");
        Crime.add("Já trabalhou com a vítima? Digite 1 para Sim ou 2 para Não.");

        int ligacao;
        int crimeOpcoes;
        int countYes = 0;
        int countNo = 0;

        ligacao = Integer.parseInt(JOptionPane.showInputDialog("911! Qual motivo da sua ligação? Escolha uma opção: " + "\n" + Ligacao911.get(0) + "\n" + Ligacao911.get(1) + "\n" + Ligacao911.get(2) + "\n" + Ligacao911.get(3), JOptionPane.QUESTION_MESSAGE));
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
                JOptionPane.showMessageDialog(null, "Você está listado como suspeito! A delegacia já foi informada, se apresente ou irão te apreender em casa.");
            } if (countYes == 3 || countYes == 4){
                JOptionPane.showMessageDialog(null, "Você está listado como cúmplice! A delegacia já foi informada, se apresente ou irão te apreender em casa.");
            } if (countYes == 5){
                JOptionPane.showMessageDialog(null, "Você está listado como assassino! A delegacia já foi informada da sua localização e estão a caminho para te apreender.");
            } if (countNo >= 1 && countYes < 2){
                JOptionPane.showMessageDialog(null, "Você é inocente! Estamos registrando seu contato e já iremos te atender.");
            }

        } if (ligacao == 2) {
            JOptionPane.showMessageDialog(null, "Você está sendo transferido para o atendimento dos bombeiros.");
        } if (ligacao == 3) {
            JOptionPane.showMessageDialog(null, "Você está sendo transferirdo para o atendimento da polícia civil.");
        } if (ligacao == 4) {
            JOptionPane.showMessageDialog(null, "Você será transferido para o atendimento.");
        }
    }
}
