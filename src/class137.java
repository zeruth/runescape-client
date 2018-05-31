import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class137 implements Comparator {
   @ObfuscatedName("ru")
   static short[] field1889;
   @ObfuscatedName("jz")
   @ObfuscatedGetter(
      intValue = 377740755
   )
   static int field1888;
   @ObfuscatedName("w")
   final boolean field1887;

   public class137(boolean var1) {
      this.field1887 = var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Lkd;Lkd;I)I",
      garbageValue = "1479821814"
   )
   int method3146(ChatPlayer var1, ChatPlayer var2) {
      return this.field1887 ? var1.field3649 - var2.field3649 : var2.field3649 - var1.field3649;
   }

   public int compare(Object var1, Object var2) {
      return this.method3146((ChatPlayer)var1, (ChatPlayer)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2074570907"
   )
   public static boolean method3141() {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(II)Ljh;",
      garbageValue = "-335324697"
   )
   @Export("getAnimation")
   public static Sequence getAnimation(int var0) {
      Sequence var1 = (Sequence)Sequence.sequences.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Sequence.seq_ref.getConfigData(12, var0);
         var1 = new Sequence();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.post();
         Sequence.sequences.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)[Lip;",
      garbageValue = "1594770687"
   )
   public static BuildType[] method3149() {
      return new BuildType[]{BuildType.BUILD_LIVE, BuildType.LIVE, BuildType.RC, BuildType.WIP};
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "435577119"
   )
   static void method3148(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var1 != null) {
         var1.unlink();
      }

   }
}
