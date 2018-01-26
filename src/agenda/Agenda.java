/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Scanner;

/**
 *
 * @author Ubiratan
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Day dia = new Day();
        Month mes = new Month();
        Year ano = new Year();
        //**********************************************************************
        System.out.println("Digite uma data");
        dia.setDay(t.nextInt());
        //**********************************************************************
        System.out.println("Digite um mês");
        mes.setMonth(t.nextInt());
        //**********************************************************************
        System.out.println("Digite um ano");
        ano.setYear(t.nextInt());
        //**********************************************************************
        dia.imprimir();
        mes.imprimir();
        ano.imprimir();
        //**********************************************************************
        System.out.println("Data gerada: "+
                            dia.getDay()+
                            "/"+
                            mes.getMonth()+
                            "/"+
                            ano.getYear());
        //**********************************************************************
        
        
        // TODO code application logic here
    }
    
}
