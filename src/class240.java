import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public enum class240 implements class188 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   field3128("runelite", 0, 4, 0),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   field3121("runelite", 1, 0, 1),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   field3125("runelite", 2, 3, 2),
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   field3123("runelite", 3, 2, 3),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   field3124("runelite", 4, 6, 4),
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   field3122("runelite", 5, 5, 5),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   field3127("runelite", 6, 7, 6),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lio;"
   )
   field3120("runelite", 7, 1, 7);
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1880990663
   )
   public final int field3126;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -476998929
   )
   final int field3129;


   class240(String var1, int var2, int var3, int var4) {
      this.field3126 = var3;
      this.field3129 = var4;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "60"
   )
   public int vmethod5860() {
      return this.field3129;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)[Lja;",
      garbageValue = "1307298515"
   )
   static class270[] method4602() {
      return new class270[]{class270.field3495, class270.field3496, class270.field3498};
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;ZI)Ldw;",
      garbageValue = "1005836723"
   )
   public static class110 method4600(String var0, String var1, boolean var2) {
      File var3 = new File(class155.field1985, "preferences" + var0 + ".dat");
      if(var3.exists()) {
         try {
            class110 var10 = new class110(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
            ;
         }
      }

      String var4 = "";
      if(class313.field3765 == 33) {
         var4 = "_rc";
      } else if(class313.field3765 == 34) {
         var4 = "_wip";
      }

      File var5 = new File(class129.field1822, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      class110 var6;
      if(!var2 && var5.exists()) {
         try {
            var6 = new class110(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
            ;
         }
      }

      try {
         var6 = new class110(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(Lck;I)V",
      garbageValue = "-1809802284"
   )
   public static final void method4598(class89 var0) {
      class95.field1339 = var0;
   }
}
