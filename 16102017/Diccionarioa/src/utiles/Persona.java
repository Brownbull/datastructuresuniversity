/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

/**
 * Clase base que representa a la generalidad de las personas.
 * @author Nina
 */
public class Persona implements Comparable<Persona>{
    private Rut rut;
    private String nombres;
    private String apellidos;
    private char genero; //F, M
    private char estadoCivil; //S, C, D, V
    private Fecha fechaNac;
    
    public Persona()    {
        rut=new Rut();
        nombres=null;
        apellidos=null;
        genero='N';
        estadoCivil='S';
        fechaNac= new Fecha();
    }
    
    public Persona(Rut r)    {
        rut=new Rut(r);
        nombres=null;
        apellidos=null;
        genero='N';
        estadoCivil='S';
        fechaNac= new Fecha();
    }
    
    public Persona(String r, String nom, String ap, char g)    {
        rut= new Rut(r);
        nombres=nom;
        apellidos=ap;
        genero=Character.toUpperCase(g);
        estadoCivil='S';
        fechaNac= new Fecha();   
    }
    
    public Persona(String r, String nom, String ap, char g, char ec)
    {
        rut= new Rut(r);
        nombres=nom;
        apellidos=ap;
        genero=Character.toUpperCase(g);
        estadoCivil=Character.toUpperCase(ec);
        fechaNac= new Fecha();   
    }
    
    public Persona(String r, String nom, String ap, char g, char es, Fecha f){
        rut= new Rut(r);
        nombres=nom;
        apellidos=ap;
        genero=g;
        estadoCivil=es;
        fechaNac= new Fecha(f);   
    }
    
    public  Persona(String r, String nom, String ap, char g, char ec, int dia, int mes, int año)
    {
        rut= new Rut(r);
        nombres=nom;
        apellidos=ap;
        genero=Character.toUpperCase(g);
        estadoCivil=Character.toUpperCase(ec);
        fechaNac= new Fecha(dia, mes, año);   
    }
    
    public  Persona(int r, String nom, String ap, char g, char ec, int dia, int mes, int año){
        rut= new Rut(r);
        nombres=nom;
        apellidos=ap;
        genero=Character.toUpperCase(g);
        estadoCivil=Character.toUpperCase(ec);
        fechaNac= new Fecha(dia, mes, año);   
    }
    
    public Persona(int r, String nom, String ap, char g, char ec, Fecha f){
        rut= new Rut(r);
        nombres=nom;
        apellidos=ap;
        genero=Character.toUpperCase(g);
        estadoCivil=Character.toUpperCase(ec);
        fechaNac= new Fecha(f);   
    }
    
    public Persona(Rut r, String nom, String ap, char g, char ec, Fecha f){
        rut= new Rut(r);
        nombres=nom;
        apellidos=ap;
        genero=Character.toUpperCase(g);
        estadoCivil=Character.toUpperCase(ec);
        fechaNac= new Fecha(f);   
    }
    
    public Persona(String persona)    {
        
        String[]campos= persona.split(",");
        rut= new Rut(campos[0]);
        nombres=campos[1];
        apellidos=campos[2];
        genero=campos[3].charAt(0);
        estadoCivil=campos[4].charAt(0);
        fechaNac= new Fecha(campos[5]);       
    }
    
    public Persona(Persona p){
        rut= new  Rut(p.rut);
        nombres=p.nombres;
        apellidos=p.apellidos;
        genero=p.genero;
        estadoCivil=p.estadoCivil;
        fechaNac= new Fecha(p.fechaNac); 
    }
    public void setRut(String r){
        rut= new Rut(r);
    }
    
    public void setRut(int r){
        rut= new Rut(r);
    }
    
    public void setNombres(String nom){
        nombres= nom;
    }
    
    public void setApellidos(String ap){
        apellidos= ap;
    }
    
    public void setGenero(char g){
        genero=Character.toUpperCase(g);
    }
    
    public void setEstadoCivil(char ec){
        estadoCivil= Character.toUpperCase(ec);
    }
    
    public void setFechaNac(Fecha f){
        fechaNac= new Fecha(f);
    }
    
    public void setFechaNac(int d, int m, int a){
        fechaNac= new Fecha(d, m, a);
    }
    
    public Rut getRut(){
        return rut;
    }
    
    public String getNombres(){
        return nombres;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public String getNombreCompleto(){
        return nombres +" "+apellidos;
    }
    
    public char getGenero(){        
        return genero;
    }
    
    public char getEstadoCivil(){
        return estadoCivil;
    }
    
    public Fecha getFechaNac(){
        return fechaNac;
    }
    
    public String toString(){
        String ec;
        StringBuilder s = new StringBuilder("\nRUT   : "+rut  + "\t\tFECHA DE NACIMIENTO:  "+fechaNac.toString() + "\n");
        s.append("NOMBRE: "+nombres+" "+apellidos + "\n");
        switch (estadoCivil){
            case 'S': ec="Soltero(a)";
                      break;
            case 'C': ec="Casado(a)";
                      break;
            case 'D': ec="Divorciado(a)";
                      break;
            case 'V': ec="Viudo(a)";
                      break;
            default : ec= "No definido";          
                     
        }
        if (genero=='M')
           s.append("GÉNERO: Masculino \tESTADO CIVIL: " + ec + "\n");
        else
            if (genero=='F')
                s.append("GÉNERO: Femenino \tESTADO CIVIL: " + ec + "\n");
            else
                s.append("GÉNERO:  No definido \t ESTADO CIVIL: " + ec + "\n");
        
        return s.toString();
    }
    
    
    
    public boolean equals(Persona p)
    {
        if (rut.equals(p.rut) && nombres.equals(p.nombres) && apellidos.equals(apellidos))
           if (estadoCivil== p.estadoCivil && genero==p.genero)
              if (fechaNac.equals(p.fechaNac))
                  return true;
        return false;      
    }
    
    public void descansar(){
        System.out.println("Persona descansando .....");
    }
    
    public void hablar()
    {
        System.out.println("Persona... hablando...");
    }
    
    //Implementar método heredado de la interface Comparable<T>
    public int compareTo(Persona p){
        if (nombres.compareTo(p.nombres)==0)
            return apellidos.compareTo(p.apellidos);
        else
            return nombres.compareTo(p.nombres);//-1, 1
    }
}

