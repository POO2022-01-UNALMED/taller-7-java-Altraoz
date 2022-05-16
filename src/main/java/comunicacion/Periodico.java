package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int a){
        return 5;
    }

    public String interpretacion(){return interpretacion;}

    public String toString(){
        return "a";
    }

    //------------METODOS SET Y GET ---------------
    public void setFecha(String fecha){this.fecha = fecha;}
    public void setPrimicia(String primicia){this.primicia = primicia;}
    public void setInterpretacion(String interpretacion){this.interpretacion = interpretacion;}


    public String getFecha(){return this.fecha;}
    public String getPrimicia(){return this.primicia;}

}
