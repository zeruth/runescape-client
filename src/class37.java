import java.awt.FontMetrics;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class37 implements class31 {

   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1769972279
   )
   public static int field326;
   @ObfuscatedName("ay")
   static FontMetrics field322;
   @ObfuscatedName("al")
   static client field321;
   @ObfuscatedName("kk")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static class230 field329;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 944891479
   )
   int field316;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -207149379
   )
   int field315;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -668304319
   )
   int field323;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -555984509
   )
   int field317;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1747517465
   )
   int field328;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 948311901
   )
   int field314;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1095731723
   )
   int field320;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1187143819
   )
   int field325;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 424381735
   )
   int field319;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 2082263395
   )
   int field318;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Li;I)V",
      garbageValue = "-1657983190"
   )
   public void vmethod692(class20 var1) {
      if(var1.field176 > this.field328) {
         var1.field176 = this.field328;
      }

      if(var1.field177 < this.field328) {
         var1.field177 = this.field328;
      }

      if(var1.field178 > this.field314) {
         var1.field178 = this.field314;
      }

      if(var1.field179 < this.field314) {
         var1.field179 = this.field314;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "1329615536"
   )
   public boolean vmethod693(int var1, int var2, int var3) {
      return var1 >= this.field316 && var1 < this.field316 + this.field315?var2 >= (this.field323 << 6) + (this.field320 << 3) && var2 <= (this.field323 << 6) + (this.field320 << 3) + 7 && var3 >= (this.field317 << 6) + (this.field325 << 3) && var3 <= (this.field317 << 6) + (this.field325 << 3) + 7:false;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1150064833"
   )
   public boolean vmethod694(int var1, int var2) {
      return var1 >= (this.field328 << 6) + (this.field319 << 3) && var1 <= (this.field328 << 6) + (this.field319 << 3) + 7 && var2 >= (this.field314 << 6) + (this.field318 << 3) && var2 <= (this.field314 << 6) + (this.field318 << 3) + 7;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "-1657440355"
   )
   public int[] vmethod712(int var1, int var2, int var3) {
      if(!this.vmethod693(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field328 * 64 - this.field323 * 64 + var2 + (this.field319 * 8 - this.field320 * 8), var3 + (this.field314 * 64 - this.field317 * 64) + (this.field318 * 8 - this.field325 * 8)};
         return var4;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(III)Lhh;",
      garbageValue = "2126255726"
   )
   public class226 vmethod707(int var1, int var2) {
      if(!this.vmethod694(var1, var2)) {
         return null;
      } else {
         int var3 = this.field323 * 64 - this.field328 * 64 + (this.field320 * 8 - this.field319 * 8) + var1;
         int var4 = this.field317 * 64 - this.field314 * 64 + var2 + (this.field325 * 8 - this.field318 * 8);
         return new class226(this.field316, var3, var4);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lgy;S)V",
      garbageValue = "255"
   )
   public void vmethod697(class182 var1) {
      this.field316 = var1.method3742();
      this.field315 = var1.method3742();
      this.field323 = var1.method3574();
      this.field320 = var1.method3742();
      this.field317 = var1.method3574();
      this.field325 = var1.method3742();
      this.field328 = var1.method3574();
      this.field319 = var1.method3742();
      this.field314 = var1.method3574();
      this.field318 = var1.method3742();
      this.method698();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "74"
   )
   void method698() {}

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lic;IIIBZI)V",
      garbageValue = "2111436153"
   )
   static void method699(class249 var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var6 = (long)((var1 << 16) + var2);
      class246 var8 = (class246)class250.field3211.method4064(var6);
      if(var8 == null) {
         var8 = (class246)class250.field3213.method4064(var6);
         if(var8 == null) {
            var8 = (class246)class250.field3216.method4064(var6);
            if(var8 != null) {
               if(var5) {
                  var8.method4135();
                  class250.field3211.method4063(var8, var6);
                  --class250.field3219;
                  ++class250.field3212;
               }

            } else {
               if(!var5) {
                  var8 = (class246)class250.field3222.method4064(var6);
                  if(var8 != null) {
                     return;
                  }
               }

               var8 = new class246();
               var8.field3167 = var0;
               var8.field3170 = var3;
               var8.field3169 = var4;
               if(var5) {
                  class250.field3211.method4063(var8, var6);
                  ++class250.field3212;
               } else {
                  class250.field3215.method3981(var8);
                  class250.field3216.method4063(var8, var6);
                  ++class250.field3219;
               }

            }
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "13"
   )
   public static void method721() {
      class217.field2485.method4236();
      class217.field2486 = 1;
      class26.field236 = null;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-353220778"
   )
   static final void method720() {
      class164.method3448("Your ignore list is full. Max of 100 for free users, and 400 for members");
   }
}
