import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class138 extends class283 {

   @ObfuscatedName("w")
   final boolean field1892;


   public class138(boolean var1) {
      this.field1892 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lkd;Lkd;I)I",
      garbageValue = "1131558933"
   )
   int method3153(class287 var1, class287 var2) {
      return client.field676 == var1.field3648 && var2.field3648 == client.field676?(this.field1892?var1.method5299().method5464(var2.method5299()):var2.method5299().method5464(var1.method5299())):this.method5320(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3153((class287)var1, (class287)var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1910296838"
   )
   public static int method3159(int var0) {
      class263 var2 = (class263)class263.field3338.method4023((long)var0);
      class263 var1;
      if(var2 != null) {
         var1 = var2;
      } else {
         byte[] var7 = class263.field3337.method4626(14, var0);
         var2 = new class263();
         if(var7 != null) {
            var2.method4945(new class182(var7));
         }

         class263.field3338.method4028(var2, (long)var0);
         var1 = var2;
      }

      int var3 = var1.field3342;
      int var4 = var1.field3339;
      int var5 = var1.field3341;
      int var6 = class225.field2579[var5 - var4];
      return class225.field2578[var3] >> var4 & var6;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IZIZB)V",
      garbageValue = "74"
   )
   static void method3160(int var0, boolean var1, int var2, boolean var3) {
      if(class143.field1914 != null) {
         class111.method2598(0, class143.field1914.length - 1, var0, var1, var2, var3);
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "0"
   )
   static final void method3158(String var0) {
      class172 var1 = class133.method3115(class169.field2237, client.field739.field1250);
      var1.field2279.method3552(class12.method123(var0));
      var1.field2279.method3549(var0);
      client.field739.method2019(var1);
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      signature = "(Lhl;IIZI)V",
      garbageValue = "-443558683"
   )
   static void method3155(class230 var0, int var1, int var2, boolean var3) {
      int var4 = var0.field2627;
      int var5 = var0.field2639;
      if(var0.field2667 == 0) {
         var0.field2627 = var0.field2634;
      } else if(var0.field2667 == 1) {
         var0.field2627 = var1 - var0.field2634;
      } else if(var0.field2667 == 2) {
         var0.field2627 = var0.field2634 * var1 >> 14;
      }

      if(var0.field2631 == 0) {
         var0.field2639 = var0.field2635;
      } else if(var0.field2631 == 1) {
         var0.field2639 = var2 - var0.field2635;
      } else if(var0.field2631 == 2) {
         var0.field2639 = var2 * var0.field2635 >> 14;
      }

      if(var0.field2667 == 4) {
         var0.field2627 = var0.field2740 * var0.field2639 / var0.field2641;
      }

      if(var0.field2631 == 4) {
         var0.field2639 = var0.field2627 * var0.field2641 / var0.field2740;
      }

      if(var0.field2711 == 1337) {
         client.field776 = var0;
      }

      if(var3 && var0.field2745 != null && (var4 != var0.field2627 || var5 != var0.field2639)) {
         class56 var6 = new class56();
         var6.field511 = var0;
         var6.field525 = var0.field2745;
         client.field755.method4126(var6);
      }

   }
}
