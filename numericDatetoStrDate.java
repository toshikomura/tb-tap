import java.util.ArrayList;

public class numericDatetoStrDate implements IAdapter{
   public void converts(Object in, Object out){
      ArrayList<Integer> inArray = (ArrayList<Integer>) in;
      StringBuffer outStr = (StringBuffer) out;

      outStr.delete(0, outStr.length());
      outStr.append(inArray.get(2)); 
      outStr.append('/');
      outStr.append(inArray.get(1));
      outStr.append('/');
      outStr.append(inArray.get(0));
   }
}
