
package exemconsumo4b;


public class Consumo {
    
    private float kilometros;
        private float litros;
        private float vMedia;
        private float pGas;
        //constructores
        public Consumo(){
        }
        public Consumo (float ki, float li, float vM, float pG){
        kilometros=ki;
        litros=li;
        vMedia=vM;
        pGas=pG;
        }
        
        //metodos de acceso
        
        public float getTempo(){
            return kilometros / vMedia;
        }    
        public float consumoMedio(){
            return litros / kilometros * 100;
        }
        public float consumoEuros(){
            return pGas / kilometros * 100;
        }   
        public void setKms(float ki){
            kilometros=ki;
        }
        public void setLitros(float li){   
            litros=li;
        }    
        public void setvMedia(float vM){
            vMedia = vM;
        }
        public void setPgas(float pG){
            pGas = pG;
        }

    String consumoMedio(float kM, float lI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String consumoEuros(float pG, float lI) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getvMed(float vM, float kM) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
