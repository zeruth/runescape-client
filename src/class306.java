import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
public class class306 {

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Liv;III)Z",
      garbageValue = "-584627357"
   )
   public static boolean method5702(class247 var0, int var1, int var2) {
      byte[] var3 = var0.method4626(var1, var2);
      if(var3 == null) {
         return false;
      } else {
         class171.method3471(var3);
         return true;
      }
   }
}
