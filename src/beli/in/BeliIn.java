/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beli.in;
import beli.in.login_page;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author Muhammad Akbar
 */
public class BeliIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
                for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels())
                {
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        
         login_page login = new login_page();
         login.setVisible(true);
         login.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
    }
    
}
