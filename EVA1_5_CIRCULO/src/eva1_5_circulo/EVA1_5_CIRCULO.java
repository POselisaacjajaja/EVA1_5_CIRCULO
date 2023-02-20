/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_circulo;

/**
 *
 * @author isaaczapatto
 */
public class EVA1_5_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AREA area1 = new AREA();
        
        area1.setRadio(20);
        
        System.out.println("El área es: " + area1.calcularÁrea());
        System.out.println("El perímetro es: " + area1.calcularPerímetro());
        
    }
    
}
