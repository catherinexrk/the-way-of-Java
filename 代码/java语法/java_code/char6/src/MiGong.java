public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        //o 表示可以走 1表示有障碍物
        //设置障碍物
        {
            for (int i = 0;i < 7;i++){
                map[0][i] = 1;
                map[7][i] = 1;
            }

            for (int i = 0; i < 8 ;i++){
                map[i][0] = 1;
                map[i][6] = 1;
            }

            map[3][1] = 1;
            map[3][2] = 1;
        }

        //使用findway找路
        MiGong2 t = new MiGong2();
        System.out.println("======找路的情况如下=====");
        System.out.println(t.findWay(map,2,3));
        for (int i = 0;i < map.length;i++){
            for (int j = 0;j < map[i].length;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class MiGong2{
    //i j 老鼠的所在位置
    //map 表示迷宫
    //递归找路 map数组的各个数值的含义 2 表示可以走，0表示可以走，1表示障碍，3表示走过但走不通
    //当map[6][5] = 2 表示找到通路，就可以结束
    //找路策略是 下 右 上 左
    public boolean findWay(int[][] map,int i ,int j){
        if (map[6][5] == 2){
            return true;
        } else {
            if (map[i][j] == 0){ //当前位置为0，表示此文位置可以走
                //假定可以走
                map[i][j] = 2;
                //使用找路策略，测试该位置是否可以真的走
                if (findWay(map,i + 1,j)) { //下
                    return true;
                } else if (findWay(map,i,j + 1)) {// 右
                    return true;
                } else if (findWay(map,i - 1,j)) { //上
                    return true;
                } else if (findWay(map,i,j - 1)) { //左
                    return true;
                } else {
                    map[i][j] = 3; //四条路都不行，那么设置为3
                    return false;
                }

            } else { //map[i][j] = 1，3 此时均为死路，不用接着测试了
                return false;
            }
        }
    }
}
