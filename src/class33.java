import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class33 extends class20 {

   @ObfuscatedName("s")
   HashSet field292;
   @ObfuscatedName("p")
   HashSet field293;
   @ObfuscatedName("g")
   List field291;


   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "(Lgy;Lgy;Lgy;IZI)V",
      garbageValue = "-2045505294"
   )
   void method603(class182 var1, class182 var2, class182 var3, int var4, boolean var5) {
      this.method224(var1, var4);
      int var6 = var3.method3574();
      this.field292 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class10 var8 = new class10();

         try {
            var8.method104(var2, var3);
         } catch (IllegalStateException var13) {
            continue;
         }

         this.field292.add(var8);
      }

      var7 = var3.method3574();
      this.field293 = new HashSet(var7);

      for(int var11 = 0; var11 < var7; ++var11) {
         class34 var9 = new class34();

         try {
            var9.method611(var2, var3);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field293.add(var9);
      }

      this.method604(var2, var5);
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "(Lgy;ZI)V",
      garbageValue = "1936398162"
   )
   void method604(class182 var1, boolean var2) {
      this.field291 = new LinkedList();
      int var3 = var1.method3574();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.method3585();
         class226 var6 = new class226(var1.method3573());
         boolean var7 = var1.method3742() == 1;
         if(var2 || !var7) {
            this.field291.add(new class13(var5, var6));
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1331195192"
   )
   static void method608(int var0, int var1) {
      long var2 = (long)((var0 << 16) + var1);
      class246 var4 = (class246)class250.field3216.method4064(var2);
      if(var4 != null) {
         class250.field3215.method3965(var4);
      }
   }

   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      signature = "(Lbs;I)V",
      garbageValue = "1744977178"
   )
   static final void method605(class63 var0) {
      var0.field884 = false;
      class273 var1;
      if(var0.field912 != -1) {
         var1 = class137.method3151(var0.field912);
         if(var1 != null && var1.field3553 != null) {
            ++var0.field914;
            if(var0.field911 < var1.field3553.length && var0.field914 > var1.field3562[var0.field911]) {
               var0.field914 = 1;
               ++var0.field911;
               class173.method3491(var1, var0.field911, var0.field900, var0.field918);
            }

            if(var0.field911 >= var1.field3553.length) {
               var0.field914 = 0;
               var0.field911 = 0;
               class173.method3491(var1, var0.field911, var0.field900, var0.field918);
            }
         } else {
            var0.field912 = -1;
         }
      }

      if(var0.field920 != -1 && client.field679 >= var0.field923) {
         if(var0.field921 < 0) {
            var0.field921 = 0;
         }

         int var3 = class51.method1064(var0.field920).field3292;
         if(var3 != -1) {
            class273 var2 = class137.method3151(var3);
            if(var2 != null && var2.field3553 != null) {
               ++var0.field903;
               if(var0.field921 < var2.field3553.length && var0.field903 > var2.field3562[var0.field921]) {
                  var0.field903 = 1;
                  ++var0.field921;
                  class173.method3491(var2, var0.field921, var0.field900, var0.field918);
               }

               if(var0.field921 >= var2.field3553.length && (var0.field921 < 0 || var0.field921 >= var2.field3553.length)) {
                  var0.field920 = -1;
               }
            } else {
               var0.field920 = -1;
            }
         } else {
            var0.field920 = -1;
         }
      }

      if(var0.field915 != -1 && var0.field913 <= 1) {
         var1 = class137.method3151(var0.field915);
         if(var1.field3564 == 1 && var0.field942 > 0 && var0.field896 <= client.field679 && var0.field901 < client.field679) {
            var0.field913 = 1;
            return;
         }
      }

      if(var0.field915 != -1 && var0.field913 == 0) {
         var1 = class137.method3151(var0.field915);
         if(var1 != null && var1.field3553 != null) {
            ++var0.field917;
            if(var0.field916 < var1.field3553.length && var0.field917 > var1.field3562[var0.field916]) {
               var0.field917 = 1;
               ++var0.field916;
               class173.method3491(var1, var0.field916, var0.field900, var0.field918);
            }

            if(var0.field916 >= var1.field3553.length) {
               var0.field916 -= var1.field3557;
               ++var0.field919;
               if(var0.field919 >= var1.field3552) {
                  var0.field915 = -1;
               } else if(var0.field916 >= 0 && var0.field916 < var1.field3553.length) {
                  class173.method3491(var1, var0.field916, var0.field900, var0.field918);
               } else {
                  var0.field915 = -1;
               }
            }

            var0.field884 = var1.field3559;
         } else {
            var0.field915 = -1;
         }
      }

      if(var0.field913 > 0) {
         --var0.field913;
      }

   }
}
