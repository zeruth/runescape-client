import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
public class class292 extends class287 {

   @ObfuscatedName("w")
   boolean field3664;
   @ObfuscatedName("m")
   boolean field3663;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lkf;I)I",
      garbageValue = "1903277839"
   )
   int method5485(class292 var1) {
      return super.field3648 == client.field676 && client.field676 != var1.field3648?-1:(client.field676 == var1.field3648 && super.field3648 != client.field676?1:(super.field3648 != 0 && var1.field3648 == 0?-1:(var1.field3648 != 0 && super.field3648 == 0?1:(this.field3664 && !var1.field3664?-1:(!this.field3664 && var1.field3664?1:(this.field3663 && !var1.field3663?-1:(!this.field3663 && var1.field3663?1:(super.field3648 != 0?super.field3649 - var1.field3649:var1.field3649 - super.field3649))))))));
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljn;I)I",
      garbageValue = "1707398523"
   )
   public int vmethod5482(class282 var1) {
      return this.method5485((class292)var1);
   }

   public int compareTo(Object var1) {
      return this.method5485((class292)var1);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lbb;I)V",
      garbageValue = "-2026437852"
   )
   static void method5484(class65 var0) {
      if(var0.method1603() != client.field628) {
         client.field628 = var0.method1603();
         boolean var1 = var0.method1603();
         if(var1 != class4.field31) {
            class21.method303();
            class4.field31 = var1;
         }
      }

      class0.field1 = var0.field963;
      client.field676 = var0.field960;
      client.field726 = var0.field961;
      class168.field2111 = client.field596 == 0?'\uaa4a':var0.field960 + '\u9c40';
      class13.field101 = client.field596 == 0?443:var0.field960 + '\uc350';
      class12.field91 = class168.field2111;
   }
}
