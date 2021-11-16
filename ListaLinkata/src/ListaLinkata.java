public class ListaLinkata<T> {
   private Nodo<T> testa;
   private int lunghezzaLista;

   // constructor
   ListaLinkata() {
      this.testa = null;
      this.lunghezzaLista = 0;
   }

   public void removeFirst() {
      if (getLunghezzaLista() != 0) {
         this.setTesta(testa.getSuccessivo());
         lunghezzaLista--;
      }
   }

   public void addFirst(Nodo nodo) {
      if (testa == null) {
         this.testa = nodo;
         lunghezzaLista++;
      } else {
         nodo.setSuccessivo(testa);
         this.testa = nodo;
         lunghezzaLista++;
      }
   }

   public Nodo<T> getTesta() {
      return testa;
   }

   public int getLunghezzaLista() {
      return lunghezzaLista;
   }

   public void setTesta(Nodo<T> testa) {
      this.testa = testa;
   }

}