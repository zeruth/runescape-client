import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
final class class5 implements Comparator {

   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 208381007
   )
   static int field35;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lq;Lq;B)I",
      garbageValue = "79"
   )
   int method67(class2 var1, class2 var2) {
      return var1.field13.field27 < var2.field13.field27?-1:(var2.field13.field27 == var1.field13.field27?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method67((class2)var1, (class2)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("x")
   public static int method59(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "-34"
   )
   static final int method68(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = class244.method4610(var3, var5);
      int var8 = class244.method4610(var3 + 1, var5);
      int var9 = class244.method4610(var3, var5 + 1);
      int var10 = class244.method4610(var3 + 1, var5 + 1);
      int var11 = class158.method3316(var7, var8, var4, var2);
      int var12 = class158.method3316(var9, var10, var4, var2);
      return class158.method3316(var11, var12, var6, var2);
   }
}
