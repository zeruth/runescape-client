import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class27 implements class31 {

   @ObfuscatedName("oy")
   static boolean field245;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 54998935
   )
   int field239;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -505905531
   )
   int field240;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 954360213
   )
   int field241;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1382559723
   )
   int field244;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 218640797
   )
   int field243;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1115779705
   )
   int field242;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Li;I)V",
      garbageValue = "-1657983190"
   )
   public void vmethod692(class20 var1) {
      if(var1.field176 > this.field243) {
         var1.field176 = this.field243;
      }

      if(var1.field177 < this.field243) {
         var1.field177 = this.field243;
      }

      if(var1.field178 > this.field242) {
         var1.field178 = this.field242;
      }

      if(var1.field179 < this.field242) {
         var1.field179 = this.field242;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "1329615536"
   )
   public boolean vmethod693(int var1, int var2, int var3) {
      return var1 >= this.field239 && var1 < this.field239 + this.field240?var2 >> 6 == this.field241 && var3 >> 6 == this.field244:false;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1150064833"
   )
   public boolean vmethod694(int var1, int var2) {
      return var1 >> 6 == this.field243 && var2 >> 6 == this.field242;
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
         int[] var4 = new int[]{this.field243 * 64 - this.field241 * 64 + var2, var3 + (this.field242 * 64 - this.field244 * 64)};
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
         int var3 = this.field241 * 64 - this.field243 * 64 + var1;
         int var4 = this.field244 * 64 - this.field242 * 64 + var2;
         return new class226(this.field239, var3, var4);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lgy;S)V",
      garbageValue = "255"
   )
   public void vmethod697(class182 var1) {
      this.field239 = var1.method3742();
      this.field240 = var1.method3742();
      this.field241 = var1.method3574();
      this.field244 = var1.method3574();
      this.field243 = var1.method3574();
      this.field242 = var1.method3574();
      this.method479();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "1536"
   )
   void method479() {}

   @ObfuscatedName("w")
   public static boolean method501(long var0) {
      return var0 != 0L && !class263.method4946(var0);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIII)Lcs;",
      garbageValue = "1142826143"
   )
   static class84 method495(int var0, int var1, int var2) {
      int var3 = (var1 << 8) + var0;
      class84 var6 = (class84)class84.field1214.method4023((long)(var3 << 16));
      class84 var5;
      if(var6 != null) {
         var5 = var6;
      } else {
         String var7 = String.valueOf(var3);
         int var8 = class3.field21.method4644(var7);
         if(var8 == -1) {
            var5 = null;
         } else {
            label57: {
               byte[] var9 = class3.field21.method4718(var8);
               if(var9 != null) {
                  if(var9.length <= 1) {
                     var5 = null;
                     break label57;
                  }

                  var6 = class143.method3186(var9);
                  if(var6 != null) {
                     class84.field1214.method4028(var6, (long)(var3 << 16));
                     var5 = var6;
                     break label57;
                  }
               }

               var5 = null;
            }
         }
      }

      if(var5 != null) {
         return var5;
      } else {
         int var13 = var0 + (var2 + '\u9c40' << 8);
         class84 var15 = (class84)class84.field1214.method4023((long)(var13 << 16));
         class84 var14;
         if(var15 != null) {
            var14 = var15;
         } else {
            String var10 = String.valueOf(var13);
            int var11 = class3.field21.method4644(var10);
            if(var11 == -1) {
               var14 = null;
            } else {
               byte[] var12 = class3.field21.method4718(var11);
               if(var12 != null) {
                  if(var12.length <= 1) {
                     var14 = null;
                     return var14 != null?var14:null;
                  }

                  var15 = class143.method3186(var12);
                  if(var15 != null) {
                     class84.field1214.method4028(var15, (long)(var13 << 16));
                     var14 = var15;
                     return var14 != null?var14:null;
                  }
               }

               var14 = null;
            }
         }

         return var14 != null?var14:null;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;ZI)[B",
      garbageValue = "-1795758851"
   )
   public static byte[] method502(Object var0, boolean var1) {
      if(var0 == null) {
         return null;
      } else if(var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         if(var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if(var0 instanceof class186) {
         class186 var2 = (class186)var0;
         return var2.vmethod3833();
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "-54"
   )
   static final String method491(int var0) {
      return var0 < 999999999?Integer.toString(var0):"*";
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-789706794"
   )
   static final void method498(int var0) {
      if(class42.method785(var0)) {
         class269.method5125(class230.field2615[var0], -1);
      }
   }
}
