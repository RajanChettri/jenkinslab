import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

public class App3 {
    
    public static void main(String[] args) {
        
      
        String quote="When i #hear somebody sigh, "+
"#life is hard, I am #always tempted to"+
"ask, #compared to #what?";


List result= Arrays.stream(quote.split(" ")).
filter(word -> word.charAt(0)=='#').collect(Collectors.toList());

System.out.println(result);

    }
}
