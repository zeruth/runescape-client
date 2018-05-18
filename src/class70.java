import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public final class class70 extends class127 {

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   static class243 field1042;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 930375409
   )
   int field1032;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 655944159
   )
   int field1033;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 611659329
   )
   int field1034;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 469231961
   )
   int field1035;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1901568555
   )
   int field1044;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 2001790593
   )
   int field1037;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Ljh;"
   )
   class273 field1038;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1488825937
   )
   int field1039 = 0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -271875461
   )
   int field1040 = 0;
   @ObfuscatedName("a")
   boolean field1041 = false;


   class70(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field1032 = var1;
      this.field1034 = var2;
      this.field1035 = var3;
      this.field1044 = var4;
      this.field1037 = var5;
      this.field1033 = var7 + var6;
      int var8 = class51.method1064(this.field1032).field3292;
      if(var8 != -1) {
         this.field1041 = false;
         this.field1038 = class137.method3151(var8);
      } else {
         this.field1041 = true;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "677069676"
   )
   final void method1812(int var1) {
      if(!this.field1041) {
         this.field1040 += var1;

         while(this.field1040 > this.field1038.field3562[this.field1039]) {
            this.field1040 -= this.field1038.field3562[this.field1039];
            ++this.field1039;
            if(this.field1039 >= this.field1038.field3553.length) {
               this.field1041 = true;
               break;
            }
         }

      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)Ldk;",
      garbageValue = "111"
   )
   protected final class119 vmethod3078() {
      class258 var1 = class51.method1064(this.field1032);
      class119 var2;
      if(!this.field1041) {
         var2 = var1.method4864(this.field1039);
      } else {
         var2 = var1.method4864(-1);
      }

      return var2 == null?null:var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Lcs;",
      garbageValue = "-74"
   )
   static class84 method1806(int var0) {
      class84 var1 = (class84)class84.field1214.method4023((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class3.field21.method4626(var0, 0);
         if(var2 == null) {
            return null;
         } else {
            var1 = class143.method3186(var2);
            class84.field1214.method4028(var1, (long)var0);
            return var1;
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "24362530"
   )
   static final boolean method1813(char var0) {
      return var0 == 160 || var0 == 32 || var0 == 95 || var0 == 45;
   }
}
