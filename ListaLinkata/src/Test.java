public class Test {
   public static void main(String[] args) {
      // inizializzazione
      ListaLinkata listaLinkata = new ListaLinkata();
      Nodo nodo1 = new Nodo(14124);
      Nodo nodo2 = new Nodo(34353);
      Nodo nodo3 = new Nodo(5675);
      Nodo nodo4 = new Nodo(9679);
      Nodo nodo5 = new Nodo(46456);
      Nodo nodo6 = new Nodo(70780);

      listaLinkata.addFirst(nodo1);
      listaLinkata.addFirst(nodo2);
      listaLinkata.addFirst(nodo3);

      System.out.println(listaLinkata.getTesta().getElemento());
      System.out.println("Lunghezza lista: " + listaLinkata.getLunghezzaLista());

      listaLinkata.removeFirst();

      System.out.println(listaLinkata.getTesta().getElemento());
      System.out.println("Lunghezza lista: " + listaLinkata.getLunghezzaLista());
   }
}
