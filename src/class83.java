import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public class class83 {

   @ObfuscatedName("w")
   static final Map field1204 = new HashMap();
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   static final class197 field1203 = new class197(1024);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lhq;"
   )
   static final class215 field1205 = new class215();
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 2021624217
   )
   static int field1208 = 0;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -2076105995
   )
   static int field1207;
   @ObfuscatedName("ad")
   static int[] field1206;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;Liv;I)V",
      garbageValue = "-927941967"
   )
   public static void method1986(class247 var0, class247 var1) {
      class260.field3309 = var0;
      class260.field3320 = var1;
      class260.field3319 = class260.field3309.method4638(3);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lge;I)V",
      garbageValue = "1737338095"
   )
   static final void method1987(class189 var0) {
      var0.method3898();
      int var1 = client.field709;
      class60 var2 = class150.field1948 = client.field806[var1] = new class60();
      var2.field583 = var1;
      int var3 = var0.method3871(30);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.field928[0] = var5 - class178.field2315;
      var2.field900 = (var2.field928[0] << 7) + (var2.method1141() << 6);
      var2.field939[0] = var6 - class71.field1051;
      var2.field918 = (var2.field939[0] << 7) + (var2.method1141() << 6);
      class192.field2415 = var2.field581 = var4;
      if(class81.field1179[var1] != null) {
         var2.method1132(class81.field1179[var1]);
      }

      class81.field1180 = 0;
      class81.field1181[++class81.field1180 - 1] = var1;
      class81.field1183[var1] = 0;
      class81.field1182 = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if(var1 != var7) {
            int var8 = var0.method3871(18);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            class81.field1184[var7] = (var10 << 14) + var11 + (var9 << 28);
            class81.field1185[var7] = 0;
            class81.field1186[var7] = -1;
            class81.field1175[++class81.field1182 - 1] = var7;
            class81.field1183[var7] = 0;
         }
      }

      var0.method3872();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-709266034"
   )
   static final int method1985(int var0, int var1) {
      int var2 = class5.method68(var0 + '\ub135', 91923 + var1, 4) - 128 + (class5.method68(10294 + var0, var1 + '\u93bd', 2) - 128 >> 1) + (class5.method68(var0, var1, 1) - 128 >> 2);
      var2 = (int)(0.3D * (double)var2) + 35;
      if(var2 < 10) {
         var2 = 10;
      } else if(var2 > 60) {
         var2 = 60;
      }

      return var2;
   }
}
