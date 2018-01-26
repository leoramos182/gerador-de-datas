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
public class Year {
    int y;
    //**************************************************************************
    public void setYear(int ano){
        this.y = ano;
        if(y<1900 | y>2018){
            System.out.println("Ano inválido!");
            System.exit(0);
        }
    }
    public int getYear(){
        return y;
    }
    public void imprimir(){
        System.out.println("Ano digitado: "+ y);
    }
}
