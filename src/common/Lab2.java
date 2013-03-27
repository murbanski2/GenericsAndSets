package common;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author murbanski
 */
public class Lab2 {
    public static void main(String[] args) {
        Address a1 = new Address();
        a1.setAddress1("1313 Mockingbird Ln");
        a1.setAddress2("Apartment 2");
        a1.setCity("StoneBank");
        a1.setEmail("eddiemunster@juno.com");
        a1.setPhone("414-227-3606");
        Address a2 = new Address();
        a2.setAddress1("1847 Rogers Rd");
        a2.setAddress2("B");
        a2.setCity("Hartland");
        a2.setEmail("Ozzie@juno.com");
        a2.setPhone("262-367-2248");
        Address a3 = new Address();
        a3.setAddress1("1313 Mockingbird Ln");
        a3.setAddress2("Apartment 2");
        a3.setCity("StoneBank");
        a3.setEmail("eddiemunster@juno.com");
        a3.setPhone("414-227-3606");
        Address a4 = new Address();
        a4.setAddress1("1313 Mockingbird Ln");
        a4.setAddress2("Apartment 1");
        a4.setCity("StoneBank");
        a4.setEmail("marilynmunster@juno.com");
        a4.setPhone("414-227-3606");
        
        Set<Address> addresses = new HashSet<Address>();
        addresses.add(a1);
        addresses.add(a2);
        addresses.add(a3);
        addresses.add(a4);
        
        for(Address addr:addresses  ) {
            System.out.println(addr);
        }
        
    }
}
