/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netflix_luismontalvan;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author luxter
 */
public class LoadingScreen extends Thread{
    private JProgressBar barra;
    private boolean avanzar, continuar;
    private JPanel load, toload;

    public LoadingScreen(JProgressBar barra) {
        this.barra = barra;
    }

    public LoadingScreen(JProgressBar barra, boolean avanzar, boolean continuar, JPanel load, JPanel toload) {
        this.barra = barra;
        this.avanzar = avanzar;
        this.continuar = continuar;
        this.load = load;
        this.toload = toload;
    }
    
    
    
    public LoadingScreen(JProgressBar barra, JPanel load) {
        this.barra = barra;
        this.load = load;
    }

    public LoadingScreen(JProgressBar barra, boolean avanzar, boolean continuar, JPanel load) {
        this.barra = barra;
        this.avanzar = avanzar;
        this.continuar = continuar;
        this.load = load;
    }
    
    
    public JPanel getLoad() {
        return load;
    }

    public void setLoad(JPanel load) {
        this.load = load;
    }

    

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isContinuar() {
        return continuar;
    }

    public void setContinuar(boolean continuar) {
        this.continuar = continuar;
    }
    
    
    
    @Override
    public void run() {
        while (continuar) {            
            if (avanzar) {
               barra.setValue(barra.getValue()+1);
                if (barra.getValue()==100) {
                    continuar=false;
                    load.setVisible(false);
                    toload.setVisible(true);
                }
            }
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
               
            }
        }
 
    }
        
    }
    

