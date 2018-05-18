import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class144 extends class283 {

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static class230 field1921;
   @ObfuscatedName("w")
   final boolean field1917;


   public class144(boolean var1) {
      this.field1917 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lkd;Lkd;I)I",
      garbageValue = "888960326"
   )
   int method3189(class287 var1, class287 var2) {
      return var2.field3647 != var1.field3647?(this.field1917?var1.field3647 - var2.field3647:var2.field3647 - var1.field3647):this.method5320(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3189((class287)var1, (class287)var2);
   }

   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      signature = "(Lbu;IIB)V",
      garbageValue = "93"
   )
   static void method3193(class60 var0, int var1, int var2) {
      if(var0.field915 == var1 && var1 != -1) {
         int var3 = class137.method3151(var1).field3566;
         if(var3 == 1) {
            var0.field916 = 0;
            var0.field917 = 0;
            var0.field913 = var2;
            var0.field919 = 0;
         }

         if(var3 == 2) {
            var0.field919 = 0;
         }
      } else if(var1 == -1 || var0.field915 == -1 || class137.method3151(var1).field3560 >= class137.method3151(var0.field915).field3560) {
         var0.field915 = var1;
         var0.field916 = 0;
         var0.field917 = 0;
         var0.field913 = var2;
         var0.field919 = 0;
         var0.field942 = var0.field937;
      }

   }
}
