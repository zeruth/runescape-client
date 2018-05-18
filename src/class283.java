import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public abstract class class283 implements Comparator {

   @ObfuscatedName("oc")
   @ObfuscatedSignature(
      signature = "Llc;"
   )
   static class318 field3633;
   @ObfuscatedName("m")
   Comparator field3632;


   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;B)V",
      garbageValue = "1"
   )
   final void method5319(Comparator var1) {
      if(this.field3632 == null) {
         this.field3632 = var1;
      } else if(this.field3632 instanceof class283) {
         ((class283)this.field3632).method5319(var1);
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(Ljn;Ljn;B)I",
      garbageValue = "-20"
   )
   protected final int method5320(class282 var1, class282 var2) {
      return this.field3632 == null?0:this.field3632.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
