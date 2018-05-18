import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class51 {

   @ObfuscatedName("qv")
   @ObfuscatedSignature(
      signature = "Lbt;"
   )
   static class66 field468;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1546943225
   )
   public static int field463;
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "[Llc;"
   )
   static class318[] field469;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lcs;"
   )
   class84 field467;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1864734979
   )
   int field464 = -1;
   @ObfuscatedName("q")
   int[] field465;
   @ObfuscatedName("b")
   String[] field466;


   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)Liz;",
      garbageValue = "651406254"
   )
   public static class258 method1064(int var0) {
      class258 var1 = (class258)class258.field3300.method4023((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class258.field3288.method4626(13, var0);
         var1 = new class258();
         var1.field3290 = var0;
         if(var2 != null) {
            var1.method4862(new class182(var2));
         }

         class258.field3300.method4028(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)Ljy;",
      garbageValue = "6"
   )
   public static class266 method1063(int var0) {
      class266 var1 = (class266)class266.field3356.method4023((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class311.field3753.method4626(8, var0);
         var1 = new class266();
         if(var2 != null) {
            var1.method4996(new class182(var2));
         }

         class266.field3356.method4028(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "2082592017"
   )
   static int method1062(int var0, class84 var1, boolean var2) {
      class230 var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class61.method1188(class69.field1026[--class45.field377]);
      } else {
         var3 = var2?class184.field2379:class67.field996;
      }

      class181.method3548(var3);
      if(var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if(var0 == 1201) {
            var3.field2666 = 2;
            var3.field2757 = class69.field1026[--class45.field377];
            return 1;
         } else if(var0 == 1202) {
            var3.field2666 = 3;
            var3.field2757 = class150.field1948.field561.method4493();
            return 1;
         } else {
            return 2;
         }
      } else {
         class45.field377 -= 2;
         int var4 = class69.field1026[class45.field377];
         int var5 = class69.field1026[class45.field377 + 1];
         var3.field2754 = var4;
         var3.field2677 = var5;
         class269 var6 = class120.method2784(var4);
         var3.field2675 = var6.field3470;
         var3.field2707 = var6.field3456;
         var3.field2676 = var6.field3457;
         var3.field2672 = var6.field3458;
         var3.field2673 = var6.field3486;
         var3.field2701 = var6.field3454;
         if(var0 == 1205) {
            var3.field2645 = 0;
         } else if(var0 == 1212 | var6.field3482 == 1) {
            var3.field2645 = 1;
         } else {
            var3.field2645 = 2;
         }

         if(var3.field2678 > 0) {
            var3.field2701 = var3.field2701 * 32 / var3.field2678;
         } else if(var3.field2634 > 0) {
            var3.field2701 = var3.field2701 * 32 / var3.field2634;
         }

         return 1;
      }
   }

   @ObfuscatedName("ks")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-96"
   )
   static void method1061() {
      if(client.field622 && class150.field1948 != null) {
         int var0 = class150.field1948.field928[0];
         int var1 = class150.field1948.field939[0];
         if(var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
         }

         class154.field1979 = class150.field1948.field900;
         int var2 = class264.method4955(class150.field1948.field900, class150.field1948.field918, class192.field2415) - client.field668;
         if(var2 < client.field857) {
            client.field857 = var2;
         }

         class53.field481 = class150.field1948.field918;
         client.field622 = false;
      }

   }
}
