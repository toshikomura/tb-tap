import java.util.ArrayList;

public class usaDateToPtBR implements IAdapter{
   public void converts(Object in, Object out){
      String inStr = (String) in;
      StringBuffer outStr = (StringBuffer) out;

      outStr.delete(0, outStr.length());
      outStr.append(inStr.substring(8));
      outStr.append('/');
      outStr.append(inStr.substring(5, 7));
      outStr.append('/');
      outStr.append(inStr.substring(0, 4));
   }
}
