import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class class120 {

   @ObfuscatedName("w")
   static boolean field1687 = false;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1071935907
   )
   static int field1681 = 0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -831543585
   )
   static int field1680 = 0;
   @ObfuscatedName("b")
   static boolean field1683 = false;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1611736783
   )
   static int field1684;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 2958943
   )
   static int field1685;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1128491825
   )
   static int field1682;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -817355445
   )
   public static int field1686 = 0;
   @ObfuscatedName("g")
   public static long[] field1688 = new long[1000];


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIII)J",
      garbageValue = "2020124957"
   )
   static long method2812(int var0, int var1, int var2) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Ljm;",
      garbageValue = "60"
   )
   public static class269 method2784(int var0) {
      class269 var1 = (class269)class269.field3444.method4023((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class269.field3443.method4626(10, var0);
         var1 = new class269();
         var1.field3484 = var0;
         if(var2 != null) {
            var1.method5100(new class182(var2));
         }

         var1.method5099();
         if(var1.field3460 != -1) {
            var1.method5118(method2784(var1.field3460), method2784(var1.field3447));
         }

         if(var1.field3491 != -1) {
            var1.method5106(method2784(var1.field3491), method2784(var1.field3490));
         }

         if(var1.field3440 != -1) {
            var1.method5137(method2784(var1.field3440), method2784(var1.field3492));
         }

         if(!class4.field31 && var1.field3462) {
            var1.field3449 = "Members object";
            var1.field3489 = false;
            var1.field3463 = null;
            var1.field3464 = null;
            var1.field3465 = -1;
            var1.field3439 = 0;
            if(var1.field3488 != null) {
               boolean var3 = false;

               for(class204 var4 = var1.field3488.method3996(); var4 != null; var4 = var1.field3488.method3995()) {
                  class264 var5 = class182.method3811((int)var4.field2449);
                  if(var5.field3349) {
                     var4.method4098();
                  } else {
                     var3 = true;
                  }
               }

               if(!var3) {
                  var1.field3488 = null;
               }
            }
         }

         class269.field3444.method4028(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1058200071"
   )
   public static void method2815() {
      class269.field3459.method4024();
   }

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "780822000"
   )
   static final void method2813(boolean var0) {
      for(int var1 = 0; var1 < client.field635; ++var1) {
         class72 var2 = client.field807[client.field636[var1]];
         if(var2 != null && var2.vmethod1828() && var2.field1058.field3524 == var0 && var2.field1058.method5194()) {
            int var3 = var2.field900 >> 7;
            int var4 = var2.field918 >> 7;
            if(var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
               if(var2.field885 == 1 && (var2.field900 & 127) == 64 && (var2.field918 & 127) == 64) {
                  if(client.field689[var3][var4] == client.field690) {
                     continue;
                  }

                  client.field689[var3][var4] = client.field690;
               }

               long var5 = class59.method1129(0, 0, 1, !var2.field1058.field3535, client.field636[var1]);
               var2.field905 = client.field679;
               class56.field523.method2945(class192.field2415, var2.field900, var2.field918, class264.method4955(var2.field885 * 64 - 64 + var2.field900, var2.field885 * 64 - 64 + var2.field918, class192.field2415), var2.field885 * 64 - 64 + 60, var2, var2.field883, var5, var2.field884);
            }
         }
      }

   }
}
