package org.example.cw2;

import org.example.cw2.model.Vextor;

public class Cw4 {
    public static void main(String[] args) {
        Vextor vextor1 = new Vextor(1.0,1.0,1.0);
        Vextor vextor2 = new Vextor(1.0,2.0,1.0);
        System.out.println(vextor1);
        System.out.println(vextor2);
        System.out.println("длинна вектора = " + vextor1.lenghtVector());
        System.out.println("сколяронок произведение = " + vextor1.scalarMulti(vextor2));
        System.out.println("Векторное произведение = " + vextor1.multyVector(vextor2));
        System.out.println("Коссинус угла = " + vextor1.cosVector(vextor2));
    }
}
