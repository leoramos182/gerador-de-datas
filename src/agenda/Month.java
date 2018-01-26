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
public class Month {
    int m;
    //**************************************************************************
    public void setMonth(int mes){
        this.m = mes; 
        if(m<1 | m>12){
            System.out.println("Mês invalido!");
            System.exit(0);
        }
    }
    public int getMonth(){
        return m;
    }
    public void imprimir(){
        System.out.println("Mês digitado: "+ m);
    }
     
}
