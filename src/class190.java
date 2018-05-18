import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public final class class190 {

   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 520314597
   )
   int field2401;
   @ObfuscatedName("f")
   int[] field2403 = new int[256];
   @ObfuscatedName("n")
   int[] field2405 = new int[256];
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 970541073
   )
   int field2410;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1251804139
   )
   int field2407;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -672814477
   )
   int field2408;


   public class190(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field2403[var2] = var1[var2];
      }

      this.method3919();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-336347120"
   )
   final int method3904() {
      if(0 == --this.field2401 + 1) {
         this.method3908();
         this.field2401 = 255;
      }

      return this.field2403[this.field2401];
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1220190858"
   )
   final int method3905() {
      if(this.field2401 == 0) {
         this.method3908();
         this.field2401 = 256;
      }

      return this.field2403[this.field2401 - 1];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2029066640"
   )
   final void method3908() {
      this.field2407 += ++this.field2408;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.field2405[var1];
         if((var1 & 2) == 0) {
            if((var1 & 1) == 0) {
               this.field2410 ^= this.field2410 << 13;
            } else {
               this.field2410 ^= this.field2410 >>> 6;
            }
         } else if((var1 & 1) == 0) {
            this.field2410 ^= this.field2410 << 2;
         } else {
            this.field2410 ^= this.field2410 >>> 16;
         }

         this.field2410 += this.field2405[128 + var1 & 255];
         int var3;
         this.field2405[var1] = var3 = this.field2405[(var2 & 1020) >> 2] + this.field2410 + this.field2407;
         this.field2403[var1] = this.field2407 = this.field2405[(var3 >> 8 & 1020) >> 2] + var2;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1857553965"
   )
   final void method3919() {
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field2403[var1];
         var3 += this.field2403[var1 + 1];
         var4 += this.field2403[var1 + 2];
         var5 += this.field2403[var1 + 3];
         var6 += this.field2403[var1 + 4];
         var7 += this.field2403[var1 + 5];
         var8 += this.field2403[var1 + 6];
         var9 += this.field2403[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field2405[var1] = var2;
         this.field2405[var1 + 1] = var3;
         this.field2405[var1 + 2] = var4;
         this.field2405[var1 + 3] = var5;
         this.field2405[var1 + 4] = var6;
         this.field2405[var1 + 5] = var7;
         this.field2405[var1 + 6] = var8;
         this.field2405[var1 + 7] = var9;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field2405[var1];
         var3 += this.field2405[var1 + 1];
         var4 += this.field2405[var1 + 2];
         var5 += this.field2405[var1 + 3];
         var6 += this.field2405[var1 + 4];
         var7 += this.field2405[var1 + 5];
         var8 += this.field2405[var1 + 6];
         var9 += this.field2405[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field2405[var1] = var2;
         this.field2405[var1 + 1] = var3;
         this.field2405[var1 + 2] = var4;
         this.field2405[var1 + 3] = var5;
         this.field2405[var1 + 4] = var6;
         this.field2405[var1 + 5] = var7;
         this.field2405[var1 + 6] = var8;
         this.field2405[var1 + 7] = var9;
      }

      this.method3908();
      this.field2401 = 256;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1759225092"
   )
   public static void method3911(int var0) {
      class217.field2486 = 1;
      class26.field236 = null;
      class19.field167 = -1;
      class217.field2487 = -1;
      class21.field185 = 0;
      class178.field2317 = false;
      class308.field3746 = var0;
   }
}
