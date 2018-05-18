import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class9 {

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   static class247 field63;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1670366999
   )
   public static int field70;
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "[Llh;"
   )
   static class317[] field61;
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static class249 field62;


   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;II)V",
      garbageValue = "2014433733"
   )
   static final void method95(String var0, int var1) {
      class172 var2 = class133.method3115(class169.field2207, client.field739.field1250);
      var2.field2279.method3552(class12.method123(var0) + 1);
      var2.field2279.method3594(var1);
      var2.field2279.method3549(var0);
      client.field739.method2019(var2);
   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      signature = "([Lhl;IIIZB)V",
      garbageValue = "5"
   )
   static void method100(class230[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < var0.length; ++var5) {
         class230 var6 = var0[var5];
         if(var6 != null && var6.field2642 == var1) {
            class138.method3155(var6, var2, var3, var4);
            class45.method820(var6, var2, var3);
            if(var6.field2644 > var6.field2674 - var6.field2627) {
               var6.field2644 = var6.field2674 - var6.field2627;
            }

            if(var6.field2644 < 0) {
               var6.field2644 = 0;
            }

            if(var6.field2611 > var6.field2647 - var6.field2639) {
               var6.field2611 = var6.field2647 - var6.field2639;
            }

            if(var6.field2611 < 0) {
               var6.field2611 = 0;
            }

            if(var6.field2625 == 0) {
               class45.method818(var0, var6, var4);
            }
         }
      }

   }

   @ObfuscatedName("iz")
   @ObfuscatedSignature(
      signature = "(Lhl;I)Z",
      garbageValue = "945191862"
   )
   static final boolean method96(class230 var0) {
      if(var0.field2737 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < var0.field2737.length; ++var1) {
            int var2 = class11.method114(var0, var1);
            int var3 = var0.field2738[var1];
            if(var0.field2737[var1] == 2) {
               if(var2 >= var3) {
                  return false;
               }
            } else if(var0.field2737[var1] == 3) {
               if(var2 <= var3) {
                  return false;
               }
            } else if(var0.field2737[var1] == 4) {
               if(var3 == var2) {
                  return false;
               }
            } else if(var2 != var3) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2011031140"
   )
   static final void method99() {
      class172 var0 = class133.method3115(class169.field2186, client.field739.field1250);
      client.field739.method2019(var0);

      for(class55 var1 = (class55)client.field826.method4055(); var1 != null; var1 = (class55)client.field826.method4056()) {
         if(var1.field503 == 0 || var1.field503 == 3) {
            class21.method300(var1, true);
         }
      }

      if(client.field756 != null) {
         class181.method3548(client.field756);
         client.field756 = null;
      }

   }

   @ObfuscatedName("kt")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1426585201"
   )
   static String method97(String var0) {
      class242[] var1 = class274.method5249();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class242 var3 = var1[var2];
         if(var3.field3142 != -1 && var0.startsWith(class36.method687(var3.field3142))) {
            var0 = var0.substring(6 + Integer.toString(var3.field3142).length());
            break;
         }
      }

      return var0;
   }
}
