import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
final class class7 implements Comparator {

   @ObfuscatedName("kw")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static class230 field42;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lq;Lq;I)I",
      garbageValue = "-641386920"
   )
   int method79(class2 var1, class2 var2) {
      return var1.field10 < var2.field10?-1:(var1.field10 == var2.field10?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method79((class2)var1, (class2)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([Lgk;IB)Lgk;",
      garbageValue = "64"
   )
   public static class188 method89(class188[] var0, int var1) {
      class188[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class188 var4 = var2[var3];
         if(var1 == var4.vmethod5860()) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "103"
   )
   static int method87(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 0) {
            var1 = 0;
         } else if(var1 > 127) {
            var1 = 127;
         }

         var1 = 127 - var1;
         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      signature = "(Lbl;B)V",
      garbageValue = "121"
   )
   static final void method85(class62 var0) {
      long var1 = 0L;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if(var0.field869 == 0) {
         var1 = class56.field523.method2927(var0.field873, var0.field868, var0.field880);
      }

      if(var0.field869 == 1) {
         var1 = class56.field523.method2928(var0.field873, var0.field868, var0.field880);
      }

      if(var0.field869 == 2) {
         var1 = class56.field523.method3045(var0.field873, var0.field868, var0.field880);
      }

      if(var0.field869 == 3) {
         var1 = class56.field523.method2930(var0.field873, var0.field868, var0.field880);
      }

      if(var1 != 0L) {
         int var6 = class56.field523.method2931(var0.field873, var0.field868, var0.field880, var1);
         var3 = class8.method93(var1);
         var4 = var6 & 31;
         var5 = var6 >> 6 & 3;
      }

      var0.field870 = var3;
      var0.field872 = var4;
      var0.field871 = var5;
   }
}
