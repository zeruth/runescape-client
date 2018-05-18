import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
final class class3 implements Comparator {

   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static class249 field21;
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static class249 field24;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lq;Lq;I)I",
      garbageValue = "1722719770"
   )
   int method26(class2 var1, class2 var2) {
      return var1.field13.field28 < var2.field13.field28?-1:(var2.field13.field28 == var1.field13.field28?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method26((class2)var1, (class2)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
