package comunicacion;

import java.util.ArrayList;

public class Alfabeto  extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String [] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return 3;
    }

    public String interpretacion(){return interpretacion;}

    public String toString(){
        String resultado="";
        int posicionFinal = letras.length-1;

        for(int i = 0; i <= posicionFinal; i++){
            if (i < posicionFinal){
                resultado += letras[i]+", ";
            }
            else {resultado += letras[i];}

        }
        return resultado;
    }



    //------------METODOS SET Y GET ---------------
    public void setLetras(String[] letras){this.letras = letras;}
    public void setInterpretacion(String interpretacion){this.interpretacion = interpretacion;}

    public String[] getLetras(){return letras;}







}
