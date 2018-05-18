import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class256 extends class206 {

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3278;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgj;"
   )
   static class200 field3279 = new class200(64);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Liv;"
   )
   public static class247 field3281;
   @ObfuscatedName("q")
   public boolean field3280 = false;


   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "-1447705062"
   )
   void method4845(class182 var1) {
      while(true) {
         int var2 = var1.method3742();
         if(var2 == 0) {
            return;
         }

         this.method4853(var1, var2);
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lgy;II)V",
      garbageValue = "-1616931457"
   )
   void method4853(class182 var1, int var2) {
      if(var2 == 2) {
         this.field3280 = true;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "([BI)Llc;",
      garbageValue = "-2141699729"
   )
   public static final class318 method4854(byte[] var0) {
      BufferedImage var1 = null;

      try {
         var1 = ImageIO.read(new ByteArrayInputStream(var0));
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         int[] var4 = new int[var2 * var3];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
         var5.grabPixels();
         return new class318(var4, var2, var3);
      } catch (IOException var7) {
         ;
      } catch (InterruptedException var8) {
         ;
      }

      return new class318(0, 0);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;I)V",
      garbageValue = "-599305319"
   )
   public static void method4852(class247 var0) {
      class264.field3346 = var0;
   }
}
