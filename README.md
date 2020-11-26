# JavaProject4
## 计G201 2020322064 李青青
## 模拟学生作业处理
## 一、实验目的
1、掌握字符串String及其方法的使用；  
2、掌握文件的读取/写入方法；  
3、掌握异常处理结构。  
## 二、实验要求  
1、设计学生类（可利用之前的）；  
2、采用交互式方式实例化某学生；  
3、设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件2中。
## 三、实验内容  
在某课上,学生要提交实验结果，该结果存储在一个文本文件2中。  
文件2包括两部分内容：  
一是学生的基本信息；  
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：  
1、每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。” ； 
2、允许提供输入参数，统计古诗中某个字或词出现的次数；  
3、输入的文本来源于文本文件1读取，把处理好的结果写入到文本文件2里；  
4、考虑操作中可能出现的异常，在程序中设计异常处理程序。  
## 四、实验过程  
首先创建一个StringInformation类，在StringInformation类里面先用scanner类实例化学生这一对象，用交互式方法接收学生数据，在控制台输入学生的信息，将输入的学生信息输出到文件2中。通过字符流获取文件一中所设置的内容，通过字符流将1中的内容以试验所要求的方式输出到文件2中，输出的格式通过循环语句与判断语句进行规定，当所有要求都实现后，将字符流关闭。将文件内容放入缓存区中，读取缓存流中的数据，找到所要查询的关键字信息，通过循环逻辑，判断该字出现的次数，最后输出这个字出现的次数，将缓冲流关闭，如果出现异常，通过catch捕捉异常，输出异常的类型。  
## 五、核心代码  
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/ruAMsa53pVQWN7FLK88i5mIi.qedjkmWi236Enp39tqQmJz7pKcjex7TkN.8gG16d20mGBr2zFAWG1Rv0*rApn2IcKMyTiWEFbWucN2kqNE!/b&bo=lANyAAAAAAADB8c!&rf=viewer_4)  
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/45NBuzDIW489QBoVep5mcfpwV9p7pOsAwS2.OyKnxUB1lazlbnhCtEmbe1aEeVWY1R1dN2WIqB*xVJWTNai8Fgna7NixGRwbN2QhcdjSYQE!/b&bo=dgEsAQAAAAADF2g!&rf=viewer_4)  
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/45NBuzDIW489QBoVep5mcfpwV9p7pOsAwS2.OyKnxUCMoXvfzekm8H43Q1GWzgJpAQtrpWaBHmoaS1aalbjn1r62PdbdBKpNaVZLh7o3tl4!/b&bo=WQPaAAAAAAADF7I!&rf=viewer_4)  
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/45NBuzDIW489QBoVep5mcfpwV9p7pOsAwS2.OyKnxUB44bXYdGacqixY3zrnVW.E7tXf9SXzsPZfai07*G6e*JBMIU4XwlNiNtwYk5niEtc!/b&bo=TAMqAQAAAAADF1Y!&rf=viewer_4)  
## 六、运行结果  
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/ruAMsa53pVQWN7FLK88i5ppAxKco6Hb5.JIBMvJBt48zOM2z4H7pZuaJXBVB1Z.VO0pG0ZxLmTgUSxhHSu08PICxUHMkMSRu8kmdED1AjFA!/b&bo=0APfAAAAAAADBy4!&rf=viewer_4)  
![alt console](http://m.qpic.cn/psc?/V53x2lrX08Z9lF4J101F42x1Bd3epC0q/ruAMsa53pVQWN7FLK88i5i*qNvLeUV*SjC3Ddusyh2hf.5WE1EqdSDtfAW5TB0CrbFP*UNoc5UduJF9k7YG9.760*tEcmdy2B.pwBPjGzko!/b&bo=1gPEAAAAAAADBzM!&rf=viewer_4)  
## 七、感想  
在这次模拟学生作业处理的实验中，我对字符串String的使用方法有了更深入的理解，并且学会如何在程序中运用String以及如何对字符进行处理且更加方便，基本掌握了文件的读取与写入，运用字符流、输入输出流完成，进一步对交互式方式实例化的这一方法有了更深刻的认识与使用。知道了InputStreamReader是字节流通向字符流的桥梁：它使用指定的charset读取字节并将其解码为字符。知道了如何向文件里追加内容，还学会了如何读取文件内容，还学会了如何进行捕捉异常，通过本次实验对异常捕捉方法有了更深刻的掌握。




