
package id.blits.belajarhitung;


public class Trapesium {
    float panjang1, panjang2, tinggi, luas;
   void tampilkanLuasTrapesium(){
       luas= ((panjang1+panjang2)*tinggi)/2;
       System.out.println("Luas Trapesium :");
       System.out.println("panjang 1 :"+panjang1);
       System.out.println("panjang 2 :"+panjang2);
       System.out.println("Tinggi :"+tinggi);
       System.out.println("Luas :"+luas);
       System.out.println();
   }
}
