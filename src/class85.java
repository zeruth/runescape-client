import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class85 extends class127 {

   @ObfuscatedName("v")
   static int[] field1228;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -397638811
   )
   int field1224;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -407435463
   )
   int field1221;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1144788199
   )
   int field1222;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 685446185
   )
   int field1229;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1126673881
   )
   int field1226;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1918137409
   )
   int field1225;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Ljh;"
   )
   class273 field1233;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1383469485
   )
   int field1227;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1546300439
   )
   int field1223;


   @ObfuscatedSignature(
      signature = "(IIIIIIIZLdz;)V"
   )
   class85(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, class127 var9) {
      this.field1224 = var1;
      this.field1221 = var2;
      this.field1222 = var3;
      this.field1229 = var4;
      this.field1226 = var5;
      this.field1225 = var6;
      if(var7 != -1) {
         this.field1233 = class137.method3151(var7);
         this.field1227 = 0;
         this.field1223 = client.field679 - 1;
         if(this.field1233.field3566 == 0 && var9 != null && var9 instanceof class85) {
            class85 var10 = (class85)var9;
            if(this.field1233 == var10.field1233) {
               this.field1227 = var10.field1227;
               this.field1223 = var10.field1223;
               return;
            }
         }

         if(var8 && this.field1233.field3557 != -1) {
            this.field1227 = (int)(Math.random() * (double)this.field1233.field3553.length);
            this.field1223 -= (int)(Math.random() * (double)this.field1233.field3562[this.field1227]);
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)Ldk;",
      garbageValue = "111"
   )
   protected final class119 vmethod3078() {
      if(this.field1233 != null) {
         int var1 = client.field679 - this.field1223;
         if(var1 > 100 && this.field1233.field3557 > 0) {
            var1 = 100;
         }

         while(var1 > this.field1233.field3562[this.field1227]) {
            var1 -= this.field1233.field3562[this.field1227];
            ++this.field1227;
            if(this.field1227 >= this.field1233.field3553.length) {
               this.field1227 -= this.field1233.field3557;
               if(this.field1227 < 0 || this.field1227 >= this.field1233.field3553.length) {
                  this.field1233 = null;
                  break;
               }
            }
         }

         this.field1223 = client.field679 - var1;
      }

      class268 var12 = class40.method766(this.field1224);
      if(var12.field3430 != null) {
         var12 = var12.method5076();
      }

      if(var12 == null) {
         return null;
      } else {
         int var2;
         int var3;
         if(this.field1222 != 1 && this.field1222 != 3) {
            var2 = var12.field3404;
            var3 = var12.field3420;
         } else {
            var2 = var12.field3420;
            var3 = var12.field3404;
         }

         int var4 = (var2 >> 1) + this.field1226;
         int var5 = (var2 + 1 >> 1) + this.field1226;
         int var6 = (var3 >> 1) + this.field1225;
         int var7 = (var3 + 1 >> 1) + this.field1225;
         int[][] var8 = class50.field447[this.field1229];
         int var9 = var8[var5][var7] + var8[var4][var6] + var8[var5][var6] + var8[var4][var7] >> 2;
         int var10 = (this.field1226 << 7) + (var2 << 6);
         int var11 = (this.field1225 << 7) + (var3 << 6);
         return var12.method5092(this.field1221, this.field1222, var8, var10, var9, var11, this.field1233, this.field1227);
      }
   }
}
