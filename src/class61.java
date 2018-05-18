import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
public class class61 implements Comparator {

   @ObfuscatedName("ft")
   static int[] field592;
   @ObfuscatedName("w")
   boolean field591;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lq;Lq;B)I",
      garbageValue = "-35"
   )
   int method1179(class2 var1, class2 var2) {
      if(var2.field17 == var1.field17) {
         return 0;
      } else {
         if(this.field591) {
            if(client.field676 == var1.field17) {
               return -1;
            }

            if(var2.field17 == client.field676) {
               return 1;
            }
         }

         return var1.field17 < var2.field17?-1:1;
      }
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1179((class2)var1, (class2)var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-161694556"
   )
   static void method1189(int var0, String var1, String var2) {
      class154.method3259(var0, var1, var2, (String)null);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)Lhl;",
      garbageValue = "-584251032"
   )
   public static class230 method1188(int var0) {
      int var1 = var0 >> 16;
      int var2 = var0 & '\uffff';
      if(class230.field2615[var1] == null || class230.field2615[var1][var2] == null) {
         boolean var3 = class42.method785(var1);
         if(!var3) {
            return null;
         }
      }

      return class230.field2615[var1][var2];
   }
}
