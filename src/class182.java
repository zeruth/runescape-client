import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class182 extends class204 {

   @ObfuscatedName("q")
   static int[] field2360 = new int[256];
   @ObfuscatedName("f")
   static long[] field2361;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Llh;"
   )
   static class317 field2363;
   @ObfuscatedName("w")
   public byte[] field2365;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 296620503
   )
   public int field2359;


   static {
      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if((var0 & 1) == 1) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field2360[var1] = var0;
      }

      field2361 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if(1L == (var4 & 1L)) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field2361[var2] = var4;
      }

   }

   public class182(int var1) {
      this.field2365 = class111.method2614(var1);
      this.field2359 = 0;
   }

   public class182(byte[] var1) {
      this.field2365 = var1;
      this.field2359 = 0;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "48"
   )
   public void method3551() {
      if(this.field2365 != null) {
         method3677(this.field2365);
      }

      this.field2365 = null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "869506083"
   )
   public void method3552(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1732387657"
   )
   public void method3602(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 8);
      this.field2365[++this.field2359 - 1] = (byte)var1;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "395607459"
   )
   public void method3554(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 16);
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 8);
      this.field2365[++this.field2359 - 1] = (byte)var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1853857979"
   )
   public void method3555(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 24);
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 16);
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 8);
      this.field2365[++this.field2359 - 1] = (byte)var1;
   }

   @ObfuscatedName("l")
   public void method3646(long var1) {
      this.field2365[++this.field2359 - 1] = (byte)((int)(var1 >> 40));
      this.field2365[++this.field2359 - 1] = (byte)((int)(var1 >> 32));
      this.field2365[++this.field2359 - 1] = (byte)((int)(var1 >> 24));
      this.field2365[++this.field2359 - 1] = (byte)((int)(var1 >> 16));
      this.field2365[++this.field2359 - 1] = (byte)((int)(var1 >> 8));
      this.field2365[++this.field2359 - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("d")
   public void method3557(long var1) {
      this.field2365[++this.field2359 - 1] = (byte)((int)(var1 >> 56));
      this.field2365[++this.field2359 - 1] = (byte)((int)(var1 >> 48));
      this.field2365[++this.field2359 - 1] = (byte)((int)(var1 >> 40));
      this.field2365[++this.field2359 - 1] = (byte)((int)(var1 >> 32));
      this.field2365[++this.field2359 - 1] = (byte)((int)(var1 >> 24));
      this.field2365[++this.field2359 - 1] = (byte)((int)(var1 >> 16));
      this.field2365[++this.field2359 - 1] = (byte)((int)(var1 >> 8));
      this.field2365[++this.field2359 - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1868233757"
   )
   public void method3558(boolean var1) {
      this.method3552(var1?1:0);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "3657"
   )
   public void method3549(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field2359 += class127.method3074(var1, 0, var1.length(), this.field2365, this.field2359);
         this.field2365[++this.field2359 - 1] = 0;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1652583327"
   )
   public void method3560(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field2365[++this.field2359 - 1] = 0;
         this.field2359 += class127.method3074(var1, 0, var1.length(), this.field2365, this.field2359);
         this.field2365[++this.field2359 - 1] = 0;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)V",
      garbageValue = "-1415582304"
   )
   public void method3691(CharSequence var1) {
      int var2 = class39.method759(var1);
      this.field2365[++this.field2359 - 1] = 0;
      this.method3567(var2);
      this.field2359 += class68.method1745(this.field2365, this.field2359, var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "1391861166"
   )
   public void method3628(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.field2365[++this.field2359 - 1] = var1[var4];
      }

   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2043201199"
   )
   public void method3563(int var1) {
      this.field2365[this.field2359 - var1 - 4] = (byte)(var1 >> 24);
      this.field2365[this.field2359 - var1 - 3] = (byte)(var1 >> 16);
      this.field2365[this.field2359 - var1 - 2] = (byte)(var1 >> 8);
      this.field2365[this.field2359 - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-124511921"
   )
   public void method3734(int var1) {
      this.field2365[this.field2359 - var1 - 2] = (byte)(var1 >> 8);
      this.field2365[this.field2359 - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-94"
   )
   public void method3565(int var1) {
      this.field2365[this.field2359 - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-862435305"
   )
   public void method3614(int var1) {
      if(var1 >= 0 && var1 < 128) {
         this.method3552(var1);
      } else if(var1 >= 0 && var1 < '\u8000') {
         this.method3602(var1 + '\u8000');
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1019933549"
   )
   public void method3567(int var1) {
      if((var1 & -128) != 0) {
         if((var1 & -16384) != 0) {
            if((var1 & -2097152) != 0) {
               if((var1 & -268435456) != 0) {
                  this.method3552(var1 >>> 28 | 128);
               }

               this.method3552(var1 >>> 21 | 128);
            }

            this.method3552(var1 >>> 14 | 128);
         }

         this.method3552(var1 >>> 7 | 128);
      }

      this.method3552(var1 & 127);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1403795907"
   )
   public int method3742() {
      return this.field2365[++this.field2359 - 1] & 255;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(S)B",
      garbageValue = "-20509"
   )
   public byte method3569() {
      return this.field2365[++this.field2359 - 1];
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-113"
   )
   public int method3574() {
      this.field2359 += 2;
      return (this.field2365[this.field2359 - 1] & 255) + ((this.field2365[this.field2359 - 2] & 255) << 8);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-348748556"
   )
   public int method3804() {
      this.field2359 += 2;
      int var1 = (this.field2365[this.field2359 - 1] & 255) + ((this.field2365[this.field2359 - 2] & 255) << 8);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-64"
   )
   public int method3572() {
      this.field2359 += 3;
      return ((this.field2365[this.field2359 - 3] & 255) << 16) + (this.field2365[this.field2359 - 1] & 255) + ((this.field2365[this.field2359 - 2] & 255) << 8);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "42"
   )
   public int method3573() {
      this.field2359 += 4;
      return ((this.field2365[this.field2359 - 3] & 255) << 16) + (this.field2365[this.field2359 - 1] & 255) + ((this.field2365[this.field2359 - 2] & 255) << 8) + ((this.field2365[this.field2359 - 4] & 255) << 24);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "-1786822540"
   )
   public long method3792() {
      long var1 = (long)this.method3573() & 4294967295L;
      long var3 = (long)this.method3573() & 4294967295L;
      return (var1 << 32) + var3;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-12"
   )
   public boolean method3656() {
      return (this.method3742() & 1) == 1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-44"
   )
   public String method3576() {
      if(this.field2365[this.field2359] == 0) {
         ++this.field2359;
         return null;
      } else {
         return this.method3577();
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "1"
   )
   public String method3577() {
      int var1 = this.field2359;

      while(this.field2365[++this.field2359 - 1] != 0) {
         ;
      }

      int var2 = this.field2359 - var1 - 1;
      return var2 == 0?"":class165.method3453(this.field2365, var1, var2);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-44"
   )
   public String method3666() {
      byte var1 = this.field2365[++this.field2359 - 1];
      if(var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.field2359;

         while(this.field2365[++this.field2359 - 1] != 0) {
            ;
         }

         int var3 = this.field2359 - var2 - 1;
         return var3 == 0?"":class165.method3453(this.field2365, var2, var3);
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-1940499144"
   )
   public String method3571() {
      byte var1 = this.field2365[++this.field2359 - 1];
      if(var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.method3586();
         if(var2 + this.field2359 > this.field2365.length) {
            throw new IllegalStateException("");
         } else {
            byte[] var4 = this.field2365;
            int var5 = this.field2359;
            char[] var6 = new char[var2];
            int var7 = 0;
            int var8 = var5;

            int var11;
            for(int var9 = var5 + var2; var8 < var9; var6[var7++] = (char)var11) {
               int var10 = var4[var8++] & 255;
               if(var10 < 128) {
                  if(var10 == 0) {
                     var11 = '\ufffd';
                  } else {
                     var11 = var10;
                  }
               } else if(var10 < 192) {
                  var11 = '\ufffd';
               } else if(var10 < 224) {
                  if(var8 < var9 && (var4[var8] & 192) == 128) {
                     var11 = (var10 & 31) << 6 | var4[var8++] & 63;
                     if(var11 < 128) {
                        var11 = '\ufffd';
                     }
                  } else {
                     var11 = '\ufffd';
                  }
               } else if(var10 < 240) {
                  if(var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) {
                     var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if(var11 < 2048) {
                        var11 = '\ufffd';
                     }
                  } else {
                     var11 = '\ufffd';
                  }
               } else if(var10 < 248) {
                  if(var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) {
                     var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if(var11 >= 65536 && var11 <= 1114111) {
                        var11 = '\ufffd';
                     } else {
                        var11 = '\ufffd';
                     }
                  } else {
                     var11 = '\ufffd';
                  }
               } else {
                  var11 = '\ufffd';
               }
            }

            String var3 = new String(var6, 0, var7);
            this.field2359 += var2;
            return var3;
         }
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "1182669602"
   )
   public void method3580(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.field2365[++this.field2359 - 1];
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1473518360"
   )
   public int method3581() {
      int var1 = this.field2365[this.field2359] & 255;
      return var1 < 128?this.method3742() - 64:this.method3574() - '\uc000';
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1711012774"
   )
   public int method3599() {
      int var1 = this.field2365[this.field2359] & 255;
      return var1 < 128?this.method3742():this.method3574() - '\u8000';
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1032023688"
   )
   public int method3583() {
      int var1 = 0;

      int var2;
      for(var2 = this.method3599(); var2 == 32767; var2 = this.method3599()) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1194085227"
   )
   public int method3584() {
      return this.field2365[this.field2359] < 0?this.method3573() & Integer.MAX_VALUE:this.method3574();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "-7960"
   )
   public int method3585() {
      if(this.field2365[this.field2359] < 0) {
         return this.method3573() & Integer.MAX_VALUE;
      } else {
         int var1 = this.method3574();
         return var1 == 32767?-1:var1;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "729471312"
   )
   public int method3586() {
      byte var1 = this.field2365[++this.field2359 - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.field2365[++this.field2359 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "2021044320"
   )
   public void method3587(int[] var1) {
      int var2 = this.field2359 / 8;
      this.field2359 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method3573();
         int var5 = this.method3573();
         int var6 = 0;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
            var6 += var7;
         }

         this.field2359 -= 8;
         this.method3555(var4);
         this.method3555(var5);
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "312868729"
   )
   public void method3588(int[] var1) {
      int var2 = this.field2359 / 8;
      this.field2359 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method3573();
         int var5 = this.method3573();
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.field2359 -= 8;
         this.method3555(var4);
         this.method3555(var5);
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "([IIII)V",
      garbageValue = "-1381462193"
   )
   public void method3589(int[] var1, int var2, int var3) {
      int var4 = this.field2359;
      this.field2359 = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method3573();
         int var8 = this.method3573();
         int var9 = 0;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
            var9 += var10;
         }

         this.field2359 -= 8;
         this.method3555(var7);
         this.method3555(var8);
      }

      this.field2359 = var4;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "([IIII)V",
      garbageValue = "337932209"
   )
   public void method3590(int[] var1, int var2, int var3) {
      int var4 = this.field2359;
      this.field2359 = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method3573();
         int var8 = this.method3573();
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.field2359 -= 8;
         this.method3555(var7);
         this.method3555(var8);
      }

      this.field2359 = var4;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
      garbageValue = "-1779329464"
   )
   public void method3601(BigInteger var1, BigInteger var2) {
      int var3 = this.field2359;
      this.field2359 = 0;
      byte[] var4 = new byte[var3];
      this.method3580(var4, 0, var3);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.field2359 = 0;
      this.method3602(var7.length);
      this.method3628(var7, 0, var7.length);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "222875642"
   )
   public int method3593(int var1) {
      int var2 = class236.method4596(this.field2365, var1, this.field2359);
      this.method3555(var2);
      return var2;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "496663713"
   )
   public boolean method3591() {
      this.field2359 -= 4;
      int var1 = class236.method4596(this.field2365, 0, this.field2359);
      int var2 = this.method3573();
      return var2 == var1;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2095268899"
   )
   public void method3594(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "1"
   )
   public void method3595(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)(0 - var1);
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-41"
   )
   public void method3596(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)(128 - var1);
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "34047495"
   )
   public int method3597() {
      return this.field2365[++this.field2359 - 1] - 128 & 255;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "4"
   )
   public int method3730() {
      return 0 - this.field2365[++this.field2359 - 1] & 255;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1771322276"
   )
   public int method3553() {
      return 128 - this.field2365[++this.field2359 - 1] & 255;
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "(S)B",
      garbageValue = "-13061"
   )
   public byte method3600() {
      return (byte)(this.field2365[++this.field2359 - 1] - 128);
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(B)B",
      garbageValue = "30"
   )
   public byte method3702() {
      return (byte)(0 - this.field2365[++this.field2359 - 1]);
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "1487306597"
   )
   public byte method3765() {
      return (byte)(128 - this.field2365[++this.field2359 - 1]);
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-170934622"
   )
   public void method3707(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)var1;
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1508792605"
   )
   public void method3725(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 8);
      this.field2365[++this.field2359 - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-636938750"
   )
   public void method3605(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)(var1 + 128);
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "333098854"
   )
   public int method3676() {
      this.field2359 += 2;
      return ((this.field2365[this.field2359 - 1] & 255) << 8) + (this.field2365[this.field2359 - 2] & 255);
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1707868632"
   )
   public int method3784() {
      this.field2359 += 2;
      return (this.field2365[this.field2359 - 1] - 128 & 255) + ((this.field2365[this.field2359 - 2] & 255) << 8);
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   public int method3562() {
      this.field2359 += 2;
      return ((this.field2365[this.field2359 - 1] & 255) << 8) + (this.field2365[this.field2359 - 2] - 128 & 255);
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1112618368"
   )
   public int method3609() {
      this.field2359 += 2;
      int var1 = (this.field2365[this.field2359 - 1] - 128 & 255) + ((this.field2365[this.field2359 - 2] & 255) << 8);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-52"
   )
   public int method3604() {
      this.field2359 += 2;
      int var1 = ((this.field2365[this.field2359 - 1] & 255) << 8) + (this.field2365[this.field2359 - 2] - 128 & 255);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1316524303"
   )
   public void method3633(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)var1;
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 8);
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1500626248"
   )
   public int method3612() {
      this.field2359 += 3;
      return (this.field2365[this.field2359 - 3] & 255) + ((this.field2365[this.field2359 - 2] & 255) << 8) + ((this.field2365[this.field2359 - 1] & 255) << 16);
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-52"
   )
   public void method3750(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)var1;
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 8);
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 16);
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-81"
   )
   public void method3670(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 8);
      this.field2365[++this.field2359 - 1] = (byte)var1;
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 24);
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1643606203"
   )
   public void method3641(int var1) {
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 16);
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 24);
      this.field2365[++this.field2359 - 1] = (byte)var1;
      this.field2365[++this.field2359 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-854397793"
   )
   public int method3616() {
      this.field2359 += 4;
      return (this.field2365[this.field2359 - 4] & 255) + ((this.field2365[this.field2359 - 3] & 255) << 8) + ((this.field2365[this.field2359 - 2] & 255) << 16) + ((this.field2365[this.field2359 - 1] & 255) << 24);
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "11"
   )
   public int method3613() {
      this.field2359 += 4;
      return ((this.field2365[this.field2359 - 2] & 255) << 24) + ((this.field2365[this.field2359 - 4] & 255) << 8) + (this.field2365[this.field2359 - 3] & 255) + ((this.field2365[this.field2359 - 1] & 255) << 16);
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1004297524"
   )
   public int method3618() {
      this.field2359 += 4;
      return ((this.field2365[this.field2359 - 1] & 255) << 8) + ((this.field2365[this.field2359 - 4] & 255) << 16) + (this.field2365[this.field2359 - 2] & 255) + ((this.field2365[this.field2359 - 3] & 255) << 24);
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "88"
   )
   public void method3619(byte[] var1, int var2, int var3) {
      for(int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
         var1[var4] = this.field2365[++this.field2359 - 1];
      }

   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "1895159049"
   )
   public void method3620(byte[] var1, int var2, int var3) {
      for(int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
         var1[var4] = (byte)(this.field2365[++this.field2359 - 1] - 128);
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)Ljb;",
      garbageValue = "-1814432867"
   )
   public static class264 method3811(int var0) {
      class264 var1 = (class264)class264.field3345.method4023((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class264.field3346.method4626(11, var0);
         var1 = new class264();
         if(var2 != null) {
            var1.method4959(new class182(var2));
         }

         var1.method4954();
         class264.field3345.method4028(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "850773741"
   )
   static synchronized void method3677(byte[] var0) {
      if(var0.length == 100 && class183.field2371 < 1000) {
         class183.field2369[++class183.field2371 - 1] = var0;
      } else if(var0.length == 5000 && class183.field2367 < 250) {
         class183.field2366[++class183.field2367 - 1] = var0;
      } else if(var0.length == 30000 && class183.field2372 < 50) {
         class183.field2368[++class183.field2372 - 1] = var0;
      } else {
         if(class183.field2373 != null) {
            for(int var1 = 0; var1 < class78.field1123.length; ++var1) {
               if(var0.length == class78.field1123[var1] && class183.field2370[var1] < class183.field2373[var1].length) {
                  class183.field2373[var1][class183.field2370[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }
}
