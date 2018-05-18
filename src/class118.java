import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public final class class118 extends class204 {

   @ObfuscatedName("pk")
   @ObfuscatedGetter(
      intValue = -83791479
   )
   static int field1589;
   @ObfuscatedName("eo")
   @ObfuscatedSignature(
      signature = "Led;"
   )
   static class153 field1584;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1561524015
   )
   int field1609;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1674601455
   )
   int field1608;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -798044221
   )
   int field1586;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1001695283
   )
   int field1587;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Ldi;"
   )
   class123 field1597;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lde;"
   )
   class114 field1605;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Ldq;"
   )
   class128 field1590;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Leo;"
   )
   class133 field1591;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   class115 field1596;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Ldp;"
   )
   class112 field1593;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1950200141
   )
   int field1594;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "[Leg;"
   )
   class134[] field1595 = new class134[5];
   @ObfuscatedName("s")
   int[] field1585 = new int[5];
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -148362437
   )
   int field1600 = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1028803959
   )
   int field1598;
   @ObfuscatedName("y")
   boolean field1599;
   @ObfuscatedName("c")
   boolean field1588;
   @ObfuscatedName("e")
   boolean field1601;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 351668389
   )
   int field1602;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -900292881
   )
   int field1603;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -568181011
   )
   int field1604;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 360429277
   )
   int field1592;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Ldh;"
   )
   class118 field1606;


   class118(int var1, int var2, int var3) {
      this.field1587 = this.field1609 = var1;
      this.field1608 = var2;
      this.field1586 = var3;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-6"
   )
   public static int method2717(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }
}
