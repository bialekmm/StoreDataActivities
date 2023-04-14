package org.apache.maven;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("-------------Task 2---------------");

        Values v = new Values();
        v.totalValueOfProd();

        System.out.println("-------------Task 3---------------");
            
        MaxCartValue m = new MaxCartValue();
        m.maxCartValue();

        System.out.println("-------------Task 4---------------");

        Distance d = new Distance();
        d.maxDistance();



    }
}