public class Nodo<T> {
   private T elemento;
   private Nodo<T> successivo;

   // constructor
   Nodo(T elemento) {
      this.elemento = elemento;
      this.successivo = null;
   }

   public T getElemento() {
      return elemento;
   }

   public Nodo<T> getSuccessivo() {
      return successivo;
   }

   public void setElemento(T elemento) {
      this.elemento = elemento;
   }

   public void setSuccessivo(Nodo<T> successivo) {
      this.successivo = successivo;
   }
}
