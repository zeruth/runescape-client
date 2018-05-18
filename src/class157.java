import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public abstract class class157 {

   @ObfuscatedName("py")
   @ObfuscatedGetter(
      intValue = 200599753
   )
   static int field1999;


   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-1138130565"
   )
   public abstract boolean vmethod3355(int var1) throws IOException;

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "255159045"
   )
   public abstract int vmethod3354() throws IOException;

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1722557406"
   )
   public abstract int vmethod3353() throws IOException;

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-61239109"
   )
   public abstract int vmethod3356(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1450005148"
   )
   public abstract void vmethod3385(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "188281095"
   )
   public abstract void vmethod3368();

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;Liv;Liv;Liv;B)V",
      garbageValue = "8"
   )
   public static void method3310(class247 var0, class247 var1, class247 var2, class247 var3) {
      class130.field1824 = var0;
      class230.field2613 = var1;
      class39.field354 = var2;
      class217.field2489 = var3;
      class230.field2615 = new class230[class130.field1824.method4645()][];
      class80.field1173 = new boolean[class130.field1824.method4645()];
   }

   @ObfuscatedName("m")
   public static double method3303(double var0, double var2, double var4) {
      return class110.method2581((var0 - var2) / var4) / var4;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-6"
   )
   public static void method3307() {
      class254.field3252.method4024();
   }
}
