/*

 */
package eva2_7_this;


public class EVA2_7_THIS {


    public static void main(String[] args) {
    //imprimirDatos();      
    //this no se puede usar en un contexto estático


    }
  
  public void imprimir(){
   //aquí también es visible this   
  }
    
  class Persona {
  private String nombre;

 //------------------------------------------------------------------------------  
  public Persona(String nombre){
  this.nombre = nombre;
  // Es el atributo de la clase
  //"nombre" es la variable declarada del método
  
  }
//------------------------------------------------------------------------------  
  
    public String getNombre() {
        return nombre;
     }

    public void setNombre(String nombre) {
         this.nombre = nombre;
    }
 //------------------------------------------------------------------------------   
   public void imprimirDatos(){
       System.out.println("El nombre es: " +this.nombre);    
   }
  
  

  
  }
    

    
 
}
