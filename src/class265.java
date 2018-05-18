import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class265 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3351;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   public static class200 field3352 = new class200(64);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   class197 field3353;


   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2120970672"
   )
   public void method4976() {}

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-83961279"
   )
   public void method4990(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method4978(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "-132881650"
   )
   void method4978(class182 var1, int var2) {
      if(var2 == 249) {
         this.field3353 = class109.method2525(var1, this.field3353);
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1681148037"
   )
   public int method4982(int var1, int var2) {
      class197 var4 = this.field3353;
      int var3;
      if(var4 == null) {
         var3 = var2;
      } else {
         class211 var5 = (class211)var4.method3991((long)var1);
         if(var5 == null) {
            var3 = var2;
         } else {
            var3 = var5.field2464;
         }
      }

      return var3;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-188946533"
   )
   public String method4980(int var1, String var2) {
      return class71.method1822(this.field3353, var1, var2);
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      signature = "(IIII)Lbe;",
      garbageValue = "-1188594297"
   )
   static final class55 method4994(int var0, int var1, int var2) {
      class55 var3 = new class55();
      var3.field506 = var1;
      var3.field503 = var2;
      client.field826.method4063(var3, (long)var0);
      class25.method465(var1);
      class230 var4 = class61.method1188(var0);
      class181.method3548(var4);
      if(client.field756 != null) {
         class181.method3548(client.field756);
         client.field756 = null;
      }

      class0.method9();
      class45.method818(class230.field2615[var0 >> 16], var4, false);
      class4.method55(var1);
      if(client.field752 != -1) {
         class76.method1849(client.field752, 1);
      }

      return var3;
   }
}
