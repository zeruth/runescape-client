import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class class150 extends class160 {

   @ObfuscatedName("j")
   public static short[] field1947;
   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      signature = "Lbu;"
   )
   static class60 field1948;
   @ObfuscatedName("w")
   long[] field1942 = new long[10];
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 560823093
   )
   int field1945 = 256;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1200752949
   )
   int field1943 = 1;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      longValue = -3208137276938429889L
   )
   long field1941 = class166.method3456();
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1461135101
   )
   int field1944 = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -642566619
   )
   int field1946;


   public class150() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1942[var1] = this.field1941;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1218447375"
   )
   public void vmethod3346() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1942[var1] = 0L;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "2000882213"
   )
   public int vmethod3348(int var1, int var2) {
      int var3 = this.field1945;
      int var4 = this.field1943;
      this.field1945 = 300;
      this.field1943 = 1;
      this.field1941 = class166.method3456();
      if(this.field1942[this.field1946] == 0L) {
         this.field1945 = var3;
         this.field1943 = var4;
      } else if(this.field1941 > this.field1942[this.field1946]) {
         this.field1945 = (int)((long)(var1 * 2560) / (this.field1941 - this.field1942[this.field1946]));
      }

      if(this.field1945 < 25) {
         this.field1945 = 25;
      }

      if(this.field1945 > 256) {
         this.field1945 = 256;
         this.field1943 = (int)((long)var1 - (this.field1941 - this.field1942[this.field1946]) / 10L);
      }

      if(this.field1943 > var1) {
         this.field1943 = var1;
      }

      this.field1942[this.field1946] = this.field1941;
      this.field1946 = (this.field1946 + 1) % 10;
      int var5;
      if(this.field1943 > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if(0L != this.field1942[var5]) {
               this.field1942[var5] += (long)this.field1943;
            }
         }
      }

      if(this.field1943 < var2) {
         this.field1943 = var2;
      }

      class18.method218((long)this.field1943);

      for(var5 = 0; this.field1944 < 256; this.field1944 += this.field1945) {
         ++var5;
      }

      this.field1944 &= 255;
      return var5;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1801109262"
   )
   public static boolean method3219(int var0, int var1) {
      return (var0 >> var1 + 1 & 1) != 0;
   }
}
