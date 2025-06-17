import java.util.Hashtable;

public final class mHashtable {
   public Hashtable h = new Hashtable();

   public final Object get(Object var1) {
      return this.h.get(var1);
   }

   public final boolean equals(Object var1) {
      return this.h.equals(var1);
   }

   public final void put(Object var1, Object var2) {
      this.h.put(var1, var2);
   }
}
