public final class Skills {
   private static mHashtable skills = new mHashtable();

   public static void add(Skill var0) {
      skills.put(new Short(var0.skillId), var0);
   }

   public static Skill get(short var0) {
      return (Skill) skills.get(new Short(var0));
   }
}
