package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private int L;
    public NodoC3D(String cad, int l) {
        this.cad = cad;
        this.L = l;
    }
     
    public String getCad(){
        return cad;
    }
    
    public int getNum(){
        return L;
    }

}
