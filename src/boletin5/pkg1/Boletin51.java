/*coche*/
package boletin5.pkg1;

/**
 *
 * @author aferreiradominguez
 */
public class Boletin51 {

    public static void main(String[] args) {
    Coche coche1=new Coche();
        System.out.println("velocidade="+coche1.getVelocidade());
        coche1.acelerar(6);
        System.out.println("acelerar="+coche1.getVelocidade());
        coche1.frenar(3);
        System.out.println("frenado="+coche1.getVelocidade());
        
        
    
    }
}

 
 
