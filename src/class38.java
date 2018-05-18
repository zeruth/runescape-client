import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public final class class38 implements class156, MouseWheelListener {

   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 560801541
   )
   int field330 = 0;


   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "-1980401570"
   )
   void method723(Component var1) {
      var1.addMouseWheelListener(this);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "-317870921"
   )
   void method722(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "855519944"
   )
   public synchronized int vmethod3281() {
      int var1 = this.field330;
      this.field330 = 0;
      return var1;
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.field330 += var1.getWheelRotation();
   }
}
