/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Ubiratan
 */
public class Day {
    int d;
    //**************************************************************************
    public void setDay(int dia){
        this.d = dia;
        if(d <= 0){
            System.out.println("Dia inválido!");
            System.exit(0);
        }
    }
    public int getDay(){
        return d;
    }
    public void imprimir(){
        System.out.println("Data digitada: "+ d);
    }
    //**************************************************************************
}
