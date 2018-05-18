import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
public class class263 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3337;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static class200 field3338 = new class200(64);
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 891453119
   )
   public int field3342;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1326445313
   )
   public int field3339;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1608300809
   )
   public int field3341;


   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-1967383850"
   )
   public void method4945(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method4952(var1, var2);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;IB)V",
      garbageValue = "-22"
   )
   void method4952(class182 var1, int var2) {
      if(var2 == 1) {
         this.field3342 = var1.method3574();
         this.field3339 = var1.method3742();
         this.field3341 = var1.method3742();
      }

   }

   @ObfuscatedName("a")
   static boolean method4946(long var0) {
      return (int)(var0 >>> 16 & 1L) == 1;
   }

   @ObfuscatedName("fc")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1750572180"
   )
   static final void method4951() {
      if(class191.field2411 != null) {
         class191.field2411.method2192();
      }

      if(class2.field11 != null) {
         class2.field11.method2192();
      }

   }
}
