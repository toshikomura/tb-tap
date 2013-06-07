import java.util.ArrayList;

/**
Variaveis locais, na ordem de declaracao:
  f: objeto da classe que fabrica os objetos  
  c: objeto da classe generica de conversao 
  in: String contendo a data de entrada de usaDateToPtBR()
  out: StringBuffer que recebe as conversoes   
  a: ArrayList usado para encapsular os tres argumentos int's de
numericDatetoStrDate()
*/
public class Programa{
   public static void main(String args[]){
	FabricaAbstractFactory f = new FabricaAbstractFactory();
      Converter c = f.instanciaConverter();
      String in = "2011/11/22";
      StringBuffer out = new StringBuffer(); 
      ArrayList<Integer> a = new ArrayList<Integer>();

      /* observers */
      c.register(new inOutObserver());
      c.register(new conclusionObserver());

      c.adapt(f.instanciausaDateToPtBR()); // primeira classe de conversao
      c.converteInOut(in, out);
      c.notifyObservers(in, out);

      a.add(2011); // Array (aaa,mm,dd) entrada de numericDatetoStrDate
      a.add(11);
      a.add(22);
      c.adapt(f.instancianumericDatetoStrDate()); // segunda classe de conversao
      c.converteInOut(a, out);
      c.notifyObservers(formatArray(a), out);
   }

   /*
     Formata o array (aaaa,mm,dd) para ser impresso
   */
   public static String formatArray(ArrayList<Integer> a){
      return new String('(' + a.get(0).toString() + ", " +
                        a.get(1).toString() + ", " +
                        a.get(2).toString() + ')');
   }
}
