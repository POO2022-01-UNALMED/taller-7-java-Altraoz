package comunicacion;

import java.util.ArrayList;

public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int a){
        return 5;
    }

    public String interpretacion(){return interpretacion;}

    public String toString(){
        String resultado =  this.getOrigen()+"\n"+
                this.getTitulo()+"\n"+
                this.getAutor()+"\n"+
                this.getPaginas()+"\n"+
                this.getCo_autor()+"\n"+
                this.editorial+"\n"+
                this.edicion+"\n"+
                this.interpretacion;

        return  resultado;
    }

    //------------METODOS SET Y GET ---------------
    public void setCo_autor(String co_autor){this.co_autor = co_autor;}
    public void setEditorial(String editorial){this.editorial = editorial;}
    public void setEdicion(String edicion){this.edicion = edicion;}
    public void setInterpretacion(String interpretacion){this.interpretacion = interpretacion;}

    public String getCo_autor(){return co_autor;}
    public String getEditorial(){return editorial;}
    public String getEdicion(){return edicion;}

}
