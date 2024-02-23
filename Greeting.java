class Greeting{

    // メソッドを定義する
    public static void main(String args[]){
       
        // 文字列や変数の中を参照する（変数の中身を取り出す）際は、
        // printlnメソッドを使う。
        // "Good morning"という文字列を表示する。
        System.out.println("Good morning");
        System.out.println("------------");


        // variableという変数を宣言。
        int variable; 
        // 変数variableに１を代入し、表示。
        variable = 1;
        System.out.println(variable);

        // 変数の宣言と同時に代入することもできる。
        int variabl = 2;
        System.out.println(variabl);
        System.out.println("------------");


        // 変数名に使えるのは英数字・アンスコ・ドルマークのみ。
        // 英大文字と小文字は区別される。
        // 変数名を数字から始めることはできない。
        // 変数名に予約語(return/class/for/whileなど)は使えない。
        int var = 1;
        int var01 = 2;
        int var_01 = 3;
        int var$01 = 4;
        int Var = 5;
        int VAR = 6;
        System.out.println(var);
        System.out.println(var01);
        System.out.println(var_01);
        System.out.println(var$01);
        System.out.println(Var);
        System.out.println(VAR);
        System.out.println("------------");


        // 整数のデータ型
        // byte  -100～100のとき
        // short -3万～3万のとき
        // int   -20億～20億のとき
        // long  京以上のとき（最後にLをつける）

        byte var02 = 1;
        short var03 = 12345;
        int var04 = 1234567890;
        long var05 = 123456789000L;
        System.out.println(var02);
        System.out.println(var03);
        System.out.println(var04);
        System.out.println(var05);
        System.out.println("------------");


        // 小数のデータ型
        // float  小数点以下の桁数が少ないとき（最後にFをつける）
        // double 小数点以下の桁数が多いとき（こっちの方がよく使う）
 
        double var06 = 1.23456789;
        float var07 = 1.234F;
        System.out.println(var06);
        System.out.println(var07);
        System.out.println("------------");


        // 文字のデータ型
        // char   1文字のみのとき（''でくくる）
        // String 2文字以上のとき（""でくくる）※正確にはデータ型ではなくclass。

        char var08 = 'C';
        String var09 = "Hello, World!"; 
        System.out.println(var08);
        System.out.println(var09);
        System.out.println("------------");


        // ブール型のデータ型
        // trueかfalse(0,1/真,偽/はい,いいえ)のどちらかの値になる

        int var_a = 10;
        int var_b = 1;
        boolean var_bool;
        var_bool = (var_a < var_b);
        System.out.println(var_bool);
        System.out.println("------------");


        // arrという配列変数に３つのデータを代入している。
        // 配列のインデックス番号は、添え字ともいう。

        // 配列変数の宣言とデータの代入を別々に行っている。
        // String[] arr;
        // arr = new String[3];

        // arr[0]="Sato";
        // arr[1]="Suzuki";
        // arr[2]="Tanaka";
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println("------------");

        // 配列変数の宣言とデータの代入を同時に行っている。
        String[] arr = {"Sato", "Suzuki", "Tanaka"};

        // 配列のデータを変更できる。（SatoをYamadaに変更）
        arr[0] = "Yamada";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("------------");


        // 演算子
        int x = 10;
        int y = 2;
        int z = 10;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        System.out.println("------------");

        // 関係演算子
        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x<=y);
        System.out.println(x<=z);
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println("------------");

        // 論理演算子
        System.out.println(x>=5 && x<=10);
        System.out.println(y>=5 && y<=10);
        System.out.println(x==2 || y==2);
        System.out.println(x==1 || y==1);
        System.out.println("------------");

        // =のことを代入演算子という。
        // +=のことを複合代入演算子という。
        System.out.println(x+=10);
        System.out.println(z+=y);
        System.out.println("------------");

        // インクリメント（値を1増やす演算子）
        // X++とx=x+1はどちらも同じく、xを1増やす。
        // デクリメント（値を1減らす演算子）
        // X--とx=x-1はどちらも同じく、xを1減らす。
        x++;
        y--;
        System.out.println(x);
        System.out.println(y);
        System.out.println("------------");

        
        // 条件分岐
        int age = 0;
        if (age >= 20){
            System.out.println("adult");
        } else if (age == 0) {
            System.out.println("baby");
        } else {
            System.out.println("child");
        }
        System.out.println("------------");






    } 


}

