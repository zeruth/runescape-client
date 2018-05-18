import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class40 implements class89 {

   @ObfuscatedName("bl")
   static String field357;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Lcc;",
      garbageValue = "2009259142"
   )
   public class95 vmethod2093() {
      return new class44();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)Ljp;",
      garbageValue = "1348616283"
   )
   public static class268 method766(int var0) {
      class268 var1 = (class268)class268.field3392.method4023((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class268.field3395.method4626(6, var0);
         var1 = new class268();
         var1.field3396 = var0;
         if(var2 != null) {
            var1.method5047(new class182(var2));
         }

         var1.method5055();
         if(var1.field3428) {
            var1.field3406 = 0;
            var1.field3407 = false;
         }

         class268.field3392.method4028(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgy;IIIIIII)V",
      garbageValue = "1114930208"
   )
   static final void method768(class182 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         class50.field445[var1][var2][var3] = 0;

         while(true) {
            var7 = var0.method3742();
            if(var7 == 0) {
               if(var1 == 0) {
                  class50.field447[0][var2][var3] = -class83.method1985(932731 + var2 + var4, var3 + 556238 + var5) * 8;
               } else {
                  class50.field447[var1][var2][var3] = class50.field447[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if(var7 == 1) {
               int var8 = var0.method3742();
               if(var8 == 1) {
                  var8 = 0;
               }

               if(var1 == 0) {
                  class50.field447[0][var2][var3] = -var8 * 8;
               } else {
                  class50.field447[var1][var2][var3] = class50.field447[var1 - 1][var2][var3] - var8 * 8;
               }
               break;
            }

            if(var7 <= 49) {
               class139.field1895[var1][var2][var3] = var0.method3569();
               class72.field1055[var1][var2][var3] = (byte)((var7 - 2) / 4);
               class50.field448[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if(var7 <= 81) {
               class50.field445[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               class50.field450[var1][var2][var3] = (byte)(var7 - 81);
            }
         }
      } else {
         while(true) {
            var7 = var0.method3742();
            if(var7 == 0) {
               break;
            }

            if(var7 == 1) {
               var0.method3742();
               break;
            }

            if(var7 <= 49) {
               var0.method3742();
            }
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "([BI)Lkr;",
      garbageValue = "-248306191"
   )
   public static class298 method767(byte[] var0) {
      if(var0 == null) {
         return null;
      } else {
         class298 var1 = new class298(var0, class319.field3808, class319.field3807, class192.field2413, class319.field3804, class319.field3806, class294.field3678);
         class319.field3808 = null;
         class319.field3807 = null;
         class192.field2413 = null;
         class319.field3804 = null;
         class319.field3806 = null;
         class294.field3678 = null;
         return var1;
      }
   }
}
