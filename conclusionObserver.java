public class conclusionObserver implements IObserver{
   public void conversionNotify(Object in, Object out){
      System.out.println("Conversão concluída.");
   }
}
