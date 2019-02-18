# TimeCount

Java 計算時間方法

語言 Java

## 寫法

在List的物件 implements Comparable<Student>

並設定sort用的比較變數

如 private int id = 0;

再加入比較 function

@Override
public int compareTo(Student o)
{
    return  o.id - this.id;
}

***
o.id - this.id 改成  this.id - o.id;  
 
則變成遞減
***

對有 implements 的物件使用下列 function 便可以自動 sort
Collections.sort(ObjectList);
