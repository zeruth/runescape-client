import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
public class class98 {

   @ObfuscatedName("pp")
   @ObfuscatedGetter(
      intValue = 111368081
   )
   static int field1360;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   class247 field1362;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   class247 field1358;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   class202 field1359 = new class202(256);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   class202 field1357 = new class202(256);


   @ObfuscatedSignature(
      signature = "(Liv;Liv;)V"
   )
   public class98(class247 var1, class247 var2) {
      this.field1362 = var1;
      this.field1358 = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II[IB)Lcg;",
      garbageValue = "-33"
   )
   class93 method2275(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4;
      class93 var7 = (class93)this.field1357.method4064(var5);
      if(var7 != null) {
         return var7;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class91 var8 = class91.method2114(this.field1362, var1, var2);
         if(var8 == null) {
            return null;
         } else {
            var7 = var8.method2110();
            this.field1357.method4063(var7, var5);
            if(var3 != null) {
               var3[0] -= var7.field1305.length;
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II[II)Lcg;",
      garbageValue = "722390321"
   )
   class93 method2276(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4 ^ 4294967296L;
      class93 var7 = (class93)this.field1357.method4064(var5);
      if(var7 != null) {
         return var7;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class92 var8 = (class92)this.field1359.method4064(var5);
         if(var8 == null) {
            var8 = class92.method2127(this.field1358, var1, var2);
            if(var8 == null) {
               return null;
            }

            this.field1359.method4063(var8, var5);
         }

         var7 = var8.method2128(var3);
         if(var7 == null) {
            return null;
         } else {
            var8.method4098();
            this.field1357.method4063(var7, var5);
            return var7;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I[II)Lcg;",
      garbageValue = "-757008929"
   )
   public class93 method2277(int var1, int[] var2) {
      if(this.field1362.method4645() == 1) {
         return this.method2275(0, var1, var2);
      } else if(this.field1362.method4638(var1) == 1) {
         return this.method2275(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I[II)Lcg;",
      garbageValue = "1692568928"
   )
   public class93 method2274(int var1, int[] var2) {
      if(this.field1358.method4645() == 1) {
         return this.method2276(0, var1, var2);
      } else if(this.field1358.method4638(var1) == 1) {
         return this.method2276(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-12"
   )
   public static int method2288(int var0, int var1) {
      int var2 = var0 >>> 31;
      return (var0 + var2) / var1 - var2;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-1370748959"
   )
   static int method2285(int var0, class84 var1, boolean var2) {
      class230 var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class61.method1188(class69.field1026[--class45.field377]);
      } else {
         var3 = var2?class184.field2379:class67.field996;
      }

      if(var0 == 1927) {
         if(class69.field1025 >= 10) {
            throw new RuntimeException();
         } else if(var3.field2745 == null) {
            return 0;
         } else {
            class56 var4 = new class56();
            var4.field511 = var3;
            var4.field525 = var3.field2745;
            var4.field519 = class69.field1025 + 1;
            client.field755.method4126(var4);
            return 1;
         }
      } else {
         return 2;
      }
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V",
      garbageValue = "105"
   )
   static final void method2289(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(!client.field846) {
         if(client.field657 < 500) {
            client.field734[client.field657] = var0;
            client.field735[client.field657] = var1;
            client.field702[client.field657] = var2;
            client.field619[client.field657] = var3;
            client.field730[client.field657] = var4;
            client.field737[client.field657] = var5;
            client.field728[client.field657] = var6;
            ++client.field657;
         }

      }
   }
}
