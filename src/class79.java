import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public final class class79 extends class127 {

   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2043248991
   )
   int field1146;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 2124256245
   )
   int field1144;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2107652749
   )
   int field1163;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -907443465
   )
   int field1147;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1488125527
   )
   int field1148;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 108042257
   )
   int field1156;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1138123993
   )
   int field1150;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 735840465
   )
   int field1158;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1250579769
   )
   int field1157;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1696015263
   )
   int field1153;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -975613781
   )
   int field1154;
   @ObfuscatedName("d")
   boolean field1145 = false;
   @ObfuscatedName("s")
   double field1151;
   @ObfuscatedName("p")
   double field1169;
   @ObfuscatedName("g")
   double field1155;
   @ObfuscatedName("y")
   double field1159;
   @ObfuscatedName("c")
   double field1160;
   @ObfuscatedName("e")
   double field1161;
   @ObfuscatedName("t")
   double field1162;
   @ObfuscatedName("u")
   double field1152;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1302634119
   )
   int field1164;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -35397649
   )
   int field1165;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Ljh;"
   )
   class273 field1166;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1323424599
   )
   int field1167 = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1430258759
   )
   int field1168 = 0;


   class79(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.field1146 = var1;
      this.field1144 = var2;
      this.field1163 = var3;
      this.field1147 = var4;
      this.field1148 = var5;
      this.field1150 = var6;
      this.field1158 = var7;
      this.field1157 = var8;
      this.field1153 = var9;
      this.field1154 = var10;
      this.field1156 = var11;
      this.field1145 = false;
      int var12 = class51.method1064(this.field1146).field3292;
      if(var12 != -1) {
         this.field1166 = class137.method3151(var12);
      } else {
         this.field1166 = null;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "1299764784"
   )
   final void method1890(int var1, int var2, int var3, int var4) {
      double var5;
      if(!this.field1145) {
         var5 = (double)(var1 - this.field1163);
         double var7 = (double)(var2 - this.field1147);
         double var9 = Math.sqrt(var5 * var5 + var7 * var7);
         this.field1151 = (double)this.field1163 + (double)this.field1153 * var5 / var9;
         this.field1169 = (double)this.field1147 + (double)this.field1153 * var7 / var9;
         this.field1155 = (double)this.field1148;
      }

      var5 = (double)(this.field1158 + 1 - var4);
      this.field1159 = ((double)var1 - this.field1151) / var5;
      this.field1160 = ((double)var2 - this.field1169) / var5;
      this.field1161 = Math.sqrt(this.field1159 * this.field1159 + this.field1160 * this.field1160);
      if(!this.field1145) {
         this.field1162 = -this.field1161 * Math.tan(0.02454369D * (double)this.field1157);
      }

      this.field1152 = 2.0D * ((double)var3 - this.field1155 - var5 * this.field1162) / (var5 * var5);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-30"
   )
   final void method1894(int var1) {
      this.field1145 = true;
      this.field1151 += (double)var1 * this.field1159;
      this.field1169 += (double)var1 * this.field1160;
      this.field1155 += (double)var1 * (double)var1 * this.field1152 * 0.5D + (double)var1 * this.field1162;
      this.field1162 += (double)var1 * this.field1152;
      this.field1164 = (int)(Math.atan2(this.field1159, this.field1160) * 325.949D) + 1024 & 2047;
      this.field1165 = (int)(Math.atan2(this.field1162, this.field1161) * 325.949D) & 2047;
      if(this.field1166 != null) {
         this.field1168 += var1;

         while(this.field1168 > this.field1166.field3562[this.field1167]) {
            this.field1168 -= this.field1166.field3562[this.field1167];
            ++this.field1167;
            if(this.field1167 >= this.field1166.field3553.length) {
               this.field1167 -= this.field1166.field3557;
               if(this.field1167 < 0 || this.field1167 >= this.field1166.field3553.length) {
                  this.field1167 = 0;
               }
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
      class258 var1 = class51.method1064(this.field1146);
      class119 var2 = var1.method4864(this.field1167);
      if(var2 == null) {
         return null;
      } else {
         var2.method2735(this.field1165);
         return var2;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1530086257"
   )
   static int method1900(int var0) {
      class58 var1 = (class58)class83.field1203.method3991((long)var0);
      return var1 == null?-1:(var1.field2452 == class83.field1205.field2471?-1:((class58)var1.field2452).field546);
   }
}
