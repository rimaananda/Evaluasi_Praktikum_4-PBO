/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Film;

/**
 *
 * @author macbookair
 */
public class genreFilm {
    private String judul;
    private int tahunKeluar;
    
    public genreFilm(String judul, int tahunKeluar){
        this.judul=judul;
        this.tahunKeluar=tahunKeluar;
    }
    public String getJudul(){
        return judul;
    }
    public void setJudul(String judul){
        this.judul=judul;
    }
    public int gettahunKeluar(){
        return tahunKeluar;
    }
    public void settahunKeluar(int tahunKeluar){
        this.tahunKeluar=tahunKeluar;
    }
}
    
