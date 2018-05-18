import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class145 extends class283 {

   @ObfuscatedName("w")
   final boolean field1924;


   public class145(boolean var1) {
      this.field1924 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lkd;Lkd;I)I",
      garbageValue = "-295095521"
   )
   int method3195(class287 var1, class287 var2) {
      return var1.field3648 != 0 && var2.field3648 != 0?(this.field1924?var1.method5299().method5464(var2.method5299()):var2.method5299().method5464(var1.method5299())):this.method5320(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3195((class287)var1, (class287)var2);
   }

   @ObfuscatedName("gm")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   static void method3200() {
      if(client.field711) {
         class32.method586(class150.field1948, false);
      }

   }

   @ObfuscatedName("km")
   @ObfuscatedSignature(
      signature = "(IIIZI)V",
      garbageValue = "-37627365"
   )
   public static void method3194(int var0, int var1, int var2, boolean var3) {
      class172 var4 = class133.method3115(class169.field2161, client.field739.field1250);
      var4.field2279.method3595(var2);
      var4.field2279.method3605(var0);
      var4.field2279.method3605(var1);
      var4.field2279.method3670(var3?client.field674:0);
      client.field739.method2019(var4);
   }
}
