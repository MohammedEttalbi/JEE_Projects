package presentation;

import dao.*;
import metier.MetierImpl;

import java.io.File;
import java.util.Scanner;

public class Pres1 {
    public static void main(String[] args) throws Exception{
       DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println("Res = " + metier.calcule());




    }
}
