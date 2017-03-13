package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 1;
    private static String c3d = "";
    private static String V="";
    private static String F="";
  
    
    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 1;
        c3d = "";
        V="";
        F="";    
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static int generaTemp(){
        return temp++;
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }
    
    public static void setV(String v)
    {
        V += v;
    }
    
    public static String getV(){
        return V;
    }
    
    public static void setF(String f)
    {
        F += f;
    }
    
    public static String getF(){
        return F;
    }
    

  
    
    
}
