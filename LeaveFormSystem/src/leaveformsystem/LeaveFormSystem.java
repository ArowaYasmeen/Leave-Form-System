/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaveformsystem;

import javax.swing.JFrame;

/**
 *
 * @author Dell
 */
public class LeaveFormSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WelcomePage wpf = new WelcomePage();
        wpf.setVisible(true);
        wpf.pack();
        wpf.setLocationRelativeTo(null);
        wpf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

}
