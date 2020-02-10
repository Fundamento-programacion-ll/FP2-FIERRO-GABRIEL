
package trabajoenclase;

import java.util.Comparator;

public class comparacion implements Comparator <sueldo>{

    @Override
    public int compare(sueldo s1, sueldo s2) {
        
        if (s1.getSueldo() > s2.getSueldo() ){
            return 1;
        }else if (s1.getSueldo() < s2.getSueldo() ){
            return -1;
        }
        return 0;
    }
}
