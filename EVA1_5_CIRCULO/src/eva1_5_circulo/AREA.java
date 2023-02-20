/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_5_circulo;

/**
 *
 * @author isaaczapatto
 */
public class AREA {
    //Atributos (EN GENERAL, ES LO QUE PEDIREMOS AL USUSARIO)
    private double Radio;
    
    //Constructor (los datos que se establecen aquí SÓLO SE USAN UNA VEZ)
    public AREA(){
        Radio = 0;
    }
    
    //Segundo constructor
    public AREA(double nRadio){
        Radio = nRadio;
    }
    
    
    //Métodos get & set
    public double getRadio(){     
    return Radio;
    }
    public void setRadio(double valor){
     Radio = valor;
    }
    
    
    //Método para el área & perímetro
    public double calcularÁrea(){
        double Área = Math.PI * (Radio * Radio);
        return Área;
    }
    public double calcularPerímetro(){
        double Perímetro = Math.PI * (Radio * 2);
        return Perímetro;
    }
    
    
    //Imprimir
    
}
