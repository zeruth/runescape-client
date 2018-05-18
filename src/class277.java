import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class277 {

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIILjp;II)V",
      garbageValue = "-71526505"
   )
   static void method5252(int var0, int var1, int var2, class268 var3, int var4) {
      class68 var5 = new class68();
      var5.field998 = var0;
      var5.field1000 = var1 * 128;
      var5.field1007 = var2 * 128;
      int var6 = var3.field3404;
      int var7 = var3.field3420;
      if(var4 == 1 || var4 == 3) {
         var6 = var3.field3420;
         var7 = var3.field3404;
      }

      var5.field1001 = (var6 + var1) * 128;
      var5.field1005 = (var7 + var2) * 128;
      var5.field1004 = var3.field3433;
      var5.field1011 = var3.field3434 * 128;
      var5.field997 = var3.field3435;
      var5.field1003 = var3.field3405;
      var5.field1008 = var3.field3437;
      if(var3.field3430 != null) {
         var5.field999 = var3;
         var5.method1730();
      }

      class68.field1002.method4126(var5);
      if(var5.field1008 != null) {
         var5.field1009 = var5.field997 + (int)(Math.random() * (double)(var5.field1003 - var5.field997));
      }

   }
}
