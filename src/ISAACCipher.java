import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("ISAACCipher")
public final class ISAACCipher {
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 520314597
   )
   @Export("valuesRemaining")
   int valuesRemaining;
   @ObfuscatedName("f")
   @Export("randResult")
   int[] randResult = new int[256];
   @ObfuscatedName("n")
   @Export("mm")
   int[] mm = new int[256];
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

   public ISAACCipher(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.randResult[var2] = var1[var2];
      }

      this.method3919();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-336347120"
   )
   @Export("nextInt")
   final int nextInt() {
      if (--this.valuesRemaining + 1 == 0) {
         this.generateMoreResults();
         this.valuesRemaining = 255;
      }

      return this.randResult[this.valuesRemaining];
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1220190858"
   )
   final int method3905() {
      if (this.valuesRemaining == 0) {
         this.generateMoreResults();
         this.valuesRemaining = 256;
      }

      return this.randResult[this.valuesRemaining - 1];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2029066640"
   )
   @Export("generateMoreResults")
   final void generateMoreResults() {
      this.field2407 += ++this.field2408;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.mm[var1];
         if ((var1 & 2) == 0) {
            if ((var1 & 1) == 0) {
               this.field2410 ^= this.field2410 << 13;
            } else {
               this.field2410 ^= this.field2410 >>> 6;
            }
         } else if ((var1 & 1) == 0) {
            this.field2410 ^= this.field2410 << 2;
         } else {
            this.field2410 ^= this.field2410 >>> 16;
         }

         this.field2410 += this.mm[128 + var1 & 255];
         int var3;
         this.mm[var1] = var3 = this.mm[(var2 & 1020) >> 2] + this.field2410 + this.field2407;
         this.randResult[var1] = this.field2407 = this.mm[(var3 >> 8 & 1020) >> 2] + var2;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1857553965"
   )
   final void method3919() {
      int var1 = -1640531527;
      int var2 = -1640531527;
      int var3 = -1640531527;
      int var4 = -1640531527;
      int var5 = -1640531527;
      int var6 = -1640531527;
      int var7 = -1640531527;
      int var8 = -1640531527;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         var8 ^= var7 << 11;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 >>> 2;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 << 8;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 >>> 16;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 << 10;
         var1 += var4;
         var3 += var2;
         var3 ^= var2 >>> 4;
         var8 += var3;
         var2 += var1;
         var2 ^= var1 << 8;
         var7 += var2;
         var1 += var8;
         var1 ^= var8 >>> 9;
         var6 += var1;
         var8 += var7;
      }

      for(var9 = 0; var9 < 256; var9 += 8) {
         var8 += this.randResult[var9];
         var7 += this.randResult[var9 + 1];
         var6 += this.randResult[var9 + 2];
         var5 += this.randResult[var9 + 3];
         var4 += this.randResult[var9 + 4];
         var3 += this.randResult[var9 + 5];
         var2 += this.randResult[var9 + 6];
         var1 += this.randResult[var9 + 7];
         var8 ^= var7 << 11;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 >>> 2;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 << 8;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 >>> 16;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 << 10;
         var1 += var4;
         var3 += var2;
         var3 ^= var2 >>> 4;
         var8 += var3;
         var2 += var1;
         var2 ^= var1 << 8;
         var7 += var2;
         var1 += var8;
         var1 ^= var8 >>> 9;
         var6 += var1;
         var8 += var7;
         this.mm[var9] = var8;
         this.mm[var9 + 1] = var7;
         this.mm[var9 + 2] = var6;
         this.mm[var9 + 3] = var5;
         this.mm[var9 + 4] = var4;
         this.mm[var9 + 5] = var3;
         this.mm[var9 + 6] = var2;
         this.mm[var9 + 7] = var1;
      }

      for(var9 = 0; var9 < 256; var9 += 8) {
         var8 += this.mm[var9];
         var7 += this.mm[var9 + 1];
         var6 += this.mm[var9 + 2];
         var5 += this.mm[var9 + 3];
         var4 += this.mm[var9 + 4];
         var3 += this.mm[var9 + 5];
         var2 += this.mm[var9 + 6];
         var1 += this.mm[var9 + 7];
         var8 ^= var7 << 11;
         var5 += var8;
         var7 += var6;
         var7 ^= var6 >>> 2;
         var4 += var7;
         var6 += var5;
         var6 ^= var5 << 8;
         var3 += var6;
         var5 += var4;
         var5 ^= var4 >>> 16;
         var2 += var5;
         var4 += var3;
         var4 ^= var3 << 10;
         var1 += var4;
         var3 += var2;
         var3 ^= var2 >>> 4;
         var8 += var3;
         var2 += var1;
         var2 ^= var1 << 8;
         var7 += var2;
         var1 += var8;
         var1 ^= var8 >>> 9;
         var6 += var1;
         var8 += var7;
         this.mm[var9] = var8;
         this.mm[var9 + 1] = var7;
         this.mm[var9 + 2] = var6;
         this.mm[var9 + 3] = var5;
         this.mm[var9 + 4] = var4;
         this.mm[var9 + 5] = var3;
         this.mm[var9 + 6] = var2;
         this.mm[var9 + 7] = var1;
      }

      this.generateMoreResults();
      this.valuesRemaining = 256;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1759225092"
   )
   public static void method3911(int var0) {
      class217.field2486 = 1;
      class26.field236 = null;
      WorldMapDecoration.field167 = -1;
      class217.field2487 = -1;
      class21.field185 = 0;
      class178.field2317 = false;
      class308.field3746 = var0;
   }
}
