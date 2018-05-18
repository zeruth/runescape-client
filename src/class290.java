import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class class290 extends class285 {

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lla;"
   )
   final class322 field3656;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 325181365
   )
   int field3657 = 1;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhi;"
   )
   public class208 field3658 = new class208();


   @ObfuscatedSignature(
      signature = "(Lla;)V"
   )
   public class290(class322 var1) {
      super(400);
      this.field3656 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)Ljn;",
      garbageValue = "-39"
   )
   class282 vmethod5491() {
      return new class292();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)[Ljn;",
      garbageValue = "-1283030275"
   )
   class282[] vmethod5492(int var1) {
      return new class292[var1];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lkm;ZI)Z",
      garbageValue = "-939317206"
   )
   public boolean method5457(class291 var1, boolean var2) {
      class292 var3 = (class292)this.method5344(var1);
      return var3 == null?false:!var2 || var3.field3648 != 0;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Lgy;IB)V",
      garbageValue = "-2"
   )
   public void method5449(class182 var1, int var2) {
      while(true) {
         if(var1.field2359 < var2) {
            boolean var3 = var1.method3742() == 1;
            class291 var4 = new class291(var1.method3577(), this.field3656);
            class291 var5 = new class291(var1.method3577(), this.field3656);
            int var6 = var1.method3574();
            int var7 = var1.method3742();
            int var8 = var1.method3742();
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = (var8 & 1) != 0;
            if(var6 > 0) {
               var1.method3577();
               var1.method3742();
               var1.method3573();
            }

            var1.method3577();
            if(var4 != null && var4.method5463()) {
               class292 var11 = (class292)this.method5374(var4);
               if(var3) {
                  class292 var12 = (class292)this.method5374(var5);
                  if(var12 != null && var11 != var12) {
                     if(var11 != null) {
                        this.method5362(var12);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if(var11 != null) {
                  this.method5339(var11, var4, var5);
                  if(var6 != var11.field3648) {
                     boolean var14 = true;

                     for(class294 var13 = (class294)this.field3658.method4147(); var13 != null; var13 = (class294)this.field3658.method4146()) {
                        if(var13.field3675.equals(var4)) {
                           if(var6 != 0 && var13.field3677 == 0) {
                              var13.method4156();
                              var14 = false;
                           } else if(var6 == 0 && var13.field3677 != 0) {
                              var13.method4156();
                              var14 = false;
                           }
                        }
                     }

                     if(var14) {
                        this.field3658.method4149(new class294(var4, var6));
                     }
                  }
               } else {
                  if(this.method5341() >= 400) {
                     continue;
                  }

                  var11 = (class292)this.method5373(var4, var5);
               }

               if(var6 != var11.field3648) {
                  var11.field3649 = ++this.field3657 - 1;
                  if(var11.field3648 == -1 && var6 == 0) {
                     var11.field3649 = -(var11.field3649 * 237190023) * -467035593;
                  }

                  var11.field3648 = var6;
               }

               var11.field3647 = var7;
               var11.field3664 = var9;
               var11.field3663 = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.method5383();
         return;
      }
   }
}
