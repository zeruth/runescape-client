import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
public class class296 {

   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1286566079
   )
   static int field3692;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   class247 field3694;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   class247 field3689;
   @ObfuscatedName("q")
   HashMap field3691;


   @ObfuscatedSignature(
      signature = "(Liv;Liv;)V"
   )
   public class296(class247 var1, class247 var2) {
      this.field3694 = var1;
      this.field3689 = var2;
      this.field3691 = new HashMap();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([Lkt;I)Ljava/util/HashMap;",
      garbageValue = "959623838"
   )
   public HashMap method5522(class295[] var1) {
      HashMap var2 = new HashMap();
      class295[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class295 var5 = var3[var4];
         if(this.field3691.containsKey(var5)) {
            var2.put(var5, this.field3691.get(var5));
         } else {
            class298 var6 = class313.method5759(this.field3694, this.field3689, var5.field3686, "");
            if(var6 != null) {
               this.field3691.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }
}
