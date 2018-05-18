import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public final class class128 {

   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = -230161085
   )
   public static int field1813;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 318506851
   )
   int field1815;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1496036263
   )
   int field1807;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 512706293
   )
   int field1816;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 981894001
   )
   int field1809;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -110106465
   )
   int field1808;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Ldz;"
   )
   public class127 field1811;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Ldz;"
   )
   public class127 field1812;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = -1278614877165058919L
   )
   public long field1818 = 0L;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1840176221
   )
   int field1814 = 0;


   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-176484059"
   )
   static int method3081(int var0, class84 var1, boolean var2) {
      int var3;
      int var4;
      if(var0 == 4000) {
         class45.field377 -= 2;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         class69.field1026[++class45.field377 - 1] = var3 + var4;
         return 1;
      } else if(var0 == 4001) {
         class45.field377 -= 2;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         class69.field1026[++class45.field377 - 1] = var3 - var4;
         return 1;
      } else if(var0 == 4002) {
         class45.field377 -= 2;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         class69.field1026[++class45.field377 - 1] = var3 * var4;
         return 1;
      } else if(var0 == 4003) {
         class45.field377 -= 2;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         class69.field1026[++class45.field377 - 1] = var3 / var4;
         return 1;
      } else if(var0 == 4004) {
         var3 = class69.field1026[--class45.field377];
         class69.field1026[++class45.field377 - 1] = (int)(Math.random() * (double)var3);
         return 1;
      } else if(var0 == 4005) {
         var3 = class69.field1026[--class45.field377];
         class69.field1026[++class45.field377 - 1] = (int)(Math.random() * (double)(var3 + 1));
         return 1;
      } else if(var0 == 4006) {
         class45.field377 -= 5;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         int var5 = class69.field1026[class45.field377 + 2];
         int var6 = class69.field1026[class45.field377 + 3];
         int var7 = class69.field1026[class45.field377 + 4];
         class69.field1026[++class45.field377 - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
         return 1;
      } else if(var0 == 4007) {
         class45.field377 -= 2;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         class69.field1026[++class45.field377 - 1] = var3 + var3 * var4 / 100;
         return 1;
      } else if(var0 == 4008) {
         class45.field377 -= 2;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         class69.field1026[++class45.field377 - 1] = var3 | 1 << var4;
         return 1;
      } else if(var0 == 4009) {
         class45.field377 -= 2;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         class69.field1026[++class45.field377 - 1] = var3 & -1 - (1 << var4);
         return 1;
      } else if(var0 == 4010) {
         class45.field377 -= 2;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         class69.field1026[++class45.field377 - 1] = (var3 & 1 << var4) != 0?1:0;
         return 1;
      } else if(var0 == 4011) {
         class45.field377 -= 2;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         class69.field1026[++class45.field377 - 1] = var3 % var4;
         return 1;
      } else if(var0 == 4012) {
         class45.field377 -= 2;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         if(var3 == 0) {
            class69.field1026[++class45.field377 - 1] = 0;
         } else {
            class69.field1026[++class45.field377 - 1] = (int)Math.pow((double)var3, (double)var4);
         }

         return 1;
      } else if(var0 == 4013) {
         class45.field377 -= 2;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         if(var3 == 0) {
            class69.field1026[++class45.field377 - 1] = 0;
            return 1;
         } else {
            switch(var4) {
            case 0:
               class69.field1026[++class45.field377 - 1] = Integer.MAX_VALUE;
               break;
            case 1:
               class69.field1026[++class45.field377 - 1] = var3;
               break;
            case 2:
               class69.field1026[++class45.field377 - 1] = (int)Math.sqrt((double)var3);
               break;
            case 3:
               class69.field1026[++class45.field377 - 1] = (int)Math.cbrt((double)var3);
               break;
            case 4:
               class69.field1026[++class45.field377 - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
               break;
            default:
               class69.field1026[++class45.field377 - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
            }

            return 1;
         }
      } else if(var0 == 4014) {
         class45.field377 -= 2;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         class69.field1026[++class45.field377 - 1] = var3 & var4;
         return 1;
      } else if(var0 == 4015) {
         class45.field377 -= 2;
         var3 = class69.field1026[class45.field377];
         var4 = class69.field1026[class45.field377 + 1];
         class69.field1026[++class45.field377 - 1] = var3 | var4;
         return 1;
      } else if(var0 == 4018) {
         class45.field377 -= 3;
         long var9 = (long)class69.field1026[class45.field377];
         long var11 = (long)class69.field1026[class45.field377 + 1];
         long var13 = (long)class69.field1026[class45.field377 + 2];
         class69.field1026[++class45.field377 - 1] = (int)(var13 * var9 / var11);
         return 1;
      } else {
         return 2;
      }
   }
}
