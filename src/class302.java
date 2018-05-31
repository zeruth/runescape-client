import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kk")
public class class302 {
   @ObfuscatedName("q")
   static final char[] field3730;
   @ObfuscatedName("b")
   static final char[] field3729;

   static {
      field3730 = new char[]{' ', '_', '-'};
      field3729 = new char[]{'[', ']', '#'};
   }

   @ObfuscatedName("w")
   public static String method5659(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(0L == var0 % 37L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; var3 != 0L; var3 /= 37L) {
               ++var2;
            }

            char var4;
            StringBuilder var8;
            for(var8 = new StringBuilder(var2); 0L != var0; var8.append(var4)) {
               long var5 = var0;
               var0 /= 37L;
               var4 = class303.field3732[(int)(var5 - var0 * 37L)];
               if(var4 == '_') {
                  int var7 = var8.length() - 1;
                  var8.setCharAt(var7, Character.toUpperCase(var8.charAt(var7)));
                  var4 = 160;
               }
            }

            var8.reverse();
            var8.setCharAt(0, Character.toUpperCase(var8.charAt(0)));
            return var8.toString();
         }
      } else {
         return null;
      }
   }
}
