/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equisycero;

/**
 *
 * @author David Barreda
 */
public class ManejoUsuarios {

    public static ManejoUsuarios usuarios[] = new ManejoUsuarios[100];
    public static String usuariologgeado = null;
    String nombre, username, password;
    boolean estado;
    int puntos;

    public ManejoUsuarios() {

    }

    public ManejoUsuarios(String nombre, String username, String password, boolean estado, int puntos) {
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.estado = true;
        this.puntos = 0;

    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    

    public static void loggear(String username) {
        usuariologgeado = username;
    }

    public static String getUsuariologgeado() {
        return usuariologgeado;
    }

    

    public static void desloggear() {
        usuariologgeado = null;
    }

    public boolean Login(String username, String password) {
        ManejoUsuarios u = buscarUsuario(username);
        if (u != null && u.password.equals(password)) {
            u.estado = true;
            return true;
        }
        return false;
    }

    public static ManejoUsuarios buscarUsuario(String username) {
        for (ManejoUsuarios u : usuarios) {
            if (u != null && u.username.equals(username)) {
                return u;
            }
        }
        return null;
    }

    public boolean CrearCuenta(String nombre, String username, String password, boolean estado) {
        if (buscarUsuario(username) == null) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i] == null) {
                    usuarios[i] = new ManejoUsuarios(nombre, username, password, estado, puntos);
                    return true;
                }
            }
        }
        return false;
    }

}
