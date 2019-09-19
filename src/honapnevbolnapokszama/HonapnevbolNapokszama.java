/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package honapnevbolnapokszama;

import javax.swing.JOptionPane;

/**
 *
 * @author Verosffy
 */
public class HonapnevbolNapokszama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String honap;
        int napokszama;
        int szkoev;
        honap = JOptionPane.showInputDialog("Add meg a hónap nevét!");
        szkoev = JOptionPane.showConfirmDialog(null, "Szökővben kérdezed?", "Kérlek válaszolj a gombokkal.", JOptionPane.YES_NO_OPTION);
        if (honap != null) {
            honap = honap.toUpperCase();
            switch (honap) {
                case "JANUAR":
                case "MARCIUS":
                case "MAJUS":
                case "JULIUS":
                case "AUGUSZTUS":
                case "OKTOBER":
                case "DECEWMBER":
                    napokszama = 31;
                    break;
                case "APRILIS":
                case "JUNIUS":
                case "SZEPTEMBER":
                case "NOVEMBER":
                    napokszama = 30;
                    break;
                case "FEBRUAR":
                    if (szkoev == 0) {
                        napokszama = 29;
                    } else {
                        napokszama = 28;
                    }
                    break;
                default:
                    napokszama = 0;

            }
            if (napokszama != 0) {
                JOptionPane.showMessageDialog(null, "Ezt a hónapot adtad meg: " + honap + " Ebben a hónapban" + napokszama + " nap van.");
            } else {
                JOptionPane.showMessageDialog(null, "Ezt írtad be:" + honap + "Ird be helyelyesen ékezetek nélkül, így nem értelek.");
            }
        }
        System.exit(0);
    }

}
