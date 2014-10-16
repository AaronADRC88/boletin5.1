
package boletin5.pkg1;

/**
 *
 * @author aferreiradominguez
 */
class Coche {
    private int velocidade ;
    

   public Coche(){
    velocidade =0 ;
    }
    /**
     *
     * @return
     */
    public int getVelocidade(){
         return velocidade;
    }
    public void acelerar(int valor){
        velocidade=(velocidade +valor);
    }
    public void frenar(int menos){
        velocidade=(velocidade-menos);
    }
}
