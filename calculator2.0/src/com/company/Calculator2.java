package com.company;

public class Calculator2 {
    public static void main(String[] args){
        Input in = new Input();
        in.input();
        Output out = new Output();
        out.Calculate(in.getA(), in.getB(), in.getC());

    }
}
