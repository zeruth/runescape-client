import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class259 extends class206 {

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3302 = new class200(64);
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1593176961
   )
   int field3303 = 0;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1345406209
   )
   public int field3304;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1462318195
   )
   public int field3305;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1665476619
   )
   public int field3306;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1435364123
   )
   public int field3307;


   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1407655342"
   )
   void method4894() {
      this.method4882(this.field3303);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgy;IB)V",
      garbageValue = "4"
   )
   void method4880(class182 var1, int var2) {
      while(true) {
         int var3 = var1.method3742();
         if(var3 == 0) {
            return;
         }

         this.method4881(var1, var3, var2);
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Lgy;III)V",
      garbageValue = "1846882283"
   )
   void method4881(class182 var1, int var2, int var3) {
      if(var2 == 1) {
         this.field3303 = var1.method3572();
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-43484654"
   )
   void method4882(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if(var4 < var2) {
         var8 = var4;
      }

      if(var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if(var4 > var2) {
         var10 = var4;
      }

      if(var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var10 + var8) / 2.0D;
      if(var8 != var10) {
         if(var16 < 0.5D) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if(var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if(var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if(var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if(var6 == var10) {
            var12 = 4.0D + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0D;
      this.field3305 = (int)(var14 * 256.0D);
      this.field3306 = (int)(var16 * 256.0D);
      if(this.field3305 < 0) {
         this.field3305 = 0;
      } else if(this.field3305 > 255) {
         this.field3305 = 255;
      }

      if(this.field3306 < 0) {
         this.field3306 = 0;
      } else if(this.field3306 > 255) {
         this.field3306 = 255;
      }

      if(var16 > 0.5D) {
         this.field3307 = (int)(512.0D * (1.0D - var16) * var14);
      } else {
         this.field3307 = (int)(512.0D * var16 * var14);
      }

      if(this.field3307 < 1) {
         this.field3307 = 1;
      }

      this.field3304 = (int)(var12 * (double)this.field3307);
   }

   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "444052766"
   )
   static void method4879(int var0, int var1) {
      if(client.field693 != 0 && var0 != -1) {
         class179.method3537(class55.field508, var0, 0, client.field693, false);
         client.field825 = true;
      }

   }
}
