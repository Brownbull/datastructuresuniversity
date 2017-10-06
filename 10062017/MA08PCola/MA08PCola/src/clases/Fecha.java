package clases;

/**
 *Representa una fecha:  dd/mm/aaaa
 * 
 * @author NVA
 * @version 2012
 */

import java.util.*;
public class Fecha implements Comparable<Fecha>
{
   //Atributos
   private int dia;
   private int mes;
   private int a�o;
   private static int contFechas=0;
   private static int[] diasMeses={31,28,31,30,31,30,31,31,30,31,30,31};
   private static String[] nombreMeses={"ENERO","FEBRERO","MARZO","ABRIL","MAYO",
                                        "JUNIO","JULIO","AGOSTO","SEPTIEMBRE",
                                        "OCTUBRE","NOVIEMBRE","DICIEMBRE"};
   
   //M�todos
   public Fecha()
   {
      Calendar c= Calendar.getInstance();
      dia= c.get(Calendar.DAY_OF_MONTH);
      mes= c.get(Calendar.MONTH) + 1;
      a�o= c.get(Calendar.YEAR);
      contFechas++;
   }
   public  Fecha(int d, int m, int a)
   {
      dia= d;
      mes= m;
      a�o= a;
      if (!valida())
      {
          Calendar c= Calendar.getInstance();
          dia= c.get(Calendar.DAY_OF_MONTH);
          mes= c.get(Calendar.MONTH) + 1;
          a�o= c.get(Calendar.YEAR);
      }
      contFechas++;
   }
   
   public  Fecha(int d, int m)
   {
      //Validaci�n!!!!!!!
      dia= d;
      mes= m;
      Calendar c= Calendar.getInstance();
      a�o= c.get(Calendar.YEAR);
      contFechas++;
   }
   
   public  Fecha(int d)
   {
     
      dia= d;
      Calendar c= Calendar.getInstance();
      mes= c.get(Calendar.MONTH) + 1;
      a�o= c.get(Calendar.YEAR);
      contFechas++;
   }
   
   public  Fecha(String f)
   {
      String[]v=f.split("/");
      try{
        dia= Integer.parseInt(v[0]);
        mes= Integer.parseInt(v[1]);
        a�o= Integer.parseInt(v[2]);
      }
      catch(NumberFormatException e){
        Calendar c= Calendar.getInstance();
        mes= c.get(Calendar.MONTH) + 1;
        a�o= c.get(Calendar.YEAR);
        contFechas++;
      }
   }
   public Fecha(Fecha f)
   {
       dia= f.dia;
       mes= f.mes;
       a�o= f.a�o;
   }
   
   public int getDia()
   {
       return dia;
   }
    
   public int getMes()
   {
       return mes;
   }
   
   public int getA�o()
   {
       return a�o;
   }
   
   public void setDia(int d)
   {
       dia=d;    
   }
   
   public void setMes(int d)
   {
       mes=d;    
   }
   
   public void setA�o(int d)
   {
       a�o=d;    
   }
   
   public String toString()
   {
        String fecha=dia+"/"+mes+"/"+a�o;
        return fecha;
   }

   public boolean equals(Fecha f)
   {
       if(dia==f.dia && mes==f.mes && a�o==f.a�o)
           return true;
       else
          return false;
   }
   
   public void listar()
   {
       System.out.println(dia +"/"+mes + "/"+a�o);
   }
   
   public int compareTo(Fecha f)
   {
       if (a�o<f.a�o)
           return  -1;
       else 
          if (a�o>f.a�o)
             return 1;
          else
            if (mes<f.mes)
                return -1;
            else 
                if (mes>f.mes)
                    return 1;
                else
                    if (dia<f.dia)
                        return -1;
                    else 
                        if (dia>f.dia)
                            return 1;
                        else
                            return 0;
   }

   public int fechaToDias ()
   {
       int cantDias=0;
       int i;
       int tope=mes-1;
    
       for (i=0;i<tope;i++)
       {
           cantDias=diasMeses[i]+cantDias;
       }
    
       cantDias=cantDias+dia;
       return cantDias;
    
    }


   public void agregarDias(int d)
   {
       dia=dia+d;
       while(dia>diasMeses[mes-1])
       {
            dia=dia-diasMeses[mes-1];
            mes=mes+1;
            if(mes>12)
            {
                a�o=a�o+1;
                mes=1;
            }
       } 
   }
 
   public void listar2()
   {
      System.out.println(dia+"-"+mes+"-"+a�o+"       "+ contFechas);    
   } 
   
   public boolean valida()
   {
      return true;
   }
   
   public boolean esBisiesto()
   {
       return (a�o%4==0 && a�o%100!=0) || (a�o%4==0 && a�o%100==0 && a�o%400==0);
           
    }
    
    
}
