/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlerSoftBot;

import ModSoftbot.modBotFindMen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Marcola_Dev
 */
public class ControlFindMen extends modBotFindMen implements ActionListener {

    private modBotFindMen mod;

    public ControlFindMen(modBotFindMen mod) {

        this.mod = mod;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mod.startThreads();
    }
}
