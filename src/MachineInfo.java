import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("MachineInfo")
public class MachineInfo extends Node {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -96417789
   )
   @Export("osType")
   int osType;
   @ObfuscatedName("h")
   @Export("os64Bit")
   boolean os64Bit;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 757115043
   )
   @Export("osVersionType")
   int osVersionType;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1652212793
   )
   @Export("javaVendorType")
   int javaVendorType;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1684516789
   )
   @Export("javaVersionMajor")
   int javaVersionMajor;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -542541621
   )
   @Export("javaVersionMinor")
   int javaVersionMinor;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1887948635
   )
   @Export("javaVersionPatch")
   int javaVersionPatch;
   @ObfuscatedName("az")
   boolean field3907;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -2029600745
   )
   @Export("maxMemoryMB")
   int maxMemoryMB;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -965431907
   )
   int field3909;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1937724701
   )
   int field3912;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 654100689
   )
   int field3911;
   @ObfuscatedName("ae")
   String field3893;
   @ObfuscatedName("au")
   String field3913;
   @ObfuscatedName("av")
   String field3901;
   @ObfuscatedName("ab")
   String field3898;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1507502761
   )
   int field3916;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1483977003
   )
   int field3917;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -864806749
   )
   int field3914;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1257191209
   )
   int field3921;
   @ObfuscatedName("ak")
   String field3920;
   @ObfuscatedName("bc")
   String field3905;
   @ObfuscatedName("bo")
   int[] field3922;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 971815395
   )
   int field3923;

   @ObfuscatedSignature(
      signature = "(Z)V",
      garbageValue = "1"
   )
   public MachineInfo(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "85"
   )
   void method6254() {
      if (this.field3893.length() > 40) {
         this.field3893 = this.field3893.substring(0, 40);
      }

      if (this.field3913.length() > 40) {
         this.field3913 = this.field3913.substring(0, 40);
      }

      if (this.field3901.length() > 10) {
         this.field3901 = this.field3901.substring(0, 10);
      }

      if (this.field3898.length() > 10) {
         this.field3898 = this.field3898.substring(0, 10);
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgy;I)V",
      garbageValue = "1370448806"
   )
   public void method6249(Buffer var1) {
      var1.putByte(6);
      var1.putByte(this.osType);
      var1.putByte(this.os64Bit ? 1 : 0);
      var1.putByte(this.osVersionType);
      var1.putByte(this.javaVendorType);
      var1.putByte(this.javaVersionMajor);
      var1.putByte(this.javaVersionMinor);
      var1.putByte(this.javaVersionPatch);
      var1.putByte(this.field3907 ? 1 : 0);
      var1.putShort(this.maxMemoryMB);
      var1.putByte(this.field3909);
      var1.put24bitInt(this.field3912);
      var1.putShort(this.field3911);
      var1.putJagString(this.field3893);
      var1.putJagString(this.field3913);
      var1.putJagString(this.field3901);
      var1.putJagString(this.field3898);
      var1.putByte(this.field3917);
      var1.putShort(this.field3916);
      var1.putJagString(this.field3920);
      var1.putJagString(this.field3905);
      var1.putByte(this.field3914);
      var1.putByte(this.field3921);

      for(int var2 = 0; var2 < this.field3922.length; ++var2) {
         var1.putInt(this.field3922[var2]);
      }

      var1.putInt(this.field3923);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1466485596"
   )
   public int method6250() {
      byte var1 = 38;
      String var2 = this.field3893;
      int var3 = var2.length() + 2;
      int var4 = var3 + var1;
      String var5 = this.field3913;
      int var6 = var5.length() + 2;
      var4 += var6;
      String var7 = this.field3901;
      int var8 = var7.length() + 2;
      var4 += var8;
      String var9 = this.field3898;
      int var10 = var9.length() + 2;
      var4 += var10;
      String var11 = this.field3920;
      int var12 = var11.length() + 2;
      var4 += var12;
      String var13 = this.field3905;
      int var14 = var13.length() + 2;
      var4 += var14;
      return var4;
   }
}
