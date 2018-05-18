import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class291 implements Comparable {

   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -764982541
   )
   static int field3662;
   @ObfuscatedName("w")
   String field3661;
   @ObfuscatedName("m")
   String field3660;


   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Lla;)V"
   )
   public class291(String var1, class322 var2) {
      this.field3661 = var1;
      this.field3660 = class123.method2898(var1, var2);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-69"
   )
   public String method5462() {
      return this.field3661;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1957595085"
   )
   public boolean method5463() {
      return this.field3660 != null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lkm;I)I",
      garbageValue = "-1019319110"
   )
   public int method5464(class291 var1) {
      return this.field3660 == null?(var1.field3660 == null?0:1):(var1.field3660 == null?-1:this.field3660.compareTo(var1.field3660));
   }

   public boolean equals(Object var1) {
      if(var1 instanceof class291) {
         class291 var2 = (class291)var1;
         return this.field3660 == null?var2.field3660 == null:(var2.field3660 == null?false:(this.hashCode() != var2.hashCode()?false:this.field3660.equals(var2.field3660)));
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field3660 == null?0:this.field3660.hashCode();
   }

   public int compareTo(Object var1) {
      return this.method5464((class291)var1);
   }

   public String toString() {
      return this.method5462();
   }
}
