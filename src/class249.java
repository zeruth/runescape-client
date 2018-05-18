import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class249 extends class247 {

   @ObfuscatedName("ad")
   static CRC32 field3204 = new CRC32();
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lff;"
   )
   class162 field3198;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lff;"
   )
   class162 field3202;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -373496579
   )
   int field3199;
   @ObfuscatedName("o")
   volatile boolean field3201 = false;
   @ObfuscatedName("ai")
   boolean field3200 = false;
   @ObfuscatedName("at")
   volatile boolean[] field3203;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 2062650897
   )
   int field3205;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1819171657
   )
   int field3206;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -293628809
   )
   int field3207 = -1;


   @ObfuscatedSignature(
      signature = "(Lff;Lff;IZZZ)V"
   )
   public class249(class162 var1, class162 var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.field3198 = var1;
      this.field3202 = var2;
      this.field3199 = var3;
      this.field3200 = var6;
      class154.method3242(this, this.field3199);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "1"
   )
   void vmethod4741(int var1) {
      class33.method608(this.field3199, var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "-45"
   )
   int vmethod4743(int var1) {
      return super.field3183[var1] != null?100:(this.field3203[var1]?100:class8.method91(this.field3199, var1));
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1716933918"
   )
   void vmethod4761(int var1) {
      if(this.field3198 != null && this.field3203 != null && this.field3203[var1]) {
         class162 var2 = this.field3198;
         byte[] var4 = null;
         class205 var5 = class248.field3196;
         synchronized(class248.field3196) {
            for(class245 var6 = (class245)class248.field3196.method4113(); var6 != null; var6 = (class245)class248.field3196.method4104()) {
               if((long)var1 == var6.field2449 && var2 == var6.field3164 && var6.field3163 == 0) {
                  var4 = var6.field3165;
                  break;
               }
            }
         }

         if(var4 != null) {
            this.method4766(var2, var1, var4, true);
         } else {
            byte[] var9 = var2.method3388(var1);
            this.method4766(var2, var1, var9, true);
         }
      } else {
         class37.method699(this, this.field3199, var1, super.field3177[var1], (byte)2, true);
      }

   }

   @ObfuscatedName("da")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-13"
   )
   public int method4739() {
      if(this.field3201) {
         return 100;
      } else if(super.field3183 != null) {
         return 99;
      } else {
         int var1 = class8.method91(255, this.field3199);
         if(var1 >= 100) {
            var1 = 99;
         }

         return var1;
      }
   }

   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-452481515"
   )
   void method4736(int var1, int var2) {
      this.field3205 = var1;
      this.field3206 = var2;
      if(this.field3202 != null) {
         int var3 = this.field3199;
         class162 var4 = this.field3202;
         byte[] var6 = null;
         class205 var7 = class248.field3196;
         synchronized(class248.field3196) {
            class245 var8 = (class245)class248.field3196.method4113();

            while(var8 != null) {
               if(var8.field2449 != (long)var3 || var4 != var8.field3164 || var8.field3163 != 0) {
                  var8 = (class245)class248.field3196.method4104();
               } else {
                  var6 = var8.field3165;
                  break;
               }
            }
         }

         if(var6 != null) {
            this.method4766(var4, var3, var6, true);
         } else {
            byte[] var11 = var4.method3388(var3);
            this.method4766(var4, var3, var11, true);
         }
      } else {
         class37.method699(this, 255, this.field3199, this.field3205, (byte)0, true);
      }

   }

   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      signature = "(I[BZZI)V",
      garbageValue = "1656818327"
   )
   void method4740(int var1, byte[] var2, boolean var3, boolean var4) {
      if(var3) {
         if(this.field3201) {
            throw new RuntimeException();
         }

         if(this.field3202 != null) {
            class80.method1906(this.field3199, var2, this.field3202);
         }

         this.method4683(var2);
         this.method4769();
      } else {
         var2[var2.length - 2] = (byte)(super.field3178[var1] >> 8);
         var2[var2.length - 1] = (byte)super.field3178[var1];
         if(this.field3198 != null) {
            class80.method1906(var1, var2, this.field3198);
            this.field3203[var1] = true;
         }

         if(var4) {
            super.field3183[var1] = class123.method2896(var2, false);
         }
      }

   }

   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      signature = "(Lff;I[BZB)V",
      garbageValue = "24"
   )
   public void method4766(class162 var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if(var1 == this.field3202) {
         if(this.field3201) {
            throw new RuntimeException();
         }

         if(var3 == null) {
            class37.method699(this, 255, this.field3199, this.field3205, (byte)0, true);
            return;
         }

         field3204.reset();
         field3204.update(var3, 0, var3.length);
         var5 = (int)field3204.getValue();
         if(var5 != this.field3205) {
            class37.method699(this, 255, this.field3199, this.field3205, (byte)0, true);
            return;
         }

         class182 var9 = new class182(class175.method3501(var3));
         int var7 = var9.method3742();
         if(var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field3199 + "," + var2);
         }

         int var8 = 0;
         if(var7 >= 6) {
            var8 = var9.method3573();
         }

         if(var8 != this.field3206) {
            class37.method699(this, 255, this.field3199, this.field3205, (byte)0, true);
            return;
         }

         this.method4683(var3);
         this.method4769();
      } else {
         if(!var4 && var2 == this.field3207) {
            this.field3201 = true;
         }

         if(var3 == null || var3.length <= 2) {
            this.field3203[var2] = false;
            if(this.field3200 || var4) {
               class37.method699(this, this.field3199, var2, super.field3177[var2], (byte)2, var4);
            }

            return;
         }

         field3204.reset();
         field3204.update(var3, 0, var3.length - 2);
         var5 = (int)field3204.getValue();
         int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if(var5 != super.field3177[var2] || var6 != super.field3178[var2]) {
            this.field3203[var2] = false;
            if(this.field3200 || var4) {
               class37.method699(this, this.field3199, var2, super.field3177[var2], (byte)2, var4);
            }

            return;
         }

         this.field3203[var2] = true;
         if(var4) {
            super.field3183[var2] = class123.method2896(var3, false);
         }
      }

   }

   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1849563714"
   )
   void method4769() {
      this.field3203 = new boolean[super.field3183.length];

      int var1;
      for(var1 = 0; var1 < this.field3203.length; ++var1) {
         this.field3203[var1] = false;
      }

      if(this.field3198 == null) {
         this.field3201 = true;
      } else {
         this.field3207 = -1;

         for(var1 = 0; var1 < this.field3203.length; ++var1) {
            if(super.field3181[var1] > 0) {
               class129.method3082(var1, this.field3198, this);
               this.field3207 = var1;
            }
         }

         if(this.field3207 == -1) {
            this.field3201 = true;
         }

      }
   }

   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "1"
   )
   public boolean method4744(int var1) {
      return this.field3203[var1];
   }

   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1101254991"
   )
   public boolean method4745(int var1) {
      return this.method4648(var1) != null;
   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "2"
   )
   public int method4746() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < super.field3183.length; ++var3) {
         if(super.field3181[var3] > 0) {
            var1 += 100;
            var2 += this.vmethod4743(var3);
         }
      }

      if(var1 == 0) {
         return 100;
      } else {
         var3 = var2 * 100 / var1;
         return var3;
      }
   }
}
