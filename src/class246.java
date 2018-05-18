import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class246 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   class249 field3167;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2000315563
   )
   int field3170;
   @ObfuscatedName("q")
   byte field3169;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Lit;",
      garbageValue = "-1507691651"
   )
   public static class253 method4622(int var0) {
      class253 var1 = (class253)class253.field3248.method4023((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class253.field3247.method4626(5, var0);
         var1 = new class253();
         if(var2 != null) {
            var1.method4818(new class182(var2));
         }

         class253.field3248.method4028(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Lhl;I)Ljava/lang/String;",
      garbageValue = "240844690"
   )
   static String method4621(String var0, class230 var1) {
      if(var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if(var3 == -1) {
                  break;
               }

               var0 = var0.substring(0, var3) + class27.method491(class11.method114(var1, var2 - 1)) + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }

   @ObfuscatedName("kb")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1914952653"
   )
   static void method4623(int var0) {
      client.field678 = var0;
   }
}
