import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public class class253 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3247;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3248 = new class200(64);
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1334662393
   )
   public int field3249 = 0;


   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-1627662832"
   )
   void method4818(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method4813(var1, var2);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "472098137"
   )
   void method4813(class182 var1, int var2) {
      if(var2 == 2) {
         this.field3249 = var1.method3574();
      }

   }

   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      signature = "(IIIILlc;Lhr;I)V",
      garbageValue = "1079660383"
   )
   static final void method4812(int var0, int var1, int var2, int var3, class318 var4, class224 var5) {
      if(var4 != null) {
         int var6 = client.field662 & 2047;
         int var7 = var3 * var3 + var2 * var2;
         if(var7 <= 6400) {
            int var8 = class122.field1702[var6];
            int var9 = class122.field1708[var6];
            int var10 = var3 * var8 + var9 * var2 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if(var7 > 2500) {
               var4.method5911(var10 + var5.field2570 / 2 - var4.field3796 / 2, var5.field2575 / 2 - var11 - var4.field3792 / 2, var0, var1, var5.field2570, var5.field2575, var5.field2573, var5.field2572);
            } else {
               var4.method5891(var0 + var10 + var5.field2570 / 2 - var4.field3796 / 2, var5.field2575 / 2 + var1 - var11 - var4.field3792 / 2);
            }

         }
      }
   }
}
