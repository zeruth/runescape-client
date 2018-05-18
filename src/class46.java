import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public final class class46 extends class315 {

   @ObfuscatedName("w")
   Component field379;
   @ObfuscatedName("m")
   Image field378;


   class46(int var1, int var2, Component var3) {
      super.field3774 = var1;
      super.field3775 = var2;
      super.field3773 = new int[var2 * var1 + 1];
      DataBufferInt var4 = new DataBufferInt(super.field3773, super.field3773.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, '\uff00', 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.field3774, super.field3775), var4, (Point)null);
      this.field378 = new BufferedImage(var5, var6, false, new Hashtable());
      this.method832(var3);
      this.method5852();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "-2019994969"
   )
   final void method832(Component var1) {
      this.field379 = var1;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "31"
   )
   public final void vmethod5851(int var1, int var2) {
      this.method824(this.field379.getGraphics(), var1, var2);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "1328513548"
   )
   public final void vmethod5854(int var1, int var2, int var3, int var4) {
      this.method821(this.field379.getGraphics(), var1, var2, var3, var4);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;IIB)V",
      garbageValue = "1"
   )
   final void method824(Graphics var1, int var2, int var3) {
      try {
         var1.drawImage(this.field378, var2, var3, this.field379);
      } catch (Exception var5) {
         this.field379.repaint();
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;IIIII)V",
      garbageValue = "199706844"
   )
   final void method821(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.field378, 0, 0, this.field379);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.field379.repaint();
      }

   }
}
