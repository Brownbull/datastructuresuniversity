package clases;

/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona implements Comparable<Persona>
{
    private Rut rut; 
    private String nombres;
    private String apellidos;
    private char genero; //F, M
    private char estadoCivil; //S, C, D, V
    private Fecha fechaNac;
    
    public Persona()
    {
        rut=new Rut();
        nombres=null;
        apellidos=null;
        genero='F';
        estadoCivil='S';
        fechaNac= new Fecha();
    }
    
    public Persona(String r)
    {
        rut= new Rut(r);
        nombres=null;
        apellidos=null;
        genero='F';
        estadoCivil='S';
        fechaNac= new Fecha();       
    }
    
    public Persona(String r, String nom, String ap, char g)
    {
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
    
    public Persona(String r, String nom, String ap, char g, char es, Fecha f)
    {
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
    
    public  Persona(int r, String nom, String ap, char g, char ec, int dia, int mes, int año)
    {
        rut= new Rut(r);
        nombres=nom;
        apellidos=ap;
        genero=Character.toUpperCase(g);
        estadoCivil=Character.toUpperCase(ec);
        fechaNac= new Fecha(dia, mes, año);   
    }
    
    public Persona(int r, String nom, String ap, char g, char ec, Fecha f)
    {
        rut= new Rut(r);
        nombres=nom;
        apellidos=ap;
        genero=Character.toUpperCase(g);
        estadoCivil=Character.toUpperCase(ec);
        fechaNac= new Fecha(f);   
    }
    
    public Persona(Rut r, String nom, String ap, char g, char ec, Fecha f)
    {
        rut= new Rut(r);
        nombres=nom;
        apellidos=ap;
        genero=Character.toUpperCase(g);
        estadoCivil=Character.toUpperCase(ec);
        fechaNac= new Fecha(f);   
    }
    
    public Persona(Persona p)
    {
        rut= new  Rut(p.rut);
        nombres=p.nombres;
        apellidos=p.apellidos;
        genero=p.genero;
        estadoCivil=p.estadoCivil;
        fechaNac= new Fecha(p.fechaNac); 
    }
    public void setRut(String r)
    {
        rut= new Rut(r);
    }
    
    public void setRut(int r)
    {
        rut= new Rut(r);
    }
    
    public void setNombres(String nom)
    {
        nombres= nom;
    }
    
    public void setApellidos(String ap)
    {
        apellidos= ap;
    }
    
    public void setGenero(char g)
    {
        genero=Character.toUpperCase(g);
    }
    
    public void setEstadoCivil(char ec)
    {
        estadoCivil= Character.toUpperCase(ec);
    }
    
    public void setFechaNac(Fecha f)
    {
        fechaNac= new Fecha(f);
    }
    
    public void setFechaNac(int d, int m, int a)
    {
        fechaNac= new Fecha(d, m, a);
    }
    
    public Rut getRut()
    {
        return rut;
    }
    
    public String getNombre()
    {
        return nombres;
    }
    
    public String getApellido()
    {
        return apellidos;
    }
    
    public String getNombreCompleto()
    {
        return nombres +" "+apellidos;
    }
    
    public char getGenero()
    {
        
        return genero;
    }
    
    public char getEstadoCivil()
    {
        return estadoCivil;
    }
    
    public Fecha getFechaNac()
    {
        return fechaNac;
    }
    
    public void listar()
    {
        String ec;
        System.out.println(rut  + "\t"+fechaNac);
        System.out.println(","+nombres+" "+apellidos+",");
        switch (estadoCivil)
        {
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
            System.out.println(", Masculino, " + ec);
        else
            if (genero=='F')
                System.out.println(", Femenino, " + ec);
            else
                System.out.println(", No definido, " + ec);
        
    }
    
    public String toString()
    {
        String ec;
        String m = rut  + "\t"+fechaNac;
        m= m + ", "+nombres+" "+apellidos;
        switch (estadoCivil)
        {
            case 'S': ec="Soltero(a)";
                      break;
            case 'C': ec="Casado(a)";
                      break;
            case 'D': ec="Divorciado(a)";
                      break;
            case 'V': ec="Viudo(a)";
                      break;
            default:  ec="No definido";         
        }
        if (genero=='M')
            m= m + ", Masculino, " + ec;
        else
            if (genero=='F')
                m= m + ", Femenino, " + ec;
            else
                 m= m + ", No definido, " + ec;
            
        return m;
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
        System.out.println("Persona descansando");
    }
    
    public void hablar()
    {
        System.out.println("Persona... hablando...");
    }
    
    public int compareTo(Persona p)
    {
        //AsumirÃ© comparar por fecha de nacimiento
        return fechaNac.compareTo(p.getFechaNac());
        
        
    }
}
