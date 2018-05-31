import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Hook;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements class288 {
   @ObfuscatedName("nd")
   @ObfuscatedGetter(
      intValue = 1138307549
   )
   static int field794;
   @ObfuscatedName("nc")
   @ObfuscatedGetter(
      intValue = 407114703
   )
   @Export("widgetCount")
   static int widgetCount;
   @ObfuscatedName("nb")
   @ObfuscatedGetter(
      longValue = -3613177442534620995L
   )
   static long field803;
   @ObfuscatedName("ng")
   static boolean[] field795;
   @ObfuscatedName("no")
   static boolean[] field796;
   @ObfuscatedName("lo")
   static boolean field860;
   @ObfuscatedName("nt")
   static boolean[] field797;
   @ObfuscatedName("lx")
   static boolean field594;
   @ObfuscatedName("mh")
   @ObfuscatedGetter(
      intValue = 1972730241
   )
   @Export("cycleCntr")
   static int cycleCntr;
   @ObfuscatedName("nh")
   @Export("isResized")
   static boolean isResized;
   @ObfuscatedName("rq")
   @ObfuscatedGetter(
      intValue = -2002454031
   )
   public static int field859;
   @ObfuscatedName("mp")
   @ObfuscatedGetter(
      intValue = 262646585
   )
   static int field742;
   @ObfuscatedName("le")
   @ObfuscatedGetter(
      intValue = -1540398517
   )
   static int field685;
   @ObfuscatedName("ob")
   static boolean field825;
   @ObfuscatedName("lv")
   @ObfuscatedGetter(
      intValue = 1707398523
   )
   static int field766;
   @ObfuscatedName("ln")
   @ObfuscatedGetter(
      intValue = -1507973779
   )
   static int field769;
   @ObfuscatedName("li")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static Widget field639;
   @ObfuscatedName("mg")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   @Export("widgetFlags")
   static HashTable widgetFlags;
   @ObfuscatedName("ls")
   @ObfuscatedGetter(
      intValue = -1824637655
   )
   static int field770;
   @ObfuscatedName("nu")
   @ObfuscatedGetter(
      intValue = -1600961027
   )
   @Export("gameDrawingMode")
   static int gameDrawingMode;
   @ObfuscatedName("nk")
   @Export("widgetBoundsWidth")
   static int[] widgetBoundsWidth;
   @ObfuscatedName("ny")
   @Export("widgetPositionX")
   static int[] widgetPositionX;
   @ObfuscatedName("nj")
   @Export("widgetPositionY")
   static int[] widgetPositionY;
   @ObfuscatedName("ni")
   @Export("widgetBoundsHeight")
   static int[] widgetBoundsHeight;
   @ObfuscatedName("lu")
   @ObfuscatedGetter(
      intValue = 643992545
   )
   static int field772;
   @ObfuscatedName("rh")
   @ObfuscatedSignature(
      signature = "Lbp;"
   )
   static final class59 field862;
   @ObfuscatedName("lf")
   @ObfuscatedGetter(
      intValue = -2077809937
   )
   static int field773;
   @ObfuscatedName("mv")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   static Deque field755;
   @ObfuscatedName("of")
   @ObfuscatedGetter(
      intValue = 984149875
   )
   @Export("destinationX")
   static int destinationX;
   @ObfuscatedName("ok")
   @ObfuscatedGetter(
      intValue = -435908989
   )
   @Export("destinationY")
   static int destinationY;
   @ObfuscatedName("pe")
   @ObfuscatedGetter(
      intValue = -959354801
   )
   static int field827;
   @ObfuscatedName("oj")
   @ObfuscatedGetter(
      intValue = -325961783
   )
   static int field824;
   @ObfuscatedName("ld")
   @Export("draggingWidget")
   static boolean draggingWidget;
   @ObfuscatedName("rw")
   static int[] field680;
   @ObfuscatedName("rr")
   static int[] field864;
   @ObfuscatedName("mr")
   @ObfuscatedGetter(
      intValue = 1982191767
   )
   static int field787;
   @ObfuscatedName("mx")
   @ObfuscatedGetter(
      intValue = -515631991
   )
   @Export("mouseWheelRotation")
   static int mouseWheelRotation;
   @ObfuscatedName("qf")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   static PlayerComposition field853;
   @ObfuscatedName("on")
   @ObfuscatedGetter(
      intValue = -203632127
   )
   static int field815;
   @ObfuscatedName("qc")
   @ObfuscatedGetter(
      intValue = -339483745
   )
   static int field783;
   @ObfuscatedName("po")
   @ObfuscatedGetter(
      intValue = 677998663
   )
   @Export("queuedSoundEffectCount")
   static int queuedSoundEffectCount;
   @ObfuscatedName("ot")
   @ObfuscatedGetter(
      longValue = 946796608594445303L
   )
   static long field782;
   @ObfuscatedName("pg")
   @Export("unknownSoundValues2")
   static int[] unknownSoundValues2;
   @ObfuscatedName("lm")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   @Export("draggedOnWidget")
   static Widget draggedOnWidget;
   @ObfuscatedName("qz")
   @ObfuscatedGetter(
      intValue = -886071063
   )
   static int field854;
   @ObfuscatedName("oi")
   @ObfuscatedGetter(
      intValue = 295871775
   )
   static int field693;
   @ObfuscatedName("px")
   @Export("queuedSoundEffectIDs")
   static int[] queuedSoundEffectIDs;
   @ObfuscatedName("ps")
   @ObfuscatedSignature(
      signature = "[Lcm;"
   )
   @Export("audioEffects")
   static SoundEffect[] audioEffects;
   @ObfuscatedName("pc")
   @Export("unknownSoundValues1")
   static int[] unknownSoundValues1;
   @ObfuscatedName("rm")
   static ArrayList field786;
   @ObfuscatedName("pj")
   @Export("soundLocations")
   static int[] soundLocations;
   @ObfuscatedName("ri")
   @ObfuscatedGetter(
      intValue = 1969421345
   )
   static int field861;
   @ObfuscatedName("pb")
   @ObfuscatedGetter(
      intValue = -40748619
   )
   static int field768;
   @ObfuscatedName("og")
   @ObfuscatedGetter(
      intValue = -965218169
   )
   static int field651;
   @ObfuscatedName("oq")
   @ObfuscatedGetter(
      intValue = 1511918615
   )
   static int field822;
   @ObfuscatedName("pu")
   static boolean field746;
   @ObfuscatedName("ou")
   @ObfuscatedSignature(
      signature = "[Llc;"
   )
   @Export("mapIcons")
   static SpritePixels[] mapIcons;
   @ObfuscatedName("pm")
   static boolean[] field835;
   @ObfuscatedName("ow")
   @ObfuscatedGetter(
      intValue = 1793551831
   )
   static int field845;
   @ObfuscatedName("ol")
   static int[] field817;
   @ObfuscatedName("ox")
   static int[] field818;
   @ObfuscatedName("ne")
   static long[] field809;
   @ObfuscatedName("mu")
   @Export("pendingVarbitChanges")
   static int[] pendingVarbitChanges;
   @ObfuscatedName("md")
   @ObfuscatedGetter(
      intValue = -1145521621
   )
   @Export("pendingVarbitCount")
   static int pendingVarbitCount;
   @ObfuscatedName("mj")
   @Export("changedSkills")
   static int[] changedSkills;
   @ObfuscatedName("mb")
   @ObfuscatedGetter(
      intValue = -803677707
   )
   @Export("changedSkillsCount")
   static int changedSkillsCount;
   @ObfuscatedName("qk")
   @ObfuscatedSignature(
      signature = "[Lf;"
   )
   @Export("grandExchangeOffers")
   static GrandExchangeOffer[] grandExchangeOffers;
   @ObfuscatedName("op")
   static int[] field865;
   @ObfuscatedName("oa")
   static int[] field812;
   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   static Deque field790;
   @ObfuscatedName("mn")
   @ObfuscatedGetter(
      intValue = 1313846965
   )
   static int field785;
   @ObfuscatedName("mo")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   static Deque field791;
   @ObfuscatedName("qx")
   static short field745;
   @ObfuscatedName("qo")
   static short field841;
   @ObfuscatedName("qs")
   static short field707;
   @ObfuscatedName("oh")
   @ObfuscatedGetter(
      intValue = -1739119885
   )
   static int field830;
   @ObfuscatedName("qu")
   static short field847;
   @ObfuscatedName("qh")
   static short field863;
   @ObfuscatedName("qn")
   static short field842;
   @ObfuscatedName("qg")
   static short field615;
   @ObfuscatedName("qw")
   static short field844;
   @ObfuscatedName("qm")
   @ObfuscatedGetter(
      intValue = -1908896211
   )
   @Export("scale")
   static int scale;
   @ObfuscatedName("qy")
   @ObfuscatedGetter(
      intValue = 497477697
   )
   @Export("viewportWidth")
   static int viewportWidth;
   @ObfuscatedName("qj")
   @ObfuscatedGetter(
      intValue = 2021298749
   )
   @Export("viewportHeight")
   static int viewportHeight;
   @ObfuscatedName("mw")
   @Export("interfaceItemTriggers")
   static int[] interfaceItemTriggers;
   @ObfuscatedName("mq")
   @ObfuscatedGetter(
      intValue = -323698453
   )
   static int field779;
   @ObfuscatedName("qd")
   static int[] field836;
   @ObfuscatedName("qe")
   static int[] field837;
   @ObfuscatedName("qt")
   @ObfuscatedGetter(
      intValue = 49894369
   )
   @Export("Viewport_xOffset")
   static int Viewport_xOffset;
   @ObfuscatedName("qb")
   static int[] field855;
   @ObfuscatedName("qa")
   @ObfuscatedGetter(
      intValue = -988965039
   )
   @Export("Viewport_yOffset")
   static int Viewport_yOffset;
   @ObfuscatedName("qq")
   static int[] field765;
   @ObfuscatedName("mc")
   @ObfuscatedGetter(
      intValue = 2107658287
   )
   static int field789;
   @ObfuscatedName("ml")
   @ObfuscatedGetter(
      intValue = -697326019
   )
   static int field784;
   @ObfuscatedName("qi")
   @ObfuscatedGetter(
      longValue = -3347505195473162029L
   )
   static long field629;
   @ObfuscatedName("mm")
   @ObfuscatedGetter(
      intValue = -1207459131
   )
   @Export("chatCycle")
   static int chatCycle;
   @ObfuscatedName("np")
   @ObfuscatedGetter(
      intValue = 1083573095
   )
   @Export("publicChatMode")
   static int publicChatMode;
   @ObfuscatedName("nf")
   @ObfuscatedGetter(
      intValue = -1430428523
   )
   static int field694;
   @ObfuscatedName("nr")
   static String field808;
   @ObfuscatedName("ro")
   @ObfuscatedSignature(
      signature = "Lby;"
   )
   static OwnWorldComparator field738;
   @ObfuscatedName("nx")
   static int[] field805;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lfm;"
   )
   @Export("collisionMaps")
   static CollisionData[] collisionMaps;
   @ObfuscatedName("ak")
   static boolean field780 = true;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -710150299
   )
   @Export("world")
   public static int world = 1;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -1608100377
   )
   @Export("flags")
   static int flags = 0;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -115045799
   )
   @Export("socketType")
   static int socketType = 0;
   @ObfuscatedName("bn")
   @Export("isMembers")
   public static boolean isMembers = false;
   @ObfuscatedName("bp")
   @Export("lowMemory")
   static boolean lowMemory = false;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 754340933
   )
   @Export("languageId")
   static int languageId = 0;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1885967903
   )
   static int field600 = -1;
   @ObfuscatedName("bb")
   static boolean field601 = false;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -484975941
   )
   @Export("gameState")
   static int gameState = 0;
   @ObfuscatedName("bm")
   static boolean field603 = true;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1918380857
   )
   @Export("gameCycle")
   static int gameCycle = 0;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      longValue = 3560253004301321173L
   )
   @Export("mouseLastLastPressedTimeMillis")
   static long mouseLastLastPressedTimeMillis = 1L;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 1779935029
   )
   static int field606 = -1;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -1359116679
   )
   static int field607 = -1;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -2132488129
   )
   static int field608 = -1;
   @ObfuscatedName("bh")
   static boolean field609 = true;
   @ObfuscatedName("bd")
   @Export("displayFps")
   static boolean displayFps = false;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 1327371833
   )
   static int field643 = 0;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 203988051
   )
   @Export("hintArrowTargetType")
   static int hintArrowTargetType = 0;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1508240615
   )
   @Export("hintArrowNpcTargetIdx")
   static int hintArrowNpcTargetIdx = 0;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = -399373815
   )
   @Export("hintArrowPlayerTargetIdx")
   static int hintArrowPlayerTargetIdx = 0;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = 1804776069
   )
   @Export("hintArrowX")
   static int hintArrowX = 0;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = 889927571
   )
   @Export("hintArrowY")
   static int hintArrowY = 0;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = 712082861
   )
   @Export("hintArrowOffsetZ")
   static int hintArrowOffsetZ = 0;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = 1269048349
   )
   @Export("hintArrowOffsetX")
   static int hintArrowOffsetX = 0;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = 953423233
   )
   @Export("hintArrowOffsetY")
   static int hintArrowOffsetY = 0;
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      signature = "Lbq;"
   )
   @Export("playerAttackOption")
   static AttackOption playerAttackOption;
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      signature = "Lbq;"
   )
   @Export("npcAttackOption")
   static AttackOption npcAttackOption;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = 243111015
   )
   @Export("loadingStage")
   static int loadingStage;
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "Lft;"
   )
   @Export("rssocket")
   static class157 rssocket;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = 2051008151
   )
   @Export("js5State")
   static int js5State;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = 104390289
   )
   static int field625;
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   @Export("indexSoundEffects")
   static IndexData indexSoundEffects;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = 1331640199
   )
   static int field595;
   @ObfuscatedName("do")
   @ObfuscatedGetter(
      intValue = 1491451481
   )
   @Export("loginState")
   static int loginState;
   @ObfuscatedName("de")
   @ObfuscatedGetter(
      intValue = -915676447
   )
   static int field645;
   @ObfuscatedName("dj")
   @ObfuscatedGetter(
      intValue = -1837898575
   )
   static int field630;
   @ObfuscatedName("ds")
   @ObfuscatedGetter(
      intValue = 821087251
   )
   static int field631;
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      signature = "Lei;"
   )
   static class146 field716;
   @ObfuscatedName("di")
   static byte[] field718;
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      signature = "[Lba;"
   )
   @Export("cachedNPCs")
   static NPC[] cachedNPCs;
   @ObfuscatedName("dq")
   @ObfuscatedGetter(
      intValue = 1773144939
   )
   @Export("npcIndexesCount")
   static int npcIndexesCount;
   @ObfuscatedName("dy")
   @Export("npcIndices")
   static int[] npcIndices;
   @ObfuscatedName("ec")
   @ObfuscatedGetter(
      intValue = -1982880171
   )
   @Export("pendingNpcFlagsCount")
   static int pendingNpcFlagsCount;
   @ObfuscatedName("ey")
   @Export("pendingNpcFlagsIndices")
   static int[] pendingNpcFlagsIndices;
   @ObfuscatedName("eg")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   public static final NetWriter field739;
   @ObfuscatedName("er")
   @ObfuscatedGetter(
      intValue = 2130447299
   )
   static int field688;
   @ObfuscatedName("ej")
   @Export("socketError")
   static boolean socketError;
   @ObfuscatedName("ek")
   static boolean field642;
   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      signature = "Ljg;"
   )
   static class280 field840;
   @ObfuscatedName("eq")
   @Export("fontsMap")
   static HashMap fontsMap;
   @ObfuscatedName("ez")
   @ObfuscatedGetter(
      intValue = 1228257375
   )
   static int field792;
   @ObfuscatedName("ed")
   @ObfuscatedGetter(
      intValue = -503470903
   )
   static int field697;
   @ObfuscatedName("ea")
   @ObfuscatedGetter(
      intValue = 2077564129
   )
   static int field647;
   @ObfuscatedName("ew")
   @ObfuscatedGetter(
      intValue = -1517576733
   )
   static int field648;
   @ObfuscatedName("fp")
   @ObfuscatedGetter(
      intValue = -1232805537
   )
   static int field649;
   @ObfuscatedName("fm")
   @Export("isDynamicRegion")
   static boolean isDynamicRegion;
   @ObfuscatedName("fs")
   @Export("instanceTemplateChunks")
   static int[][][] instanceTemplateChunks;
   @ObfuscatedName("fu")
   static final int[] field653;
   @ObfuscatedName("fy")
   @ObfuscatedGetter(
      intValue = -986662313
   )
   static int field654;
   @ObfuscatedName("fb")
   @ObfuscatedGetter(
      intValue = 320333465
   )
   static int field655;
   @ObfuscatedName("gy")
   @ObfuscatedGetter(
      intValue = -246881979
   )
   static int field656;
   @ObfuscatedName("gn")
   @ObfuscatedGetter(
      intValue = -1775701985
   )
   static int field731;
   @ObfuscatedName("gb")
   @ObfuscatedGetter(
      intValue = -1671328597
   )
   static int field658;
   @ObfuscatedName("go")
   static boolean field659;
   @ObfuscatedName("gi")
   @ObfuscatedGetter(
      intValue = -1614406899
   )
   static int field736;
   @ObfuscatedName("gm")
   @ObfuscatedGetter(
      intValue = -1719678355
   )
   @Export("cameraPitchTarget")
   static int cameraPitchTarget;
   @ObfuscatedName("gg")
   @ObfuscatedGetter(
      intValue = -1296134745
   )
   @Export("mapAngle")
   static int mapAngle;
   @ObfuscatedName("gf")
   @ObfuscatedGetter(
      intValue = 793553735
   )
   static int field663;
   @ObfuscatedName("gx")
   @ObfuscatedGetter(
      intValue = -965597961
   )
   static int field767;
   @ObfuscatedName("gw")
   @ObfuscatedGetter(
      intValue = -1124685859
   )
   static int field717;
   @ObfuscatedName("ga")
   @ObfuscatedGetter(
      intValue = -1416610753
   )
   static int field627;
   @ObfuscatedName("gj")
   @ObfuscatedGetter(
      intValue = 180462143
   )
   static int field678;
   @ObfuscatedName("gv")
   @ObfuscatedGetter(
      intValue = -1261710225
   )
   static int field668;
   @ObfuscatedName("gt")
   @ObfuscatedGetter(
      intValue = 1990466531
   )
   static int field857;
   @ObfuscatedName("gz")
   @ObfuscatedGetter(
      intValue = 1922379337
   )
   static int field602;
   @ObfuscatedName("gc")
   @ObfuscatedGetter(
      intValue = 402885239
   )
   static int field804;
   @ObfuscatedName("gr")
   @ObfuscatedGetter(
      intValue = 765440817
   )
   static int field671;
   @ObfuscatedName("hm")
   @ObfuscatedGetter(
      intValue = -1491520915
   )
   static int field672;
   @ObfuscatedName("hj")
   @ObfuscatedGetter(
      intValue = -742284777
   )
   static int field673;
   @ObfuscatedName("hp")
   @ObfuscatedGetter(
      intValue = -656834559
   )
   static int field674;
   @ObfuscatedName("hd")
   static boolean field622;
   @ObfuscatedName("hv")
   @ObfuscatedGetter(
      intValue = 669004171
   )
   static int field801;
   @ObfuscatedName("hx")
   static boolean field677;
   @ObfuscatedName("hq")
   @ObfuscatedGetter(
      intValue = 1641588965
   )
   static int field723;
   @ObfuscatedName("he")
   @ObfuscatedGetter(
      intValue = -1356328419
   )
   @Export("overheadTextCount")
   static int overheadTextCount;
   @ObfuscatedName("hn")
   @ObfuscatedGetter(
      intValue = -572241541
   )
   static int field634;
   @ObfuscatedName("ho")
   @Export("overheadTextsX")
   static int[] overheadTextsX;
   @ObfuscatedName("hy")
   @Export("overheadTextsY")
   static int[] overheadTextsY;
   @ObfuscatedName("hk")
   @Export("overheadTextsOffsetY")
   static int[] overheadTextsOffsetY;
   @ObfuscatedName("ht")
   @Export("overheadTextsOffsetX")
   static int[] overheadTextsOffsetX;
   @ObfuscatedName("hg")
   static int[] field811;
   @ObfuscatedName("hc")
   static int[] field686;
   @ObfuscatedName("hr")
   @Export("overheadTextsCyclesRemaining")
   static int[] overheadTextsCyclesRemaining;
   @ObfuscatedName("ha")
   @Export("overheadTexts")
   static String[] overheadTexts;
   @ObfuscatedName("hh")
   static int[][] field689;
   @ObfuscatedName("hu")
   @ObfuscatedGetter(
      intValue = -1565760405
   )
   static int field690;
   @ObfuscatedName("hs")
   @ObfuscatedGetter(
      intValue = -1677083163
   )
   @Export("screenX")
   static int screenX;
   @ObfuscatedName("hz")
   @ObfuscatedGetter(
      intValue = 1627957251
   )
   @Export("screenY")
   static int screenY;
   @ObfuscatedName("hl")
   @ObfuscatedGetter(
      intValue = -226851279
   )
   @Export("lastLeftClickX")
   static int lastLeftClickX;
   @ObfuscatedName("hb")
   @ObfuscatedGetter(
      intValue = 1284462679
   )
   @Export("lastLeftClickY")
   static int lastLeftClickY;
   @ObfuscatedName("hw")
   @ObfuscatedGetter(
      intValue = 1347177379
   )
   static int field843;
   @ObfuscatedName("hf")
   @ObfuscatedGetter(
      intValue = 671072709
   )
   @Export("cursorState")
   static int cursorState;
   @ObfuscatedName("ii")
   static boolean field664;
   @ObfuscatedName("im")
   @ObfuscatedGetter(
      intValue = -1396378137
   )
   @Export("mouseCrosshair")
   static int mouseCrosshair;
   @ObfuscatedName("ia")
   @ObfuscatedGetter(
      intValue = -1957595085
   )
   @Export("pressedItemIndex")
   static int pressedItemIndex;
   @ObfuscatedName("io")
   @ObfuscatedGetter(
      intValue = 647517325
   )
   static int field597;
   @ObfuscatedName("ib")
   @ObfuscatedGetter(
      intValue = -46582737
   )
   static int field701;
   @ObfuscatedName("ik")
   @ObfuscatedGetter(
      intValue = 1417109621
   )
   static int field640;
   @ObfuscatedName("ip")
   @ObfuscatedGetter(
      intValue = -244588269
   )
   static int field703;
   @ObfuscatedName("iu")
   static boolean field704;
   @ObfuscatedName("il")
   @ObfuscatedGetter(
      intValue = 1496315097
   )
   @Export("itemPressedDuration")
   static int itemPressedDuration;
   @ObfuscatedName("iv")
   @ObfuscatedGetter(
      intValue = 636102247
   )
   @Export("myPlayerIndex")
   static int myPlayerIndex;
   @ObfuscatedName("ic")
   static boolean field715;
   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      signature = "[Lbu;"
   )
   @Export("cachedPlayers")
   static Player[] cachedPlayers;
   @ObfuscatedName("it")
   @Export("lastSelectedItemName")
   static String lastSelectedItemName;
   @ObfuscatedName("iw")
   @ObfuscatedGetter(
      intValue = -1539952365
   )
   @Export("localInteractingIndex")
   static int localInteractingIndex;
   @ObfuscatedName("in")
   @ObfuscatedGetter(
      intValue = 965633939
   )
   static int field710;
   @ObfuscatedName("ie")
   static boolean field711;
   @ObfuscatedName("jx")
   @ObfuscatedGetter(
      intValue = -997447881
   )
   @Export("playerNameMask")
   static int playerNameMask;
   @ObfuscatedName("jb")
   @ObfuscatedGetter(
      intValue = 1728578221
   )
   static int field713;
   @ObfuscatedName("je")
   static int[] field714;
   @ObfuscatedName("jq")
   @Export("playerMenuTypes")
   static final int[] playerMenuTypes;
   @ObfuscatedName("jp")
   @Export("playerOptions")
   static String[] playerOptions;
   @ObfuscatedName("jm")
   @Export("playerOptionsPriorities")
   static boolean[] playerOptionsPriorities;
   @ObfuscatedName("ja")
   static int[] field665;
   @ObfuscatedName("jj")
   @ObfuscatedGetter(
      intValue = -1425437183
   )
   static int field719;
   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      signature = "[[[Lgz;"
   )
   @Export("groundItemDeque")
   static Deque[][][] groundItemDeque;
   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   @Export("pendingSpawns")
   static Deque pendingSpawns;
   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   @Export("projectiles")
   static Deque projectiles;
   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   @Export("graphicsObjectDeque")
   static Deque graphicsObjectDeque;
   @ObfuscatedName("jt")
   @Export("boostedSkillLevels")
   static int[] boostedSkillLevels;
   @ObfuscatedName("jo")
   @Export("realSkillLevels")
   static int[] realSkillLevels;
   @ObfuscatedName("jd")
   @Export("skillExperiences")
   static int[] skillExperiences;
   @ObfuscatedName("ji")
   @ObfuscatedGetter(
      intValue = -451068837
   )
   static int field727;
   @ObfuscatedName("jg")
   @Export("isMenuOpen")
   static boolean isMenuOpen;
   @ObfuscatedName("kj")
   @ObfuscatedGetter(
      intValue = -183492423
   )
   @Export("menuOptionCount")
   static int menuOptionCount;
   @ObfuscatedName("kd")
   @Export("menuActionParams0")
   static int[] menuActionParams0;
   @ObfuscatedName("ki")
   @Export("menuActionParams1")
   static int[] menuActionParams1;
   @ObfuscatedName("ke")
   @Export("menuTypes")
   static int[] menuTypes;
   @ObfuscatedName("kn")
   @Export("menuIdentifiers")
   static int[] menuIdentifiers;
   @ObfuscatedName("km")
   @Export("menuOptions")
   static String[] menuOptions;
   @ObfuscatedName("kf")
   @Export("menuTargets")
   static String[] menuTargets;
   @ObfuscatedName("kb")
   @Export("menuBooleanArray")
   static boolean[] menuBooleanArray;
   @ObfuscatedName("ks")
   static boolean field753;
   @ObfuscatedName("kl")
   static boolean field733;
   @ObfuscatedName("kg")
   static boolean field669;
   @ObfuscatedName("kr")
   static boolean field740;
   @ObfuscatedName("kp")
   @ObfuscatedGetter(
      intValue = -1178031123
   )
   static int field741;
   @ObfuscatedName("ku")
   @ObfuscatedGetter(
      intValue = -1506962549
   )
   static int field667;
   @ObfuscatedName("kq")
   @ObfuscatedGetter(
      intValue = -2006294019
   )
   static int field747;
   @ObfuscatedName("kx")
   @ObfuscatedGetter(
      intValue = -1041050541
   )
   static int field744;
   @ObfuscatedName("ko")
   @ObfuscatedGetter(
      intValue = 2138266691
   )
   @Export("itemSelectionState")
   static int itemSelectionState;
   @ObfuscatedName("kz")
   @Export("spellSelected")
   static boolean spellSelected;
   @ObfuscatedName("ka")
   @ObfuscatedGetter(
      intValue = -679563285
   )
   static int field748;
   @ObfuscatedName("kh")
   @ObfuscatedGetter(
      intValue = -1328628203
   )
   static int field749;
   @ObfuscatedName("lg")
   static String field750;
   @ObfuscatedName("lw")
   static String field751;
   @ObfuscatedName("lj")
   @ObfuscatedGetter(
      intValue = -707126749
   )
   @Export("widgetRoot")
   static int widgetRoot;
   @ObfuscatedName("ly")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   @Export("componentTable")
   static HashTable componentTable;
   @ObfuscatedName("lh")
   @ObfuscatedGetter(
      intValue = -1826783613
   )
   static int field754;
   @ObfuscatedName("lc")
   @ObfuscatedGetter(
      intValue = 1960487621
   )
   static int field814;
   @ObfuscatedName("lr")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static Widget field756;
   @ObfuscatedName("lq")
   @ObfuscatedGetter(
      intValue = 233674625
   )
   @Export("energy")
   static int energy;
   @ObfuscatedName("lz")
   @ObfuscatedGetter(
      intValue = -1417367467
   )
   @Export("weight")
   static int weight;
   @ObfuscatedName("la")
   @ObfuscatedGetter(
      intValue = 611657069
   )
   @Export("rights")
   static int rights;
   @ObfuscatedName("lb")
   @ObfuscatedGetter(
      intValue = 71333287
   )
   static int field760;
   @ObfuscatedName("ll")
   static boolean field761;
   @ObfuscatedName("lp")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static Widget field776;
   @ObfuscatedName("lk")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   @Export("draggedWidget")
   static Widget draggedWidget;

   static {
      playerAttackOption = AttackOption.AttackOption_hidden;
      npcAttackOption = AttackOption.AttackOption_hidden;
      loadingStage = 0;
      js5State = 0;
      field625 = 0;
      field595 = 0;
      loginState = 0;
      field645 = 0;
      field630 = 0;
      field631 = 0;
      field716 = class146.field1929;
      field718 = null;
      cachedNPCs = new NPC[10000];
      npcIndexesCount = 0;
      npcIndices = new int[10000];
      pendingNpcFlagsCount = 0;
      pendingNpcFlagsIndices = new int[250];
      field739 = new NetWriter();
      field688 = 0;
      socketError = false;
      field642 = true;
      field840 = new class280();
      fontsMap = new HashMap();
      field792 = 0;
      field697 = 1;
      field647 = 0;
      field648 = 1;
      field649 = 0;
      collisionMaps = new CollisionData[4];
      isDynamicRegion = false;
      instanceTemplateChunks = new int[4][13][13];
      field653 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field654 = 0;
      field655 = 2301979;
      field656 = 5063219;
      field731 = 3353893;
      field658 = 7759444;
      field659 = false;
      field736 = 0;
      cameraPitchTarget = 128;
      mapAngle = 0;
      field663 = 0;
      field767 = 0;
      field717 = 0;
      field627 = 0;
      field678 = 0;
      field668 = 50;
      field602 = 0;
      field804 = 0;
      field671 = 0;
      field672 = 12;
      field673 = 6;
      field674 = 0;
      field622 = false;
      field801 = 0;
      field677 = false;
      field723 = 0;
      overheadTextCount = 0;
      field634 = 50;
      overheadTextsX = new int[field634];
      overheadTextsY = new int[field634];
      overheadTextsOffsetY = new int[field634];
      overheadTextsOffsetX = new int[field634];
      field811 = new int[field634];
      field686 = new int[field634];
      overheadTextsCyclesRemaining = new int[field634];
      overheadTexts = new String[field634];
      field689 = new int[104][104];
      field690 = 0;
      screenX = -1;
      screenY = -1;
      lastLeftClickX = 0;
      lastLeftClickY = 0;
      field843 = 0;
      cursorState = 0;
      field664 = true;
      mouseCrosshair = 0;
      pressedItemIndex = 0;
      field597 = 0;
      field701 = 0;
      field640 = 0;
      field703 = 0;
      field704 = false;
      itemPressedDuration = 0;
      myPlayerIndex = 0;
      field715 = true;
      cachedPlayers = new Player[2048];
      localInteractingIndex = -1;
      field710 = 0;
      field711 = true;
      playerNameMask = 0;
      field713 = 0;
      field714 = new int[1000];
      playerMenuTypes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      playerOptions = new String[8];
      playerOptionsPriorities = new boolean[8];
      field665 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field719 = -1;
      groundItemDeque = new Deque[4][104][104];
      pendingSpawns = new Deque();
      projectiles = new Deque();
      graphicsObjectDeque = new Deque();
      boostedSkillLevels = new int[25];
      realSkillLevels = new int[25];
      skillExperiences = new int[25];
      field727 = 0;
      isMenuOpen = false;
      menuOptionCount = 0;
      menuActionParams0 = new int[500];
      menuActionParams1 = new int[500];
      menuTypes = new int[500];
      menuIdentifiers = new int[500];
      menuOptions = new String[500];
      menuTargets = new String[500];
      menuBooleanArray = new boolean[500];
      field753 = false;
      field733 = false;
      field669 = false;
      field740 = true;
      field741 = -1;
      field667 = -1;
      field747 = 0;
      field744 = 50;
      itemSelectionState = 0;
      lastSelectedItemName = null;
      spellSelected = false;
      field748 = -1;
      field749 = -1;
      field750 = null;
      field751 = null;
      widgetRoot = -1;
      componentTable = new HashTable(8);
      field754 = 0;
      field814 = 0;
      field756 = null;
      energy = 0;
      weight = 0;
      rights = 0;
      field760 = -1;
      field761 = false;
      field776 = null;
      draggedWidget = null;
      field639 = null;
      field685 = 0;
      field766 = 0;
      draggedOnWidget = null;
      field594 = false;
      field769 = -1;
      field770 = -1;
      field860 = false;
      field772 = -1;
      field773 = -1;
      draggingWidget = false;
      cycleCntr = 1;
      pendingVarbitChanges = new int[32];
      pendingVarbitCount = 0;
      interfaceItemTriggers = new int[32];
      field779 = 0;
      changedSkills = new int[32];
      changedSkillsCount = 0;
      chatCycle = 0;
      field742 = 0;
      field784 = 0;
      field785 = 0;
      field789 = 0;
      field787 = 0;
      mouseWheelRotation = 0;
      field755 = new Deque();
      field790 = new Deque();
      field791 = new Deque();
      widgetFlags = new HashTable(512);
      widgetCount = 0;
      field794 = -2;
      field795 = new boolean[100];
      field796 = new boolean[100];
      field797 = new boolean[100];
      widgetPositionX = new int[100];
      widgetPositionY = new int[100];
      widgetBoundsWidth = new int[100];
      widgetBoundsHeight = new int[100];
      gameDrawingMode = 0;
      field803 = 0L;
      isResized = true;
      field805 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      publicChatMode = 0;
      field694 = 0;
      field808 = "";
      field809 = new long[100];
      field830 = 0;
      field845 = 0;
      field812 = new int[128];
      field865 = new int[128];
      field782 = -1L;
      field815 = -1;
      field651 = 0;
      field817 = new int[1000];
      field818 = new int[1000];
      mapIcons = new SpritePixels[1000];
      destinationX = 0;
      destinationY = 0;
      field822 = 0;
      field693 = 255;
      field824 = -1;
      field825 = false;
      field768 = 127;
      field827 = 127;
      queuedSoundEffectCount = 0;
      queuedSoundEffectIDs = new int[50];
      unknownSoundValues1 = new int[50];
      unknownSoundValues2 = new int[50];
      soundLocations = new int[50];
      audioEffects = new SoundEffect[50];
      field746 = false;
      field835 = new boolean[5];
      field836 = new int[5];
      field837 = new int[5];
      field855 = new int[5];
      field765 = new int[5];
      field745 = 256;
      field841 = 205;
      field842 = 256;
      field615 = 320;
      field844 = 1;
      field863 = 32767;
      field707 = 1;
      field847 = 32767;
      Viewport_xOffset = 0;
      Viewport_yOffset = 0;
      viewportWidth = 0;
      viewportHeight = 0;
      scale = 0;
      field853 = new PlayerComposition();
      field783 = -1;
      field854 = -1;
      grandExchangeOffers = new GrandExchangeOffer[8];
      field738 = new OwnWorldComparator();
      field859 = -1;
      field786 = new ArrayList(10);
      field861 = 0;
      field862 = new class59();
      field680 = new int[50];
      field864 = new int[50];
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   protected final void vmethod1203() {
      field803 = class166.method3456() + 500L;
      this.method1465();
      if (widgetRoot != -1) {
         this.method1210(true);
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-81564058"
   )
   @Export("setUp")
   protected final void setUp() {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1245920510"
   )
   @Export("packetHandler")
   protected final void packetHandler() {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-2135258546"
   )
   @Hook("clientMainLoop")
   @Export("methodDraw")
   protected final void methodDraw(boolean var1) {
      boolean var2 = WorldComparator.method0();
      if (var2 && field825 && GrandExchangeEvent.soundSystem0 != null) {
         GrandExchangeEvent.soundSystem0.tryFlush();
      }

      int var3;
      if ((gameState == 10 || gameState == 20 || gameState == 30) && field803 != 0L && class166.method3456() > field803) {
         var3 = isResized ? 2 : 1;
         field803 = 0L;
         if (var3 >= 2) {
            isResized = true;
         } else {
            isResized = false;
         }

         int var4 = isResized ? 2 : 1;
         if (var4 == 1) {
            class37.clientInstance.method896(765, 503);
         } else {
            class37.clientInstance.method896(7680, 2160);
         }

         if (gameState >= 25) {
            PacketNode var5 = DecorativeObject.method3115(ClientPacket.field2206, field739.field1250);
            PacketBuffer var6 = var5.packetBuffer;
            int var7 = isResized ? 2 : 1;
            var6.putByte(var7);
            var5.packetBuffer.putShort(class9.canvasWidth);
            var5.packetBuffer.putShort(class37.canvasHeight);
            field739.method2019(var5);
         }
      }

      if (var1) {
         for(var3 = 0; var3 < 100; ++var3) {
            field795[var3] = true;
         }
      }

      if (gameState == 0) {
         this.drawLoadingScreen(class78.loadingBarPercentage, class78.loadingText, var1);
      } else if (gameState == 5) {
         class32.drawLoginScreen(WidgetNode.fontBold12, LoginPacket.fontPlain11, ScriptEvent.font_p12full, var1);
      } else if (gameState != 10 && gameState != 11) {
         if (gameState == 20) {
            class32.drawLoginScreen(WidgetNode.fontBold12, LoginPacket.fontPlain11, ScriptEvent.font_p12full, var1);
         } else if (gameState == 25) {
            if (field649 == 1) {
               if (field792 > field697) {
                  field697 = field792;
               }

               var3 = (field697 * 50 - field792 * 50) / field697;
               class16.method187("Loading - please wait.<br> (" + var3 + "%" + ")", false);
            } else if (field649 == 2) {
               if (field647 > field648) {
                  field648 = field647;
               }

               var3 = (field648 * 50 - field647 * 50) / field648 + 50;
               class16.method187("Loading - please wait.<br> (" + var3 + "%" + ")", false);
            } else {
               class16.method187("Loading - please wait.", false);
            }
         } else if (gameState == 30) {
            this.method1268();
         } else if (gameState == 40) {
            class16.method187("Connection lost<br>Please wait - attempting to reestablish", false);
         } else if (gameState == 45) {
            class16.method187("Please wait...", false);
         }
      } else {
         class32.drawLoginScreen(WidgetNode.fontBold12, LoginPacket.fontPlain11, ScriptEvent.font_p12full, var1);
      }

      if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResized) {
         for(var3 = 0; var3 < widgetCount; ++var3) {
            if (field796[var3]) {
               class50.rasterProvider.draw(widgetPositionX[var3], widgetPositionY[var3], widgetBoundsWidth[var3], widgetBoundsHeight[var3]);
               field796[var3] = false;
            }
         }
      } else if (gameState > 0) {
         class50.rasterProvider.drawFull(0, 0);

         for(var3 = 0; var3 < widgetCount; ++var3) {
            field796[var3] = false;
         }
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "949470738"
   )
   protected final void vmethod1197() {
      if (Permission.varcs.changed()) {
         Permission.varcs.serialize();
      }

      if (VarCString.mouseRecorder != null) {
         VarCString.mouseRecorder.isRunning = false;
      }

      VarCString.mouseRecorder = null;
      field739.close();
      if (KeyFocusListener.keyboard != null) {
         KeyFocusListener var1 = KeyFocusListener.keyboard;
         KeyFocusListener var2 = KeyFocusListener.keyboard;
         synchronized(KeyFocusListener.keyboard) {
            KeyFocusListener.keyboard = null;
         }
      }

      if (MouseInput.mouse != null) {
         MouseInput var8 = MouseInput.mouse;
         MouseInput var10 = MouseInput.mouse;
         synchronized(MouseInput.mouse) {
            MouseInput.mouse = null;
         }
      }

      class173.mouseWheel = null;
      if (GrandExchangeEvent.soundSystem0 != null) {
         GrandExchangeEvent.soundSystem0.shutdown();
      }

      if (class191.soundSystem1 != null) {
         class191.soundSystem1.shutdown();
      }

      if (class250.NetCache_socket != null) {
         class250.NetCache_socket.vmethod3368();
      }

      Object var9 = IndexStoreActionHandler.IndexStoreActionHandler_lock;
      Object var11 = IndexStoreActionHandler.IndexStoreActionHandler_lock;
      synchronized(IndexStoreActionHandler.IndexStoreActionHandler_lock) {
         if (IndexStoreActionHandler.field3191 != 0) {
            IndexStoreActionHandler.field3191 = 1;

            try {
               IndexStoreActionHandler.IndexStoreActionHandler_lock.wait();
            } catch (InterruptedException var4) {
               ;
            }
         }
      }

      if (class59.urlRequester != null) {
         class59.urlRequester.close();
         class59.urlRequester = null;
      }

      class76.method1851();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1726845378"
   )
   protected final void vmethod1192() {
   }

   @Export("init")
   @ObfuscatedName("init")
   public final void init() {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1674862603"
   )
   @Export("processJS5Connection")
   void processJS5Connection() {
      if (gameState != 1000) {
         boolean var1 = class137.method3141();
         if (!var1) {
            this.method1199();
         }
      }

   }

   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "380536168"
   )
   void method1199() {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("fg")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1109811529"
   )
   @Export("error")
   void error(int var1) {
      Size.socket = null;
      rssocket = null;
      js5State = 0;
      if (Size.myWorldPort == ServerPacket.port1) {
         Size.myWorldPort = class13.port2;
      } else {
         Size.myWorldPort = ServerPacket.port1;
      }

      ++field595;
      if (field595 < 2 || var1 != 7 && var1 != 9) {
         if (field595 >= 2 && var1 == 6) {
            this.error("js5connect_outofdate");
            gameState = 1000;
         } else if (field595 >= 4) {
            if (gameState <= 5) {
               this.error("js5connect");
               gameState = 1000;
            } else {
               field625 = 3000;
            }
         }
      } else if (gameState <= 5) {
         this.error("js5connect_full");
         gameState = 1000;
      } else {
         field625 = 3000;
      }

   }

   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "991472139"
   )
   final void method1201() {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2042781731"
   )
   final void method1202() {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-48"
   )
   void method1465() {
      int var1 = class9.canvasWidth;
      int var2 = class37.canvasHeight;
      if (super.field393 < var1) {
         var1 = super.field393;
      }

      if (super.field415 < var2) {
         var2 = super.field415;
      }

      if (ScriptState.preferences != null) {
         try {
            Client var3 = class37.clientInstance;
            int var4 = isResized ? 2 : 1;
            Object[] var5 = new Object[]{var4};
            JSObject.getWindow(var3).call("resize", var5);
         } catch (Throwable var6) {
            ;
         }
      }

   }

   @ObfuscatedName("gh")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "251446403"
   )
   final void method1268() {
      if (widgetRoot != -1) {
         WorldMapType2.method498(widgetRoot);
      }

      int var1;
      for(var1 = 0; var1 < widgetCount; ++var1) {
         if (field795[var1]) {
            field796[var1] = true;
         }

         field797[var1] = field795[var1];
         field795[var1] = false;
      }

      field794 = gameCycle;
      field741 = -1;
      field667 = -1;
      FontName.field3688 = null;
      if (widgetRoot != -1) {
         widgetCount = 0;
         class218.method4359(widgetRoot, 0, 0, class9.canvasWidth, class37.canvasHeight, 0, 0, -1);
      }

      Rasterizer2D.noClip();
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if (!isMenuOpen) {
         if (field741 != -1) {
            Player.method1178(field741, field667);
         }
      } else {
         var1 = class35.menuX;
         var2 = class59.menuY;
         var3 = class139.field1897;
         var4 = class137.field1888;
         int var8 = 6116423;
         Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var8);
         Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
         Rasterizer2D.drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
         WidgetNode.fontBold12.method5541("Choose Option", var1 + 3, var2 + 14, var8, -1);
         var5 = MouseInput.mouseLastX;
         var6 = MouseInput.mouseLastY;

         int var9;
         int var10;
         for(var7 = 0; var7 < menuOptionCount; ++var7) {
            var9 = var2 + (menuOptionCount - 1 - var7) * 15 + 31;
            var10 = 16777215;
            if (var5 > var1 && var5 < var1 + var3 && var6 > var9 - 13 && var6 < var9 + 3) {
               var10 = 16776960;
            }

            WidgetNode.fontBold12.method5541(class234.method4595(var7), var1 + 3, var9, var10, 0);
         }

         var7 = class35.menuX;
         var9 = class59.menuY;
         var10 = class139.field1897;
         int var11 = class137.field1888;

         for(int var12 = 0; var12 < widgetCount; ++var12) {
            if (widgetPositionX[var12] + widgetBoundsWidth[var12] > var7 && widgetPositionX[var12] < var7 + var10 && widgetPositionY[var12] + widgetBoundsHeight[var12] > var9 && widgetPositionY[var12] < var9 + var11) {
               field796[var12] = true;
            }
         }
      }

      if (gameDrawingMode == 3) {
         for(var1 = 0; var1 < widgetCount; ++var1) {
            if (field797[var1]) {
               Rasterizer2D.fillRectangle(widgetPositionX[var1], widgetPositionY[var1], widgetBoundsWidth[var1], widgetBoundsHeight[var1], 16711935, 128);
            } else if (field796[var1]) {
               Rasterizer2D.fillRectangle(widgetPositionX[var1], widgetPositionY[var1], widgetBoundsWidth[var1], widgetBoundsHeight[var1], 16711680, 128);
            }
         }
      }

      var1 = class192.plane;
      var2 = MilliTimer.localPlayer.x;
      var3 = MilliTimer.localPlayer.y;
      var4 = field654;

      for(class68 var13 = (class68)class68.field1002.getFront(); var13 != null; var13 = (class68)class68.field1002.getNext()) {
         if (var13.field1004 != -1 || var13.field1008 != null) {
            var5 = 0;
            if (var2 > var13.field1001) {
               var5 += var2 - var13.field1001;
            } else if (var2 < var13.field1000) {
               var5 += var13.field1000 - var2;
            }

            if (var3 > var13.field1005) {
               var5 += var3 - var13.field1005;
            } else if (var3 < var13.field1007) {
               var5 += var13.field1007 - var3;
            }

            if (var5 - 64 <= var13.field1011 && field827 != 0 && var1 == var13.field998) {
               var5 -= 64;
               if (var5 < 0) {
                  var5 = 0;
               }

               var6 = (var13.field1011 - var5) * field827 / var13.field1011;
               Object var14;
               SoundEffect var15;
               RawAudioNode var16;
               class103 var17;
               if (var13.field1006 == null) {
                  if (var13.field1004 >= 0) {
                     var14 = null;
                     var15 = SoundEffect.getTrack(FileOnDisk.indexCache4, var13.field1004, 0);
                     if (var15 != null) {
                        var16 = var15.method2110().applyResampler(FileSystem.field3166);
                        var17 = class103.method2370(var16, 100, var6);
                        var17.method2318(-1);
                        class141.field1906.method2049(var17);
                        var13.field1006 = var17;
                     }
                  }
               } else {
                  var13.field1006.method2319(var6);
               }

               if (var13.field1010 == null) {
                  if (var13.field1008 != null && (var13.field1009 -= var4) <= 0) {
                     var7 = (int)(Math.random() * (double)var13.field1008.length);
                     var14 = null;
                     var15 = SoundEffect.getTrack(FileOnDisk.indexCache4, var13.field1008[var7], 0);
                     if (var15 != null) {
                        var16 = var15.method2110().applyResampler(FileSystem.field3166);
                        var17 = class103.method2370(var16, 100, var6);
                        var17.method2318(0);
                        class141.field1906.method2049(var17);
                        var13.field1010 = var17;
                        var13.field1009 = var13.field997 + (int)(Math.random() * (double)(var13.field1003 - var13.field997));
                     }
                  }
               } else {
                  var13.field1010.method2319(var6);
                  if (!var13.field1010.linked()) {
                     var13.field1010 = null;
                  }
               }
            } else {
               if (var13.field1006 != null) {
                  class141.field1906.method2050(var13.field1006);
                  var13.field1006 = null;
               }

               if (var13.field1010 != null) {
                  class141.field1906.method2050(var13.field1010);
                  var13.field1010 = null;
               }
            }
         }
      }

      field654 = 0;
   }

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      signature = "(Lcj;I)Z",
      garbageValue = "1530035667"
   )
   final boolean method1572(NetWriter param1) {
      // $FF: Couldn't be decompiled
   }

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "199992128"
   )
   final void method1207() {
      boolean var1 = false;

      int var2;
      int var3;
      while(!var1) {
         var1 = true;

         for(var2 = 0; var2 < menuOptionCount - 1; ++var2) {
            if (menuTypes[var2] < 1000 && menuTypes[var2 + 1] > 1000) {
               String var4 = menuTargets[var2];
               menuTargets[var2] = menuTargets[var2 + 1];
               menuTargets[var2 + 1] = var4;
               String var5 = menuOptions[var2];
               menuOptions[var2] = menuOptions[var2 + 1];
               menuOptions[var2 + 1] = var5;
               var3 = menuTypes[var2];
               menuTypes[var2] = menuTypes[var2 + 1];
               menuTypes[var2 + 1] = var3;
               var3 = menuActionParams0[var2];
               menuActionParams0[var2] = menuActionParams0[var2 + 1];
               menuActionParams0[var2 + 1] = var3;
               var3 = menuActionParams1[var2];
               menuActionParams1[var2] = menuActionParams1[var2 + 1];
               menuActionParams1[var2 + 1] = var3;
               var3 = menuIdentifiers[var2];
               menuIdentifiers[var2] = menuIdentifiers[var2 + 1];
               menuIdentifiers[var2 + 1] = var3;
               boolean var6 = menuBooleanArray[var2];
               menuBooleanArray[var2] = menuBooleanArray[var2 + 1];
               menuBooleanArray[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

      if (class49.field442 == null && draggedWidget == null) {
         int var7 = MouseInput.mouseLastButton;
         int var8;
         int var9;
         int var15;
         int var16;
         int var17;
         if (isMenuOpen) {
            int var19;
            if (var7 != 1 && (class8.middleMouseMovesCamera || var7 != 4)) {
               var2 = MouseInput.mouseLastX;
               var19 = MouseInput.mouseLastY;
               if (var2 < class35.menuX - 10 || var2 > class139.field1897 + class35.menuX + 10 || var19 < class59.menuY - 10 || var19 > class59.menuY + class137.field1888 + 10) {
                  isMenuOpen = false;
                  class34.method626(class35.menuX, class59.menuY, class139.field1897, class137.field1888);
               }
            }

            if (var7 == 1 || !class8.middleMouseMovesCamera && var7 == 4) {
               var2 = class35.menuX;
               var19 = class59.menuY;
               var9 = class139.field1897;
               var3 = MouseInput.mouseLastPressedX;
               var16 = MouseInput.mouseLastPressedY;
               var8 = -1;

               for(var17 = 0; var17 < menuOptionCount; ++var17) {
                  var15 = var19 + (menuOptionCount - 1 - var17) * 15 + 31;
                  if (var3 > var2 && var3 < var2 + var9 && var16 > var15 - 13 && var16 < var15 + 3) {
                     var8 = var17;
                  }
               }

               if (var8 != -1 && var8 >= 0) {
                  var17 = menuActionParams0[var8];
                  var15 = menuActionParams1[var8];
                  int var21 = menuTypes[var8];
                  int var12 = menuIdentifiers[var8];
                  String var13 = menuOptions[var8];
                  String var14 = menuTargets[var8];
                  FileOnDisk.menuAction(var17, var15, var21, var12, var13, var14, MouseInput.mouseLastPressedX, MouseInput.mouseLastPressedY);
               }

               isMenuOpen = false;
               class34.method626(class35.menuX, class59.menuY, class139.field1897, class137.field1888);
            }
         } else {
            var2 = menuOptionCount - 1;
            if ((var7 == 1 || !class8.middleMouseMovesCamera && var7 == 4) && var2 >= 0) {
               var9 = menuTypes[var2];
               if (var9 == 39 || var9 == 40 || var9 == 41 || var9 == 42 || var9 == 43 || var9 == 33 || var9 == 34 || var9 == 35 || var9 == 36 || var9 == 37 || var9 == 38 || var9 == 1005) {
                  label226: {
                     var3 = menuActionParams0[var2];
                     var16 = menuActionParams1[var2];
                     Widget var10 = OwnWorldComparator.getWidget(var16);
                     if (!Coordinates.method4482(AbstractSoundSystem.getWidgetClickMask(var10))) {
                        var15 = AbstractSoundSystem.getWidgetClickMask(var10);
                        boolean var11 = (var15 >> 29 & 1) != 0;
                        if (!var11) {
                           break label226;
                        }
                     }

                     if (class49.field442 != null && !field704 && menuOptionCount > 0 && !this.method1208()) {
                        var17 = field701;
                        var15 = field640;
                        WorldMapRegion.method455(class184.topContextMenuRow, var17, var15);
                        class184.topContextMenuRow = null;
                     }

                     field704 = false;
                     itemPressedDuration = 0;
                     if (class49.field442 != null) {
                        DState.method3548(class49.field442);
                     }

                     class49.field442 = OwnWorldComparator.getWidget(var16);
                     field597 = var3;
                     field701 = MouseInput.mouseLastPressedX;
                     field640 = MouseInput.mouseLastPressedY;
                     if (var2 >= 0) {
                        class184.topContextMenuRow = new ContextMenuRow();
                        class184.topContextMenuRow.param0 = menuActionParams0[var2];
                        class184.topContextMenuRow.param1 = menuActionParams1[var2];
                        class184.topContextMenuRow.type = menuTypes[var2];
                        class184.topContextMenuRow.identifier = menuIdentifiers[var2];
                        class184.topContextMenuRow.option = menuOptions[var2];
                     }

                     DState.method3548(class49.field442);
                     return;
                  }
               }
            }

            if ((var7 == 1 || !class8.middleMouseMovesCamera && var7 == 4) && this.method1208()) {
               var7 = 2;
            }

            if ((var7 == 1 || !class8.middleMouseMovesCamera && var7 == 4) && menuOptionCount > 0 && var2 >= 0) {
               var9 = menuActionParams0[var2];
               var3 = menuActionParams1[var2];
               var16 = menuTypes[var2];
               var8 = menuIdentifiers[var2];
               String var18 = menuOptions[var2];
               String var20 = menuTargets[var2];
               FileOnDisk.menuAction(var9, var3, var16, var8, var18, var20, MouseInput.mouseLastPressedX, MouseInput.mouseLastPressedY);
            }

            if (var7 == 2 && menuOptionCount > 0) {
               this.openMenu(MouseInput.mouseLastPressedX, MouseInput.mouseLastPressedY);
            }
         }

      }
   }

   @ObfuscatedName("hb")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "16776960"
   )
   final boolean method1208() {
      int var1 = menuOptionCount - 1;
      boolean var2 = field727 == 1 && menuOptionCount > 2;
      if (!var2) {
         boolean var3;
         if (var1 < 0) {
            var3 = false;
         } else {
            int var4 = menuTypes[var1];
            if (var4 >= 2000) {
               var4 -= 2000;
            }

            if (var4 == 1007) {
               var3 = true;
            } else {
               var3 = false;
            }
         }

         var2 = var3;
      }

      return var2 && !menuBooleanArray[var1];
   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-624694385"
   )
   @Export("openMenu")
   @Hook("menuOpened")
   final void openMenu(int var1, int var2) {
      class24.method463(var1, var2);
      ScriptEvent.region.method2938(class192.plane, var1, var2, false);
      isMenuOpen = true;
   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "-73"
   )
   final void method1210(boolean var1) {
      MapIcon.method515(widgetRoot, class9.canvasWidth, class37.canvasHeight, var1);
   }

   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      signature = "(Lhl;I)V",
      garbageValue = "-46250492"
   )
   @Export("widgetMethod0")
   void widgetMethod0(Widget var1) {
      Widget var2 = var1.parentId == -1 ? null : OwnWorldComparator.getWidget(var1.parentId);
      int var3;
      int var4;
      if (var2 == null) {
         var3 = class9.canvasWidth;
         var4 = class37.canvasHeight;
      } else {
         var3 = var2.width;
         var4 = var2.height;
      }

      class138.method3155(var1, var3, var4, false);
      class45.method820(var1, var3, var4);
   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   final void method1238() {
      DState.method3548(draggedWidget);
      ++DecorativeObject.field1860;
      if (field860 && field594) {
         int var1 = MouseInput.mouseLastX;
         int var2 = MouseInput.mouseLastY;
         var1 -= field685;
         var2 -= field766;
         if (var1 < field769) {
            var1 = field769;
         }

         if (var1 + draggedWidget.width > field769 + field639.width) {
            var1 = field769 + field639.width - draggedWidget.width;
         }

         if (var2 < field770) {
            var2 = field770;
         }

         if (var2 + draggedWidget.height > field770 + field639.height) {
            var2 = field770 + field639.height - draggedWidget.height;
         }

         int var3 = var1 - field772;
         int var4 = var2 - field773;
         int var5 = draggedWidget.dragDeadZone;
         if (DecorativeObject.field1860 > draggedWidget.dragDeadTime && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            draggingWidget = true;
         }

         int var6 = var1 - field769 + field639.scrollX;
         int var7 = var2 - field770 + field639.scrollY;
         ScriptEvent var8;
         if (draggedWidget.onDragListener != null && draggingWidget) {
            var8 = new ScriptEvent();
            var8.source = draggedWidget;
            var8.mouseX = var6;
            var8.mouseY = var7;
            var8.params = draggedWidget.onDragListener;
            FriendManager.method1728(var8);
         }

         if (MouseInput.mouseCurrentButton == 0) {
            int var10;
            if (draggingWidget) {
               if (draggedWidget.onDragCompleteListener != null) {
                  var8 = new ScriptEvent();
                  var8.source = draggedWidget;
                  var8.mouseX = var6;
                  var8.mouseY = var7;
                  var8.target = draggedOnWidget;
                  var8.params = draggedWidget.onDragCompleteListener;
                  FriendManager.method1728(var8);
               }

               if (draggedOnWidget != null) {
                  Widget var13 = draggedWidget;
                  var10 = PlayerComposition.method4514(AbstractSoundSystem.getWidgetClickMask(var13));
                  Widget var11;
                  if (var10 == 0) {
                     var11 = null;
                  } else {
                     label98: {
                        for(int var12 = 0; var12 < var10; ++var12) {
                           var13 = OwnWorldComparator.getWidget(var13.parentId);
                           if (var13 == null) {
                              var11 = null;
                              break label98;
                           }
                        }

                        var11 = var13;
                     }
                  }

                  if (var11 != null) {
                     PacketNode var14 = DecorativeObject.method3115(ClientPacket.field2227, field739.field1250);
                     var14.packetBuffer.method3707(draggedWidget.itemId);
                     var14.packetBuffer.method3605(draggedOnWidget.itemId);
                     var14.packetBuffer.method3641(draggedWidget.id);
                     var14.packetBuffer.method3670(draggedOnWidget.id);
                     var14.packetBuffer.putShort(draggedOnWidget.index);
                     var14.packetBuffer.method3725(draggedWidget.index);
                     field739.method2019(var14);
                  }
               }
            } else if (this.method1208()) {
               this.openMenu(field772 + field685, field766 + field773);
            } else if (menuOptionCount > 0) {
               int var9 = field685 + field772;
               var10 = field766 + field773;
               WorldMapRegion.method455(class184.topContextMenuRow, var9, var10);
               class184.topContextMenuRow = null;
            }

            draggedWidget = null;
         }
      } else if (DecorativeObject.field1860 > 1) {
         draggedWidget = null;
      }

   }

   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      signature = "(I)Lkm;",
      garbageValue = "-554888244"
   )
   public Name vmethod5443() {
      return MilliTimer.localPlayer != null ? MilliTimer.localPlayer.name : null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;Liv;I)V",
      garbageValue = "38640891"
   )
   public static void method1576(IndexDataBase var0, IndexDataBase var1) {
      Spotanim.SpotAnimationDefinition_indexCache = var0;
      Varcs.SpotAnimationDefinition_modelIndexCache = var1;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;B)I",
      garbageValue = "107"
   )
   public static int method1577(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + var0.charAt(var3);
      }

      return var2;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-491722597"
   )
   static void method1525() {
      class81.playerIndexesCount = 0;

      for(int var0 = 0; var0 < 2048; ++var0) {
         class81.field1179[var0] = null;
         class81.field1177[var0] = 1;
      }

   }
}
