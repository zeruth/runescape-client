import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
final class class0 implements Comparator {

   @ObfuscatedName("oe")
   @ObfuscatedSignature(
      signature = "Lkb;"
   )
   static class293 field2;
   @ObfuscatedName("k")
   static int[] field4;
   @ObfuscatedName("dh")
   static String field1;
   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      signature = "[Llh;"
   )
   static class317[] field0;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lq;Lq;B)I",
      garbageValue = "1"
   )
   int method1(class2 var1, class2 var2) {
      return var1.field17 < var2.field17?-1:(var2.field17 == var1.field17?0:1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1((class2)var1, (class2)var2);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "-2164"
   )
   public static boolean method0() {
      try {
         if(class217.field2486 == 2) {
            if(class286.field3644 == null) {
               class286.field3644 = class223.method4454(class26.field236, class19.field167, class217.field2487);
               if(class286.field3644 == null) {
                  return false;
               }
            }

            if(class59.field557 == null) {
               class59.field557 = new class98(class217.field2490, class217.field2482);
            }

            if(class217.field2485.method4229(class286.field3644, class217.field2484, class59.field557, 22050)) {
               class217.field2485.method4230();
               class217.field2485.method4302(class21.field185);
               class217.field2485.method4327(class286.field3644, class178.field2317);
               class217.field2486 = 0;
               class286.field3644 = null;
               class59.field557 = null;
               class26.field236 = null;
               return true;
            }
         }
      } catch (Exception var1) {
         var1.printStackTrace();
         class217.field2485.method4236();
         class217.field2486 = 0;
         class286.field3644 = null;
         class59.field557 = null;
         class26.field236 = null;
      }

      return false;
   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-924175041"
   )
   static void method9() {
      for(int var0 = 0; var0 < client.field657; ++var0) {
         int var2 = client.field702[var0];
         boolean var1 = var2 == 57 || var2 == 58 || var2 == 1007 || var2 == 25 || var2 == 30;
         if(var1) {
            if(var0 < client.field657 - 1) {
               for(int var3 = var0; var3 < client.field657 - 1; ++var3) {
                  client.field734[var3] = client.field734[var3 + 1];
                  client.field735[var3] = client.field735[var3 + 1];
                  client.field702[var3] = client.field702[var3 + 1];
                  client.field619[var3] = client.field619[var3 + 1];
                  client.field730[var3] = client.field730[var3 + 1];
                  client.field737[var3] = client.field737[var3 + 1];
                  client.field728[var3] = client.field728[var3 + 1];
               }
            }

            --var0;
            --client.field657;
         }
      }

      class24.method463(class139.field1897 / 2 + class35.field303, class59.field558);
   }

   @ObfuscatedName("jy")
   @ObfuscatedSignature(
      signature = "([Lhl;IS)V",
      garbageValue = "-27903"
   )
   static final void method2(class230[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         class230 var3 = var0[var2];
         if(var3 != null) {
            if(var3.field2625 == 0) {
               if(var3.field2626 != null) {
                  method2(var3.field2626, var1);
               }

               class55 var4 = (class55)client.field826.method4064((long)var3.field2623);
               if(var4 != null) {
                  class76.method1849(var4.field506, var1);
               }
            }

            class56 var5;
            if(var1 == 0 && var3.field2713 != null) {
               var5 = new class56();
               var5.field511 = var3;
               var5.field525 = var3.field2713;
               class67.method1728(var5);
            }

            if(var1 == 1 && var3.field2732 != null) {
               if(var3.field2633 >= 0) {
                  class230 var6 = class61.method1188(var3.field2623);
                  if(var6 == null || var6.field2626 == null || var3.field2633 >= var6.field2626.length || var3 != var6.field2626[var3.field2633]) {
                     continue;
                  }
               }

               var5 = new class56();
               var5.field511 = var3;
               var5.field525 = var3.field2732;
               class67.method1728(var5);
            }
         }
      }

   }
}
