import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ha")
public class class225 {

   @ObfuscatedName("w")
   static int[] field2579 = new int[32];
   @ObfuscatedName("m")
   public static int[] field2576;
   @ObfuscatedName("q")
   public static int[] field2578;


   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2579[var1] = var0 - 1;
         var0 += var0;
      }

      field2576 = new int[2000];
      field2578 = new int[2000];
   }
}
