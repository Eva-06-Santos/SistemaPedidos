/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author USUARIO
 */
public class Acceso {
    
    public String autentificar( String usuario, String password){
        
        String respuesta;
        if(usuario.equals("Eva")  && password.equals("santos")){
            respuesta="Bienvenido al Sistema de Pedidos";
        }else{
            respuesta="Usuario Incorrecta";
        }
        return respuesta;
    }
    
}
