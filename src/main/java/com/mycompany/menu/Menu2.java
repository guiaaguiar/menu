package com.mycompany.menu;

public class Menu2 {
    public double n1, n2 ,n3, ma, mp, ponderada;
    
    public double mediaa(){
        ma = (n1 + n2) / 2;
    return ma;
    }
    public double mediap(){
        int peso = 9;
    mp = (n1 * 2) + (n2 * 3) + (n3 * 4);
    ponderada = mp / peso;
    return ponderada;
    }
}
