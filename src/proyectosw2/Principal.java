/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosw2;
import java.io.*;
/**
 *
 * @author Administrator
 */
public class Principal {
      public void Menuprincipal(){
          int opcion=0;
          
        int res,f;
            System.out.println("1.Producto Fisico");
            System.out.println("2.Pago de Libro");           
            System.out.println("3.Pago de Membresia");
            System.out.println("4.Actualización de Membresia");
            System.out.println("5.Pago por video");
            
try { 
      BufferedReader entrada = 
        new BufferedReader(new InputStreamReader(System.in));   
      opcion = Integer.parseInt( entrada.readLine() ); 
    }
    catch (IOException e) {}
        if (opcion == 1){   
            generarOrden();
        }
         if (opcion == 2){ 
            crearDuplicado();
    }
         if (opcion == 3){ 
            activarMembresia();
           
    }
         if (opcion == 4){ 
             actualizarMembresia();
    }
         if (opcion == 5){ 
             agregarVideo();
    }
      } 
      public void generarOrden() {
          
           System.out.println("esta es la opcion 1");
           Ordenes_Compra oc1 = new Ordenes_Compra ();
           oc1.generar_orden(1,"10/02/2014","13/02/2014","5:00","10:00","Medellin","Neiva",5,"","","","");
           System.out.println(oc1);
          
             }
      public void crearDuplicado() {
          
          System.out.println("esta es la opcion 2");
          //Aca invocar los  metodos
             }
      public void activarMembresia() {
          
          
          //Aca invocar los  metodos
             }
      public void actualizarMembresia() {
          
         
          //Aca invocar los  metodos
             }
      public void agregarVideo() {
          
         
          //Aca invocar los  metodos
             }
        }