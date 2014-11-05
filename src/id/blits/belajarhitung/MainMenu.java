
package id.blits.belajarhitung;


public class MainMenu {

    
    public static void main(String[] args) {
       LuasPersegiPanjang PersegiPanjang = new LuasPersegiPanjang();
       PersegiPanjang.panjang= 10;
       PersegiPanjang.lebar=5;
       
       PersegiPanjang.tampilkanLuasPersegiPanjang();
       
       SegiTiga LuasSegiTiga= new SegiTiga();
       LuasSegiTiga.alas=3;
       LuasSegiTiga.tiggi=3;
       
       LuasSegiTiga.tampilkanSegiTiga();
       
       Persegi LuasPersegi = new Persegi();
       LuasPersegi.sisi1=5;
        LuasPersegi.tampilkanLuasPersegi();
        
        Lingkaran LuasLingkaran = new Lingkaran();
        LuasLingkaran.jari2=7;
        LuasLingkaran.tampilkanLingkaran();
        
        Trapesium LuasTrapesium = new Trapesium();
        LuasTrapesium.panjang1 = 5;
        LuasTrapesium.panjang2 = 5;
        LuasTrapesium.tinggi = 5;
        LuasTrapesium.tampilkanLuasTrapesium();
        
    }
    
}
