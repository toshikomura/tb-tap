public class Converter implements ISubject{   
   private IAdapter adapter;

   public Converter(){
      adapter = null;
   }

   public void converteInOut(Object in, Object out){
      this.adapter.converts(in, out);
   }

   public void adapt(IAdapter a){
      this.adapter = a;
   }

   public void register(IObserver obs){
      /*if (this.observers == null)
         observers; = new ArrayList<IObservers>();
      */
      observers.add(obs);
   }

   public void notifyObservers(Object in, Object out){
      for (IObserver obs: observers)
         obs.conversionNotify(in, out);
   }
}
