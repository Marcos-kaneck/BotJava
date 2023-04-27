/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThreadSoft;

import ModSoftbot.modBotFindMen;


/**
 *
 * @author Marcola_Dev
 */
public class findThread extends modBotFindMen implements Runnable {

      
    @Override
    public void run() {
        while (true) {
            
            String message = checkMenssage();
            if (message != null) {
                try {
                    
                    findMessage();
                
                } catch (InterruptedException ex) {
                    System.out.println("error" + ex);
                }
            }
        }
    }

    private String checkMenssage() {

        try {
            findMessage();
        } catch (InterruptedException ex) {
            System.out.println("error");
        }
        return checkMenssage();
    }
}
