import java.util.ArrayList;

interface ISubject{
   ArrayList<IObserver> observers = new ArrayList<IObserver>();

   public void register(IObserver obs);
   public void notifyObservers(Object in, Object out);
}
