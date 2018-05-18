import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
public class class284 extends class285 {

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lla;"
   )
   final class322 field3636;


   @ObfuscatedSignature(
      signature = "(Lla;)V"
   )
   public class284(class322 var1) {
      super(400);
      this.field3636 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)Ljn;",
      garbageValue = "-39"
   )
   class282 vmethod5491() {
      return new class286();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)[Ljn;",
      garbageValue = "-1283030275"
   )
   class282[] vmethod5492(int var1) {
      return new class286[var1];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;IB)V",
      garbageValue = "27"
   )
   public void method5333(class182 var1, int var2) {
      while(true) {
         if(var1.field2359 < var2) {
            int var3 = var1.method3742();
            boolean var4 = (var3 & 1) == 1;
            class291 var5 = new class291(var1.method3577(), this.field3636);
            class291 var6 = new class291(var1.method3577(), this.field3636);
            var1.method3577();
            if(var5 != null && var5.method5463()) {
               class286 var7 = (class286)this.method5374(var5);
               if(var4) {
                  class286 var8 = (class286)this.method5374(var6);
                  if(var8 != null && var7 != var8) {
                     if(var7 != null) {
                        this.method5362(var8);
                     } else {
                        var7 = var8;
                     }
                  }
               }

               if(var7 != null) {
                  this.method5339(var7, var5, var6);
                  continue;
               }

               if(this.method5341() < 400) {
                  int var9 = this.method5341();
                  var7 = (class286)this.method5373(var5, var6);
                  var7.field3646 = var9;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }
}
