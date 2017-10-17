package utiles;

/**
 * Representa el RUT o RUN.
 * 
 * @author NVA 
 * @version 2012
 */
public class Rut
{
    private int rut;
    private char dv;
    
    public Rut()
    {
        rut=0;
        dv='0';
    }
    public Rut(String rt)
    {
        
        int largo= rt.length();     
        int num= Integer.parseInt(rt.substring(0, largo-2));
        
        rut= num;
        dv= Character.toUpperCase(rt.charAt(largo-1));
        char dvc= calculaDv();
        
        if (dv!=dvc)
        {
               System.out.println("RUT invalido");
               this.rut=0;
               this.dv='0';
        }
    }
    
    public Rut(int num)
    {
        rut= num;       
        dv= calculaDv();
    }
    
    public Rut(int num, char d)
    {
        rut= num;
        dv= Character.toUpperCase(d);
        char dvc= calculaDv();
        
        if (dvc!=dv)
        {
               System.out.println("RUT inv�lido");
               this.rut=0;
               this.dv='0';
        }
    }
    
    public Rut(Rut r)
    {
        rut=r.rut;
        dv= r.dv;
    }
    
    public void setRut(String rt)
    {
        int num= rut;
        char dvr= dv;
        
        int largo= rt.length();     
        rut= Integer.parseInt(rt.substring(0, largo-2));
        
        dv= Character.toUpperCase(rt.charAt(largo-1));
        char dvc= calculaDv();
        
        if (dv!=dvc)
        {
               System.out.println("RUT inválido");
               this.rut=num;
               this.dv=dvr;
        } 
    }
    
    public void setRut(int rt)
    {
        rut=rt;
        dv= calculaDv();
    }
    
    public String getRut()
    {
        return rut+"-"+dv;
    }
    
    public String toString()
    {
        return rut+"-"+dv;
    }
    
    public int getNumRut()
    {
        return rut;
    }
    
    public char getDv()
    {
        
        return dv;
    }
    
    public void listar()
    {
        System.out.println(rut+"-"+dv);
    }
    
    public boolean equals(Rut r)
    {
        if (rut==r.rut && dv==r.dv)
           return true;
        else
           return false;
    }
    
    private char calculaDv()
    {
        int factor=2;
        int suma=0;
        int dig;
        char dvr;
        int num= rut;
        
        while (num!=0)
        {
            dig= num%10;
            suma= suma + dig*factor;
            factor++;
            if (factor >7)
               factor=2;
            num= num/10;
        }
        
        int digito = 11 - suma%11;
        if (digito==10)
          dvr= 'K';
        else
           if (digito==11)
              dvr='0';
           else
              dvr= (char)(digito + 48);
      
        return dvr;
    }
}
