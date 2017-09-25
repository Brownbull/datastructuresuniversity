package Utiles;




/**
 *Representa una fecha:  dd/mm/aaaa
 * 
 * @author NVA
 *
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Fecha implements Comparable<Fecha>{
 
   private int dia;
   private int mes;
   private int año;
   private static int contFechas=0;
   private static int[] diasMeses={31,28,31,30,31,30,31,31,30,31,30,31};
   private static String[] nombreMeses={"Ene","Feb","Mar","Abr","May","Jun",
                                       "Jul","Ago","Sep","Oct","Npv","Dic"};


   public Fecha(){
      Calendar c= Calendar.getInstance();
      dia= c.get(Calendar.DAY_OF_MONTH);
      mes= c.get(Calendar.MONTH) + 1;
      año= c.get(Calendar.YEAR);
      contFechas++;
   }
   public Fecha(int d, int m, int a){
      dia= d;
      mes= m;
      año= a;
      if (!valida()){
          Calendar c= Calendar.getInstance();
          dia= c.get(Calendar.DAY_OF_MONTH);
          mes= c.get(Calendar.MONTH) + 1;
          año= c.get(Calendar.YEAR);
      }
      contFechas++;
   } 
   public Fecha(int d, int m){
      //Validar!!!!!!!
      dia= d;
      mes= m;
      Calendar c= Calendar.getInstance();
      año= c.get(Calendar.YEAR);
      contFechas++;
   } 
   public Fecha(int f) { //ddmmaaaa{  
      dia= f/1000000;
      mes= (f/10000)%100;
      año= f%10000;
      if (!valida()){
          Calendar c= Calendar.getInstance();
          dia= c.get(Calendar.DAY_OF_MONTH);
          mes= c.get(Calendar.MONTH) + 1;
          año= c.get(Calendar.YEAR);
      }
      contFechas++;
   }  
   public Fecha(String f){ //dd/mm/aaaa
        
       Boolean ok=validafec(f);
       
       if (ok)
       {
          String [] datos= f.split("/");
          dia=Integer.parseInt(datos[0]);
          mes=Integer.parseInt(datos[1]);
          año=Integer.parseInt(datos[2]);
          contFechas++;
       }
   }  
   
   public Fecha(Fecha f){
       dia= f.dia;
       mes= f.mes;
       año= f.año;
       contFechas++;
   }  
   public int getDia(){
       return dia;
   }   
   public int getMes() {
       return mes;
   }
   public int getAño(){
       return año;
   }
   public void setDia(int d){
       dia=d;    
   }
   public void setMes(int d){
       mes=d;    
   }
   public void setAño(int d){
       año=d;    
   }
   public String toString(){
        String fecha=dia+"/"+mes+"/"+año;
        return fecha;
   }
   public boolean equals(Fecha f){
       if(dia==f.dia && mes==f.mes && año==f.año)
           return true;
       else
          return false;
   }
   public void listar(){
       System.out.println(dia +"/"+mes + "/"+año);
   }
   /**
    * Implementar compareTo de la interface Comparable<T>
    * @param f
    * @return 
    */
   public int compareTo(Fecha f){
       if (año<f.año)
           return  -1;
       else 
          if (año>f.año)
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
   public int fechaToDias () {
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
   public void agregarDias(int d){
       dia=dia+d;
       while(dia>diasMeses[mes-1]){
            dia=dia-diasMeses[mes-1];
            mes=mes+1;
            if(mes>12){
                año=año+1;
                mes=1;
            }
       } 
   }
   public void listar2(){
      System.out.println(dia+"-"+mes+"-"+año+"       "+ contFechas);    
   } 
   public boolean valida(){
      return true;
   }
   
   public boolean validafec(String f){
      Boolean ok;
      
      // Valida formato
      
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
      Date fecha = null;
      
      try{
          fecha=formato.parse(f);
          ok=true;
      }
      catch (ParseException e) {
           ok=false;
       }
      
      // Valida contenido
      
      if (ok)
      {

          String[] fec = f.split("/");
          int d = Integer.parseInt(fec[0]);
          int m = Integer.parseInt(fec[1]);
          int a = Integer.parseInt(fec[2]);
          if (d<1)
             ok=false;
          else
          {
             if (a<1)
                ok=false;
             else
             {
                if (m<0 || m>12)
                   ok=false;
                else
                {
                  int bi=a%4;
                  if (bi==0 & m==2)
                       if (d>29)
                          ok=false;
                       else
                          ok=true;
                  else
                      if (d>diasMeses[m-1])
                      ok=false;
                }
             }
          }
       }
          
      return ok;
   }
   public boolean esBisiesto(){
       return (año%4==0 && año%100!=0) || (año%4==0 && año%100==0 && año%400==0);
           
    }
}

