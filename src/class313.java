import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class313 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lgt;"
   )
   public static class203 field3762 = new class203();
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1642435029
   )
   public static int field3765;


   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Liv;Liv;Ljava/lang/String;Ljava/lang/String;I)Lkr;",
      garbageValue = "566118556"
   )
   public static class298 method5759(class247 var0, class247 var1, String var2, String var3) {
      int var4 = var0.method4644(var2);
      int var5 = var0.method4693(var4, var3);
      class298 var6;
      if(!class306.method5702(var0, var4, var5)) {
         var6 = null;
      } else {
         var6 = class40.method767(var1.method4626(var4, var5));
      }

      return var6;
   }
}
