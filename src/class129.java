import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class class129 {

   @ObfuscatedName("i")
   public static String field1823;
   @ObfuscatedName("k")
   public static String field1822;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 352790753
   )
   int field1820;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -696934221
   )
   int field1821;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -731724627
   )
   int field1819;


   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(ILff;Lic;B)V",
      garbageValue = "82"
   )
   static void method3082(int var0, class162 var1, class249 var2) {
      class245 var3 = new class245();
      var3.field3163 = 1;
      var3.field2449 = (long)var0;
      var3.field3164 = var1;
      var3.field3162 = var2;
      class205 var4 = class248.field3196;
      synchronized(class248.field3196) {
         class248.field3196.method4126(var3);
      }

      class158.method3313();
   }

   @ObfuscatedName("go")
   @ObfuscatedSignature(
      signature = "(Lbs;I)V",
      garbageValue = "674148170"
   )
   static final void method3083(class63 var0) {
      if(var0.field929 != 0) {
         if(var0.field935 != -1) {
            Object var1 = null;
            if(var0.field935 < '\u8000') {
               var1 = client.field807[var0.field935];
            } else if(var0.field935 >= '\u8000') {
               var1 = client.field806[var0.field935 - '\u8000'];
            }

            if(var1 != null) {
               int var2 = var0.field900 - ((class63)var1).field900;
               int var3 = var0.field918 - ((class63)var1).field918;
               if(var2 != 0 || var3 != 0) {
                  var0.field934 = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
               }
            } else if(var0.field910) {
               var0.field935 = -1;
               var0.field910 = false;
            }
         }

         if(var0.field897 != -1 && (var0.field937 == 0 || var0.field936 > 0)) {
            var0.field934 = var0.field897;
            var0.field897 = -1;
         }

         int var4 = var0.field934 - var0.field883 & 2047;
         if(var4 == 0 && var0.field910) {
            var0.field935 = -1;
            var0.field910 = false;
         }

         if(var4 != 0) {
            ++var0.field930;
            boolean var6;
            if(var4 > 1024) {
               var0.field883 -= var0.field929;
               var6 = true;
               if(var4 < var0.field929 || var4 > 2048 - var0.field929) {
                  var0.field883 = var0.field934;
                  var6 = false;
               }

               if(var0.field912 == var0.field909 && (var0.field930 > 25 || var6)) {
                  if(var0.field892 != -1) {
                     var0.field912 = var0.field892;
                  } else {
                     var0.field912 = var0.field890;
                  }
               }
            } else {
               var0.field883 += var0.field929;
               var6 = true;
               if(var4 < var0.field929 || var4 > 2048 - var0.field929) {
                  var0.field883 = var0.field934;
                  var6 = false;
               }

               if(var0.field912 == var0.field909 && (var0.field930 > 25 || var6)) {
                  if(var0.field889 != -1) {
                     var0.field912 = var0.field889;
                  } else {
                     var0.field912 = var0.field890;
                  }
               }
            }

            var0.field883 &= 2047;
         } else {
            var0.field930 = 0;
         }

      }
   }
}
