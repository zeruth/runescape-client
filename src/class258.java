import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public class class258 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   static class247 field3288;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3300 = new class200(64);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3299 = new class200(30);
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1075787503
   )
   int field3290;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1373189613
   )
   int field3291;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -92331913
   )
   public int field3292 = -1;
   @ObfuscatedName("x")
   short[] field3289;
   @ObfuscatedName("j")
   short[] field3294;
   @ObfuscatedName("a")
   short[] field3301;
   @ObfuscatedName("l")
   short[] field3296;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 380474301
   )
   int field3287 = 128;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -119979769
   )
   int field3298 = 128;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 818209207
   )
   int field3295 = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 745529987
   )
   int field3293 = 0;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1021149467
   )
   int field3297 = 0;


   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "317387597"
   )
   void method4862(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method4863(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "-1069439507"
   )
   void method4863(class182 var1, int var2) {
      if(var2 == 1) {
         this.field3291 = var1.method3574();
      } else if(var2 == 2) {
         this.field3292 = var1.method3574();
      } else if(var2 == 4) {
         this.field3287 = var1.method3574();
      } else if(var2 == 5) {
         this.field3298 = var1.method3574();
      } else if(var2 == 6) {
         this.field3295 = var1.method3574();
      } else if(var2 == 7) {
         this.field3293 = var1.method3742();
      } else if(var2 == 8) {
         this.field3297 = var1.method3742();
      } else {
         int var3;
         int var4;
         if(var2 == 40) {
            var3 = var1.method3742();
            this.field3289 = new short[var3];
            this.field3294 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3289[var4] = (short)var1.method3574();
               this.field3294[var4] = (short)var1.method3574();
            }
         } else if(var2 == 41) {
            var3 = var1.method3742();
            this.field3301 = new short[var3];
            this.field3296 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3301[var4] = (short)var1.method3574();
               this.field3296[var4] = (short)var1.method3574();
            }
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(II)Ldk;",
      garbageValue = "-15359933"
   )
   public final class119 method4864(int var1) {
      class119 var2 = (class119)field3299.method4023((long)this.field3290);
      if(var2 == null) {
         class113 var3 = class113.method2619(class82.field1201, this.field3291, 0);
         if(var3 == null) {
            return null;
         }

         int var4;
         if(this.field3289 != null) {
            for(var4 = 0; var4 < this.field3289.length; ++var4) {
               var3.method2689(this.field3289[var4], this.field3294[var4]);
            }
         }

         if(this.field3301 != null) {
            for(var4 = 0; var4 < this.field3301.length; ++var4) {
               var3.method2632(this.field3301[var4], this.field3296[var4]);
            }
         }

         var2 = var3.method2631(this.field3293 + 64, this.field3297 + 850, -30, -50, -30);
         field3299.method4028(var2, (long)this.field3290);
      }

      class119 var5;
      if(this.field3292 != -1 && var1 != -1) {
         var5 = class137.method3151(this.field3292).method5223(var2, var1);
      } else {
         var5 = var2.method2722(true);
      }

      if(this.field3287 != 128 || this.field3298 != 128) {
         var5.method2759(this.field3287, this.field3298, this.field3287);
      }

      if(this.field3295 != 0) {
         if(this.field3295 == 90) {
            var5.method2732();
         }

         if(this.field3295 == 180) {
            var5.method2732();
            var5.method2732();
         }

         if(this.field3295 == 270) {
            var5.method2732();
            var5.method2732();
            var5.method2732();
         }
      }

      return var5;
   }
}
