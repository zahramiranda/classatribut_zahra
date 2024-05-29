/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvariable;
class Display{
   static String type = "Display";
   private String name;

   Display(String name){
      this.name = name;
   }

   void setType(String typeInput){
      //type = typeInput; //alternatif1
      //this.type = typeInput; //alternatif2
      Display.type =typeInput; //alternatif3
   }
   void show(){
      System.out.println("Display name = " + this.name);
   }
}

public class Staticvariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Display display1 = new Display("Monitor");
      display1.show();

      Display display2 = new Display("Smartphone");
      display2.show();

      //tampilkan static variable atau class variable

      //kita coba mengganti variable staticnya
      display1.setType("Spanduk");

      System.out.println("\nMenampilkan static atau class variable");
      System.out.println(display1.type);
      System.out.println(display2.type);
      System.out.println(Display.type);
    }
    
}
