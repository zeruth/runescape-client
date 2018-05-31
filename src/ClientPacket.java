import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
@Implements("ClientPacket")
public class ClientPacket implements class167 {
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2257 = new ClientPacket(0, 7);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2203 = new ClientPacket(1, 3);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2160 = new ClientPacket(2, 3);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2161 = new ClientPacket(3, 9);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2162 = new ClientPacket(4, 4);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2163 = new ClientPacket(5, -1);
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2164 = new ClientPacket(6, 3);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2165 = new ClientPacket(7, 4);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2206 = new ClientPacket(8, 5);
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2169 = new ClientPacket(9, 10);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2182 = new ClientPacket(10, -1);
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2213 = new ClientPacket(11, 3);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2238 = new ClientPacket(12, 8);
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2171 = new ClientPacket(13, 8);
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2172 = new ClientPacket(14, 8);
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2216 = new ClientPacket(15, 3);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2174 = new ClientPacket(16, 8);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2175 = new ClientPacket(17, 7);
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2226 = new ClientPacket(18, 8);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2177 = new ClientPacket(19, 8);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2178 = new ClientPacket(20, 8);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2211 = new ClientPacket(21, 7);
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2180 = new ClientPacket(22, 3);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2181 = new ClientPacket(23, 11);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2218 = new ClientPacket(24, 3);
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2183 = new ClientPacket(25, 0);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2225 = new ClientPacket(26, 6);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2173 = new ClientPacket(27, 7);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2249 = new ClientPacket(28, -1);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2187 = new ClientPacket(29, 8);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2188 = new ClientPacket(30, 7);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2189 = new ClientPacket(31, 3);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2168 = new ClientPacket(32, 7);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2191 = new ClientPacket(33, 7);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2192 = new ClientPacket(34, 3);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2193 = new ClientPacket(35, 6);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2196 = new ClientPacket(36, 8);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2195 = new ClientPacket(37, 7);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2159 = new ClientPacket(38, 0);
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2197 = new ClientPacket(39, -2);
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2170 = new ClientPacket(40, 7);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2240 = new ClientPacket(41, 0);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2200 = new ClientPacket(42, 2);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2201 = new ClientPacket(43, -1);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2202 = new ClientPacket(44, 15);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2176 = new ClientPacket(45, -1);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2204 = new ClientPacket(46, 14);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2210 = new ClientPacket(47, -1);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2186 = new ClientPacket(48, 0);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2207 = new ClientPacket(49, -1);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2208 = new ClientPacket(50, -2);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2230 = new ClientPacket(51, 8);
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2184 = new ClientPacket(52, 8);
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2215 = new ClientPacket(53, 8);
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2185 = new ClientPacket(54, 3);
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2205 = new ClientPacket(55, -2);
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2214 = new ClientPacket(56, -1);
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2236 = new ClientPacket(57, 2);
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2239 = new ClientPacket(58, -1);
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2158 = new ClientPacket(59, 8);
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2224 = new ClientPacket(60, 8);
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2219 = new ClientPacket(61, 3);
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2220 = new ClientPacket(62, 8);
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2221 = new ClientPacket(63, 8);
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2222 = new ClientPacket(64, 13);
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2223 = new ClientPacket(65, 11);
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2167 = new ClientPacket(66, 4);
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2198 = new ClientPacket(67, 8);
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2194 = new ClientPacket(68, 16);
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2227 = new ClientPacket(69, 16);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2228 = new ClientPacket(70, 4);
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2229 = new ClientPacket(71, 8);
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2245 = new ClientPacket(72, 8);
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2231 = new ClientPacket(73, 4);
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2232 = new ClientPacket(74, 7);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2233 = new ClientPacket(75, 3);
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2234 = new ClientPacket(76, 9);
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2235 = new ClientPacket(77, 3);
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2190 = new ClientPacket(78, -1);
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2237 = new ClientPacket(79, -1);
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2199 = new ClientPacket(80, 8);
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2179 = new ClientPacket(81, 3);
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2212 = new ClientPacket(82, 9);
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2241 = new ClientPacket(83, 2);
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2242 = new ClientPacket(84, 15);
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2243 = new ClientPacket(85, -1);
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2244 = new ClientPacket(86, 9);
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2217 = new ClientPacket(87, 0);
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2246 = new ClientPacket(88, 1);
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2247 = new ClientPacket(89, 13);
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2248 = new ClientPacket(90, -1);
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2209 = new ClientPacket(91, 16);
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2250 = new ClientPacket(92, -1);
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2251 = new ClientPacket(93, -1);
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2252 = new ClientPacket(94, 2);
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2253 = new ClientPacket(95, -1);
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2254 = new ClientPacket(96, 13);
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      signature = "Lfy;"
   )
   public static final ClientPacket field2255 = new ClientPacket(97, -1);
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = 839540515
   )
   @Export("packetId")
   final int packetId;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = 346528363
   )
   @Export("packetLength")
   final int packetLength;

   ClientPacket(int var1, int var2) {
      this.packetId = var1;
      this.packetLength = var2;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "31"
   )
   static void method3462() {
      for(class68 var0 = (class68)class68.field1002.getFront(); var0 != null; var0 = (class68)class68.field1002.getNext()) {
         if (var0.field999 != null) {
            var0.method1730();
         }
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "81953750"
   )
   static void method3460() {
      Iterator var0 = class83.messages.iterator();

      while(var0.hasNext()) {
         MessageNode var1 = (MessageNode)var0.next();
         var1.method1098();
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(ILiv;IIIZI)V",
      garbageValue = "-1289593441"
   )
   public static void method3459(int var0, IndexDataBase var1, int var2, int var3, int var4, boolean var5) {
      class217.field2486 = 1;
      class26.field236 = var1;
      WorldMapDecoration.field167 = var2;
      class217.field2487 = var3;
      class21.field185 = var4;
      class178.field2317 = var5;
      class308.field3746 = var0;
   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      signature = "(IIB)Lfu;",
      garbageValue = "0"
   )
   static class166 method3461(int var0, int var1) {
      Client.field862.field2066 = var0;
      Client.field862.field2067 = var1;
      Client.field862.field2070 = 1;
      Client.field862.field2069 = 1;
      return Client.field862;
   }
}
