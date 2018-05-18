import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("go")
public class class185 {

   @ObfuscatedName("x")
   public static short[][] field2390;
   @ObfuscatedName("a")
   static final int[] field2387 = new int[2048];
   @ObfuscatedName("l")
   static final int[] field2388 = new int[2048];


   static {
      double var0 = 0.0030679615757712823D;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field2387[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
         field2388[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
      }

   }
}
