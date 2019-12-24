import java.util.ArrayList;

public class CambioBase {
    private String [] letras = new String []{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    public String[] getLetras() {
        return letras;
    }

    public String cambiarBase(int valor, int base ){
        String resultado = "";
        int residuo = 0 ;
        if(base >= 2 && base <= 20  ){
            if(valor >= 0 && valor <= 999999){
                while (valor > base){
                    residuo = valor % base;
                    valor = (valor/base);
                    if (residuo >= 10){
                        resultado+= this.getLetras()[residuo-10];
                    }else{
                        resultado+=residuo;
                        
                    }

                }
                resultado+=valor;

            }
            else{
                resultado = "el valor:" + valor + " está fuera del rango";
            }
        }

        return resultado ;
    }



    public static void main(String[] args) {
        CambioBase cambioBase = new CambioBase();
        System.out.println(cambioBase.cambiarBase(384739,20));
    }
}
