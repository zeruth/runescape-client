import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class66 {

   @ObfuscatedName("rn")
   @ObfuscatedSignature(
      signature = "Llz;"
   )
   static class321 field987;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 787405545
   )
   static int field986 = 6;
   @ObfuscatedName("av")
   protected static boolean field978;
   @ObfuscatedName("q")
   boolean field981;
   @ObfuscatedName("b")
   boolean field982;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 132306381
   )
   int field979 = 1;
   @ObfuscatedName("n")
   String field980 = null;
   @ObfuscatedName("h")
   boolean field977 = false;
   @ObfuscatedName("x")
   LinkedHashMap field975 = new LinkedHashMap();


   class66() {
      this.method1659(true);
   }

   @ObfuscatedSignature(
      signature = "(Lgy;)V"
   )
   class66(class182 var1) {
      if(var1 != null && var1.field2365 != null) {
         int var2 = var1.method3742();
         if(var2 >= 0 && var2 <= field986) {
            if(var1.method3742() == 1) {
               this.field981 = true;
            }

            if(var2 > 1) {
               this.field982 = var1.method3742() == 1;
            }

            if(var2 > 3) {
               this.field979 = var1.method3742();
            }

            if(var2 > 2) {
               int var3 = var1.method3742();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.method3573();
                  int var6 = var1.method3573();
                  this.field975.put(Integer.valueOf(var5), Integer.valueOf(var6));
               }
            }

            if(var2 > 4) {
               this.field980 = var1.method3576();
            }

            if(var2 > 5) {
               this.field977 = var1.method3656();
            }
         } else {
            this.method1659(true);
         }
      } else {
         this.method1659(true);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "93"
   )
   void method1659(boolean var1) {}

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)Lgy;",
      garbageValue = "-5"
   )
   class182 method1650() {
      class182 var1 = new class182(100);
      var1.method3552(field986);
      var1.method3552(this.field981?1:0);
      var1.method3552(this.field982?1:0);
      var1.method3552(this.field979);
      var1.method3552(this.field975.size());
      Iterator var2 = this.field975.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.method3555(((Integer)var3.getKey()).intValue());
         var1.method3555(((Integer)var3.getValue()).intValue());
      }

      var1.method3549(this.field980 != null?this.field980:"");
      var1.method3558(this.field977);
      return var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "1360620841"
   )
   static int method1661(int var0, class84 var1, boolean var2) {
      int var3;
      if(var0 == 4200) {
         var3 = class69.field1026[--class45.field377];
         class69.field1021[++class83.field1207 - 1] = class120.method2784(var3).field3449;
         return 1;
      } else {
         int var4;
         class269 var5;
         if(var0 == 4201) {
            class45.field377 -= 2;
            var3 = class69.field1026[class45.field377];
            var4 = class69.field1026[class45.field377 + 1];
            var5 = class120.method2784(var3);
            if(var4 >= 1 && var4 <= 5 && var5.field3463[var4 - 1] != null) {
               class69.field1021[++class83.field1207 - 1] = var5.field3463[var4 - 1];
            } else {
               class69.field1021[++class83.field1207 - 1] = "";
            }

            return 1;
         } else if(var0 == 4202) {
            class45.field377 -= 2;
            var3 = class69.field1026[class45.field377];
            var4 = class69.field1026[class45.field377 + 1];
            var5 = class120.method2784(var3);
            if(var4 >= 1 && var4 <= 5 && var5.field3464[var4 - 1] != null) {
               class69.field1021[++class83.field1207 - 1] = var5.field3464[var4 - 1];
            } else {
               class69.field1021[++class83.field1207 - 1] = "";
            }

            return 1;
         } else if(var0 == 4203) {
            var3 = class69.field1026[--class45.field377];
            class69.field1026[++class45.field377 - 1] = class120.method2784(var3).field3487;
            return 1;
         } else if(var0 == 4204) {
            var3 = class69.field1026[--class45.field377];
            class69.field1026[++class45.field377 - 1] = class120.method2784(var3).field3482 == 1?1:0;
            return 1;
         } else {
            class269 var6;
            if(var0 == 4205) {
               var3 = class69.field1026[--class45.field377];
               var6 = class120.method2784(var3);
               if(var6.field3460 == -1 && var6.field3447 >= 0) {
                  class69.field1026[++class45.field377 - 1] = var6.field3447;
               } else {
                  class69.field1026[++class45.field377 - 1] = var3;
               }

               return 1;
            } else if(var0 == 4206) {
               var3 = class69.field1026[--class45.field377];
               var6 = class120.method2784(var3);
               if(var6.field3460 >= 0 && var6.field3447 >= 0) {
                  class69.field1026[++class45.field377 - 1] = var6.field3447;
               } else {
                  class69.field1026[++class45.field377 - 1] = var3;
               }

               return 1;
            } else if(var0 == 4207) {
               var3 = class69.field1026[--class45.field377];
               class69.field1026[++class45.field377 - 1] = class120.method2784(var3).field3462?1:0;
               return 1;
            } else if(var0 == 4208) {
               var3 = class69.field1026[--class45.field377];
               var6 = class120.method2784(var3);
               if(var6.field3440 == -1 && var6.field3492 >= 0) {
                  class69.field1026[++class45.field377 - 1] = var6.field3492;
               } else {
                  class69.field1026[++class45.field377 - 1] = var3;
               }

               return 1;
            } else if(var0 == 4209) {
               var3 = class69.field1026[--class45.field377];
               var6 = class120.method2784(var3);
               if(var6.field3440 >= 0 && var6.field3492 >= 0) {
                  class69.field1026[++class45.field377 - 1] = var6.field3492;
               } else {
                  class69.field1026[++class45.field377 - 1] = var3;
               }

               return 1;
            } else if(var0 == 4210) {
               String var7 = class69.field1021[--class83.field1207];
               var4 = class69.field1026[--class45.field377];
               class16.method189(var7, var4 == 1);
               class69.field1026[++class45.field377 - 1] = class28.field256;
               return 1;
            } else if(var0 != 4211) {
               if(var0 == 4212) {
                  class56.field522 = 0;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if(class137.field1889 != null && class56.field522 < class28.field256) {
                  class69.field1026[++class45.field377 - 1] = class137.field1889[++class56.field522 - 1] & '\uffff';
               } else {
                  class69.field1026[++class45.field377 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }
}
