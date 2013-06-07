public class inOutObserver implements IObserver{
   public void conversionNotify(Object in, Object out){
      System.out.println(in + " ---> " + out);
   }
}
