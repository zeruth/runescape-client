import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class class282 implements Comparable {

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   class291 field3630;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lkm;"
   )
   class291 field3629;


   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(B)Lkm;",
      garbageValue = "55"
   )
   public class291 method5299() {
      return this.field3630;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-2092094287"
   )
   public String method5300() {
      return this.field3630 == null?"":this.field3630.method5462();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "47"
   )
   public String method5301() {
      return this.field3629 == null?"":this.field3629.method5462();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Lkm;Lkm;I)V",
      garbageValue = "1050931041"
   )
   void method5316(class291 var1, class291 var2) {
      if(var1 == null) {
         throw new NullPointerException();
      } else {
         this.field3630 = var1;
         this.field3629 = var2;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljn;I)I",
      garbageValue = "1707398523"
   )
   public int vmethod5482(class282 var1) {
      return this.field3630.method5464(var1.field3630);
   }

   public int compareTo(Object var1) {
      return this.vmethod5482((class282)var1);
   }
}
