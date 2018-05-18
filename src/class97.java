import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public class class97 implements Runnable {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lcc;"
   )
   volatile class95[] field1355 = new class95[2];


   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            class95 var2 = this.field1355[var1];
            if(var2 != null) {
               var2.method2192();
            }
         }
      } catch (Exception var4) {
         class43.method786((String)null, var4);
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "116813309"
   )
   public static boolean method2272(int var0) {
      return (var0 >> 30 & 1) != 0;
   }
}
