package com.xrk.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexp {
    //体验正则表达式的威力
    public static void main(String[] args) {
        String content = "\n" +
                "首发于\n" +
                "Java\n" +
                "\n" +
                "写文章\n" +
                "点击打开懒得去管的主页\n" +
                "简述Java发展历史\n" +
                "星光\n" +
                "星光\u200B\n" +
                "海阔凭鱼跃，天高任鸟飞\n" +
                "\u200B关注他\n" +
                "30 人赞同了该文章\n" +
                "\u200B\n" +
                "目录\n" +
                "收起\n" +
                "前言\n" +
                "Java发展史\n" +
                "JDK发展史\n" +
                "JVM家族\n" +
                "GC算法\n" +
                "垃圾收集器\n" +
                "JavaWeb发展\n" +
                "JavaEE\n" +
                "Spring\n" +
                "未来发展\n" +
                "架构发展\n" +
                "单一架构\n" +
                "集群架构\n" +
                "分布式架构\n" +
                "前言\n" +
                "世界上并没有完美的程序，因为写程序本来就是一个不断追求完美的过程。同样没有一门语言在一诞生就是完美的，不变的唯有变化。Java诞生至今已经不仅仅是一门语言，背后所涵盖的是一个庞大的技术体系。\n" +
                "\n" +
                "网上每隔一段时间就能见到几条“未来X语言将会取代Java”的新闻，此处“X”可以用Kotlin、Golang、Dart、JavaScript、Python等各种编程语言来代入。这大概就是长期占据编程语言榜单第一位的烦恼，天下第一总避免不了挑战者相伴。\n" +
                "在过去二十年Java的发展是孤独求败的，在未来，Java也在迎接着各种挑战，这种挑战来自云原生、容器化、也来自其他设计更完善的语言，相信身怀各种绝技的Java会焕发出更加夺目的光彩，重新攀登另一个高峰。\n" +
                "\n" +
                "接下来的内容主要围绕Java、JavaWeb技术栈的发展之路。\n" +
                "\n" +
                "Java发展史\n" +
                "Java是在1991年由SUN公司的James Gosling（Java之父）及其团队所研发的一种编程语言，第一个版本耗时18个月，最开始命名为Oak（一种橡树）。Java现在广泛应用于各种大型互联网应用，其设计的最初动机主要是平台独立（即体系结构中立）语言的需要，可以嵌入到各种消费类电子设备（家用电器等），但市场反应不佳。\n" +
                "\n" +
                "随着1990年代互联网的发展，SUN公司看到了Oak在互联网上的应用场景，在1995年更名为Java（印度尼西亚爪哇岛的英文名称，因盛产咖啡而闻名），随着互联网的崛起，Java逐渐称为重要的Web应用开发语言。Java的发展可以主要看JavaWeb的发展，Java也见证了互联网的发展过程。\n" +
                "\n" +
                "发展至今，Java不仅是一门编程语言，还是一个由一系列计算机软件和规范组成的技术体系，Java 是几乎所有类型的网络应用程序的基础，也是开发和提供嵌入式和移动应用程序、游戏、基于 Web 的内容和企业软件的全球标准。\n" +
                "\n" +
                "从笔记本电脑到数据中心，从游戏控制台到科学超级计算机，从手机到互联网，Java 无处不在！\n" +
                "\n" +
                "97% 的企业桌面运行 Java\n" +
                "美国有 89% 的桌面（或计算机）运行 Java\n" +
                "全球有 900 万 Java 开发人员\n" +
                "开发人员的头号选择\n" +
                "排名第一的部署平台\n" +
                "有 30 亿部移动电话运行 Java\n" +
                "100% 的蓝光盘播放器附带了 Java\n" +
                "有 50 亿张 Java 卡在使用\n" +
                "1.25 亿台 TV 设备运行 Java\n" +
                "前 5 个原始设备制造商均提供了 Java ME\n" +
                "数据来源：https://www.java.com/zh_CN/about/ \u200B\n" +
                "\n" +
                "说到Java自然离不开JDK、JVM、JRE，三者有什么关系。\n" +
                "\n" +
                "JDK（Java Development Kit）Java开发工具包，包含Java语言、Java虚拟机、Java类库，是支持Java程序开发的最小环境。\n" +
                "JVM（Java Virtual Machine）Java虚拟机，运行于各种操作系统Linux，Windows，Solaris等之上，执行编译好的Java字节码class文件。\n" +
                "JRE（Java Runtime Environment）Java运行时环境，包含JavaSE中核心类库API和Java虚拟机，简单理解为JVM+核心类库API。\n" +
                "接下来主要围绕JDK的发展，和JVM中常见的GC收集器及算法描述。\n" +
                "\n" +
                "JDK发展史\n" +
                "1991年4月，Java之父James Gosling带领绿色计划（Green Project）项目启动，定位于消费电子产品（机顶盒、冰箱、收音机）运行架构的Oak语言诞生，这也是Java的前身，但是市场反响一般。\n" +
                "1995年5月23日，随着互联网浪潮在1995年兴起，Oak迅速蜕，Java语言诞生，在SunWorld大会上发布Java1.0，第一次提出Write Once，Run Anywhere的口号。\n" +
                "1996年1月23日，JDK1.0发布，纯解释型的Java虚拟机（Sun Classic VM）、Applet、AWT等诞生。\n" +
                "1996年4月，十个最主要的操作系统和计算机供应商声明将在其产品中嵌入Java技术，\n" +
                "1996年5月底，Sun于美国旧金山举行了首届JavaOne大会，从此JavaOne成为全世界数百万Java开发者每年一度的技术盛会。\n" +
                "1996年9月，已有大约8.3万个网页应用了Java技术来制作。\n" +
                "1997年2月19日，Sun公司发布了JDK1.1，代表技术：JAR文件格式、JDBC、JavaBeans、RMI等，Java语法也进行了增强，内部类（Inner Class）和反射（Reflection）出现。\n" +
                "1998年12月4日，JDK1.2发布，这是一个里程碑式的重要版本，工程代号为Playground（竞技场），这个版本代表性技术非常多，如EJB、JavaPlug-in、Swing、JavaIDL等，还有使用极为频繁的Collections体系工具类等，并且这个版本中Java虚拟机第一次内置了JIT（Just In Time）即时编译器，后续还发布了JDK1.2.1和JDK1.2.2两个小版本升级。在JDK1.2中曾经共存过ClassicVM、HotSpotVM、ExactVM三个虚拟机，其中HotSpot是作为附加程序提供。也是在这个版本中Sun开始拆分对应的Java产品线，Sun在这个版本中把Java技术体系拆分为三个方向：\n" +
                "分别是面向桌面应用开发的J2SE（Java 2 Platform，Standard Edition）\n" +
                "面向企业级开发的J2EE（Java 2 Platform，Enterprise Edition）\n" +
                "面向手机等移动终端开发的J2ME（Java 2 Platform，Micro Edition）\n" +
                "1999年4月27日，HotSpot虚拟机诞生，HotSpot最初由Longview Techno-logies公司研发，后来在1997年被Sun公司收购，后来它成为JDK 1.3及之后所有JDK版本的默认Java虚拟机。\n" +
                "2000年5月8日，工程代号为Kestrel（美洲红隼）的JDK 1.3发布。JDK 1.3的改进主要体现在Java类库上（如数学运算和新的Timer API等），此外一直作为扩展服务的JNDI服务也开始作为一项平台级服务被提供，还有基于CORBA IIOP协议来实现通信段RMI也出现了。\n" +
                "2001年5月17日，JDK1.3的修订版JDK1.3.1发布，工程代号Ladybird（瓢虫）。从JDK1.3开始，Sun公司维持着稳定的开发节奏，大概每个两年发布一个主要版本，期间发布的各个修订版本以昆虫作为工程代号。\n" +
                "2002年2月13日，JDK 1.4发布，工程代号为Merlin（灰背隼）。JDK 1.4是标志着Java真正走向成熟的一个版本。Compaq、SAS、Fujitsu、Symbian、IBM等一众大公司参与功能规划，甚至实现自己的独立发行版本。哪怕在二十年后的今天一些主流功能也可以在JDK1.4上运行，这个版本的主要代表技术包含正则表达式、异常链、NIO、日志类、XML解析器和XSLT转换器等等。\n" +
                "2002年9月16日，工程代号为Grasshopper（蚱蜢）的JDK1.4.1修订版发布。在这一年前后微软平台的.NET Framework发布，至此Java平台和.NET平台的竞争开始拉开了序幕。但似乎Java的开源策略更胜一筹，终于在2014 年 11 月 12 日，微软正式宣布了.NET Core 的开源。\n" +
                "2003年6月26日，工程代号为Mantis（螳螂）的JDK1.4.2修订版发布。\n" +
                "2004年9月30日，JDK 5发布，工程代号为Tiger（老虎），Sun公司从这个版本开始放弃JDK 1.x的命名方式，将产品版本号修改成了JDK x，JDK1.2以来Java语言在语法上的改动都不大，该版本在语法易用性上做出了非常大的改进，如自动装箱、泛型、动态注解、枚举、可变长参数、foreach等。此外改进了Java的内存模型（Java Memory Model，JMM）、提供了java.util.concurrent并发包（由Doug Lea大师带Java进入了并发时代）等，JDK 5是官方声明可以支持Windows 9x操作系统的最后一个版本。\n" +
                "2006年11月13日，JavaOne大会上，Sun公司宣布计划要把Java开源，随后在一年多的时间内，陆续的将JDK各部分在GPL V2协议下公开源码，随后并建立了OpenJDK组织对这些源码进行独立管理，除了极少部分的产权代码，OpenJDK几乎拥有了SunJDK 7中的全部代码。\n" +
                "2006年12月11日，JDK6发布，工程代号为Mustang（野马）。在这个版本中，Sun公司终结了从JDK 1.2开始已经有八年历史的J2EE、J2SE、J2ME的产品线命名方式，启用Java EE 6、Java SE 6、Java ME 6的新命名来代替。在JDK 6中提供了众多改进，如通过Mozilla JavaScript Rhino引擎提供初步动态语言支持，提供编译器注解处理器（Annotation Processor这也是Lombok的原理，通过注解生成模板代码）和微型HTTP服务器API，以及对虚拟机内部锁、同垃圾收集、类加载机制等方面进行了大量优化改动。在JDK 6发布以后由于代码的复杂化，Java开源、开发JavaFx、世界经济危机以及Oracle对Sun的收购提案等原因，Sun公司内忧外患自顾不暇，原本稳定的开发进度也受到了很大的影响，使得JDK 6的生命周期也持续了很久，一共发布了211个更新补丁，最终版本为Java SE 6 Update 211，于2018年10月18日发布。\n" +
                "2009年2月19日，工程代号为Dolphin（海豚）的JDK 7发布，这是其第一个里程碑版本，按照规划，共有十个里程碑版本发布，最后一个里程碑版本发布与2010年9月9日，由于各种原因JDK 7没有按照原计划完成。JDK 7开发阶段Sun公司在技术竞争和商业竞争中都深陷泥潭，已经无力推动开发进展，为了尽快完成JDK 7的发布，因此裁掉了大部分原定的功能，对于原定的Lambdax项目、Jigsaw项目、动态语言支持、Gabage-First垃圾收集器、Coin项目只匆匆交付了处于Experimental状态的G1垃圾收集器（直到2012年4月的Update 4中才开始正式商用），其余项目延期到JDK 8中。Oracle从JDK 7开始进行接手，迅速展现出了其极具商业化的处世风格，面对Java中使用最广泛的Java SE免费产品线，定义了一套新的商业版产品Java SE Support ,此外JDK 7计划维护到2022年，已经面向付费用户发布了211个补丁，最新版本为JDK 7 Update 211。\n" +
                "2009年4月20日，Oracle宣布正式以74亿美元的价格收SUN公司，一代巨头由此没落，Java商标正式划归Oracle所有，Java语言本身并不属于哪间公司所有，它由JCP组织进行管理。此外Oracle还收购了BEA公司，JavaEE服务器Weblogic就是该公司的产品。\n" +
                "2011年7月28日，JDK7发布，做出的改进：提供新的G1收集器、加强对非Java语言的调用支持、可并行的类加载架构等。\n" +
                "2014年3月18日，Oracle公司发布JDK 8，从此使用JEP（JDK Enhancement Proposals）来定义和管理纳入新版JDK发布范围的功能特性，JDK 8中实现了JDK7中定义并且未完成的功能，其中也有被延期到JDK 9的Jigsaw模块化功能。\n" +
                "JEP 126 Lambda函数表达式支持\n" +
                "JEP 104 内置Nashorn JavaScript引擎\n" +
                "JEP 150 新的时间日期API\n" +
                "JEP 122 移除HotSpt永久代\n" +
                "2017年9月21日，Oracle公司发表 JDK 9，这其中较为显著的功能就是在JDK 7时期已经规划的Jigsaw模块化功能，为何屡次发布都未能如约而至，前期可能是技术埋坑，后面遭到了以IBM和RedHat联合的等JCP委员抵抗，否决模块化提案，这种做法无疑是革了模块化支持本身就比较好的IBM的命，面对如此抵抗，Oracle丝毫没有退让，宁愿摒弃JSR独立研发，也要推行Jigsaw的发展，如果成真，想必Java也会面临如Python2和Python3的巨大不同，好在最终达成一直协议，Java还是那个完整的Java。JDK 9还提供了JS Shell、JLink、JHSDB等增强。JDK 9之后，Java也以更加敏捷的交付方式如期而至，每年的3月和9月发布一个版本，美6个月发布一个版本，每三年一个LTS版本，目的是避免众多功能交付在一个捆绑JDK的风险，并且提出了孵化器模块（Incubator）和预览特性（Preview）两个概念。也是在这个版本中CMS开始被废弃。\n" +
                "2018年3月20日，Oracle公司发布JDK 10,主要对内部进行重构，统一源仓库，统一垃圾收集器接口，统一即时编译器接口（引入Graal几时编译器，这里也埋下一个伏笔），这些改进对于用户并不明显，但对后期的版本打下了良好的基础。\n" +
                "2018年3月，同样发生了比较重要的一件事，Oracle正式宣布Java EE成为历史名称，曾经拥有着无数光辉的Java EE产品线（至今仍使用较为广泛的JDBC、JMS、Servlet等组件）被Oracle扫地出门，全部打包赠送给Eclipse基金会，并且不能使用Java商标，并且更名为Jakarta EE。\n" +
                "2018年10月，自1996年以来每年一度的已经举办了22年的JavaOne大会，没有人预测到这也是最后一届，同年6月Java Mission Control的开发团队也被Oracle解散。\n" +
                "2018年9月25日，JDK 11发布，这也是一个LTS（long-term support）版本，包含17个JEP，同时被引入的还有ZGC这样革命性的垃圾收集器，好比G1的诞生，比G1又更具神秘感。同时Oracle也调整了JDK的授权许可证，把以前的商业许可证授权给OpenJDK，官方宣布同时发布两个JDK，一个是Oracle OpenJDK，一个是OracleJDK，共享大部分源码近乎一致，个人均可免费使用，OpenJDK有半年的更新支持，OracleJDK商用必须付费，且支持三年的更新。因此Java收费纯属谣言，商业用户如果想使用最新的版本支持就必须付费。\n" +
                "2019年3月20日，JDK 12发布，RedHat接手了OpenJDK 8和OpenJDk 11的管理和维护权。在JDK 12中包含了8个JEP，主要有Switch表达式和JMH测试套件，最引人注目的就是Shenandoah垃圾收集器，作为首个在JDK 7以后非Oracle开发的垃圾收集器，其目标与ZGC一致，这种竞争关系，立马得到了Oracle的抵制，在OracleJDK中剔除代码，因此Oracle JDK和OpenJDK的隔离性又如历史在JDK9中开始重演，至于后续Java的发展，以及迎接的挑战也是任重而道远，这取决于Oracle的产品线的定制和JCP的决策了。\n" +
                "2019年在9月17日，JDK 13发布，这个版本主要通过改善Java SE平台和JDK的性能，稳定性和安全性来提高开发人员的生产力。共包含了5个JEPs和一个Unicode 12.1的支持总共6大主要新特性。\n" +
                "Support for Unicode 12.1 java.lang.Character支持Unicode Character12.1库，相比12.0库新增554个字符。\n" +
                "JEP 351: ZGC Uncommit Unused Memory ZGC增强了对未使用堆内存返还操作系统的能力，ZGC对堆内存的控制能力也从4TB提升至16TB，这个版本对ZGC进行了性能的增强。\n" +
                "JEP 350: Dynamic CDS Archiving 动态归档能力，HostSpotVM对AppCDS的一个增强。\n" +
                "JEP 354: Switch Expressions (Preview)switch表达式的引入，在后面的JDK 17中又继续对其功能进行了增强。\n" +
                "JEP 355: Text Blocks (Preview)增加了Java语言对文本块的支持，但这只是作为一个预览性质的功能，通过\"\"\" \"\"\"来放置多行代码。\n" +
                "JEP 353: Reimplement the Legacy Socket API 重新实现了java.net.Socket and java.net.ServerSocket 类提供的APIs。\n" +
                "2020年3月17日，JDK 14发布，这个版本主要是对JDK历史版本的一些增强，也引入了一些新增的功能.\n" +
                "JEP 359: Records (Preview) 新增了java.lang.Record类，Record是一种轻量级的class，可以看做是数据结构体。Java作为面向对象的语言诞生以来，在大型项目中的优势就体现出来了，但是也有一点不好，过于繁琐，一个POJO JavaBean必须包含get、set等方法，Record主要就是解决这类问题的，类似于Lombok的功能。\n" +
                "JEP 365: ZGC on Windows\n" +
                "JEP 364: ZGC on macOS\n" +
                "JEP 345: NUMA-Aware Memory Allocation for G1 G1的NUMA感知内存分配。这样可以提高使用非均匀内存体系结构（NUMA）的大型计算机的性能。\n" +
                "JEP 349: JFR Event Streaming 通过启用工具以异步方式订阅Java Flight Recorder事件，这可以对JVM进行更实时的监视。\n" +
                "JEP 363: Remove the Concurrent Mark and Sweep (CMS) Garbage Collector，CMS作为一款主打老年代的并发垃圾收集器，虽然历任JDK中都没有被设置为默认的垃圾收集器，但是在解决STW问题时也是有着举足轻重的地位的，从JDK 7开始筹备到JDK 9作为默认的G1垃圾收集器，一度被认为CMS的升级版，在次CMS也开始走下历史舞台。\n" +
                "JEP 366: Deprecate the ParallelScavenge + SerialOld GC Combination 随着每一代JDk中对垃圾收集器的升级以及新的垃圾收集器的引入，ParallelScavenge + SerialOld（Oracle指出很少有人使用）组合的GC也被弃用了，并在不久的将来被移除，完成了自己的历史使命。\n" +
                "2020年9月15日，JDK 15发布，按照规划路线，JDK 14也停止更新，JDK 15虽然不是LTS版本，但也引入了一些开创性的功能和对早期版本功能的一些优化。\n" +
                "JEP 371: Hidden Classes，\n" +
                "JEP 378: Text Blocks，在JDK 13已经发布的二次预览版本，对于文本块的支持非常友好。\n" +
                "JEP 377: ZGC A Scalable Low-Latency Garbage Collector (Production)，这个支持应该算是比较重要的，相比于JDK 11作为实验性质而引入的ZGC，在这两年中ZGC现在已准备好用于生产，不再标记为实验特征，可以直接使用 -XX:+UseZGC开启ZGC，不再需要XX:+UnlockExperimentalVMOptions额外的配置。需要注意的是在OracleJDK中使用的是ZGC，而在OpenJDK中使用的是Shenandoah GC，使用命令-XX:+UseShenandoahGC开启。\n" +
                "2021年3月16日，JDK 16发布，这部分依旧是一些功能的优化升级。\n" +
                "JEP 389: Foreign Linker API (Incubator)提供静态键入的纯-java访问本机代码的API。\n" +
                "JEP 393: Foreign-Memory Access API (Third Incubator)提供了操作外部内存能力的API。\n" +
                "JEP 380: Unix domain sockets java.nio.channels, SocketChannel和ServerSocketChannel新增了对UNIX套接字的支持。\n" +
                "JEP 338: Vector API (Incubator) 提供孵化器模块的初始迭代，JDK.INCUBATOR.Vector，以表达在运行时可靠地编译的向量计算到支持的CPU架构上的最佳矢量硬件指令，从而实现对等效标量计算的卓越性能。这一点在JDK 17上持续增强。\n" +
                "JEP 376: ZGC Concurrent Stack Processing，ZGC的并发标记，不同于CMS的标记，ZGC的标记只有三个阶段，且每一个阶段的操作，无论是标记还是清理都是并发操作，大大降低了STW的时间，几乎零延时。这也算是Java在垃圾回收中比较开创性的变革。\n" +
                "JEP 387: Elastic Metaspace，JDK16对元数据区切分为更小的内存块，并将不再使用的内存快速返还给操作系统，对于频繁加载和卸载类的应用来说这一优化可以产生大量的空闲内存，提升整个JVM的性能。\n" +
                "JEP 397: Sealed Classes (Second Preview)，对JDK内部方法提供强制的封装，在JDK 17依然进行了升级优化。\n" +
                "JEP 395: Records，从JDK 14作为预览版被提供在，这里已经升级为正式版功能。\n" +
                "JEP 392: Packaging Tool，新的打包工具，在JDK 14中通过JEP343被提案，在JDK 15中被孵化，在JDK 16中被提升为正式支持使用，通过jpackage命令支持native可执行程序打包。\n" +
                "2021年9月14日，JDK17发布，这也是在JDK 11之后的下一个LTS版本，JDK 17也是Java六个月发布节奏下的最新的长期支持（LTS）发布，主打安全、性能、稳定为特性，并且官方计划支持到2029年9月。在这个版本中包含了14个JEPs更新。\n" +
                "JEP 356: Enhanced Pseudo-Random Number Generator 伪随机数增强器\n" +
                "JEP 391: macOS AArch64 Port 新平台的支持\n" +
                "JEP 410: Remove the Experimental AOT and JIT Compiler 移除了实验性质的AOT和JIT编译器\n" +
                "JEP 411: Deprecate the Security Manager for Removal 弃用安全管理器\n" +
                "JEP 406: Pattern Matching for switch (Preview) switch表达式，这可能是一个让switch翻身的功能。\n" +
                "JEP 412: Foreign Function and Memory API (Incubator) 外函数和内存相关的API，在JDK 14和JDK 15中引入的孵化API，使Java程序能够与Java运行时之外的代码和数据互操作，通过有效地调用外部函数（即，JVM之外的代码），并通过安全访问异物，这些API使Java程序能够调用本机库并进入本机数据而不提供Java本机接口（JNI）的脆性和复杂性。\n" +
                "JEP 414: Vector API (Second Incubator)允许表达在运行时可靠地编译的向量计算以支持的CPU架构上的优化矢量指令，从而实现优于等效标量计算的性能\n" +
                "\u200B更多JEP：JEPs 更多JDK版本变更信息：JDK Release Notes\n" +
                "\n" +
                "JVM家族\n" +
                "JDK 1.0，1996年引入Sun Classic VM，虚拟机鼻祖，世界上第一款商用Java虚拟机。\n" +
                "JDK 1.2，Solaris平台发布Exact VM，已经初具现代高性能虚拟机雏形，出现热点探测、即时编译等。但是生命周期短暂，这一时期并存Sun Classic VM、Exact VM、HotSpot VM，可通过命令切换。\n" +
                "JDK 1.3，HotSpot VM成为默认选择，Exact VM依然为备用选择。\n" +
                "JDK 1.4，Classic VM才完全退出商用虚拟机的历史舞台，与Exact VM一起进入了Sun Labs Research VM之中。HotSpot继承了Sun公司两款虚拟机的优点，自此之后HotSpot VM也一直成为OracleJDK和OpenJDK中默认的虚拟机。得益于Sun和Oracle两大巨头在不同时期的影响力，HotSpot也成为了使用最为广泛的虚拟机。\n" +
                "Mobile/Embedded VM，这是一款面向JavaME产品线的虚拟机。主打移动端和嵌入式设备市场。只留下了客户端编译器（C1），去掉了服务端编译器（C2）；只保留Serial/Serial Old垃圾收集器，去掉了其他收集器等，是一款小家碧玉型产品。\n" +
                "BEA JRockit，号称最快的虚拟机，天下武功唯快不破，当然也有可能每一家都这么宣传，后来BEA公司也被Oracle收购，由于其设计架构与HotSpot大相径庭，因此只有少部分监控相关的优势被吸纳进去，天下武功，九九归一。\n" +
                "IBM J9，内部名称曾定义为IT4J（IBM Technology for Java Virtual Machine）,太长的名字，因此也看出名字的重要性，至今仍然活跃，与之对应的是可以更好的兼容在IBM的小型机运行平台，模块化也是其显著的优势和特点，因此可以按需启用，消耗较小的资源，提供更大的优势。\n" +
                "BEA LiquidVM/Azul VM 相比于大名鼎鼎的HotSpot、JRockit、J9等通用型的多平台兼容的JVM，还有一种与特定平台，硬件绑定的专有化虚拟机，BEA的Liquid VM不需要依托于其他操作系统，本身就已经系统化，直接运行在自家Hypervisor系统上。Azul VM是Azul Systems公司在HotSpot基础上进行大量改进，运行于自家专有硬件Vega上的虚拟机，可以管理大量的CPU和内存，使用的是有名的PGC和C4收集器。随着业务线的调整，2010年，Azul转型软件业务，把全部精力投入到Zing（以软件的方式达到接近Vega系统的虚拟机）的研发中，而HotSpot在JDK 11和JDK 12中的ZGC和Shenandoah也才达到同等目标，JVM的发展竞争也渐激烈。\n" +
                "除了上面提到的使用广泛或者名气比较大的商用虚拟机外，也存在一些对整个Java虚拟机产生深渊影响的产品。\n" +
                "\n" +
                "Apache Harmony，Harmony中的DRLVM，这是一个兼容JDK 5和JDK 6的平台，可以运行Eclipse、Tomcat、Maven等程序，一直没有获取TCK授权，在Oracle收购Sun之后，Apache一度退出JCP组织，这也是Java社区历史上最为割裂的一件事。直到OpenJDK的诞生，Harmony的优势被极大的抵消，项目的最大参与者IBM也宣布退出，虽然Harmony从诞生起就没有大规模商用，但是Harmony的代码被吸收进IBM的JDK 7和Google Android SDK，这也对Android的发展产生了深远影响，似乎某种程度圆了Java诞生之初Sun就设定的路线，主打移动端的嵌入式设备路线。\n" +
                "Microsoft JVM，可曾想到微软当初也设计过自己的Java虚拟机，但被Sun以侵权告退，并且终止了Java虚拟机的研发，也许正因如此才诞生了.NET平台，能让你强大的永远是你的对手，微软也在一次证明了自己的强大。\n" +
                "Java虚拟机的发展也进入到一种百花齐放，百家争鸣的局面，除了大规模的服务器级别的虚拟机外，也存在一些小型的虚拟机平台。\n" +
                "\n" +
                "KVM，Android、IOS等智能手机操作系统出现前广泛使用的手机平台。\n" +
                "JCVM，Java虚拟机的一个子集，如智能卡，SIM卡，信用卡等，通常用作加密模块。\n" +
                "Squawk VM，由Sun开发曾用于Java Card的嵌入式虚拟机实现。\n" +
                "JavaInJava，Sun公司开发的一个实验性质的虚拟机，通过元循环证明一门语言可以自举，通过Java来实现Java语言的运行环境，没有编译器，通过解释模式来运行。\n" +
                "Maxine VM，一个类似于JavaInJava的产品，效率跟高，接近于HotSpot。\n" +
                "Jikes RVM，由IBM研发的一个实验性质的项目，类似于JavaInJava。\n" +
                "http://IKVM.NET，基于.NET平台实现的Java虚拟机，通过Mono实现了一定的跨平台能力。\n" +
                "Java经过了这么多年的发展，经历过公司更替，经历过组织割裂，沧海桑田，都使其走了过来，在互联网快速发展的今天，这是一个最好的时代，也是一个最坏的时代，挑战与机遇并存，Oracle公司推出的Graal VM也被官方称为Universal VM，这也是未来最有可能替代HotSpot VM的产品，也将承担起Java迎接更大的挑战。\n" +
                "\n" +
                "GC算法\n" +
                "Java语言最大的优势就是垃圾自动回收，不需要开发者去关心内存管理的事情，可以专注于业务逻辑开发。内存自动回收的核心GC算法，每一种GC都是基于不同的算法理论来实现的，因此算法对GC的性能、回收等都起着至关重要的作用。GC算法之间没有好坏之分，只有适合或不适合，每一个GC算法也不是一蹴而就的，是经过无数的迭代改进诞生的。\n" +
                "\n" +
                "引用计数算法，这个算法的原理很简单，在对象中添加一个引用计数器，每当有一个地方引用它时，计数器值就加一；当引用失效时，计数器值就减一；任何时刻计数器为零的对象就是不可能再被使用的。但是在主流的垃圾收集器中都没有使用过这种算法，当出现两个对象之间互相引用，但是这两个对象又没有实际被使用的场景，会导致引用计数都不能清零，成为无法回收的垃圾。\n" +
                "可达性分析算法，这是主流虚拟机都在使用的一种垃圾回收算法，通过一些GC Roots来向下搜索，形成一个个引用链，如果某个对象没有到达GC Roots的引用链，那么就判定这个对象可回收，也就解决了引用计数算法里面判定的问题。因此也定义了一些常见的GC Roots。\n" +
                "虚拟机栈（栈帧中的本地变量表）中引用的对象\n" +
                "本地方法栈中 JNI（即一般说的 Native 方法）引用的对象\n" +
                "方法区中类静态属性引用的对象\n" +
                "方法区中常量引用的对象\n" +
                "标记-清除算法，Mark-Sweep，算法分为标记清除两阶段，首先对需要回收的对象进行统一标记，在标记结束后，统一回收，也可以统一标记存活对象，统一回收未标记对象。这个算法是最基础的，但是也有很多问题，比如大量的标记和清除，会导致两个阶段的效率都不同程度的降低，其次是标记清除后空间的不连续性，不利于大对象的分布，并由此触发下一次GC。\n" +
                "标记-复制算法，Semispace-Copying，使用的是半区复制的思路，与清除所不一样的是，复制算法，将新生代既定内存区域按照1:1分为两部分，把存活对象迁移至其中一个半区，然后清理已使用过的空间，这种算法复制过程通过指针移动来实现，因此带来的开销是内存空间开销，会消耗大量的内存。从某种程度上标记-复制解决了标记-清理在处理大量可回收对象时遇到的效率问题，但是空间消耗是其要面对的另一个问题。因此对于这种情况，考虑到大部分场景的对象都是朝生夕灭，存活周期较短，将新生代按照比例1:8划分为Survivor:Eden区，Survivor又划分为From和To两个区域，每次分配内存只使用Eden和其中一块Survivor（From）。发生垃圾收集时，将Eden和Survivor（From）中仍然存活的对象一次性复制到另外一块Survivor(To)空间上，然后直接清理掉Eden和已用过的那块Survivor（From）空间，清空后存在一个From->To的转变，出现From和To的角色互换，总是保证在发生GC之前保证To区域是空闲的。当Survivor不足以承担一次MinorGC时就需要通过分配担保（Handle Promotion）机制来将一些对象迁移到老年代。\n" +
                "标记-整理算法，Mark-Compact，相当于是标记-清除，标记-复制算法的优势整合，标记阶段通标记-清除算法的标记阶段一致，但是在标记结束后不直接清理，而是让存活对象向内存空间另一端移动，这点类似于复制的处理。标记-整理算法是建立在是否移动回收后的存活对象这个风险点之上的，移动对象会加大延迟，STW现象更为显著，但是带来的好处是移动对象后整片的内存区域可以提高吞吐量，因此在HotSpot VM中关注吞吐量的Parallel Scavenge GC是基于标记-整理算法实现的，关注延迟的CMS是基于标记-清除算法实现的。\n" +
                "垃圾收集器\n" +
                "在《Java虚拟机规范》中并没有规定垃圾应该如何回收，只是提出了这样一种理论，因此不同的厂商也有不同的实现方式，在众多的JVM中也存在着形形色色的GC，在此主要说的也是HotSpot VM中出现过的垃圾收集器。在JDK 7之前也就是G1出现之前，垃圾收集器是分代收集的按照新生代和老年代有不同的GC来进行内存回收，在G1之后出现的GC基本都是面向全堆栈回收，因此也可以对GC做不同的分类。\n" +
                "\n" +
                "新生代GC\n" +
                "Serial GC，这是最基础也是历史最悠久的收集器，在JDK 1.3.1之前，HotSpot中新生代唯一的收集器选择，在进行收集的时候会暂停所有工作线程直到收集结束，由于其单线程模式，也导致了STW时间过长，用户应用处于长时间假死状态，非常影响用户体验。但也是所有收集器中内存资源消耗最少的，在单核或者核心较小的服务器环境，也能体现出其特有的优势。在客户端模式下是一个不错的选择。\n" +
                "ParNew GC，实质上是Serial的多线程版本，除了在收集垃圾采用多线程并行收集外，其他地方与Serial并无较多差异，是不少在服务端模式下运行的虚拟机的首选新生代收集器。除了Serial，只有ParNew可以用CMS配合使用。\n" +
                "Parallel Scavenge GC，基于标记复制算法实现的收集器，其目标在于达到一个可控制的吞吐量（处理器用于运行用户代码时间与处理器总消耗时间的比值），良好的响应速度可以提高用户体验，高吞吐量可以最高效率的利用处理器资源，尽快完成运算任务，适合运算多而交互少的分析任务。\n" +
                "老年代GC\n" +
                "Serial Old GC，相对于Serial收集器，Serial Old专用于处理老年代GC，使用标记整理算法，主要也是在客户端模式下使用，如果在服务端模式下，在JDK 1.5之前与Parallel Scavenge配合使用，或者作为CMS失败后的预案，在Concurrent Mode Failure时使用。\n" +
                "Parallel Old GC，PArallel Old是Parallel Scavenge的老年代版本，基于标记整理算法，支持多线程并发收集，在JDK 6提供，在Parallel Old出现之前，Parallel Scvenge只能和Serial Old搭配使用，比较尴尬，CMS无法与之配合，而Serial Old又不适合服务端模式，因此在此之前使用较多的也是ParNew + CMS组合。在吞吐量优先的场景中，PS + PO的组合实至名归。\n" +
                "CMS GC，JDK 5推出的一个划时代意义的收集器，首款真正做到了并发收集的垃圾收集器，实现了垃圾收集线程与用户线程同时运行。无法与Parallel Scavenge配合工作，因此CMS的出现也巩固了ParNew的地位。CMS使用了标记清除算法，一般分为四个阶段，初始标记->并发标记->重新标记->并发清除，由于初始标记和并发标记的存在，大大减小了STW的时间，但是CMS无法很好的处理浮动垃圾（并发清理阶段，用户线程产生的垃圾，无法被及时清除，保留在下一个GC阶段），为了处理浮动垃圾，CMS需要老年代预留一部分内存，通过设定的阈值来确定GC的时机。CMS也是在一次次不完美的过程中尝试完美。\n" +
                "G1 GC，G1在JDK 7中进入Experimental状态，在JDK 8中日趋成熟，在JDK 9中开始正式成为HotSpot的默认GC，替代了服务端主打的PS + PO组合收集器，此后也在Oracle官方被称为全功能垃圾收集器（Full-Featured Garbage Collector）,主要面向服务端。G1是垃圾收集器发展史上具有里程碑式的成果，开创了面向局部收集的设计，每一个Region都可以扮演新生代的Eden、Survivor或者老年代空间。\n" +
                "低延迟垃圾收集器（衡量指标：内存占用、吞吐量、延迟）\n" +
                "Shenandoah GC，第一款不是Sun或者Oracle设计的GC，甚至在OracleJDK 12中被明确拒绝的GC，因此只能存在与OpenJDK中，开源比收费的功能反而更多。相比于G1更像是G1的继承者，多线程Full GC的支持、类似于Region的设计有着优于G1的更多设计，都是为了降低延迟。\n" +
                "Z GC，JDK 11开始加入的GC，与Shenandoah目标类似，但设计思路又大有不同，Shenandoah更类似于G1的延伸，ZGC更像Azul公司PGC和C4的复刻。ZGC使用染色指针技术来作为其标志性的并发整理算法实现，支持更大的内存管理和更高效的垃圾收集。\n" +
                "Epsilon GC，JDK 11中依然出现了一个实验性质的GC，不能够进行垃圾收集的垃圾收集器，相比于G1、Shenandoah、ZGC复杂的垃圾收集算法和设计实现，Epsilon有点反其道而行之的意味，事实上一个GC的功能不仅仅是回收这个动作，还要负责堆管理布局，对象分配以及与解释器的协同工作等，如果在某些不需要回收仍然可以正常运行的Java虚拟机系统中Epsilon似乎是一种更好的选择。解决问题的方式固然重要，处理问题的思路也很重要。\n" +
                "之所以存在这么多的垃圾收集器，也就说明了没有一个完美的GC来适应所有场景，因此面对不同的场景，分代收集和全堆栈收集也给JVM调优指明了思路，了解不同GC的设计特点，才能更好的选择。\n" +
                "\n" +
                "无论是JDK、GC、GC算法哪一个时间线，都可以无限的延伸下去，不是三言两语可以解释清楚的。这里也仅仅介绍梳理了一下发展过程，在JVM不断的演变之中，一些传统的认知也在被更替，比如所谓的Java中对象是在堆内存分配，随着逃逸分析，栈上分配，标量替换等更先进的技术发展出以后，Java中对象的分配也不是一成不变的，是按照具体的情况来分配的。\n" +
                "\n" +
                "JavaWeb发展\n" +
                "Java发展最为广泛的就是在互联网领域，这其中既包含了官方对于Web方向发展的一些规范及实现，也有非常出色的产品，如体系庞大且上手友好的Spring，也有小而美的JFinal、Vert.x等，未来将是云原生，提倡Serverless无服务模式的，Java无论是JDK层面还是GC、Web框架层面也涌现了一批优秀的框架，正在跃跃欲试，如Spring Native、Spring WebFlux、RedHat Quarkus、Eclipse MicroProfile、Oracle Helidon等反应式、云原生框架，去打造一个全新的轻量级微服务时代。\n" +
                "\n" +
                "JavaEE\n" +
                "在Java的三条产品线中发展的最好的无疑是JavaSE，但是使用最为广泛的当属JavaEE（Java Platform, Enterprise Edition）。发展至今，JavaEE 提供了一个丰富的企业软件平台，拥有超过20 种符合 Java EE的实现。\n" +
                "\n" +
                "Java EE 是利用 Java Community Process 开发的，业界专家、商业组织和开源组织、Java 用户组以及数不清的个人为此做出了巨大贡献。每个版本都集成了符合业界需求的新特性，提高了应用可移植性，提高了开发人员的工作效率。\n" +
                "\n" +
                "JavaEE定义了十三种常用的核心技术规范。 \u200B\n" +
                "\n" +
                "JDBC：Java Database Connectivity，定义了Java程序如何和数据库建立连接的接口规范。\n" +
                "JNDI：Java Naming and Directory Interface，相当于一个目录服务，关联服务名称与服务对象，通过名称来直接访问与其关联的对象，譬如将数据源通过名称与数据源对象绑定。\n" +
                "EJB：Enterprise JavaBean，构建企业级应用服务的一套体系，是一个体系庞大的规范，经历了1.0，2.0，3.0的阶段。\n" +
                "RMI：Remote Method Invocation，RMI协议能够让在某个Java虚拟机上的对象，像调用本地对象一样调用另一个Java虚拟机中的对象上的方法。它使用了序列化方式在客户端和服务器端传送数据。\n" +
                "Servlet：Server Applet，Servlet是一种小型的Java程序，它扩展了Web服务器的功能。作为一种服务器端的应用，当被请求时开始执行。如常用的Tomcat就是一种实现了Servlet的Web容器。\n" +
                "JSP：Java Server Pages，其本质也是Servlet，相比于Servlet处理用户请求，JSP侧重于视图层的渲染，提高了通过Servlet输出HTML DOM的效率。\n" +
                "XML：EXtensible Markup Language，XML是一种用于标记电子文件使其具有结构性的标记语言。它被用来共享数据。XML的发展和Java是相互独立的，但是它和Java有着相同的目标，即平台独立性。通过Java和XML的组合，可以得到一个完美的具有平台独立性的解决方案。\n" +
                "JMS：Java Message Service，JMS是Java的消息服务，JMS的客户端之间可以通过JMS服务进行异步的消息传输。ActiveMQ就是完全实现了JMS规范的消息队列。\n" +
                "Java IDL：Java Interface Description Language，IDL是用来描述软件组件接口的一种计算机语言。IDL通过一种中立的方式来描述接口，使得在不同平台上运行的对象和用不同语言编写的程序可以相互通信交流。\n" +
                "JTS：Java Transaction Service，JTS是一个组件事务监视器。JTS是CORBA OTS事务监控的基本实现。JTS规定了事务管理器的实现方式。JTS事务管理器为应用服务器、资源管理器、独立的应用以及通信资源管理器提供了事务服务。。\n" +
                "JTA：Java Transaction API，Java的事务API，原则上事务一般基于数据库来实现，但是JTA为JavaEE平台提供了分布式事务服务，它隔离了事务与底层的资源，实现了透明的事务管理方式，如Seat。\n" +
                "JavaMail：JavaMail是用于存取邮件服务器的API，它提供了一套邮件服务器的抽象类。不仅支持SMTP服务器，也支持IMAP服务器和POP服务器。\n" +
                "JAF：JavaBean Activation Framework，JavaMail利用JAF来处理MIME编码的邮件附件。MIME的字节流可以被转换成Java对象，或者转换自Java对象。大多数应用都可以不需要直接使用JAF。\n" +
                "更多的JavaEE规范：https://www.oracle.com/cn/java/technologies/java-ee-glance.html\n" +
                "\n" +
                "Java™ EE 平台文档\n" +
                "Java EE 8 文档\n" +
                "Java EE 7 及早期版本\n" +
                "API 文档\n" +
                "Java EE 8\n" +
                "Java EE 7\n" +
                "Java EE 6\n" +
                "Java EE 5\n" +
                "规范\n" +
                "Java EE 8\n" +
                "Java EE 7\n" +
                "Java EE 6\n" +
                "Java EE 5\n" +
                "基于JavaEE的框架由Sun公司发起的有EJB、JPA等，这些框架在设计初期，考虑到的规范众多，难于上手，因此没有很好的市场效应，EJB经历了1.0、2.0、3.0版本的大迭代，尤其是EJB3.0和之前的产品差异巨大，而JPA也被Hibernate一统持久化框架市场，做到了ORM领域的顶流产品。\n" +
                "\n" +
                "Spring\n" +
                "Java诞生于1995年，赶上了互联网发展的浪潮，但Spring并不是伴随着Java产生的，因此在前近十年没有Spring的阶段，Java Web的开发也度过了一个黑暗漫长的阶段。Spring 由 Rod Johnson 创立，2004 年发布了 Spring 框架的第一版，其目的是用于简化企业级应用程序开发的难度和周期。 \u200B\n" +
                "\n" +
                "Spring使得Java开发变得更为简单，可以快速的构建出一个Java企业级应用，而且支撑对市面上大多数的Java框架的整合，正如其名，给Java程序员带来了春天，几乎人人都是Spring程序员。Spring特性可以概括为以下几点。\n" +
                "\n" +
                "Spring is everywhere\n" +
                "Spring is flexible\n" +
                "Spring is productive\n" +
                "Spring is fast\n" +
                "Spring is secure\n" +
                "Spring is supportive\n" +
                "\u200BSpring是主打B/S架构的Java一站式企业级开发框架。每一个技术的出现不是一蹴而就的是经过一步步的演变而来的，Spring并不能见证Java Web的整个发展过程，但是重要的统一集大成者。这里主要介绍在Spring诞生前后以及目前Java Web开发过程中主要的技术栈体系发展过程。\n" +
                "\n" +
                "远古时代（无Spring或者同类框架）\n" +
                "静态网页：代表技术包括XML、HTML、XSLT等。1994 年，网景公司发布了 Navigator 浏览器，早期的网站不能和用户交互，只能用来展示一些信息。\n" +
                "Servlet：Servlet是Service Applet的简称，可以用来处理用户请求，并且输出返回结果到页面可以实现用户和网站的交互功能。Servlet也在不同时期的JavaEE规范中不断完善。\n" +
                "JSP：全称为Java Server Pages，Sun公司借鉴微软的asp作为Java Web应用的视图层，其本质仍为Servlet，但是区别在于JSP更加专注于视图渲染。\n" +
                "Model1：通过JSP、JavaBean来实现，已经对代码进行了简单的分层，JSP可以直接编写HTML DOM和JavaScript代码，并且借助el和jstl表达式直接获取到9大内置对象的值，使得前后端之间的交互更为灵活，但是大量的前后端代码耦合使得后期维护异常困难，需要开发人员同时熟悉前后端技术，对开发人员要求较高。\n" +
                "Model2：通过JSP、JavaBean、Servlet来实现，已经具有MVC分层概念了JSP作为V，JavaBean作为M，Servlet作为C，实现了代码的解耦，更加易于扩展。这里要区分三层（业务逻辑层、数据持久化层和表现层）架构与MVC，不能混为一谈，表现层又分为模型、视图和控制器，对应MVC。\n" +
                "Struts1/XWork/WebWork：这几个之所以放到一块，是因为有很多相似的地方，这是比较早期的控制层框架了，WebWork建立在xWork之上，Struts1与Servlet API耦合较深，表现层技术单一，WebWork已经支持更多的视图层技术，如FreeMarker和XSLT，并且可以通过OGNL表达式访问栈值。\n" +
                "Struts2：Apache赞助的 一个开源项目，整合Struts1、WebWork优势，Struts2采用了WebWork的设计核心，使用拦截器来处理用户请求，从而允许用户的业务逻辑控制器与Servlet API分离，达到深层解耦的目的，Struts2控制器组件是Struts2框架的核心，所有MVC框架都是由控制器组件为核心的。Struts2的控制器由FilterDispatcher和业务控制器Action两部分组成，每一个用户拦截器通过继承实现。\n" +
                "Hibernate诞生在2001年11月，一个基于JPA规范的ORM框架，让程序员只关心对象之间的关联关系，忽略SQL语句，自动生成相关的SQL，因其上手难度高，功能体系庞大，在发展过程中逐渐被半自动ORM框架Mybatis（早期名称ibatis）占据了一部分市场，至此Java的开发已经逐步进入框架时代，等待着Spring带来的大一统时代。\n" +
                "Spring时代（进入人人都是Spring程序员时代）\n" +
                "SSH：指的是以Spring、Struts2、Hibernate为核心技术栈的web应用技术框架，也可以继续借助Spring强大的整合能力来引入第三方依赖框架。\n" +
                "SSM：指的是以Spring，SpringMVC，Mybatis为核心技术体系的Web应用技术栈。相比于SSH框架，无论是Struts2的设计，基于类的请求拦截，还是全ORM映射的Hibernate，这些元素都过于重量，不适合瞬息万变的互联网环境，需要更加建议轻量级的实现方式来替代，因此诞生了SSM，SpringMVC有着Spring的天然优越性，SpringMVC容器是Spring容器的子容器，子容器可以共享父容器的Bean，并且基于方法的SpringMVC缓存在处理大量并发请求的场景下更具有优势，Mybatis更加是和复杂查询场景，而实际业务场景中也是如此，这也降低了使用Hibernate的门槛成本。\n" +
                "Spring Boot：即便SSM已经简化了在Struts2和Hibernate中复杂的配置关系，但是传统的Web项目依然存在大量的配置项，从web.xml到applicationContext.xml，再到SpringMVC等第三方xml，依然需要大量配置，仍有一定的学习成本，SpringBoot简化配置，根据常用的开发经验，简化maven依赖（即spring-boot-starter-和-spring-boot-starter），总结了一套体系化配置参数，约定大于配置（即application.properties和application.yml），并且内置Tomcat（SpringBoot2.x中已经切换到了undertow，拥有更高的并发处理能力）真正做到了一键启动。\n" +
                "Spring Cloud NetFlix：基于Spring Boot强大的配置能力，传统项目在处理一个业务复杂的系统时候，体量巨大，不便于需求迭代和业务开发，牵一发而动全身，部署应用时也需要更大的内存、CPU等资源消耗，因此可以对一个复杂的项目进行拆分，在业务场景上做到服务分治，在技术方案中利用Spring Boot快速构建，相得益彰，Spring Cloud诞生了。Spring Cloud并不特指某个具体的技术，而是一系列现有成熟技术的整合，官方的解释就是SpringBoot构建一切，Spring Cloud协调一切。Spring Cloud NetFlix是由NetFlix公司开源的一套微服务组件库，包含常见的微服务组件。\n" +
                "Eureka 基于AP的服务发现\n" +
                "Zuul 网关组件\n" +
                "Hystrix 熔断、限流组件\n" +
                "Ribbon 负载均衡\n" +
                "Feign 远程调用\n" +
                "Zipkin 链路追踪\n" +
                "Config 配置中心\n" +
                "随着微服务的发展，这些组件也许不是最好的解决方案，但是依然是一套完善的生态体系，可以应对大部分的业务场景。\n" +
                "\n" +
                "Spring Cloud AliBaba：同样提供了一站式的分布式应用解决方案，属于现在比较热门，先进的微服务解决方案，基于微服务的思想，提供了更好用的组件库，常见组件包含。\n" +
                "Nacos 整合服务发现和配置中心，支持AP和CP场景\n" +
                "Sentinel 哨兵，更为优越的限流解决方案\n" +
                "更多基于Spring Cloud的微服务解决方案，当然也有其他的微服务解决方案，比如k8s本身就可以作为微服务解决方案，还有Zero Ice，Apache ServiceComb等。\n" +
                "未来发展\n" +
                "展望未来（以容器化、云原生、反应式为关键特征）\n" +
                "Quarkus\n" +
                "Spring Native\n" +
                "kubernetes\n" +
                "随着容器化技术Docker、Kubernetes，让云原生似乎成为了未来的发展方向，云原生（Cloud-Native）这个概念最早由Pivotal公司的Matt Stine于2013年首次提出，提到云原生首先想到的关键词可能就是容器化、微服务、Lambda，服务网格等，当然这些是必要元素，但是不代表拥有这些元素就是云原生应用，很多应用的部署只能说是基于云来完成，比如私有云、公有云，这也是未来的趋势。云原生本质上不是部署，而是以什么方式来构建应用，云原生的最终目的是为了提高开发效率，提升业务敏捷度、扩容性、可用性、资源利用率，降低成本。 \u200B\n" +
                "\n" +
                "个人认为，未来应用发展不应该像Spring Cloud时代过分关注于组件的功能，组件的本身是服务于业务场景的，而组件更应该依托于容器化部署方式来实现其功能，在这一点上来说Spring的脚步对比Quarkus确实略慢一筹，期待未来百花齐放的云原生时代。\n" +
                "\n" +
                "架构发展\n" +
                "互联网如今也在深刻的影响着人们的生活，无处不在，不仅拉近了人们之间的距离，也在影响着人们的交流方式、生活方式等等。互联网快速发展的同时网站的技术架构也经历了无数次的迭代，从简单到复杂。按照演变过程来说可以大致分为三个阶段，这也是网站由小到大的一个过程。\n" +
                "\n" +
                "单一架构\n" +
                "集群架构\n" +
                "分布式架构\n" +
                "单一架构\n" +
                "没有一个网站上线初期就会拥有庞大体量的用户，只不过在信息爆炸的今天这个过程可能会在不断缩短，比如抖音等短视频软件的快速扩展。就拿庞大的电商平台淘宝来说，也是经历了近十几年的发展，从一个功能单一的小网站，发展到今天巨无霸的体量，感兴趣的可以看一下《淘宝技术这十年》，带你认识一个巨型网站从小到大，从简单到复杂的过程。 在单一架构时代，不需要太多的服务器，也不需要过多的中间件来支持，往往依赖简单的技术栈体系就能支撑一个网站的运行，早期也诞生过不少优秀的组合，甚至今天依然也在沿用。\n" +
                "\n" +
                "LNMP/WAMP LNMP一般指Linux、Nginx、MySQL、PHP，WAMP一般指Windows、Apache、MySQL、PHP，这种网站体系机构简单，单服务器可以部署所有资源（all in one），部署方便有很多现成的镜像包，一键启动建站的作用，区别的就是前者支持Linux环境，后者运行在Windows环境，Nginx和Apache都是静态服务器，处理一些简单嵌入式脚本语言，适用于业务简单、用户体量小的网站。\n" +
                "\n" +
                "Tomcat + DB，这种架构Tomcat作为动态服务器，不仅可以处理静态资源，也可以处理动态资源，适用于更复杂一些的业务场景，这里的DB指的是不限于MySQL如Oracle、DB2、SQLServer等常见关系型数据库。一般使用这种架构就有必要对部署服务器进行拆分，如把服务器资源分为应用服务器和DB服务器。\n" +
                "\n" +
                "集群架构\n" +
                "当网站发展到一定规模，用户数量增多，相应的服务器也要进行扩增，如果业务流程相对不复杂的场景，不过多考虑业务代码的维护，只需要对服务器资源进行扩容，增加服务器数量即可，这个时候服务器的维护成本将会提高，对于一些经常访问的数据可以使用缓存服务器来降低关系型数据库的压力，对于关系西数据库可以采取读写分离达到高可用（HA）的目的，对于业务产生的文件可以增加共享文件服务器，降低应用服务器的磁盘压力。 当然这里只是简单描绘了集群架构的一种模式，实际业务场景可能更为复杂，技术涉及到细节实现往往会有更多的问题需要处理，以上所描述的集群模式仅在传统单一架构模式对服务器横向扩容，所有的业务依然冗余在一块，很有可能存在牵一发而动全身的影响，比如某一个功能点的用户访问激增从而拖垮整个服务，而扩容只能进行整体扩容，浪费较多的服务器资源，不能进行有针对性的扩容，难以实现弹性伸缩。\n" +
                "\n" +
                "\n" +
                "分布式架构\n" +
                "分布式架构更侧重于部署形式，微服务架构更侧重于应用架构，在微服务出现之前还有一种传统SOA架构，面向服务架构（SOA）是一个组件模型，它将应用程序的不同功能单元（称为服务）进行拆分，并通过这些服务之间定义良好的接口和协议联系起来，发展至今这种传统的SOA架构似乎已经过时，微服务架构成为各企业热衷的潮流。相对于单体架构而言，微服务架构体现在微，如何拆分就成了关键。一般会对业务进行水平拆分和垂直拆分。\n" +
                "\n" +
                "垂直拆分\n" +
                "对业务的不同进行分类，不同的业务划分到不同的应用和数据库中。这种拆分往往是根据系统的改造，将原来的功能模块按照更加细粒度的拆分成多个弱耦合的服务。\n" +
                "\n" +
                "水平拆分\n" +
                "数据库层面的水平拆分，就是将一个数据表中的数据按照某种规则分化到不同的数据库中，也就是分库分表。应用层面的水平拆分，最经典的就是将整个应用分层。数据库访问层和业务逻辑层拆分、网关层和业务逻辑层拆分等等。 \u200B\n" +
                "\n" +
                "更为精细的可以参考AKF原则进行服务拆分，AKF 立方体也叫做scala cube，它在《The Art of Scalability》一书中被首次提出，旨在提供一个系统化的扩展思路，AKF 把系统扩展分为三个维度。\n" +
                "\n" +
                "X 轴：直接水平复制应用进程来扩展系统。\n" +
                "Y 轴：将功能拆分出来扩展系统。\n" +
                "Z 轴：基于用户信息扩展系统。\n" +
                "这里就不再展开描述，有兴趣的可以搜索相关资料。 微服务架构体系最明显的特征就是前后端分离，服务之间通过RPC调用，分工明确职责单一。\n" +
                "\n" +
                "\n" +
                "参考资料：\n" +
                "\n" +
                "微服务理论：https://martinfowler.com/articles/microservices.html\n" +
                "《深入JVM虚拟机第三版》\n" +
                "编辑于 2022-09-08 20:19\n" +
                "Java 发展前景\n" +
                "\u200B赞同 30\u200B\n" +
                "\u200B5 条评论\n" +
                "\u200B分享\n" +
                "\u200B喜欢\n" +
                "\u200B收藏\n" +
                "\u200B申请转载\n" +
                "\u200B\n" +
                "\n" +
                "欢迎参与讨论\n" +
                "\n" +
                "5 条评论\n" +
                "默认\n" +
                "最新\n" +
                "铜盂忠诚汽修\n" +
                "铜盂忠诚汽修\n" +
                "全而精!\n" +
                "2022-11-02\n" +
                "\u200B回复\n" +
                "\u200B1\n" +
                "Mini鲲\n" +
                "Mini鲲\n" +
                "写的真好啊\n" +
                "01-13\n" +
                "\u200B回复\n" +
                "\u200B喜欢\n" +
                "星光\n" +
                "星光\n" +
                "作者\n" +
                "\n" +
                "谢谢，有需要可以关注下博客园Starsray，知乎上没什么内容呢还。\n" +
                "01-14\n" +
                "\u200B回复\n" +
                "\u200B喜欢\n" +
                "烟雨平生\n" +
                "烟雨平生\n" +
                "大佬牛皮\n" +
                "2023-08-16\n" +
                "\u200B回复\n" +
                "\u200B喜欢\n" +
                "甜蜜果子酱\n" +
                "甜蜜果子酱\n" +
                "太全了，赞\uD83D\uDC4D\n" +
                "2023-07-20\n" +
                "\u200B回复\n" +
                "\u200B喜欢\n" +
                "文章被以下专栏收录\n" +
                "Java\n" +
                "Java\n" +
                "推荐阅读\n" +
                "走Java技术这条路，归途是什么？\n" +
                "在Java程序界流行着一种默认的说法叫“黄金5年”，也就是一个程序员从入职的时候算起，前五年的选择直接影响着整个职业生涯中的职业发展方向和薪资走向。 如何走好这5年，彻底从一个刚入行…\n" +
                "\n" +
                "技术改变命运\n" +
                "Java程序员的4个职业发展方向，该如何把握黄金5年？\n" +
                "Java程序员的4个职业发展方向，该如何把握黄金5年？\n" +
                "里奥ii\n" +
                "发表于Java学...\n" +
                "带你了解Java的历史及发展\n" +
                "带你了解Java的历史及发展\n" +
                "猿生进阶\n" +
                "发表于java高...\n" +
                "摔到老三的 Java，未来在哪？\n" +
                "2021 年 Java 相关技术的发展趋势之前看过国外一家公司（Eversoft）于去年 12 月的技术分享，提出了 2021 年 Java 的 5 个发展趋势，分享给大家~ 1. Java 版本根据 JetBrains 公司的调查，…\n" +
                "\n" +
                "码农出击\n" +
                "\n" +
                "\n" +
                "选择语言\n";
        //提取文章中的所有英文单词
        //1.传统方法使用遍历方式 代码量大、效率不高
        //2.正则表达式

        //1.先创建一个pattern对象
//        Pattern compile = Pattern.compile("[a-zA-z]+");
//        Pattern compile = Pattern.compile("[0-9]+");
        Pattern compile = Pattern.compile("([a-zA-z]+)|([0-9])");

        //2.创建一个匹配器对象
        Matcher matcher = compile.matcher(content);
        //3.开始循环匹配
        while (matcher.find()){
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
