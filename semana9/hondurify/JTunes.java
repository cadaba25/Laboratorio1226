/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hondurify;

import javax.swing.ImageIcon;



public class JTunes {
    private Song[] canciones;

    public JTunes(int tamaño) {
        canciones = new Song[tamaño];
    }

    public boolean addSong(int codigo, String nombre, double precio, ImageIcon imagenDisco) {
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null && canciones[i].getCodigo() == codigo) {
                return false; 
            }
        }

        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] == null) {
                canciones[i] = new Song(codigo, nombre, precio, imagenDisco);
                return true;
            }
        }

        return false;
    }

    public Song searchSong(int codigo) {
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null && canciones[i].getCodigo() == codigo) {
                return canciones[i];
            }
        }
        return null;
    }

    public void rateSong(int codigo, int stars) {
        Song s = searchSong(codigo);
        if (s != null) {
            s.addStars(stars);
        }
    }

    public Song[] getAllSongs() {
        int contar = 0;
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null) {
                contar++;
            }
        }

        Song[] resultado = new Song[contar];
        int pos = 0;
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null) {
                resultado[pos] = canciones[i];
                pos++;
            }
        }
        return resultado;
    }
}