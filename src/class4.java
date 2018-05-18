import java.awt.Component;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class4 {

   @ObfuscatedName("x")
   public static boolean field31;
   @ObfuscatedName("w")
   byte field33;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 767568315
   )
   public int field26;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -898523007
   )
   public int field27;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 2052595455
   )
   public int field28;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 256549175
   )
   public int field29;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 696708223
   )
   public int field30;


   public class4() {}

   @ObfuscatedSignature(
      signature = "(Lgy;Z)V",
      garbageValue = "0"
   )
   public class4(class182 var1, boolean var2) {
      this.field33 = var1.method3569();
      this.field26 = var1.method3574();
      this.field27 = var1.method3573();
      this.field28 = var1.method3573();
      this.field29 = var1.method3573();
      this.field30 = var1.method3573();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   public int method38() {
      return this.field33 & 7;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1682121096"
   )
   public int method42() {
      return (this.field33 & 8) == 8?1:0;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "32"
   )
   void method52(int var1) {
      this.field33 &= -8;
      this.field33 = (byte)(this.field33 | var1 & 7);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-194001658"
   )
   void method36(int var1) {
      this.field33 &= -9;
      if(var1 == 1) {
         this.field33 = (byte)(this.field33 | 8);
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "102125315"
   )
   static void method53(Component var0) {
      var0.removeKeyListener(class39.field350);
      var0.removeFocusListener(class39.field350);
      class39.field349 = -1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(ZZB)Llh;",
      garbageValue = "96"
   )
   static class317 method54(boolean var0, boolean var1) {
      return var0?(var1?class182.field2363:class78.field1110):(var1?class64.field944:class78.field1109);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)I",
      garbageValue = "0"
   )
   public static int method56(int var0, int var1, int var2, int var3, int var4, int var5) {
      if((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      return var2 == 0?var1:(var2 == 1?7 - var0 - (var3 - 1):(var2 == 2?7 - var1 - (var4 - 1):var0));
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-824282945"
   )
   static void method55(int var0) {
      if(var0 != -1) {
         if(class42.method785(var0)) {
            class230[] var1 = class230.field2615[var0];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               class230 var3 = var1[var2];
               if(var3.field2681 != null) {
                  class56 var4 = new class56();
                  var4.field511 = var3;
                  var4.field525 = var3.field2681;
                  class57.method1092(var4, 5000000);
               }
            }

         }
      }
   }

   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      signature = "(Lhl;IIIB)V",
      garbageValue = "1"
   )
   static final void method57(class230 var0, int var1, int var2, int var3) {
      class224 var4 = var0.method4561(false);
      if(var4 != null) {
         if(client.field822 < 3) {
            class35.field302.method5948(var1, var2, var4.field2570, var4.field2575, 25, 25, client.field662, 256, var4.field2573, var4.field2572);
         } else {
            class314.method5786(var1, var2, 0, var4.field2573, var4.field2572);
         }

      }
   }
}
