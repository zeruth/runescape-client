import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("Ignore")
public class Ignore extends Nameable {
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 776785653
   )
   static int field3645;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lhc;"
   )
   static Track1 field3644;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1405632693
   )
   int field3646;

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lkj;I)I",
      garbageValue = "850817687"
   )
   int method5420(Ignore var1) {
      return this.field3646 - var1.field3646;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljn;I)I",
      garbageValue = "1707398523"
   )
   public int vmethod5482(Nameable var1) {
      return this.method5420((Ignore)var1);
   }

   public int compareTo(Object var1) {
      return this.method5420((Ignore)var1);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2039609224"
   )
   public static void method5431() {
      // $FF: Couldn't be decompiled
   }
}
