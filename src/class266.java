import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
public class class266 extends class206 {

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3356 = new class200(64);
   @ObfuscatedName("q")
   public char field3357;
   @ObfuscatedName("b")
   public char field3355;
   @ObfuscatedName("f")
   public String field3358 = "null";
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 67416857
   )
   public int field3361;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -303547453
   )
   public int field3360 = 0;
   @ObfuscatedName("x")
   public int[] field3359;
   @ObfuscatedName("j")
   public int[] field3362;
   @ObfuscatedName("a")
   public String[] field3363;


   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-1038789195"
   )
   void method4996(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method4995(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "-1216349647"
   )
   void method4995(class182 var1, int var2) {
      if(var2 == 1) {
         this.field3357 = (char)var1.method3742();
      } else if(var2 == 2) {
         this.field3355 = (char)var1.method3742();
      } else if(var2 == 3) {
         this.field3358 = var1.method3577();
      } else if(var2 == 4) {
         this.field3361 = var1.method3573();
      } else {
         int var3;
         if(var2 == 5) {
            this.field3360 = var1.method3574();
            this.field3359 = new int[this.field3360];
            this.field3363 = new String[this.field3360];

            for(var3 = 0; var3 < this.field3360; ++var3) {
               this.field3359[var3] = var1.method3573();
               this.field3363[var3] = var1.method3577();
            }
         } else if(var2 == 6) {
            this.field3360 = var1.method3574();
            this.field3359 = new int[this.field3360];
            this.field3362 = new int[this.field3360];

            for(var3 = 0; var3 < this.field3360; ++var3) {
               this.field3359[var3] = var1.method3573();
               this.field3362[var3] = var1.method3573();
            }
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "3"
   )
   public int method4998() {
      return this.field3360;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "296702561"
   )
   static void method5008() {
      class110 var0 = null;

      try {
         var0 = class240.method4600("", class170.field2265.field3160, true);
         class182 var1 = class51.field468.method1650();
         var0.method2556(var1.field2365, 0, var1.field2359);
      } catch (Exception var3) {
         ;
      }

      try {
         if(var0 != null) {
            var0.method2554(true);
         }
      } catch (Exception var2) {
         ;
      }

   }
}
