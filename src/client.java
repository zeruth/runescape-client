import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import netscape.javascript.JSObject;

public final class client extends class47 implements class288 {

   @ObfuscatedName("nd")
   @ObfuscatedGetter(
      intValue = 1138307549
   )
   static int field794 = -2;
   @ObfuscatedName("nc")
   @ObfuscatedGetter(
      intValue = 407114703
   )
   static int field793 = 0;
   @ObfuscatedName("nb")
   @ObfuscatedGetter(
      longValue = -3613177442534620995L
   )
   static long field803 = 0L;
   @ObfuscatedName("ng")
   static boolean[] field795 = new boolean[100];
   @ObfuscatedName("no")
   static boolean[] field796 = new boolean[100];
   @ObfuscatedName("lo")
   static boolean field860 = false;
   @ObfuscatedName("nt")
   static boolean[] field797 = new boolean[100];
   @ObfuscatedName("lx")
   static boolean field594 = false;
   @ObfuscatedName("mh")
   @ObfuscatedGetter(
      intValue = 1972730241
   )
   static int field775 = 1;
   @ObfuscatedName("nh")
   static boolean field675 = true;
   @ObfuscatedName("rq")
   @ObfuscatedGetter(
      intValue = -2002454031
   )
   public static int field859 = -1;
   @ObfuscatedName("mp")
   @ObfuscatedGetter(
      intValue = 262646585
   )
   static int field742 = 0;
   @ObfuscatedName("le")
   @ObfuscatedGetter(
      intValue = -1540398517
   )
   static int field685 = 0;
   @ObfuscatedName("ob")
   static boolean field825 = false;
   @ObfuscatedName("lv")
   @ObfuscatedGetter(
      intValue = 1707398523
   )
   static int field766 = 0;
   @ObfuscatedName("ln")
   @ObfuscatedGetter(
      intValue = -1507973779
   )
   static int field769 = -1;
   @ObfuscatedName("li")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static class230 field639 = null;
   @ObfuscatedName("mg")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class202 field816 = new class202(512);
   @ObfuscatedName("ls")
   @ObfuscatedGetter(
      intValue = -1824637655
   )
   static int field770 = -1;
   @ObfuscatedName("nu")
   @ObfuscatedGetter(
      intValue = -1600961027
   )
   static int field802 = 0;
   @ObfuscatedName("nk")
   static int[] field800 = new int[100];
   @ObfuscatedName("ny")
   static int[] field798 = new int[100];
   @ObfuscatedName("nj")
   static int[] field799 = new int[100];
   @ObfuscatedName("ni")
   static int[] field604 = new int[100];
   @ObfuscatedName("lu")
   @ObfuscatedGetter(
      intValue = 643992545
   )
   static int field772 = -1;
   @ObfuscatedName("rh")
   @ObfuscatedSignature(
      signature = "Lbp;"
   )
   static final class59 field862 = new class59();
   @ObfuscatedName("lf")
   @ObfuscatedGetter(
      intValue = -2077809937
   )
   static int field773 = -1;
   @ObfuscatedName("mv")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   static class205 field755 = new class205();
   @ObfuscatedName("of")
   @ObfuscatedGetter(
      intValue = 984149875
   )
   static int field820 = 0;
   @ObfuscatedName("ok")
   @ObfuscatedGetter(
      intValue = -435908989
   )
   static int field821 = 0;
   @ObfuscatedName("pe")
   @ObfuscatedGetter(
      intValue = -959354801
   )
   static int field827 = 127;
   @ObfuscatedName("oj")
   @ObfuscatedGetter(
      intValue = -325961783
   )
   static int field824 = -1;
   @ObfuscatedName("ld")
   static boolean field774 = false;
   @ObfuscatedName("rw")
   static int[] field680 = new int[50];
   @ObfuscatedName("rr")
   static int[] field864 = new int[50];
   @ObfuscatedName("mr")
   @ObfuscatedGetter(
      intValue = 1982191767
   )
   static int field787 = 0;
   @ObfuscatedName("mx")
   @ObfuscatedGetter(
      intValue = -515631991
   )
   static int field788 = 0;
   @ObfuscatedName("qf")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   static class227 field853 = new class227();
   @ObfuscatedName("on")
   @ObfuscatedGetter(
      intValue = -203632127
   )
   static int field815 = -1;
   @ObfuscatedName("qc")
   @ObfuscatedGetter(
      intValue = -339483745
   )
   static int field783 = -1;
   @ObfuscatedName("po")
   @ObfuscatedGetter(
      intValue = 677998663
   )
   static int field598 = 0;
   @ObfuscatedName("ot")
   @ObfuscatedGetter(
      longValue = 946796608594445303L
   )
   static long field782 = -1L;
   @ObfuscatedName("pg")
   static int[] field831 = new int[50];
   @ObfuscatedName("lm")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static class230 field700 = null;
   @ObfuscatedName("qz")
   @ObfuscatedGetter(
      intValue = -886071063
   )
   static int field854 = -1;
   @ObfuscatedName("oi")
   @ObfuscatedGetter(
      intValue = 295871775
   )
   static int field693 = 255;
   @ObfuscatedName("px")
   static int[] field829 = new int[50];
   @ObfuscatedName("ps")
   @ObfuscatedSignature(
      signature = "[Lcm;"
   )
   static class91[] field762 = new class91[50];
   @ObfuscatedName("pc")
   static int[] field695 = new int[50];
   @ObfuscatedName("rm")
   static ArrayList field786 = new ArrayList(10);
   @ObfuscatedName("pj")
   static int[] field832 = new int[50];
   @ObfuscatedName("ri")
   @ObfuscatedGetter(
      intValue = 1969421345
   )
   static int field861 = 0;
   @ObfuscatedName("pb")
   @ObfuscatedGetter(
      intValue = -40748619
   )
   static int field768 = 127;
   @ObfuscatedName("og")
   @ObfuscatedGetter(
      intValue = -965218169
   )
   static int field651 = 0;
   @ObfuscatedName("oq")
   @ObfuscatedGetter(
      intValue = 1511918615
   )
   static int field822 = 0;
   @ObfuscatedName("pu")
   static boolean field746 = false;
   @ObfuscatedName("ou")
   @ObfuscatedSignature(
      signature = "[Llc;"
   )
   static class318[] field819 = new class318[1000];
   @ObfuscatedName("pm")
   static boolean[] field835 = new boolean[5];
   @ObfuscatedName("ow")
   @ObfuscatedGetter(
      intValue = 1793551831
   )
   static int field845 = 0;
   @ObfuscatedName("ol")
   static int[] field817 = new int[1000];
   @ObfuscatedName("ox")
   static int[] field818 = new int[1000];
   @ObfuscatedName("ne")
   static long[] field809 = new long[100];
   @ObfuscatedName("mu")
   static int[] field593 = new int[32];
   @ObfuscatedName("md")
   @ObfuscatedGetter(
      intValue = -1145521621
   )
   static int field777 = 0;
   @ObfuscatedName("mj")
   static int[] field810 = new int[32];
   @ObfuscatedName("mb")
   @ObfuscatedGetter(
      intValue = -803677707
   )
   static int field781 = 0;
   @ObfuscatedName("qk")
   @ObfuscatedSignature(
      signature = "[Lf;"
   )
   static class4[] field856 = new class4[8];
   @ObfuscatedName("op")
   static int[] field865 = new int[128];
   @ObfuscatedName("oa")
   static int[] field812 = new int[128];
   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   static class205 field790 = new class205();
   @ObfuscatedName("mn")
   @ObfuscatedGetter(
      intValue = 1313846965
   )
   static int field785 = 0;
   @ObfuscatedName("mo")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   static class205 field791 = new class205();
   @ObfuscatedName("qx")
   static short field745 = 256;
   @ObfuscatedName("qo")
   static short field841 = 205;
   @ObfuscatedName("qs")
   static short field707 = 1;
   @ObfuscatedName("oh")
   @ObfuscatedGetter(
      intValue = -1739119885
   )
   static int field830 = 0;
   @ObfuscatedName("qu")
   static short field847 = 32767;
   @ObfuscatedName("qh")
   static short field863 = 32767;
   @ObfuscatedName("qn")
   static short field842 = 256;
   @ObfuscatedName("qg")
   static short field615 = 320;
   @ObfuscatedName("qw")
   static short field844 = 1;
   @ObfuscatedName("qm")
   @ObfuscatedGetter(
      intValue = -1908896211
   )
   static int field852 = 0;
   @ObfuscatedName("qy")
   @ObfuscatedGetter(
      intValue = 497477697
   )
   static int field834 = 0;
   @ObfuscatedName("qj")
   @ObfuscatedGetter(
      intValue = 2021298749
   )
   static int field661 = 0;
   @ObfuscatedName("mw")
   static int[] field778 = new int[32];
   @ObfuscatedName("mq")
   @ObfuscatedGetter(
      intValue = -323698453
   )
   static int field779 = 0;
   @ObfuscatedName("qd")
   static int[] field836 = new int[5];
   @ObfuscatedName("qe")
   static int[] field837 = new int[5];
   @ObfuscatedName("qt")
   @ObfuscatedGetter(
      intValue = 49894369
   )
   static int field848 = 0;
   @ObfuscatedName("qb")
   static int[] field855 = new int[5];
   @ObfuscatedName("qa")
   @ObfuscatedGetter(
      intValue = -988965039
   )
   static int field849 = 0;
   @ObfuscatedName("qq")
   static int[] field765 = new int[5];
   @ObfuscatedName("mc")
   @ObfuscatedGetter(
      intValue = 2107658287
   )
   static int field789 = 0;
   @ObfuscatedName("ml")
   @ObfuscatedGetter(
      intValue = -697326019
   )
   static int field784 = 0;
   @ObfuscatedName("qi")
   @ObfuscatedGetter(
      longValue = -3347505195473162029L
   )
   static long field629;
   @ObfuscatedName("mm")
   @ObfuscatedGetter(
      intValue = -1207459131
   )
   static int field633 = 0;
   @ObfuscatedName("np")
   @ObfuscatedGetter(
      intValue = 1083573095
   )
   static int field851 = 0;
   @ObfuscatedName("nf")
   @ObfuscatedGetter(
      intValue = -1430428523
   )
   static int field694 = 0;
   @ObfuscatedName("nr")
   static String field808 = "";
   @ObfuscatedName("ro")
   @ObfuscatedSignature(
      signature = "Lby;"
   )
   static class61 field738 = new class61();
   @ObfuscatedName("nx")
   static int[] field805 = new int[]{16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215};
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lfm;"
   )
   static class164[] field666 = new class164[4];
   @ObfuscatedName("ak")
   static boolean field780 = true;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -710150299
   )
   public static int field676 = 1;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -1608100377
   )
   static int field726 = 0;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -115045799
   )
   static int field596 = 0;
   @ObfuscatedName("bn")
   public static boolean field628 = false;
   @ObfuscatedName("bp")
   static boolean field708 = false;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 754340933
   )
   static int field599 = 0;
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
   static int field611 = 0;
   @ObfuscatedName("bm")
   static boolean field603 = true;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1918380857
   )
   static int field679 = 0;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      longValue = -3560253004301321173L
   )
   static long field605 = -1L;
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
   static boolean field610 = false;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 1327371833
   )
   static int field643 = 0;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 203988051
   )
   static int field858 = 0;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1508240615
   )
   static int field613 = 0;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = -399373815
   )
   static int field614 = 0;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = 1804776069
   )
   static int field612 = 0;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = 889927571
   )
   static int field616 = 0;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = 712082861
   )
   static int field617 = 0;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = 1269048349
   )
   static int field618 = 0;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = 953423233
   )
   static int field670 = 0;
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      signature = "Lbq;"
   )
   static class77 field620 = class77.field1094;
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      signature = "Lbq;"
   )
   static class77 field621 = class77.field1094;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = 243111015
   )
   static int field823 = 0;
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "Lft;"
   )
   static class157 field623;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = 2051008151
   )
   static int field624 = 0;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = 104390289
   )
   static int field625 = 0;
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      signature = "Lic;"
   )
   static class249 field626;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = 1331640199
   )
   static int field595 = 0;
   @ObfuscatedName("do")
   @ObfuscatedGetter(
      intValue = 1491451481
   )
   static int field838 = 0;
   @ObfuscatedName("de")
   @ObfuscatedGetter(
      intValue = -915676447
   )
   static int field645 = 0;
   @ObfuscatedName("dj")
   @ObfuscatedGetter(
      intValue = -1837898575
   )
   static int field630 = 0;
   @ObfuscatedName("ds")
   @ObfuscatedGetter(
      intValue = 821087251
   )
   static int field631 = 0;
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      signature = "Lei;"
   )
   static class146 field716 = class146.field1929;
   @ObfuscatedName("di")
   static byte[] field718 = null;
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      signature = "[Lba;"
   )
   static class72[] field807 = new class72['\u8000'];
   @ObfuscatedName("dq")
   @ObfuscatedGetter(
      intValue = 1773144939
   )
   static int field635 = 0;
   @ObfuscatedName("dy")
   static int[] field636 = new int['\u8000'];
   @ObfuscatedName("ec")
   @ObfuscatedGetter(
      intValue = -1982880171
   )
   static int field637 = 0;
   @ObfuscatedName("ey")
   static int[] field638 = new int[250];
   @ObfuscatedName("eg")
   @ObfuscatedSignature(
      signature = "Lcj;"
   )
   public static final class87 field739 = new class87();
   @ObfuscatedName("er")
   @ObfuscatedGetter(
      intValue = 2130447299
   )
   static int field688 = 0;
   @ObfuscatedName("ej")
   static boolean field641 = false;
   @ObfuscatedName("ek")
   static boolean field642 = true;
   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      signature = "Ljg;"
   )
   static class280 field840 = new class280();
   @ObfuscatedName("eq")
   static HashMap field644 = new HashMap();
   @ObfuscatedName("ez")
   @ObfuscatedGetter(
      intValue = 1228257375
   )
   static int field792 = 0;
   @ObfuscatedName("ed")
   @ObfuscatedGetter(
      intValue = -503470903
   )
   static int field697 = 1;
   @ObfuscatedName("ea")
   @ObfuscatedGetter(
      intValue = 2077564129
   )
   static int field647 = 0;
   @ObfuscatedName("ew")
   @ObfuscatedGetter(
      intValue = -1517576733
   )
   static int field648 = 1;
   @ObfuscatedName("fp")
   @ObfuscatedGetter(
      intValue = -1232805537
   )
   static int field649 = 0;
   @ObfuscatedName("fm")
   static boolean field646 = false;
   @ObfuscatedName("fs")
   static int[][][] field652 = new int[4][13][13];
   @ObfuscatedName("fu")
   static final int[] field653 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
   @ObfuscatedName("fy")
   @ObfuscatedGetter(
      intValue = -986662313
   )
   static int field654 = 0;
   @ObfuscatedName("fb")
   @ObfuscatedGetter(
      intValue = 320333465
   )
   static int field655 = 2301979;
   @ObfuscatedName("gy")
   @ObfuscatedGetter(
      intValue = -246881979
   )
   static int field656 = 5063219;
   @ObfuscatedName("gn")
   @ObfuscatedGetter(
      intValue = -1775701985
   )
   static int field731 = 3353893;
   @ObfuscatedName("gb")
   @ObfuscatedGetter(
      intValue = -1671328597
   )
   static int field658 = 7759444;
   @ObfuscatedName("go")
   static boolean field659 = false;
   @ObfuscatedName("gi")
   @ObfuscatedGetter(
      intValue = -1614406899
   )
   static int field736 = 0;
   @ObfuscatedName("gm")
   @ObfuscatedGetter(
      intValue = -1719678355
   )
   static int field632 = 128;
   @ObfuscatedName("gg")
   @ObfuscatedGetter(
      intValue = -1296134745
   )
   static int field662 = 0;
   @ObfuscatedName("gf")
   @ObfuscatedGetter(
      intValue = 793553735
   )
   static int field663 = 0;
   @ObfuscatedName("gx")
   @ObfuscatedGetter(
      intValue = -965597961
   )
   static int field767 = 0;
   @ObfuscatedName("gw")
   @ObfuscatedGetter(
      intValue = -1124685859
   )
   static int field717 = 0;
   @ObfuscatedName("ga")
   @ObfuscatedGetter(
      intValue = -1416610753
   )
   static int field627 = 0;
   @ObfuscatedName("gj")
   @ObfuscatedGetter(
      intValue = 180462143
   )
   static int field678 = 0;
   @ObfuscatedName("gv")
   @ObfuscatedGetter(
      intValue = -1261710225
   )
   static int field668 = 50;
   @ObfuscatedName("gt")
   @ObfuscatedGetter(
      intValue = 1990466531
   )
   static int field857;
   @ObfuscatedName("gz")
   @ObfuscatedGetter(
      intValue = 1922379337
   )
   static int field602 = 0;
   @ObfuscatedName("gc")
   @ObfuscatedGetter(
      intValue = 402885239
   )
   static int field804 = 0;
   @ObfuscatedName("gr")
   @ObfuscatedGetter(
      intValue = 765440817
   )
   static int field671 = 0;
   @ObfuscatedName("hm")
   @ObfuscatedGetter(
      intValue = -1491520915
   )
   static int field672 = 12;
   @ObfuscatedName("hj")
   @ObfuscatedGetter(
      intValue = -742284777
   )
   static int field673 = 6;
   @ObfuscatedName("hp")
   @ObfuscatedGetter(
      intValue = -656834559
   )
   static int field674 = 0;
   @ObfuscatedName("hd")
   static boolean field622 = false;
   @ObfuscatedName("hv")
   @ObfuscatedGetter(
      intValue = 669004171
   )
   static int field801 = 0;
   @ObfuscatedName("hx")
   static boolean field677 = false;
   @ObfuscatedName("hq")
   @ObfuscatedGetter(
      intValue = 1641588965
   )
   static int field723 = 0;
   @ObfuscatedName("he")
   @ObfuscatedGetter(
      intValue = -1356328419
   )
   static int field828 = 0;
   @ObfuscatedName("hn")
   @ObfuscatedGetter(
      intValue = -572241541
   )
   static int field634 = 50;
   @ObfuscatedName("ho")
   static int[] field681 = new int[field634];
   @ObfuscatedName("hy")
   static int[] field682 = new int[field634];
   @ObfuscatedName("hk")
   static int[] field683 = new int[field634];
   @ObfuscatedName("ht")
   static int[] field684 = new int[field634];
   @ObfuscatedName("hg")
   static int[] field811 = new int[field634];
   @ObfuscatedName("hc")
   static int[] field686 = new int[field634];
   @ObfuscatedName("hr")
   static int[] field687 = new int[field634];
   @ObfuscatedName("ha")
   static String[] field732 = new String[field634];
   @ObfuscatedName("hh")
   static int[][] field689 = new int[104][104];
   @ObfuscatedName("hu")
   @ObfuscatedGetter(
      intValue = -1565760405
   )
   static int field690 = 0;
   @ObfuscatedName("hs")
   @ObfuscatedGetter(
      intValue = -1677083163
   )
   static int field691 = -1;
   @ObfuscatedName("hz")
   @ObfuscatedGetter(
      intValue = 1627957251
   )
   static int field692 = -1;
   @ObfuscatedName("hl")
   @ObfuscatedGetter(
      intValue = -226851279
   )
   static int field743 = 0;
   @ObfuscatedName("hb")
   @ObfuscatedGetter(
      intValue = 1284462679
   )
   static int field839 = 0;
   @ObfuscatedName("hw")
   @ObfuscatedGetter(
      intValue = 1347177379
   )
   static int field843 = 0;
   @ObfuscatedName("hf")
   @ObfuscatedGetter(
      intValue = 671072709
   )
   static int field696 = 0;
   @ObfuscatedName("ii")
   static boolean field664 = true;
   @ObfuscatedName("im")
   @ObfuscatedGetter(
      intValue = -1396378137
   )
   static int field698 = 0;
   @ObfuscatedName("ia")
   @ObfuscatedGetter(
      intValue = -1957595085
   )
   static int field699 = 0;
   @ObfuscatedName("io")
   @ObfuscatedGetter(
      intValue = 647517325
   )
   static int field597 = 0;
   @ObfuscatedName("ib")
   @ObfuscatedGetter(
      intValue = -46582737
   )
   static int field701 = 0;
   @ObfuscatedName("ik")
   @ObfuscatedGetter(
      intValue = 1417109621
   )
   static int field640 = 0;
   @ObfuscatedName("ip")
   @ObfuscatedGetter(
      intValue = -244588269
   )
   static int field703 = 0;
   @ObfuscatedName("iu")
   static boolean field704 = false;
   @ObfuscatedName("il")
   @ObfuscatedGetter(
      intValue = 1496315097
   )
   static int field705 = 0;
   @ObfuscatedName("iv")
   @ObfuscatedGetter(
      intValue = 636102247
   )
   static int field706 = 0;
   @ObfuscatedName("ic")
   static boolean field715 = true;
   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      signature = "[Lbu;"
   )
   static class60[] field806 = new class60[2048];
   @ObfuscatedName("it")
   static String field759 = null;
   @ObfuscatedName("iw")
   @ObfuscatedGetter(
      intValue = -1539952365
   )
   static int field709 = -1;
   @ObfuscatedName("in")
   @ObfuscatedGetter(
      intValue = 965633939
   )
   static int field710 = 0;
   @ObfuscatedName("ie")
   static boolean field711 = true;
   @ObfuscatedName("jx")
   @ObfuscatedGetter(
      intValue = -997447881
   )
   static int field712 = 0;
   @ObfuscatedName("jb")
   @ObfuscatedGetter(
      intValue = 1728578221
   )
   static int field713 = 0;
   @ObfuscatedName("je")
   static int[] field714 = new int[1000];
   @ObfuscatedName("jq")
   static final int[] field833 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
   @ObfuscatedName("jp")
   static String[] field650 = new String[8];
   @ObfuscatedName("jm")
   static boolean[] field850 = new boolean[8];
   @ObfuscatedName("ja")
   static int[] field665 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
   @ObfuscatedName("jj")
   @ObfuscatedGetter(
      intValue = -1425437183
   )
   static int field719 = -1;
   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      signature = "[[[Lgz;"
   )
   static class205[][][] field720 = new class205[4][104][104];
   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   static class205 field721 = new class205();
   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   static class205 field722 = new class205();
   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      signature = "Lgz;"
   )
   static class205 field660 = new class205();
   @ObfuscatedName("jt")
   static int[] field724 = new int[25];
   @ObfuscatedName("jo")
   static int[] field725 = new int[25];
   @ObfuscatedName("jd")
   static int[] field764 = new int[25];
   @ObfuscatedName("ji")
   @ObfuscatedGetter(
      intValue = -451068837
   )
   static int field727 = 0;
   @ObfuscatedName("jg")
   static boolean field846 = false;
   @ObfuscatedName("kj")
   @ObfuscatedGetter(
      intValue = -183492423
   )
   static int field657 = 0;
   @ObfuscatedName("kd")
   static int[] field730 = new int[500];
   @ObfuscatedName("ki")
   static int[] field737 = new int[500];
   @ObfuscatedName("ke")
   static int[] field702 = new int[500];
   @ObfuscatedName("kn")
   static int[] field619 = new int[500];
   @ObfuscatedName("km")
   static String[] field734 = new String[500];
   @ObfuscatedName("kf")
   static String[] field735 = new String[500];
   @ObfuscatedName("kb")
   static boolean[] field728 = new boolean[500];
   @ObfuscatedName("ks")
   static boolean field753 = false;
   @ObfuscatedName("kl")
   static boolean field733 = false;
   @ObfuscatedName("kg")
   static boolean field669 = false;
   @ObfuscatedName("kr")
   static boolean field740 = true;
   @ObfuscatedName("kp")
   @ObfuscatedGetter(
      intValue = -1178031123
   )
   static int field741 = -1;
   @ObfuscatedName("ku")
   @ObfuscatedGetter(
      intValue = -1506962549
   )
   static int field667 = -1;
   @ObfuscatedName("kq")
   @ObfuscatedGetter(
      intValue = -2006294019
   )
   static int field747 = 0;
   @ObfuscatedName("kx")
   @ObfuscatedGetter(
      intValue = -1041050541
   )
   static int field744 = 50;
   @ObfuscatedName("ko")
   @ObfuscatedGetter(
      intValue = 2138266691
   )
   static int field771 = 0;
   @ObfuscatedName("kz")
   static boolean field813 = false;
   @ObfuscatedName("ka")
   @ObfuscatedGetter(
      intValue = -679563285
   )
   static int field748 = -1;
   @ObfuscatedName("kh")
   @ObfuscatedGetter(
      intValue = -1328628203
   )
   static int field749 = -1;
   @ObfuscatedName("lg")
   static String field750 = null;
   @ObfuscatedName("lw")
   static String field751 = null;
   @ObfuscatedName("lj")
   @ObfuscatedGetter(
      intValue = -707126749
   )
   static int field752 = -1;
   @ObfuscatedName("ly")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   static class202 field826 = new class202(8);
   @ObfuscatedName("lh")
   @ObfuscatedGetter(
      intValue = -1826783613
   )
   static int field754 = 0;
   @ObfuscatedName("lc")
   @ObfuscatedGetter(
      intValue = 1960487621
   )
   static int field814 = 0;
   @ObfuscatedName("lr")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static class230 field756 = null;
   @ObfuscatedName("lq")
   @ObfuscatedGetter(
      intValue = 233674625
   )
   static int field757 = 0;
   @ObfuscatedName("lz")
   @ObfuscatedGetter(
      intValue = -1417367467
   )
   static int field758 = 0;
   @ObfuscatedName("la")
   @ObfuscatedGetter(
      intValue = 611657069
   )
   static int field729 = 0;
   @ObfuscatedName("lb")
   @ObfuscatedGetter(
      intValue = 71333287
   )
   static int field760 = -1;
   @ObfuscatedName("ll")
   static boolean field761 = false;
   @ObfuscatedName("lp")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static class230 field776 = null;
   @ObfuscatedName("lk")
   @ObfuscatedSignature(
      signature = "Lhl;"
   )
   static class230 field763 = null;


   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   protected final void vmethod1203() {
      field803 = class166.method3456() + 500L;
      this.method1465();
      if(field752 != -1) {
         this.method1210(true);
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-81564058"
   )
   protected final void vmethod1521() {
      class123.method2897(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
      class168.field2111 = field596 == 0?'\uaa4a':field676 + '\u9c40';
      class13.field101 = field596 == 0?443:field676 + '\uc350';
      class12.field91 = class168.field2111;
      class36.field313 = class228.field2602;
      class185.field2390 = class228.field2599;
      class150.field1947 = class228.field2600;
      class76.field1091 = class228.field2601;
      class59.field552 = new class135();
      this.method973();
      this.method837();
      class173.field2289 = this.method838();
      class65.field968 = new class162(255, class155.field1989, class155.field1993, 500000);
      class110 var2 = null;
      class66 var3 = new class66();

      try {
         var2 = class240.method4600("", class170.field2265.field3160, false);
         byte[] var4 = new byte[(int)var2.method2574()];

         int var6;
         for(int var5 = 0; var5 < var4.length; var5 += var6) {
            var6 = var2.method2560(var4, var5, var4.length - var5);
            if(var6 == -1) {
               throw new IOException();
            }
         }

         var3 = new class66(new class182(var4));
      } catch (Exception var8) {
         ;
      }

      try {
         if(var2 != null) {
            var2.method2564();
         }
      } catch (Exception var7) {
         ;
      }

      class51.field468 = var3;
      this.method839();
      String var9 = class115.field1555;
      class45.field374 = this;
      if(var9 != null) {
         class45.field368 = var9;
      }

      if(field596 != 0) {
         field610 = true;
      }

      class171.method3470(class51.field468.field979);
      class109.field1453 = new class67(class19.field168);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1245920510"
   )
   protected final void vmethod1195() {
      ++field679;
      this.method1198();

      while(true) {
         class205 var2 = class248.field3196;
         class245 var1;
         synchronized(class248.field3196) {
            var1 = (class245)class248.field3193.method4109();
         }

         if(var1 == null) {
            class177.method3530();
            class263.method4951();
            class39 var64 = class39.field350;
            int var43;
            synchronized(class39.field350) {
               ++class39.field331;
               class39.field342 = class39.field348;
               class39.field347 = 0;
               if(class39.field349 < 0) {
                  for(var43 = 0; var43 < 112; ++var43) {
                     class39.field340[var43] = false;
                  }

                  class39.field349 = class39.field343;
               } else {
                  while(class39.field343 != class39.field349) {
                     var43 = class39.field341[class39.field343];
                     class39.field343 = class39.field343 + 1 & 127;
                     if(var43 < 0) {
                        class39.field340[~var43] = false;
                     } else {
                        if(!class39.field340[var43] && class39.field347 < class39.field346.length - 1) {
                           class39.field346[++class39.field347 - 1] = var43;
                        }

                        class39.field340[var43] = true;
                     }
                  }
               }

               if(class39.field347 > 0) {
                  class39.field331 = 0;
               }

               class39.field348 = class39.field355;
            }

            class48 var65 = class48.field419;
            synchronized(class48.field419) {
               class48.field424 = class48.field420;
               class48.field425 = class48.field421;
               class48.field417 = class48.field423;
               class48.field431 = class48.field427;
               class48.field432 = class48.field428;
               class48.field437 = class48.field433;
               class48.field434 = class48.field430;
               class48.field427 = 0;
            }

            if(class173.field2289 != null) {
               int var44 = class173.field2289.vmethod3281();
               field788 = var44;
            }

            if(field611 == 0) {
               class42.method784();
               class110.method2579();
            } else if(field611 == 5) {
               class45.method819(this);
               class42.method784();
               class110.method2579();
            } else if(field611 != 10 && field611 != 11) {
               if(field611 == 20) {
                  class45.method819(this);
                  this.method1201();
               } else if(field611 == 25) {
                  class53.method1072(false);
                  field792 = 0;
                  boolean var68 = true;

                  for(var43 = 0; var43 < class8.field58.length; ++var43) {
                     if(class140.field1901[var43] != -1 && class8.field58[var43] == null) {
                        class8.field58[var43] = class234.field2796.method4626(class140.field1901[var43], 0);
                        if(class8.field58[var43] == null) {
                           var68 = false;
                           ++field792;
                        }
                     }

                     if(class53.field484[var43] != -1 && class112.field1475[var43] == null) {
                        class112.field1475[var43] = class234.field2796.method4627(class53.field484[var43], 0, class47.field404[var43]);
                        if(class112.field1475[var43] == null) {
                           var68 = false;
                           ++field792;
                        }
                     }
                  }

                  if(!var68) {
                     field649 = 1;
                  } else {
                     field647 = 0;
                     var68 = true;

                     int var45;
                     int var46;
                     for(var43 = 0; var43 < class8.field58.length; ++var43) {
                        byte[] var3 = class112.field1475[var43];
                        if(var3 != null) {
                           var45 = (class61.field592[var43] >> 8) * 64 - class178.field2315;
                           var46 = (class61.field592[var43] & 255) * 64 - class71.field1051;
                           if(field646) {
                              var45 = 10;
                              var46 = 10;
                           }

                           var68 &= class32.method599(var3, var45, var46);
                        }
                     }

                     if(!var68) {
                        field649 = 2;
                     } else {
                        if(field649 != 0) {
                           class16.method187("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
                        }

                        class263.method4951();
                        class56.field523.method2901();

                        for(var43 = 0; var43 < 4; ++var43) {
                           field666[var43].method3413();
                        }

                        int var47;
                        for(var43 = 0; var43 < 4; ++var43) {
                           for(var47 = 0; var47 < 104; ++var47) {
                              for(var45 = 0; var45 < 104; ++var45) {
                                 class50.field445[var43][var47][var45] = 0;
                              }
                           }
                        }

                        class263.method4951();
                        class173.method3490();
                        var43 = class8.field58.length;
                        class59.method1126();
                        class53.method1072(true);
                        int var7;
                        int var8;
                        int var10;
                        int var11;
                        int var12;
                        int var13;
                        int var14;
                        int var15;
                        int var16;
                        int var17;
                        int var18;
                        int var20;
                        int var21;
                        int var22;
                        int var49;
                        if(!field646) {
                           byte[] var6;
                           for(var47 = 0; var47 < var43; ++var47) {
                              var45 = (class61.field592[var47] >> 8) * 64 - class178.field2315;
                              var46 = (class61.field592[var47] & 255) * 64 - class71.field1051;
                              var6 = class8.field58[var47];
                              if(var6 != null) {
                                 class263.method4951();
                                 var7 = class11.field82 * 8 - 48;
                                 var8 = class54.field495 * 8 - 48;
                                 class164[] var9 = field666;

                                 for(var10 = 0; var10 < 4; ++var10) {
                                    for(var11 = 0; var11 < 64; ++var11) {
                                       for(var12 = 0; var12 < 64; ++var12) {
                                          if(var11 + var45 > 0 && var11 + var45 < 103 && var12 + var46 > 0 && var12 + var46 < 103) {
                                             var9[var10].field2055[var45 + var11][var12 + var46] &= -16777217;
                                          }
                                       }
                                    }
                                 }

                                 class182 var48 = new class182(var6);

                                 for(var11 = 0; var11 < 4; ++var11) {
                                    for(var12 = 0; var12 < 64; ++var12) {
                                       for(var13 = 0; var13 < 64; ++var13) {
                                          class40.method768(var48, var11, var45 + var12, var46 + var13, var7, var8, 0);
                                       }
                                    }
                                 }
                              }
                           }

                           for(var47 = 0; var47 < var43; ++var47) {
                              var45 = (class61.field592[var47] >> 8) * 64 - class178.field2315;
                              var46 = (class61.field592[var47] & 255) * 64 - class71.field1051;
                              var6 = class8.field58[var47];
                              if(var6 == null && class54.field495 < 800) {
                                 class263.method4951();
                                 class64.method1601(var45, var46, 64, 64);
                              }
                           }

                           class53.method1072(true);

                           for(var47 = 0; var47 < var43; ++var47) {
                              byte[] var4 = class112.field1475[var47];
                              if(var4 != null) {
                                 var46 = (class61.field592[var47] >> 8) * 64 - class178.field2315;
                                 var49 = (class61.field592[var47] & 255) * 64 - class71.field1051;
                                 class263.method4951();
                                 class125 var50 = class56.field523;
                                 class164[] var51 = field666;
                                 class182 var67 = new class182(var4);
                                 var10 = -1;

                                 while(true) {
                                    var11 = var67.method3583();
                                    if(var11 == 0) {
                                       break;
                                    }

                                    var10 += var11;
                                    var12 = 0;

                                    while(true) {
                                       var13 = var67.method3599();
                                       if(var13 == 0) {
                                          break;
                                       }

                                       var12 += var13 - 1;
                                       var14 = var12 & 63;
                                       var15 = var12 >> 6 & 63;
                                       var16 = var12 >> 12;
                                       var17 = var67.method3742();
                                       var18 = var17 >> 2;
                                       int var19 = var17 & 3;
                                       var20 = var15 + var46;
                                       var21 = var14 + var49;
                                       if(var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                          var22 = var16;
                                          if((class50.field445[1][var20][var21] & 2) == 2) {
                                             var22 = var16 - 1;
                                          }

                                          class164 var23 = null;
                                          if(var22 >= 0) {
                                             var23 = var51[var22];
                                          }

                                          class189.method3902(var16, var20, var21, var10, var19, var18, var50, var23);
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        int var52;
                        if(field646) {
                           int var26;
                           int var28;
                           int var29;
                           int var30;
                           class164[] var54;
                           class182 var55;
                           int var56;
                           for(var47 = 0; var47 < 4; ++var47) {
                              class263.method4951();

                              for(var45 = 0; var45 < 13; ++var45) {
                                 for(var46 = 0; var46 < 13; ++var46) {
                                    boolean var69 = false;
                                    var7 = field652[var47][var45][var46];
                                    if(var7 != -1) {
                                       var8 = var7 >> 24 & 3;
                                       var52 = var7 >> 1 & 3;
                                       var10 = var7 >> 14 & 1023;
                                       var11 = var7 >> 3 & 2047;
                                       var12 = (var10 / 8 << 8) + var11 / 8;

                                       for(var13 = 0; var13 < class61.field592.length; ++var13) {
                                          if(class61.field592[var13] == var12 && class8.field58[var13] != null) {
                                             byte[] var53 = class8.field58[var13];
                                             var15 = var45 * 8;
                                             var16 = var46 * 8;
                                             var17 = (var10 & 7) * 8;
                                             var18 = (var11 & 7) * 8;
                                             var54 = field666;

                                             for(var20 = 0; var20 < 8; ++var20) {
                                                for(var21 = 0; var21 < 8; ++var21) {
                                                   if(var20 + var15 > 0 && var15 + var20 < 103 && var21 + var16 > 0 && var16 + var21 < 103) {
                                                      var54[var47].field2055[var15 + var20][var16 + var21] &= -16777217;
                                                   }
                                                }
                                             }

                                             var55 = new class182(var53);

                                             for(var21 = 0; var21 < 4; ++var21) {
                                                for(var22 = 0; var22 < 64; ++var22) {
                                                   for(var56 = 0; var56 < 64; ++var56) {
                                                      if(var21 == var8 && var22 >= var17 && var22 < var17 + 8 && var56 >= var18 && var56 < var18 + 8) {
                                                         var26 = var15 + class109.method2553(var22 & 7, var56 & 7, var52);
                                                         var29 = var22 & 7;
                                                         var30 = var56 & 7;
                                                         int var31 = var52 & 3;
                                                         if(var31 == 0) {
                                                            var28 = var30;
                                                         } else if(var31 == 1) {
                                                            var28 = 7 - var29;
                                                         } else if(var31 == 2) {
                                                            var28 = 7 - var30;
                                                         } else {
                                                            var28 = var29;
                                                         }

                                                         class40.method768(var55, var47, var26, var28 + var16, 0, 0, var52);
                                                      } else {
                                                         class40.method768(var55, 0, -1, -1, 0, 0, 0);
                                                      }
                                                   }
                                                }
                                             }

                                             var69 = true;
                                             break;
                                          }
                                       }
                                    }

                                    if(!var69) {
                                       var8 = var47;
                                       var52 = var45 * 8;
                                       var10 = var46 * 8;

                                       for(var11 = 0; var11 < 8; ++var11) {
                                          for(var12 = 0; var12 < 8; ++var12) {
                                             class50.field447[var8][var11 + var52][var10 + var12] = 0;
                                          }
                                       }

                                       if(var52 > 0) {
                                          for(var11 = 1; var11 < 8; ++var11) {
                                             class50.field447[var8][var52][var11 + var10] = class50.field447[var8][var52 - 1][var10 + var11];
                                          }
                                       }

                                       if(var10 > 0) {
                                          for(var11 = 1; var11 < 8; ++var11) {
                                             class50.field447[var8][var11 + var52][var10] = class50.field447[var8][var52 + var11][var10 - 1];
                                          }
                                       }

                                       if(var52 > 0 && class50.field447[var8][var52 - 1][var10] != 0) {
                                          class50.field447[var8][var52][var10] = class50.field447[var8][var52 - 1][var10];
                                       } else if(var10 > 0 && class50.field447[var8][var52][var10 - 1] != 0) {
                                          class50.field447[var8][var52][var10] = class50.field447[var8][var52][var10 - 1];
                                       } else if(var52 > 0 && var10 > 0 && class50.field447[var8][var52 - 1][var10 - 1] != 0) {
                                          class50.field447[var8][var52][var10] = class50.field447[var8][var52 - 1][var10 - 1];
                                       }
                                    }
                                 }
                              }
                           }

                           for(var47 = 0; var47 < 13; ++var47) {
                              for(var45 = 0; var45 < 13; ++var45) {
                                 var46 = field652[0][var47][var45];
                                 if(var46 == -1) {
                                    class64.method1601(var47 * 8, var45 * 8, 8, 8);
                                 }
                              }
                           }

                           class53.method1072(true);

                           for(var47 = 0; var47 < 4; ++var47) {
                              class263.method4951();

                              for(var45 = 0; var45 < 13; ++var45) {
                                 label570:
                                 for(var46 = 0; var46 < 13; ++var46) {
                                    var49 = field652[var47][var45][var46];
                                    if(var49 != -1) {
                                       var7 = var49 >> 24 & 3;
                                       var8 = var49 >> 1 & 3;
                                       var52 = var49 >> 14 & 1023;
                                       var10 = var49 >> 3 & 2047;
                                       var11 = (var52 / 8 << 8) + var10 / 8;

                                       for(var12 = 0; var12 < class61.field592.length; ++var12) {
                                          if(class61.field592[var12] == var11 && class112.field1475[var12] != null) {
                                             byte[] var57 = class112.field1475[var12];
                                             var14 = var45 * 8;
                                             var15 = var46 * 8;
                                             var16 = (var52 & 7) * 8;
                                             var17 = (var10 & 7) * 8;
                                             class125 var58 = class56.field523;
                                             var54 = field666;
                                             var55 = new class182(var57);
                                             var21 = -1;

                                             while(true) {
                                                var22 = var55.method3583();
                                                if(var22 == 0) {
                                                   continue label570;
                                                }

                                                var21 += var22;
                                                var56 = 0;

                                                while(true) {
                                                   int var59 = var55.method3599();
                                                   if(var59 == 0) {
                                                      break;
                                                   }

                                                   var56 += var59 - 1;
                                                   int var25 = var56 & 63;
                                                   var26 = var56 >> 6 & 63;
                                                   int var27 = var56 >> 12;
                                                   var28 = var55.method3742();
                                                   var29 = var28 >> 2;
                                                   var30 = var28 & 3;
                                                   if(var7 == var27 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) {
                                                      class268 var60 = class40.method766(var21);
                                                      int var34 = var26 & 7;
                                                      int var35 = var25 & 7;
                                                      int var37 = var60.field3404;
                                                      int var38 = var60.field3420;
                                                      int var39;
                                                      if((var30 & 1) == 1) {
                                                         var39 = var37;
                                                         var37 = var38;
                                                         var38 = var39;
                                                      }

                                                      int var36 = var8 & 3;
                                                      int var33;
                                                      if(var36 == 0) {
                                                         var33 = var34;
                                                      } else if(var36 == 1) {
                                                         var33 = var35;
                                                      } else if(var36 == 2) {
                                                         var33 = 7 - var34 - (var37 - 1);
                                                      } else {
                                                         var33 = 7 - var35 - (var38 - 1);
                                                      }

                                                      var39 = var33 + var14;
                                                      int var40 = var15 + class4.method56(var26 & 7, var25 & 7, var8, var60.field3404, var60.field3420, var30);
                                                      if(var39 > 0 && var40 > 0 && var39 < 103 && var40 < 103) {
                                                         int var41 = var47;
                                                         if((class50.field445[1][var39][var40] & 2) == 2) {
                                                            var41 = var47 - 1;
                                                         }

                                                         class164 var42 = null;
                                                         if(var41 >= 0) {
                                                            var42 = var54[var41];
                                                         }

                                                         class189.method3902(var47, var39, var40, var21, var30 + var8 & 3, var29, var58, var42);
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        class53.method1072(true);
                        class263.method4951();
                        class24.method457(class56.field523, field666);
                        class53.method1072(true);
                        var47 = class50.field446;
                        if(var47 > class192.field2415) {
                           var47 = class192.field2415;
                        }

                        if(var47 < class192.field2415 - 1) {
                           var47 = class192.field2415 - 1;
                        }

                        if(field708) {
                           class56.field523.method2902(class50.field446);
                        } else {
                           class56.field523.method2902(0);
                        }

                        for(var45 = 0; var45 < 104; ++var45) {
                           for(var46 = 0; var46 < 104; ++var46) {
                              class171.method3472(var45, var46);
                           }
                        }

                        class263.method4951();
                        class36.method688();
                        class268.field3426.method4024();
                        class172 var66;
                        if(class37.field321.method979()) {
                           var66 = class133.method3115(class169.field2165, field739.field1250);
                           var66.field2279.method3555(1057001181);
                           field739.method2019(var66);
                        }

                        if(!field646) {
                           var45 = (class11.field82 - 6) / 8;
                           var46 = (class11.field82 + 6) / 8;
                           var49 = (class54.field495 - 6) / 8;
                           var7 = (class54.field495 + 6) / 8;

                           for(var8 = var45 - 1; var8 <= var46 + 1; ++var8) {
                              for(var52 = var49 - 1; var52 <= var7 + 1; ++var52) {
                                 if(var8 < var45 || var8 > var46 || var52 < var49 || var52 > var7) {
                                    class234.field2796.method4650("m" + var8 + "_" + var52);
                                    class234.field2796.method4650("l" + var8 + "_" + var52);
                                 }
                              }
                           }
                        }

                        class102.method2310(30);
                        class263.method4951();
                        class171.method3474();
                        var66 = class133.method3115(class169.field2240, field739.field1250);
                        field739.method2019(var66);
                        class110.method2579();
                     }
                  }
               }
            } else {
               class45.method819(this);
            }

            if(field611 == 30) {
               this.method1202();
            } else if(field611 == 40 || field611 == 45) {
               this.method1201();
            }

            return;
         }

         var1.field3162.method4766(var1.field3164, (int)var1.field2449, var1.field3165, false);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-2135258546"
   )
   protected final void vmethod1196(boolean var1) {
      boolean var2 = class0.method0();
      if(var2 && field825 && class2.field11 != null) {
         class2.field11.method2251();
      }

      int var3;
      if((field611 == 10 || field611 == 20 || field611 == 30) && field803 != 0L && class166.method3456() > field803) {
         var3 = field675?2:1;
         field803 = 0L;
         if(var3 >= 2) {
            field675 = true;
         } else {
            field675 = false;
         }

         boolean var4 = field675?true:true;
         if(var4) {
            class37.field321.method896(765, 503);
         } else {
            class37.field321.method896(7680, 2160);
         }

         if(field611 >= 25) {
            class172 var5 = class133.method3115(class169.field2206, field739.field1250);
            class189 var6 = var5.field2279;
            int var7 = field675?2:1;
            var6.method3552(var7);
            var5.field2279.method3602(class9.field70);
            var5.field2279.method3602(class37.field326);
            field739.method2019(var5);
         }
      }

      if(var1) {
         for(var3 = 0; var3 < 100; ++var3) {
            field795[var3] = true;
         }
      }

      if(field611 == 0) {
         this.method898(class78.field1120, class78.field1121, var1);
      } else if(field611 == 5) {
         class32.method597(class55.field499, class170.field2264, class56.field524, var1);
      } else if(field611 != 10 && field611 != 11) {
         if(field611 == 20) {
            class32.method597(class55.field499, class170.field2264, class56.field524, var1);
         } else if(field611 == 25) {
            if(field649 == 1) {
               if(field792 > field697) {
                  field697 = field792;
               }

               var3 = (field697 * 50 - field792 * 50) / field697;
               class16.method187("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else if(field649 == 2) {
               if(field647 > field648) {
                  field648 = field647;
               }

               var3 = (field648 * 50 - field647 * 50) / field648 + 50;
               class16.method187("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else {
               class16.method187("Loading - please wait.", false);
            }
         } else if(field611 == 30) {
            this.method1268();
         } else if(field611 == 40) {
            class16.method187("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if(field611 == 45) {
            class16.method187("Please wait...", false);
         }
      } else {
         class32.method597(class55.field499, class170.field2264, class56.field524, var1);
      }

      if(field611 == 30 && field802 == 0 && !var1 && !field675) {
         for(var3 = 0; var3 < field793; ++var3) {
            if(field796[var3]) {
               class50.field455.vmethod5854(field798[var3], field799[var3], field800[var3], field604[var3]);
               field796[var3] = false;
            }
         }
      } else if(field611 > 0) {
         class50.field455.vmethod5851(0, 0);

         for(var3 = 0; var3 < field793; ++var3) {
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
      if(class242.field3144.method1926()) {
         class242.field3144.method1931();
      }

      if(class257.field3282 != null) {
         class257.field3282.field531 = false;
      }

      class257.field3282 = null;
      field739.method2023();
      if(class39.field350 != null) {
         class39 var1 = class39.field350;
         synchronized(class39.field350) {
            class39.field350 = null;
         }
      }

      if(class48.field419 != null) {
         class48 var9 = class48.field419;
         synchronized(class48.field419) {
            class48.field419 = null;
         }
      }

      class173.field2289 = null;
      if(class2.field11 != null) {
         class2.field11.method2195();
      }

      if(class191.field2411 != null) {
         class191.field2411.method2195();
      }

      if(class250.field3217 != null) {
         class250.field3217.vmethod3368();
      }

      Object var10 = class248.field3194;
      synchronized(class248.field3194) {
         if(class248.field3191 != 0) {
            class248.field3191 = 1;

            try {
               class248.field3194.wait();
            } catch (InterruptedException var5) {
               ;
            }
         }
      }

      if(class59.field552 != null) {
         class59.field552.method3120();
         class59.field552 = null;
      }

      class76.method1851();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1726845378"
   )
   protected final void vmethod1192() {}

   public final void init() {
      try {
         if(this.method849()) {
            class279[] var1 = new class279[]{class279.field3604, class279.field3605, class279.field3608, class279.field3610, class279.field3599, class279.field3607, class279.field3612, class279.field3606, class279.field3611, class279.field3600, class279.field3597, class279.field3609, class279.field3603, class279.field3598, class279.field3601, class279.field3602};
            class279[] var2 = var1;

            int var3;
            String var5;
            int var7;
            int var9;
            for(var3 = 0; var3 < var2.length; ++var3) {
               class279 var4 = var2[var3];
               var5 = this.getParameter(var4.field3613);
               if(var5 != null) {
                  switch(Integer.parseInt(var4.field3613)) {
                  case 1:
                     if(var5.equalsIgnoreCase("true")) {
                        field628 = true;
                     } else {
                        field628 = false;
                     }
                  case 2:
                  case 3:
                  case 7:
                  default:
                     break;
                  case 4:
                     class56.field521 = var5;
                     break;
                  case 5:
                     field596 = Integer.parseInt(var5);
                     break;
                  case 6:
                     class170.field2265 = (class244)class7.method89(class132.method3112(), Integer.parseInt(var5));
                     if(class170.field2265 == class244.field3158) {
                        class19.field168 = class322.field3878;
                     } else {
                        class19.field168 = class322.field3883;
                     }
                     break;
                  case 8:
                     field642 = Integer.parseInt(var5) != 0;
                     break;
                  case 9:
                     var7 = Integer.parseInt(var5);
                     class243[] var8 = class137.method3149();
                     var9 = 0;

                     class243 var6;
                     while(true) {
                        if(var9 >= var8.length) {
                           var6 = null;
                           break;
                        }

                        class243 var10 = var8[var9];
                        if(var7 == var10.field3149) {
                           var6 = var10;
                           break;
                        }

                        ++var9;
                     }

                     class70.field1042 = var6;
                     break;
                  case 10:
                     if(field600 == -1) {
                        field600 = Integer.parseInt(var5);
                     }
                     break;
                  case 11:
                     class25.field231 = Integer.parseInt(var5);
                     break;
                  case 12:
                     if(var5.equalsIgnoreCase("true")) {
                        ;
                     }
                     break;
                  case 13:
                     field726 = Integer.parseInt(var5);
                     break;
                  case 14:
                     field599 = Integer.parseInt(var5);
                     break;
                  case 15:
                     field676 = Integer.parseInt(var5);
                     break;
                  case 16:
                     class40.field357 = var5;
                  }
               }
            }

            class95.method2253();
            class0.field1 = this.getCodeBase().getHost();
            String var33 = class70.field1042.field3150;
            byte var17 = 0;

            try {
               class155.field1990 = 17;
               class313.field3765 = var17;

               try {
                  class135.field1875 = System.getProperty("os.name");
               } catch (Exception var28) {
                  class135.field1875 = "Unknown";
               }

               class129.field1823 = class135.field1875.toLowerCase();

               try {
                  class129.field1822 = System.getProperty("user.home");
                  if(class129.field1822 != null) {
                     class129.field1822 = class129.field1822 + "/";
                  }
               } catch (Exception var27) {
                  ;
               }

               try {
                  if(class129.field1823.startsWith("win")) {
                     if(class129.field1822 == null) {
                        class129.field1822 = System.getenv("USERPROFILE");
                     }
                  } else if(class129.field1822 == null) {
                     class129.field1822 = System.getenv("HOME");
                  }

                  if(class129.field1822 != null) {
                     class129.field1822 = class129.field1822 + "/";
                  }
               } catch (Exception var26) {
                  ;
               }

               if(class129.field1822 == null) {
                  class129.field1822 = "~/";
               }

               class155.field1981 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class129.field1822, "/tmp/", ""};
               class155.field1995 = new String[]{".jagex_cache_" + class313.field3765, ".file_store_" + class313.field3765};
               var3 = 0;

               label253:
               while(true) {
                  if(var3 < 4) {
                     var5 = var3 == 0?"":"" + var3;
                     class155.field1984 = new File(class129.field1822, "jagex_cl_oldschool_" + var33 + var5 + ".dat");
                     String var36 = null;
                     String var19 = null;
                     boolean var20 = false;
                     File var39;
                     if(class155.field1984.exists()) {
                        try {
                           class110 var21 = new class110(class155.field1984, "rw", 10000L);

                           int var11;
                           class182 var38;
                           for(var38 = new class182((int)var21.method2574()); var38.field2359 < var38.field2365.length; var38.field2359 += var11) {
                              var11 = var21.method2560(var38.field2365, var38.field2359, var38.field2365.length - var38.field2359);
                              if(var11 == -1) {
                                 throw new IOException();
                              }
                           }

                           var38.field2359 = 0;
                           var11 = var38.method3742();
                           if(var11 < 1 || var11 > 3) {
                              throw new IOException("" + var11);
                           }

                           int var12 = 0;
                           if(var11 > 1) {
                              var12 = var38.method3742();
                           }

                           if(var11 <= 2) {
                              var36 = var38.method3666();
                              if(var12 == 1) {
                                 var19 = var38.method3666();
                              }
                           } else {
                              var36 = var38.method3571();
                              if(var12 == 1) {
                                 var19 = var38.method3571();
                              }
                           }

                           var21.method2564();
                        } catch (IOException var30) {
                           var30.printStackTrace();
                        }

                        if(var36 != null) {
                           var39 = new File(var36);
                           if(!var39.exists()) {
                              var36 = null;
                           }
                        }

                        if(var36 != null) {
                           var39 = new File(var36, "test.dat");
                           if(!class20.method294(var39, true)) {
                              var36 = null;
                           }
                        }
                     }

                     if(var36 == null && var3 == 0) {
                        label219:
                        for(var9 = 0; var9 < class155.field1995.length; ++var9) {
                           for(int var22 = 0; var22 < class155.field1981.length; ++var22) {
                              File var23 = new File(class155.field1981[var22] + class155.field1995[var9] + File.separatorChar + "oldschool" + File.separatorChar);
                              if(var23.exists() && class20.method294(new File(var23, "test.dat"), true)) {
                                 var36 = var23.toString();
                                 var20 = true;
                                 break label219;
                              }
                           }
                        }
                     }

                     if(var36 == null) {
                        var36 = class129.field1822 + File.separatorChar + "jagexcache" + var5 + File.separatorChar + "oldschool" + File.separatorChar + var33 + File.separatorChar;
                        var20 = true;
                     }

                     if(var19 != null) {
                        File var41 = new File(var19);
                        var39 = new File(var36);

                        try {
                           File[] var42 = var41.listFiles();
                           File[] var24 = var42;

                           for(int var13 = 0; var13 < var24.length; ++var13) {
                              File var14 = var24[var13];
                              File var15 = new File(var39, var14.getName());
                              boolean var16 = var14.renameTo(var15);
                              if(!var16) {
                                 throw new IOException();
                              }
                           }
                        } catch (Exception var29) {
                           var29.printStackTrace();
                        }

                        var20 = true;
                     }

                     if(var20) {
                        class81.method1921(new File(var36), (File)null);
                     }

                     File var34 = new File(var36);
                     class155.field1985 = var34;
                     if(!class155.field1985.exists()) {
                        class155.field1985.mkdirs();
                     }

                     File[] var35 = class155.field1985.listFiles();
                     if(var35 != null) {
                        File[] var40 = var35;

                        for(var7 = 0; var7 < var40.length; ++var7) {
                           File var37 = var40[var7];
                           if(!class20.method294(var37, false)) {
                              ++var3;
                              continue label253;
                           }
                        }
                     }
                  }

                  File var18 = class155.field1985;
                  class158.field2000 = var18;
                  if(!class158.field2000.exists()) {
                     throw new RuntimeException("");
                  }

                  class158.field2001 = true;
                  class286.method5431();
                  class155.field1989 = new class109(new class110(class224.method4458("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
                  class155.field1993 = new class109(new class110(class224.method4458("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
                  class155.field1983 = new class109[class155.field1990];
                  int var25 = 0;

                  while(true) {
                     if(var25 >= class155.field1990) {
                        break label253;
                     }

                     class155.field1983[var25] = new class109(new class110(class224.method4458("main_file_cache.idx" + var25), "rw", 1048576L), 6000, 0);
                     ++var25;
                  }
               }
            } catch (Exception var31) {
               class43.method786((String)null, var31);
            }

            class37.field321 = this;
            class152.field1959 = field600;
            this.method847(765, 503, 170);
         }
      } catch (RuntimeException var32) {
         throw class1.method12(var32, "client.init(" + ')');
      }
   }

   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1674862603"
   )
   void method1198() {
      if(field611 != 1000) {
         boolean var1 = class137.method3141();
         if(!var1) {
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
      if(class250.field3226 >= 4) {
         this.method867("js5crc");
         field611 = 1000;
      } else {
         if(class250.field3227 >= 4) {
            if(field611 <= 5) {
               this.method867("js5io");
               field611 = 1000;
               return;
            }

            field625 = 3000;
            class250.field3227 = 3;
         }

         if(--field625 + 1 <= 0) {
            try {
               if(field624 == 0) {
                  class12.field94 = class47.field409.method3245(class0.field1, class12.field91);
                  ++field624;
               }

               if(field624 == 1) {
                  if(class12.field94.field1966 == 2) {
                     this.method1200(-1);
                     return;
                  }

                  if(class12.field94.field1966 == 1) {
                     ++field624;
                  }
               }

               if(field624 == 2) {
                  if(field642) {
                     field623 = class14.method154((Socket)class12.field94.field1970, '\u9c40', 5000);
                  } else {
                     field623 = new class161((Socket)class12.field94.field1970, class47.field409, 5000);
                  }

                  class182 var1 = new class182(5);
                  var1.method3552(15);
                  var1.method3555(170);
                  field623.vmethod3385(var1.field2365, 0, 5);
                  ++field624;
                  class43.field362 = class166.method3456();
               }

               if(field624 == 3) {
                  if(field623.vmethod3354() <= 0 && (field642 || field611 > 5)) {
                     if(class166.method3456() - class43.field362 > 30000L) {
                        this.method1200(-2);
                        return;
                     }
                  } else {
                     int var5 = field623.vmethod3353();
                     if(var5 != 0) {
                        this.method1200(var5);
                        return;
                     }

                     ++field624;
                  }
               }

               if(field624 == 4) {
                  class157 var10 = field623;
                  boolean var2 = field611 > 20;
                  if(class250.field3217 != null) {
                     try {
                        class250.field3217.vmethod3368();
                     } catch (Exception var8) {
                        ;
                     }

                     class250.field3217 = null;
                  }

                  class250.field3217 = var10;
                  class14.method139(var2);
                  class250.field3208.field2359 = 0;
                  class320.field3816 = null;
                  class232.field2771 = null;
                  class250.field3221 = 0;

                  while(true) {
                     class246 var3 = (class246)class250.field3213.method4055();
                     if(var3 == null) {
                        while(true) {
                           var3 = (class246)class250.field3222.method4055();
                           if(var3 == null) {
                              if(class250.field3225 != 0) {
                                 try {
                                    class182 var11 = new class182(4);
                                    var11.method3552(4);
                                    var11.method3552(class250.field3225);
                                    var11.method3602(0);
                                    class250.field3217.vmethod3385(var11.field2365, 0, 4);
                                 } catch (IOException var7) {
                                    try {
                                       class250.field3217.vmethod3368();
                                    } catch (Exception var6) {
                                       ;
                                    }

                                    ++class250.field3227;
                                    class250.field3217 = null;
                                 }
                              }

                              class250.field3209 = 0;
                              class250.field3223 = class166.method3456();
                              class12.field94 = null;
                              field623 = null;
                              field624 = 0;
                              field595 = 0;
                              return;
                           }

                           class250.field3215.method3965(var3);
                           class250.field3216.method4063(var3, var3.field2449);
                           ++class250.field3219;
                           --class250.field3210;
                        }
                     }

                     class250.field3211.method4063(var3, var3.field2449);
                     ++class250.field3212;
                     --class250.field3214;
                  }
               }
            } catch (IOException var9) {
               this.method1200(-3);
            }

         }
      }
   }

   @ObfuscatedName("fg")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1109811529"
   )
   void method1200(int var1) {
      class12.field94 = null;
      field623 = null;
      field624 = 0;
      if(class12.field91 == class168.field2111) {
         class12.field91 = class13.field101;
      } else {
         class12.field91 = class168.field2111;
      }

      ++field595;
      if(field595 >= 2 && (var1 == 7 || var1 == 9)) {
         if(field611 <= 5) {
            this.method867("js5connect_full");
            field611 = 1000;
         } else {
            field625 = 3000;
         }
      } else if(field595 >= 2 && var1 == 6) {
         this.method867("js5connect_outofdate");
         field611 = 1000;
      } else if(field595 >= 4) {
         if(field611 <= 5) {
            this.method867("js5connect");
            field611 = 1000;
         } else {
            field625 = 3000;
         }
      }

   }

   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "991472139"
   )
   final void method1201() {
      Object var1 = field739.method2045();
      class189 var2 = field739.field1254;

      try {
         if(field838 == 0) {
            if(var1 != null) {
               ((class157)var1).vmethod3368();
               var1 = null;
            }

            class118.field1584 = null;
            field641 = false;
            field645 = 0;
            field838 = 1;
         }

         if(field838 == 1) {
            if(class118.field1584 == null) {
               class118.field1584 = class47.field409.method3245(class0.field1, class12.field91);
            }

            if(class118.field1584.field1966 == 2) {
               throw new IOException();
            }

            if(class118.field1584.field1966 == 1) {
               if(field642) {
                  var1 = class14.method154((Socket)class118.field1584.field1970, '\u9c40', 5000);
               } else {
                  var1 = new class161((Socket)class118.field1584.field1970, class47.field409, 5000);
               }

               field739.method2022((class157)var1);
               class118.field1584 = null;
               field838 = 2;
            }
         }

         if(field838 == 2) {
            field739.method2020();
            class172 var3 = class168.method3458();
            var3.field2279.method3552(class170.field2261.field2262);
            field739.method2019(var3);
            field739.method2034();
            var2.field2359 = 0;
            field838 = 3;
         }

         int var4;
         boolean var11;
         if(field838 == 3) {
            if(class2.field11 != null) {
               class2.field11.method2193();
            }

            if(class191.field2411 != null) {
               class191.field2411.method2193();
            }

            var11 = true;
            if(field642 && !((class157)var1).vmethod3355(1)) {
               var11 = false;
            }

            if(var11) {
               var4 = ((class157)var1).vmethod3353();
               if(class2.field11 != null) {
                  class2.field11.method2193();
               }

               if(class191.field2411 != null) {
                  class191.field2411.method2193();
               }

               if(var4 != 0) {
                  class19.method221(var4);
                  return;
               }

               var2.field2359 = 0;
               field838 = 4;
            }
         }

         int var23;
         if(field838 == 4) {
            if(var2.field2359 < 8) {
               var23 = ((class157)var1).vmethod3354();
               if(var23 > 8 - var2.field2359) {
                  var23 = 8 - var2.field2359;
               }

               if(var23 > 0) {
                  ((class157)var1).vmethod3356(var2.field2365, var2.field2359, var23);
                  var2.field2359 += var23;
               }
            }

            if(var2.field2359 == 8) {
               var2.field2359 = 0;
               class165.field2065 = var2.method3792();
               field838 = 5;
            }
         }

         int var7;
         if(field838 == 5) {
            field739.field1254.field2359 = 0;
            field739.method2020();
            class189 var17 = new class189(500);
            int[] var12 = new int[]{(int)(Math.random() * 9.9999999E7D), (int)(Math.random() * 9.9999999E7D), (int)(class165.field2065 >> 32), (int)(class165.field2065 & -1L)};
            var17.field2359 = 0;
            var17.method3552(1);
            var17.method3552(field716.vmethod5860());
            var17.method3555(var12[0]);
            var17.method3555(var12[1]);
            var17.method3555(var12[2]);
            var17.method3555(var12[3]);
            switch(field716.field1928) {
            case 0:
            case 2:
               var17.method3554(class58.field549);
               var17.field2359 += 5;
               break;
            case 1:
               var17.method3555(((Integer)class51.field468.field975.get(Integer.valueOf(method1577(class78.field1127)))).intValue());
               var17.field2359 += 4;
               break;
            case 3:
               var17.field2359 += 8;
            }

            var17.method3549(class78.field1143);
            var17.method3601(class76.field1093, class76.field1087);
            class172 var5 = class168.method3458();
            var5.field2279.field2359 = 0;
            if(field611 == 40) {
               var5.field2279.method3552(class170.field2258.field2262);
            } else {
               var5.field2279.method3552(class170.field2260.field2262);
            }

            var5.field2279.method3602(0);
            int var6 = var5.field2279.field2359;
            var5.field2279.method3555(170);
            var5.field2279.method3628(var17.field2365, 0, var17.field2359);
            var7 = var5.field2279.field2359;
            var5.field2279.method3549(class78.field1127);
            var5.field2279.method3552((field675?1:0) << 1 | (field708?1:0));
            var5.field2279.method3602(class9.field70);
            var5.field2279.method3602(class37.field326);
            class189 var8 = var5.field2279;
            if(field718 != null) {
               var8.method3628(field718, 0, field718.length);
            } else {
               byte[] var9 = class227.method4515();
               var8.method3628(var9, 0, var9.length);
            }

            var5.field2279.method3549(class40.field357);
            var5.field2279.method3555(class25.field231);
            class182 var22 = new class182(class77.field1100.method6250());
            class77.field1100.method6249(var22);
            var5.field2279.method3628(var22.field2365, 0, var22.field2365.length);
            var5.field2279.method3552(field600);
            var5.field2279.method3555(0);
            var5.field2279.method3555(class245.field3161.field3180);
            var5.field2279.method3555(field626.field3180);
            var5.field2279.method3555(class9.field62.field3180);
            var5.field2279.method3555(class19.field169.field3180);
            var5.field2279.method3555(class110.field1459.field3180);
            var5.field2279.method3555(class234.field2796.field3180);
            var5.field2279.method3555(class48.field436.field3180);
            var5.field2279.method3555(class216.field2477.field3180);
            var5.field2279.method3555(class59.field553.field3180);
            var5.field2279.method3555(class183.field2374.field3180);
            var5.field2279.method3555(class22.field196.field3180);
            var5.field2279.method3555(class55.field508.field3180);
            var5.field2279.method3555(class3.field21.field3180);
            var5.field2279.method3555(class3.field24.field3180);
            var5.field2279.method3555(class10.field77.field3180);
            var5.field2279.method3555(class6.field40.field3180);
            var5.field2279.method3555(class48.field435.field3180);
            var5.field2279.method3589(var12, var7, var5.field2279.field2359);
            var5.field2279.method3734(var5.field2279.field2359 - var6);
            field739.method2019(var5);
            field739.method2034();
            field739.field1250 = new class190(var12);

            for(int var10 = 0; var10 < 4; ++var10) {
               var12[var10] += 50;
            }

            var2.method3882(var12);
            field838 = 6;
         }

         if(field838 == 6 && ((class157)var1).vmethod3354() > 0) {
            var23 = ((class157)var1).vmethod3353();
            if(var23 == 21 && field611 == 20) {
               field838 = 7;
            } else if(var23 == 2) {
               field838 = 9;
            } else if(var23 == 15 && field611 == 40) {
               field739.field1247 = -1;
               field838 = 13;
            } else if(var23 == 23 && field630 < 1) {
               ++field630;
               field838 = 0;
            } else {
               if(var23 != 29) {
                  class19.method221(var23);
                  return;
               }

               field838 = 11;
            }
         }

         if(field838 == 7 && ((class157)var1).vmethod3354() > 0) {
            field631 = (((class157)var1).vmethod3353() + 3) * 60;
            field838 = 8;
         }

         if(field838 == 8) {
            field645 = 0;
            class102.method2307("You have only just left another world.", "Your profile will be transferred in:", field631 / 60 + " seconds.");
            if(--field631 <= 0) {
               field838 = 0;
            }

         } else {
            if(field838 == 9 && ((class157)var1).vmethod3354() >= 13) {
               var11 = ((class157)var1).vmethod3353() == 1;
               ((class157)var1).vmethod3356(var2.field2365, 0, 4);
               var2.field2359 = 0;
               boolean var19 = false;
               if(var11) {
                  var4 = var2.method3868() << 24;
                  var4 |= var2.method3868() << 16;
                  var4 |= var2.method3868() << 8;
                  var4 |= var2.method3868();
                  int var13 = method1577(class78.field1127);
                  if(class51.field468.field975.size() >= 10 && !class51.field468.field975.containsKey(Integer.valueOf(var13))) {
                     Iterator var14 = class51.field468.field975.entrySet().iterator();
                     var14.next();
                     var14.remove();
                  }

                  class51.field468.field975.put(Integer.valueOf(var13), Integer.valueOf(var4));
               }

               if(class78.field1129) {
                  class51.field468.field980 = class78.field1127;
               } else {
                  class51.field468.field980 = null;
               }

               class266.method5008();
               field729 = ((class157)var1).vmethod3353();
               field761 = ((class157)var1).vmethod3353() == 1;
               field709 = ((class157)var1).vmethod3353();
               field709 <<= 8;
               field709 += ((class157)var1).vmethod3353();
               field710 = ((class157)var1).vmethod3353();
               ((class157)var1).vmethod3356(var2.field2365, 0, 1);
               var2.field2359 = 0;
               class168[] var20 = new class168[]{class168.field2092, class168.field2127, class168.field2082, class168.field2149, class168.field2079, class168.field2076, class168.field2077, class168.field2119, class168.field2074, class168.field2080, class168.field2134, class168.field2071, class168.field2083, class168.field2084, class168.field2085, class168.field2086, class168.field2122, class168.field2088, class168.field2089, class168.field2099, class168.field2091, class168.field2096, class168.field2093, class168.field2094, class168.field2081, class168.field2087, class168.field2097, class168.field2098, class168.field2128, class168.field2100, class168.field2101, class168.field2102, class168.field2103, class168.field2104, class168.field2105, class168.field2106, class168.field2107, class168.field2108, class168.field2109, class168.field2110, class168.field2072, class168.field2112, class168.field2113, class168.field2114, class168.field2115, class168.field2116, class168.field2117, class168.field2118, class168.field2095, class168.field2120, class168.field2151, class168.field2090, class168.field2123, class168.field2124, class168.field2125, class168.field2126, class168.field2073, class168.field2156, class168.field2157, class168.field2130, class168.field2131, class168.field2132, class168.field2133, class168.field2138, class168.field2135, class168.field2136, class168.field2137, class168.field2152, class168.field2139, class168.field2140, class168.field2121, class168.field2142, class168.field2143, class168.field2129, class168.field2145, class168.field2146, class168.field2144, class168.field2078, class168.field2154, class168.field2150, class168.field2075, class168.field2147, class168.field2153, class168.field2148};
               var7 = var2.method3883();
               if(var7 < 0 || var7 >= var20.length) {
                  throw new IOException(var7 + " " + var2.field2359);
               }

               field739.field1246 = var20[var7];
               field739.field1247 = field739.field1246.field2141;
               ((class157)var1).vmethod3356(var2.field2365, 0, 2);
               var2.field2359 = 0;
               field739.field1247 = var2.method3574();

               try {
                  class41.method769(class37.field321, "zap");
               } catch (Throwable var15) {
                  ;
               }

               field838 = 10;
            }

            if(field838 == 10) {
               if(((class157)var1).vmethod3354() >= field739.field1247) {
                  var2.field2359 = 0;
                  ((class157)var1).vmethod3356(var2.field2365, 0, field739.field1247);
                  field840.method5259();
                  class16.method186();
                  class83.method1987(var2);
                  class11.field82 = -1;
                  class56.method1083(false, var2);
                  field739.field1246 = null;
               }

            } else {
               if(field838 == 11 && ((class157)var1).vmethod3354() >= 2) {
                  var2.field2359 = 0;
                  ((class157)var1).vmethod3356(var2.field2365, 0, 2);
                  var2.field2359 = 0;
                  class81.field1192 = var2.method3574();
                  field838 = 12;
               }

               if(field838 == 12 && ((class157)var1).vmethod3354() >= class81.field1192) {
                  var2.field2359 = 0;
                  ((class157)var1).vmethod3356(var2.field2365, 0, class81.field1192);
                  var2.field2359 = 0;
                  String var18 = var2.method3577();
                  String var24 = var2.method3577();
                  String var21 = var2.method3577();
                  class102.method2307(var18, var24, var21);
                  class102.method2310(10);
               }

               if(field838 == 13) {
                  if(field739.field1247 == -1) {
                     if(((class157)var1).vmethod3354() < 2) {
                        return;
                     }

                     ((class157)var1).vmethod3356(var2.field2365, 0, 2);
                     var2.field2359 = 0;
                     field739.field1247 = var2.method3574();
                  }

                  if(((class157)var1).vmethod3354() >= field739.field1247) {
                     ((class157)var1).vmethod3356(var2.field2365, 0, field739.field1247);
                     var2.field2359 = 0;
                     var23 = field739.field1247;
                     field840.method5260();
                     class109.method2549();
                     class83.method1987(var2);
                     if(var23 != var2.field2359) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field645;
                  if(field645 > 2000) {
                     if(field630 < 1) {
                        if(class168.field2111 == class12.field91) {
                           class12.field91 = class13.field101;
                        } else {
                           class12.field91 = class168.field2111;
                        }

                        ++field630;
                        field838 = 0;
                     } else {
                        class19.method221(-3);
                     }
                  }
               }
            }
         }
      } catch (IOException var16) {
         if(field630 < 1) {
            if(class12.field91 == class168.field2111) {
               class12.field91 = class13.field101;
            } else {
               class12.field91 = class168.field2111;
            }

            ++field630;
            field838 = 0;
         } else {
            class19.method221(-2);
         }
      }
   }

   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2042781731"
   )
   final void method1202() {
      if(field643 > 1) {
         --field643;
      }

      if(field688 > 0) {
         --field688;
      }

      if(field641) {
         field641 = false;
         class86.method2018();
      } else {
         if(!field846) {
            class63.method1597();
         }

         int var1;
         for(var1 = 0; var1 < 100 && this.method1572(field739); ++var1) {
            ;
         }

         if(field611 == 30) {
            int var2;
            class172 var14;
            while(class30.method562()) {
               var14 = class133.method3115(class169.field2182, field739.field1250);
               var14.field2279.method3552(0);
               var2 = var14.field2279.field2359;
               class21.method306(var14.field2279);
               var14.field2279.method3565(var14.field2279.field2359 - var2);
               field739.method2019(var14);
            }

            if(field840.field3616) {
               var14 = class133.method3115(class169.field2190, field739.field1250);
               var14.field2279.method3552(0);
               var2 = var14.field2279.field2359;
               field840.method5261(var14.field2279);
               var14.field2279.method3565(var14.field2279.field2359 - var2);
               field739.method2019(var14);
               field840.method5254();
            }

            Object var32 = class257.field3282.field528;
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            synchronized(class257.field3282.field528) {
               if(field780) {
                  if(class48.field431 != 0 || class257.field3282.field533 >= 40) {
                     class172 var15 = class133.method3115(class169.field2251, field739.field1250);
                     var15.field2279.method3552(0);
                     var3 = var15.field2279.field2359;
                     var4 = 0;

                     for(var5 = 0; var5 < class257.field3282.field533 && var15.field2279.field2359 - var3 < 240; ++var5) {
                        ++var4;
                        var6 = class257.field3282.field529[var5];
                        if(var6 < 0) {
                           var6 = 0;
                        } else if(var6 > 502) {
                           var6 = 502;
                        }

                        var7 = class257.field3282.field530[var5];
                        if(var7 < 0) {
                           var7 = 0;
                        } else if(var7 > 764) {
                           var7 = 764;
                        }

                        var8 = var6 * 765 + var7;
                        if(class257.field3282.field529[var5] == -1 && class257.field3282.field530[var5] == -1) {
                           var7 = -1;
                           var6 = -1;
                           var8 = 524287;
                        }

                        if(var7 == field606 && var6 == field607) {
                           if(field608 < 2047) {
                              ++field608;
                           }
                        } else {
                           var9 = var7 - field606;
                           field606 = var7;
                           var10 = var6 - field607;
                           field607 = var6;
                           if(field608 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                              var9 += 32;
                              var10 += 32;
                              var15.field2279.method3602(var10 + (field608 << 12) + (var9 << 6));
                              field608 = 0;
                           } else if(field608 < 8) {
                              var15.field2279.method3554((field608 << 19) + var8 + 8388608);
                              field608 = 0;
                           } else {
                              var15.field2279.method3555((field608 << 19) + var8 + -1073741824);
                              field608 = 0;
                           }
                        }
                     }

                     var15.field2279.method3565(var15.field2279.field2359 - var3);
                     field739.method2019(var15);
                     if(var4 >= class257.field3282.field533) {
                        class257.field3282.field533 = 0;
                     } else {
                        class257.field3282.field533 -= var4;

                        for(var5 = 0; var5 < class257.field3282.field533; ++var5) {
                           class257.field3282.field530[var5] = class257.field3282.field530[var4 + var5];
                           class257.field3282.field529[var5] = class257.field3282.field529[var4 + var5];
                        }
                     }
                  }
               } else {
                  class257.field3282.field533 = 0;
               }
            }

            if(class48.field431 == 1 || !class8.field57 && class48.field431 == 4 || class48.field431 == 2) {
               long var16 = (class48.field434 - field605) / 50L;
               if(var16 > 4095L) {
                  var16 = 4095L;
               }

               field605 = class48.field434;
               var3 = class48.field437;
               if(var3 < 0) {
                  var3 = 0;
               } else if(var3 > class37.field326) {
                  var3 = class37.field326;
               }

               var4 = class48.field432;
               if(var4 < 0) {
                  var4 = 0;
               } else if(var4 > class9.field70) {
                  var4 = class9.field70;
               }

               var5 = (int)var16;
               class172 var18 = class133.method3115(class169.field2193, field739.field1250);
               var18.field2279.method3602((var5 << 1) + (class48.field431 == 2?1:0));
               var18.field2279.method3602(var4);
               var18.field2279.method3602(var3);
               field739.method2019(var18);
            }

            if(class39.field347 > 0) {
               var14 = class133.method3115(class169.field2208, field739.field1250);
               var14.field2279.method3602(0);
               var2 = var14.field2279.field2359;
               long var19 = class166.method3456();

               for(var5 = 0; var5 < class39.field347; ++var5) {
                  long var21 = var19 - field782;
                  if(var21 > 16777215L) {
                     var21 = 16777215L;
                  }

                  field782 = var19;
                  var14.field2279.method3633((int)var21);
                  var14.field2279.method3552(class39.field346[var5]);
               }

               var14.field2279.method3734(var14.field2279.field2359 - var2);
               field739.method2019(var14);
            }

            if(field801 > 0) {
               --field801;
            }

            if(class39.field340[96] || class39.field340[97] || class39.field340[98] || class39.field340[99]) {
               field677 = true;
            }

            if(field677 && field801 <= 0) {
               field801 = 20;
               field677 = false;
               var14 = class133.method3115(class169.field2162, field739.field1250);
               var14.field2279.method3605(field632);
               var14.field2279.method3707(field662);
               field739.method2019(var14);
            }

            if(class66.field978 && !field609) {
               field609 = true;
               var14 = class133.method3115(class169.field2246, field739.field1250);
               var14.field2279.method3552(1);
               field739.method2019(var14);
            }

            if(!class66.field978 && field609) {
               field609 = false;
               var14 = class133.method3115(class169.field2246, field739.field1250);
               var14.field2279.method3552(0);
               field739.method2019(var14);
            }

            if(class66.field987 != null) {
               class66.field987.method6049();
            }

            class130.method3091();
            class55.method1075();
            if(field611 == 30) {
               for(class62 var34 = (class62)field721.method4113(); var34 != null; var34 = (class62)field721.method4104()) {
                  if(var34.field877 > 0) {
                     --var34.field877;
                  }

                  if(var34.field877 == 0) {
                     if(var34.field870 < 0 || class26.method470(var34.field870, var34.field872)) {
                        class24.method459(var34.field873, var34.field869, var34.field868, var34.field880, var34.field870, var34.field871, var34.field872);
                        var34.method4098();
                     }
                  } else {
                     if(var34.field867 > 0) {
                        --var34.field867;
                     }

                     if(var34.field867 == 0 && var34.field868 >= 1 && var34.field880 >= 1 && var34.field868 <= 102 && var34.field880 <= 102 && (var34.field866 < 0 || class26.method470(var34.field866, var34.field875))) {
                        class24.method459(var34.field873, var34.field869, var34.field868, var34.field880, var34.field866, var34.field874, var34.field875);
                        var34.field867 = -1;
                        if(var34.field870 == var34.field866 && var34.field870 == -1) {
                           var34.method4098();
                        } else if(var34.field866 == var34.field870 && var34.field871 == var34.field874 && var34.field875 == var34.field872) {
                           var34.method4098();
                        }
                     }
                  }
               }

               class42.method774();
               ++field739.field1249;
               if(field739.field1249 > 750) {
                  class86.method2018();
               } else {
                  class24.method458();

                  for(var1 = 0; var1 < field635; ++var1) {
                     var2 = field636[var1];
                     class72 var23 = field807[var2];
                     if(var23 != null) {
                        class68.method1747(var23, var23.field1058.field3519);
                     }
                  }

                  class68.method1746();
                  ++field654;
                  if(field696 != 0) {
                     field843 += 20;
                     if(field843 >= 400) {
                        field696 = 0;
                     }
                  }

                  if(class144.field1921 != null) {
                     ++field698;
                     if(field698 >= 15) {
                        class181.method3548(class144.field1921);
                        class144.field1921 = null;
                     }
                  }

                  class230 var35 = class37.field329;
                  class230 var33 = class7.field42;
                  class37.field329 = null;
                  class7.field42 = null;
                  field700 = null;
                  field860 = false;
                  field594 = false;
                  field845 = 0;

                  while(class95.method2208() && field845 < 128) {
                     if(field729 >= 2 && class39.field340[82] && class128.field1813 == 66) {
                        String var36 = class10.method101();
                        class37.field321.method929(var36);
                     } else if(field678 != 1 || class132.field1846 <= 0) {
                        field865[field845] = class128.field1813;
                        field812[field845] = class132.field1846;
                        ++field845;
                     }
                  }

                  if(class139.method3161() && class39.field340[82] && class39.field340[81] && field788 != 0) {
                     var3 = class150.field1948.field581 - field788;
                     if(var3 < 0) {
                        var3 = 0;
                     } else if(var3 > 3) {
                        var3 = 3;
                     }

                     if(var3 != class150.field1948.field581) {
                        class145.method3194(class150.field1948.field928[0] + class178.field2315, class150.field1948.field939[0] + class71.field1051, var3, false);
                     }

                     field788 = 0;
                  }

                  if(field752 != -1) {
                     var3 = field752;
                     var4 = class9.field70;
                     var5 = class37.field326;
                     if(class42.method785(var3)) {
                        class2.method25(class230.field2615[var3], -1, 0, 0, var4, var5, 0, 0);
                     }
                  }

                  ++field775;

                  while(true) {
                     class56 var37 = (class56)field790.method4109();
                     class230 var24;
                     class230 var25;
                     if(var37 == null) {
                        while(true) {
                           var37 = (class56)field791.method4109();
                           if(var37 == null) {
                              while(true) {
                                 var37 = (class56)field755.method4109();
                                 if(var37 == null) {
                                    this.method1207();
                                    if(class66.field987 != null) {
                                       class66.field987.method6222(class192.field2415, (class150.field1948.field900 >> 7) + class178.field2315, (class150.field1948.field918 >> 7) + class71.field1051, false);
                                       class66.field987.method6074();
                                    }

                                    if(field763 != null) {
                                       this.method1238();
                                    }

                                    if(class49.field442 != null) {
                                       class181.method3548(class49.field442);
                                       ++field705;
                                       if(class48.field424 == 0) {
                                          if(field704) {
                                             if(class295.field3688 == class49.field442 && field597 != field703) {
                                                class230 var38 = class49.field442;
                                                byte var30 = 0;
                                                if(field814 == 1 && var38.field2711 == 206) {
                                                   var30 = 1;
                                                }

                                                if(var38.field2758[field703] <= 0) {
                                                   var30 = 0;
                                                }

                                                var6 = class95.method2252(var38);
                                                boolean var31 = (var6 >> 29 & 1) != 0;
                                                if(var31) {
                                                   var7 = field597;
                                                   var8 = field703;
                                                   var38.field2758[var8] = var38.field2758[var7];
                                                   var38.field2743[var8] = var38.field2743[var7];
                                                   var38.field2758[var7] = -1;
                                                   var38.field2743[var7] = 0;
                                                } else if(var30 == 1) {
                                                   var7 = field597;
                                                   var8 = field703;

                                                   while(var8 != var7) {
                                                      if(var7 > var8) {
                                                         var38.method4525(var7 - 1, var7);
                                                         --var7;
                                                      } else if(var7 < var8) {
                                                         var38.method4525(var7 + 1, var7);
                                                         ++var7;
                                                      }
                                                   }
                                                } else {
                                                   var38.method4525(field703, field597);
                                                }

                                                class172 var26 = class133.method3115(class169.field2244, field739.field1250);
                                                var26.field2279.method3605(field703);
                                                var26.field2279.method3670(class49.field442.field2623);
                                                var26.field2279.method3707(field597);
                                                var26.field2279.method3596(var30);
                                                field739.method2019(var26);
                                             }
                                          } else if(this.method1208()) {
                                             this.method1453(field701, field640);
                                          } else if(field657 > 0) {
                                             var3 = field701;
                                             var4 = field640;
                                             class23.method455(class184.field2376, var3, var4);
                                             class184.field2376 = null;
                                          }

                                          field698 = 10;
                                          class48.field431 = 0;
                                          class49.field442 = null;
                                       } else if(field705 >= 5 && (class48.field425 > field701 + 5 || class48.field425 < field701 - 5 || class48.field417 > field640 + 5 || class48.field417 < field640 - 5)) {
                                          field704 = true;
                                       }
                                    }

                                    class172 var39;
                                    if(class125.method2940()) {
                                       var3 = class125.field1776;
                                       var4 = class125.field1748;
                                       var39 = class133.method3115(class169.field2210, field739.field1250);
                                       var39.field2279.method3552(5);
                                       var39.field2279.method3605(var3 + class178.field2315);
                                       var39.field2279.method3707(var4 + class71.field1051);
                                       var39.field2279.method3596(class39.field340[82]?(class39.field340[81]?2:1):0);
                                       field739.method2019(var39);
                                       class125.method2941();
                                       field743 = class48.field432;
                                       field839 = class48.field437;
                                       field696 = 1;
                                       field843 = 0;
                                       field820 = var3;
                                       field821 = var4;
                                    }

                                    if(var35 != class37.field329) {
                                       if(var35 != null) {
                                          class181.method3548(var35);
                                       }

                                       if(class37.field329 != null) {
                                          class181.method3548(class37.field329);
                                       }
                                    }

                                    if(var33 != class7.field42 && field747 == field744) {
                                       if(var33 != null) {
                                          class181.method3548(var33);
                                       }

                                       if(class7.field42 != null) {
                                          class181.method3548(class7.field42);
                                       }
                                    }

                                    if(class7.field42 != null) {
                                       if(field747 < field744) {
                                          ++field747;
                                          if(field747 == field744) {
                                             class181.method3548(class7.field42);
                                          }
                                       }
                                    } else if(field747 > 0) {
                                       --field747;
                                    }

                                    class87.method2030();
                                    if(field746) {
                                       var3 = class13.field99 * 128 + 64;
                                       var4 = class35.field305 * 128 + 64;
                                       var5 = class264.method4955(var3, var4, class192.field2415) - class166.field2068;
                                       if(class14.field118 < var3) {
                                          class14.field118 = (var3 - class14.field118) * class234.field2801 / 1000 + class14.field118 + class157.field1999;
                                          if(class14.field118 > var3) {
                                             class14.field118 = var3;
                                          }
                                       }

                                       if(class14.field118 > var3) {
                                          class14.field118 -= class234.field2801 * (class14.field118 - var3) / 1000 + class157.field1999;
                                          if(class14.field118 < var3) {
                                             class14.field118 = var3;
                                          }
                                       }

                                       if(class12.field96 < var5) {
                                          class12.field96 = (var5 - class12.field96) * class234.field2801 / 1000 + class12.field96 + class157.field1999;
                                          if(class12.field96 > var5) {
                                             class12.field96 = var5;
                                          }
                                       }

                                       if(class12.field96 > var5) {
                                          class12.field96 -= class234.field2801 * (class12.field96 - var5) / 1000 + class157.field1999;
                                          if(class12.field96 < var5) {
                                             class12.field96 = var5;
                                          }
                                       }

                                       if(class13.field102 < var4) {
                                          class13.field102 = (var4 - class13.field102) * class234.field2801 / 1000 + class13.field102 + class157.field1999;
                                          if(class13.field102 > var4) {
                                             class13.field102 = var4;
                                          }
                                       }

                                       if(class13.field102 > var4) {
                                          class13.field102 -= class234.field2801 * (class13.field102 - var4) / 1000 + class157.field1999;
                                          if(class13.field102 < var4) {
                                             class13.field102 = var4;
                                          }
                                       }

                                       var3 = class68.field1014 * 128 + 64;
                                       var4 = class2.field19 * 128 + 64;
                                       var5 = class264.method4955(var3, var4, class192.field2415) - class52.field476;
                                       var6 = var3 - class14.field118;
                                       var7 = var5 - class12.field96;
                                       var8 = var4 - class13.field102;
                                       var9 = (int)Math.sqrt((double)(var6 * var6 + var8 * var8));
                                       var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.949D) & 2047;
                                       int var27 = (int)(Math.atan2((double)var6, (double)var8) * -325.949D) & 2047;
                                       if(var10 < 128) {
                                          var10 = 128;
                                       }

                                       if(var10 > 383) {
                                          var10 = 383;
                                       }

                                       if(class146.field1935 < var10) {
                                          class146.field1935 = (var10 - class146.field1935) * class118.field1589 / 1000 + class146.field1935 + class98.field1360;
                                          if(class146.field1935 > var10) {
                                             class146.field1935 = var10;
                                          }
                                       }

                                       if(class146.field1935 > var10) {
                                          class146.field1935 -= class118.field1589 * (class146.field1935 - var10) / 1000 + class98.field1360;
                                          if(class146.field1935 < var10) {
                                             class146.field1935 = var10;
                                          }
                                       }

                                       int var12 = var27 - class55.field507;
                                       if(var12 > 1024) {
                                          var12 -= 2048;
                                       }

                                       if(var12 < -1024) {
                                          var12 += 2048;
                                       }

                                       if(var12 > 0) {
                                          class55.field507 = var12 * class118.field1589 / 1000 + class55.field507 + class98.field1360;
                                          class55.field507 &= 2047;
                                       }

                                       if(var12 < 0) {
                                          class55.field507 -= -var12 * class118.field1589 / 1000 + class98.field1360;
                                          class55.field507 &= 2047;
                                       }

                                       int var13 = var27 - class55.field507;
                                       if(var13 > 1024) {
                                          var13 -= 2048;
                                       }

                                       if(var13 < -1024) {
                                          var13 += 2048;
                                       }

                                       if(var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
                                          class55.field507 = var27;
                                       }
                                    }

                                    for(var3 = 0; var3 < 5; ++var3) {
                                       ++field765[var3];
                                    }

                                    class242.field3144.method1933();
                                    var3 = class135.method3116();
                                    var4 = class55.method1076();
                                    if(var3 > 15000 && var4 > 15000) {
                                       field688 = 250;
                                       class59.method1120(14500);
                                       var39 = class133.method3115(class169.field2159, field739.field1250);
                                       field739.method2019(var39);
                                    }

                                    class109.field1453.method1698();
                                    ++field739.field1252;
                                    if(field739.field1252 > 50) {
                                       var39 = class133.method3115(class169.field2217, field739.field1250);
                                       field739.method2019(var39);
                                    }

                                    try {
                                       field739.method2034();
                                    } catch (IOException var28) {
                                       class86.method2018();
                                    }

                                    return;
                                 }

                                 var24 = var37.field511;
                                 if(var24.field2633 >= 0) {
                                    var25 = class61.method1188(var24.field2642);
                                    if(var25 == null || var25.field2626 == null || var24.field2633 >= var25.field2626.length || var24 != var25.field2626[var24.field2633]) {
                                       continue;
                                    }
                                 }

                                 class67.method1728(var37);
                              }
                           }

                           var24 = var37.field511;
                           if(var24.field2633 >= 0) {
                              var25 = class61.method1188(var24.field2642);
                              if(var25 == null || var25.field2626 == null || var24.field2633 >= var25.field2626.length || var24 != var25.field2626[var24.field2633]) {
                                 continue;
                              }
                           }

                           class67.method1728(var37);
                        }
                     }

                     var24 = var37.field511;
                     if(var24.field2633 >= 0) {
                        var25 = class61.method1188(var24.field2642);
                        if(var25 == null || var25.field2626 == null || var24.field2633 >= var25.field2626.length || var24 != var25.field2626[var24.field2633]) {
                           continue;
                        }
                     }

                     class67.method1728(var37);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("ge")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-48"
   )
   void method1465() {
      int var1 = class9.field70;
      int var2 = class37.field326;
      if(super.field393 < var1) {
         var1 = super.field393;
      }

      if(super.field415 < var2) {
         var2 = super.field415;
      }

      if(class51.field468 != null) {
         try {
            client var3 = class37.field321;
            int var4 = field675?2:1;
            Object[] var5 = new Object[]{Integer.valueOf(var4)};
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
      if(field752 != -1) {
         class27.method498(field752);
      }

      int var1;
      for(var1 = 0; var1 < field793; ++var1) {
         if(field795[var1]) {
            field796[var1] = true;
         }

         field797[var1] = field795[var1];
         field795[var1] = false;
      }

      field794 = field679;
      field741 = -1;
      field667 = -1;
      class295.field3688 = null;
      if(field752 != -1) {
         field793 = 0;
         class218.method4359(field752, 0, 0, class9.field70, class37.field326, 0, 0, -1);
      }

      class314.method5762();
      int var2;
      int var3;
      int var4;
      int var6;
      int var7;
      int var13;
      if(!field846) {
         if(field741 != -1) {
            class60.method1178(field741, field667);
         }
      } else {
         var1 = class35.field303;
         var2 = class59.field558;
         var3 = class139.field1897;
         var4 = class137.field1888;
         int var14 = 6116423;
         class314.method5835(var1, var2, var3, var4, var14);
         class314.method5835(var1 + 1, var2 + 1, var3 - 2, 16, 0);
         class314.method5778(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
         class55.field499.method5541("Choose Option", var1 + 3, var2 + 14, var14, -1);
         var6 = class48.field425;
         var7 = class48.field417;

         int var15;
         int var16;
         for(var13 = 0; var13 < field657; ++var13) {
            var15 = var2 + (field657 - 1 - var13) * 15 + 31;
            var16 = 16777215;
            if(var6 > var1 && var6 < var1 + var3 && var7 > var15 - 13 && var7 < var15 + 3) {
               var16 = 16776960;
            }

            class55.field499.method5541(class234.method4595(var13), var1 + 3, var15, var16, 0);
         }

         var13 = class35.field303;
         var15 = class59.field558;
         var16 = class139.field1897;
         int var17 = class137.field1888;

         for(int var12 = 0; var12 < field793; ++var12) {
            if(field798[var12] + field800[var12] > var13 && field798[var12] < var13 + var16 && field799[var12] + field604[var12] > var15 && field799[var12] < var15 + var17) {
               field796[var12] = true;
            }
         }
      }

      if(field802 == 3) {
         for(var1 = 0; var1 < field793; ++var1) {
            if(field797[var1]) {
               class314.method5834(field798[var1], field799[var1], field800[var1], field604[var1], 16711935, 128);
            } else if(field796[var1]) {
               class314.method5834(field798[var1], field799[var1], field800[var1], field604[var1], 16711680, 128);
            }
         }
      }

      var1 = class192.field2415;
      var2 = class150.field1948.field900;
      var3 = class150.field1948.field918;
      var4 = field654;

      for(class68 var5 = (class68)class68.field1002.method4113(); var5 != null; var5 = (class68)class68.field1002.method4104()) {
         if(var5.field1004 != -1 || var5.field1008 != null) {
            var6 = 0;
            if(var2 > var5.field1001) {
               var6 += var2 - var5.field1001;
            } else if(var2 < var5.field1000) {
               var6 += var5.field1000 - var2;
            }

            if(var3 > var5.field1005) {
               var6 += var3 - var5.field1005;
            } else if(var3 < var5.field1007) {
               var6 += var5.field1007 - var3;
            }

            if(var6 - 64 <= var5.field1011 && field827 != 0 && var1 == var5.field998) {
               var6 -= 64;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = (var5.field1011 - var6) * field827 / var5.field1011;
               Object var10000;
               if(var5.field1006 == null) {
                  if(var5.field1004 >= 0) {
                     var10000 = null;
                     class91 var8 = class91.method2114(class110.field1459, var5.field1004, 0);
                     if(var8 != null) {
                        class93 var9 = var8.method2110().method2158(class245.field3166);
                        class103 var10 = class103.method2370(var9, 100, var7);
                        var10.method2318(-1);
                        class141.field1906.method2049(var10);
                        var5.field1006 = var10;
                     }
                  }
               } else {
                  var5.field1006.method2319(var7);
               }

               if(var5.field1010 == null) {
                  if(var5.field1008 != null && (var5.field1009 -= var4) <= 0) {
                     var13 = (int)(Math.random() * (double)var5.field1008.length);
                     var10000 = null;
                     class91 var18 = class91.method2114(class110.field1459, var5.field1008[var13], 0);
                     if(var18 != null) {
                        class93 var19 = var18.method2110().method2158(class245.field3166);
                        class103 var11 = class103.method2370(var19, 100, var7);
                        var11.method2318(0);
                        class141.field1906.method2049(var11);
                        var5.field1010 = var11;
                        var5.field1009 = var5.field997 + (int)(Math.random() * (double)(var5.field1003 - var5.field997));
                     }
                  }
               } else {
                  var5.field1010.method2319(var7);
                  if(!var5.field1010.method4099()) {
                     var5.field1010 = null;
                  }
               }
            } else {
               if(var5.field1006 != null) {
                  class141.field1906.method2050(var5.field1006);
                  var5.field1006 = null;
               }

               if(var5.field1010 != null) {
                  class141.field1906.method2050(var5.field1010);
                  var5.field1010 = null;
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
   final boolean method1572(class87 var1) {
      class157 var2 = var1.method2045();
      class189 var3 = var1.field1254;
      if(var2 == null) {
         return false;
      } else {
         String var5;
         int var6;
         try {
            if(var1.field1246 == null) {
               if(var1.field1248) {
                  if(!var2.vmethod3355(1)) {
                     return false;
                  }

                  var2.vmethod3356(var1.field1254.field2365, 0, 1);
                  var1.field1249 = 0;
                  var1.field1248 = false;
               }

               var3.field2359 = 0;
               if(var3.method3869()) {
                  if(!var2.vmethod3355(1)) {
                     return false;
                  }

                  var2.vmethod3356(var1.field1254.field2365, 1, 1);
                  var1.field1249 = 0;
               }

               var1.field1248 = true;
               class168[] var4 = new class168[]{class168.field2092, class168.field2127, class168.field2082, class168.field2149, class168.field2079, class168.field2076, class168.field2077, class168.field2119, class168.field2074, class168.field2080, class168.field2134, class168.field2071, class168.field2083, class168.field2084, class168.field2085, class168.field2086, class168.field2122, class168.field2088, class168.field2089, class168.field2099, class168.field2091, class168.field2096, class168.field2093, class168.field2094, class168.field2081, class168.field2087, class168.field2097, class168.field2098, class168.field2128, class168.field2100, class168.field2101, class168.field2102, class168.field2103, class168.field2104, class168.field2105, class168.field2106, class168.field2107, class168.field2108, class168.field2109, class168.field2110, class168.field2072, class168.field2112, class168.field2113, class168.field2114, class168.field2115, class168.field2116, class168.field2117, class168.field2118, class168.field2095, class168.field2120, class168.field2151, class168.field2090, class168.field2123, class168.field2124, class168.field2125, class168.field2126, class168.field2073, class168.field2156, class168.field2157, class168.field2130, class168.field2131, class168.field2132, class168.field2133, class168.field2138, class168.field2135, class168.field2136, class168.field2137, class168.field2152, class168.field2139, class168.field2140, class168.field2121, class168.field2142, class168.field2143, class168.field2129, class168.field2145, class168.field2146, class168.field2144, class168.field2078, class168.field2154, class168.field2150, class168.field2075, class168.field2147, class168.field2153, class168.field2148};
               var6 = var3.method3883();
               if(var6 < 0 || var6 >= var4.length) {
                  throw new IOException(var6 + " " + var3.field2359);
               }

               var1.field1246 = var4[var6];
               var1.field1247 = var1.field1246.field2141;
            }

            if(var1.field1247 == -1) {
               if(!var2.vmethod3355(1)) {
                  return false;
               }

               var1.method2045().vmethod3356(var3.field2365, 0, 1);
               var1.field1247 = var3.field2365[0] & 255;
            }

            if(var1.field1247 == -2) {
               if(!var2.vmethod3355(2)) {
                  return false;
               }

               var1.method2045().vmethod3356(var3.field2365, 0, 2);
               var3.field2359 = 0;
               var1.field1247 = var3.method3574();
            }

            if(!var2.vmethod3355(var1.field1247)) {
               return false;
            }

            var3.field2359 = 0;
            var2.vmethod3356(var3.field2365, 0, var1.field1247);
            var1.field1249 = 0;
            field840.method5255();
            var1.field1253 = var1.field1245;
            var1.field1245 = var1.field1251;
            var1.field1251 = var1.field1246;
            if(class168.field2119 == var1.field1246) {
               class58.method1117(class171.field2273);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2117 == var1.field1246) {
               class58.method1117(class171.field2267);
               var1.field1246 = null;
               return true;
            }

            int var7;
            int var8;
            long var9;
            int var23;
            int var24;
            if(class168.field2157 == var1.field1246) {
               var23 = var3.method3613();
               var24 = var3.method3562();
               if(var24 == '\uffff') {
                  var24 = -1;
               }

               var6 = var3.method3784();
               if(var6 == '\uffff') {
                  var6 = -1;
               }

               var7 = var3.method3618();

               for(var8 = var6; var8 <= var24; ++var8) {
                  var9 = ((long)var7 << 32) + (long)var8;
                  class204 var71 = field816.method4064(var9);
                  if(var71 != null) {
                     var71.method4098();
                  }

                  field816.method4063(new class211(var23), var9);
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2121 == var1.field1246) {
               if(field752 != -1) {
                  class76.method1849(field752, 0);
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2146 == var1.field1246) {
               var23 = var3.method3742();
               class246.method4623(var23);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2082 == var1.field1246) {
               class65 var66 = new class65();
               var66.field963 = var3.method3577();
               var66.field960 = var3.method3574();
               var24 = var3.method3573();
               var66.field961 = var24;
               class102.method2310(45);
               var2.vmethod3368();
               var2 = null;
               class292.method5484(var66);
               var1.field1246 = null;
               return false;
            }

            if(class168.field2136 == var1.field1246) {
               class58.method1117(class171.field2269);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2100 == var1.field1246) {
               class109.field1453.field993.method5333(var3, var1.field1247);
               class169.method3460();
               if(class0.field2 != null) {
                  class0.field2.method5498();
               }

               field742 = field775;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2103 == var1.field1246) {
               class58.method1117(class171.field2272);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2147 == var1.field1246) {
               field643 = var3.method3784() * 30;
               field787 = field775;
               var1.field1246 = null;
               return true;
            }

            String var59;
            if(class168.field2072 == var1.field1246) {
               var59 = var3.method3577();
               Object[] var68 = new Object[var59.length() + 1];

               for(var6 = var59.length() - 1; var6 >= 0; --var6) {
                  if(var59.charAt(var6) == 115) {
                     var68[var6 + 1] = var3.method3577();
                  } else {
                     var68[var6 + 1] = new Integer(var3.method3573());
                  }
               }

               var68[0] = new Integer(var3.method3573());
               class56 var93 = new class56();
               var93.field525 = var68;
               class67.method1728(var93);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2109 == var1.field1246) {
               class109.field1453.method1665(var3, var1.field1247);
               field742 = field775;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2090 == var1.field1246) {
               class56.method1083(false, var1.field1254);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2114 == var1.field1246) {
               class2.method24(false, var3);
               var1.field1246 = null;
               return true;
            }

            int var10;
            int var12;
            int var14;
            int var15;
            int var18;
            String var27;
            String var76;
            if(class168.field2080 == var1.field1246) {
               var23 = var1.field1247;
               class312 var67 = new class312();
               var67.field3755 = var3.method3742();
               var67.field3758 = var3.method3573();
               var67.field3756 = new int[var67.field3755];
               var67.field3759 = new int[var67.field3755];
               var67.field3754 = new Field[var67.field3755];
               var67.field3757 = new int[var67.field3755];
               var67.field3760 = new Method[var67.field3755];
               var67.field3761 = new byte[var67.field3755][][];

               for(var6 = 0; var6 < var67.field3755; ++var6) {
                  try {
                     var7 = var3.method3742();
                     if(var7 != 0 && var7 != 1 && var7 != 2) {
                        if(var7 == 3 || var7 == 4) {
                           var76 = var3.method3577();
                           var27 = var3.method3577();
                           var10 = var3.method3742();
                           String[] var70 = new String[var10];

                           for(var12 = 0; var12 < var10; ++var12) {
                              var70[var12] = var3.method3577();
                           }

                           String var28 = var3.method3577();
                           byte[][] var73 = new byte[var10][];
                           if(var7 == 3) {
                              for(var14 = 0; var14 < var10; ++var14) {
                                 var15 = var3.method3573();
                                 var73[var14] = new byte[var15];
                                 var3.method3580(var73[var14], 0, var15);
                              }
                           }

                           var67.field3756[var6] = var7;
                           Class[] var29 = new Class[var10];

                           for(var15 = 0; var15 < var10; ++var15) {
                              var29[var15] = class76.method1848(var70[var15]);
                           }

                           Class var89 = class76.method1848(var28);
                           if(class76.method1848(var76).getClassLoader() == null) {
                              throw new SecurityException();
                           }

                           Method[] var16 = class76.method1848(var76).getDeclaredMethods();
                           Method[] var17 = var16;

                           for(var18 = 0; var18 < var17.length; ++var18) {
                              Method var19 = var17[var18];
                              if(Reflection.getMethodName(var19).equals(var27)) {
                                 Class[] var20 = Reflection.getParameterTypes(var19);
                                 if(var29.length == var20.length) {
                                    boolean var21 = true;

                                    for(int var22 = 0; var22 < var29.length; ++var22) {
                                       if(var20[var22] != var29[var22]) {
                                          var21 = false;
                                          break;
                                       }
                                    }

                                    if(var21 && var89 == var19.getReturnType()) {
                                       var67.field3760[var6] = var19;
                                    }
                                 }
                              }
                           }

                           var67.field3761[var6] = var73;
                        }
                     } else {
                        var76 = var3.method3577();
                        var27 = var3.method3577();
                        var10 = 0;
                        if(var7 == 1) {
                           var10 = var3.method3573();
                        }

                        var67.field3756[var6] = var7;
                        var67.field3757[var6] = var10;
                        if(class76.method1848(var76).getClassLoader() == null) {
                           throw new SecurityException();
                        }

                        var67.field3754[var6] = Reflection.findField(class76.method1848(var76), var27);
                     }
                  } catch (ClassNotFoundException var52) {
                     var67.field3759[var6] = -1;
                  } catch (SecurityException var53) {
                     var67.field3759[var6] = -2;
                  } catch (NullPointerException var54) {
                     var67.field3759[var6] = -3;
                  } catch (Exception var55) {
                     var67.field3759[var6] = -4;
                  } catch (Throwable var56) {
                     var67.field3759[var6] = -5;
                  }
               }

               class313.field3762.method4069(var67);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2081 == var1.field1246) {
               class56.method1083(true, var1.field1254);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2079 == var1.field1246) {
               var59 = var3.method3577();
               var5 = class299.method5643(class57.method1089(class59.method1128(var3)));
               class61.method1189(6, var59, var5);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2129 == var1.field1246) {
               class58.method1117(class171.field2275);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2083 == var1.field1246) {
               class58.method1117(class171.field2270);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2143 == var1.field1246) {
               class58.field545 = var3.method3597();
               class84.field1219 = var3.method3597();

               while(var3.field2359 < var1.field1247) {
                  var23 = var3.method3742();
                  class171 var65 = class8.method90()[var23];
                  class58.method1117(var65);
               }

               var1.field1246 = null;
               return true;
            }

            int var32;
            long var35;
            class55 var97;
            if(class168.field2133 == var1.field1246) {
               var23 = var3.field2359 + var1.field1247;
               var24 = var3.method3574();
               var6 = var3.method3574();
               if(var24 != field752) {
                  field752 = var24;
                  this.method1210(false);
                  class25.method465(field752);
                  class4.method55(field752);

                  for(var7 = 0; var7 < 100; ++var7) {
                     field795[var7] = true;
                  }
               }

               class55 var95;
               for(; var6-- > 0; var95.field500 = true) {
                  var7 = var3.method3573();
                  var8 = var3.method3574();
                  var32 = var3.method3742();
                  var95 = (class55)field826.method4064((long)var7);
                  if(var95 != null && var8 != var95.field506) {
                     class21.method300(var95, true);
                     var95 = null;
                  }

                  if(var95 == null) {
                     var95 = class265.method4994(var7, var8, var32);
                  }
               }

               for(var97 = (class55)field826.method4055(); var97 != null; var97 = (class55)field826.method4056()) {
                  if(var97.field500) {
                     var97.field500 = false;
                  } else {
                     class21.method300(var97, true);
                  }
               }

               field816 = new class202(512);

               while(var3.field2359 < var23) {
                  var7 = var3.method3573();
                  var8 = var3.method3574();
                  var32 = var3.method3574();
                  var10 = var3.method3573();

                  for(int var34 = var8; var34 <= var32; ++var34) {
                     var35 = ((long)var7 << 32) + (long)var34;
                     field816.method4063(new class211(var10), var35);
                  }
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2110 == var1.field1246) {
               class82.method1959();
               var1.field1246 = null;
               return false;
            }

            long var39;
            if(class168.field2076 == var1.field1246) {
               var23 = var3.method3573();
               var24 = var3.method3573();
               var7 = 0;
               if(class76.field1092 == null || !class76.field1092.isValid()) {
                  try {
                     Iterator var85 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

                     while(var85.hasNext()) {
                        GarbageCollectorMXBean var82 = (GarbageCollectorMXBean)var85.next();
                        if(var82.isValid()) {
                           class76.field1092 = var82;
                           class47.field380 = -1L;
                           class47.field412 = -1L;
                        }
                     }
                  } catch (Throwable var51) {
                     ;
                  }
               }

               if(class76.field1092 != null) {
                  long var37 = class166.method3456();
                  var39 = class76.field1092.getCollectionTime();
                  if(class47.field412 != -1L) {
                     var35 = var39 - class47.field412;
                     long var41 = var37 - class47.field380;
                     if(var41 != 0L) {
                        var7 = (int)(var35 * 100L / var41);
                     }
                  }

                  class47.field412 = var39;
                  class47.field380 = var37;
               }

               class172 var86 = class133.method3115(class169.field2169, field739.field1250);
               var86.field2279.method3596(var7);
               var86.field2279.method3641(var23);
               var86.field2279.method3750(var24);
               var86.field2279.method3595(class47.field388);
               field739.method2019(var86);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2098 == var1.field1246) {
               var23 = var3.method3573();
               if(var23 != field674) {
                  field674 = var23;
                  if(field678 == 1) {
                     field622 = true;
                  }
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2130 == var1.field1246) {
               var24 = var3.method3742();
               class307[] var91 = class151.method3235();
               var7 = 0;

               class307 var62;
               while(true) {
                  if(var7 >= var91.length) {
                     var62 = null;
                     break;
                  }

                  class307 var84 = var91[var7];
                  if(var24 == var84.field3741) {
                     var62 = var84;
                     break;
                  }

                  ++var7;
               }

               class20.field170 = var62;
               var1.field1246 = null;
               return true;
            }

            class230 var63;
            if(class168.field2091 == var1.field1246) {
               var23 = var3.method3573();
               var63 = class61.method1188(var23);

               for(var6 = 0; var6 < var63.field2758.length; ++var6) {
                  var63.field2758[var6] = -1;
                  var63.field2758[var6] = 0;
               }

               class181.method3548(var63);
               var1.field1246 = null;
               return true;
            }

            class230 var25;
            boolean var88;
            if(class168.field2150 == var1.field1246) {
               var88 = var3.method3730() == 1;
               var24 = var3.method3616();
               var25 = class61.method1188(var24);
               if(var88 != var25.field2643) {
                  var25.field2643 = var88;
                  class181.method3548(var25);
               }

               var1.field1246 = null;
               return true;
            }

            long var43;
            long var45;
            if(class168.field2120 == var1.field1246) {
               var59 = var3.method3577();
               var43 = var3.method3792();
               var45 = (long)var3.method3574();
               var9 = (long)var3.method3572();
               class242 var11 = (class242)class7.method89(class274.method5249(), var3.method3742());
               var35 = (var45 << 32) + var9;
               boolean var75 = false;

               for(var15 = 0; var15 < 100; ++var15) {
                  if(field809[var15] == var35) {
                     var75 = true;
                     break;
                  }
               }

               if(var11.field3136 && class109.field1453.method1669(new class291(var59, class19.field168))) {
                  var75 = true;
               }

               if(!var75 && field706 == 0) {
                  field809[field830] = var35;
                  field830 = (field830 + 1) % 100;
                  String var30 = class299.method5643(class57.method1089(class59.method1128(var3)));
                  if(var11.field3142 != -1) {
                     class154.method3259(9, class36.method687(var11.field3142) + var59, var30, class302.method5659(var43));
                  } else {
                     class154.method3259(9, var59, var30, class302.method5659(var43));
                  }
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2122 == var1.field1246) {
               class84.field1219 = var3.method3597();
               class58.field545 = var3.method3597();

               for(var23 = class58.field545; var23 < class58.field545 + 8; ++var23) {
                  for(var24 = class84.field1219; var24 < class84.field1219 + 8; ++var24) {
                     if(field720[class192.field2415][var23][var24] != null) {
                        field720[class192.field2415][var23][var24] = null;
                        class171.method3472(var23, var24);
                     }
                  }
               }

               for(class62 var61 = (class62)field721.method4113(); var61 != null; var61 = (class62)field721.method4104()) {
                  if(var61.field868 >= class58.field545 && var61.field868 < class58.field545 + 8 && var61.field880 >= class84.field1219 && var61.field880 < class84.field1219 + 8 && var61.field873 == class192.field2415) {
                     var61.field877 = 0;
                  }
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2086 == var1.field1246) {
               var23 = var3.method3574();
               var24 = var3.method3742();
               var6 = var3.method3574();
               if(field768 != 0 && var24 != 0 && field598 < 50) {
                  field829[field598] = var23;
                  field695[field598] = var24;
                  field831[field598] = var6;
                  field762[field598] = null;
                  field832[field598] = 0;
                  ++field598;
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2127 == var1.field1246) {
               var23 = var3.method3676();
               var24 = var3.method3573();
               class225.field2576[var23] = var24;
               if(class225.field2578[var23] != var24) {
                  class225.field2578[var23] = var24;
               }

               class230.method4537(var23);
               field593[++field777 - 1 & 31] = var23;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2135 == var1.field1246) {
               field746 = false;

               for(var23 = 0; var23 < 5; ++var23) {
                  field835[var23] = false;
               }

               var1.field1246 = null;
               return true;
            }

            String var83;
            if(class168.field2116 == var1.field1246) {
               var23 = var3.method3599();
               boolean var96 = var3.method3742() == 1;
               var83 = "";
               boolean var69 = false;
               if(var96) {
                  var83 = var3.method3577();
                  if(class109.field1453.method1669(new class291(var83, class19.field168))) {
                     var69 = true;
                  }
               }

               var76 = var3.method3577();
               if(!var69) {
                  class61.method1189(var23, var83, var76);
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2124 == var1.field1246) {
               class69.method1749();
               var23 = var3.method3730();
               var24 = var3.method3742();
               var6 = var3.method3613();
               field764[var23] = var6;
               field724[var23] = var24;
               field725[var23] = 1;

               for(var7 = 0; var7 < 98; ++var7) {
                  if(var6 >= class234.field2798[var7]) {
                     field725[var23] = var7 + 2;
                  }
               }

               field810[++field781 - 1 & 31] = var23;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2089 == var1.field1246) {
               class13.method125(var3, var1.field1247);
               if(class8.field53 != null) {
                  field859 = field679;
                  class8.field53.method4793();

                  for(var23 = 0; var23 < field806.length; ++var23) {
                     if(field806[var23] != null) {
                        class8.field53.method4796((field806[var23].field900 >> 7) + class178.field2315, (field806[var23].field918 >> 7) + class71.field1051);
                     }
                  }
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2128 == var1.field1246) {
               var88 = var3.method3656();
               if(var88) {
                  if(class8.field53 == null) {
                     class8.field53 = new class251();
                  }
               } else {
                  class8.field53 = null;
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2085 == var1.field1246) {
               var23 = var3.method3574();
               if(var23 == '\uffff') {
                  var23 = -1;
               }

               if(var23 == -1 && !field825) {
                  class37.method721();
               } else if(var23 != -1 && var23 != field824 && field693 != 0 && !field825) {
                  class169.method3459(2, class48.field436, var23, 0, field693, false);
               }

               field824 = var23;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2145 == var1.field1246) {
               var23 = var3.method3612();
               var24 = var3.method3784();
               if(var24 == '\uffff') {
                  var24 = -1;
               }

               class259.method4879(var24, var23);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2095 == var1.field1246) {
               var23 = var3.method3742();
               if(var3.method3742() == 0) {
                  field856[var23] = new class4();
                  var3.field2359 += 18;
               } else {
                  --var3.field2359;
                  field856[var23] = new class4(var3, false);
               }

               field785 = field775;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2138 == var1.field1246) {
               var3.field2359 += 28;
               if(var3.method3591()) {
                  class76.method1852(var3, var3.field2359 - 28);
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2104 == var1.field1246) {
               field746 = true;
               class68.field1014 = var3.method3742();
               class2.field19 = var3.method3742();
               class52.field476 = var3.method3574();
               class98.field1360 = var3.method3742();
               class118.field1589 = var3.method3742();
               if(class118.field1589 >= 100) {
                  var23 = class68.field1014 * 128 + 64;
                  var24 = class2.field19 * 128 + 64;
                  var6 = class264.method4955(var23, var24, class192.field2415) - class52.field476;
                  var7 = var23 - class14.field118;
                  var8 = var6 - class12.field96;
                  var32 = var24 - class13.field102;
                  var10 = (int)Math.sqrt((double)(var7 * var7 + var32 * var32));
                  class146.field1935 = (int)(Math.atan2((double)var8, (double)var10) * 325.949D) & 2047;
                  class55.field507 = (int)(Math.atan2((double)var7, (double)var32) * -325.949D) & 2047;
                  if(class146.field1935 < 128) {
                     class146.field1935 = 128;
                  }

                  if(class146.field1935 > 383) {
                     class146.field1935 = 383;
                  }
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2093 == var1.field1246) {
               class109.field1453.method1664();
               field742 = field775;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2077 == var1.field1246) {
               class58.method1117(class171.field2271);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2112 == var1.field1246) {
               class58.method1117(class171.field2268);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2115 == var1.field1246) {
               var23 = var3.method3616();
               var24 = var3.method3604();
               var25 = class61.method1188(var23);
               if(var24 != var25.field2670 || var24 == -1) {
                  var25.field2670 = var24;
                  var25.field2746 = 0;
                  var25.field2718 = 0;
                  class181.method3548(var25);
               }

               var1.field1246 = null;
               return true;
            }

            class230 var31;
            if(class168.field2132 == var1.field1246) {
               var23 = var3.method3574();
               var24 = var3.method3618();
               var6 = var3.method3574();
               var31 = class61.method1188(var24);
               var31.field2661 = var6 + (var23 << 16);
               var1.field1246 = null;
               return true;
            }

            class230 var79;
            if(class168.field2149 == var1.field1246) {
               var23 = var3.method3613();
               var24 = var3.method3573();
               class55 var87 = (class55)field826.method4064((long)var23);
               var97 = (class55)field826.method4064((long)var24);
               if(var97 != null) {
                  class21.method300(var97, var87 == null || var97.field506 != var87.field506);
               }

               if(var87 != null) {
                  var87.method4098();
                  field826.method4063(var87, (long)var24);
               }

               var79 = class61.method1188(var23);
               if(var79 != null) {
                  class181.method3548(var79);
               }

               var79 = class61.method1188(var24);
               if(var79 != null) {
                  class181.method3548(var79);
                  class45.method818(class230.field2615[var79.field2623 >>> 16], var79, true);
               }

               if(field752 != -1) {
                  class76.method1849(field752, 1);
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2105 == var1.field1246) {
               class84.field1219 = var3.method3742();
               class58.field545 = var3.method3730();
               var1.field1246 = null;
               return true;
            }

            if(class168.field2152 == var1.field1246) {
               for(var23 = 0; var23 < class225.field2578.length; ++var23) {
                  if(class225.field2578[var23] != class225.field2576[var23]) {
                     class225.field2578[var23] = class225.field2576[var23];
                     class230.method4537(var23);
                     field593[++field777 - 1 & 31] = var23;
                  }
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2071 == var1.field1246) {
               field746 = true;
               class13.field99 = var3.method3742();
               class35.field305 = var3.method3742();
               class166.field2068 = var3.method3574();
               class157.field1999 = var3.method3742();
               class234.field2801 = var3.method3742();
               if(class234.field2801 >= 100) {
                  class14.field118 = class13.field99 * 128 + 64;
                  class13.field102 = class35.field305 * 128 + 64;
                  class12.field96 = class264.method4955(class14.field118, class13.field102, class192.field2415) - class166.field2068;
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2118 == var1.field1246) {
               var23 = var3.method3676();
               field752 = var23;
               this.method1210(false);
               class25.method465(var23);
               class4.method55(field752);

               for(var24 = 0; var24 < 100; ++var24) {
                  field795[var24] = true;
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2156 == var1.field1246) {
               var23 = var3.method3613();
               var24 = var3.method3784();
               var6 = var24 >> 10 & 31;
               var7 = var24 >> 5 & 31;
               var8 = var24 & 31;
               var32 = (var7 << 11) + (var6 << 19) + (var8 << 3);
               class230 var33 = class61.method1188(var23);
               if(var32 != var33.field2648) {
                  var33.field2648 = var32;
                  class181.method3548(var33);
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2142 == var1.field1246) {
               var23 = var3.method3784();
               class137.method3148(var23);
               field778[++field779 - 1 & 31] = var23 & 32767;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2084 == var1.field1246) {
               var23 = var3.method3742();
               var24 = var3.method3742();
               var6 = var3.method3742();
               var7 = var3.method3742();
               field835[var23] = true;
               field836[var23] = var24;
               field837[var23] = var6;
               field855[var23] = var7;
               field765[var23] = 0;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2108 == var1.field1246) {
               var23 = var3.method3676();
               var24 = var3.method3616();
               var6 = var3.method3676();
               var7 = var3.method3784();
               var79 = class61.method1188(var24);
               if(var7 != var79.field2675 || var23 != var79.field2707 || var6 != var79.field2701) {
                  var79.field2675 = var7;
                  var79.field2707 = var23;
                  var79.field2701 = var6;
                  class181.method3548(var79);
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2101 == var1.field1246) {
               var23 = var3.method3574();
               var24 = var3.method3618();
               var25 = class61.method1188(var24);
               if(var25.field2666 != 1 || var23 != var25.field2757) {
                  var25.field2666 = 1;
                  var25.field2757 = var23;
                  class181.method3548(var25);
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2099 == var1.field1246) {
               var88 = var3.method3742() == 1;
               if(var88) {
                  field629 = class166.method3456() - var3.method3792();
                  class173.field2291 = new class1(var3, true);
               } else {
                  class173.field2291 = null;
               }

               field789 = field775;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2125 == var1.field1246) {
               class2.method24(true, var3);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2107 == var1.field1246) {
               if(var1.field1247 == 0) {
                  class0.field2 = null;
               } else {
                  if(class0.field2 == null) {
                     class0.field2 = new class293(class19.field168, class37.field321);
                  }

                  class0.field2.method5507(var3);
               }

               field784 = field775;
               class27.field245 = true;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2088 == var1.field1246) {
               class69.method1749();
               field758 = var3.method3804();
               field787 = field775;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2092 == var1.field1246) {
               var23 = var3.method3574();
               var24 = var3.method3618();
               var25 = class61.method1188(var24);
               if(var25 != null && var25.field2625 == 0) {
                  if(var23 > var25.field2647 - var25.field2639) {
                     var23 = var25.field2647 - var25.field2639;
                  }

                  if(var23 < 0) {
                     var23 = 0;
                  }

                  if(var23 != var25.field2611) {
                     var25.field2611 = var23;
                     class181.method3548(var25);
                  }
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2154 == var1.field1246) {
               class69.method1749();
               field757 = var3.method3742();
               field787 = field775;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2106 == var1.field1246) {
               class58.method1117(class171.field2276);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2134 == var1.field1246) {
               var23 = var3.method3573();
               class55 var64 = (class55)field826.method4064((long)var23);
               if(var64 != null) {
                  class21.method300(var64, true);
               }

               if(field756 != null) {
                  class181.method3548(field756);
                  field756 = null;
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2102 == var1.field1246) {
               var23 = var3.method3618();
               var5 = var3.method3577();
               var25 = class61.method1188(var23);
               if(!var5.equals(var25.field2684)) {
                  var25.field2684 = var5;
                  class181.method3548(var25);
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2075 == var1.field1246) {
               var23 = var3.method3613();
               var63 = class61.method1188(var23);
               var63.field2666 = 3;
               var63.field2757 = class150.field1948.field561.method4493();
               class181.method3548(var63);
               var1.field1246 = null;
               return true;
            }

            int var47;
            if(class168.field2151 == var1.field1246) {
               var59 = var3.method3577();
               var43 = (long)var3.method3574();
               var45 = (long)var3.method3572();
               class242 var81 = (class242)class7.method89(class274.method5249(), var3.method3742());
               var39 = var45 + (var43 << 32);
               boolean var72 = false;

               for(var47 = 0; var47 < 100; ++var47) {
                  if(var39 == field809[var47]) {
                     var72 = true;
                     break;
                  }
               }

               if(class109.field1453.method1669(new class291(var59, class19.field168))) {
                  var72 = true;
               }

               if(!var72 && field706 == 0) {
                  field809[field830] = var39;
                  field830 = (field830 + 1) % 100;
                  String var13 = class299.method5643(class57.method1089(class59.method1128(var3)));
                  byte var74;
                  if(var81.field3143) {
                     var74 = 7;
                  } else {
                     var74 = 3;
                  }

                  if(var81.field3142 != -1) {
                     class61.method1189(var74, class36.method687(var81.field3142) + var59, var13);
                  } else {
                     class61.method1189(var74, var59, var13);
                  }
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2144 == var1.field1246) {
               var59 = var3.method3577();
               var24 = var3.method3597();
               var6 = var3.method3597();
               if(var24 >= 1 && var24 <= 8) {
                  if(var59.equalsIgnoreCase("null")) {
                     var59 = null;
                  }

                  field650[var24 - 1] = var59;
                  field850[var24 - 1] = var6 == 0;
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2153 == var1.field1246) {
               field820 = var3.method3742();
               if(field820 == 255) {
                  field820 = 0;
               }

               field821 = var3.method3742();
               if(field821 == 255) {
                  field821 = 0;
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2140 == var1.field1246) {
               byte var77 = var3.method3569();
               var24 = var3.method3574();
               class225.field2576[var24] = var77;
               if(class225.field2578[var24] != var77) {
                  class225.field2578[var24] = var77;
               }

               class230.method4537(var24);
               field593[++field777 - 1 & 31] = var24;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2113 == var1.field1246) {
               for(var23 = 0; var23 < field806.length; ++var23) {
                  if(field806[var23] != null) {
                     field806[var23].field915 = -1;
                  }
               }

               for(var23 = 0; var23 < field807.length; ++var23) {
                  if(field807[var23] != null) {
                     field807[var23].field915 = -1;
                  }
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2074 == var1.field1246) {
               var23 = var3.method3616();
               var24 = var3.method3562();
               var6 = var3.method3553();
               var97 = (class55)field826.method4064((long)var23);
               if(var97 != null) {
                  class21.method300(var97, var24 != var97.field506);
               }

               class265.method4994(var23, var24, var6);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2097 == var1.field1246) {
               field858 = var3.method3742();
               if(field858 == 1) {
                  field613 = var3.method3574();
               }

               if(field858 >= 2 && field858 <= 6) {
                  if(field858 == 2) {
                     field618 = 64;
                     field670 = 64;
                  }

                  if(field858 == 3) {
                     field618 = 0;
                     field670 = 64;
                  }

                  if(field858 == 4) {
                     field618 = 128;
                     field670 = 64;
                  }

                  if(field858 == 5) {
                     field618 = 64;
                     field670 = 0;
                  }

                  if(field858 == 6) {
                     field618 = 64;
                     field670 = 128;
                  }

                  field858 = 2;
                  field612 = var3.method3574();
                  field616 = var3.method3574();
                  field617 = var3.method3742();
               }

               if(field858 == 10) {
                  field614 = var3.method3574();
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2096 == var1.field1246) {
               var23 = var3.method3573();
               var24 = var3.method3804();
               var6 = var3.method3609();
               var31 = class61.method1188(var23);
               if(var6 != var31.field2632 || var24 != var31.field2653 || var31.field2628 != 0 || var31.field2629 != 0) {
                  var31.field2632 = var6;
                  var31.field2653 = var24;
                  var31.field2628 = 0;
                  var31.field2629 = 0;
                  class181.method3548(var31);
                  this.method1211(var31);
                  if(var31.field2625 == 0) {
                     class45.method818(class230.field2615[var23 >> 16], var31, false);
                  }
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2131 == var1.field1246) {
               var59 = var3.method3577();
               class40.field357 = var59;

               try {
                  var5 = class37.field321.getParameter(class279.field3609.field3613);
                  var83 = class37.field321.getParameter(class279.field3610.field3613);
                  String var94 = var5 + "settings=" + var59 + "; version=1; path=/; domain=" + var83;
                  if(var59.length() == 0) {
                     var94 = var94 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                  } else {
                     var76 = var94 + "; Expires=";
                     var39 = class166.method3456() + 94608000000L;
                     class192.field2418.setTime(new Date(var39));
                     var12 = class192.field2418.get(7);
                     var47 = class192.field2418.get(5);
                     var14 = class192.field2418.get(2);
                     var15 = class192.field2418.get(1);
                     int var48 = class192.field2418.get(11);
                     int var49 = class192.field2418.get(12);
                     var18 = class192.field2418.get(13);
                     var27 = class192.field2414[var12 - 1] + ", " + var47 / 10 + var47 % 10 + "-" + class192.field2417[0][var14] + "-" + var15 + " " + var48 / 10 + var48 % 10 + ":" + var49 / 10 + var49 % 10 + ":" + var18 / 10 + var18 % 10 + " GMT";
                     var94 = var76 + var27 + "; Max-Age=" + 94608000L;
                  }

                  client var78 = class37.field321;
                  var27 = "document.cookie=\"" + var94 + "\"";
                  JSObject.getWindow(var78).eval(var27);
               } catch (Throwable var50) {
                  ;
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2123 == var1.field1246) {
               class58.method1117(class171.field2274);
               var1.field1246 = null;
               return true;
            }

            if(class168.field2087 == var1.field1246) {
               var23 = var3.method3618();
               var24 = var3.method3562();
               var25 = class61.method1188(var23);
               if(var25.field2666 != 2 || var24 != var25.field2757) {
                  var25.field2666 = 2;
                  var25.field2757 = var24;
                  class181.method3548(var25);
               }

               var1.field1246 = null;
               return true;
            }

            if(class168.field2094 == var1.field1246) {
               for(var23 = 0; var23 < class254.field3251; ++var23) {
                  class254 var80 = (class254)class254.field3252.method4023((long)var23);
                  class254 var60;
                  if(var80 != null) {
                     var60 = var80;
                  } else {
                     byte[] var92 = class254.field3254.method4626(16, var23);
                     var80 = new class254();
                     if(var92 != null) {
                        var80.method4821(new class182(var92));
                     }

                     class254.field3252.method4028(var80, (long)var23);
                     var60 = var80;
                  }

                  if(var60 != null) {
                     class225.field2576[var23] = 0;
                     class225.field2578[var23] = 0;
                  }
               }

               class69.method1749();
               field777 += 32;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2126 == var1.field1246) {
               if(class0.field2 != null) {
                  class0.field2.method5496(var3);
               }

               field784 = field775;
               class27.field245 = true;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2137 == var1.field1246) {
               field822 = var3.method3742();
               var1.field1246 = null;
               return true;
            }

            if(class168.field2073 == var1.field1246) {
               var23 = var3.method3573();
               var24 = var3.method3574();
               if(var23 < -70000) {
                  var24 += '\u8000';
               }

               if(var23 >= 0) {
                  var25 = class61.method1188(var23);
               } else {
                  var25 = null;
               }

               if(var25 != null) {
                  for(var7 = 0; var7 < var25.field2758.length; ++var7) {
                     var25.field2758[var7] = 0;
                     var25.field2743[var7] = 0;
                  }
               }

               class53 var90 = (class53)class53.field478.method4064((long)var24);
               if(var90 != null) {
                  for(var8 = 0; var8 < var90.field482.length; ++var8) {
                     var90.field482[var8] = -1;
                     var90.field480[var8] = 0;
                  }
               }

               var7 = var3.method3574();

               for(var8 = 0; var8 < var7; ++var8) {
                  var32 = var3.method3553();
                  if(var32 == 255) {
                     var32 = var3.method3573();
                  }

                  var10 = var3.method3784();
                  if(var25 != null && var8 < var25.field2758.length) {
                     var25.field2758[var8] = var10;
                     var25.field2743[var8] = var32;
                  }

                  class159.method3345(var24, var8, var10 - 1, var32);
               }

               if(var25 != null) {
                  class181.method3548(var25);
               }

               class69.method1749();
               field778[++field779 - 1 & 31] = var24 & 32767;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2078 == var1.field1246) {
               field851 = var3.method3742();
               field694 = var3.method3553();
               var1.field1246 = null;
               return true;
            }

            if(class168.field2139 == var1.field1246) {
               var23 = var3.method3573();
               var24 = var3.method3574();
               if(var23 < -70000) {
                  var24 += '\u8000';
               }

               if(var23 >= 0) {
                  var25 = class61.method1188(var23);
               } else {
                  var25 = null;
               }

               for(; var3.field2359 < var1.field1247; class159.method3345(var24, var7, var8 - 1, var32)) {
                  var7 = var3.method3599();
                  var8 = var3.method3574();
                  var32 = 0;
                  if(var8 != 0) {
                     var32 = var3.method3742();
                     if(var32 == 255) {
                        var32 = var3.method3573();
                     }
                  }

                  if(var25 != null && var7 >= 0 && var7 < var25.field2758.length) {
                     var25.field2758[var7] = var8;
                     var25.field2743[var7] = var32;
                  }
               }

               if(var25 != null) {
                  class181.method3548(var25);
               }

               class69.method1749();
               field778[++field779 - 1 & 31] = var24 & 32767;
               var1.field1246 = null;
               return true;
            }

            if(class168.field2148 == var1.field1246) {
               var23 = var3.method3618();
               var24 = var3.method3613();
               var6 = var3.method3562();
               if(var6 == '\uffff') {
                  var6 = -1;
               }

               var31 = class61.method1188(var24);
               class269 var26;
               if(!var31.field2622) {
                  if(var6 == -1) {
                     var31.field2666 = 0;
                     var1.field1246 = null;
                     return true;
                  }

                  var26 = class120.method2784(var6);
                  var31.field2666 = 4;
                  var31.field2757 = var6;
                  var31.field2675 = var26.field3470;
                  var31.field2707 = var26.field3456;
                  var31.field2701 = var26.field3454 * 100 / var23;
                  class181.method3548(var31);
               } else {
                  var31.field2754 = var6;
                  var31.field2677 = var23;
                  var26 = class120.method2784(var6);
                  var31.field2675 = var26.field3470;
                  var31.field2707 = var26.field3456;
                  var31.field2676 = var26.field3457;
                  var31.field2672 = var26.field3458;
                  var31.field2673 = var26.field3486;
                  var31.field2701 = var26.field3454;
                  if(var26.field3482 == 1) {
                     var31.field2645 = 1;
                  } else {
                     var31.field2645 = 2;
                  }

                  if(var31.field2678 > 0) {
                     var31.field2701 = var31.field2701 * 32 / var31.field2678;
                  } else if(var31.field2634 > 0) {
                     var31.field2701 = var31.field2701 * 32 / var31.field2634;
                  }

                  class181.method3548(var31);
               }

               var1.field1246 = null;
               return true;
            }

            class43.method786("" + (var1.field1246 != null?var1.field1246.field2155:-1) + "," + (var1.field1245 != null?var1.field1245.field2155:-1) + "," + (var1.field1253 != null?var1.field1253.field2155:-1) + "," + var1.field1247, (Throwable)null);
            class82.method1959();
         } catch (IOException var57) {
            class86.method2018();
         } catch (Exception var58) {
            var5 = "" + (var1.field1246 != null?var1.field1246.field2155:-1) + "," + (var1.field1245 != null?var1.field1245.field2155:-1) + "," + (var1.field1253 != null?var1.field1253.field2155:-1) + "," + var1.field1247 + "," + (class150.field1948.field928[0] + class178.field2315) + "," + (class150.field1948.field939[0] + class71.field1051) + ",";

            for(var6 = 0; var6 < var1.field1247 && var6 < 50; ++var6) {
               var5 = var5 + var3.field2365[var6] + ",";
            }

            class43.method786(var5, var58);
            class82.method1959();
         }

         return true;
      }
   }

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "199992128"
   )
   final void method1207() {
      boolean var1 = false;

      int var2;
      int var5;
      while(!var1) {
         var1 = true;

         for(var2 = 0; var2 < field657 - 1; ++var2) {
            if(field702[var2] < 1000 && field702[var2 + 1] > 1000) {
               String var3 = field735[var2];
               field735[var2] = field735[var2 + 1];
               field735[var2 + 1] = var3;
               String var4 = field734[var2];
               field734[var2] = field734[var2 + 1];
               field734[var2 + 1] = var4;
               var5 = field702[var2];
               field702[var2] = field702[var2 + 1];
               field702[var2 + 1] = var5;
               var5 = field730[var2];
               field730[var2] = field730[var2 + 1];
               field730[var2 + 1] = var5;
               var5 = field737[var2];
               field737[var2] = field737[var2 + 1];
               field737[var2 + 1] = var5;
               var5 = field619[var2];
               field619[var2] = field619[var2 + 1];
               field619[var2 + 1] = var5;
               boolean var6 = field728[var2];
               field728[var2] = field728[var2 + 1];
               field728[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

      if(class49.field442 == null) {
         if(field763 == null) {
            int var19 = class48.field431;
            int var7;
            int var8;
            int var9;
            int var15;
            int var20;
            if(field846) {
               int var14;
               if(var19 != 1 && (class8.field57 || var19 != 4)) {
                  var2 = class48.field425;
                  var14 = class48.field417;
                  if(var2 < class35.field303 - 10 || var2 > class139.field1897 + class35.field303 + 10 || var14 < class59.field558 - 10 || var14 > class59.field558 + class137.field1888 + 10) {
                     field846 = false;
                     class34.method626(class35.field303, class59.field558, class139.field1897, class137.field1888);
                  }
               }

               if(var19 == 1 || !class8.field57 && var19 == 4) {
                  var2 = class35.field303;
                  var14 = class59.field558;
                  var15 = class139.field1897;
                  var5 = class48.field432;
                  var20 = class48.field437;
                  var7 = -1;

                  for(var8 = 0; var8 < field657; ++var8) {
                     var9 = var14 + (field657 - 1 - var8) * 15 + 31;
                     if(var5 > var2 && var5 < var2 + var15 && var20 > var9 - 13 && var20 < var9 + 3) {
                        var7 = var8;
                     }
                  }

                  if(var7 != -1 && var7 >= 0) {
                     var8 = field730[var7];
                     var9 = field737[var7];
                     int var10 = field702[var7];
                     int var11 = field619[var7];
                     String var12 = field734[var7];
                     String var13 = field735[var7];
                     class110.method2561(var8, var9, var10, var11, var12, var13, class48.field432, class48.field437);
                  }

                  field846 = false;
                  class34.method626(class35.field303, class59.field558, class139.field1897, class137.field1888);
               }
            } else {
               var2 = field657 - 1;
               if((var19 == 1 || !class8.field57 && var19 == 4) && var2 >= 0) {
                  var15 = field702[var2];
                  if(var15 == 39 || var15 == 40 || var15 == 41 || var15 == 42 || var15 == 43 || var15 == 33 || var15 == 34 || var15 == 35 || var15 == 36 || var15 == 37 || var15 == 38 || var15 == 1005) {
                     label270: {
                        var5 = field730[var2];
                        var20 = field737[var2];
                        class230 var16 = class61.method1188(var20);
                        if(!class226.method4482(class95.method2252(var16))) {
                           var9 = class95.method2252(var16);
                           boolean var21 = (var9 >> 29 & 1) != 0;
                           if(!var21) {
                              break label270;
                           }
                        }

                        if(class49.field442 != null && !field704 && field657 > 0 && !this.method1208()) {
                           var8 = field701;
                           var9 = field640;
                           class23.method455(class184.field2376, var8, var9);
                           class184.field2376 = null;
                        }

                        field704 = false;
                        field705 = 0;
                        if(class49.field442 != null) {
                           class181.method3548(class49.field442);
                        }

                        class49.field442 = class61.method1188(var20);
                        field597 = var5;
                        field701 = class48.field432;
                        field640 = class48.field437;
                        if(var2 >= 0) {
                           class184.field2376 = new class75();
                           class184.field2376.field1082 = field730[var2];
                           class184.field2376.field1077 = field737[var2];
                           class184.field2376.field1083 = field702[var2];
                           class184.field2376.field1080 = field619[var2];
                           class184.field2376.field1081 = field734[var2];
                        }

                        class181.method3548(class49.field442);
                        return;
                     }
                  }
               }

               if((var19 == 1 || !class8.field57 && var19 == 4) && this.method1208()) {
                  var19 = 2;
               }

               if((var19 == 1 || !class8.field57 && var19 == 4) && field657 > 0 && var2 >= 0) {
                  var15 = field730[var2];
                  var5 = field737[var2];
                  var20 = field702[var2];
                  var7 = field619[var2];
                  String var17 = field734[var2];
                  String var18 = field735[var2];
                  class110.method2561(var15, var5, var20, var7, var17, var18, class48.field432, class48.field437);
               }

               if(var19 == 2 && field657 > 0) {
                  this.method1453(class48.field432, class48.field437);
               }
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
      int var1 = field657 - 1;
      boolean var3 = field727 == 1 && field657 > 2;
      if(!var3) {
         boolean var4;
         if(var1 < 0) {
            var4 = false;
         } else {
            int var5 = field702[var1];
            if(var5 >= 2000) {
               var5 -= 2000;
            }

            if(var5 == 1007) {
               var4 = true;
            } else {
               var4 = false;
            }
         }

         var3 = var4;
      }

      return var3 && !field728[var1];
   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-624694385"
   )
   final void method1453(int var1, int var2) {
      class24.method463(var1, var2);
      class56.field523.method2938(class192.field2415, var1, var2, false);
      field846 = true;
   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "-73"
   )
   final void method1210(boolean var1) {
      class28.method515(field752, class9.field70, class37.field326, var1);
   }

   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      signature = "(Lhl;I)V",
      garbageValue = "-46250492"
   )
   void method1211(class230 var1) {
      class230 var2 = var1.field2642 == -1?null:class61.method1188(var1.field2642);
      int var3;
      int var4;
      if(var2 == null) {
         var3 = class9.field70;
         var4 = class37.field326;
      } else {
         var3 = var2.field2627;
         var4 = var2.field2639;
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
      class181.method3548(field763);
      ++class133.field1860;
      if(field860 && field594) {
         int var1 = class48.field425;
         int var2 = class48.field417;
         var1 -= field685;
         var2 -= field766;
         if(var1 < field769) {
            var1 = field769;
         }

         if(var1 + field763.field2627 > field769 + field639.field2627) {
            var1 = field769 + field639.field2627 - field763.field2627;
         }

         if(var2 < field770) {
            var2 = field770;
         }

         if(var2 + field763.field2639 > field770 + field639.field2639) {
            var2 = field770 + field639.field2639 - field763.field2639;
         }

         int var3 = var1 - field772;
         int var4 = var2 - field773;
         int var5 = field763.field2687;
         if(class133.field1860 > field763.field2694 && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            field774 = true;
         }

         int var6 = var1 - field769 + field639.field2644;
         int var7 = var2 - field770 + field639.field2611;
         class56 var8;
         if(field763.field2717 != null && field774) {
            var8 = new class56();
            var8.field511 = field763;
            var8.field512 = var6;
            var8.field513 = var7;
            var8.field525 = field763.field2717;
            class67.method1728(var8);
         }

         if(class48.field424 == 0) {
            if(field774) {
               if(field763.field2714 != null) {
                  var8 = new class56();
                  var8.field511 = field763;
                  var8.field512 = var6;
                  var8.field513 = var7;
                  var8.field515 = field700;
                  var8.field525 = field763.field2714;
                  class67.method1728(var8);
               }

               if(field700 != null) {
                  class230 var9 = field763;
                  int var10 = class227.method4514(class95.method2252(var9));
                  class230 var15;
                  if(var10 == 0) {
                     var15 = null;
                  } else {
                     int var11 = 0;

                     while(true) {
                        if(var11 >= var10) {
                           var15 = var9;
                           break;
                        }

                        var9 = class61.method1188(var9.field2642);
                        if(var9 == null) {
                           var15 = null;
                           break;
                        }

                        ++var11;
                     }
                  }

                  if(var15 != null) {
                     class172 var12 = class133.method3115(class169.field2227, field739.field1250);
                     var12.field2279.method3707(field763.field2754);
                     var12.field2279.method3605(field700.field2754);
                     var12.field2279.method3641(field763.field2623);
                     var12.field2279.method3670(field700.field2623);
                     var12.field2279.method3602(field700.field2633);
                     var12.field2279.method3725(field763.field2633);
                     field739.method2019(var12);
                  }
               }
            } else if(this.method1208()) {
               this.method1453(field772 + field685, field766 + field773);
            } else if(field657 > 0) {
               int var13 = field685 + field772;
               int var14 = field766 + field773;
               class23.method455(class184.field2376, var13, var14);
               class184.field2376 = null;
            }

            field763 = null;
         }

      } else {
         if(class133.field1860 > 1) {
            field763 = null;
         }

      }
   }

   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      signature = "(I)Lkm;",
      garbageValue = "-554888244"
   )
   public class291 vmethod5443() {
      return class150.field1948 != null?class150.field1948.field587:null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(Liv;Liv;I)V",
      garbageValue = "38640891"
   )
   public static void method1576(class247 var0, class247 var1) {
      class258.field3288 = var0;
      class82.field1201 = var1;
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
      class81.field1180 = 0;

      for(int var0 = 0; var0 < 2048; ++var0) {
         class81.field1179[var0] = null;
         class81.field1177[var0] = 1;
      }

   }
}
