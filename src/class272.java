import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
public class class272 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3539;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3537 = new class200(64);
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 501927119
   )
   public int field3538 = 0;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1646524769
   )
   public int field3542 = -1;
   @ObfuscatedName("f")
   public boolean field3541 = true;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -921475837
   )
   public int field3540 = -1;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1998822279
   )
   public int field3546;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 798518713
   )
   public int field3543;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 951289099
   )
   public int field3544;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -139363617
   )
   public int field3545;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 762625637
   )
   public int field3536;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1916651771
   )
   public int field3547;


   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-48"
   )
   void method5202() {
      if(this.field3540 != -1) {
         this.method5209(this.field3540);
         this.field3545 = this.field3546;
         this.field3536 = this.field3543;
         this.field3547 = this.field3544;
      }

      this.method5209(this.field3538);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "-393961327"
   )
   void method5201(class182 var1, int var2) {
      while(true) {
         int var3 = var1.method3742();
         if(var3 == 0) {
            return;
         }

         this.method5204(var1, var3, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgy;IIS)V",
      garbageValue = "-256"
   )
   void method5204(class182 var1, int var2, int var3) {
      if(var2 == 1) {
         this.field3538 = var1.method3572();
      } else if(var2 == 2) {
         this.field3542 = var1.method3742();
      } else if(var2 == 5) {
         this.field3541 = false;
      } else if(var2 == 7) {
         this.field3540 = var1.method3572();
      } else if(var2 == 8) {
         ;
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1490003908"
   )
   void method5209(int var1) {
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

         if(var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if(var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if(var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.field3546 = (int)(var12 * 256.0D);
      this.field3543 = (int)(256.0D * var14);
      this.field3544 = (int)(256.0D * var16);
      if(this.field3543 < 0) {
         this.field3543 = 0;
      } else if(this.field3543 > 255) {
         this.field3543 = 255;
      }

      if(this.field3544 < 0) {
         this.field3544 = 0;
      } else if(this.field3544 > 255) {
         this.field3544 = 255;
      }

   }
}
