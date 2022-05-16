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
        return this.getPaginas()*a*10;
    }

    public String interpretacion(){return interpretacion;}

    public String toString(){
        String resultado =  this.getOrigen()+"\n"+
                this.getTitulo()+"\n"+
                this.getAutor()+"\n"+
                this.getPaginas()+"\n"+
                this.fecha+"\n"+
                this.primicia;

        return  resultado;
    }

    //------------METODOS SET Y GET ---------------
    public void setFecha(String fecha){this.fecha = fecha;}
    public void setPrimicia(String primicia){this.primicia = primicia;}
    public void setInterpretacion(String interpretacion){this.interpretacion = interpretacion;}


    public String getFecha(){return this.fecha;}
    public String getPrimicia(){return this.primicia;}

}
