package comunicacion;

import java.util.ArrayList;

public class Tesis extends Escrito{
    private String idea;
    private ArrayList<String> argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public int palabrasTotales(int a){

    }

    public String interpretacion(){

    }

    public String toString(){

    }

    public void setIdea(String idea){this.idea = idea}
    public void setArgumentos(String argumentos){this.argumentos = argumentos;}
    public void setConclusion(String conclusion){this.conclusion = conclusion;}
    public void setReferencias(String referencias){this.referencias = referencias;}
    public void setInterpretacion(String interpretacion){this.interpretacion = interpretacion;}

    public String getIdea(){return idea;}
    public ArrayList<String> getArgumentos(){return argumentos;}
    public String getConclusion(){return conclusion;}
    public String getReferencias(){return referencias;}
    public String getInterpretacion(){return interpretacion;}


}
