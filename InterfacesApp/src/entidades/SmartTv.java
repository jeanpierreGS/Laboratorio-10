/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Estudiante
 */
public class SmartTv 
        extends Dispositivo
        implements Navegador, Reproductor{

     private int tipoEntrada;
     
    private final int HDMI = 0;
    private final int VGA = 1;
    private final int DVI = 2;
    private final int DisplayPort = 3;
    private final int RCA = 4;
    private final int Signal = 5;
    private final int SVideo = 6;
    private final int Coaxial = 7;

     
    @Override
    public String getNombre(){
        
        String nombreEntrada = "";
        
        switch(tipoEntrada){
            case HDMI:nombreEntrada = "HDMI";break;
            case VGA: nombreEntrada = "VGA";break;
            case DVI: nombreEntrada = "DVI";break;
            case DisplayPort: nombreEntrada = "DisplayPort";break;
            case RCA: nombreEntrada = "RCA";break;
            case Signal: nombreEntrada = "Signal";break;
            case SVideo: nombreEntrada = "SVideo";break;
            case Coaxial: nombreEntrada = "Coaxia";break;
            //01:36:42
        }
            
        return "MODELO: " + nombreEntrada;
    }
     
    
    
    /**
     * @return the tipoEntrada
     */
    public int getTipoEntrada() {
        return tipoEntrada;
    }

    /**
     * @param tipoEntrada the tipoEntrada to set
     */
    public void setTipoEntrada(int tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
    
    //46:36
    

    @Override
    public void navegar() {
        
    }

    @Override
    public void abirLink() {
        
    }

    @Override
    public void reproducir() {
        
    }

    @Override
    public void adelantar() {
        
    }

    @Override
    public void retroceder() {
        
    }

   
}
