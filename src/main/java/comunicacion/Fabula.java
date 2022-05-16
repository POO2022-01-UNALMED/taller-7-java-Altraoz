package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int a){
        return this.getPaginas()*a;
    }

    public String interpretacion(){return interpretacion;}

    public String toString(){
        String resultado =  this.getOrigen()+"\n"+
                this.getTitulo()+"\n"+
                this.getAutor()+"\n"+
                this.getPaginas()+"\n"+
                this.ensenanza+"\n"+
                this.interpretacion;

        return  resultado;
    }


    //------------METODOS SET Y GET ---------------
    public void setEnsenanza(String ensenanza){this.ensenanza = ensenanza;}
    public void setInterpretacion(String interpretacion){this.interpretacion = interpretacion;}

    public String getEnsenanza(){return ensenanza;}

}
